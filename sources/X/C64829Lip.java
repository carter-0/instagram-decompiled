package X;

import com.instagram.fanclub.api.FanClubApi;
import java.util.concurrent.CancellationException;

/* renamed from: X.Lip  reason: case insensitive filesystem */
public final class C64829Lip implements AnonymousClass0lh {
    public final FanClubApi A00;
    public final C262224Cq A01;
    public final AnonymousClass0r6 A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public C64829Lip(AnonymousClass12V r4, FanClubApi fanClubApi) {
        0qQ.A0B(r4, 2);
        this.A00 = fanClubApi;
        this.A01 = JTR.A17(r4, 210647125);
        02z A012 = 106.A01((Object) null);
        this.A03 = A012;
        this.A04 = 10b.A03(A012);
        this.A02 = new C51623FxC((AnonymousClass0r6) A012, 6);
    }

    public final void A00() {
        MG8.A01(this, this.A01, 1);
    }

    public final void onSessionWillEnd() {
        19E.A05((CancellationException) null, this.A01);
    }
}
