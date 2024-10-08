package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Aat  reason: case insensitive filesystem */
public final class C40360Aat implements MV5 {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ AnonymousClass8QN A01;
    public final /* synthetic */ LD4 A02;
    public final /* synthetic */ C381779cJ A03;
    public final /* synthetic */ A6R A04;
    public final /* synthetic */ boolean A05;

    public final void DEG(Exception exc) {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C40360Aat(C53401GnY gnY, AnonymousClass8QN r2, LD4 ld4, C381779cJ r4, A6R a6r, boolean z) {
        this.A01 = r2;
        this.A02 = ld4;
        this.A05 = z;
        this.A03 = r4;
        this.A04 = a6r;
        this.A00 = gnY;
    }

    public final void Doe(String str) {
        LD4 ld4 = this.A02;
        DirectShareTarget directShareTarget = ld4.A00;
        directShareTarget.getClass();
        C254783t2 r0 = directShareTarget.A09;
        r0.getClass();
        String str2 = str;
        if ((r0 instanceof AnonymousClass9HR) && !this.A05) {
            AnonymousClass8QN r02 = this.A01;
            Activity activity = r02.A0A;
            UserSession userSession = r02.A0G;
            C381779cJ r7 = this.A03;
            r7.getClass();
            AGu aGu = C39622A2m.A02;
            AGu.A01(activity, userSession, directShareTarget, r7, "MultiMediaEditController_sendMessageMsys", str2);
        } else if (!this.A05) {
            1pL A002 = C66551pM.A00();
            AnonymousClass8QN r03 = this.A01;
            A002.EMy(this.A00, r03.A0G, r03.A0X, ld4, this.A03, this.A04, (AnonymousClass3Q2) null, str2);
        }
    }
}
