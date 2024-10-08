package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5ln  reason: invalid class name and case insensitive filesystem */
public final class C294065ln extends AnonymousClass0T0 implements C294075lo {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C294065ln(int i, String str, String str2, int i2) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i2;
    }

    public final C294065ln FEn() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C294065ln) {
                C294065ln r5 = (C294065ln) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelCoverMediaImageVersionClientDict", C44882CmY.A00(this));
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getScansProfile() {
        return this.A02;
    }

    public final String getUrl() {
        return this.A03;
    }

    public final int getWidth() {
        return this.A01;
    }
}
