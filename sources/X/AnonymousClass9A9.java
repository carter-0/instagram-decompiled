package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9A9  reason: invalid class name */
public abstract class AnonymousClass9A9 {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new AnonymousClass9AD(), AnonymousClass9A6.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new AnonymousClass9AA(), AnonymousClass9AB.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        A04 = A012;
        A02 = new AnonymousClass987(new AnonymousClass9AC(), A012);
        A00 = new AnonymousClass98B(new AnonymousClass9AE(), A012);
    }

    public static AnonymousClass98D A01(AnonymousClass9AF r2) {
        if (AnonymousClass9AF.A03.equals(r2)) {
            return AnonymousClass98D.TINK;
        }
        if (AnonymousClass9AF.A01.equals(r2)) {
            return AnonymousClass98D.CRUNCHY;
        }
        if (AnonymousClass9AF.A02.equals(r2)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static AnonymousClass9AF A00(AnonymousClass98D r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return AnonymousClass9AF.A03;
        }
        if (ordinal == 4 || ordinal == 2) {
            return AnonymousClass9AF.A01;
        }
        if (ordinal == 3) {
            return AnonymousClass9AF.A02;
        }
        throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
    }
}
