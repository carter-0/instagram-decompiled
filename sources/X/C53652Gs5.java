package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gs5  reason: case insensitive filesystem */
public final class C53652Gs5 extends C251343mx {
    public final 2WX A00;
    public final UserSession A01;

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        String str;
        0qQ.A0B(r10, 0);
        1R7 C82 = AnonymousClass1Qz.A00(this.A01).C82();
        0qQ.A07(C82);
        C266444Yx A002 = C70348O3a.A00(C82, "");
        J6K j6k = new J6K(r10, 48);
        J6K j6k2 = new J6K(r10, 47);
        if (A002 != null) {
            str = C51968G9o.A11(C51967G9n.A09(r10), A002);
        } else {
            str = null;
        }
        return new C53981GxP(this.A00, str, j6k, j6k2, C51969G9p.A02(r10, C51972G9s.A0G(11.0f)), 1.0f, R.drawable.spinsta_data_white, C51969G9p.A08(r10, R.color.design_dark_default_color_on_background));
    }

    public C53652Gs5(2WX r1, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
    }
}
