package androidx.compose.foundation.layout;

import X.0sP;
import X.AnonymousClass5QP;
import X.C267794cD;
import X.C51968G9o;
import X.C52892GeS;
import X.DbS;

public final class IntrinsicWidthElement extends AnonymousClass5QP {
    public final Integer A00;
    public final boolean A01 = true;
    public final 0sP A02;

    public IntrinsicWidthElement(Integer num, 0sP r3) {
        this.A00 = num;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        return intrinsicWidthElement != null && this.A00 == intrinsicWidthElement.A00 && this.A01 == intrinsicWidthElement.A01;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.GeS, X.4cD] */
    public final /* bridge */ /* synthetic */ C267794cD A00() {
        Integer num = this.A00;
        boolean z = this.A01;
        ? r0 = new C267794cD();
        r0.A00 = num;
        r0.A01 = z;
        return r0;
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r2) {
        C52892GeS geS = (C52892GeS) r2;
        geS.A00 = this.A00;
        geS.A01 = this.A01;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "Min";
        } else {
            str = "Max";
        }
        return DbS.A06(this.A01, C51968G9o.A0F(str, intValue));
    }
}
