package X;

/* renamed from: X.HGw  reason: case insensitive filesystem */
public final class C54510HGw extends C57460Ib4 {
    public final /* synthetic */ AnonymousClass6D9 A00;

    public C54510HGw(AnonymousClass6D9 r1) {
        this.A00 = r1;
    }

    public final void Dxx(C263754Nf r2) {
        C62320sa r0 = (C62320sa) this.A00.A07.getValue();
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C51967G9n.A14(this.A00.A09, ((float) i) / ((float) i2));
    }

    public final void onVideoPlayerError(C263754Nf r2, String str) {
        C62320sa r0 = (C62320sa) this.A00.A06.getValue();
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void onVideoStartedPlaying(C263754Nf r4) {
        AnonymousClass6D9 r2 = this.A00;
        C51967G9n.A16(r2.A04, true);
        C62320sa r0 = (C62320sa) r2.A08.getValue();
        if (r0 != null) {
            r0.invoke();
        }
    }
}
