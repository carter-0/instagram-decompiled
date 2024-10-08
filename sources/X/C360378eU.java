package X;

/* renamed from: X.8eU  reason: invalid class name and case insensitive filesystem */
public final class C360378eU implements Comparable {
    public final short A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0qQ.A00(this.A00 & 65535, ((C360378eU) obj).A00 & 65535);
    }

    public final boolean equals(Object obj) {
        short s = this.A00;
        if (!(obj instanceof C360378eU) || s != ((C360378eU) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return String.valueOf(this.A00 & 65535);
    }

    public /* synthetic */ C360378eU(short s) {
        this.A00 = s;
    }
}
