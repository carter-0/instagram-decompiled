package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3I1  reason: invalid class name */
public final class AnonymousClass3I1 extends AnonymousClass0T0 implements AnonymousClass3I2 {
    public final List A00;
    public final List A01;
    public final List A02;

    public final AnonymousClass3I1 FG3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I1) {
                AnonymousClass3I1 r5 = (AnonymousClass3I1) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
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
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A02;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public final List At0() {
        return this.A00;
    }

    public final List BNf() {
        return this.A01;
    }

    public final List BSa() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientInvalidationRules", B51.A00(this));
    }

    public AnonymousClass3I1(List list, List list2, List list3) {
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
    }
}
