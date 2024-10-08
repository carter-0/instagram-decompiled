package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.7by  reason: invalid class name and case insensitive filesystem */
public final class C334847by extends AnonymousClass0T0 implements C334127ai {
    public final HMF A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final Set A04;

    public C334847by(HMF hmf, String str, List list, List list2, Set set) {
        0qQ.A0B(set, 1);
        this.A04 = set;
        this.A00 = hmf;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334847by) {
                C334847by r5 = (C334847by) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A00.hashCode()) * 31;
        List list = this.A03;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A02;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }
}
