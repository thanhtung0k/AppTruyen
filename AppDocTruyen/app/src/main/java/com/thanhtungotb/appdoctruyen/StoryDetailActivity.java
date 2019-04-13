package com.thanhtungotb.appdoctruyen;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StoryDetailActivity extends AppCompatActivity {

    private List<Story> stories;
    private TextView txtTenTruyen1;
    private TextView txtTacGia1;
    private TextView txtNgapCapNhap1;
    private TextView txtTheLoai;
    private TextView txtTrangThai;
    private TextView txtSoChuong;
    private TextView txtNgayUp;
    private TextView txtNoiDung;
    private ImageView imgAnh1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);
        init();
        nhan();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void init() {

        txtTenTruyen1 = findViewById(R.id.txtTenTruyen1);
        txtTacGia1 = findViewById(R.id.txtTacGia1);
        txtNgapCapNhap1 = findViewById(R.id.txtNgayCapNhap1);
        txtTheLoai = findViewById(R.id.txtTheLoai);
        txtTrangThai = findViewById(R.id.txtTrangThai);
        txtSoChuong = findViewById(R.id.txtSoChuong);
        txtNgayUp = findViewById(R.id.txtNgayUp);
        txtNoiDung = findViewById(R.id.txtNoiDung);
        imgAnh1 = findViewById(R.id.imgAnh1);

    }

    private void nhan() {
        Intent integer = getIntent();
        Story story1 = (Story) integer.getSerializableExtra("key");
        txtTenTruyen1.setText(story1.getTentruyen());
        txtTacGia1.setText(story1.getTentacgia());
        txtNgapCapNhap1.setText(story1.getNgaycapnhap());
        txtTheLoai.setText(story1.getTheloai());
        txtTrangThai.setText(story1.getTrangthai());
        txtSoChuong.setText(story1.getSochuong());
        txtNgayUp.setText(story1.getNgayup());
        txtNoiDung.setText(story1.getNoidung());
        imgAnh1.setImageResource(story1.getPhoto());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
