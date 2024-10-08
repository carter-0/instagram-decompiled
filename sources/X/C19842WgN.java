package X;

import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.WgN  reason: case insensitive filesystem */
public final class C19842WgN implements C256223vQ {
    public final /* synthetic */ C16384Uu1 A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ SimpleVideoLayout A02;
    public final /* synthetic */ AnonymousClass3WR A03;
    public final /* synthetic */ C256203vO A04;

    public final /* synthetic */ void Dxo() {
    }

    public final void Dxp(boolean z) {
    }

    public C19842WgN(C16384Uu1 uu1, C276544tV r2, SimpleVideoLayout simpleVideoLayout, AnonymousClass3WR r4, C256203vO r5) {
        this.A02 = simpleVideoLayout;
        this.A04 = r5;
        this.A00 = uu1;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void Dxq(boolean z) {
        AnonymousClass4M3 r1;
        SimpleVideoLayout simpleVideoLayout = this.A02;
        if (simpleVideoLayout.getTag() == this.A04 && (r1 = this.A00.A00) != null) {
            AnonymousClass3WR r5 = this.A03;
            C276544tV r2 = this.A01;
            r1.E4H(new C263794Nj(simpleVideoLayout, new C263414Lx(false, false, false, false), r5, new C263754Nf((Object) r5, 0), (String) null, "bloks_video_component_binder", C51971G9r.A00(r2.A0R(36, false) ? 1 : 0), -1, 0, true));
            r1.EjF(AnonymousClass4M7.FIT);
            r1.Ech(true);
            ((AnonymousClass4M1) r1).A0X = true;
            r1.E2q("video_prefetched", false);
        }
    }
}
