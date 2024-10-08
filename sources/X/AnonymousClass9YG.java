package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;

/* renamed from: X.9YG  reason: invalid class name */
public final class AnonymousClass9YG extends 2YL implements AnonymousClass89Y {
    public int A00 = -1;
    public 28D A01;
    public AnonymousClass8KC A02;
    public C314446iH A03;
    public final C3497681r A04;
    public final C311756dC A05;
    public final C353778Ja A06;
    public final UserSession A07;
    public final C357638Yz A08;
    public final C39648A3o A09;
    public final C249513ju A0A = new 1HR(0);

    public final void A00() {
        AnonymousClass8d4.A00.Epw((Object) null);
        ((C3503584i) this.A06.A00.A00.A00()).EUm((CameraAREffect) null);
        AnonymousClass7TF.A1K(this, C318116oQ.A00(this), 0);
        AnonymousClass8KC r0 = this.A02;
        if (r0 != null) {
            r0.DYN((CameraAREffect) null);
        }
    }

    public final void A01(CameraAREffect cameraAREffect) {
        CameraAREffect cameraAREffect2 = cameraAREffect;
        AnonymousClass8d4.A00.Epw(cameraAREffect2);
        C39648A3o a3o = this.A09;
        AnonymousClass80N r13 = AnonymousClass80N.A00;
        27p.A01(a3o.A00).A11(C359198cG.A00(r13), (C371088xY) null, cameraAREffect2.A0K, cameraAREffect2.A0M, cameraAREffect2.A0I, 0, 1, cameraAREffect2.CbC());
        this.A04.Ewa(this.A01, r13, cameraAREffect2, AnonymousClass7TF.A0g(this.A07), "mini_gallery_select_effect");
        AnonymousClass7TF.A1K(this, C318116oQ.A00(this), 1);
        C353778Ja r4 = this.A06;
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new MG7(this, (AnonymousClass4D7) null, 49), AnonymousClass0Zq.A00(new AnonymousClass9K3(r4, (AnonymousClass4D7) null, 24))));
        ((C3503584i) r4.A00.A00.A00()).EUm(cameraAREffect2);
        AnonymousClass8KC r0 = this.A02;
        if (r0 != null) {
            r0.DYN(cameraAREffect2);
        }
    }

    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }

    public AnonymousClass9YG(28D r3, C3497681r r4, C311756dC r5, C353778Ja r6, UserSession userSession, C357638Yz r8, C39648A3o a3o) {
        AnonymousClass7TG.A1Q(r6, r5);
        0qQ.A0B(r4, 6);
        this.A07 = userSession;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = r8;
        this.A09 = a3o;
        this.A04 = r4;
        this.A01 = r3;
    }
}
