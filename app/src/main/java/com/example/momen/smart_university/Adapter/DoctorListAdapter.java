package com.example.momen.smart_university.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.momen.smart_university.R;
import com.example.momen.smart_university.firebase.Doctor.Doctor;
import com.example.momen.smart_university.firebase.Student.Students;

import java.util.List;

/**
 * Created by AmrGamal on 09/06/2019.
 */

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.recyclerVH>
{
    public interface StudentClickListener {
        void onListItemClick(int position);
    }
    private final StudentListAdapter.StudentClickListener studentClickListener;

    List<Doctor> student_name;
    Context context;
    public DoctorListAdapter(List<Doctor> name, Context context,StudentListAdapter.StudentClickListener studentClickListener) {
        this.student_name = name;
        this.context = context;
        this.studentClickListener = studentClickListener;
    }
    @NonNull
    @Override
    public DoctorListAdapter.recyclerVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_list_item, viewGroup, false);
        return new DoctorListAdapter.recyclerVH(view);        }

    @Override
    public void onBindViewHolder(@NonNull DoctorListAdapter.recyclerVH holder,final int position) {
        TextView studentName=holder.itemView.findViewById(R.id.student_name) ;
        studentName.setText( student_name.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return student_name.size();
    }

    class recyclerVH extends RecyclerView.ViewHolder implements View.OnClickListener {
        public recyclerVH(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            studentClickListener.onListItemClick(getAdapterPosition());
        }
    }
}