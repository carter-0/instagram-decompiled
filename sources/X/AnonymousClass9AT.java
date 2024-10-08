package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9AT  reason: invalid class name */
public abstract class AnonymousClass9AT {
    public static final AnonymousClass98B A00;
    public static final C3739897s A01 = new C3739897s(new AnonymousClass9AX(), AnonymousClass9AR.class);
    public static final AnonymousClass987 A02;
    public static final AnonymousClass984 A03 = new AnonymousClass984(new AnonymousClass9AU(), AnonymousClass9AV.class);
    public static final C3740497y A04;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        A04 = A012;
        A02 = new AnonymousClass987(new AnonymousClass9AW(), A012);
        A00 = new AnonymousClass98B(new AnonymousClass9AY(), A012);
    }

    public static AnonymousClass98D A00(C39880ADc aDc) {
        if (C39880ADc.A02.equals(aDc)) {
            return AnonymousClass98D.TINK;
        }
        if (C39880ADc.A01.equals(aDc)) {
            return AnonymousClass98D.RAW;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to serialize variant: ");
        sb.append(aDc);
        throw new GeneralSecurityException(sb.toString());
    }
}
