package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.ShR  reason: case insensitive filesystem */
public final class C11839ShR implements C13891TjE {
    public final RR4 A00;
    public final C8584QxM A01;
    public final Context A02;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.RR4, java.lang.Object] */
    public C11839ShR(Context context, C8584QxM qxM) {
        ? obj = new Object();
        try {
            Sw4.A01(context);
            obj.A00 = Sw4.A00().A02(Sw3.A01).C9h(new S5K("proto"), C12516Svt.A00, C8589QxR.class, "PLAY_BILLING_LIBRARY");
        } catch (Throwable unused) {
            obj.A01 = true;
        }
        this.A00 = obj;
        this.A01 = qxM;
        this.A02 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        X.SUN.A0B("BillingLogger", "Unable to log.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C8590QxS r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0071
            X.QxM r7 = r8.A01     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0071
            android.content.Context r0 = r8.A02     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0031
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x0071 }
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ Exception -> 0x0071 }
            if (r1 == 0) goto L_0x0031
            X.TeF r0 = X.SA3.A00()     // Catch:{ Exception -> 0x0071 }
            X.Qwz r0 = r0.FOx(r1)     // Catch:{ Exception -> 0x0071 }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x0071 }
        L_0x0024:
            int r0 = r0 % 100
            long r1 = (long) r0     // Catch:{ Exception -> 0x0071 }
            r5 = 100
            long r1 = r1 % r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0034
            goto L_0x0033
        L_0x0031:
            r0 = 0
            goto L_0x0024
        L_0x0033:
            long r1 = r1 + r5
        L_0x0034:
            int r0 = (int) r1     // Catch:{ Exception -> 0x0071 }
            long r1 = (long) r0     // Catch:{ Exception -> 0x0071 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            X.QxI r3 = X.C8589QxR.A00()     // Catch:{ all -> 0x0068 }
            r3.A09(r7)     // Catch:{ all -> 0x0068 }
            r3.A08(r9)     // Catch:{ all -> 0x0068 }
            X.QxA r2 = X.C8583QxL.A00()     // Catch:{ all -> 0x0068 }
            java.lang.Class<X.RPm> r1 = X.C9114RPm.class
            monitor-enter(r1)     // Catch:{ all -> 0x0068 }
            boolean r0 = X.C9114RPm.A00     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0052
            r0 = 1
            X.C9114RPm.A00 = r0     // Catch:{ all -> 0x0065 }
        L_0x0052:
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            r2.A06()     // Catch:{ all -> 0x0068 }
            r3.A0A(r2)     // Catch:{ all -> 0x0068 }
            X.RR4 r1 = r8.A00     // Catch:{ all -> 0x0068 }
            X.Qx1 r0 = r3.A01()     // Catch:{ all -> 0x0068 }
            X.QxR r0 = (X.C8589QxR) r0     // Catch:{ all -> 0x0068 }
            r1.A00(r0)     // Catch:{ all -> 0x0068 }
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r2 = move-exception
            java.lang.String r1 = "BillingLogger"
            java.lang.String r0 = "Unable to log."
            X.SUN.A0B(r1, r0, r2)
            return
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11839ShR.A00(X.QxS):void");
    }

    public final void FP8(C8588QxQ qxQ) {
        if (qxQ != null) {
            try {
                C8580QxI A002 = C8589QxR.A00();
                C8584QxM qxM = this.A01;
                if (qxM != null) {
                    A002.A09(qxM);
                }
                A002.A06(qxQ);
                this.A00.A00((C8589QxR) A002.A01());
            } catch (Throwable th) {
                SUN.A0B("BillingLogger", "Unable to log.", th);
            }
        }
    }

    public final void FPK(C8585QxN qxN) {
        if (qxN != null) {
            try {
                C8580QxI A002 = C8589QxR.A00();
                C8584QxM qxM = this.A01;
                if (qxM != null) {
                    A002.A09(qxM);
                }
                A002.A07(qxN);
                this.A00.A00((C8589QxR) A002.A01());
            } catch (Throwable th) {
                SUN.A0B("BillingLogger", "Unable to log.", th);
            }
        }
    }

    public final void FPg(List list, int i, boolean z, boolean z2) {
        C8590QxS qxS;
        try {
            SPi sPi = SPi.$redex_init_class;
            C8579QxH A002 = C8590QxS.A00();
            A002.A07(i);
            A002.A06();
            A002.A0B(z2);
            A002.A0A(list);
            qxS = (C8590QxS) A002.A01();
        } catch (Exception e) {
            SUN.A0B("BillingLogger", "Unable to create logging payload", e);
            qxS = null;
        } catch (Throwable th) {
            SUN.A0B("BillingLogger", "Unable to log.", th);
            return;
        }
        A00(qxS);
    }
}
