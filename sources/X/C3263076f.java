package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.76f  reason: invalid class name and case insensitive filesystem */
public final class C3263076f {
    public final UserSession A00;
    public final MYd A01;

    public final 1aU A00(String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B("content://com.instagram.android.tam-attachment", 1);
        if (!str.startsWith("content://com.instagram.android.tam-attachment")) {
            return 1aU.A00();
        }
        MYd mYd = this.A01;
        String A002 = mYd.A00(str);
        if (mYd.A00.containsKey(OXF.A01(str)) || A002 == null) {
            return C66594MYg.A03.A02(this.A00, AnonymousClass61K.MEDIA_LOADER).A01.A02(str).A0H();
        }
        return 1aU.A09(A002);
    }

    public C3263076f(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AnonymousClass6FA.A00(userSession);
    }
}
