package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vj  reason: invalid class name and case insensitive filesystem */
public final class C277784vj extends AnonymousClass0T0 implements C277794vk {
    public final boolean A00;
    public final boolean A01;

    public final C277784vj F4S() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C277784vj) {
                C277784vj r5 = (C277784vj) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean Ayc() {
        return this.A00;
    }

    public final boolean CPf() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveCommentSubscription", C63018Kq8.A00(this));
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
        return i2 + i3;
    }

    public C277784vj(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
