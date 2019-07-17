package minsk.androidacademy.motionlayoutplayground

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import minsk.androidacademy.motionlayoutplayground.DemoAdapter.DemoItemHolder

class DemoAdapter : RecyclerView.Adapter<DemoItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val row = inflater.inflate(R.layout.li_demo, parent, false)

        return DemoItemHolder(row)
    }

    override fun onBindViewHolder(holder: DemoItemHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 60
    }

    inner class DemoItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}