package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3qd  reason: invalid class name and case insensitive filesystem */
public final class C253343qd extends AnonymousClass0T0 implements C253353qe {
    public final int A00;
    public final List A01;

    public C253343qd(List list, int i) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = i;
    }

    public final C253343qd F0C() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C253343qd) {
                C253343qd r5 = (C253343qd) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public final List B8h() {
        return this.A01;
    }

    public final int C8h() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTActiveStandaloneFundraisers", C41868B4m.A00(this));
    }
}
