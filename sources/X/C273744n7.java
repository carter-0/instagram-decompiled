package X;

/* renamed from: X.4n7  reason: invalid class name and case insensitive filesystem */
public final class C273744n7 extends AnonymousClass0T0 implements AnonymousClass3QI {
    public int A00 = 0;
    public String A01 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C273744n7) {
                C273744n7 r5 = (C273744n7) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A00;
    }

    public final int AzN() {
        return this.A00;
    }
}
