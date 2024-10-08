package X;

import java.util.UUID;

/* renamed from: X.IVp  reason: case insensitive filesystem */
public final class C57280IVp implements JSs {
    public final C269904fs A00;
    public final 1Xj A01;
    public final int A02;
    public final String A03;

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
        return 1UQ.A07;
    }

    public final Integer B9V() {
        return Integer.valueOf(this.A02);
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0Y;
    }

    public final String getId() {
        byte[] bytes = this.A03.getBytes(AnonymousClass15Q.A05);
        0qQ.A07(bytes);
        return DbT.A10(UUID.nameUUIDFromBytes(bytes));
    }

    public C57280IVp(C269904fs r1, 1Xj r2, String str, int i) {
        this.A03 = str;
        this.A00 = r1;
        this.A02 = i;
        this.A01 = r2;
    }
}
