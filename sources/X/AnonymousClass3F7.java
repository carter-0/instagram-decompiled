package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3F7  reason: invalid class name */
public final class AnonymousClass3F7 implements AnonymousClass3F6 {
    public C10451RsS A00;

    public final void E4U(AnonymousClass5HJ r13, 0lg r14) {
        String str;
        UserSession userSession;
        String str2 = r13.A10;
        19i A01 = 0jh.A04.A01(r14).A01(19f.A1K);
        String str3 = null;
        if (A01 != null) {
            str = A01.A01;
        } else {
            str = null;
        }
        if (r14 instanceof UserSession) {
            userSession = (UserSession) r14;
        } else {
            userSession = null;
        }
        if (str2 != null && str != null && userSession != null && AnonymousClass2E0.A05().A01) {
            ArrayList A02 = AH7.A01().A02(C7580QKv.class);
            C7580QKv qKv = (C7580QKv) 00k.A0J(A02);
            if (qKv != null) {
                str3 = qKv.A0b.A00.A0P.A02;
            }
            String A002 = new 2Mg(userSession.A06).A00();
            C10451RsS rsS = new C10451RsS(AnonymousClass0kN.A02(r14));
            this.A00 = rsS;
            String str4 = r13.A12;
            AnonymousClass2M6.A00 = rsS.A01;
            AnonymousClass2MQ.A00(2M7.A05);
            0wc r2 = rsS.A00;
            0Aj A003 = r2.A00(r2.A00, "client_add_autofilltemptorealproof_init");
            if (A003.isSampled()) {
                0bb r1 = new 0bb();
                if (str4 != null) {
                    r1.A06(Pxd.A00(814), str4);
                }
                if (str3 != null) {
                    r1.A06("iab_session_id", str3);
                }
                r1.A06("family_device_id", str);
                A003.AAK(r1, AnonymousClass000.A00(1317));
                A003.AAJ(Dbj.A02(), AnonymousClass2M6.A00);
                A003.AAJ("product_type", AnonymousClass2MT.A00);
                A003.AAJ("platform", "android");
                A003.A9F(AnonymousClass000.A00(495), Long.valueOf(System.currentTimeMillis()));
                A003.Cgf();
            }
            1Eo.A05(19B.A00, new C13280TSz(this, A02, A002, str, str2, (AnonymousClass4D7) null, 0), 19E.A02(AnonymousClass12T.A00.A04));
        }
    }

    public final boolean CSd(0lg r4) {
        return 182.A06(0Tu.A05, r4, 36310430914510952L);
    }
}
