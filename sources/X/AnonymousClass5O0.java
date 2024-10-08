package X;

/* renamed from: X.5O0  reason: invalid class name */
public final class AnonymousClass5O0 implements AnonymousClass4QH {
    public final /* synthetic */ C266114Xp A00;

    public AnonymousClass5O0(C266114Xp r1) {
        this.A00 = r1;
    }

    public final void Cwm(Exception exc) {
        2AG.A05("MediaCodecAudioRenderer2", "Audio sink error", exc);
        AnonymousClass4QF r2 = this.A00.A09;
        r2.A00.post(new C20171WmV(r2, exc));
    }

    public final void Cwr(AnonymousClass60U r4) {
        AnonymousClass4QF r2 = this.A00.A09;
        r2.A00.post(new C20174WmY(r2, r4));
    }

    public final void Cws(AnonymousClass60U r4) {
        AnonymousClass4QF r2 = this.A00.A09;
        r2.A00.post(new C20173WmX(r2, r4));
    }

    public final void DUw() {
        C289895eP r0 = this.A00.A03;
        if (r0 != null) {
            ((AnonymousClass4S5) ((C289885eO) r0).A00.A0k).A00.sendEmptyMessage(2);
        }
    }

    public final void DUx() {
        C289895eP r0 = this.A00.A03;
        if (r0 != null) {
            ((C289885eO) r0).A00.A0Q = true;
        }
    }

    public final void DYD(long j) {
        AnonymousClass4QF r2 = this.A00.A09;
        r2.A00.post(new C295425o8(r2));
    }

    public final void DYI() {
        this.A00.A04 = true;
    }

    public final void DlM(boolean z) {
        AnonymousClass4QF r2 = this.A00.A09;
        r2.A00.post(new C299865vy(r2));
    }

    public final void DuV(long j, long j2, int i) {
        AnonymousClass4QF r2 = this.A00.A09;
        r2.A00.post(new C19965Wic(r2));
    }
}
