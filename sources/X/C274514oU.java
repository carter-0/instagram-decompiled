package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4oU  reason: invalid class name and case insensitive filesystem */
public final class C274514oU extends AnonymousClass0T0 implements C274524oV {
    public final C274504oT A00;
    public final C274504oT A01;

    public final C274514oU FCJ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274514oU) {
                C274514oU r5 = (C274514oU) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C274504oT r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C274504oT r02 = this.A01;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return hashCode + i;
    }

    public final C274504oT BHs() {
        return this.A00;
    }

    public final C274504oT CBW() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTIFUDestination", HU4.A00(this));
    }

    public C274514oU(C274504oT r1, C274504oT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
