package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.47h  reason: invalid class name and case insensitive filesystem */
public final class C2608547h extends AnonymousClass0T0 implements C2608647i {
    public final int A00;
    public final String A01;

    public C2608547h(int i, String str) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public final C2608547h F9B() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2608547h) {
                C2608547h r5 = (C2608547h) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public final int C2D() {
        return this.A00;
    }

    public final String C2E() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextSubitem", B7K.A00(this));
    }
}
