package X;

import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

public final class PQW implements C315616kD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C71066Oal A04;
    public final /* synthetic */ RoundedCornerFrameLayout A05;

    public PQW(C71066Oal oal, RoundedCornerFrameLayout roundedCornerFrameLayout, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A05 = roundedCornerFrameLayout;
        this.A04 = oal;
    }

    public final void DaF(C294975nL r14, float f) {
        double d = (double) f;
        float A032 = (float) AnonymousClass37Q.A03(d, (double) ((float) this.A00), (double) ((float) this.A02));
        float A033 = (float) AnonymousClass37Q.A03(d, (double) ((float) this.A01), (double) ((float) this.A03));
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A05;
        C71066Oal oal = this.A04;
        roundedCornerFrameLayout.setCornerRadius((int) ((float) AnonymousClass37Q.A03(d, (double) 0nA.A04(oal.A06, 20), 0.0d)));
        oal.A07.setAlpha(f);
        C66583MXo.A0v(roundedCornerFrameLayout, A032, A033);
    }
}
