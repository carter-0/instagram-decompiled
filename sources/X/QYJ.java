package X;

public final class QYJ extends S6F {
    public C10552Ru6 A00;

    public final String toString() {
        Long valueOf;
        String str;
        String str2;
        C10552Ru6 ru6 = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("{src_pkg=");
        A1A.append(this.A02);
        A1A.append(", status=");
        A1A.append(A02());
        A1A.append(", duration=");
        A1A.append(A00());
        A1A.append(", creation_time=");
        if (ru6 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(ru6.A00);
        }
        A1A.append(valueOf);
        A1A.append(", generator_pkg=");
        if (ru6 == null) {
            str = null;
        } else {
            str = ru6.A02;
        }
        A1A.append(str);
        A1A.append(", generator_action=");
        if (ru6 == null) {
            str2 = null;
        } else {
            str2 = ru6.A01;
        }
        A1A.append(str2);
        A1A.append(", prev_generator_pkg=");
        A1A.append((String) null);
        A1A.append(", prev_generator_action=");
        return C66584MXp.A0a((String) null, A1A);
    }
}
