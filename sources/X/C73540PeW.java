package X;

import java.util.concurrent.Executor;

/* renamed from: X.PeW  reason: case insensitive filesystem */
public final class C73540PeW implements C59628JQw {
    public 0sP A00 = new J6L(this, 31);
    public final C71025OZc A01;
    public final Object A02 = new Object();
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C73692PiF.A00);
    public final C62320sa A05 = new MJ2(this, 30);
    public final 0sP A06 = new J6L(this, 32);
    public final 0sP A07 = new J6L(this, 33);
    public final C59628JQw A08;

    public final void EUO(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final void A00(0sP r7) {
        int i;
        0fh.A01("RpStore.subscribe", -1484224524);
        try {
            synchronized (this.A02) {
                if (equals(OYW.A00)) {
                    C71004OWb.A00.A03("RpStore", "subscribe called on finalized RpStore. No updates will be provided.", (Throwable) null);
                    i = -439180902;
                } else {
                    AnonymousClass0eM r1 = this.A03;
                    C71759OqL oqL = new C71759OqL(this.A01, (N4A) B9B().invoke(), (Executor) r1.getValue());
                    r7.invoke(oqL);
                    ((Executor) r1.getValue()).execute(new C73165PY0(oqL, this));
                    i = 1286764586;
                }
            }
            0fh.A00(i);
        } catch (Throwable th) {
            0fh.A00(-864865470);
            throw th;
        }
    }

    public final 0sP Ay2() {
        return this.A00;
    }

    public final C62320sa B9B() {
        return this.A05;
    }

    public final 0sP Bm5() {
        return this.A06;
    }

    public final 0sP C2L() {
        return this.A07;
    }

    public C73540PeW(String str, C59628JQw jQw) {
        AnonymousClass7TG.A1O(str, jQw);
        this.A08 = jQw;
        0t0 A012 = AnonymousClass0eN.A01(TUK.A00);
        this.A03 = A012;
        this.A01 = new C71025OZc((Executor) A012.getValue());
    }
}
