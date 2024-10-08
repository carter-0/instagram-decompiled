package X;

/* renamed from: X.9Ej  reason: invalid class name and case insensitive filesystem */
public final class C375619Ej extends AnonymousClass0T0 implements C375639El {
    public final Boolean A00;
    public final String A01;

    public final C375619Ej F8X() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C375619Ej) {
                C375619Ej r5 = (C375619Ej) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final Boolean B1D() {
        return this.A00;
    }

    public C375619Ej(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}
