package androidx.compose.ui.draw;

import X.0qQ;
import X.AnonymousClass2DO;
import X.AnonymousClass5QP;
import X.C288095bM;
import X.C288195bW;
import androidx.compose.ui.Alignment;

public final class PainterElement extends AnonymousClass5QP {
    public final float A00;
    public final Alignment A01;
    public final C288195bW A02;
    public final AnonymousClass2DO A03;
    public final C288095bM A04;
    public final boolean A05 = true;

    public PainterElement(Alignment alignment, C288195bW r3, AnonymousClass2DO r4, C288095bM r5, float f) {
        this.A03 = r4;
        this.A01 = alignment;
        this.A04 = r5;
        this.A00 = f;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PainterElement) {
                PainterElement painterElement = (PainterElement) obj;
                if (!0qQ.A0K(this.A03, painterElement.A03) || this.A05 != painterElement.A05 || !0qQ.A0K(this.A01, painterElement.A01) || !0qQ.A0K(this.A04, painterElement.A04) || Float.compare(this.A00, painterElement.A00) != 0 || !0qQ.A0K(this.A02, painterElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PainterElement(painter=");
        sb.append(this.A03);
        sb.append(", sizeToIntrinsics=");
        sb.append(this.A05);
        sb.append(", alignment=");
        sb.append(this.A01);
        sb.append(", contentScale=");
        sb.append(this.A04);
        sb.append(", alpha=");
        sb.append(this.A00);
        sb.append(", colorFilter=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A03.hashCode() * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int hashCode3 = (((((((hashCode2 + i) * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C288195bW r0 = this.A02;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        return hashCode3 + hashCode;
    }
}
