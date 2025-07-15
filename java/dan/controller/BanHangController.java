package dan.controller;

import dan.util.XDialog;
import dan.view.*;
import javax.swing.JDialog;
import javax.swing.JFrame;

public interface BanHangController {
    void init();

    default void exit() {
        if (XDialog.confirm("Bạn có muốn đăng xuất?")) {
            System.exit(0);
        }
    }

    default void showJDialog(JDialog dialog) {
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    default void showWelcomeJDialog(JFrame frame) {
        showJDialog(new Welcome(frame, true));
    }

    default void showLoginJDialog(JFrame frame) {
        showJDialog(new Login(frame, true));
    }

    default void showChangePasswordJDialog(JFrame frame) {
        showJDialog(new ChangePasswordJDialog(frame, true));
    }

//    default void showSalesJDialog(JFrame frame) {
//        showJDialog(new SalesJDialog(frame, true));
//    }
//
//    default void showHistoryJDialog(JFrame frame) {
//        showJDialog(new HistoryJDialog(frame, true));
//    }
//
//    default void showDrinkManagerJDialog(JFrame frame) {
//        showJDialog(new DrinkManagerJDialog(frame, true));
//    }
//
//    default void showCategoryManagerJDialog(JFrame frame) {
//        showJDialog(new CategoryManagerJDialog(frame, true));
//    }
//
//    default void showCardManagerJDialog(JFrame frame) {
//        showJDialog(new CardManagerJDialog(frame, true));
//    }
//
//    default void showBillManagerJDialog(JFrame frame) {
//        showJDialog(new BillManagerJDialog(frame, true));
//    }
//
//    default void showUserManagerJDialog(JFrame frame) {
//        showJDialog(new UserManagerJDialog(frame, true));
//    }
//
//    default void showRevenueManagerJDialog(JFrame frame) {
//        showJDialog(new RevenueManagerJDialog(frame, true));
//    }
}