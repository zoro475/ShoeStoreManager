package dan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User1 {                     // MaNguoiDung
    private String TenDangNhap;            // TenDangNhap
    private String MatKhau;            // MatKhau            // Trạng thái tài khoản (nếu sử dụng)
    private String HoTen;            // HoTen
    @Builder.Default
    private String photo = "photo.png"; // Ảnh đại diện
    private boolean VaiTro;                // VaiTro ('KhachHang' hoặc 'QuanLy')
}
