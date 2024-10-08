package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99Q  reason: invalid class name */
public abstract class AnonymousClass99Q {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new AnonymousClass99V(), AnonymousClass99M.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new AnonymousClass99R(), AnonymousClass99S.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        A04 = A012;
        A02 = new AnonymousClass987(new AnonymousClass99U(), A012);
        A00 = new AnonymousClass98B(new AnonymousClass99W(), A012);
    }

    public static C384379hE A02(AnonymousClass99S r4) {
        C3742498s r0;
        C375269Cx A0C = C384379hE.DEFAULT_INSTANCE.A0C();
        int i = r4.A03;
        A0C.A03();
        ((C384379hE) A0C.A00).tagSize_ = i;
        C3743699e r2 = r4.A04;
        if (C3743699e.A01.equals(r2)) {
            r0 = C3742498s.SHA1;
        } else if (C3743699e.A02.equals(r2)) {
            r0 = C3742498s.SHA224;
        } else if (C3743699e.A03.equals(r2)) {
            r0 = C3742498s.SHA256;
        } else if (C3743699e.A04.equals(r2)) {
            r0 = C3742498s.SHA384;
        } else if (C3743699e.A05.equals(r2)) {
            r0 = C3742498s.SHA512;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to serialize HashType ");
            sb.append(r2);
            throw new GeneralSecurityException(sb.toString());
        }
        A0C.A03();
        ((C384379hE) A0C.A00).hash_ = r0.A00;
        return (C384379hE) A0C.A01();
    }

    public static AnonymousClass98D A03(C3743799f r2) {
        if (C3743799f.A03.equals(r2)) {
            return AnonymousClass98D.TINK;
        }
        if (C3743799f.A01.equals(r2)) {
            return AnonymousClass98D.CRUNCHY;
        }
        if (C3743799f.A02.equals(r2)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(r2);
        throw new GeneralSecurityException(sb.toString());
    }

    public static C3743699e A00(C3742498s r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return C3743699e.A01;
        }
        if (ordinal == 5) {
            return C3743699e.A02;
        }
        if (ordinal == 3) {
            return C3743699e.A03;
        }
        if (ordinal == 2) {
            return C3743699e.A04;
        }
        if (ordinal == 4) {
            return C3743699e.A05;
        }
        if (r2 != C3742498s.UNRECOGNIZED) {
            throw new GeneralSecurityException(002.A0O("Unable to parse HashType: ", r2.A00));
        }
        throw new IllegalArgumentException(Pxd.A00(1));
    }

    public static C3743799f A01(AnonymousClass98D r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 1) {
            return C3743799f.A03;
        }
        if (ordinal == 4 || ordinal == 2) {
            return C3743799f.A01;
        }
        if (ordinal == 3) {
            return C3743799f.A02;
        }
        throw new GeneralSecurityException(002.A0O("Unable to parse OutputPrefixType: ", r2.A01()));
    }
}
