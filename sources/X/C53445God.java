package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.God  reason: case insensitive filesystem */
public final class C53445God extends AnonymousClass0T0 implements C274384oE {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final C53445God F3k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53445God) {
                C53445God god = (C53445God) obj;
                if (!(this.A01 == god.A01 && this.A02 == god.A02 && this.A00 == god.A00 && this.A03 == god.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean AkD() {
        return this.A01;
    }

    public final boolean Akn() {
        return this.A02;
    }

    public final int As4() {
        return this.A00;
    }

    public final boolean CZW() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHushInfo", C54797HTe.A00(this));
    }

    public final int hashCode() {
        int A05 = C51965G9l.A05(this.A01);
        return DbS.A06(this.A03, (AnonymousClass7TF.A09(this.A02, A05) + this.A00) * 31);
    }

    public C53445God(int i, boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = i;
        this.A03 = z3;
    }
}
