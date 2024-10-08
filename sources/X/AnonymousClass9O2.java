package X;

import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.user.model.User;

/* renamed from: X.9O2  reason: invalid class name */
public abstract class AnonymousClass9O2 {
    public static final boolean A00(User user) {
        BirthdayVisibilityForViewer Afu;
        int ordinal;
        if (user == null || (Afu = user.A03.Afu()) == null || ((ordinal = Afu.ordinal()) != 3 && ordinal != 2)) {
            return false;
        }
        return true;
    }
}
