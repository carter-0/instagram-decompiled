package X;

import android.widget.FrameLayout;

public final class PIV implements AnonymousClass2sT {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ AnonymousClass90H A01;
    public final /* synthetic */ C68819NYd A02;
    public final /* synthetic */ AnonymousClass3Q2 A03;

    public PIV(AnonymousClass0iw r1, AnonymousClass90H r2, C68819NYd nYd, AnonymousClass3Q2 r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = nYd;
        this.A00 = r1;
    }

    public final void DaJ(AnonymousClass3Q2 r8) {
        0qQ.A0B(r8, 0);
        AnonymousClass90H r3 = this.A01;
        FrameLayout frameLayout = r3.A04;
        AnonymousClass3Q2 r5 = this.A03;
        C68819NYd nYd = this.A02;
        frameLayout.post(new C73387Pbk(this.A00, r3, nYd, r5, r8));
    }
}
