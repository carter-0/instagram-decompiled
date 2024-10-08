package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99q  reason: invalid class name and case insensitive filesystem */
public abstract class C3744899q {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new C3745199t(), C3744599n.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new C3744999r(), C3743299a.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.AesGcmKey");
        A04 = A012;
        A02 = new AnonymousClass987(new C3745099s(), A012);
        A00 = new AnonymousClass98B(new C3745299u(), A012);
    }

    public static AnonymousClass98D A01(AnonymousClass99Y r2) {
        if (AnonymousClass99Y.A03.equals(r2)) {
            return AnonymousClass98D.TINK;
        }
        if (AnonymousClass99Y.A01.equals(r2)) {
            return AnonymousClass98D.CRUNCHY;
        }
        if (AnonymousClass99Y.A02.equals(r2)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static void A02(C3743299a r2) {
        int i = r2.A02;
        if (i == 16) {
            int i2 = r2.A00;
            if (i2 != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", new Object[]{Integer.valueOf(i2)}));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(i)}));
    }

    public static AnonymousClass99Y A00(AnonymousClass98D r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return AnonymousClass99Y.A03;
        }
        if (ordinal == 4 || ordinal == 2) {
            return AnonymousClass99Y.A01;
        }
        if (ordinal == 3) {
            return AnonymousClass99Y.A02;
        }
        throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
    }
}
