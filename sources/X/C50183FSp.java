package X;

import android.view.View;

/* renamed from: X.FSp  reason: case insensitive filesystem */
public final class C50183FSp implements C252203oj {
    public final /* synthetic */ C50184FSq A00;
    public final /* synthetic */ C319656qy A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ boolean A03;

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public C50183FSp(C50184FSq fSq, C319656qy r2, C62320sa r3, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A00 = fSq;
        this.A02 = r3;
    }

    public final void DmC(2cs r5) {
        boolean z = this.A03;
        C319656qy r2 = this.A01;
        if (z) {
            View view = r2.A01;
            view.setRotationY(0.0f);
            view.setVisibility(0);
            ((2cs) r2.A02.getValue()).A04();
            return;
        }
        C50184FSq fSq = this.A00;
        2cs r22 = (2cs) r2.A02.getValue();
        r22.A0B(fSq);
        r22.A05(0.0d);
        r22.A0A(fSq);
        this.A02.invoke();
    }

    public final void DmE(2cs r7) {
        C319656qy r4 = this.A01;
        float f = ((float) ((2cs) r4.A03.getValue()).A09.A00) * 180.0f;
        View view = r4.A00;
        view.setRotationY(f);
        View view2 = r4.A01;
        view2.setRotationY(f);
        float abs = Math.abs(f) % 360.0f;
        if (abs < 90.0f || abs > 270.0f) {
            view.setVisibility(0);
            view2.setVisibility(4);
            return;
        }
        view.setVisibility(4);
        view2.setVisibility(0);
        view2.setScaleX(-1.0f);
    }
}
