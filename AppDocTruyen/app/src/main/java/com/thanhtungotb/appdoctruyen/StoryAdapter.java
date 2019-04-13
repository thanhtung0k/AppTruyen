package com.thanhtungotb.appdoctruyen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private Context context;
    private List<Story> stories;
    private LayoutInflater inflater;
    private onItemClickListener onItemClickListener;

    public StoryAdapter(Context context, List<Story> stories) {
        inflater = LayoutInflater.from(context);
        this.stories = stories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = inflater.inflate(R.layout.item_story, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int position) {
        final Story story = stories.get(position);

        viewHolder.txtTenTruyen.setText(story.getTentruyen());
        viewHolder.txtTacGia.setText(story.getTentacgia());
        viewHolder.txtNgayCapNhap.setText(story.getNgaycapnhap());
        viewHolder.imgAnh.setImageResource(stories.get(position).getPhoto());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClicked(viewHolder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public void setOnItemClickListener(onItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTenTruyen;
        private TextView txtTacGia;
        private TextView txtNgayCapNhap;
        private ImageView imgAnh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAnh = itemView.findViewById(R.id.imgAnh);
            txtTenTruyen = itemView.findViewById(R.id.txtTenTruyen);
            txtTacGia = itemView.findViewById(R.id.txtTacGia);
            txtNgayCapNhap = itemView.findViewById(R.id.txtNgayCapNhap);
        }
    }

    public interface onItemClickListener {
        void onItemClicked(int position);

    }
}
