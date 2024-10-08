package X;

public final class HIO extends HQ3 {
    public final String A00;
    public final C62320sa A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HIO) {
                HIO hio = (HIO) obj;
                if (!0qQ.A0K(this.A00, hio.A00) || !0qQ.A0K(this.A01, hio.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public HIO(String str, C62320sa r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SnackBarError(message=");
        A1A.append(this.A00);
        A1A.append(", retryFunction=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public HIO() {
        this((String) null, (C62320sa) null);
    }
}
