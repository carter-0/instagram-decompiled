package X;

import android.content.Context;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;

/* renamed from: X.Amj  reason: case insensitive filesystem */
public final /* synthetic */ class C40999Amj implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ InfoCenterFactShareInfoIntf A01;

    public /* synthetic */ C40999Amj(AnonymousClass8BA r1, InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf) {
        this.A00 = r1;
        this.A01 = infoCenterFactShareInfoIntf;
    }

    public final void run() {
        AnonymousClass8BA r6 = this.A00;
        InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf = this.A01;
        String str = ((InfoCenterFactShareInfo) infoCenterFactShareInfoIntf).A0A;
        C317876nz r0 = C317876nz.A0a;
        0qQ.A0B(str, 0);
        C317876nz A06 = C317886o0.A06(C318046oG.BLOKS, str);
        Context A0T = AnonymousClass7TE.A0T(r6);
        TargetViewSizeProvider targetViewSizeProvider = r6.A0z;
        AnonymousClass7TF.A1B(A0T, 0, targetViewSizeProvider);
        U1P u1p = new U1P(A0T, targetViewSizeProvider, infoCenterFactShareInfoIntf);
        C39890ADo A002 = C39890ADo.A00();
        A002.A0Q = false;
        AnonymousClass8BG.A00(u1p, A06, r6, A002);
    }
}
