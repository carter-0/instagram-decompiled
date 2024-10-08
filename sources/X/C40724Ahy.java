package X;

/* renamed from: X.Ahy  reason: case insensitive filesystem */
public final class C40724Ahy implements Comparable {
    public final int A00;
    public final byte[] A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C40724Ahy ahy = (C40724Ahy) obj;
        0qQ.A0B(ahy, 0);
        return this.A00 - ahy.A00;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C40724Ahy) || this.A00 != ((C40724Ahy) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C40724Ahy(byte[] bArr, long j) {
        this.A01 = bArr;
        this.A00 = (int) j;
    }
}
