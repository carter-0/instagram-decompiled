package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3iI  reason: invalid class name and case insensitive filesystem */
public final class C248623iI extends AnonymousClass0T0 implements C248643iK {
    public final int A00;
    public final String A01;

    public C248623iI(int i, String str) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public final C248623iI F1o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C248623iI) {
                C248623iI r5 = (C248623iI) obj;
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

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTextColor", C41862B4g.A00(this));
    }

    public final int getCount() {
        return this.A00;
    }

    public final String getHexRgbaColor() {
        return this.A01;
    }
}
