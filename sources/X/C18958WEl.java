package X;

import android.graphics.Rect;

/* renamed from: X.WEl  reason: case insensitive filesystem */
public final class C18958WEl implements AnonymousClass4W8 {
    public final C18546Vty A00;
    public final C18547Vtz A01;
    public final 2YF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj))) {
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
                C18958WEl wEl = (C18958WEl) obj;
                if (!0qQ.A0K(this.A02, wEl.A02) || !0qQ.A0K(this.A01, wEl.A01) || !0qQ.A0K(this.A00, wEl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Rect AhW() {
        2YF r0 = this.A02;
        return new Rect(r0.A01, r0.A03, r0.A02, r0.A00);
    }

    public final C18545Vtx BYt() {
        2YF r3 = this.A02;
        if (r3.A02 - r3.A01 > r3.A00 - r3.A03) {
            return C18545Vtx.A01;
        }
        return C18545Vtx.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HardwareFoldingFeature");
        sb.append(" { ");
        sb.append(this.A02);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(Pxd.A00(119));
        sb.append(this.A00);
        return AnonymousClass7TF.A0l(" }", sb);
    }

    public C18958WEl(2YF r4, C18546Vty vty, C18547Vtz vtz) {
        AnonymousClass7TG.A1Q(vtz, vty);
        this.A02 = r4;
        this.A01 = vtz;
        this.A00 = vty;
        int i = r4.A02;
        int i2 = r4.A01;
        if (i - i2 == 0 && r4.A00 - r4.A03 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        } else if (i2 != 0 && r4.A03 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }
}
