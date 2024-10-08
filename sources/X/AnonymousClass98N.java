package X;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.98N  reason: invalid class name */
public abstract class AnonymousClass98N {
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
        AnonymousClass979 r1 = AnonymousClass979.A01;
        r1.A01(AnonymousClass98O.A00);
        r1.A02(AnonymousClass98O.A01);
        AnonymousClass98R.A00();
        C3739197l r8 = AnonymousClass99K.A01;
        if (r8.A00()) {
            C3739497o r2 = C3739497o.A01;
            r2.A07(AnonymousClass99Q.A03);
            r2.A06(AnonymousClass99Q.A02);
            r2.A05(AnonymousClass99Q.A01);
            r2.A04(AnonymousClass99Q.A00);
            r1.A02(AnonymousClass99K.A04);
            AnonymousClass98G r7 = AnonymousClass98G.A01;
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", AnonymousClass99X.A00);
            C3743799f r14 = C3743799f.A02;
            C3743699e r13 = C3743699e.A03;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C3743899g.A00(r13, r14, 16, 32, 16, 16));
            hashMap.put("AES256_CTR_HMAC_SHA256", AnonymousClass99X.A01);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C3743899g.A00(r13, r14, 32, 32, 16, 32));
            r7.A00(Collections.unmodifiableMap(hashMap));
            AnonymousClass98I r6 = AnonymousClass98I.A01;
            Class<AnonymousClass99S> cls = AnonymousClass99S.class;
            r6.A00(AnonymousClass99K.A03, cls);
            AnonymousClass98J r5 = AnonymousClass98J.A02;
            r5.A01(AnonymousClass99K.A02, cls);
            AnonymousClass98M r4 = AnonymousClass98M.A02;
            r4.A01(AnonymousClass99K.A00, r8, true);
            C3739197l r10 = C3744399l.A01;
            if (r10.A00()) {
                r2.A07(C3744899q.A03);
                r2.A06(C3744899q.A02);
                r2.A05(C3744899q.A01);
                r2.A04(C3744899q.A00);
                r1.A02(C3744399l.A04);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM", AnonymousClass99X.A04);
                AnonymousClass99Y r142 = AnonymousClass99Y.A02;
                hashMap2.put("AES128_GCM_RAW", AnonymousClass99Z.A00(r142, 16));
                hashMap2.put("AES256_GCM", AnonymousClass99X.A05);
                hashMap2.put("AES256_GCM_RAW", AnonymousClass99Z.A00(r142, 32));
                r7.A00(Collections.unmodifiableMap(hashMap2));
                Class<C3743299a> cls2 = C3743299a.class;
                r6.A00(C3744399l.A03, cls2);
                r5.A01(C3744399l.A02, cls2);
                r4.A01(C3744399l.A00, r10, true);
                if (!AnonymousClass97K.A00()) {
                    AnonymousClass97I r0 = C3745399v.A02;
                    C3739197l r143 = C3739197l.A00;
                    if (r143.A00()) {
                        r2.A07(C3745799z.A03);
                        r2.A06(C3745799z.A02);
                        r2.A05(C3745799z.A01);
                        r2.A04(C3745799z.A00);
                        r1.A02(C3745399v.A02);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("AES128_EAX", AnonymousClass99X.A02);
                        C3743399b r132 = C3743399b.A02;
                        hashMap3.put("AES128_EAX_RAW", C3743499c.A00(r132, 16, 16));
                        hashMap3.put("AES256_EAX", AnonymousClass99X.A03);
                        hashMap3.put("AES256_EAX_RAW", C3743499c.A00(r132, 16, 32));
                        r7.A00(Collections.unmodifiableMap(hashMap3));
                        r5.A01(C3745399v.A01, C3743599d.class);
                        r4.A02(C3745399v.A00, true);
                        AnonymousClass97I r02 = AnonymousClass9A4.A03;
                        if (r143.A00()) {
                            r2.A07(AnonymousClass9A9.A03);
                            r2.A06(AnonymousClass9A9.A02);
                            r2.A05(AnonymousClass9A9.A01);
                            r2.A04(AnonymousClass9A9.A00);
                            try {
                                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                                r1.A02(AnonymousClass9A4.A03);
                                HashMap hashMap4 = new HashMap();
                                AnonymousClass9AF r11 = AnonymousClass9AF.A02;
                                AnonymousClass9AF r133 = AnonymousClass9AF.A03;
                                hashMap4.put("AES128_GCM_SIV", new AnonymousClass9AB(r133, 16));
                                hashMap4.put("AES128_GCM_SIV_RAW", new AnonymousClass9AB(r11, 16));
                                hashMap4.put("AES256_GCM_SIV", new AnonymousClass9AB(r133, 32));
                                hashMap4.put("AES256_GCM_SIV_RAW", new AnonymousClass9AB(r11, 32));
                                r7.A00(Collections.unmodifiableMap(hashMap4));
                                Class<AnonymousClass9AB> cls3 = AnonymousClass9AB.class;
                                r6.A00(AnonymousClass9A4.A02, cls3);
                                r5.A01(AnonymousClass9A4.A01, cls3);
                                r4.A02(AnonymousClass9A4.A00, true);
                            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                            }
                            AnonymousClass97I r03 = AnonymousClass9AG.A02;
                            if (r143.A00()) {
                                r2.A07(AnonymousClass9AK.A03);
                                r2.A06(AnonymousClass9AK.A02);
                                r2.A05(AnonymousClass9AK.A01);
                                r2.A04(AnonymousClass9AK.A00);
                                r1.A02(AnonymousClass9AG.A02);
                                r5.A01(AnonymousClass9AG.A01, C3744099i.class);
                                HashMap hashMap5 = new HashMap();
                                hashMap5.put("CHACHA20_POLY1305", new C3744099i(C3743999h.A03));
                                hashMap5.put("CHACHA20_POLY1305_RAW", new C3744099i(C3743999h.A02));
                                r7.A00(Collections.unmodifiableMap(hashMap5));
                                r4.A02(AnonymousClass9AG.A00, true);
                                C3739097k r04 = AnonymousClass9AP.A01;
                                if (r143.A00()) {
                                    r2.A07(AnonymousClass9AT.A03);
                                    r2.A06(AnonymousClass9AT.A02);
                                    r2.A05(AnonymousClass9AT.A01);
                                    r2.A04(AnonymousClass9AT.A00);
                                    r1.A02(AnonymousClass9AP.A02);
                                    r5.A01(AnonymousClass9AP.A01, AnonymousClass9AV.class);
                                    r4.A02(AnonymousClass9AP.A00, true);
                                    C3739097k r05 = AnonymousClass9AZ.A01;
                                    if (r143.A00()) {
                                        r2.A07(C374619Ad.A03);
                                        r2.A06(C374619Ad.A02);
                                        r2.A05(C374619Ad.A01);
                                        r2.A04(C374619Ad.A00);
                                        r5.A01(AnonymousClass9AZ.A01, C374639Af.class);
                                        r1.A02(AnonymousClass9AZ.A02);
                                        r4.A02(AnonymousClass9AZ.A00, true);
                                        C3739097k r06 = C374679Aj.A01;
                                        if (r143.A00()) {
                                            r2.A07(C374729Ao.A03);
                                            r2.A06(C374729Ao.A02);
                                            r2.A05(C374729Ao.A01);
                                            r2.A04(C374729Ao.A00);
                                            r1.A02(C374679Aj.A03);
                                            HashMap hashMap6 = new HashMap();
                                            hashMap6.put("XCHACHA20_POLY1305", new C3744299k(C3744199j.A03));
                                            hashMap6.put("XCHACHA20_POLY1305_RAW", new C3744299k(C3744199j.A02));
                                            r7.A00(Collections.unmodifiableMap(hashMap6));
                                            Class<C3744299k> cls4 = C3744299k.class;
                                            r5.A01(C374679Aj.A01, cls4);
                                            r6.A00(C374679Aj.A02, cls4);
                                            r4.A02(C374679Aj.A00, true);
                                            return;
                                        }
                                        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
                                    }
                                    throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
                                }
                                throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
                            }
                            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
                        }
                        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
                    }
                    throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
                }
                return;
            }
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
