package uit.projectfinal.a18520494_lap3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;

import java.util.ArrayList;

/**
 * Created by User on 3/14/2017.
 */

public class UsersAdapter extends ArrayAdapter<User> {

    private static final String TAG = "PersonListAdapter";

    private Context mContext;
    private int mResource;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView name;
        TextView hometown;

    }

    /**
     * Default constructor for the PersonListAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public UsersAdapter(Context context, int resource, ArrayList<User> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the persons information
        String name = getItem(position).getName();
        String hometown = getItem(position).getHometown();



        User user = new User(name, hometown);


        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvHome = convertView.findViewById(R.id.tvHome);


        tvName.setText(name);
        tvHome.setText(hometown);



        return convertView;
    }
}
