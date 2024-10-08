package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Jl  reason: invalid class name and case insensitive filesystem */
public abstract class C240063Jl {
    public static String A00;
    public static String A01;

    public static final void A00(AnonymousClass4DH r6, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String str = A01;
        if (str != null) {
            1OC A04 = C3724090s.A04(userSession, str);
            A04.A00 = new EBA(userSession);
            r6.schedule(A04);
            A01 = null;
        }
        String str2 = A00;
        if (str2 != null) {
            1NY r2 = new 1NY(userSession, -2);
            r2.A05();
            r2.A0K("fundraiser/%s/shared_to_feed_media/", new Object[]{str2});
            r2.A9m("fundraiser_id", str2);
            r2.A0O((15p) null, C43841CFh.class, C45724D2x.class, false);
            1OC A0M = r2.A0M();
            A0M.A00 = new CH2(userSession);
            r6.schedule(A0M);
            A00 = null;
        }
    }
}
