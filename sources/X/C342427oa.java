package X;

/* renamed from: X.7oa  reason: invalid class name and case insensitive filesystem */
public final class C342427oa extends AnonymousClass0T0 implements C342437ob {
    public final C342447oc A00;
    public final String A01;

    public C342427oa(C342447oc r2, String str) {
        0qQ.A0B(str, 2);
        this.A00 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C342427oa) {
                C342427oa r5 = (C342427oa) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C342447oc r0 = this.A00;
        return ((r0 == null ? 0 : r0.hashCode()) * 31) + this.A01.hashCode();
    }
}
