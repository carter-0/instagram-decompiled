package androidx.biometric;

import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass2Fj;
import X.AnonymousClass7TF;
import X.C10336RqZ;
import X.C10505RtK;
import X.C10714Rws;
import X.C11365SPf;
import X.C11649Sdr;
import X.C12844TAa;
import X.C13017THz;
import X.C13162TNu;
import X.JTO;
import X.Pxj;
import X.Q2D;
import X.Q2E;
import X.QDG;
import X.S4g;
import X.SPg;
import X.SR5;
import X.TAb;
import X.TAc;
import X.TEI;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import java.util.concurrent.Executor;

public final class BiometricFragment extends Fragment {
    public Handler A00 = AnonymousClass7TF.A0D();
    public QDG A01;

    public final void A07(int i) {
        String string;
        if (i == 3 || !this.A01.A0M) {
            if (A04(this)) {
                this.A01.A00 = i;
                if (i == 1) {
                    Context context = getContext();
                    if (context == null) {
                        string = "";
                    } else {
                        string = context.getString(2131962476);
                    }
                    A03(this, string, 10);
                }
            }
            QDG qdg = this.A01;
            C10505RtK rtK = qdg.A07;
            if (rtK == null) {
                rtK = new C10505RtK();
                qdg.A07 = rtK;
            }
            CancellationSignal cancellationSignal = rtK.A00;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                rtK.A00 = null;
            }
            S4g s4g = rtK.A01;
            if (s4g != null) {
                try {
                    s4g.A00();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                rtK.A01 = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = getParentFragmentManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
            X.QDG r1 = r3.A01
            r0 = 0
            r1.A0N = r0
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L_0x0022
            X.0hq r2 = r3.getParentFragmentManager()
            java.lang.String r0 = "androidx.biometric.FingerprintDialogFragment"
            androidx.fragment.app.Fragment r1 = r2.A0R(r0)
            X.0SM r1 = (X.0SM) r1
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0023
            r1.A08()
        L_0x0022:
            return
        L_0x0023:
            X.0s1 r0 = new X.0s1
            r0.<init>(r2)
            r0.A03(r1)
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A00():void");
    }

    public static void A02(BiometricFragment biometricFragment, C10336RqZ rqZ) {
        QDG qdg = biometricFragment.A01;
        if (!qdg.A0I) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            qdg.A0I = false;
            Executor executor = qdg.A0H;
            if (executor == null) {
                executor = new C13162TNu();
            }
            executor.execute(new TEI(biometricFragment, rqZ));
        }
        biometricFragment.A05();
    }

    public static void A03(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        QDG qdg = biometricFragment.A01;
        if (qdg.A0J) {
            return;
        }
        if (!qdg.A0I) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        qdg.A0I = false;
        Executor executor = qdg.A0H;
        if (executor == null) {
            executor = new C13162TNu();
        }
        executor.execute(new C13017THz(biometricFragment, charSequence, i));
    }

    public final void A05() {
        this.A01.A0N = false;
        A00();
        if (!this.A01.A0J && isAdded()) {
            0s1 r0 = new 0s1(getParentFragmentManager());
            r0.A03(this);
            r0.A01();
        }
        Context context = getContext();
        if (context != null && SPg.A01(context, Build.MODEL)) {
            QDG qdg = this.A01;
            qdg.A0K = true;
            this.A00.postDelayed(new TAb(qdg), 600);
        }
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.Object, X.S4g] */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0169, code lost:
        if (r2 != false) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r13 = this;
            X.QDG r1 = r13.A01
            boolean r1 = r1.A0N
            if (r1 != 0) goto L_0x0013
            android.content.Context r1 = r13.getContext()
            if (r1 != 0) goto L_0x0014
            java.lang.String r2 = "BiometricFragment"
            java.lang.String r1 = "Not showing biometric prompt. Context is null."
            android.util.Log.w(r2, r1)
        L_0x0013:
            return
        L_0x0014:
            X.QDG r1 = r13.A01
            r4 = 1
            r1.A0N = r4
            r1.A0I = r4
            boolean r2 = A04(r13)
            android.content.Context r1 = r13.requireContext()
            if (r2 == 0) goto L_0x010c
            android.content.Context r5 = r1.getApplicationContext()
            android.hardware.fingerprint.FingerprintManager r1 = X.C9166RRr.A00(r5)
            if (r1 == 0) goto L_0x00f7
            boolean r1 = r1.isHardwareDetected()
            if (r1 == 0) goto L_0x00f7
            android.hardware.fingerprint.FingerprintManager r1 = X.C9166RRr.A00(r5)
            if (r1 == 0) goto L_0x00fa
            boolean r1 = r1.hasEnrolledFingerprints()
            if (r1 == 0) goto L_0x00fa
            boolean r1 = r13.isAdded()
            if (r1 == 0) goto L_0x0013
            X.QDG r1 = r13.A01
            r1.A0L = r4
            java.lang.String r1 = android.os.Build.MODEL
            boolean r1 = X.SPg.A02(r5, r1)
            if (r1 != 0) goto L_0x006d
            android.os.Handler r6 = r13.A00
            X.TAZ r3 = new X.TAZ
            r3.<init>(r13)
            r1 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r3, r1)
            androidx.biometric.FingerprintDialogFragment r3 = new androidx.biometric.FingerprintDialogFragment
            r3.<init>()
            X.0hq r2 = r13.getParentFragmentManager()
            java.lang.String r1 = "androidx.biometric.FingerprintDialogFragment"
            r3.A0B(r2, r1)
        L_0x006d:
            X.QDG r1 = r13.A01
            r10 = 0
            r1.A00 = r10
            X.SR5 r1 = r1.A05
            X.SNP r6 = X.C11365SPf.A03(r1)
            X.QDG r3 = r13.A01
            X.RtK r1 = r3.A07
            if (r1 != 0) goto L_0x0085
            X.RtK r1 = new X.RtK
            r1.<init>()
            r3.A07 = r1
        L_0x0085:
            X.S4g r7 = r1.A01
            if (r7 != 0) goto L_0x0090
            X.S4g r7 = new X.S4g
            r7.<init>()
            r1.A01 = r7
        L_0x0090:
            X.RtJ r2 = r3.A03
            if (r2 != 0) goto L_0x00a0
            X.QAS r1 = new X.QAS
            r1.<init>(r3)
            X.RtJ r2 = new X.RtJ
            r2.<init>(r1)
            r3.A03 = r2
        L_0x00a0:
            X.SDP r3 = r2.A01
            if (r3 != 0) goto L_0x00ab
            X.SDP r3 = new X.SDP
            r3.<init>(r2)
            r2.A01 = r3
        L_0x00ab:
            r12 = 0
            monitor-enter(r7)     // Catch:{ NullPointerException -> 0x01f9 }
            java.lang.Object r1 = r7.A00     // Catch:{ all -> 0x00f4 }
            if (r1 != 0) goto L_0x00bf
            android.os.CancellationSignal r2 = new android.os.CancellationSignal     // Catch:{ all -> 0x00f4 }
            r2.<init>()     // Catch:{ all -> 0x00f4 }
            r7.A00 = r2     // Catch:{ all -> 0x00f4 }
            boolean r1 = r7.A02     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x00bf
            r2.cancel()     // Catch:{ all -> 0x00f4 }
        L_0x00bf:
            java.lang.Object r9 = r7.A00     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f4 }
            android.os.CancellationSignal r9 = (android.os.CancellationSignal) r9     // Catch:{ NullPointerException -> 0x01f9 }
            android.hardware.fingerprint.FingerprintManager r7 = X.C9166RRr.A00(r5)     // Catch:{ NullPointerException -> 0x01f9 }
            if (r7 == 0) goto L_0x0013
            r8 = 0
            if (r6 == 0) goto L_0x00d6
            javax.crypto.Cipher r1 = r6.A01     // Catch:{ NullPointerException -> 0x01f9 }
            if (r1 == 0) goto L_0x00df
            android.hardware.fingerprint.FingerprintManager$CryptoObject r8 = new android.hardware.fingerprint.FingerprintManager$CryptoObject     // Catch:{ NullPointerException -> 0x01f9 }
            r8.<init>(r1)     // Catch:{ NullPointerException -> 0x01f9 }
        L_0x00d6:
            X.Q6b r11 = new X.Q6b     // Catch:{ NullPointerException -> 0x01f9 }
            r11.<init>(r3)     // Catch:{ NullPointerException -> 0x01f9 }
            r7.authenticate(r8, r9, r10, r11, r12)     // Catch:{ NullPointerException -> 0x01f9 }
            goto L_0x00f3
        L_0x00df:
            java.security.Signature r1 = r6.A00     // Catch:{ NullPointerException -> 0x01f9 }
            if (r1 == 0) goto L_0x00e9
            android.hardware.fingerprint.FingerprintManager$CryptoObject r8 = new android.hardware.fingerprint.FingerprintManager$CryptoObject     // Catch:{ NullPointerException -> 0x01f9 }
            r8.<init>(r1)     // Catch:{ NullPointerException -> 0x01f9 }
            goto L_0x00d6
        L_0x00e9:
            javax.crypto.Mac r1 = r6.A02     // Catch:{ NullPointerException -> 0x01f9 }
            if (r1 == 0) goto L_0x00d6
            android.hardware.fingerprint.FingerprintManager$CryptoObject r8 = new android.hardware.fingerprint.FingerprintManager$CryptoObject     // Catch:{ NullPointerException -> 0x01f9 }
            r8.<init>(r1)     // Catch:{ NullPointerException -> 0x01f9 }
            goto L_0x00d6
        L_0x00f3:
            return
        L_0x00f4:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f4 }
            throw r1     // Catch:{ NullPointerException -> 0x01f9 }
        L_0x00f7:
            r4 = 12
            goto L_0x00fc
        L_0x00fa:
            r4 = 11
        L_0x00fc:
            if (r5 == 0) goto L_0x01f6
            r0 = 11
            if (r0 == r4) goto L_0x0107
            r1 = 2131962473(0x7f132a69, float:1.9561672E38)
            goto L_0x0206
        L_0x0107:
            r1 = 2131962475(0x7f132a6b, float:1.9561676E38)
            goto L_0x0206
        L_0x010c:
            android.content.Context r1 = r1.getApplicationContext()
            android.hardware.biometrics.BiometricPrompt$Builder r6 = new android.hardware.biometrics.BiometricPrompt$Builder
            r6.<init>(r1)
            X.QDG r1 = r13.A01
            X.Rws r1 = r1.A06
            if (r1 == 0) goto L_0x0129
            java.lang.CharSequence r2 = r1.A03
            java.lang.CharSequence r1 = r1.A01
            if (r2 == 0) goto L_0x0124
            r6.setTitle(r2)
        L_0x0124:
            if (r1 == 0) goto L_0x0129
            r6.setDescription(r1)
        L_0x0129:
            X.QDG r2 = r13.A01
            java.lang.CharSequence r1 = r2.A0G
            if (r1 != 0) goto L_0x0139
            X.Rws r1 = r2.A06
            if (r1 == 0) goto L_0x01d9
            java.lang.CharSequence r1 = r1.A02
            if (r1 != 0) goto L_0x0139
            java.lang.String r1 = ""
        L_0x0139:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x015a
            X.QDG r2 = r13.A01
            java.util.concurrent.Executor r5 = r2.A0H
            if (r5 != 0) goto L_0x014a
            X.TNu r5 = new X.TNu
            r5.<init>()
        L_0x014a:
            X.QDG r3 = r13.A01
            android.content.DialogInterface$OnClickListener r2 = r3.A02
            if (r2 != 0) goto L_0x0157
            X.SUy r2 = new X.SUy
            r2.<init>(r3)
            r3.A02 = r2
        L_0x0157:
            r6.setNegativeButton(r1, r5, r2)
        L_0x015a:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r5 < r3) goto L_0x016f
            X.QDG r1 = r13.A01
            X.Rws r1 = r1.A06
            if (r1 == 0) goto L_0x016b
            boolean r2 = r1.A04
            r1 = 0
            if (r2 == 0) goto L_0x016c
        L_0x016b:
            r1 = 1
        L_0x016c:
            X.C11046S7p.A00(r6, r1)
        L_0x016f:
            X.QDG r1 = r13.A01
            int r2 = r1.A01()
            r1 = 30
            if (r5 < r1) goto L_0x01cb
            X.RRW.A00(r6, r2)
        L_0x017c:
            android.hardware.biometrics.BiometricPrompt r9 = r6.build()
            android.content.Context r7 = r13.getContext()
            X.QDG r1 = r13.A01
            X.SR5 r1 = r1.A05
            android.hardware.biometrics.BiometricPrompt$CryptoObject r8 = X.C11365SPf.A00(r1)
            X.QDG r2 = r13.A01
            X.RtK r1 = r2.A07
            if (r1 != 0) goto L_0x0199
            X.RtK r1 = new X.RtK
            r1.<init>()
            r2.A07 = r1
        L_0x0199:
            android.os.CancellationSignal r6 = r1.A00
            if (r6 != 0) goto L_0x01a4
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r1.A00 = r6
        L_0x01a4:
            X.TNt r5 = new X.TNt
            r5.<init>()
            X.QDG r2 = r13.A01
            X.RtJ r3 = r2.A03
            if (r3 != 0) goto L_0x01bb
            X.QAS r1 = new X.QAS
            r1.<init>(r2)
            X.RtJ r3 = new X.RtJ
            r3.<init>(r1)
            r2.A03 = r3
        L_0x01bb:
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r1 = r3.A00
            if (r1 != 0) goto L_0x01c8
            X.RRK r2 = r3.A02
            X.Q6a r1 = new X.Q6a
            r1.<init>(r2)
            r3.A00 = r1
        L_0x01c8:
            if (r8 != 0) goto L_0x01e0
            goto L_0x01dc
        L_0x01cb:
            if (r5 < r3) goto L_0x017c
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass7TF.A1P(r2)
            X.C11046S7p.A01(r6, r1)
            goto L_0x017c
        L_0x01d9:
            r1 = 0
            goto L_0x0139
        L_0x01dc:
            r9.authenticate(r6, r5, r1)     // Catch:{ NullPointerException -> 0x01e4 }
            return
        L_0x01e0:
            r9.authenticate(r8, r6, r5, r1)     // Catch:{ NullPointerException -> 0x01e4 }
            goto L_0x0211
        L_0x01e4:
            r3 = move-exception
            java.lang.String r2 = "BiometricFragment"
            java.lang.String r1 = "Got NPE while authenticating with biometric prompt."
            android.util.Log.e(r2, r1, r3)
            if (r7 == 0) goto L_0x01f6
            r1 = 2131957517(0x7f13170d, float:1.955162E38)
            java.lang.String r1 = r7.getString(r1)
            goto L_0x020a
        L_0x01f6:
            java.lang.String r1 = ""
            goto L_0x020a
        L_0x01f9:
            r3 = move-exception
            java.lang.String r2 = "BiometricFragment"
            java.lang.String r1 = "Got NPE while authenticating with fingerprint."
            android.util.Log.e(r2, r1, r3)
            if (r5 == 0) goto L_0x01f6
            r1 = 2131962472(0x7f132a68, float:1.956167E38)
        L_0x0206:
            java.lang.String r1 = r5.getString(r1)
        L_0x020a:
            A03(r13, r1, r4)
            r13.A05()
            return
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A06():void");
    }

    public final boolean A0A() {
        if (Build.VERSION.SDK_INT > 28 || (this.A01.A01() & Constants.LOAD_RESULT_PGO) == 0) {
            return false;
        }
        return true;
    }

    public static void A01(BiometricFragment biometricFragment) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        int i2;
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService(KeyguardManager.class);
        if (keyguardManager == null) {
            i = 12;
            i2 = 2131963047;
        } else {
            C10714Rws rws = biometricFragment.A01.A06;
            if (rws != null) {
                charSequence = rws.A03;
                charSequence2 = rws.A01;
            } else {
                charSequence = null;
                charSequence2 = null;
            }
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
            if (createConfirmDeviceCredentialIntent == null) {
                i = 14;
                i2 = 2131963046;
            } else {
                biometricFragment.A01.A0J = true;
                if (A04(biometricFragment)) {
                    biometricFragment.A00();
                }
                createConfirmDeviceCredentialIntent.setFlags(134742016);
                biometricFragment.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                return;
            }
        }
        A03(biometricFragment, biometricFragment.getString(i2), i);
        biometricFragment.A05();
    }

    public static boolean A04(BiometricFragment biometricFragment) {
        FragmentActivity activity = biometricFragment.getActivity();
        if (activity != null && biometricFragment.A01.A05 != null && SPg.A03(activity, Build.MANUFACTURER, Build.MODEL)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Context context = biometricFragment.getContext();
        if (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r1 != 3) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d4, code lost:
        if (X.SPg.A02(r1, android.os.Build.MODEL) == false) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(int r5, java.lang.CharSequence r6) {
        /*
            r4 = this;
            switch(r5) {
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0003;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r5 = 8
        L_0x0005:
            android.content.Context r2 = r4.getContext()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x0038
            r0 = 7
            if (r5 == r0) goto L_0x0016
            r0 = 9
            if (r5 != r0) goto L_0x0038
        L_0x0016:
            if (r2 == 0) goto L_0x0038
            java.lang.Class<android.app.KeyguardManager> r0 = android.app.KeyguardManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isDeviceSecure()
            if (r0 == 0) goto L_0x0038
            X.QDG r0 = r4.A01
            int r1 = r0.A01()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0038
            A01(r4)
            return
        L_0x0038:
            boolean r0 = A04(r4)
            if (r0 == 0) goto L_0x008b
            if (r6 != 0) goto L_0x0048
            android.content.Context r2 = r4.getContext()
            if (r2 != 0) goto L_0x005b
            java.lang.String r6 = ""
        L_0x0048:
            r1 = 5
            X.QDG r0 = r4.A01
            if (r5 != r1) goto L_0x009b
            int r1 = r0.A00
            if (r1 == 0) goto L_0x0054
            r0 = 3
            if (r1 != r0) goto L_0x0057
        L_0x0054:
            A03(r4, r6, r5)
        L_0x0057:
            r4.A05()
            return
        L_0x005b:
            r0 = 1
            if (r5 == r0) goto L_0x0087
            r0 = 7
            if (r5 == r0) goto L_0x0083
            switch(r5) {
                case 9: goto L_0x0083;
                case 10: goto L_0x007f;
                case 11: goto L_0x007b;
                case 12: goto L_0x0077;
                default: goto L_0x0064;
            }
        L_0x0064:
            java.lang.String r0 = "Unknown error code: "
            java.lang.String r1 = X.002.A0O(r0, r5)
            java.lang.String r0 = "BiometricUtils"
            android.util.Log.e(r0, r1)
            r0 = 2131957517(0x7f13170d, float:1.955162E38)
        L_0x0072:
            java.lang.String r6 = r2.getString(r0)
            goto L_0x0048
        L_0x0077:
            r0 = 2131962473(0x7f132a69, float:1.9561672E38)
            goto L_0x0072
        L_0x007b:
            r0 = 2131962475(0x7f132a6b, float:1.9561676E38)
            goto L_0x0072
        L_0x007f:
            r0 = 2131962476(0x7f132a6c, float:1.9561678E38)
            goto L_0x0072
        L_0x0083:
            r0 = 2131962474(0x7f132a6a, float:1.9561674E38)
            goto L_0x0072
        L_0x0087:
            r0 = 2131962472(0x7f132a68, float:1.956167E38)
            goto L_0x0072
        L_0x008b:
            if (r6 != 0) goto L_0x0054
            r0 = 2131957517(0x7f13170d, float:1.955162E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r0 = " "
            java.lang.String r6 = X.002.A0b(r1, r0, r5)
            goto L_0x0054
        L_0x009b:
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x00ab
            A03(r4, r6, r5)
            r4.A05()
        L_0x00a5:
            X.QDG r1 = r4.A01
            r0 = 1
            r1.A0L = r0
            return
        L_0x00ab:
            r2 = r6
            if (r6 != 0) goto L_0x00b5
            r0 = 2131957517(0x7f13170d, float:1.955162E38)
            java.lang.String r2 = r4.getString(r0)
        L_0x00b5:
            X.QDG r1 = r4.A01
            r0 = 2
            r1.A02(r0)
            X.QDG r0 = r4.A01
            r0.A03(r2)
            android.os.Handler r3 = r4.A00
            X.TI0 r2 = new X.TI0
            r2.<init>(r4, r6, r5)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = android.os.Build.MODEL
            boolean r1 = X.SPg.A02(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x00d8
        L_0x00d6:
            r0 = 2000(0x7d0, float:2.803E-42)
        L_0x00d8:
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A08(int, java.lang.CharSequence):void");
    }

    public final void A09(SR5 sr5, C10714Rws rws) {
        String str;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        QDG qdg = this.A01;
        qdg.A06 = rws;
        int i = rws.A00;
        if (i == 0) {
            i = 255;
            if (sr5 != null) {
                i = 15;
            }
        }
        if (Build.VERSION.SDK_INT < 30 && i == 15 && sr5 == null) {
            sr5 = C11365SPf.A01();
        }
        qdg.A05 = sr5;
        boolean A0A = A0A();
        QDG qdg2 = this.A01;
        if (A0A) {
            str = getString(2131956483);
        } else {
            str = null;
        }
        qdg2.A0G = str;
        if (A0A() && new Q2D(new Q2E(activity)).A03(255) != 0) {
            this.A01.A0I = true;
            A01(this);
        } else if (this.A01.A0K) {
            this.A00.postDelayed(new C12844TAa(this), 600);
        } else {
            A06();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        BiometricFragment.super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.A01.A0J = false;
            if (i2 == -1) {
                A02(this, new C10336RqZ((SR5) null, 1));
                return;
            }
            A03(this, getString(2131963048), 10);
            A05();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, androidx.biometric.BiometricFragment] */
    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-847091015);
        BiometricFragment.super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            QDG A0M = Pxj.A0M(activity);
            this.A01 = A0M;
            AnonymousClass2Fj r1 = A0M.A0A;
            if (r1 == null) {
                r1 = JTO.A0K();
                A0M.A0A = r1;
            }
            C11649Sdr.A01(this, r1, 0);
            QDG qdg = this.A01;
            AnonymousClass2Fj r12 = qdg.A08;
            if (r12 == null) {
                r12 = JTO.A0K();
                qdg.A08 = r12;
            }
            C11649Sdr.A01(this, r12, 1);
            QDG qdg2 = this.A01;
            AnonymousClass2Fj r13 = qdg2.A09;
            if (r13 == null) {
                r13 = JTO.A0K();
                qdg2.A09 = r13;
            }
            C11649Sdr.A01(this, r13, 2);
            QDG qdg3 = this.A01;
            AnonymousClass2Fj r14 = qdg3.A0D;
            if (r14 == null) {
                r14 = JTO.A0K();
                qdg3.A0D = r14;
            }
            C11649Sdr.A01(this, r14, 3);
            QDG qdg4 = this.A01;
            AnonymousClass2Fj r15 = qdg4.A0F;
            if (r15 == null) {
                r15 = JTO.A0K();
                qdg4.A0F = r15;
            }
            C11649Sdr.A01(this, r15, 4);
            QDG qdg5 = this.A01;
            AnonymousClass2Fj r16 = qdg5.A0E;
            if (r16 == null) {
                r16 = JTO.A0K();
                qdg5.A0E = r16;
            }
            C11649Sdr.A01(this, r16, 5);
        }
        AnonymousClass0fD.A09(-1337394849, A02);
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(-18546844);
        BiometricFragment.super.onStart();
        if (Build.VERSION.SDK_INT == 29) {
            QDG qdg = this.A01;
            if ((qdg.A01() & Constants.LOAD_RESULT_PGO) != 0) {
                qdg.A0M = true;
                this.A00.postDelayed(new TAc(qdg), 250);
            }
        }
        AnonymousClass0fD.A09(-892217803, A02);
    }

    public final void onStop() {
        FragmentActivity activity;
        int A02 = AnonymousClass0fD.A02(-575955297);
        BiometricFragment.super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J && ((activity = getActivity()) == null || !activity.isChangingConfigurations())) {
            A07(0);
        }
        AnonymousClass0fD.A09(-868057281, A02);
    }
}
