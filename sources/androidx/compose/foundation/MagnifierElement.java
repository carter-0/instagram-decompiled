package androidx.compose.foundation;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass5WH;
import X.AnonymousClass5WT;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C267794cD;
import X.C268024cd;
import X.C289095d0;
import X.C51972G9s;
import X.HRY;
import X.JS1;
import android.view.View;

public final class MagnifierElement extends AnonymousClass5QP {
    public final float A00 = Float.NaN;
    public final float A01 = Float.NaN;
    public final float A02 = Float.NaN;
    public final long A03 = 9205357640488583168L;
    public final JS1 A04;
    public final 0sP A05;
    public final 0sP A06;
    public final boolean A07 = true;
    public final boolean A08 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MagnifierElement) {
                MagnifierElement magnifierElement = (MagnifierElement) obj;
                if (!(this.A06 == magnifierElement.A06 && this.A02 == magnifierElement.A02 && this.A08 == magnifierElement.A08 && this.A03 == magnifierElement.A03 && C289095d0.A01(this.A00, magnifierElement.A00) && C289095d0.A01(this.A01, magnifierElement.A01) && this.A07 == magnifierElement.A07 && this.A05 == magnifierElement.A05 && 0qQ.A0K(this.A04, magnifierElement.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public MagnifierElement(JS1 js1, 0sP r6, 0sP r7) {
        this.A06 = r6;
        this.A05 = r7;
        this.A04 = js1;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        0sP r2 = this.A06;
        float f = this.A02;
        boolean z = this.A08;
        long j = this.A03;
        float f2 = this.A00;
        float f3 = this.A01;
        boolean z2 = this.A07;
        return new AnonymousClass5WT(this.A04, r2, this.A05, f, f2, f3, j, z, z2);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r23) {
        AnonymousClass5WT r10 = (AnonymousClass5WT) r23;
        0sP r2 = this.A06;
        float f = this.A02;
        boolean z = this.A08;
        long j = this.A03;
        float f2 = this.A00;
        float f3 = this.A01;
        boolean z2 = this.A07;
        0sP r1 = this.A05;
        JS1 js1 = this.A04;
        float f4 = r10.A02;
        long j2 = r10.A03;
        float f5 = r10.A00;
        boolean z3 = r10.A0E;
        float f6 = r10.A01;
        boolean z4 = r10.A0D;
        JS1 js12 = r10.A07;
        View view = r10.A05;
        C268024cd r3 = r10.A09;
        r10.A0B = r2;
        r10.A02 = f;
        r10.A0E = z;
        r10.A03 = j;
        r10.A00 = f2;
        r10.A01 = f3;
        r10.A0D = z2;
        r10.A0A = r1;
        r10.A07 = js1;
        View A002 = HRY.A00(r10);
        C268024cd r12 = AnonymousClass5WH.A02(r10).A0C;
        if (r10.A06 != null && (((!Float.isNaN(f) || !Float.isNaN(f4)) && f != f4 && !js1.Akr()) || j != j2 || !C289095d0.A01(f2, f5) || !C289095d0.A01(f3, f6) || z != z3 || z2 != z4 || !0qQ.A0K(js1, js12) || !0qQ.A0K(A002, view) || !0qQ.A0K(r12, r3))) {
            AnonymousClass5WT.A01(r10);
        }
        AnonymousClass5WT.A02(r10);
    }

    public final int hashCode() {
        int i = 0;
        int A09 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A00(AnonymousClass7TF.A00(C51972G9s.A07(this.A03, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A00(AnonymousClass7TE.A0K(this.A06) * 31, this.A02))), this.A00), this.A01));
        0sP r0 = this.A05;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return AnonymousClass7TE.A0N(this.A04, (A09 + i) * 31);
    }
}
