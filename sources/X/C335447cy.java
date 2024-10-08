package X;

import java.util.List;

/* renamed from: X.7cy  reason: invalid class name and case insensitive filesystem */
public final class C335447cy extends AnonymousClass0T0 implements C334087ae {
    public final int A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335447cy) {
                C335447cy r5 = (C335447cy) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public C335447cy(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}
