package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vg  reason: invalid class name and case insensitive filesystem */
public final class C277754vg extends AnonymousClass0T0 implements C277764vh {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final C277754vg F4R() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C277754vg) {
                C277754vg r5 = (C277754vg) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean Aba() {
        return this.A00;
    }

    public final boolean CPh() {
        return this.A01;
    }

    public final boolean CUl() {
        return this.A02;
    }

    public final boolean CUm() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveCommentInteractions", CZ4.A00(this));
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
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A03) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    public C277754vg(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
    }
}
