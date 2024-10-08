package androidx.compose.foundation.layout;

import X.0qQ;
import X.0sL;
import X.AnonymousClass5QP;
import X.C54732HQn;
import X.XU6;

public final class WrapContentElement extends AnonymousClass5QP {
    public final Integer A00;
    public final 0sL A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                WrapContentElement wrapContentElement = (WrapContentElement) obj;
                if (this.A00 != wrapContentElement.A00 || !0qQ.A0K(this.A02, wrapContentElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((XU6.A00(this.A00) * 31) + C54732HQn.A00()) * 31) + this.A02.hashCode();
    }

    public WrapContentElement(Integer num, Object obj, 0sL r3) {
        this.A00 = num;
        this.A01 = r3;
        this.A02 = obj;
    }
}
