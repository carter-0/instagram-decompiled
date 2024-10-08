package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Q2D {
    public final C13502TbT A00;
    public final Q2J A01;
    public final BiometricManager A02;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r0.hasEnrolledFingerprints() == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00() {
        /*
            r3 = this;
            X.TbT r0 = r3.A00
            X.Q2E r0 = (X.Q2E) r0
            android.content.Context r1 = r0.A00
            java.lang.Class<android.app.KeyguardManager> r0 = android.app.KeyguardManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            r2 = 0
            if (r0 == 0) goto L_0x0015
            boolean r2 = r0.isDeviceSecure()
        L_0x0015:
            X.Q2J r0 = r3.A01
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = "BiometricManager"
            java.lang.String r0 = "Failure in canAuthenticate(). FingerprintManager was null."
            android.util.Log.e(r1, r0)
            r1 = 1
        L_0x0021:
            r0 = r1
            if (r2 == 0) goto L_0x0028
            r0 = -1
            if (r1 != 0) goto L_0x0028
            r0 = 0
        L_0x0028:
            return r0
        L_0x0029:
            android.content.Context r1 = r0.A00
            android.hardware.fingerprint.FingerprintManager r0 = X.C9166RRr.A00(r1)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isHardwareDetected()
            if (r0 == 0) goto L_0x0047
            android.hardware.fingerprint.FingerprintManager r0 = X.C9166RRr.A00(r1)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.hasEnrolledFingerprints()
            r1 = 0
            if (r0 != 0) goto L_0x0021
        L_0x0044:
            r1 = 11
            goto L_0x0021
        L_0x0047:
            r1 = 12
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q2D.A00():int");
    }

    private int A01() {
        BiometricPrompt.CryptoObject A002;
        Method A022 = Q2F.A02();
        if (!(A022 == null || (A002 = C11365SPf.A00(C11365SPf.A01())) == null)) {
            try {
                Object invoke = A022.invoke(this.A02, new Object[]{A002});
                if (invoke instanceof Integer) {
                    return AnonymousClass7TE.A0M(invoke);
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int A023 = A02();
        if (SPg.A00(((Q2E) this.A00).A00, Build.MODEL) || A023 != 0) {
            return A023;
        }
        return A00();
    }

    private int A02() {
        BiometricManager biometricManager = this.A02;
        if (biometricManager != null) {
            return Q2F.A00(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final int A03(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.A02;
            if (biometricManager != null) {
                return RRX.A00(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        } else if (!RRV.A00(i)) {
            return -2;
        } else {
            Context context = ((Q2E) this.A00).A00;
            Class cls = KeyguardManager.class;
            if (context.getSystemService(cls) == null) {
                return 12;
            }
            if ((32768 & i) != 0) {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(cls);
                if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
                    return 11;
                }
                return 0;
            } else if (i2 == 29) {
                if ((i & 255) == 255) {
                    return A02();
                }
                return A01();
            } else if (context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return 12;
            } else {
                return A00();
            }
        }
    }

    public Q2D(C13502TbT tbT) {
        BiometricManager biometricManager;
        this.A00 = tbT;
        int i = Build.VERSION.SDK_INT;
        Q2J q2j = null;
        if (i >= 29) {
            biometricManager = tbT.Afs();
        } else {
            biometricManager = null;
        }
        this.A02 = biometricManager;
        this.A01 = i <= 29 ? new Q2J(((Q2E) tbT).A00) : q2j;
    }
}
