package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.8Z5  reason: invalid class name */
public final class AnonymousClass8Z5 implements C252213ok {
    public float A00;
    public int A01;
    public View A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass3E6 A07;
    public final AnonymousClass8Z3 A08;
    public final Context A09;

    public static final void A00(AnonymousClass8Z5 r4, int i) {
        int i2;
        float f;
        if (r4.A02 == null) {
            return;
        }
        if (!r4.A04 || i != 0) {
            int A082 = 0nA.A08(r4.A09);
            if (!r4.A05 || i != 0) {
                A082 -= i;
                View view = r4.A02;
                int i3 = 0;
                if (view != null) {
                    i2 = view.getHeight();
                } else {
                    i2 = 0;
                }
                int i4 = (A082 - i2) / 2;
                View view2 = r4.A02;
                if (view2 != null) {
                    i3 = view2.getTop();
                }
                f = (float) (i4 - i3);
            } else {
                f = r4.A00;
            }
            boolean z = r4.A03;
            View view3 = r4.A02;
            if (!z) {
                if (view3 != null) {
                    view3.setTranslationY(f);
                }
                r4.A08.DzC((int) f, A082);
            } else if (view3 != null) {
                C294975nL A012 = C294975nL.A01(view3, 0);
                A012.A0G();
                A012.A0K(f);
                A012.A05 = new AgA(r4, f, A082);
                A012.A0H();
            }
        }
    }

    public final void DMr(int i, boolean z) {
        if (i == 0) {
            this.A08.DMp();
            if (!this.A06) {
                return;
            }
        } else {
            this.A01 = i;
        }
        A00(this, i);
    }

    public AnonymousClass8Z5(Context context, AnonymousClass3E6 r2, AnonymousClass8Z3 r3) {
        this.A09 = context;
        this.A07 = r2;
        this.A08 = r3;
    }
}
