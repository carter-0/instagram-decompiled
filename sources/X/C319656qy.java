package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6qy  reason: invalid class name and case insensitive filesystem */
public final class C319656qy {
    public final View A00;
    public final View A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C41636Axo.A00);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C41637Axp.A00);
    public final ViewGroup A04;

    public final void A00(boolean z, C62320sa r10) {
        View view;
        double d;
        double d2;
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null && this.A00 != null && (view = this.A01) != null) {
            AnonymousClass0eM r5 = this.A03;
            2cs r4 = (2cs) r5.getValue();
            if (z) {
                d = 50.0d;
                d2 = 20.0d;
            } else {
                d = 60.0d;
                d2 = 16.0d;
            }
            r4.A09(C71392co.A04(d, d2));
            float width = ((float) (viewGroup.getWidth() - view.getWidth())) / 2.0f;
            int i = 2;
            if (z) {
                i = 4;
            }
            C50184FSq fSq = new C50184FSq(this, r10, width, i);
            AnonymousClass0eM r1 = this.A02;
            ((2cs) r1.getValue()).A0A(fSq);
            ((2cs) r1.getValue()).A06(((2cs) r1.getValue()).A09.A00 + 1.0d);
            ((2cs) r5.getValue()).A0A(new C50183FSp(fSq, this, r10, z));
        }
    }

    public C319656qy(View view, View view2, ViewGroup viewGroup) {
        this.A04 = viewGroup;
        this.A00 = view;
        this.A01 = view2;
    }
}
