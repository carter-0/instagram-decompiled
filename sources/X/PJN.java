package X;

import com.instagram.model.reels.Reel;
import java.util.List;

public final class PJN implements AnonymousClass6VI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass3BQ A02;
    public final /* synthetic */ AnonymousClass32A A03;
    public final /* synthetic */ XC0 A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    public PJN(Reel reel, AnonymousClass3BQ r2, AnonymousClass32A r3, XC0 xc0, List list, List list2, int i) {
        this.A03 = r3;
        this.A04 = xc0;
        this.A01 = reel;
        this.A06 = list;
        this.A05 = list2;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void DEU(long j) {
        XC0 xc0 = this.A04;
        if (xc0 != null) {
            xc0.Eui(false);
        }
    }

    public final void Dom(boolean z, long j) {
        AnonymousClass32A r0 = this.A03;
        XC0 xc0 = this.A04;
        r0.A06(this.A01, this.A02, xc0, this.A06, this.A05, this.A00);
        if (xc0 != null) {
            xc0.Eui(false);
        }
    }

    public final void onCancel() {
        XC0 xc0 = this.A04;
        if (xc0 != null) {
            xc0.Eui(false);
        }
    }

    public final void onStart() {
        XC0 xc0 = this.A04;
        if (xc0 != null) {
            xc0.Eui(true);
        }
    }
}
