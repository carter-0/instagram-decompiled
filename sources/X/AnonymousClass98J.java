package X;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.98J  reason: invalid class name */
public final class AnonymousClass98J {
    public static final C3739097k A01;
    public static final AnonymousClass98J A02;
    public final Map A00 = new HashMap();

    public static synchronized AnonymousClass97G A00(AnonymousClass983 r3, AnonymousClass98J r4) {
        AnonymousClass97G AMH;
        synchronized (r4) {
            C3739097k r0 = (C3739097k) r4.A00.get(r3.getClass());
            if (r0 != null) {
                AMH = r0.AMH(r3, (Integer) null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create a new key for parameters ");
                sb.append(r3);
                sb.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return AMH;
    }

    public final synchronized void A01(C3739097k r3, Class cls) {
        Map map = this.A00;
        C3739097k r0 = (C3739097k) map.get(cls);
        if (r0 == null || r0.equals(r3)) {
            map.put(cls, r3);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Different key creator for parameters class ");
            sb.append(cls);
            sb.append(" already inserted");
            throw new GeneralSecurityException(sb.toString());
        }
    }

    static {
        AnonymousClass98K r2 = new AnonymousClass98K();
        A01 = r2;
        AnonymousClass98J r1 = new AnonymousClass98J();
        try {
            r1.A01(r2, AnonymousClass98L.class);
            A02 = r1;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }
}
