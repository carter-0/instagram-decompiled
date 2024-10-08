package X;

/* renamed from: X.Ahx  reason: case insensitive filesystem */
public final class C40723Ahx implements Comparable {
    public final int A00;
    public final byte[] A01;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C40723Ahx ahx = (C40723Ahx) obj;
        0qQ.A0B(ahx, 0);
        return this.A00 - ahx.A00;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C40723Ahx) || this.A00 != ((C40723Ahx) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C40723Ahx(byte[] bArr, long j) {
        this.A01 = bArr;
        this.A00 = (int) j;
    }
}
