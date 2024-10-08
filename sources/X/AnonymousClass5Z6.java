package X;

/* renamed from: X.5Z6  reason: invalid class name */
public final class AnonymousClass5Z6 {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass5Z6) || j != ((AnonymousClass5Z6) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.A00;
        if (j == 0) {
            return "Unspecified";
        }
        if (j == 4294967296L) {
            return "Sp";
        }
        if (j == 8589934592L) {
            return "Em";
        }
        return "Invalid";
    }

    public /* synthetic */ AnonymousClass5Z6(long j) {
        this.A00 = j;
    }
}
