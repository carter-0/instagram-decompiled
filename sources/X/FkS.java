package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class FkS implements AnonymousClass6WJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ELQ A01;
    public final /* synthetic */ F1A A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ boolean A04;

    public final void DaE(float f) {
    }

    public FkS(ELQ elq, F1A f1a, ArrayList arrayList, long j, boolean z) {
        this.A01 = elq;
        this.A03 = arrayList;
        this.A00 = j;
        this.A04 = z;
        this.A02 = f1a;
    }

    public final void Dfo(String str) {
        ELQ elq = this.A01;
        if (!elq.A01.isResumed()) {
            onCancel();
            return;
        }
        C309416Ye A0i = DbS.A0i();
        ArrayList arrayList = this.A03;
        UserSession userSession = elq.A02;
        A0i.A02(userSession, str, arrayList);
        A0i.A03(elq.A03);
        A0i.A08(elq.A06);
        A0i.A01 = this.A00;
        A0i.A0d = this.A04;
        C309516Yo A0M = DbV.A0M(C18280Vp0.A01(A0i.A00()), elq.A00, userSession);
        A0M.A0A = C273654mx.A00(36);
        A0M.A04();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onCancel() {
        this.A02.A0E.setVisibility(0);
    }
}
