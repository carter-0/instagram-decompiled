package X;

/* renamed from: X.8eb  reason: invalid class name and case insensitive filesystem */
public final class C360448eb implements Comparable {
    public final byte A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0qQ.A00(this.A00 & 255, ((C360448eb) obj).A00 & 255);
    }

    public final boolean equals(Object obj) {
        byte b = this.A00;
        if (!(obj instanceof C360448eb) || b != ((C360448eb) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return String.valueOf(this.A00 & 255);
    }

    public /* synthetic */ C360448eb(byte b) {
        this.A00 = b;
    }
}
