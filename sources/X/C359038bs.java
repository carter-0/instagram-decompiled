package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8bs  reason: invalid class name and case insensitive filesystem */
public final class C359038bs extends C228042kh {
    public final UserSession A00;
    public final AnonymousClass3E6 A01;
    public final C357638Yz A02;
    public final TargetViewSizeProvider A03;
    public final 1ua A04;
    public final C359028br A05;

    public C359038bs(UserSession userSession, AnonymousClass3E6 r3, C357638Yz r4, TargetViewSizeProvider targetViewSizeProvider, 1ua r6, C359028br r7) {
        0qQ.A0B(r7, 4);
        0qQ.A0B(r3, 5);
        0qQ.A0B(r6, 6);
        this.A00 = userSession;
        this.A02 = r4;
        this.A03 = targetViewSizeProvider;
        this.A05 = r7;
        this.A01 = r3;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C357638Yz r3 = this.A02;
        TargetViewSizeProvider targetViewSizeProvider = this.A03;
        C359028br r6 = this.A05;
        return new C352838Ff(userSession, this.A01, r3, targetViewSizeProvider, C359088bz.A00(userSession), r6, C359048bt.A00(userSession, this.A04));
    }
}
