package X;

import java.util.ArrayList;
import java.util.List;

public final class S6D {
    public List A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S6D) {
            S6D s6d = (S6D) obj;
            if (this.A03 == s6d.A03 && 0qQ.A0K(this.A02, s6d.A02) && 0qQ.A0K(this.A00, s6d.A00)) {
                String str = this.A01;
                boolean A0k = 00p.A0k(str, "index_", false);
                String str2 = s6d.A01;
                if (A0k) {
                    return 00p.A0k(str2, "index_", false);
                }
                return 0qQ.A0K(str, str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        if (00p.A0k(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, ((hashCode * 31) + (this.A03 ? 1 : 0)) * 31));
    }

    public S6D(String str, List list, List list2, boolean z) {
        C51972G9s.A1D(list, list2);
        this.A01 = str;
        this.A03 = z;
        this.A02 = list;
        this.A00 = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList A0v = DbS.A0v(size);
            for (int i = 0; i < size; i++) {
                A0v.add("ASC");
            }
            arrayList = A0v;
        }
        this.A00 = arrayList;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Index{name='");
        A1A.append(this.A01);
        A1A.append("', unique=");
        A1A.append(this.A03);
        A1A.append(", columns=");
        A1A.append(this.A02);
        A1A.append(", orders=");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l("'}", A1A);
    }
}
