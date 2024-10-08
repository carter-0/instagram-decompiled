package X;

public final class ONH {
    public final Long A00;
    public final Long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONH) {
                ONH onh = (ONH) obj;
                if (!0qQ.A0K(this.A00, onh.A00) || !0qQ.A0K(this.A01, onh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public ONH(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BackupMetadata(creationTimeMillis=");
        A1A.append(this.A00);
        A1A.append(", lastSyncTimeMillis=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
