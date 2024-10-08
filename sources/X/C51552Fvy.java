package X;

import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Fvy  reason: case insensitive filesystem */
public final class C51552Fvy implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ AnonymousClass0aP A03;
    public final /* synthetic */ G67 A04;
    public final /* synthetic */ G69 A05;
    public final /* synthetic */ RegFlowExtras A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C51552Fvy(Handler handler, AnonymousClass4DH r2, AnonymousClass0iw r3, AnonymousClass0aP r4, G67 g67, G69 g69, RegFlowExtras regFlowExtras, String str, boolean z) {
        this.A06 = regFlowExtras;
        this.A07 = str;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = handler;
        this.A02 = r3;
        this.A05 = g69;
        this.A08 = z;
        this.A04 = g67;
    }

    public final void run() {
        RegFlowExtras regFlowExtras = this.A06;
        regFlowExtras.A0Z = this.A07;
        AnonymousClass0aP r3 = this.A03;
        02m.A0p.markerPoint(4197923, "start_create_account");
        AnonymousClass4DH r1 = this.A01;
        Handler handler = this.A00;
        AnonymousClass0iw r2 = this.A02;
        Integer A012 = C50144FRb.A01(regFlowExtras);
        C50144FRb.A03(handler, r1, r2, r3, this.A04, this.A05, regFlowExtras, A012, true);
    }
}
