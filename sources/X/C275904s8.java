package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4s8  reason: invalid class name and case insensitive filesystem */
public final class C275904s8 extends AnonymousClass0T0 implements C275914s9 {
    public final C275894s7 A00;
    public final C275894s7 A01;
    public final boolean A02;

    public C275904s8(C275894s7 r2, C275894s7 r3, boolean z) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = z;
    }

    public final C275904s8 F7k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C275904s8) {
                C275904s8 r5 = (C275904s8) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C275894s7 CZQ() {
        return this.A00;
    }

    public final C275894s7 CZR() {
        return this.A01;
    }

    public final boolean CZT() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProactiveWarningsEventInfo", C48345Ed2.A00(this));
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode + i;
    }
}
