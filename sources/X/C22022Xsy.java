package X;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Set;

/* renamed from: X.Xsy  reason: case insensitive filesystem */
public abstract class C22022Xsy {
    public static final C3742398r A00;
    public static final AnonymousClass98B A01;
    public static final AnonymousClass98B A02;
    public static final C3739897s A03 = new C3739897s(new C22319XzU(3), C21198XOe.class);
    public static final C3739897s A04 = new C3739897s(new C22319XzU(2), XOh.class);
    public static final AnonymousClass987 A05;
    public static final AnonymousClass984 A06 = new AnonymousClass984(new C22322XzX(1), C21196XOc.class);
    public static final C3742398r A07;
    public static final C3742398r A08;
    public static final C3742398r A09;
    public static final C3740497y A0A;
    public static final C3740497y A0B;

    static {
        C3740497y A012 = C3740397x.A01("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        A0A = A012;
        C3740497y A013 = C3740397x.A01("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        A0B = A013;
        A05 = new AnonymousClass987(new C22321XzW(1), A012);
        A02 = new AnonymousClass98B(new C22318XzT(2), A013);
        A01 = new AnonymousClass98B(new C22318XzT(3), A012);
        C3742198p r2 = new C3742198p();
        r2.A01(AnonymousClass98D.RAW, Xnk.A02);
        r2.A01(AnonymousClass98D.TINK, Xnk.A03);
        AnonymousClass98D r0 = AnonymousClass98D.LEGACY;
        Xnk xnk = Xnk.A01;
        r2.A01(r0, xnk);
        r2.A01(AnonymousClass98D.CRUNCHY, xnk);
        A00 = r2.A00();
        C3742198p r22 = new C3742198p();
        r22.A01(C3742498s.SHA1, Xnn.A01);
        r22.A01(C3742498s.SHA224, Xnn.A02);
        r22.A01(C3742498s.SHA256, Xnn.A03);
        r22.A01(C3742498s.SHA384, Xnn.A04);
        r22.A01(C3742498s.SHA512, Xnn.A05);
        A08 = r22.A00();
        C3742198p r23 = new C3742198p();
        r23.A01(C21274XSe.NIST_P256, Xnm.A01);
        r23.A01(C21274XSe.NIST_P384, Xnm.A02);
        r23.A01(C21274XSe.NIST_P521, Xnm.A03);
        r23.A01(C21274XSe.CURVE25519, Xnm.A04);
        A07 = r23.A00();
        C3742198p r24 = new C3742198p();
        r24.A01(C21271XSb.UNCOMPRESSED, Xnj.A03);
        r24.A01(C21271XSb.COMPRESSED, Xnj.A01);
        r24.A01(C21271XSb.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, Xnj.A02);
        A09 = r24.A00();
    }

    public static int A00(Xnm xnm) {
        if (Xnm.A01.equals(xnm)) {
            return 33;
        }
        if (Xnm.A02.equals(xnm)) {
            return 49;
        }
        if (Xnm.A03.equals(xnm)) {
            return 67;
        }
        throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(xnm, "Unable to serialize CurveType ", AnonymousClass7TE.A1A()));
    }

    public static C21196XOc A01(XP6 xp6, AnonymousClass98D r10) {
        C21271XSb xSb;
        C21271XSb xSb2;
        C384459hM r2 = C384459hM.DEFAULT_INSTANCE;
        C384319h8 r1 = (C384319h8) r2.A0C();
        XP2 xp2 = xp6.demParams_;
        if (xp2 == null) {
            xp2 = XP2.DEFAULT_INSTANCE;
        }
        C384459hM r0 = xp2.aeadDem_;
        if (r0 == null) {
            r0 = r2;
        }
        r1.A06(r0.typeUrl_);
        r1.A04(AnonymousClass98D.RAW);
        XP2 xp22 = xp6.demParams_;
        if (xp22 == null) {
            xp22 = XP2.DEFAULT_INSTANCE;
        }
        C384459hM r02 = xp22.aeadDem_;
        if (r02 == null) {
            r02 = r2;
        }
        r1.A05(r02.value_);
        AnonymousClass972 A012 = r1.A01();
        Set set = C21196XOc.A06;
        Xnj xnj = null;
        Xnk xnk = (Xnk) A00.A01(r10);
        C3742398r r12 = A07;
        XPC xpc = xp6.kemParams_;
        if (xpc == null) {
            xpc = XPC.DEFAULT_INSTANCE;
        }
        Xnm xnm = (Xnm) r12.A01(xpc.A0F());
        C3742398r r13 = A08;
        XPC xpc2 = xp6.kemParams_;
        if (xpc2 == null) {
            xpc2 = XPC.DEFAULT_INSTANCE;
        }
        C3742498s A002 = C3742498s.A00(xpc2.hkdfHashType_);
        if (A002 == null) {
            A002 = C3742498s.UNRECOGNIZED;
        }
        Xnn xnn = (Xnn) r13.A01(A002);
        AnonymousClass983 A003 = AAL.A00(A012.A0B());
        if (C21196XOc.A06.contains(A003)) {
            XPC xpc3 = xp6.kemParams_;
            if (xpc3 == null) {
                xpc3 = XPC.DEFAULT_INSTANCE;
            }
            C3740497y A004 = C3740497y.A00(xpc3.hkdfSalt_.A04());
            if (A004.A00.length == 0) {
                A004 = null;
            }
            XPC xpc4 = xp6.kemParams_;
            if (xpc4 == null) {
                xpc4 = XPC.DEFAULT_INSTANCE;
            }
            if (!xpc4.A0F().equals(C21274XSe.CURVE25519)) {
                C3742398r r22 = A09;
                int i = xp6.ecPointFormat_;
                if (i == 0) {
                    xSb2 = C21271XSb.UNKNOWN_FORMAT;
                } else if (i == 1) {
                    xSb2 = C21271XSb.UNCOMPRESSED;
                } else if (i == 2) {
                    xSb2 = C21271XSb.COMPRESSED;
                } else if (i != 3) {
                    xSb2 = C21271XSb.UNRECOGNIZED;
                } else {
                    xSb2 = C21271XSb.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                }
                xnj = (Xnj) r22.A01(xSb2);
            } else {
                int i2 = xp6.ecPointFormat_;
                if (i2 == 0) {
                    xSb = C21271XSb.UNKNOWN_FORMAT;
                } else if (i2 == 1) {
                    xSb = C21271XSb.UNCOMPRESSED;
                } else if (i2 == 2) {
                    xSb = C21271XSb.COMPRESSED;
                } else if (i2 != 3) {
                    xSb = C21271XSb.UNRECOGNIZED;
                } else {
                    xSb = C21271XSb.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                }
                if (!xSb.equals(C21271XSb.COMPRESSED)) {
                    throw AnonymousClass7TG.A0q("For CURVE25519 EcPointFormat must be compressed");
                }
            }
            return C21316XVh.A00(A003, xnm, xnn, xnj, xnk, A004);
        }
        throw C21056XCh.A0C(A003);
    }

    public static XP6 A02(C21196XOc xOc) {
        C375269Cx A0C = XPC.DEFAULT_INSTANCE.A0C();
        C21274XSe xSe = (C21274XSe) A07.A00(xOc.A01);
        A0C.A03();
        XPC xpc = (XPC) A0C.A00;
        if (xSe != C21274XSe.UNRECOGNIZED) {
            xpc.curveType_ = xSe.A00;
            C3742498s r2 = (C3742498s) A08.A00(xOc.A02);
            A0C.A03();
            XPC xpc2 = (XPC) A0C.A00;
            if (r2 != C3742498s.UNRECOGNIZED) {
                xpc2.hkdfHashType_ = r2.A00;
                C3740497y r1 = xOc.A05;
                if (r1 != null && r1.A00.length > 0) {
                    byte[] A012 = r1.A01();
                    AnonymousClass97V A013 = AnonymousClass97R.A01(A012, 0, A012.length);
                    A0C.A03();
                    ((XPC) A0C.A00).hkdfSalt_ = A013;
                }
                XPC xpc3 = (XPC) A0C.A01();
                try {
                    byte[] A014 = AAL.A01(xOc.A00);
                    C3738397d A002 = C3738397d.A00();
                    C384459hM r12 = C384459hM.DEFAULT_INSTANCE;
                    C384459hM r3 = (C384459hM) AnonymousClass972.A02(A002, r12, A014);
                    C375269Cx A0C2 = XP2.DEFAULT_INSTANCE.A0C();
                    C384319h8 r13 = (C384319h8) r12.A0C();
                    r13.A06(r3.typeUrl_);
                    r13.A04(AnonymousClass98D.TINK);
                    r13.A05(r3.value_);
                    C384459hM r0 = (C384459hM) r13.A01();
                    A0C2.A03();
                    XP2 xp2 = (XP2) A0C2.A00;
                    r0.getClass();
                    xp2.aeadDem_ = r0;
                    xp2.bitField0_ |= 1;
                    XP2 xp22 = (XP2) A0C2.A01();
                    Xnj xnj = xOc.A03;
                    if (xnj == null) {
                        xnj = Xnj.A01;
                    }
                    C375269Cx A0C3 = XP6.DEFAULT_INSTANCE.A0C();
                    A0C3.A03();
                    XP6 xp6 = (XP6) A0C3.A00;
                    xpc3.getClass();
                    xp6.kemParams_ = xpc3;
                    xp6.bitField0_ |= 1;
                    A0C3.A03();
                    XP6 xp62 = (XP6) A0C3.A00;
                    xp22.getClass();
                    xp62.demParams_ = xp22;
                    xp62.bitField0_ |= 2;
                    C21271XSb xSb = (C21271XSb) A09.A00(xnj);
                    A0C3.A03();
                    XP6 xp63 = (XP6) A0C3.A00;
                    if (xSb != C21271XSb.UNRECOGNIZED) {
                        xp63.ecPointFormat_ = xSb.A00;
                        return (XP6) A0C3.A01();
                    }
                    throw AnonymousClass7TE.A0w(Pxd.A00(1));
                } catch (AnonymousClass9GO e) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e);
                }
            } else {
                throw AnonymousClass7TE.A0w(Pxd.A00(1));
            }
        } else {
            throw AnonymousClass7TE.A0w(Pxd.A00(1));
        }
    }

    public static XPA A03(XOh xOh) {
        C375269Cx A0C;
        AnonymousClass97R A012;
        C21196XOc xOc = xOh.A00;
        Xnm xnm = xOc.A01;
        if (xnm.equals(Xnm.A04)) {
            A0C = XPA.DEFAULT_INSTANCE.A0C();
            A0C.A03();
            ((XPA) A0C.A00).version_ = 0;
            XP6 A022 = A02(xOc);
            A0C.A03();
            XPA xpa = (XPA) A0C.A00;
            A022.getClass();
            xpa.params_ = A022;
            xpa.bitField0_ |= 1;
            byte[] A013 = xOh.A02.A01();
            AnonymousClass97V A014 = AnonymousClass97R.A01(A013, 0, A013.length);
            A0C.A03();
            ((XPA) A0C.A00).x_ = A014;
            A012 = AnonymousClass97R.A01;
        } else {
            int A002 = A00(xnm);
            ECPoint eCPoint = xOh.A04;
            if (eCPoint != null) {
                A0C = XPA.DEFAULT_INSTANCE.A0C();
                A0C.A03();
                ((XPA) A0C.A00).version_ = 0;
                XP6 A023 = A02(xOc);
                A0C.A03();
                XPA xpa2 = (XPA) A0C.A00;
                A023.getClass();
                xpa2.params_ = A023;
                xpa2.bitField0_ |= 1;
                byte[] A015 = C21514Xdg.A01(eCPoint.getAffineX(), A002);
                AnonymousClass97V A016 = AnonymousClass97R.A01(A015, 0, A015.length);
                A0C.A03();
                ((XPA) A0C.A00).x_ = A016;
                byte[] A017 = C21514Xdg.A01(eCPoint.getAffineY(), A002);
                A012 = AnonymousClass97R.A01(A017, 0, A017.length);
            } else {
                throw AnonymousClass7TG.A0q("NistCurvePoint was null for NIST curve");
            }
        }
        A0C.A03();
        A012.getClass();
        ((XPA) A0C.A00).y_ = A012;
        return (XPA) A0C.A01();
    }
}
