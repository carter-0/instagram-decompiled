package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vB  reason: invalid class name and case insensitive filesystem */
public final class C277444vB extends AnonymousClass0T0 implements C277454vC {
    public final int A00;
    public final int A01;

    public final C277444vB F5A() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C277444vB) {
                C277444vB r5 = (C277444vB) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIgLiveDimensions", CZY.A00(this));
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public C277444vB(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
