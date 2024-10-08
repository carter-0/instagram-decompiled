package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mbt  reason: case insensitive filesystem */
public final class C66748Mbt {
    public final 1Av A00;

    public final void A03(C254783t2 r6, String str) {
        String str2;
        0qQ.A0B(str, 1);
        synchronized (this) {
            C254763t0 A002 = AnonymousClass6W4.A00(AnonymousClass6W3.A01(r6));
            if (!(A002 == null || (str2 = A002.A00) == null)) {
                if (A01(this, str2) != null) {
                    if (A01(this, str2) == AnonymousClass05K.A0Y && !0qQ.A0K(A02(str2), str)) {
                        1Av r2 = this.A00;
                        r2.A12(002.A0g("on_device_nudity_banner_state/sender/", str2, "/message_id/"), str);
                        r2.A0z(002.A0R("on_device_nudity_banner_state/sender/", str2), 3);
                    }
                } else if (!0qQ.A0K(A02(str2), str)) {
                    1Av r22 = this.A00;
                    r22.A12(002.A0g("on_device_nudity_banner_state/sender/", str2, "/message_id/"), str);
                    r22.A0z(002.A0R("on_device_nudity_banner_state/sender/", str2), 1);
                }
            }
        }
    }

    public static final Integer A00(C66748Mbt mbt, String str) {
        1Av r3 = mbt.A00;
        return C66749Mbu.A00(r3.A01.getInt(002.A0R("on_device_nudity_banner_state/recipient/", str), 0));
    }

    public static final Integer A01(C66748Mbt mbt, String str) {
        1Av r3 = mbt.A00;
        return C66749Mbu.A00(r3.A01.getInt(002.A0R("on_device_nudity_banner_state/sender/", str), 0));
    }

    public final String A02(String str) {
        1Av r3 = this.A00;
        String string = r3.A01.getString(002.A0g("on_device_nudity_banner_state/sender/", str, "/message_id/"), "");
        if (string != null) {
            return string;
        }
        return "";
    }

    public C66748Mbt(UserSession userSession) {
        this.A00 = 1Au.A00(userSession);
    }
}
