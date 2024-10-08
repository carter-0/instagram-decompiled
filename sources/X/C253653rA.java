package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3rA  reason: invalid class name and case insensitive filesystem */
public final class C253653rA extends AnonymousClass0T0 implements C253663rB {
    public final AnonymousClass5Bm A00;
    public final AnonymousClass4EU A01;

    public final C253653rA F2s() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C253653rA) {
                C253653rA r5 = (C253653rA) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass5Bm r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        AnonymousClass4EU r02 = this.A01;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return hashCode + i;
    }

    public final AnonymousClass5Bm BMy() {
        return this.A00;
    }

    public final AnonymousClass4EU BMz() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFBHardLinkInfo", C46408DeV.A00(this));
    }

    public C253653rA(AnonymousClass5Bm r1, AnonymousClass4EU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
