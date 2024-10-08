package X;

import com.instagram.direct.msys.armadillo.IGSecureMessageMasterKeyProvider;

/* renamed from: X.6Dv  reason: invalid class name and case insensitive filesystem */
public final class C304536Dv {
    public static IGSecureMessageMasterKeyProvider A00;

    public static synchronized void A00() {
        synchronized (C304536Dv.class) {
            IGSecureMessageMasterKeyProvider iGSecureMessageMasterKeyProvider = A00;
            if (iGSecureMessageMasterKeyProvider != null) {
                synchronized (iGSecureMessageMasterKeyProvider) {
                    try {
                        IGSecureMessageMasterKeyProvider.sInitialized = false;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            }
            synchronized (C304546Dw.class) {
                try {
                    C304546Dw.A00 = false;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            A00 = null;
        }
    }
}
