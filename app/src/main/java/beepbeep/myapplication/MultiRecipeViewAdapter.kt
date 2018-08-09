package beepbeep.myapplication

import android.view.View
import android.view.ViewGroup

interface MultiRecipeViewAdapter {
    enum class ArrowDirection {
        UP, DOWN, NONE
    }

    fun onCreateViewHolderForTitle(parent: ViewGroup): ViewHolder
    fun onCreateViewHolderForContent(parent: ViewGroup): ViewHolder
    fun onBindViewForTitle(viewHolder: ViewHolder, position: Int, arrowDirection: ArrowDirection)
    fun onBindViewForContent(viewHolder: ViewHolder, position: Int)
    fun getItemCount(): Int
}

open class ViewHolder(val itemView: View)