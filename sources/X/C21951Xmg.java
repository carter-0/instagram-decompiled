package X;

import com.google.crypto.tink.daead.DeterministicAeadConfig;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Xmg  reason: case insensitive filesystem */
public abstract class C21951Xmg {
    @Deprecated
    public static final AnonymousClass971 A00;
    @Deprecated
    public static final AnonymousClass971 A01;
    @Deprecated
    public static final AnonymousClass971 A02;

    static {
        AnonymousClass971 r0 = AnonymousClass971.DEFAULT_INSTANCE;
        A01 = r0;
        A02 = r0;
        A00 = r0;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() {
        AnonymousClass979 r3 = AnonymousClass979.A01;
        r3.A01(C40225AWp.A00);
        r3.A02(C40225AWp.A01);
        r3.A01(C40226AWq.A00);
        r3.A02(C40226AWq.A01);
        AnonymousClass98N.A00();
        DeterministicAeadConfig.A00();
        if (!AnonymousClass97K.A00()) {
            AnonymousClass97I r0 = C21352XYf.A03;
            C3739197l r10 = C3739197l.A00;
            if (r10.A00()) {
                C3739497o r2 = C3739497o.A01;
                r2.A07(C22022Xsy.A06);
                r2.A06(C22022Xsy.A05);
                r2.A05(C22022Xsy.A04);
                r2.A04(C22022Xsy.A02);
                r2.A05(C22022Xsy.A03);
                r2.A04(C22022Xsy.A01);
                AnonymousClass98G r5 = AnonymousClass98G.A01;
                HashMap A1E = AnonymousClass7TE.A1E();
                Set set = C21196XOc.A06;
                Xnk xnk = Xnk.A02;
                Xnm xnm = Xnm.A01;
                Xnn xnn = Xnn.A03;
                Xnj xnj = Xnj.A03;
                Xnk xnk2 = Xnk.A03;
                AnonymousClass99Y r7 = AnonymousClass99Y.A02;
                C3743299a A002 = AnonymousClass99Z.A00(r7, 16);
                Set set2 = C21196XOc.A06;
                if (set2.contains(A002)) {
                    A1E.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C21316XVh.A00(A002, xnm, xnn, xnj, xnk2, (C3740497y) null));
                    C3743299a A003 = AnonymousClass99Z.A00(r7, 16);
                    if (set2.contains(A003)) {
                        Xnm xnm2 = xnm;
                        Xnn xnn2 = xnn;
                        A1E.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C21316XVh.A00(A003, xnm2, xnn2, xnj, xnk, (C3740497y) null));
                        Xnj xnj2 = Xnj.A01;
                        C3743299a A004 = AnonymousClass99Z.A00(r7, 16);
                        if (set2.contains(A004)) {
                            A1E.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C21316XVh.A00(A004, xnm, xnn, xnj2, xnk2, (C3740497y) null));
                            C3743299a A005 = AnonymousClass99Z.A00(r7, 16);
                            if (set2.contains(A005)) {
                                Xnj xnj3 = xnj2;
                                A1E.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C21316XVh.A00(A005, xnm2, xnn2, xnj3, xnk, (C3740497y) null));
                                C3743299a A006 = AnonymousClass99Z.A00(r7, 16);
                                if (set2.contains(A006)) {
                                    A1E.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C21316XVh.A00(A006, xnm2, xnn2, xnj3, xnk, (C3740497y) null));
                                    C3743799f r27 = C3743799f.A02;
                                    C3743699e r26 = C3743699e.A03;
                                    AnonymousClass99S A007 = C3743899g.A00(r26, r27, 16, 32, 16, 16);
                                    if (set2.contains(A007)) {
                                        A1E.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C21316XVh.A00(A007, xnm, xnn, xnj, xnk2, (C3740497y) null));
                                        AnonymousClass99S A008 = C3743899g.A00(r26, r27, 16, 32, 16, 16);
                                        if (set2.contains(A008)) {
                                            A1E.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C21316XVh.A00(A008, xnm2, xnn2, xnj, xnk, (C3740497y) null));
                                            AnonymousClass99S A009 = C3743899g.A00(r26, r27, 16, 32, 16, 16);
                                            if (set2.contains(A009)) {
                                                Xnj xnj4 = xnj2;
                                                A1E.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C21316XVh.A00(A009, xnm, xnn, xnj4, xnk2, (C3740497y) null));
                                                AnonymousClass99S A0010 = C3743899g.A00(r26, r27, 16, 32, 16, 16);
                                                if (set2.contains(A0010)) {
                                                    A1E.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C21316XVh.A00(A0010, xnm2, xnn2, xnj4, xnk, (C3740497y) null));
                                                    r5.A00(Collections.unmodifiableMap(A1E));
                                                    r3.A02(C21352XYf.A03);
                                                    r3.A02(C21352XYf.A04);
                                                    AnonymousClass98J r72 = AnonymousClass98J.A02;
                                                    r72.A01(C21352XYf.A02, C21196XOc.class);
                                                    AnonymousClass98M r4 = AnonymousClass98M.A02;
                                                    r4.A02(C21352XYf.A01, true);
                                                    r4.A02(C21352XYf.A00, false);
                                                    AnonymousClass97I r02 = C21353XYg.A03;
                                                    if (r10.A00()) {
                                                        r2.A07(C22021Xsx.A06);
                                                        r2.A06(C22021Xsx.A05);
                                                        r2.A05(C22021Xsx.A04);
                                                        r2.A04(C22021Xsx.A02);
                                                        r2.A05(C22021Xsx.A03);
                                                        r2.A04(C22021Xsx.A01);
                                                        HashMap A1E2 = AnonymousClass7TE.A1E();
                                                        Xnl xnl = Xnl.A02;
                                                        Xnl xnl2 = Xnl.A03;
                                                        XOa xOa = XOa.A03;
                                                        XOZ xoz = XOZ.A00;
                                                        XOY xoy = XOY.A00;
                                                        A1E2.put(AnonymousClass000.A00(2192), C21317XVi.A00(xoy, xoz, xOa, xnl2));
                                                        A1E2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C21317XVi.A00(xoy, xoz, xOa, xnl));
                                                        XOY xoy2 = XOY.A01;
                                                        A1E2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C21317XVi.A00(xoy2, xoz, xOa, xnl2));
                                                        A1E2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C21317XVi.A00(xoy2, xoz, xOa, xnl));
                                                        XOY xoy3 = XOY.A02;
                                                        A1E2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", C21317XVi.A00(xoy3, xoz, xOa, xnl2));
                                                        A1E2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", C21317XVi.A00(xoy3, xoz, xOa, xnl));
                                                        XOa xOa2 = XOa.A00;
                                                        A1E2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", C21317XVi.A00(xoy, xoz, xOa2, xnl2));
                                                        A1E2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C21317XVi.A00(xoy, xoz, xOa2, xnl));
                                                        A1E2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C21317XVi.A00(xoy2, xoz, xOa2, xnl2));
                                                        A1E2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C21317XVi.A00(xoy2, xoz, xOa2, xnl));
                                                        XOa xOa3 = XOa.A01;
                                                        XOZ xoz2 = XOZ.A01;
                                                        A1E2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", C21317XVi.A00(xoy, xoz2, xOa3, xnl2));
                                                        A1E2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", C21317XVi.A00(xoy, xoz2, xOa3, xnl));
                                                        A1E2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", C21317XVi.A00(xoy2, xoz2, xOa3, xnl2));
                                                        A1E2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", C21317XVi.A00(xoy2, xoz2, xOa3, xnl));
                                                        XOa xOa4 = XOa.A02;
                                                        XOZ xoz3 = XOZ.A02;
                                                        A1E2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", C21317XVi.A00(xoy, xoz3, xOa4, xnl2));
                                                        A1E2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", C21317XVi.A00(xoy, xoz3, xOa4, xnl));
                                                        A1E2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", C21317XVi.A00(xoy2, xoz3, xOa4, xnl2));
                                                        A1E2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", C21317XVi.A00(xoy2, xoz3, xOa4, xnl));
                                                        r5.A00(Collections.unmodifiableMap(A1E2));
                                                        r3.A02(C21353XYg.A03);
                                                        r3.A02(C21353XYg.A04);
                                                        r72.A01(C21353XYg.A02, C21195XOb.class);
                                                        r4.A02(C21353XYg.A01, true);
                                                        r4.A02(C21353XYg.A00, false);
                                                        return;
                                                    }
                                                    throw AnonymousClass7TG.A0q("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
                                                }
                                                throw C21056XCh.A0C(A0010);
                                            }
                                            throw C21056XCh.A0C(A009);
                                        }
                                        throw C21056XCh.A0C(A008);
                                    }
                                    throw C21056XCh.A0C(A007);
                                }
                                throw C21056XCh.A0C(A006);
                            }
                            throw C21056XCh.A0C(A005);
                        }
                        throw C21056XCh.A0C(A004);
                    }
                    throw C21056XCh.A0C(A003);
                }
                throw C21056XCh.A0C(A002);
            }
            throw AnonymousClass7TG.A0q("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        }
    }
}
