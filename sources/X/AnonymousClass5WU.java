package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Constraints;
import java.util.concurrent.CancellationException;

/* renamed from: X.5WU  reason: invalid class name */
public final class AnonymousClass5WU extends C267794cD implements C268434dO, AnonymousClass5VE, C267814cG {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C262204Co A04;
    public final AnonymousClass5b4 A05;
    public final C289495dh A06 = new ParcelableSnapshotMutableIntState(0);
    public final C289495dh A07 = new ParcelableSnapshotMutableIntState(0);
    public final C284945Oz A08;
    public final C284945Oz A09;
    public final C284945Oz A0A;
    public final C270284gU A0B;

    public final int CoT(C268084cj r2, C268014cc r3, int i) {
        return 0;
    }

    public final /* synthetic */ void DPk() {
    }

    public static final float A00(AnonymousClass5WU r4) {
        float signum = Math.signum(r4.A00);
        int ordinal = AnonymousClass5WH.A02(r4).A0D.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = -1;
            } else {
                throw new RuntimeException();
            }
        }
        return signum * ((float) i);
    }

    public static final void A01(AnonymousClass5WU r5) {
        C262204Co r4 = r5.A04;
        if (r4 != null) {
            r4.AG7((CancellationException) null);
        }
        if (r5.A08) {
            C262224Cq A052 = r5.A05();
            AnonymousClass9K3 r2 = new AnonymousClass9K3((Object) r5, (Object) r4, (AnonymousClass4D7) null, 4);
            r5.A04 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A052);
        }
    }

    public final void A0F() {
        C262204Co r1 = this.A04;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        this.A04 = null;
    }

    public final void AQM(AnonymousClass5Q4 r16) {
        C289495dh r0;
        C270284gU r3;
        int intValue;
        int intValue2;
        AnonymousClass5QF r9;
        C284945Oz r32 = this.A05.A04.A05;
        float floatValue = ((Number) r32.getValue()).floatValue() * A00(this);
        int i = (A00(this) > 1.0f ? 1 : (A00(this) == 1.0f ? 0 : -1));
        float floatValue2 = ((Number) r32.getValue()).floatValue();
        if (i == 0) {
            r0 = this.A07;
        } else {
            r0 = this.A06;
        }
        boolean z = false;
        if (floatValue2 < ((float) r0.BI6())) {
            z = true;
        }
        int i2 = (A00(this) > 1.0f ? 1 : (A00(this) == 1.0f ? 0 : -1));
        float floatValue3 = ((Number) r32.getValue()).floatValue();
        if (i2 == 0) {
            int BI6 = this.A07.BI6();
            r3 = this.A0B;
            intValue = (BI6 + ((Number) r3.getValue()).intValue()) - this.A06.BI6();
        } else {
            r3 = this.A0B;
            intValue = ((Number) r3.getValue()).intValue();
        }
        boolean z2 = false;
        if (floatValue3 > ((float) intValue)) {
            z2 = true;
        }
        int i3 = (A00(this) > 1.0f ? 1 : (A00(this) == 1.0f ? 0 : -1));
        int BI62 = this.A07.BI6();
        if (i3 == 0) {
            intValue2 = BI62 + ((Number) r3.getValue()).intValue();
        } else {
            intValue2 = (-BI62) - ((Number) r3.getValue()).intValue();
        }
        float f = (float) intValue2;
        float BI63 = floatValue + ((float) this.A06.BI6());
        float A002 = C288025bF.A00(r16.Bwg());
        AnonymousClass5QD Ayw = r16.Ayw();
        AnonymousClass5QC r33 = (AnonymousClass5QC) Ayw;
        AnonymousClass5QB r6 = r33.A02.A02;
        long j = r6.A00;
        r6.A01.EJt();
        try {
            r9 = r33.A01;
            r9.AHx(1, floatValue, 0.0f, BI63, A002);
            if (z) {
                r16.AQW();
            }
            if (z2) {
                r9.FHv(f, 0.0f);
                r16.AQW();
                r9.FHv(-f, -0.0f);
            }
            r6.A01.EIm();
            Ayw.ElR(j);
        } catch (Throwable th) {
            r6.A01.EIm();
            Ayw.ElR(j);
            throw th;
        }
    }

    public AnonymousClass5WU(JRQ jrq, float f, int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
        AnonymousClass0eM r0 = C284905Ot.A01;
        C284885Or r3 = C284885Or.A00;
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A09 = new ParcelableSnapshotMutableState(r3, false);
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A0A = new ParcelableSnapshotMutableState(r3, jrq);
        Object obj = new Object();
        0qQ.A0C(r3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A08 = new ParcelableSnapshotMutableState(r3, obj);
        this.A05 = C287705ad.A00(0.0f);
        this.A0B = new AnonymousClass5TX((C284895Os) null, new AnonymousClass9M0(1, jrq, this));
    }

    public final void A0E() {
        A01(this);
    }

    public final int CmX(C268084cj r2, C268014cc r3, int i) {
        return r2.CmV(Integer.MAX_VALUE);
    }

    public final int Cma(C268084cj r2, C268014cc r3, int i) {
        return r2.CmY(i);
    }

    public final C289145d6 Cny(C268074ci r6, C268004cb r7, long j) {
        C267974cY Cnz = r6.Cnz(Constraints.A04(Constraints.A03(j), Integer.MAX_VALUE, Constraints.A02(j), Constraints.A00(j)));
        int A032 = AnonymousClass5SF.A03(j, Cnz.A01);
        C289495dh r2 = this.A06;
        r2.EZz(A032);
        this.A07.EZz(Cnz.A01);
        int BI6 = r2.BI6();
        int i = Cnz.A00;
        return r7.Cfi(0Yt.A0E(), new C377469Ly(2, (Object) this, (Object) Cnz), BI6, i);
    }

    public final int CoQ(C268084cj r2, C268014cc r3, int i) {
        return r2.CoO(Integer.MAX_VALUE);
    }

    public final void DGD(C288915ch r3) {
        this.A09.Epw(Boolean.valueOf(r3.BBB()));
    }
}
