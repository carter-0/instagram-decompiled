package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Aas  reason: case insensitive filesystem */
public final class C40359Aas implements MV5 {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ AnonymousClass8LU A01;
    public final /* synthetic */ LD4 A02;
    public final /* synthetic */ C381779cJ A03;
    public final /* synthetic */ A6R A04;

    public final void onStart() {
    }

    public C40359Aas(C53401GnY gnY, AnonymousClass8LU r2, LD4 ld4, C381779cJ r4, A6R a6r) {
        this.A01 = r2;
        this.A02 = ld4;
        this.A03 = r4;
        this.A04 = a6r;
        this.A00 = gnY;
    }

    public final void DEG(Exception exc) {
        AnonymousClass8LU.A0B(this.A01, 2131961740);
        0kD.A07(AnonymousClass8LU.__redex_internal_original_name, "sendVideoToMsys saveTask failed.", exc);
    }

    public final void Doe(String str) {
        LD4 ld4 = this.A02;
        DirectShareTarget directShareTarget = ld4.A00;
        directShareTarget.getClass();
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        boolean z = r0 instanceof AnonymousClass9HR;
        AnonymousClass8LU r2 = this.A01;
        String str2 = str;
        if (z) {
            Activity activity = r2.A0W;
            UserSession userSession = r2.A0c;
            C381779cJ r9 = this.A03;
            AGu aGu = C39622A2m.A02;
            AGu.A01(activity, userSession, directShareTarget, r9, "VideoViewController_sendVideoToMsys", str2);
            return;
        }
        AnonymousClass8L1 r1 = r2.A0g;
        C381779cJ r8 = this.A03;
        A6R a6r = this.A04;
        C53401GnY gnY = this.A00;
        0qQ.A0B(str, 1);
        C66551pM.A00().EMy(gnY, r1.A02, new C40340AaZ(r2, r1, ld4), ld4, r8, a6r, (AnonymousClass3Q2) null, str2);
    }

    public final void onFinish() {
        AnonymousClass8LU r1 = this.A01;
        if (C305756Jk.A01(r1.A0c)) {
            r1.onResume();
        }
    }
}
