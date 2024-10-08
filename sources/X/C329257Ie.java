package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Ie  reason: invalid class name and case insensitive filesystem */
public final class C329257Ie {
    public final C329267If A00;

    public static final String A00(C3260875i r3) {
        StringBuilder sb;
        String str;
        if (!(r3 instanceof C3260975j) || (str = ((C3260975j) r3).A07) == null) {
            sb = new StringBuilder();
            sb.append(r3.A02().A00);
        } else {
            sb = new StringBuilder();
            sb.append(str);
        }
        sb.append(" text entry");
        return sb.toString();
    }

    public C329257Ie(AnonymousClass0iw r2, UserSession userSession, C254783t2 r4, AnonymousClass0eK r5) {
        this.A00 = new C329267If(r2, userSession, r4, r5);
    }
}
