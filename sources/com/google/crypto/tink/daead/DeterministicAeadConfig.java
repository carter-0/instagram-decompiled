package com.google.crypto.tink.daead;

import X.AnonymousClass971;
import X.AnonymousClass979;
import X.AnonymousClass97B;
import X.AnonymousClass97I;
import X.AnonymousClass97K;
import X.AnonymousClass97L;
import X.AnonymousClass981;
import X.AnonymousClass98C;
import X.AnonymousClass98G;
import X.AnonymousClass98H;
import X.AnonymousClass98I;
import X.AnonymousClass98J;
import X.AnonymousClass98M;
import X.C3739197l;
import X.C3739497o;
import X.C3740297w;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public abstract class DeterministicAeadConfig {
    @Deprecated
    public static final AnonymousClass971 A00;
    @Deprecated
    public static final AnonymousClass971 A01;

    static {
        AnonymousClass971 r0 = AnonymousClass971.DEFAULT_INSTANCE;
        A01 = r0;
        A00 = r0;
        try {
            A00();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void A00() {
        AnonymousClass979 r2 = AnonymousClass979.A01;
        r2.A01(AnonymousClass97B.A00);
        r2.A02(AnonymousClass97B.A01);
        if (!AnonymousClass97K.A00()) {
            AnonymousClass97I r0 = AnonymousClass97L.A03;
            if (C3739197l.A00.A00()) {
                C3739497o r1 = C3739497o.A01;
                r1.A07(C3740297w.A03);
                r1.A06(C3740297w.A02);
                r1.A05(C3740297w.A01);
                r1.A04(C3740297w.A00);
                r2.A02(AnonymousClass97L.A03);
                AnonymousClass98G r5 = AnonymousClass98G.A01;
                HashMap hashMap = new HashMap();
                hashMap.put("AES256_SIV", AnonymousClass98H.A00);
                hashMap.put("AES256_SIV_RAW", new AnonymousClass981(AnonymousClass98C.A02, 64));
                r5.A00(Collections.unmodifiableMap(hashMap));
                Class<AnonymousClass981> cls = AnonymousClass981.class;
                AnonymousClass98I.A01.A00(AnonymousClass97L.A02, cls);
                AnonymousClass98J.A02.A01(AnonymousClass97L.A01, cls);
                AnonymousClass98M.A02.A02(AnonymousClass97L.A00, true);
                return;
            }
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
    }
}
