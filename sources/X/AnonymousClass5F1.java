package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5F1  reason: invalid class name */
public final class AnonymousClass5F1 {
    public final 0xa A00;

    public final boolean A00(String str) {
        return (str == null || str.length() == 0 || !this.A00.getBoolean(str, false)) ? false : true;
    }

    public AnonymousClass5F1(UserSession userSession) {
        this.A00 = 1Al.A01(userSession).A04(1An.A26, AnonymousClass5F1.class);
    }
}
