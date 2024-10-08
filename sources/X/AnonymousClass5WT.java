package X;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5WT  reason: invalid class name */
public final class AnonymousClass5WT extends C267794cD implements C267954cW, C267814cG, AnonymousClass5VH, C267824cH {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public long A04 = 9205357640488583168L;
    public View A05;
    public JNN A06;
    public JS1 A07;
    public C270284gU A08;
    public C268024cd A09;
    public 0sP A0A;
    public 0sP A0B;
    public C249513ju A0C;
    public boolean A0D;
    public boolean A0E;
    public C289005cr A0F;
    public final C284945Oz A0G;

    public final /* synthetic */ void DPk() {
    }

    public final void DUu() {
        AnonymousClass6GW.A00(this, new AnonymousClass9L8(this, 6));
    }

    private final void A00() {
        C268024cd r5;
        JNN jnn = this.A06;
        if (jnn != null && (r5 = this.A09) != null) {
            Magnifier magnifier = ((C56830IEb) jnn).A00;
            long A002 = C289155d7.A00(magnifier.getWidth(), magnifier.getHeight());
            C289005cr r0 = this.A0F;
            if (r0 == null || A002 != r0.A00) {
                0sP r4 = this.A0A;
                if (r4 != null) {
                    Magnifier magnifier2 = ((C56830IEb) jnn).A00;
                    r4.invoke(new C56052Hs1(r5.Ezx(C289155d7.A01(C289155d7.A00(magnifier2.getWidth(), magnifier2.getHeight())))));
                }
                Magnifier magnifier3 = ((C56830IEb) jnn).A00;
                this.A0F = new C289005cr(C289155d7.A00(magnifier3.getWidth(), magnifier3.getHeight()));
            }
        }
    }

    public static final void A01(AnonymousClass5WT r10) {
        JNN jnn = r10.A06;
        if (jnn != null) {
            ((C56830IEb) jnn).A00.dismiss();
        }
        View view = r10.A05;
        if (view == null) {
            view = HRY.A00(r10);
        }
        r10.A05 = view;
        C268024cd r2 = r10.A09;
        if (r2 == null) {
            r2 = AnonymousClass5WH.A02(r10).A0C;
        }
        r10.A09 = r2;
        JS1 js1 = r10.A07;
        boolean z = r10.A0E;
        long j = r10.A03;
        r10.A06 = js1.ALP(view, r2, r10.A00, r10.A01, r10.A02, j, z, r10.A0D);
        r10.A00();
    }

    public static final void A02(AnonymousClass5WT r6) {
        C268024cd r1 = r6.A09;
        if (r1 == null) {
            r1 = AnonymousClass5WH.A02(r6).A0C;
            r6.A09 = r1;
        }
        long j = ((C289295dM) r6.A0B.invoke(r1)).A00;
        if (C289325dP.A02(j)) {
            C270284gU r0 = r6.A08;
            if (r0 == null) {
                r0 = new AnonymousClass5TX((C284895Os) null, new C58682Ivr(r6, 3));
                r6.A08 = r0;
            }
            if (C289325dP.A02(((C289295dM) r0.getValue()).A00)) {
                C270284gU r02 = r6.A08;
                if (r02 == null) {
                    r02 = new AnonymousClass5TX((C284895Os) null, new C58682Ivr(r6, 3));
                    r6.A08 = r02;
                }
                r6.A04 = C289295dM.A07(((C289295dM) r02.getValue()).A00, j);
                if (r6.A06 == null) {
                    A01(r6);
                }
                JNN jnn = r6.A06;
                if (jnn != null) {
                    jnn.FJW(r6.A02, r6.A04, 9205357640488583168L);
                }
                r6.A00();
                return;
            }
        }
        r6.A04 = 9205357640488583168L;
        JNN jnn2 = r6.A06;
        if (jnn2 != null) {
            ((C56830IEb) jnn2).A00.dismiss();
        }
    }

    public final void A0F() {
        JNN jnn = this.A06;
        if (jnn != null) {
            ((C56830IEb) jnn).A00.dismiss();
        }
        this.A06 = null;
    }

    public final void AC5(AnonymousClass5SW r4) {
        r4.ENH(C55290HfJ.A00, new AnonymousClass9L8(this, 5));
    }

    public final /* synthetic */ boolean Bu0() {
        return false;
    }

    public final /* synthetic */ boolean BuF() {
        return false;
    }

    public final void DIA(C268064ch r2) {
        this.A0G.Epw(r2);
    }

    public AnonymousClass5WT(JS1 js1, 0sP r5, 0sP r6, float f, float f2, float f3, long j, boolean z, boolean z2) {
        this.A0B = r5;
        this.A0A = r6;
        this.A02 = f;
        this.A0E = z;
        this.A03 = j;
        this.A00 = f2;
        this.A01 = f3;
        this.A0D = z2;
        this.A07 = js1;
        C305206Gy r2 = C305206Gy.A00;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A0G = new ParcelableSnapshotMutableState(r2, (Object) null);
    }

    public final void A0E() {
        DUu();
        Integer num = AnonymousClass05K.A00;
        this.A0C = new 1HR(0);
        C262224Cq A052 = A05();
        1Eo.A03(num, 19B.A00, new C376889Js(this, (AnonymousClass4D7) null, 1), A052);
    }

    public final void AQM(AnonymousClass5Q4 r3) {
        r3.AQW();
        C249513ju r1 = this.A0C;
        if (r1 != null) {
            r1.FIG(C60340gF.A00);
        }
    }
}
