package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vX  reason: invalid class name and case insensitive filesystem */
public final class C277664vX extends AnonymousClass0T0 implements C277674vY {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final C277664vX F4W() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C277664vX) {
                C277664vX r5 = (C277664vX) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean C4D() {
        return this.A00;
    }

    public final boolean C4E() {
        return this.A01;
    }

    public final boolean C4H() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveHaloCallControls", CZ6.A00(this));
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C277664vX(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
