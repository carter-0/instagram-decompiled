package X;

/* renamed from: X.7PG  reason: invalid class name */
public final class AnonymousClass7PG extends AnonymousClass0T0 {
    public final N49 A00;
    public final AnonymousClass7PF A01;
    public final Boolean A02;
    public final String A03;
    public final boolean A04;

    public static final AnonymousClass7PG A00(N49 n49, AnonymousClass7PF r2, Boolean bool, String str, boolean z) {
        0qQ.A0B(r2, 0);
        return new AnonymousClass7PG(n49, r2, bool, str, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7PG) {
                AnonymousClass7PG r5 = (AnonymousClass7PG) obj;
                if (this.A01 != r5.A01 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A01.hashCode() * 31;
        N49 n49 = this.A00;
        int i = 0;
        if (n49 == null) {
            hashCode = 0;
        } else {
            hashCode = n49.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.A03;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.A02;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i4 = (i3 + i) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public AnonymousClass7PG(N49 n49, AnonymousClass7PF r2, Boolean bool, String str, boolean z) {
        this.A01 = r2;
        this.A00 = n49;
        this.A03 = str;
        this.A02 = bool;
        this.A04 = z;
    }

    public AnonymousClass7PG() {
        this((N49) null, AnonymousClass7PF.NONE, false, (String) null, false);
    }
}
