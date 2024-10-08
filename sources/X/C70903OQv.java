package X;

import com.instagram.user.model.User;

/* renamed from: X.OQv  reason: case insensitive filesystem */
public abstract class C70903OQv {
    public static final C61034JvY A00(User user) {
        0qQ.A0B(user, 0);
        String id = user.getId();
        Long BST = user.BST();
        int BIW = user.BIW();
        return new C61034JvY(user.Bh3(), BST, id, user.getUsername(), user.B8Q(), BIW);
    }

    public static final boolean A01(C61034JvY jvY, User user) {
        0qQ.A0B(jvY, 1);
        String str = jvY.A05;
        if (DbV.A1Z(user, str) || 0qQ.A0K(str, String.valueOf(user.BST()))) {
            return true;
        }
        return false;
    }
}
