package X;

import android.graphics.RenderEffect;

/* renamed from: X.Ger  reason: case insensitive filesystem */
public final class C52917Ger extends C54727HQg {
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52917Ger) {
                C52917Ger ger = (C52917Ger) obj;
                if (!(this.A00 == ger.A00 && this.A01 == ger.A01 && this.A02 == ger.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final RenderEffect A01() {
        return HRM.A00(this.A00, this.A01, this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01) + this.A02;
    }

    public C52917Ger(int i, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        G9w.A1X(A1A, "BlurEffect(renderEffect=");
        A1A.append(", radiusX=");
        A1A.append(this.A00);
        A1A.append(", radiusY=");
        A1A.append(this.A01);
        A1A.append(", edgeTreatment=");
        int i = this.A02;
        if (i == 0) {
            str = "Clamp";
        } else if (i == 1) {
            str = "Repeated";
        } else if (i == 2) {
            str = "Mirror";
        } else {
            str = "Decal";
        }
        return AnonymousClass7TG.A0n(str, A1A);
    }
}
