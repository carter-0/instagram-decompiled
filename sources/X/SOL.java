package X;

import com.google.common.collect.HashBiMap;
import java.util.HashMap;

public final class SOL {
    public static final HashBiMap A08;
    public static final HashBiMap A09;
    public C61064Jw2 A00;
    public SJG A01;
    public QP0 A02 = new QP0(0.0d, 10, 0);
    public int A03;
    public final Object A04 = Pxe.A0p();
    public final HashMap A05 = AnonymousClass7TE.A1E();
    public final C9262RVn A06;
    public final String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r3 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0 = com.google.common.collect.ImmutableList.copyOf(r3.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r3 = X.C66580MXl.A0J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r3.hasNext() == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        ((X.C13557TcV) r3.next()).DvQ(r4, r9, r7.A07, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r4 != 32) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        A00(r7, r5, 12, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.SOL r17, double r18, int r20, int r21) {
        /*
            r7 = r17
            java.lang.Object r3 = r7.A04
            monitor-enter(r3)
            X.QP0 r0 = r7.A02     // Catch:{ all -> 0x0087 }
            int r1 = r0.A02     // Catch:{ all -> 0x0087 }
            r8 = 12
            r2 = 32
            r4 = r20
            if (r1 == r8) goto L_0x0013
            if (r1 != r2) goto L_0x0041
        L_0x0013:
            r9 = 20
            r10 = 21
            r11 = 22
            r12 = 23
            r13 = 24
            r14 = 25
            r15 = 30
            r16 = 31
            r17 = r2
            int[] r1 = new int[]{r9, r10, r11, r12, r13, r14, r15, r16, r17}     // Catch:{ all -> 0x0087 }
            boolean r1 = X.03t.A0P(r1, r4)     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0041
            java.lang.String r5 = X.C51968G9o.A16(r7)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = "Skipping invalid state transition. Current state: "
            int r1 = r0.A02     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = ". New state: "
            java.lang.String r0 = X.002.A02(r1, r4, r2, r0)     // Catch:{ all -> 0x0087 }
            X.0KC.A0D(r5, r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0085
        L_0x0041:
            int r1 = r0.A02     // Catch:{ all -> 0x0087 }
            r5 = r18
            if (r4 != r1) goto L_0x004e
            double r0 = r0.A00     // Catch:{ all -> 0x0087 }
            int r9 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x004e
            goto L_0x0085
        L_0x004e:
            X.QP0 r0 = new X.QP0     // Catch:{ all -> 0x0087 }
            r9 = r21
            r0.<init>(r5, r4, r9)     // Catch:{ all -> 0x0087 }
            r7.A02 = r0     // Catch:{ all -> 0x0087 }
            monitor-exit(r3)
            java.util.HashMap r3 = r7.A05
            monitor-enter(r3)
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x0087 }
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r3)
            X.3kO r3 = X.C66580MXl.A0J(r0)
        L_0x0068:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r3.next()
            X.TcV r1 = (X.C13557TcV) r1
            java.lang.String r0 = r7.A07
            r13 = r0
            r14 = r5
            r10 = r1
            r11 = r4
            r12 = r9
            r10.DvQ(r11, r12, r13, r14)
            goto L_0x0068
        L_0x007f:
            if (r4 != r2) goto L_0x0086
            A00(r7, r5, r8, r9)
            return
        L_0x0085:
            monitor-exit(r3)
        L_0x0086:
            return
        L_0x0087:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOL.A00(X.SOL, double, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(X.C13557TcV r10) {
        /*
            r9 = this;
            X.Jw2 r0 = r9.A00
            r5 = 0
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r2 = r0.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r8 = r0.A02
            java.lang.Object r3 = r0.A01
            X.RyS r3 = (X.C10806RyS) r3
            boolean r6 = r0.A03
            X.SOJ r4 = r3.A01
            java.lang.Object r1 = r9.A04
            monitor-enter(r1)
            X.SJG r0 = r9.A01     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x001b
            goto L_0x0089
        L_0x001b:
            X.AnonymousClass7TF.A1H(r2, r8)     // Catch:{ all -> 0x0086 }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x0086 }
            r0 = -759499589(0xffffffffd2baf4bb, float:-4.01484906E11)
            if (r7 == r0) goto L_0x0043
            r0 = 1563111528(0x5d2b3068, float:7.7096711E17)
            if (r7 == r0) goto L_0x0060
            r0 = 1869885578(0x6f74308a, float:7.5573023E28)
            if (r7 != r0) goto L_0x0056
            java.lang.String r0 = "digital_turbine_store"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0056
            android.content.Context r0 = X.DbT.A05(r2)     // Catch:{ all -> 0x0086 }
            X.QQT r2 = new X.QQT     // Catch:{ all -> 0x0086 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0086 }
            goto L_0x0072
        L_0x0043:
            java.lang.String r0 = "xiaomi"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0056
            android.content.Context r0 = r2.getApplicationContext()     // Catch:{ all -> 0x0086 }
            X.QQV r2 = new X.QQV     // Catch:{ all -> 0x0086 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0086 }
            goto L_0x0072
        L_0x0056:
            android.content.Context r0 = X.DbT.A05(r2)     // Catch:{ all -> 0x0086 }
            X.QQU r2 = new X.QQU     // Catch:{ all -> 0x0086 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0086 }
            goto L_0x0072
        L_0x0060:
            java.lang.String r0 = "neon_android_store"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0056
            android.content.Context r0 = X.DbT.A05(r2)     // Catch:{ all -> 0x0086 }
            X.QQS r2 = new X.QQS     // Catch:{ all -> 0x0086 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0086 }
        L_0x0072:
            r9.A01 = r2     // Catch:{ all -> 0x0086 }
            boolean r0 = r2 instanceof X.QQU     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x007f
            X.QQU r2 = (X.QQU) r2     // Catch:{ all -> 0x0086 }
            android.content.ServiceConnection r0 = r2.A01     // Catch:{ all -> 0x0086 }
            X.QQU.A01(r0, r2)     // Catch:{ all -> 0x0086 }
        L_0x007f:
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0089:
            r0 = 0
        L_0x008a:
            monitor-exit(r1)
            r2 = 0
            if (r0 == 0) goto L_0x00a3
            int r1 = r0.intValue()
            r0 = 11
            if (r1 != r0) goto L_0x00a7
            if (r6 == 0) goto L_0x009b
            r0 = 12
        L_0x009b:
            A00(r9, r2, r0, r5)
            java.lang.String r0 = "DSO_INSTALLER_INITIALISE_SUCCESS"
        L_0x00a0:
            r4.A01(r0)
        L_0x00a3:
            java.util.HashMap r2 = r9.A05
            monitor-enter(r2)
            goto L_0x00b1
        L_0x00a7:
            r0 = 13
            if (r1 != r0) goto L_0x00a3
            A00(r9, r2, r0, r5)
            java.lang.String r0 = "DSO_INSTALLER_NOT_SUPPORTED"
            goto L_0x00a0
        L_0x00b1:
            int r0 = r9.A03     // Catch:{ all -> 0x00d0 }
            r3 = r10
            X.Pxh.A1I(r10, r2, r0)     // Catch:{ all -> 0x00d0 }
            int r1 = r9.A03     // Catch:{ all -> 0x00d0 }
            int r0 = r1 + 1
            r9.A03 = r0     // Catch:{ all -> 0x00d0 }
            monitor-exit(r2)
            java.lang.Object r2 = r9.A04
            monitor-enter(r2)
            X.QP0 r0 = r9.A02     // Catch:{ all -> 0x00d0 }
            monitor-exit(r2)
            java.lang.String r6 = r9.A07
            int r4 = r0.A02
            double r7 = r0.A00
            int r5 = r0.A01
            r3.DvQ(r4, r5, r6, r7)
            return r1
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOL.A01(X.TcV):int");
    }

    static {
        HashBiMap A002 = HashBiMap.A00();
        A09 = A002;
        HashBiMap A003 = HashBiMap.A00();
        A08 = A003;
        A002.putAll(0Yt.A06(new 0eP[]{AnonymousClass7TF.A0x(C8896REo.START_DOWNLOAD, 20), AnonymousClass7TF.A0x(C8896REo.WAITING_DOWNLOAD, 21), AnonymousClass7TF.A0x(C8896REo.RUNNING_DOWNLOAD, 22), AnonymousClass7TF.A0x(C8896REo.CANCEL_DOWNLOAD, 23), AnonymousClass7TF.A0x(C8896REo.SUCCESS_DOWNLOAD, 24), AnonymousClass7TF.A0x(C8896REo.FAILED_DOWNLOAD, 25), AnonymousClass7TF.A0x(C8896REo.START_INSTALL, 30), AnonymousClass7TF.A0x(C8896REo.FAILED_INSTALL, 31), AnonymousClass7TF.A0x(C8896REo.SUCCESS_INSTALL, 32), AnonymousClass7TF.A0x(C8896REo.WAITING_WIFI_FOR_DOWNLOAD, 26)}));
        A003.putAll(DbY.A0q(RE5.STORAGE_INSUFFICIENT, 3, AnonymousClass7TF.A0x(RE5.UNKNOWN, 1), AnonymousClass7TF.A0x(RE5.NETWORK_FAILURE, 2)));
    }

    public SOL(C9262RVn rVn, String str) {
        this.A07 = str;
        this.A06 = rVn;
    }
}
