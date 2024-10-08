package androidx.compose.foundation.layout;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.C304836Fk;

public final class PaddingValuesElement extends AnonymousClass5QP {
    public final C304836Fk A00;
    public final 0sP A01;

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (!(obj instanceof PaddingValuesElement) || (paddingValuesElement = (PaddingValuesElement) obj) == null) {
            return false;
        }
        return 0qQ.A0K(this.A00, paddingValuesElement.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public PaddingValuesElement(C304836Fk r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
