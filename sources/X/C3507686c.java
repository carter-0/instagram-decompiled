package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.86c  reason: invalid class name and case insensitive filesystem */
public final class C3507686c {
    public C331157Pu A00;
    public C331127Pr A01;
    public final C3507486a A02;
    public final int A03;
    public final UserSession A04;

    public C3507686c(C3507486a r2, UserSession userSession, int i) {
        0qQ.A0B(r2, 2);
        this.A04 = userSession;
        this.A02 = r2;
        this.A03 = i;
    }

    public final void A00(Context context, float f) {
        0qQ.A0B(context, 0);
        C61435K7k k7k = new C61435K7k();
        C331127Pr r1 = new C331127Pr(this.A04);
        r1.A0k = false;
        r1.A0q = true;
        r1.A03 = f;
        r1.A0x = true;
        r1.A04 = 1.0f;
        r1.A0a = true;
        r1.A0T = k7k;
        r1.A0U = new C40642AgH(this);
        r1.A1O = false;
        r1.A06 = this.A03;
        this.A01 = r1;
        C331157Pu A002 = r1.A00();
        this.A00 = A002;
        A002.A0D(context, k7k);
    }
}
