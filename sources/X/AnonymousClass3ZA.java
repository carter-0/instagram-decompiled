package X;

import com.instagram.user.model.User;

/* renamed from: X.3ZA  reason: invalid class name */
public abstract class AnonymousClass3ZA {
    public static final String A00(User user) {
        if (user != null) {
            String id = user.getId();
            if (id.length() != 0) {
                return id;
            }
        }
        return null;
    }
}
