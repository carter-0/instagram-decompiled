package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Oal  reason: case insensitive filesystem */
public final class C71066Oal {
    public static final C71392co A0F = C71392co.A04(125.0d, 12.5d);
    public float A00 = 1.0f;
    public float A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;
    public final Activity A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final OJW A0B;
    public final RoundedCornerFrameLayout A0C;
    public final boolean A0D;
    public final View A0E;

    public static final void A00(ViewGroup viewGroup, float f, float f2, float f3) {
        ViewGroup viewGroup2 = viewGroup;
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth();
        C294975nL A0E2 = JTP.A0b(viewGroup2).A0A().A0E(A0F);
        A0E2.A0K(f3);
        A0E2.A06 = new PQV(viewGroup2, f, f2, height, width);
        A0E2.A0H();
    }

    public static final void A01(C71066Oal oal, C70716OHl oHl, C70716OHl oHl2, C295005nO r10, boolean z, boolean z2) {
        View view = oal.A09;
        C71392co r0 = C315596kB.A02;
        C294975nL A0F2 = JTP.A0b(view).A0F(true);
        int i = 0;
        if (z2) {
            i = 4;
        }
        A0F2.A04 = i;
        C71392co r4 = A0F;
        C294975nL A0E2 = A0F2.A0E(r4);
        float f = oHl.A04;
        float f2 = oHl2.A04;
        A0E2.A0U(f, f2, 0.0f);
        A0E2.A0V(f, f2, 0.0f);
        A0E2.A0S(oHl.A05, oHl2.A05);
        A0E2.A0T(oHl.A06, oHl2.A06);
        A0E2.A0O(oHl.A02, oHl2.A02);
        A0E2.A06 = new PQT(oal, oHl, oHl2, z);
        A0E2.A05 = new C65718LyY(3, r10, oal);
        A0E2.A0H();
        oal.A04 = true;
        C294975nL A0b = JTP.A0b(oal.A0A);
        View view2 = oal.A08;
        A0b.A0U(view2.getScaleX(), 1.0f, 0.0f);
        A0b.A0V(view2.getScaleY(), 1.0f, 0.0f);
        A0b.A0K(0.0f);
        A0b.A0J(0.0f);
        A0b.A0F(true).A0E(r4).A0H();
    }

    public C71066Oal(Activity activity, View view, View view2, View view3, View view4, View view5, RoundedCornerFrameLayout roundedCornerFrameLayout, boolean z) {
        this.A06 = activity;
        this.A07 = view;
        this.A0E = view2;
        this.A08 = view3;
        this.A09 = view4;
        this.A0A = view5;
        this.A0C = roundedCornerFrameLayout;
        this.A0D = z;
        this.A0B = new OJW(activity);
    }
}
