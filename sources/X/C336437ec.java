package X;

import com.instagram.user.model.User;

/* renamed from: X.7ec  reason: invalid class name and case insensitive filesystem */
public abstract class C336437ec {
    public static final boolean A00(User user, String str) {
        0qQ.A0B(user, 0);
        String username = user.getUsername();
        if ((!00l.A0W(username)) && 0mp.A0I(username, str, 0)) {
            return true;
        }
        String fullName = user.getFullName();
        return fullName != null && !00l.A0W(fullName) && 0mp.A0H(fullName, str);
    }
}
