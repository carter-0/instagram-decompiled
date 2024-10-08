package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.JjU  reason: case insensitive filesystem */
public final class C60325JjU extends 2YL implements C74483Pvd {
    public final long A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public final void AJR(C74255Prj prj) {
        Object value;
        N4R n4r;
        0qQ.A0B(prj, 0);
        05G r3 = this.A04;
        do {
            value = r3.getValue();
            n4r = (N4R) value;
        } while (!JTU.A1S(n4r, value, 00k.A0f((Iterable) n4r.A02, prj), r3));
    }

    public final void DMk(String str) {
    }

    public final void Dro() {
    }

    public C60325JjU(UserSession userSession, String str, String str2, long j) {
        Object value;
        N4R n4r;
        C266444Yx A002;
        long j2;
        C266444Yx A003;
        UserSession userSession2 = userSession;
        String str3 = str;
        String str4 = str2;
        C51974G9v.A1L(userSession2, str3, str4);
        this.A01 = userSession2;
        this.A02 = str3;
        this.A00 = j;
        this.A03 = str4;
        02z A10 = DbS.A10(new N4R(20));
        this.A04 = A10;
        this.A05 = 10b.A03(A10);
        do {
            value = A10.getValue();
            n4r = (N4R) value;
            if (00l.A0W(this.A02)) {
                A002 = DbS.A0Q(new Object[0], 2131972954);
            } else {
                A002 = JUH.A00(this.A02);
            }
            j2 = this.A00;
            if (00l.A0W(this.A03)) {
                A003 = DbS.A0Q(new Object[0], 2131972955);
            } else {
                A003 = JUH.A00(this.A03);
            }
        } while (!A10.AIY(value, N4R.A01(AnonymousClass7TE.A1I(new C53313Glz(A002, A003, (Integer) null, 2131965499, R.drawable.instagram_location_pano_outline_24, 2131976795, 2131972392, 2131965559, 2131976641, j2)), (List) n4r.A02)));
    }

    public final AnonymousClass0Ud CB9() {
        return this.A05;
    }

    public final void DGd() {
        Object value;
        N4R n4r;
        05G r4 = this.A04;
        do {
            value = r4.getValue();
            n4r = (N4R) value;
        } while (!JTU.A1S(n4r, value, 00k.A0T(PE4.A00, (Collection) n4r.A02), r4));
        0Aj A09 = JTU.A09(this.A01);
        A09.AAJ("source", "login_details_page");
        A09.AAJ("security_alert_action", "open_login_activity_from_alert_details");
        if (A09.isSampled()) {
            A09.Cgf();
        }
    }
}
