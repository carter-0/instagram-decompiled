package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Idn  reason: case insensitive filesystem */
public final class C57622Idn implements C59595JPp {
    public final C267324bN A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public C57622Idn(C267324bN r2, UserSession userSession, AnonymousClass4DU r4) {
        0qQ.A0B(r4, 3);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = r4;
    }

    public final void Ckn(Integer num, int i, int i2) {
        String str;
        String str2;
        0qQ.A0B(num, 2);
        UserSession userSession = this.A01;
        AnonymousClass4DU r3 = this.A02;
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        1Xj r1 = this.A00.A02;
        if (r1 != null) {
            C254523sc A0c = C51967G9n.A0c(userSession, r1, r3, "gesture");
            if (num.intValue() != 0) {
                str = "user_swipe";
            } else {
                str = "auto_advance";
            }
            A0c.A6x = str;
            A0c.A08(i2);
            if (i < i2) {
                str2 = "swipe_left";
            } else {
                str2 = "swipe_right";
            }
            A0c.A7M = str2;
            XXC.A00(A012, A0c, r3);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Ckt(AdFormatType adFormatType) {
    }
}
