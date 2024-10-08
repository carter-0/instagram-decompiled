package androidx.compose.ui.semantics;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass5SV;
import X.C286355Ve;

public final class AppendedSemanticsElement extends AnonymousClass5QP implements C286355Ve {
    public final 0sP A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppendedSemanticsElement) {
                AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
                if (this.A01 != appendedSemanticsElement.A01 || !0qQ.A0K(this.A00, appendedSemanticsElement.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppendedSemanticsElement(mergeDescendants=");
        sb.append(this.A01);
        sb.append(", properties=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final AnonymousClass5SV BsC() {
        AnonymousClass5SV r1 = new AnonymousClass5SV();
        r1.A01 = this.A01;
        this.A00.invoke(r1);
        return r1;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00.hashCode();
    }

    public AppendedSemanticsElement(0sP r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }
}
