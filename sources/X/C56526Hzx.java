package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hzx  reason: case insensitive filesystem */
public final class C56526Hzx {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final AnonymousClass49W A02;
    public final AnonymousClass49S A03;
    public final String A04;

    public C56526Hzx(UserSession userSession, AnonymousClass4DU r11, String str) {
        AnonymousClass7TF.A1B(userSession, 1, r11);
        this.A00 = userSession;
        this.A01 = r11;
        this.A04 = str;
        AnonymousClass49S r0 = new AnonymousClass49S((AnonymousClass49T) null, (Integer) null, (Integer) null, AnonymousClass05K.A01, 444, true, false, false);
        this.A03 = r0;
        this.A02 = AnonymousClass49V.A00(userSession, r0);
    }

    public static final C254523sc A00(C275464qK r3, C56526Hzx hzx, int i) {
        C297375re r0;
        AnonymousClass4DU r1 = hzx.A01;
        C254523sc A0n = C51965G9l.A0n(r1, "IMPRESSION");
        A0n.A4s = r1.getModuleName();
        A0n.A0T(Integer.valueOf(i));
        A0n.A3W = DbV.A0q(r3.getId());
        A0n.A6a = hzx.A04;
        if (r3.A01 == 1UQ.A0Q) {
            r0 = C297375re.HIGHLIGHTS_IN_FEED_UNIT;
        } else {
            r0 = C297375re.STORIES_IN_FEED_UNIT;
        }
        A0n.A0d = r0;
        return A0n;
    }
}
