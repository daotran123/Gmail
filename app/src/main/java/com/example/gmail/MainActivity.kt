package com.example.gmail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.adapters.MailAdapter
import com.example.gmail.models.MailModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mails = mutableListOf<MailModel>()
        mails.add(MailModel(R.drawable.red_circle, "T", "Trần Văn Đạo", "MSSV: 20215559"))
        mails.add(MailModel(R.drawable.red_circle, "P", "Phòng Đào Tạo", "Email: daotao@university.edu.vn - Liên hệ các vấn đề đăng ký môn học"))
        mails.add(MailModel(R.drawable.green_circle, "Y", "Y Tế", "Email: yte@university.edu.vn - Cập nhật thông tin bảo hiểm y tế cho sinh viên"))
        mails.add(MailModel(R.drawable.blue_circle, "T", "Thư viện", "Email: thuvien@university.edu.vn - Mở tài khoản và gia hạn mượn sách"))
        mails.add(MailModel(R.drawable.yellow_circle, "H", "Hành chính", "Email: hanhchinh@university.edu.vn - Xác nhận và thủ tục hành chính sinh viên"))
        mails.add(MailModel(R.drawable.red_circle, "K", "Ký túc xá", "Email: kytucxa@university.edu.vn - Hỗ trợ đăng ký, gia hạn, và thanh toán phí KTX"))
        mails.add(MailModel(R.drawable.yellow_circle, "C", "Công tác sinh viên", "Email: ctsv@university.edu.vn - Liên hệ về hoạt động phong trào và hỗ trợ sinh viên"))
        mails.add(MailModel(R.drawable.green_circle, "H", "Học vụ", "Email: hocvu@university.edu.vn - Thông tin các vấn đề về quy chế và quy định học tập"))
        mails.add(MailModel(R.drawable.green_circle, "T", "Tài chính", "Email: taichinh@university.edu.vn - Liên hệ về học phí và thanh toán"))
        mails.add(MailModel(R.drawable.yellow_circle, "K", "Khoa CNTT", "Email: cntt@university.edu.vn - Thông tin về môn học, giảng viên trong khoa CNTT"))
        mails.add(MailModel(R.drawable.blue_circle, "B", "Ban Giám Hiệu", "Email: bgh@university.edu.vn - Tiếp nhận ý kiến và khiếu nại"))

        val adapter = MailAdapter(mails)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler1)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}