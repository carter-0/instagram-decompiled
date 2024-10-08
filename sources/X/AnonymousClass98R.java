package X;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.98R  reason: invalid class name */
public abstract class AnonymousClass98R {
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
        AnonymousClass979 r2 = AnonymousClass979.A01;
        r2.A01(AnonymousClass98S.A01);
        r2.A02(AnonymousClass98S.A00);
        r2.A01(AnonymousClass98V.A00);
        C3739197l r10 = AnonymousClass98X.A01;
        if (r10.A00()) {
            C3739497o r1 = C3739497o.A01;
            r1.A07(C3742098o.A05);
            r1.A06(C3742098o.A04);
            r1.A05(C3742098o.A03);
            r1.A04(C3742098o.A02);
            r2.A02(AnonymousClass98X.A04);
            r2.A02(AnonymousClass98X.A05);
            AnonymousClass98G r5 = AnonymousClass98G.A01;
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", AnonymousClass990.A01);
            C3742298q r12 = C3742298q.A03;
            C3742598t r8 = C3742598t.A03;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", AnonymousClass991.A00(r8, r12, 32, 16));
            C3742298q r13 = C3742298q.A04;
            hashMap.put("HMAC_SHA256_256BITTAG", AnonymousClass991.A00(r8, r13, 32, 32));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", AnonymousClass991.A00(r8, r12, 32, 32));
            C3742598t r82 = C3742598t.A05;
            hashMap.put("HMAC_SHA512_128BITTAG", AnonymousClass991.A00(r82, r13, 64, 16));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", AnonymousClass991.A00(r82, r12, 64, 16));
            hashMap.put("HMAC_SHA512_256BITTAG", AnonymousClass991.A00(r82, r13, 64, 32));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", AnonymousClass991.A00(r82, r12, 64, 32));
            hashMap.put("HMAC_SHA512_512BITTAG", AnonymousClass990.A04);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", AnonymousClass991.A00(r82, r12, 64, 64));
            r5.A00(Collections.unmodifiableMap(hashMap));
            AnonymousClass98J r83 = AnonymousClass98J.A02;
            Class<C3742798v> cls = C3742798v.class;
            r83.A01(AnonymousClass98X.A02, cls);
            AnonymousClass98I.A01.A00(AnonymousClass98X.A03, cls);
            AnonymousClass98M r3 = AnonymousClass98M.A02;
            r3.A01(AnonymousClass98X.A00, r10, true);
            if (!AnonymousClass97K.A00()) {
                AnonymousClass97I r0 = AnonymousClass995.A02;
                if (C3739197l.A00.A00()) {
                    r1.A07(AnonymousClass99F.A03);
                    r1.A06(AnonymousClass99F.A02);
                    r1.A05(AnonymousClass99F.A01);
                    r1.A04(AnonymousClass99F.A00);
                    r83.A01(AnonymousClass995.A01, AnonymousClass994.class);
                    r2.A02(AnonymousClass995.A02);
                    r2.A02(AnonymousClass995.A03);
                    HashMap hashMap2 = new HashMap();
                    AnonymousClass994 r14 = AnonymousClass990.A00;
                    hashMap2.put("AES_CMAC", r14);
                    hashMap2.put("AES256_CMAC", r14);
                    hashMap2.put("AES256_CMAC_RAW", AnonymousClass993.A00(AnonymousClass992.A03, 32, 16));
                    r5.A00(Collections.unmodifiableMap(hashMap2));
                    r3.A02(AnonymousClass995.A00, true);
                    return;
                }
                throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
            }
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
