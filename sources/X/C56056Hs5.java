package X;

/* renamed from: X.Hs5  reason: case insensitive filesystem */
public final class C56056Hs5 {
    public final int value;

    public final int hashCode() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        int i = this.value;
        if (!(obj instanceof C56056Hs5) || i != ((C56056Hs5) obj).value) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.value;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return AnonymousClass000.A00(2498);
        }
        if (i == 2) {
            return "Hardware";
        }
        if (i == -1) {
            return "Auto";
        }
        return "Unknown";
    }

    public /* synthetic */ C56056Hs5(int i) {
        this.value = i;
    }
}
