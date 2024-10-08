package X;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: X.98M  reason: invalid class name */
public final class AnonymousClass98M {
    public static final AnonymousClass98M A02 = new AnonymousClass98M();
    public static final Logger A03 = Logger.getLogger(AnonymousClass98M.class.getName());
    public ConcurrentMap A00 = new ConcurrentHashMap();
    public ConcurrentMap A01 = new ConcurrentHashMap();

    public static synchronized C3738697g A00(AnonymousClass98M r2, String str) {
        C3738697g r0;
        synchronized (r2) {
            ConcurrentMap concurrentMap = r2.A00;
            if (concurrentMap.containsKey(str)) {
                r0 = (C3738697g) concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException(002.A0R("No key manager found for key type ", str));
            }
        }
        return r0;
    }

    public final synchronized void A01(C3738697g r8, C3739197l r9, boolean z) {
        GeneralSecurityException th;
        GeneralSecurityException generalSecurityException;
        synchronized (this) {
            if (r9.A00()) {
                try {
                    String str = ((C3738597f) r8).A03;
                    if (z) {
                        ConcurrentMap concurrentMap = this.A01;
                        if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                            generalSecurityException = new GeneralSecurityException(002.A0R("New keys are already disallowed for key type ", str));
                            throw generalSecurityException;
                        }
                    }
                    ConcurrentMap concurrentMap2 = this.A00;
                    C3738697g r0 = (C3738697g) concurrentMap2.get(str);
                    if (r0 != null) {
                        Class<?> cls = r0.getClass();
                        Class<?> cls2 = r8.getClass();
                        if (!cls.equals(cls2)) {
                            A03.warning(002.A0R("Attempted overwrite of a registered key manager for key type ", str));
                            generalSecurityException = new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, cls.getName(), cls2.getName()}));
                            throw generalSecurityException;
                        }
                    }
                    concurrentMap2.putIfAbsent(str, r8);
                    this.A01.put(str, Boolean.valueOf(z));
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                th = new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
                throw th;
            }
        }
    }

    public final synchronized void A02(C3738697g r2, boolean z) {
        A01(r2, C3739197l.A00, z);
    }
}
