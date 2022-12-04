package com.example.api_diseaselist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DiseaseAdapter extends RecyclerView.Adapter<DiseaseAdapter.ViewHolder>{

    ArrayList<Disease> diseaseList = new ArrayList<Disease>();

    public DiseaseAdapter(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.disease_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Disease disease = diseaseList.get(position);

        //화면에 데이터 담기
        holder.setItem(disease);

        //아이템 클릭 이벤트
        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int mPostion = holder.getAdapterPosition();

                Context context = view.getContext();

                Intent detailActivity = new Intent(context, DetailActivity.class);

                detailActivity.putExtra("title"    ,diseaseList.get(mPostion).getTitle()); //제목
                detailActivity.putExtra("message"  ,diseaseList.get(mPostion).getMessage()); //내용


                ((MainActivity)context).startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return diseaseList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView title_text, num_text;
        CardView card_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title_text = itemView.findViewById(R.id.title_text);
            num_text = itemView.findViewById(R.id.num_text);
            card_view = itemView.findViewById(R.id.layout_container);
        }

        public void setItem(Disease disease){

            title_text.setText(disease.getTitle());
            num_text.setText(disease.getMessage());
        }
    }
}
