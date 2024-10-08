package X;

import com.instagram.user.model.User;

public abstract class VFS {
    public static final int A00(User user) {
        int A1n = user.A1n();
        String fullName = user.getFullName();
        if (fullName == null || fullName.length() == 0) {
            A1n++;
        }
        String A0O = user.A0O();
        if (A0O == null || A0O.length() == 0) {
            return A1n + 1;
        }
        return A1n;
    }
}
