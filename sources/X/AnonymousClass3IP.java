package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3IP  reason: invalid class name */
public final class AnonymousClass3IP extends AnonymousClass0T0 implements AnonymousClass3IQ {
    public final Integer A00;
    public final String A01;
    public final List A02;

    public final AnonymousClass3IP FC9(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IP) {
                AnonymousClass3IP r5 = (AnonymousClass3IP) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final Integer BdP() {
        return this.A00;
    }

    public final List C2y() {
        return this.A02;
    }

    public final String C30() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSuperlativesResponse", C44489Cfl.A00(this));
    }

    public AnonymousClass3IP(Integer num, String str, List list) {
        this.A00 = num;
        this.A02 = list;
        this.A01 = str;
    }

    public final AnonymousClass3IQ E9K(1E9 r1) {
        return this;
    }
}
