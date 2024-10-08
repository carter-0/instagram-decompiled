package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import java.util.concurrent.CancellationException;

/* renamed from: X.5WV  reason: invalid class name */
public final class AnonymousClass5WV extends C267944cV implements C268434dO, C268824e3 {
    public OG2 A00;
    public C262204Co A01;
    public final AnonymousClass5PZ A02;
    public final AnonymousClass5b4 A03 = C287705ad.A00(1.0f);

    public AnonymousClass5WV(OG2 og2) {
        0qQ.A0B(og2, 1);
        this.A00 = og2;
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A02 = new ParcelableSnapshotMutableFloatState(1.0f);
        C66167MGe mGe = new C66167MGe(this, (AnonymousClass4D7) null, 16);
        C304926Ft r02 = C304916Fs.A00;
        A0H(new AnonymousClass6FP((Object) null, (Object) null, mGe));
    }

    public final /* synthetic */ int CmX(C268084cj r2, C268014cc r3, int i) {
        return GR6.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int Cma(C268084cj r2, C268014cc r3, int i) {
        return GR6.A01(r2, r3, this, i);
    }

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r6, 1);
        C267974cY Cnz = r6.Cnz(j);
        int i = Cnz.A01;
        int i2 = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new C74185PqR(27, (Object) Cnz, (Object) this), i, i2);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return GR6.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return GR6.A03(r2, r3, this, i);
    }

    public static final Object A00(AnonymousClass5WV r6, AnonymousClass4D7 r7, float f) {
        AnonymousClass5b4 r3 = r6.A03;
        Float f2 = new Float(f);
        Object A04 = r3.A04(new C287965b7((Object) null, 0.5f, 200.0f), f2, r3.A02(), r7, new C74181PqN(r6, 37));
        if (A04 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A04;
    }

    public final void A0E() {
        this.A02.EWt(1.0f);
    }

    public final void A0F() {
        C262204Co r1 = this.A01;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        this.A01 = null;
    }
}
