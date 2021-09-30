package au.edu.swin.sdmd.w07_booklist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdaptor(private val data: List<Book>) : RecyclerView.Adapter<BookAdaptor.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookAdaptor.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.layout_row, parent, false) as View
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookAdaptor.ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    inner class ViewHolder(private val v: View): RecyclerView.ViewHolder(v){
        private val title: TextView = v.findViewById(R.id.txtTitle)
        private val rating: TextView = v.findViewById(R.id.txtRating)
        private val icon: ImageView = v.findViewById(R.id.imgBook)

        //Setup the view in each row
        fun bind(item: Book){
            title.text = item.title
            rating.text = item.rating.toString()
            //icon.setImageResource(item.icon)
        }
    }
}