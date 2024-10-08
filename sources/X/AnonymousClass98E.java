package X;

import java.security.GeneralSecurityException;

/* renamed from: X.98E  reason: invalid class name */
public final class AnonymousClass98E implements C3740097u {
    public final C384459hM A00;
    public final C3740497y A01;

    public static AnonymousClass98E A00(C384459hM r6) {
        String str = r6.typeUrl_;
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException(002.A0C("Not a printable ASCII character: ", charAt));
            }
            bArr[i] = (byte) charAt;
        }
        return new AnonymousClass98E(r6, new C3740497y(bArr, bArr.length));
    }

    public static AnonymousClass98E A01(C384459hM r2) {
        return new AnonymousClass98E(r2, C3740397x.A01(r2.typeUrl_));
    }

    public final C3740497y BXl() {
        return this.A01;
    }

    public AnonymousClass98E(C384459hM r1, C3740497y r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
