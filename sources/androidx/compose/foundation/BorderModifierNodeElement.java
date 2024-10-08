package androidx.compose.foundation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5S2;
import X.C289095d0;
import X.C304786Ff;

public final class BorderModifierNodeElement extends AnonymousClass5QP {
    public final float A00;
    public final C304786Ff A01;
    public final AnonymousClass5S2 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BorderModifierNodeElement) {
                BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
                if (!C289095d0.A01(this.A00, borderModifierNodeElement.A00) || !0qQ.A0K(this.A01, borderModifierNodeElement.A01) || !0qQ.A0K(this.A02, borderModifierNodeElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BorderModifierNodeElement(width=");
        sb.append(C289095d0.A00(this.A00));
        sb.append(", brush=");
        sb.append(this.A01);
        sb.append(", shape=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public BorderModifierNodeElement(C304786Ff r1, AnonymousClass5S2 r2, float f) {
        this.A00 = f;
        this.A01 = r1;
        this.A02 = r2;
    }
}
