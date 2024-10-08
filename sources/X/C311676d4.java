package X;

import android.util.SparseArray;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6d4  reason: invalid class name and case insensitive filesystem */
public final class C311676d4 implements C311686d5 {
    public SparseArray A00;
    public View A01;
    public C255773uh A02;
    public C250973mM A03;
    public C309426Yf A04;
    public C275794rx A05;
    public String A06;
    public String A07;
    public String A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;
    public final C311666d3 A0B;

    public final void DYB() {
    }

    public final void A00(boolean z, boolean z2) {
        C275794rx r0 = this.A05;
        if (r0 != null && r0.isShowing()) {
            if (z2) {
                this.A05.A03 = null;
            }
            this.A05.A03(z);
            this.A05 = null;
        }
    }

    public final void DYA() {
        this.A0B.DsD();
    }

    public final void onClick() {
        C270074g9 r0;
        String str;
        String str2 = this.A07;
        String str3 = this.A08;
        if (str3 != null && str2 != null) {
            View view = this.A01;
            C250973mM r02 = this.A03;
            String str4 = null;
            if (!(r02 == null || !r02.A0N || view == null)) {
                C238833Dp A002 = C238833Dp.A00(this.A0A);
                C238863Ds r3 = C238863Ds.TITLE;
                C255773uh r03 = this.A02;
                if (r03 != null) {
                    str = r03.A0k;
                } else {
                    str = null;
                }
                A002.A07(view, r3, new String[]{str}, 1);
            }
            this.A0B.Ds9(this.A02, this.A03, this.A04, str3, str2, this.A06);
            SparseArray sparseArray = this.A00;
            if (sparseArray != null) {
                C255773uh r04 = this.A02;
                if (!(r04 == null || (r0 = r04.A09) == null)) {
                    str4 = r0.getId();
                }
                UserSession userSession = this.A0A;
                AnonymousClass0iw r4 = this.A09;
                0qQ.A0B(userSession, 0);
                AnonymousClass6KM r32 = new AnonymousClass6KM("su_stories", str3, r4.getModuleName());
                Object obj = sparseArray.get(1);
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                String str5 = (String) obj;
                if (str5 != null) {
                    r32.A04 = str5;
                }
                Object obj2 = sparseArray.get(2);
                0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj2;
                if (str6 != null) {
                    r32.A07 = str6;
                }
                if (sparseArray.get(0) != null) {
                    Object obj3 = sparseArray.get(0);
                    0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Int");
                    r32.A00 = ((Number) obj3).intValue();
                }
                if (str4 != null) {
                    r32.A08 = str4;
                }
                new C230012om(r4, userSession).A0B(new AnonymousClass6KN(r32));
            }
        }
    }

    public C311676d4(AnonymousClass0iw r1, UserSession userSession, C311666d3 r3) {
        this.A0A = userSession;
        this.A0B = r3;
        this.A09 = r1;
    }
}
