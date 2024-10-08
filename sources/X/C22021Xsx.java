package X;

import java.math.BigInteger;

/* renamed from: X.Xsx  reason: case insensitive filesystem */
public abstract class C22021Xsx {
    public static final C3742398r A00;
    public static final AnonymousClass98B A01;
    public static final AnonymousClass98B A02;
    public static final C3739897s A03 = new C3739897s(new C22319XzU(1), C21197XOd.class);
    public static final C3739897s A04 = new C3739897s(new C22319XzU(0), C21200XOg.class);
    public static final AnonymousClass987 A05;
    public static final AnonymousClass984 A06 = new AnonymousClass984(new C22322XzX(0), C21195XOb.class);
    public static final C3742398r A07;
    public static final C3742398r A08;
    public static final C3742398r A09;
    public static final C3740497y A0A;
    public static final C3740497y A0B;

    public static C3740497y A03(XOa xOa, byte[] bArr) {
        int i;
        BigInteger bigInteger = new BigInteger(1, bArr);
        byte[] bArr2 = C21996Xq3.A00;
        if (xOa == XOa.A03) {
            i = 32;
        } else if (xOa == XOa.A00) {
            i = 65;
        } else if (xOa == XOa.A01) {
            i = 97;
        } else if (xOa == XOa.A02) {
            i = 133;
        } else {
            throw AnonymousClass7TG.A0q("Unrecognized HPKE KEM identifier");
        }
        return C3740497y.A00(C21514Xdg.A01(bigInteger, i));
    }

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        A0A = A012;
        C3740497y A013 = C3740397x.A01("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        A0B = A013;
        A05 = new AnonymousClass987(new C22321XzW(0), A012);
        A02 = new AnonymousClass98B(new C22318XzT(0), A013);
        A01 = new AnonymousClass98B(new C22318XzT(1), A012);
        C3742198p r2 = new C3742198p();
        r2.A01(AnonymousClass98D.RAW, Xnl.A02);
        r2.A01(AnonymousClass98D.TINK, Xnl.A03);
        AnonymousClass98D r0 = AnonymousClass98D.LEGACY;
        Xnl xnl = Xnl.A01;
        r2.A01(r0, xnl);
        r2.A01(AnonymousClass98D.CRUNCHY, xnl);
        A00 = r2.A00();
        C3742198p r22 = new C3742198p();
        r22.A01(C21275XSf.DHKEM_P256_HKDF_SHA256, XOa.A00);
        r22.A01(C21275XSf.DHKEM_P384_HKDF_SHA384, XOa.A01);
        r22.A01(C21275XSf.DHKEM_P521_HKDF_SHA512, XOa.A02);
        r22.A01(C21275XSf.DHKEM_X25519_HKDF_SHA256, XOa.A03);
        A09 = r22.A00();
        C3742198p r23 = new C3742198p();
        r23.A01(C21273XSd.HKDF_SHA256, XOZ.A00);
        r23.A01(C21273XSd.HKDF_SHA384, XOZ.A01);
        r23.A01(C21273XSd.HKDF_SHA512, XOZ.A02);
        A08 = r23.A00();
        C3742198p r24 = new C3742198p();
        r24.A01(C21272XSc.AES_128_GCM, XOY.A00);
        r24.A01(C21272XSc.AES_256_GCM, XOY.A01);
        r24.A01(C21272XSc.CHACHA20_POLY1305, XOY.A02);
        A07 = r24.A00();
    }

    public static C21195XOb A00(XP5 xp5, AnonymousClass98D r7) {
        C21275XSf xSf;
        C21273XSd xSd;
        C21272XSc xSc;
        Xnl xnl = (Xnl) A00.A01(r7);
        C3742398r r2 = A09;
        int i = xp5.kem_;
        if (i == 0) {
            xSf = C21275XSf.KEM_UNKNOWN;
        } else if (i == 1) {
            xSf = C21275XSf.DHKEM_X25519_HKDF_SHA256;
        } else if (i == 2) {
            xSf = C21275XSf.DHKEM_P256_HKDF_SHA256;
        } else if (i == 3) {
            xSf = C21275XSf.DHKEM_P384_HKDF_SHA384;
        } else if (i != 4) {
            xSf = C21275XSf.UNRECOGNIZED;
        } else {
            xSf = C21275XSf.DHKEM_P521_HKDF_SHA512;
        }
        XOa xOa = (XOa) r2.A01(xSf);
        C3742398r r22 = A08;
        int i2 = xp5.kdf_;
        if (i2 == 0) {
            xSd = C21273XSd.KDF_UNKNOWN;
        } else if (i2 == 1) {
            xSd = C21273XSd.HKDF_SHA256;
        } else if (i2 == 2) {
            xSd = C21273XSd.HKDF_SHA384;
        } else if (i2 != 3) {
            xSd = C21273XSd.UNRECOGNIZED;
        } else {
            xSd = C21273XSd.HKDF_SHA512;
        }
        XOZ xoz = (XOZ) r22.A01(xSd);
        C3742398r r23 = A07;
        int i3 = xp5.aead_;
        if (i3 == 0) {
            xSc = C21272XSc.AEAD_UNKNOWN;
        } else if (i3 == 1) {
            xSc = C21272XSc.AES_128_GCM;
        } else if (i3 == 2) {
            xSc = C21272XSc.AES_256_GCM;
        } else if (i3 != 3) {
            xSc = C21272XSc.UNRECOGNIZED;
        } else {
            xSc = C21272XSc.CHACHA20_POLY1305;
        }
        return C21317XVi.A00((XOY) r23.A01(xSc), xoz, xOa, xnl);
    }

    public static XP5 A01(C21195XOb xOb) {
        C375269Cx A0C = XP5.DEFAULT_INSTANCE.A0C();
        C21275XSf xSf = (C21275XSf) A09.A00(xOb.A02);
        A0C.A03();
        XP5 xp5 = (XP5) A0C.A00;
        if (xSf != C21275XSf.UNRECOGNIZED) {
            xp5.kem_ = xSf.A00;
            C21273XSd xSd = (C21273XSd) A08.A00(xOb.A01);
            A0C.A03();
            XP5 xp52 = (XP5) A0C.A00;
            if (xSd != C21273XSd.UNRECOGNIZED) {
                xp52.kdf_ = xSd.A00;
                C21272XSc xSc = (C21272XSc) A07.A00(xOb.A00);
                A0C.A03();
                XP5 xp53 = (XP5) A0C.A00;
                if (xSc != C21272XSc.UNRECOGNIZED) {
                    xp53.aead_ = xSc.A00;
                    return (XP5) A0C.A01();
                }
                throw AnonymousClass7TE.A0w(Pxd.A00(1));
            }
            throw AnonymousClass7TE.A0w(Pxd.A00(1));
        }
        throw AnonymousClass7TE.A0w(Pxd.A00(1));
    }

    public static XP9 A02(C21200XOg xOg) {
        C375269Cx A0C = XP9.DEFAULT_INSTANCE.A0C();
        A0C.A03();
        ((XP9) A0C.A00).version_ = 0;
        XP5 A012 = A01(xOg.A00);
        A0C.A03();
        XP9 xp9 = (XP9) A0C.A00;
        A012.getClass();
        xp9.params_ = A012;
        xp9.bitField0_ |= 1;
        byte[] A013 = xOg.A02.A01();
        AnonymousClass97V A014 = AnonymousClass97R.A01(A013, 0, A013.length);
        A0C.A03();
        ((XP9) A0C.A00).publicKey_ = A014;
        return (XP9) A0C.A01();
    }
}
