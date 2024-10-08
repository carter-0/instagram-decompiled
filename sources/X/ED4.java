package X;

import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class ED4 extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C47936ENn A03;

    public ED4(C47936ENn eNn, int i, int i2, int i3) {
        this.A03 = eNn;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-173641167);
        ED4.super.onFail(r5);
        C47936ENn eNn = this.A03;
        if (eNn.A02 != null) {
            C49958FGq.A08(eNn.A02, DbZ.A0j(eNn));
        }
        AnonymousClass0fD.A0A(1678603216, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-513585876);
        ProgressButton progressButton = this.A03.A03;
        if (progressButton != null) {
            progressButton.setShowProgressBar(false);
        }
        AnonymousClass0fD.A0A(-87620714, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-356655461);
        ProgressButton progressButton = this.A03.A03;
        if (progressButton != null) {
            progressButton.setShowProgressBar(true);
        }
        AnonymousClass0fD.A0A(440653426, A032);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1684424777);
        C47347Dvh dvh = (C47347Dvh) obj;
        int A033 = AnonymousClass0fD.A03(1304917226);
        C47936ENn eNn = this.A03;
        RegFlowExtras regFlowExtras = eNn.A01;
        boolean z = dvh.A00;
        regFlowExtras.A0s = z;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A00;
        if (z) {
            regFlowExtras.A0v = dvh.A01;
            ? obj2 = new Object();
            obj2.A02 = i;
            obj2.A01 = i2;
            obj2.A00 = i3;
            regFlowExtras.A03 = obj2;
            eNn.A03(C48156EZy.A08.A00);
        } else {
            eNn.A04(regFlowExtras.A0J, i, i2, i3);
        }
        AnonymousClass0fD.A0A(1859221810, A033);
        AnonymousClass0fD.A0A(-1342631179, A032);
    }
}
