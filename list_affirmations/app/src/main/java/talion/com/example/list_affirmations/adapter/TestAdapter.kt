package talion.com.example.list_affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import talion.com.example.list_affirmations.R
import talion.com.example.list_affirmations.model.Affirmations

class TestAdapter (private val context: Context, private val listItem: List<Affirmations>)
    : RecyclerView.Adapter<TestAdapter.ItemViewHolder>()
{

    class ItemViewHolder(private val view: View) : ViewHolder(view)
    {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = listItem.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listItem[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
    }
}