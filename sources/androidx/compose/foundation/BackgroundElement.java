package androidx.compose.foundation;

import X.0qQ;
import X.0sP;
import X.AnonymousClass5QP;
import X.AnonymousClass5RW;
import X.AnonymousClass5S2;
import X.C304786Ff;

public final class BackgroundElement extends AnonymousClass5QP {
    public final float A00 = 1.0f;
    public final long A01;
    public final C304786Ff A02;
    public final AnonymousClass5S2 A03;
    public final 0sP A04;

    public BackgroundElement(C304786Ff r2, AnonymousClass5S2 r3, 0sP r4, long j) {
        this.A01 = j;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null) {
            return false;
        }
        long j = this.A01;
        long j2 = backgroundElement.A01;
        long j3 = AnonymousClass5RW.A01;
        if (j != j2 || !0qQ.A0K(this.A02, backgroundElement.A02) || this.A00 != backgroundElement.A00 || !0qQ.A0K(this.A03, backgroundElement.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        long j = this.A01;
        long j2 = AnonymousClass5RW.A01;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        C304786Ff r0 = this.A02;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        return ((((i2 + i) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A03.hashCode();
    }
}
