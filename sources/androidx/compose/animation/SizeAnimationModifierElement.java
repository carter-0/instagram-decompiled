package androidx.compose.animation;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5b8;
import androidx.compose.ui.Alignment;

public final class SizeAnimationModifierElement extends AnonymousClass5QP {
    public final AnonymousClass5b8 A00;
    public final Alignment A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SizeAnimationModifierElement) {
                SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
                if (!0qQ.A0K(this.A00, sizeAnimationModifierElement.A00) || !0qQ.A0K(this.A01, sizeAnimationModifierElement.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeAnimationModifierElement(animationSpec=");
        sb.append(this.A00);
        sb.append(", alignment=");
        sb.append(this.A01);
        sb.append(", finishedListener=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public SizeAnimationModifierElement(AnonymousClass5b8 r1, Alignment alignment) {
        this.A00 = r1;
        this.A01 = alignment;
    }
}
