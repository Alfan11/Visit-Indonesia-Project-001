package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutFragment extends Fragment {
    RecyclerView recyclerView2;

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView2 = (RecyclerView) getView().findViewById(R.id.recycler_view2);
        //menampilkan reyclerview yang ada pada file layout dengan id reycler view
        RecyclerAdapterAb adapter = new RecyclerAdapterAb(getActivity());
        //membuat adapter baru untuk reyclerview
        recyclerView2.setAdapter(adapter);
        //menset nilai dari adapter
        recyclerView2.setHasFixedSize(true);
        //menset setukuran

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(layoutManager);
        //menset layoutmanager dan menampilkan daftar/list
        //dalam bentuk linearlayoutmanager pada class saat ini
    }

}