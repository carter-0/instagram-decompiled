package X;

import android.content.Context;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;

/* renamed from: X.Ami  reason: case insensitive filesystem */
public final /* synthetic */ class C40998Ami implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ InfoCenterShareInfoIntf A01;

    public /* synthetic */ C40998Ami(AnonymousClass8BA r1, InfoCenterShareInfoIntf infoCenterShareInfoIntf) {
        this.A00 = r1;
        this.A01 = infoCenterShareInfoIntf;
    }

    public final void run() {
        AnonymousClass8BA r6 = this.A00;
        InfoCenterShareInfoIntf infoCenterShareInfoIntf = this.A01;
        C317876nz r0 = C317876nz.A0a;
        C317876nz A06 = C317886o0.A06(C318046oG.BLOKS, AnonymousClass000.A00(3346));
        Context A0T = AnonymousClass7TE.A0T(r6);
        TargetViewSizeProvider targetViewSizeProvider = r6.A0z;
        AnonymousClass7TF.A1B(A0T, 0, targetViewSizeProvider);
        U1Q u1q = new U1Q(A0T, targetViewSizeProvider, infoCenterShareInfoIntf);
        C39890ADo A002 = C39890ADo.A00();
        A002.A0Q = false;
        AnonymousClass8BG.A00(u1q, A06, r6, A002);
    }
}
