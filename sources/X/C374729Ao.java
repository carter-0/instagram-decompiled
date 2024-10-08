package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Ao  reason: invalid class name and case insensitive filesystem */
public abstract class C374729Ao {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new C374759Ar(), C374699Al.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new C374739Ap(), C3744299k.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        A04 = A012;
        A02 = new AnonymousClass987(new C374749Aq(), A012);
        A00 = new AnonymousClass98B(new C374769As(), A012);
    }

    public static AnonymousClass98D A01(C3744199j r2) {
        if (C3744199j.A03.equals(r2)) {
            return AnonymousClass98D.TINK;
        }
        if (C3744199j.A01.equals(r2)) {
            return AnonymousClass98D.CRUNCHY;
        }
        if (C3744199j.A02.equals(r2)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static C3744199j A00(AnonymousClass98D r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return C3744199j.A03;
        }
        if (ordinal == 4 || ordinal == 2) {
            return C3744199j.A01;
        }
        if (ordinal == 3) {
            return C3744199j.A02;
        }
        throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
    }
}
