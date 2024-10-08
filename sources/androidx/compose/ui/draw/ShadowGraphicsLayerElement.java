package androidx.compose.ui.draw;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5RW;
import X.AnonymousClass5S2;
import X.AnonymousClass5WH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C268054cg;
import X.C268424dN;
import X.C273654mx;
import X.C289095d0;
import X.G9w;
import X.J6M;

public final class ShadowGraphicsLayerElement extends AnonymousClass5QP {
    public final float A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass5S2 A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShadowGraphicsLayerElement) {
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
                if (C289095d0.A01(this.A00, shadowGraphicsLayerElement.A00) && 0qQ.A0K(this.A03, shadowGraphicsLayerElement.A03) && this.A04 == shadowGraphicsLayerElement.A04) {
                    long j = this.A01;
                    long j2 = shadowGraphicsLayerElement.A01;
                    long j3 = AnonymousClass5RW.A01;
                    if (!(j == j2 && this.A02 == shadowGraphicsLayerElement.A02)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4cD, X.4dN] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        J6M A002 = J6M.A00(this, 26);
        ? r0 = new C267794cD();
        r0.A00 = A002;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r4) {
        C268424dN r42 = (C268424dN) r4;
        r42.A00 = J6M.A00(this, 26);
        C268054cg r2 = AnonymousClass5WH.A04(r42, 2).A06;
        if (r2 != null) {
            r2.A0o(r42.A00, true);
        }
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A03, G9w.A00(this.A00)));
        long j = this.A01;
        long j2 = AnonymousClass5RW.A01;
        int A012 = AnonymousClass7TF.A01(j, A09);
        long j3 = this.A02;
        return A012 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public ShadowGraphicsLayerElement(AnonymousClass5S2 r1, float f, long j, long j2, boolean z) {
        this.A00 = f;
        this.A03 = r1;
        this.A04 = z;
        this.A01 = j;
        this.A02 = j2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ShadowGraphicsLayerElement(elevation=");
        A1A.append(C289095d0.A00(this.A00));
        A1A.append(C273654mx.A00(452));
        A1A.append(this.A03);
        A1A.append(", clip=");
        A1A.append(this.A04);
        A1A.append(", ambientColor=");
        A1A.append(AnonymousClass5RW.A06(this.A01));
        A1A.append(", spotColor=");
        return AnonymousClass7TG.A0n(AnonymousClass5RW.A06(this.A02), A1A);
    }
}
