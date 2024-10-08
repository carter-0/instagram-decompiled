package androidx.compose.foundation.lazy.layout;

import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass6Gj;
import X.C305246Hc;
import X.C62320sa;

public final class LazyLayoutSemanticsModifier extends AnonymousClass5QP {
    public final AnonymousClass6Gj A00;
    public final C305246Hc A01;
    public final C62320sa A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LazyLayoutSemanticsModifier) {
                LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
                if (!(this.A02 == lazyLayoutSemanticsModifier.A02 && 0qQ.A0K(this.A01, lazyLayoutSemanticsModifier.A01) && this.A00 == lazyLayoutSemanticsModifier.A00 && this.A04 == lazyLayoutSemanticsModifier.A04 && this.A03 == lazyLayoutSemanticsModifier.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public LazyLayoutSemanticsModifier(AnonymousClass6Gj r1, C305246Hc r2, C62320sa r3, boolean z, boolean z2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = z2;
    }
}
