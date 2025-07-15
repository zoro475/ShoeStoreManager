package dan.impl1;

import dan.dao.UserDAO;
import dan.entity.User1;
import dan.util.XJdbc;
import dan.util.XQuery;
import java.util.List;


public class UserDAOImpl implements UserDAO {

    // Câu lệnh SQL cho các thao tác CRUD
    String createSql = "INSERT INTO NguoiDung(TenDangNhap, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
    String updateSql = "UPDATE NguoiDung SET MatKhau=?, HoTen=?, VaiTro=? WHERE TenDangNhap=?";
    String deleteSql = "DELETE FROM NguoiDung WHERE TenDangNhap=?";
    String findAllSql = "SELECT * FROM NguoiDung";
    String findByUsernameSql = "SELECT * FROM NguoiDung WHERE TenDangNhap=?";

    // Tạo mới người dùng
    @Override
    public User1 create(User1 entity) {
        Object[] values = {
            entity.getTenDangNhap(),   // TenDangNhap
            entity.getMatKhau(),   // MatKhau
            entity.getHoTen(),   // HoTen
            entity.isVaiTro()// VaiTro: "KhachHang" hoặc "QuanLy"
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    // Cập nhật thông tin người dùng
    @Override
    public void update(User1 entity) {
        Object[] values = {
            entity.getMatKhau(),   // MatKhau
            entity.getHoTen(),   // HoTen
            entity.isVaiTro(),       // VaiTro
            entity.getTenDangNhap()// TenDangNhap (WHERE)
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    // Xoá người dùng theo tên đăng nhập
    @Override
    public void deleteById(String username) {
        XJdbc.executeUpdate(deleteSql, username);
    }

    // Lấy danh sách tất cả người dùng
    @Override
    public List<User1> findAll() {
        return XQuery.getBeanList(User1.class, findAllSql);
    }

    // Tìm người dùng theo tên đăng nhập
    @Override
    public User1 findById(String username) {
        return XQuery.getSingleBean(User1.class, findByUsernameSql, username);
    }
}