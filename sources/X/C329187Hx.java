package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Hx  reason: invalid class name and case insensitive filesystem */
public final class C329187Hx {
    public final /* synthetic */ C329067Hl A00;

    public C329187Hx(C329067Hl r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.OKm, java.lang.Object] */
    public final void A00(String str, String str2, String str3, int i) {
        C329067Hl r3 = this.A00;
        C329067Hl.A0N((N34) null, C69319NjK.DIRECT_COMPOSER_STICKER_SHORTCUT, r3, (String) null);
        r3.A0b.A06((String) null);
        C331697Sa r1 = r3.A1i;
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = str2;
        obj.A02 = str3;
        r1.A06(obj, str, (String) null);
        UserSession userSession = r3.A1Z;
        AnonymousClass37D A01 = AnonymousClass7ON.A01(r3.A1R, userSession);
        if (A01 != null) {
            A01.A0B();
        }
        r3.A1F(0.0f);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("direct_power_ups_has_sent", true);
        AR4.apply();
    }
}
