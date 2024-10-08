package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;

@Deprecated(message = "Use [BouncyIndication] on the Modifier.clickable directly.")
/* renamed from: X.5WL  reason: invalid class name */
public final class AnonymousClass5WL extends C267794cD implements C268434dO {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public C287605aT A04;
    public C62320sa A05;
    public C62320sa A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C262204Co A0B;
    public C262204Co A0C;
    public final AnonymousClass5b4 A0D = C287705ad.A00(1.0f);
    public final AnonymousClass5PZ A0E;
    public final 0sP A0F;

    public static final void A01(AnonymousClass5WL r4) {
        r4.A09 = false;
        r4.A0A = false;
        r4.A07 = false;
        r4.A08 = false;
        r4.A0E.EWt(1.0f);
        C262204Co r0 = r4.A0C;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        r4.A0C = null;
        if (r4.A08) {
            C262224Cq A052 = r4.A05();
            C376889Js r2 = new C376889Js(r4, (AnonymousClass4D7) null, 17);
            r4.A0C = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A052);
        }
    }

    public static final void A02(AnonymousClass5WL r7) {
        boolean z;
        float f;
        AnonymousClass5WL r3 = r7;
        if (r7.A09 || r7.A07 || r7.A08) {
            z = true;
            f = r3.A02;
        } else {
            z = false;
            f = 1.0f;
        }
        AnonymousClass5b4 r1 = r3.A0D;
        if (((Number) r1.A09.getValue()).floatValue() != f) {
            C262224Cq A052 = r3.A05();
            r3.A0B = 1Eo.A04(19B.A00, new C58085Ilb(r3, (AnonymousClass4D7) null, f, 1, z), A052);
        } else if (!((Boolean) r1.A08.getValue()).booleanValue()) {
            A00(r3);
        }
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
        return r7.Cfi(0Yt.A0E(), new C377469Ly(46, (Object) this, (Object) Cnz), i, i2);
    }

    public final /* synthetic */ int CoQ(C268084cj r2, C268014cc r3, int i) {
        return GR6.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int CoT(C268084cj r2, C268014cc r3, int i) {
        return GR6.A03(r2, r3, this, i);
    }

    public static final void A00(AnonymousClass5WL r2) {
        C62320sa r0;
        if (r2.A07) {
            r2.A07 = false;
            A02(r2);
            r0 = r2.A05;
        } else if (r2.A08) {
            r2.A08 = false;
            A02(r2);
            r0 = r2.A06;
            if (r0 == null) {
                return;
            }
        } else {
            return;
        }
        r0.invoke();
    }

    public final void A0F() {
        C262204Co r0 = this.A0B;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A0B = null;
        C262204Co r02 = this.A0C;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A0C = null;
    }

    public AnonymousClass5WL(C287605aT r3, C62320sa r4, C62320sa r5, float f, float f2, float f3, float f4) {
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A04 = r3;
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A0E = new ParcelableSnapshotMutableFloatState(1.0f);
        this.A0F = new AnonymousClass9LG(this, 17);
    }

    public final void A0E() {
        A01(this);
    }
}
