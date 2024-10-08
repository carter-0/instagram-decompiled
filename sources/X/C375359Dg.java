package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9Dg  reason: invalid class name and case insensitive filesystem */
public abstract class C375359Dg {
    public static final byte[] A00 = new byte[0];

    public static byte[] A00(C3741398h r2) {
        C3740497y r0;
        AnonymousClass98D A002 = AnonymousClass98D.A00(r2.outputPrefixType_);
        if (A002 == null) {
            A002 = AnonymousClass98D.UNRECOGNIZED;
        }
        int ordinal = A002.ordinal();
        if (ordinal == 2 || ordinal == 4) {
            r0 = C375109Ch.A00(r2.keyId_);
        } else if (ordinal == 1) {
            r0 = C375109Ch.A01(r2.keyId_);
        } else if (ordinal == 3) {
            return A00;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return r0.A01();
    }
}
