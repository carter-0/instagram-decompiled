package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3eC  reason: invalid class name and case insensitive filesystem */
public final class C246203eC extends AnonymousClass0T0 implements C246213eD {
    public final List A00;
    public final List A01;

    public final C246203eC F3E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246203eC) {
                C246203eC r5 = (C246203eC) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A00;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.A01;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final List BIO() {
        return this.A00;
    }

    public final List BWW() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFollowUpOptionsSet", C370568wg.A00(this));
    }

    public C246203eC(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
