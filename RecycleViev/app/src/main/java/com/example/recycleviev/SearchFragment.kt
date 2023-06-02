package com.example.recycleviev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recomendation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewRec)
        val layoutManager = GridLayoutManager(requireContext(), 3)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = VerticalListAdapterRec(getDataList())
    }

    private fun getDataList(): List<PhotoItem> {
        val dataList = mutableListOf<PhotoItem>()
        dataList.add(PhotoItem(R.drawable.rec1))
        dataList.add(PhotoItem(R.drawable.rec2))
        dataList.add(PhotoItem(R.drawable.rec3))
        dataList.add(PhotoItem(R.drawable.rec4))
        dataList.add(PhotoItem(R.drawable.rec5))
        dataList.add(PhotoItem(R.drawable.rec6))
        dataList.add(PhotoItem(R.drawable.rec7))
        dataList.add(PhotoItem(R.drawable.rec8))
        dataList.add(PhotoItem(R.drawable.rec9))
        dataList.add(PhotoItem(R.drawable.rec10))
        dataList.add(PhotoItem(R.drawable.rec11))
        dataList.add(PhotoItem(R.drawable.rec12))
        dataList.add(PhotoItem(R.drawable.rec13))
        dataList.add(PhotoItem(R.drawable.rec14))
        dataList.add(PhotoItem(R.drawable.rec15))
        dataList.add(PhotoItem(R.drawable.rec1))
        dataList.add(PhotoItem(R.drawable.rec2))
        dataList.add(PhotoItem(R.drawable.rec3))
        dataList.add(PhotoItem(R.drawable.rec4))
        dataList.add(PhotoItem(R.drawable.rec5))
        dataList.add(PhotoItem(R.drawable.rec6))
        dataList.add(PhotoItem(R.drawable.rec7))
        dataList.add(PhotoItem(R.drawable.rec8))
        dataList.add(PhotoItem(R.drawable.rec9))
        dataList.add(PhotoItem(R.drawable.rec10))
        dataList.add(PhotoItem(R.drawable.rec11))
        dataList.add(PhotoItem(R.drawable.rec12))
        dataList.add(PhotoItem(R.drawable.rec13))
        dataList.add(PhotoItem(R.drawable.rec14))
        dataList.add(PhotoItem(R.drawable.rec15))



        return dataList
    }
}
