package ammyaman.roomsample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CH-E01449 on 06-12-2017.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {

    private List<Contact> mContacts;

    public ContactsAdapter(@NonNull List<Contact> contacts) {
        mContacts = contacts;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        holder.contactName.setText(mContacts.get(position).getName());
        holder.contactNumber.setText(mContacts.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public void setContacts(List<Contact> contacts) {
        mContacts = contacts;
        notifyDataSetChanged();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {
        private TextView contactName;
        private TextView contactNumber;

        private ContactViewHolder(View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.tv_name);
            contactNumber = itemView.findViewById(R.id.tv_number);
        }
    }

}
