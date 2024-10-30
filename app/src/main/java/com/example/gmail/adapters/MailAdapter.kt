package com.example.gmail.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.R
import com.example.gmail.models.MailModel

class MailAdapter(
    val mails: List<MailModel>
) : RecyclerView.Adapter<MailAdapter.MailViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailViewHolder {
        val mailView = LayoutInflater.from(parent.context).inflate(R.layout.mail_list, parent, false)
        return MailViewHolder(mailView)
    }

    override fun onBindViewHolder(holder: MailAdapter.MailViewHolder, position: Int) {
        val mail = mails[position]
        holder.imageView.setImageResource(mail.imageView)
        holder.mailName.text = mail.mailName
        holder.mailNames.text = mail.mailNames
        holder.mailContent.text = mail.mailContent
    }

    override fun getItemCount(): Int {
        return mails.size
    }

    class MailViewHolder(mailView: View): RecyclerView.ViewHolder(mailView){
        val imageView: ImageView
        val mailNames: TextView
        val mailName : TextView
        val mailContent: TextView
        init {
            imageView = mailView.findViewById(R.id.imageView)
            mailName = mailView.findViewById(R.id.mailName)
            mailNames = mailView.findViewById(R.id.mailNames)
            mailContent = mailView.findViewById(R.id.mailContent)
        }


    }
}