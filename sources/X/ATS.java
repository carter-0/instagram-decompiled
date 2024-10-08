package X;

import android.os.Handler;

public final class ATS implements C341687nM {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ C343487qI A02;
    public final /* synthetic */ C341577nB A03;
    public final /* synthetic */ C341687nM A04;

    public ATS(Handler handler, Handler handler2, C343487qI r3, C341577nB r4, C341687nM r5) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = handler;
        this.A04 = r5;
        this.A01 = handler2;
    }

    public final void DCg(C391719tX r2) {
        this.A04.DCg(r2);
    }

    public final void onSuccess() {
        C341577nB r0 = this.A03;
        C341427mr r6 = r0.A05;
        C343487qI r5 = this.A02;
        C341607nE r4 = r0.A04;
        Handler handler = this.A00;
        C341687nM r7 = this.A04;
        Handler handler2 = this.A01;
        r6.A0I.A05.A01("pr");
        if (!r6.A0B.post(new C41240Aqc(handler, handler2, r4, r5, r6, r7))) {
            handler2.post(new C40935Alh(r6, r7));
        }
    }
}
