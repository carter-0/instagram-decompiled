package X;

import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

public final class PQT implements C315616kD {
    public final /* synthetic */ C71066Oal A00;
    public final /* synthetic */ C70716OHl A01;
    public final /* synthetic */ C70716OHl A02;
    public final /* synthetic */ boolean A03;

    public PQT(C71066Oal oal, C70716OHl oHl, C70716OHl oHl2, boolean z) {
        this.A02 = oHl;
        this.A01 = oHl2;
        this.A00 = oal;
        this.A03 = z;
    }

    public final void DaF(C294975nL r15, float f) {
        C70716OHl oHl = this.A02;
        float f2 = oHl.A00;
        C70716OHl oHl2 = this.A01;
        double d = (double) f;
        float f3 = oHl.A01;
        C71066Oal oal = this.A00;
        RoundedCornerFrameLayout roundedCornerFrameLayout = oal.A0C;
        C66583MXo.A0v(roundedCornerFrameLayout, (float) AnonymousClass37Q.A03(d, (double) f2, (double) oHl2.A00), (float) AnonymousClass37Q.A03(d, (double) f3, (double) oHl2.A01));
        roundedCornerFrameLayout.setCornerRadius((int) ((float) AnonymousClass37Q.A03(d, (double) oHl.A03, (double) oHl2.A03)));
        if (this.A03) {
            oal.A07.setAlpha((float) AnonymousClass37Q.A03(d, (double) ((float) oHl.A07), (double) ((float) oHl2.A07)));
        }
    }
}
