package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9AK  reason: invalid class name */
public abstract class AnonymousClass9AK {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new AnonymousClass9AN(), AnonymousClass9AI.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new AnonymousClass9AL(), C3744099i.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        A04 = A012;
        A02 = new AnonymousClass987(new AnonymousClass9AM(), A012);
        A00 = new AnonymousClass98B(new AnonymousClass9AO(), A012);
    }

    public static AnonymousClass98D A01(C3743999h r2) {
        if (C3743999h.A03.equals(r2)) {
            return AnonymousClass98D.TINK;
        }
        if (C3743999h.A01.equals(r2)) {
            return AnonymousClass98D.CRUNCHY;
        }
        if (C3743999h.A02.equals(r2)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static C3743999h A00(AnonymousClass98D r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return C3743999h.A03;
        }
        if (ordinal == 4 || ordinal == 2) {
            return C3743999h.A01;
        }
        if (ordinal == 3) {
            return C3743999h.A02;
        }
        throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
    }
}
