package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class STX {
    public int A00;
    public Context A01;
    public C13891TjE A02;
    public RLM A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public ExecutorService A0F;
    public final String A0G;
    public final Handler A0H;
    public volatile int A0I;
    public volatile C10770Rxo A0J;
    public volatile zzs A0K;
    public volatile C11439SVa A0L;

    public STX() {
    }

    public final void A08(C10158RnZ rnZ, C13521Tbq tbq) {
        C11230SGo A012;
        C13891TjE tjE;
        int i;
        if (!A0F()) {
            tjE = this.A02;
            i = 2;
            A012 = C10139RnG.A0D;
        } else if (TextUtils.isEmpty(rnZ.A00)) {
            SUN.A0A("BillingClient", "Please provide a valid purchase token.");
            tjE = this.A02;
            i = 26;
            A012 = C10139RnG.A0A;
        } else if (!this.A06) {
            tjE = this.A02;
            i = 27;
            A012 = C10139RnG.A03;
        } else {
            TNQ tnq = new TNQ(rnZ, tbq, this);
            if (A02(A00(this), this, new TFA(tbq, this), tnq, 30000) == null) {
                A012 = A01(this);
                tjE = this.A02;
                i = 25;
            } else {
                return;
            }
        }
        Pxf.A1C(A012, tjE, i, 3);
        tbq.Ct9(A012);
    }

    public final void A0A(C10159Rna rna, C13522Tbr tbr) {
        C11230SGo A012;
        C13891TjE tjE;
        int i;
        if (!A0F()) {
            tjE = this.A02;
            i = 2;
            A012 = C10139RnG.A0D;
        } else {
            TNL tnl = new TNL(this, rna, tbr);
            if (A02(A00(this), this, new TI9(this, rna, tbr), tnl, 30000) == null) {
                A012 = A01(this);
                tjE = this.A02;
                i = 25;
            } else {
                return;
            }
        }
        Pxf.A1C(A012, tjE, i, 4);
        tbr.D5u(A012, rna.A00);
    }

    public final void A0B(C13523Tbs tbs, C10161Rnc rnc) {
        C11230SGo A012;
        C13891TjE tjE;
        int i;
        if (!A0F()) {
            tjE = this.A02;
            i = 2;
            A012 = C10139RnG.A0D;
        } else if (!this.A0B) {
            SUN.A0A("BillingClient", "Querying product details is not supported.");
            tjE = this.A02;
            i = 20;
            A012 = C10139RnG.A0J;
        } else {
            TNM tnm = new TNM(this, tbs, rnc);
            if (A02(A00(this), this, new TF8(this, tbs), tnm, 30000) == null) {
                A012 = A01(this);
                tjE = this.A02;
                i = 25;
            } else {
                return;
            }
        }
        Pxf.A1C(A012, tjE, i, 7);
        tbs.DZr(A012, AnonymousClass7TE.A1C());
    }

    @Deprecated
    public final void A0C(C13524Tbt tbt, String str) {
        C11230SGo A012;
        C13891TjE tjE;
        int i;
        if (!A0F()) {
            tjE = this.A02;
            i = 2;
            A012 = C10139RnG.A0D;
        } else {
            TNO tno = new TNO(this, tbt, str);
            if (A02(A00(this), this, new TF7(this, tbt), tno, 30000) == null) {
                A012 = A01(this);
                tjE = this.A02;
                i = 25;
            } else {
                return;
            }
        }
        Pxf.A1C(A012, tjE, i, 11);
        tbt.Db1(A012, (List) null);
    }

    @Deprecated
    public final void A0E(C10358Rqv rqv, C13527Tbw tbw) {
        C11230SGo A012;
        C13891TjE tjE;
        int i;
        if (!A0F()) {
            tjE = this.A02;
            i = 2;
            A012 = C10139RnG.A0D;
        } else {
            String str = rqv.A00;
            List list = rqv.A01;
            if (TextUtils.isEmpty(str)) {
                SUN.A0A("BillingClient", "Please fix the input params. SKU type can't be empty.");
                tjE = this.A02;
                i = 49;
                A012 = C10139RnG.A07;
            } else if (list == null) {
                SUN.A0A("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                tjE = this.A02;
                i = 48;
                A012 = C10139RnG.A06;
            } else {
                C13143TNb tNb = new C13143TNb(this, tbw, str, list);
                if (A02(A00(this), this, new TFC(this, tbw), tNb, 30000) == null) {
                    A012 = A01(this);
                    tjE = this.A02;
                    i = 25;
                } else {
                    return;
                }
            }
        }
        Pxf.A1C(A012, tjE, i, 8);
        tbw.DlO(A012, (List) null);
    }

    public final boolean A0F() {
        return (this.A0I != 2 || this.A0K == null || this.A0L == null) ? false : true;
    }

    public STX(Context context, C13526Tbv tbv, RLM rlm) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            str = "6.2.1";
        }
        this.A0I = 0;
        this.A0H = AnonymousClass7TF.A0D();
        this.A00 = 0;
        this.A0G = str;
        this.A01 = context.getApplicationContext();
        C8575QxD A002 = C8584QxM.A00();
        A002.A07(str);
        A002.A06(this.A01.getPackageName());
        C11839ShR shR = new C11839ShR(this.A01, (C8584QxM) A002.A01());
        this.A02 = shR;
        this.A0J = new C10770Rxo(this.A01, tbv, shR);
        this.A03 = rlm;
        this.A01.getPackageName();
    }

    public static final C11230SGo A01(STX stx) {
        if (stx.A0I == 0 || stx.A0I == 3) {
            return C10139RnG.A0D;
        }
        return C10139RnG.A0B;
    }

    public static final Future A02(Handler handler, STX stx, Runnable runnable, Callable callable, long j) {
        ExecutorService executorService = stx.A0F;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(SUN.A00, new TON());
            stx.A0F = executorService;
        }
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new TFB(runnable, submit), (long) (((double) j) * 0.95d));
            return submit;
        } catch (Exception e) {
            SUN.A0B("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.QxN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.QxN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.QxN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.QxN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.QxQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.QxQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.QxQ} */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(X.C11230SGo r10) {
        /*
            r9 = this;
            r8 = 20
            int r0 = r10.A00
            r5 = 0
            java.lang.String r4 = "Unable to create logging payload"
            java.lang.String r3 = "BillingLogger"
            r7 = 5
            if (r0 == 0) goto L_0x004b
            X.TjE r6 = r9.A02
            X.SPi r0 = X.SPi.$redex_init_class
            X.QxE r2 = X.C8588QxQ.A00()     // Catch:{ Exception -> 0x0043 }
            X.QxF r1 = X.C8587QxP.A00()     // Catch:{ Exception -> 0x0043 }
            int r0 = r10.A00     // Catch:{ Exception -> 0x0043 }
            r1.A06(r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = r10.A01     // Catch:{ Exception -> 0x0043 }
            r1.A08(r0)     // Catch:{ Exception -> 0x0043 }
            r1.A07(r8)     // Catch:{ Exception -> 0x0043 }
            r2.A07(r1)     // Catch:{ Exception -> 0x0043 }
            r2.A06(r7)     // Catch:{ Exception -> 0x0043 }
            X.QxB r0 = X.C8582QxK.A00()     // Catch:{ Exception -> 0x0043 }
            r0.A06()     // Catch:{ Exception -> 0x0043 }
            X.Qx1 r0 = r0.A01()     // Catch:{ Exception -> 0x0043 }
            X.QxK r0 = (X.C8582QxK) r0     // Catch:{ Exception -> 0x0043 }
            r2.A08(r0)     // Catch:{ Exception -> 0x0043 }
            X.Qx1 r0 = r2.A01()     // Catch:{ Exception -> 0x0043 }
            X.QxQ r0 = (X.C8588QxQ) r0     // Catch:{ Exception -> 0x0043 }
            r5 = r0
            goto L_0x0047
        L_0x0043:
            r0 = move-exception
            X.SUN.A0B(r3, r4, r0)
        L_0x0047:
            r6.FP8(r5)
            return
        L_0x004b:
            X.TjE r2 = r9.A02
            X.SPi r0 = X.SPi.$redex_init_class
            X.QxC r1 = X.C8585QxN.A00()     // Catch:{ Exception -> 0x006e }
            r1.A06(r7)     // Catch:{ Exception -> 0x006e }
            X.QxB r0 = X.C8582QxK.A00()     // Catch:{ Exception -> 0x006e }
            r0.A06()     // Catch:{ Exception -> 0x006e }
            X.Qx1 r0 = r0.A01()     // Catch:{ Exception -> 0x006e }
            X.QxK r0 = (X.C8582QxK) r0     // Catch:{ Exception -> 0x006e }
            r1.A07(r0)     // Catch:{ Exception -> 0x006e }
            X.Qx1 r0 = r1.A01()     // Catch:{ Exception -> 0x006e }
            X.QxN r0 = (X.C8585QxN) r0     // Catch:{ Exception -> 0x006e }
            r5 = r0
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            X.SUN.A0B(r3, r4, r0)
        L_0x0072:
            r2.FPK(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STX.A04(X.SGo):void");
    }

    public final void A07() {
        this.A02.FPK(SPi.A01(12));
        try {
            if (this.A0J != null) {
                C10770Rxo rxo = this.A0J;
                Q6C q6c = rxo.A04;
                Context context = rxo.A01;
                q6c.A01(context);
                rxo.A05.A01(context);
            }
            if (this.A0L != null) {
                C11439SVa sVa = this.A0L;
                synchronized (sVa.A02) {
                    sVa.A00 = null;
                    sVa.A01 = true;
                }
            }
            if (!(this.A0L == null || this.A0K == null)) {
                SUN.A09("BillingClient", "Unbinding from service.");
                this.A01.unbindService(this.A0L);
                this.A0L = null;
            }
            this.A0K = null;
            ExecutorService executorService = this.A0F;
            if (executorService != null) {
                executorService.shutdownNow();
                this.A0F = null;
            }
        } catch (Exception e) {
            try {
                SUN.A0B("BillingClient", "There was an exception while ending connection!", e);
            } catch (Throwable th) {
                this.A0I = 3;
                throw th;
            }
        }
        this.A0I = 3;
    }

    public final void A0D(C13525Tbu tbu, C10162Rnd rnd) {
        C11230SGo A012;
        C13891TjE tjE;
        int i;
        String str = rnd.A00;
        if (!A0F()) {
            tjE = this.A02;
            i = 2;
            A012 = C10139RnG.A0D;
        } else if (TextUtils.isEmpty(str)) {
            SUN.A0A("BillingClient", "Please provide a valid product type.");
            tjE = this.A02;
            i = 50;
            A012 = C10139RnG.A08;
        } else {
            TNN tnn = new TNN(this, tbu, str);
            if (A02(A00(this), this, new TF6(this, tbu), tnn, 30000) == null) {
                A012 = A01(this);
                tjE = this.A02;
                i = 25;
            } else {
                return;
            }
        }
        Pxf.A1C(A012, tjE, i, 9);
        tbu.Db6(A012, C8553Qwr.A00());
    }

    public static final Handler A00(STX stx) {
        if (Looper.myLooper() == null) {
            return stx.A0H;
        }
        return new Handler(Looper.myLooper());
    }

    private final void A03(C11230SGo sGo) {
        if (!Thread.interrupted()) {
            this.A0H.post(new TF9(this, sGo));
        }
    }

    public final C11230SGo A05() {
        C11230SGo sGo;
        if (!A0F()) {
            C11230SGo sGo2 = C10139RnG.A0D;
            if (sGo2.A00 != 0) {
                Pxf.A1C(sGo2, this.A02, 2, 5);
                return sGo2;
            }
            this.A02.FPK(SPi.A01(5));
            return sGo2;
        }
        if (this.A0B) {
            sGo = C10139RnG.A0C;
        } else {
            sGo = C10139RnG.A0J;
        }
        A04(sGo);
        return sGo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.TNP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: X.TNl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.TNl} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0314, code lost:
        if (r2.isEmpty() == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r9.A05 == false) goto L_0x0096;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C11230SGo A06(android.app.Activity r38, X.C10767Rxl r39) {
        /*
            r37 = this;
            java.lang.String r34 = "proxyPackageVersion"
            java.lang.String r33 = "BUY_INTENT"
            r5 = r37
            X.Rxo r0 = r5.A0J
            r4 = 2
            if (r0 == 0) goto L_0x0487
            boolean r0 = r5.A0F()
            if (r0 != 0) goto L_0x0021
            X.TjE r3 = r5.A02
            X.SGo r2 = X.C10139RnG.A0D
            X.QxQ r0 = X.SPi.A00(r2, r4, r4)
        L_0x001a:
            r3.FP8(r0)
            r5.A03(r2)
            return r2
        L_0x0021:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            r9 = r39
            java.util.ArrayList r0 = r9.A04
            r11.addAll(r0)
            X.Qwr r0 = r9.A01
            r35 = r0
            r32 = 0
            java.lang.Object r10 = X.C9722Rff.A00(r11)
            com.android.billingclient.api.SkuDetails r10 = (com.android.billingclient.api.SkuDetails) r10
            java.lang.Object r8 = X.C9722Rff.A00(r35)
            X.Rqt r8 = (X.C10356Rqt) r8
            if (r10 == 0) goto L_0x0071
            org.json.JSONObject r1 = r10.A00
            java.lang.String r0 = "productId"
            java.lang.String r31 = r1.optString(r0)
            java.lang.String r0 = "type"
            java.lang.String r30 = r1.optString(r0)
        L_0x0050:
            java.lang.String r1 = "subs"
            r0 = r30
            boolean r0 = r0.equals(r1)
            r1 = 9
            java.lang.String r7 = "BillingClient"
            if (r0 == 0) goto L_0x007c
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "Current client doesn't support subscriptions."
            X.SUN.A0A(r7, r0)
            X.TjE r3 = r5.A02
            X.SGo r2 = X.C10139RnG.A0F
            X.QxQ r0 = X.SPi.A00(r2, r1, r4)
            goto L_0x001a
        L_0x0071:
            X.S74 r1 = r8.A00
            java.lang.String r0 = r1.A00
            r31 = r0
            java.lang.String r0 = r1.A01
            r30 = r0
            goto L_0x0050
        L_0x007c:
            java.lang.String r0 = r9.A02
            if (r0 != 0) goto L_0x0460
            java.lang.String r0 = r9.A03
            if (r0 != 0) goto L_0x0460
            X.Rvr r1 = r9.A00
            java.lang.String r0 = r1.A03
            if (r0 != 0) goto L_0x0460
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0460
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0460
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x0460
        L_0x0096:
            int r0 = r11.size()
            r13 = 1
            if (r0 <= r13) goto L_0x00b2
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            X.SUN.A0A(r7, r0)
            X.TjE r3 = r5.A02
            r0 = 19
            X.SGo r2 = X.C10139RnG.A0H
        L_0x00ac:
            X.QxQ r0 = X.SPi.A00(r2, r0, r4)
            goto L_0x001a
        L_0x00b2:
            boolean r0 = r35.isEmpty()
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x00c8
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            X.SUN.A0A(r7, r0)
            X.TjE r3 = r5.A02
            r0 = 20
            X.SGo r2 = X.C10139RnG.A0J
            goto L_0x00ac
        L_0x00c8:
            boolean r0 = r5.A05
            r36 = r38
            if (r0 == 0) goto L_0x0334
            boolean r2 = r5.A06
            java.lang.String r1 = r5.A0G
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "playBillingLibraryVersion"
            r6.putString(r0, r1)
            X.Rvr r3 = r9.A00
            int r1 = r3.A01
            java.lang.String r0 = "prorationMode"
            if (r1 != 0) goto L_0x00e9
            int r1 = r3.A00
            if (r1 == 0) goto L_0x00ec
        L_0x00e9:
            r6.putInt(r0, r1)
        L_0x00ec:
            java.lang.String r0 = r9.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fb
            java.lang.String r1 = r9.A02
            java.lang.String r0 = "accountId"
            r6.putString(r0, r1)
        L_0x00fb:
            java.lang.String r0 = r9.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x010b
            java.lang.String r1 = r9.A03
            java.lang.String r0 = "obfuscatedProfileId"
            r6.putString(r0, r1)
        L_0x010b:
            boolean r0 = android.text.TextUtils.isEmpty(r32)
            r29 = 0
            if (r0 != 0) goto L_0x0121
            java.lang.String[] r0 = new java.lang.String[]{r32}
            java.util.ArrayList r1 = X.Pxf.A0q(r0)
            java.lang.String r0 = "skusToReplace"
            r6.putStringArrayList(r0, r1)
        L_0x0121:
            X.Rvr r0 = r9.A00
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0135
            X.Rvr r0 = r9.A00
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "oldSkuPurchaseToken"
            r6.putString(r0, r1)
        L_0x0135:
            boolean r0 = android.text.TextUtils.isEmpty(r32)
            if (r0 != 0) goto L_0x0143
            java.lang.String r1 = "oldSkuPurchaseId"
            r0 = r32
            r6.putString(r1, r0)
        L_0x0143:
            X.Rvr r0 = r9.A00
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0157
            X.Rvr r0 = r9.A00
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "originalExternalTransactionId"
            r6.putString(r0, r1)
        L_0x0157:
            boolean r0 = android.text.TextUtils.isEmpty(r32)
            if (r0 != 0) goto L_0x0165
            java.lang.String r1 = "paymentsPurchaseParams"
            r0 = r32
            r6.putString(r1, r0)
        L_0x0165:
            if (r2 == 0) goto L_0x016c
            java.lang.String r0 = "enablePendingPurchases"
            r6.putBoolean(r0, r13)
        L_0x016c:
            boolean r0 = r11.isEmpty()
            java.lang.String r28 = "additionalSkuTypes"
            java.lang.String r27 = "additionalSkus"
            java.lang.String r26 = "SKU_SERIALIZED_DOCID_LIST"
            java.lang.String r25 = "skuDetailsTokens"
            java.lang.String r24 = "SKU_OFFER_ID_TOKEN_LIST"
            if (r0 != 0) goto L_0x0286
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r22 = r11.iterator()
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
        L_0x019d:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r22.next()
            com.android.billingclient.api.SkuDetails r0 = (com.android.billingclient.api.SkuDetails) r0
            org.json.JSONObject r14 = r0.A00
            java.lang.String r15 = "skuDetailsToken"
            java.lang.String r0 = r14.optString(r15)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01c1
            java.lang.String r15 = r14.optString(r15)
            r0 = r23
            r0.add(r15)
        L_0x01c1:
            java.lang.String r0 = "offerIdToken"
            java.lang.String r0 = r14.optString(r0)
            boolean r15 = r0.isEmpty()
            if (r15 == 0) goto L_0x01d5
            java.lang.String r0 = "offer_id_token"
            java.lang.String r0 = r14.optString(r0)
        L_0x01d5:
            java.lang.String r15 = "offer_id"
            java.lang.String r17 = r14.optString(r15)
            java.lang.String r15 = "offer_type"
            int r16 = r14.optInt(r15)
            java.lang.String r15 = "serializedDocid"
            java.lang.String r14 = r14.optString(r15)
            r12.add(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r21 = r21 | r0
            r0 = r17
            r3.add(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            r0 = r0 ^ 1
            r20 = r20 | r0
            r0 = r16
            X.AnonymousClass7TF.A1M(r2, r0)
            boolean r0 = X.AnonymousClass7TF.A1P(r16)
            r19 = r19 | r0
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r0 = r0 ^ 1
            r18 = r18 | r0
            r1.add(r14)
            goto L_0x019d
        L_0x0219:
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0226
            r14 = r25
            r0 = r23
            r6.putStringArrayList(r14, r0)
        L_0x0226:
            if (r21 == 0) goto L_0x022d
            r0 = r24
            r6.putStringArrayList(r0, r12)
        L_0x022d:
            if (r20 == 0) goto L_0x0234
            java.lang.String r0 = "SKU_OFFER_ID_LIST"
            r6.putStringArrayList(r0, r3)
        L_0x0234:
            if (r19 == 0) goto L_0x023b
            java.lang.String r0 = "SKU_OFFER_TYPE_LIST"
            r6.putIntegerArrayList(r0, r2)
        L_0x023b:
            if (r18 == 0) goto L_0x0242
            r0 = r26
            r6.putStringArrayList(r0, r1)
        L_0x0242:
            int r0 = r11.size()
            if (r0 <= r13) goto L_0x0320
            int r0 = X.Pxe.A0A(r11)
            java.util.ArrayList r2 = X.DbS.A0v(r0)
            int r0 = X.Pxe.A0A(r11)
            java.util.ArrayList r1 = X.DbS.A0v(r0)
            r12 = 1
        L_0x0259:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x0316
            java.lang.Object r0 = r11.get(r12)
            com.android.billingclient.api.SkuDetails r0 = (com.android.billingclient.api.SkuDetails) r0
            org.json.JSONObject r3 = r0.A00
            java.lang.String r0 = "productId"
            java.lang.String r0 = r3.optString(r0)
            r2.add(r0)
            java.lang.Object r0 = r11.get(r12)
            com.android.billingclient.api.SkuDetails r0 = (com.android.billingclient.api.SkuDetails) r0
            org.json.JSONObject r3 = r0.A00
            java.lang.String r0 = "type"
            java.lang.String r0 = r3.optString(r0)
            r1.add(r0)
            int r12 = r12 + 1
            goto L_0x0259
        L_0x0286:
            int r0 = X.C51966G9m.A06(r35)
            java.util.ArrayList r2 = X.DbS.A0v(r0)
            int r0 = X.C51966G9m.A06(r35)
            java.util.ArrayList r1 = X.DbS.A0v(r0)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r13 = 0
        L_0x02a3:
            int r0 = r35.size()
            if (r13 >= r0) goto L_0x02f5
            r0 = r35
            java.lang.Object r15 = r0.get(r13)
            X.Rqt r15 = (X.C10356Rqt) r15
            X.S74 r14 = r15.A00
            java.lang.String r0 = r14.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02c0
            java.lang.String r0 = r14.A02
            r11.add(r0)
        L_0x02c0:
            java.lang.String r0 = r15.A01
            r12.add(r0)
            java.lang.String r0 = r14.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02d2
            java.lang.String r0 = r14.A03
            r3.add(r0)
        L_0x02d2:
            if (r13 <= 0) goto L_0x02f2
            r0 = r35
            java.lang.Object r0 = r0.get(r13)
            X.Rqt r0 = (X.C10356Rqt) r0
            X.S74 r0 = r0.A00
            java.lang.String r0 = r0.A00
            r2.add(r0)
            r0 = r35
            java.lang.Object r0 = r0.get(r13)
            X.Rqt r0 = (X.C10356Rqt) r0
            X.S74 r0 = r0.A00
            java.lang.String r0 = r0.A01
            r1.add(r0)
        L_0x02f2:
            int r13 = r13 + 1
            goto L_0x02a3
        L_0x02f5:
            r0 = r24
            r6.putStringArrayList(r0, r12)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0305
            r0 = r25
            r6.putStringArrayList(r0, r11)
        L_0x0305:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0310
            r0 = r26
            r6.putStringArrayList(r0, r3)
        L_0x0310:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0320
        L_0x0316:
            r0 = r27
            r6.putStringArrayList(r0, r2)
            r0 = r28
            r6.putStringArrayList(r0, r1)
        L_0x0320:
            r0 = r24
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x0340
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0340
            X.TjE r3 = r5.A02
            r0 = 21
            X.SGo r2 = X.C10139RnG.A0I
            goto L_0x00ac
        L_0x0334:
            r8 = 80
            X.TNP r3 = new X.TNP
            r1 = r31
            r0 = r30
            r3.<init>(r5, r1, r0)
            goto L_0x038f
        L_0x0340:
            java.lang.String r3 = "skuPackageName"
            if (r10 == 0) goto L_0x03e6
            org.json.JSONObject r2 = r10.A00
            java.lang.String r1 = "packageName"
            java.lang.String r0 = r2.optString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03e6
            java.lang.String r0 = r2.optString(r1)
        L_0x0358:
            r6.putString(r3, r0)
            r3 = 1
        L_0x035c:
            boolean r0 = android.text.TextUtils.isEmpty(r32)
            if (r0 != 0) goto L_0x0369
            java.lang.String r1 = "accountName"
            r0 = r32
            r6.putString(r1, r0)
        L_0x0369:
            android.content.Intent r2 = r36.getIntent()
            if (r2 != 0) goto L_0x03b3
            java.lang.String r0 = "Activity's intent is null."
            X.SUN.A0A(r7, r0)
        L_0x0374:
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x03a1
            boolean r0 = r35.isEmpty()
            if (r0 != 0) goto L_0x03a1
            r16 = 17
        L_0x0380:
            r8 = 78
            X.TNl r3 = new X.TNl
            r10 = r3
            r11 = r6
            r12 = r5
            r13 = r9
            r14 = r31
            r15 = r30
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x038f:
            r0 = 5000(0x1388, double:2.4703E-320)
            android.os.Handler r2 = r5.A0H
            r9 = r2
            r10 = r5
            r11 = r32
            r12 = r3
            r13 = r0
            java.util.concurrent.Future r3 = A02(r9, r10, r11, r12, r13)
            if (r3 != 0) goto L_0x0402
            goto L_0x042d
        L_0x03a1:
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x03aa
            if (r3 == 0) goto L_0x03aa
            r16 = 15
            goto L_0x0380
        L_0x03aa:
            boolean r0 = r5.A06
            r16 = 6
            if (r0 == 0) goto L_0x0380
            r16 = 9
            goto L_0x0380
        L_0x03b3:
            java.lang.String r1 = "PROXY_PACKAGE"
            java.lang.String r0 = r2.getStringExtra(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0374
            java.lang.String r2 = r2.getStringExtra(r1)
            java.lang.String r0 = "proxyPackage"
            r6.putString(r0, r2)
            android.content.Context r0 = r5.A01     // Catch:{ NameNotFoundException -> 0x03dd }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x03dd }
            r0 = r29
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x03dd }
            java.lang.String r1 = r0.versionName     // Catch:{ NameNotFoundException -> 0x03dd }
            r0 = r34
            r6.putString(r0, r1)     // Catch:{ NameNotFoundException -> 0x03dd }
            goto L_0x0374
        L_0x03dd:
            java.lang.String r1 = "package not found"
            r0 = r34
            r6.putString(r0, r1)
            goto L_0x0374
        L_0x03e6:
            if (r8 == 0) goto L_0x03ff
            X.S74 r0 = r8.A00
            org.json.JSONObject r2 = r0.A05
            java.lang.String r1 = "packageName"
            java.lang.String r0 = r2.optString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03ff
            java.lang.String r0 = r2.optString(r1)
            goto L_0x0358
        L_0x03ff:
            r3 = 0
            goto L_0x035c
        L_0x0402:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            java.lang.Object r3 = r3.get(r0, r2)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            int r2 = X.SUN.A02(r3, r7)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            java.lang.String r1 = X.SUN.A07(r3, r7)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            if (r2 == 0) goto L_0x043a
            java.lang.String r0 = "Unable to buy item, Error response code: "
            java.lang.String r0 = X.002.A0O(r0, r2)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            X.SUN.A0A(r7, r0)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            X.SGo r0 = X.C10139RnG.A0J     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            X.SGo r2 = X.C11230SGo.A00(r1, r2)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            X.TjE r0 = r5.A02     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            if (r3 == 0) goto L_0x0429
            r8 = 23
        L_0x0429:
            X.Pxf.A1C(r2, r0, r8, r4)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            goto L_0x0436
        L_0x042d:
            X.TjE r1 = r5.A02     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            r0 = 25
            X.SGo r2 = X.C10139RnG.A0D     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            X.Pxf.A1C(r2, r1, r0, r4)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
        L_0x0436:
            r5.A03(r2)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            goto L_0x0471
        L_0x043a:
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r1 = com.android.billingclient.api.ProxyBillingActivity.class
            r0 = r36
            android.content.Intent r2 = X.C66580MXl.A0A(r0, r1)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            r0 = r33
            android.os.Parcelable r1 = r3.getParcelable(r0)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            r2.putExtra(r0, r1)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            r0 = r36
            r0.startActivity(r2)     // Catch:{ CancellationException | TimeoutException -> 0x0453, Exception -> 0x0475 }
            goto L_0x0472
        L_0x0453:
            r1 = move-exception
            java.lang.String r0 = "Time out while launching billing flow. Try to reconnect"
            X.SUN.A0B(r7, r0, r1)
            X.TjE r3 = r5.A02
            r0 = 4
            X.SGo r2 = X.C10139RnG.A0E
            goto L_0x00ac
        L_0x0460:
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            X.SUN.A0A(r7, r0)
            X.TjE r3 = r5.A02
            r0 = 18
            X.SGo r2 = X.C10139RnG.A09
            goto L_0x00ac
        L_0x0471:
            return r2
        L_0x0472:
            X.SGo r2 = X.C10139RnG.A0C
            return r2
        L_0x0475:
            r1 = move-exception
            java.lang.String r0 = "Exception while launching billing flow. Try to reconnect"
            X.SUN.A0B(r7, r0, r1)
            X.TjE r2 = r5.A02
            r1 = 5
            X.SGo r0 = X.C10139RnG.A0D
            X.Pxf.A1C(r0, r2, r1, r4)
            r5.A03(r0)
            return r0
        L_0x0487:
            X.TjE r1 = r5.A02
            r0 = 12
            X.SGo r2 = X.C10139RnG.A01
            X.Pxf.A1C(r2, r1, r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STX.A06(android.app.Activity, X.Rxl):X.SGo");
    }

    public final void A09(C13689Tf6 tf6) {
        C13891TjE tjE;
        C11230SGo sGo;
        if (A0F()) {
            SUN.A09("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.A02.FPK(SPi.A01(6));
            sGo = C10139RnG.A0C;
        } else {
            int i = 1;
            if (this.A0I == 1) {
                SUN.A0A("BillingClient", "Client is already in the process of connecting to billing service.");
                tjE = this.A02;
                i = 37;
                sGo = C10139RnG.A05;
            } else if (this.A0I == 3) {
                SUN.A0A("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                tjE = this.A02;
                i = 38;
                sGo = C10139RnG.A0D;
            } else {
                this.A0I = 1;
                SUN.A09("BillingClient", "Starting in-app billing setup.");
                this.A0L = new C11439SVa(this, tf6);
                Intent A0G2 = Pxe.A0G("com.android.vending.billing.InAppBillingService.BIND");
                A0G2.setPackage("com.android.vending");
                Context context = this.A01;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(A0G2, 0);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    i = 41;
                } else {
                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!"com.android.vending".equals(str) || str2 == null) {
                            SUN.A0A("BillingClient", "The device doesn't have valid Play Store.");
                            i = 40;
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent = new Intent(A0G2);
                            intent.setComponent(componentName);
                            intent.putExtra("playBillingLibraryVersion", this.A0G);
                            if (context.bindService(intent, this.A0L, 1)) {
                                SUN.A09("BillingClient", "Service was bonded successfully.");
                                return;
                            } else {
                                SUN.A0A("BillingClient", "Connection to Billing service is blocked.");
                                i = 39;
                            }
                        }
                    }
                }
                this.A0I = 0;
                SUN.A09("BillingClient", "Billing service unavailable on device.");
                tjE = this.A02;
                sGo = C10139RnG.A04;
            }
            Pxf.A1C(sGo, tjE, i, 6);
        }
        tf6.Cy1(sGo);
    }
}
