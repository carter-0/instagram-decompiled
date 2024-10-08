package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3qs  reason: invalid class name and case insensitive filesystem */
public final class C253493qs extends AnonymousClass0T0 implements C253503qt {
    public final String A00;
    public final List A01;

    public C253493qs(List list, String str) {
        0qQ.A0B(list, 1);
        0qQ.A0B(str, 2);
        this.A01 = list;
        this.A00 = str;
    }

    public final C253493qs FCr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C253493qs) {
                C253493qs r5 = (C253493qs) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final List B1p() {
        return this.A01;
    }

    public final String Bjf() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextWithLinkedEntities", DcX.A00(this));
    }
}
