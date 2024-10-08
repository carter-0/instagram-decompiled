package X;

import java.util.ArrayList;

/* renamed from: X.5ht  reason: invalid class name and case insensitive filesystem */
public final class C291795ht {
    public static final C291795ht A01 = new C291795ht(2);
    public static final C291795ht A02 = new C291795ht(0);
    public static final C291795ht A03 = new C291795ht(1);
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C291795ht) && this.A00 == ((C291795ht) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb;
        int i = this.A00;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            sb.append("TextDecoration.");
            sb.append((String) arrayList.get(0));
        } else {
            sb = new StringBuilder();
            sb.append("TextDecoration[");
            sb.append(C290155eq.A00(", ", arrayList));
            sb.append(']');
        }
        return sb.toString();
    }

    public C291795ht(int i) {
        this.A00 = i;
    }
}
