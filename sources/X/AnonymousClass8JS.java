package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.8JS  reason: invalid class name */
public final class AnonymousClass8JS implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass8JS(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass9IZ r8 = (AnonymousClass9IZ) obj;
        0qQ.A0B(r8, 0);
        Medium medium = (Medium) r8.A03;
        boolean z = r8.A01;
        C353498Hw r3 = this.A00;
        AnonymousClass88V r2 = r3.A1o;
        if (!r2.A02 && !C353498Hw.A1X(r3) && C353498Hw.A02(r3) <= 100) {
            C59689JTv.A07(r3.A11, 2131955694);
            AnonymousClass88V.A00(r2);
            r3.A1g.A01 = false;
        } else if (medium.CeS()) {
            C353498Hw.A0L(medium, r3, (Integer) r8.A00, z);
        } else if (medium.A05()) {
            C353498Hw.A0M(medium, r3, z);
        } else {
            0kD.A07("ClipsCaptureControllerImpl", "Unknown medium type", (Throwable) null);
        }
    }
}
