package org.hyperskill.aquarium

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerHolder (view: View) : RecyclerView.ViewHolder(view) {
    val imageAnimal: ImageView = view.findViewById(R.id.image_view)
    val nameAnimal: TextView = view.findViewById(R.id.tv_name)
    val descriptionAnimal: TextView = view.findViewById(R.id.tv_description)
}