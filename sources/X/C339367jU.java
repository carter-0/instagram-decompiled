package X;

import android.widget.LinearLayout;

/* renamed from: X.7jU  reason: invalid class name and case insensitive filesystem */
public final class C339367jU extends C232922uf {
    public final /* synthetic */ C339297jN A00;

    public final void DmE(2cs r6) {
        0qQ.A0B(r6, 0);
        C339297jN r4 = this.A00;
        float f = (float) r6.A09.A00;
        LinearLayout linearLayout = r4.A0I.A03;
        if (linearLayout != null) {
            linearLayout.setAlpha(f);
            int i = 8;
            if (f > 0.0f) {
                i = 0;
            }
            linearLayout.setVisibility(i);
        }
    }

    public C339367jU(C339297jN r1) {
        this.A00 = r1;
    }
}
