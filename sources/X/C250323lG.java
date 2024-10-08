package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3lG  reason: invalid class name and case insensitive filesystem */
public final class C250323lG extends AnonymousClass0T0 implements C250333lH {
    public final C250313lF A00;
    public final C255043tU A01;

    public final C250323lG F4E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250323lG) {
                C250323lG r5 = (C250323lG) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C250313lF r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C255043tU r02 = this.A01;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return hashCode + i;
    }

    public final C250313lF AiD() {
        return this.A00;
    }

    public final C255043tU Bbo() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGIABInfo", C41918B6t.A00(this));
    }

    public C250323lG(C250313lF r1, C255043tU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
