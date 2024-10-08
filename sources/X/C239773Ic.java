package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3Ic  reason: invalid class name and case insensitive filesystem */
public final class C239773Ic extends AnonymousClass0T0 implements C239783Id {
    public final Integer A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public final C239773Ic F1N(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239773Ic) {
                C239773Ic r5 = (C239773Ic) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.A02;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list3 = this.A03;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 + i;
    }

    public final List BG8() {
        return this.A01;
    }

    public final List BPh() {
        return this.A02;
    }

    public final Integer CDj() {
        return this.A00;
    }

    public final List CE3() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientHints", CVU.A00(this));
    }

    public C239773Ic(Integer num, List list, List list2, List list3) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = num;
        this.A03 = list3;
    }
}
