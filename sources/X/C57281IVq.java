package X;

import java.util.UUID;

/* renamed from: X.IVq  reason: case insensitive filesystem */
public final class C57281IVq implements JSs {
    public final long A00;
    public final C269894fr A01;
    public final 1Xj A02;
    public final int A03;
    public final String A04;

    public final C67241sS BJP() {
        return null;
    }

    public final String C9L() {
        return "";
    }

    public final Integer CEl() {
        return null;
    }

    public final 1UQ B5J() {
        return 1UQ.A08;
    }

    public final Integer B9V() {
        return Integer.valueOf(this.A03);
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0Y;
    }

    public final String getId() {
        byte[] bytes = this.A04.getBytes(AnonymousClass15Q.A05);
        0qQ.A07(bytes);
        return DbT.A10(UUID.nameUUIDFromBytes(bytes));
    }

    public C57281IVq(C269894fr r1, 1Xj r2, String str, int i, long j) {
        this.A04 = str;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = i;
        this.A00 = j;
    }
}
