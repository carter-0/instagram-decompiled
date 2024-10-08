package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99F  reason: invalid class name */
public abstract class AnonymousClass99F {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new AnonymousClass99I(), AnonymousClass998.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new AnonymousClass99G(), AnonymousClass994.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.AesCmacKey");
        A04 = A012;
        A02 = new AnonymousClass987(new AnonymousClass99H(), A012);
        A00 = new AnonymousClass98B(new AnonymousClass99J(), A012);
    }

    public static AnonymousClass98D A01(AnonymousClass992 r2) {
        if (AnonymousClass992.A04.equals(r2)) {
            return AnonymousClass98D.TINK;
        }
        if (AnonymousClass992.A01.equals(r2)) {
            return AnonymousClass98D.CRUNCHY;
        }
        if (AnonymousClass992.A03.equals(r2)) {
            return AnonymousClass98D.RAW;
        }
        if (AnonymousClass992.A02.equals(r2)) {
            return AnonymousClass98D.LEGACY;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static AnonymousClass992 A00(AnonymousClass98D r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return AnonymousClass992.A04;
        }
        if (ordinal == 4) {
            return AnonymousClass992.A01;
        }
        if (ordinal == 2) {
            return AnonymousClass992.A02;
        }
        if (ordinal == 3) {
            return AnonymousClass992.A03;
        }
        throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
    }
}
