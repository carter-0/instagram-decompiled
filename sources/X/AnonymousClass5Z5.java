package X;

/* renamed from: X.5Z5  reason: invalid class name */
public final class AnonymousClass5Z5 {
    public static final long A01 = AnonymousClass5Z7.A00(Float.NaN, 0);
    public static final AnonymousClass5Z6[] A02 = {new AnonymousClass5Z6(0), new AnonymousClass5Z6(4294967296L), new AnonymousClass5Z6(8589934592L)};
    public final long A00;

    public static final long A01(long j) {
        return A02[(int) ((j & 1095216660480L) >>> 32)].A00;
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass5Z5) || j != ((AnonymousClass5Z5) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A02(this.A00);
    }

    public /* synthetic */ AnonymousClass5Z5(long j) {
        this.A00 = j;
    }

    public static String A02(long j) {
        StringBuilder sb;
        String str;
        long A012 = A01(j);
        if (A012 == 0) {
            return "Unspecified";
        }
        if (A012 == 4294967296L) {
            sb = new StringBuilder();
            sb.append(A00(j));
            str = ".sp";
        } else if (A012 != 8589934592L) {
            return "Invalid";
        } else {
            sb = new StringBuilder();
            sb.append(A00(j));
            str = ".em";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
