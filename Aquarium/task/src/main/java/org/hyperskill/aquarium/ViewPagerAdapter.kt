package org.hyperskill.aquarium

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso

class ViewPagerAdapter(private val items: List<PageItem>) : RecyclerView.Adapter<ViewPagerHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder =
        ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false)
        )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {

        holder.itemView.run {
            val item = items[position]
            holder.nameAnimal.text = item.name
            holder.descriptionAnimal.text = item.description
            // use Picasso to load the image
            Picasso.get()
                .load(item.imageURL)
                .networkPolicy(NetworkPolicy.NO_CACHE, NetworkPolicy.NO_STORE)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .fit().centerInside()
                .into(holder.imageAnimal)
        }
    }
}