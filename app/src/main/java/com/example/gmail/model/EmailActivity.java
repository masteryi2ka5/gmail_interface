package com.example.gmail.model;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gmail.adapter.EmailAdapter;
import com.example.listactivity.*;

import java.util.ArrayList;
import java.util.List;

public class EmailActivity extends AppCompatActivity {

    List<EmailItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        items = new ArrayList<>();
        items.add(new EmailItem("Facebook", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "01:02 AM"));
        items.add(new EmailItem("Google", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "02:03 PM"));
        items.add(new EmailItem("Instagram", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "03:04 AM"));
        items.add(new EmailItem("Tiktok", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "04:05 PM"));
        items.add(new EmailItem("Youtube", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "05:06 AM"));
        items.add(new EmailItem("Microsoft", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "06:07 PM"));
        items.add(new EmailItem("Outlook", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "07:08 AM"));
        items.add(new EmailItem("Yammer", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "08:09 PM"));
        items.add(new EmailItem("Gmail", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "09:10 AM"));
        items.add(new EmailItem("Drive", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "10:11 PM"));
        items.add(new EmailItem("Tinder", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "11:12 AM"));
        items.add(new EmailItem("Shopee", "Tin nhắn mới", "Bạn đã nhận được tin nhắn mới từ Lê Nhật Nam, nhấn vào để xem nội dung!", "12:13 PM"));

        EmailAdapter adapter = new EmailAdapter(items, this);

        ListView emailListView = findViewById(R.id.email_list_view);
        emailListView.setAdapter(adapter);
    }
}