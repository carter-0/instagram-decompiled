package X;

/* renamed from: X.6nL  reason: invalid class name and case insensitive filesystem */
public final class C317486nL {
    public static final 0l2 A03 = new 0l2(5);
    public static final C336957fS A04 = new Object();
    public int A00;
    public final String A01;
    public final String A02;

    public C317486nL(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C317486nL) || !0qQ.A0K(this.A02, ((C317486nL) obj).A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C317486nL(String str, int i) {
        this(C336957fS.A02(str), str);
        0qQ.A0B(str, 1);
        this.A00 = i;
    }
}
