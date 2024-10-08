package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9xw  reason: invalid class name and case insensitive filesystem */
public abstract class C394349xw {
    public static final 1OC A00(UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 0);
        1Fc r4 = new 1Fc();
        String valueOf = String.valueOf(1G0.A00());
        r4.A05("timezone_offset", valueOf);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("creatives/create_mode/");
        A0a.A9m("timezone_offset", valueOf);
        A0a.A0Q(C384509hR.class, C39804AAb.class);
        A0a.A0A = r4.A01("creatives/create_mode/");
        A0a.A07 = num;
        if (num == AnonymousClass05K.A0C) {
            A0a.A01 = 604800000;
        }
        A0a.A0R = true;
        return A0a.A0M();
    }
}
