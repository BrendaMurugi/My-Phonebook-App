package dev.murugi.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.murugi.mycontacts.databinding.ContactListItemBinding

class ContactsRvAdapter(var contactList: List<Contacts>):
RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var ContactsViewHolder = ContactsViewHolder(binding)
        return ContactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvPhoneNumber.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .resize(300, 300)
            .centerCrop()
            .into(holder.binding.ivContact)

        val context = holder.itemView.context
        holder.binding.ivContact.setOnClickListener {
            Toast.makeText(context, "You have clicked on ${currentContact.name}'s image.", Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener {
            val intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("PROFILE", currentContact.image)
            intent.putExtra("NAME", currentContact.name)
            intent.putExtra("EMAIL", currentContact.email)
            intent.putExtra("PHONE", currentContact.phoneNumber)
            intent.putExtra("LOCATION", currentContact.address)
            intent.putExtra("IMAGE", currentContact.image)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){
}