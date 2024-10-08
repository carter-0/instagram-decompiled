package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3On  reason: invalid class name and case insensitive filesystem */
public final class C241263On extends AnonymousClass0T0 implements C241273Oo {
    public final int A00;
    public final int A01;
    public final String A02;

    public C241263On(int i, String str, int i2) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public final C241263On F8o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C241263On) {
                C241263On r5 = (C241263On) obj;
                if (!(this.A00 == r5.A00 && 0qQ.A0K(this.A02, r5.A02) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSUCustomProfilePicDict", C44328CdA.A00(this));
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A01;
    }
}
