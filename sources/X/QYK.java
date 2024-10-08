package X;

public final class QYK extends S6F {
    public 19i A00;
    public String A01;
    public final 19i A02;

    public final 19i A03() {
        return this.A00;
    }

    public final 19i A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A01;
    }

    public final boolean A06() {
        Integer num = this.A01;
        if (num == AnonymousClass05K.A1F || num == AnonymousClass05K.A0j || num == AnonymousClass05K.A0u) {
            return true;
        }
        return false;
    }

    public QYK(19i r1, String str, String str2) {
        super(str);
        this.A02 = r1;
        this.A01 = str2;
    }

    public final String toString() {
        String obj;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{src_pkg=");
        A1A.append(this.A02);
        A1A.append(", phone_id=");
        19i r0 = this.A00;
        String str = null;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.toString();
        }
        A1A.append(obj);
        A1A.append(", status=");
        A1A.append(A02());
        A1A.append(", duration=");
        A1A.append(A00());
        A1A.append(", prev_phone_id=");
        19i r02 = this.A02;
        if (r02 != null) {
            str = r02.toString();
        }
        A1A.append(str);
        A1A.append(", sync_medium=");
        return C66584MXp.A0a(this.A01, A1A);
    }
}
