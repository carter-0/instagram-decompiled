package androidx.compose.ui.input.pointer;

import X.0qQ;
import X.0sL;
import X.AnonymousClass5QP;

public final class SuspendPointerInputElement extends AnonymousClass5QP {
    public final Object A00;
    public final Object A01;
    public final 0sL A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuspendPointerInputElement) {
            SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
            return 0qQ.A0K(this.A00, suspendPointerInputElement.A00) && 0qQ.A0K(this.A01, suspendPointerInputElement.A01) && this.A02 == suspendPointerInputElement.A02;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Object obj = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.A01;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        return ((i3 + i2) * 31 * 31) + this.A02.hashCode();
    }

    public SuspendPointerInputElement(Object obj, Object obj2, 0sL r3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = r3;
    }
}
