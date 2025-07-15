/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dan.util;

import dan.entity.User1;

/**
 * Lưu trữ thông tin người dùng đã đăng nhập
 * @author Admin
 */
public class XAuth {

    public static User1 user = User1.builder()
            .TenDangNhap("user@gmail.com")
            .MatKhau("123456")
            .VaiTro(true)                 // ✅ sửa lại từ boolean -> String
            .HoTen("Nguyễn Văn Tèo")
            .photo("trum-small")
            .build(); // Thông tin này sẽ được thay thế sau khi người dùng đăng nhập
}
