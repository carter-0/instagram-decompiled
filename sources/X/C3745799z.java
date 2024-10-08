package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99z  reason: invalid class name and case insensitive filesystem */
public abstract class C3745799z {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new AnonymousClass9A2(), C3745599x.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new AnonymousClass9A0(), C3743599d.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.AesEaxKey");
        A04 = A012;
        A02 = new AnonymousClass987(new AnonymousClass9A1(), A012);
        A00 = new AnonymousClass98B(new AnonymousClass9A3(), A012);
    }

    public static XP0 A01(C3743599d r3) {
        int i = r3.A02;
        if (i == 16) {
            C375269Cx A0C = XP0.DEFAULT_INSTANCE.A0C();
            int i2 = r3.A00;
            A0C.A03();
            ((XP0) A0C.A00).ivSize_ = i2;
            return (XP0) A0C.A01();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(i)}));
    }

    public static AnonymousClass98D A02(C3743399b r2) {
        if (C3743399b.A03.equals(r2)) {
            return AnonymousClass98D.TINK;
        }
        if (C3743399b.A01.equals(r2)) {
            return AnonymousClass98D.CRUNCHY;
        }
        if (C3743399b.A02.equals(r2)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static C3743399b A00(AnonymousClass98D r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return C3743399b.A03;
        }
        if (ordinal == 4 || ordinal == 2) {
            return C3743399b.A01;
        }
        if (ordinal == 3) {
            return C3743399b.A02;
        }
        throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
    }
}
