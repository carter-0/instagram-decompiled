package X;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Q5k  reason: case insensitive filesystem */
public final class C7347Q5k extends ScanCallback {
    public final /* synthetic */ S3S A00;

    public C7347Q5k(S3S s3s) {
        this.A00 = s3s;
    }

    public final void onBatchScanResults(List list) {
        super.onBatchScanResults(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onScanResult(1, (ScanResult) it.next());
        }
    }

    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        this.A00.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e A[Catch:{ Exception -> 0x0108 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScanResult(int r12, android.bluetooth.le.ScanResult r13) {
        /*
            r11 = this;
            super.onScanResult(r12, r13)
            X.S3S r2 = r11.A00
            X.T77 r0 = r2.A08
            if (r0 == 0) goto L_0x0015
            boolean r0 = X.14i.A09()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0015
            r2.A00()
        L_0x0014:
            return
        L_0x0015:
            android.bluetooth.le.ScanRecord r0 = r13.getScanRecord()     // Catch:{ Exception -> 0x0108 }
            byte[] r6 = r0.getBytes()     // Catch:{ Exception -> 0x0108 }
            byte[] r0 = X.C11158SCo.A00     // Catch:{ Exception -> 0x0108 }
            if (r6 == 0) goto L_0x0014
            r9 = 0
            int r7 = r6.length     // Catch:{ Exception -> 0x0108 }
        L_0x0023:
            if (r9 >= r7) goto L_0x0014
            byte r0 = r6[r9]     // Catch:{ Exception -> 0x0108 }
            if (r0 <= 0) goto L_0x0014
            int r8 = r0 + 1
            int r8 = r8 + r9
            if (r8 > r7) goto L_0x0014
            int r10 = r9 + 1
            byte[] r5 = X.C11158SCo.A02     // Catch:{ Exception -> 0x0108 }
            int r4 = r5.length     // Catch:{ Exception -> 0x0108 }
            int r0 = r10 + r4
            if (r0 > r7) goto L_0x0045
            r3 = 0
        L_0x0038:
            if (r3 >= r4) goto L_0x008c
            int r0 = r10 + r3
            byte r1 = r6[r0]     // Catch:{ Exception -> 0x0108 }
            byte r0 = r5[r3]     // Catch:{ Exception -> 0x0108 }
            if (r1 != r0) goto L_0x0045
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0045:
            byte[] r5 = X.C11158SCo.A00     // Catch:{ Exception -> 0x0108 }
            int r4 = r5.length     // Catch:{ Exception -> 0x0108 }
            int r0 = r10 + r4
            if (r0 > r7) goto L_0x005a
            r3 = 0
        L_0x004d:
            if (r3 >= r4) goto L_0x008c
            int r0 = r10 + r3
            byte r1 = r6[r0]     // Catch:{ Exception -> 0x0108 }
            byte r0 = r5[r3]     // Catch:{ Exception -> 0x0108 }
            if (r1 != r0) goto L_0x005a
            int r3 = r3 + 1
            goto L_0x004d
        L_0x005a:
            byte[] r5 = X.C11158SCo.A01     // Catch:{ Exception -> 0x0108 }
            int r4 = r5.length     // Catch:{ Exception -> 0x0108 }
            int r0 = r9 + r4
            if (r0 > r7) goto L_0x006f
            r3 = 0
        L_0x0062:
            if (r3 >= r4) goto L_0x008c
            int r0 = r9 + r3
            byte r1 = r6[r0]     // Catch:{ Exception -> 0x0108 }
            byte r0 = r5[r3]     // Catch:{ Exception -> 0x0108 }
            if (r1 != r0) goto L_0x006f
            int r3 = r3 + 1
            goto L_0x0062
        L_0x006f:
            int r1 = r9 + 5
            if (r1 >= r7) goto L_0x0090
            byte r5 = r6[r9]     // Catch:{ Exception -> 0x0108 }
            byte r4 = r6[r10]     // Catch:{ Exception -> 0x0108 }
            int r0 = r9 + 4
            byte r3 = r6[r0]     // Catch:{ Exception -> 0x0108 }
            byte r1 = r6[r1]     // Catch:{ Exception -> 0x0108 }
            r0 = 27
            if (r5 != r0) goto L_0x0090
            r0 = -1
            if (r4 != r0) goto L_0x0090
            r0 = -66
            if (r3 != r0) goto L_0x0090
            r0 = -84
            if (r1 != r0) goto L_0x0090
        L_0x008c:
            if (r7 == 0) goto L_0x0014
            r5 = 0
            goto L_0x0092
        L_0x0090:
            r9 = r8
            goto L_0x0023
        L_0x0092:
            byte r0 = r6[r5]     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x009f
            if (r0 < 0) goto L_0x009e
            int r0 = r0 + 1
            int r5 = r5 + r0
            if (r5 >= r7) goto L_0x009e
            goto L_0x0092
        L_0x009e:
            r5 = r7
        L_0x009f:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0108 }
            r4.<init>()     // Catch:{ Exception -> 0x0108 }
            if (r5 < 0) goto L_0x00a8
            if (r5 <= r7) goto L_0x00a9
        L_0x00a8:
            r5 = r7
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            if (r3 >= r5) goto L_0x00be
            byte r0 = r6[r3]     // Catch:{ Exception -> 0x0108 }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)     // Catch:{ Exception -> 0x0108 }
            r4.append(r0)     // Catch:{ Exception -> 0x0108 }
            int r3 = r3 + 1
            goto L_0x00aa
        L_0x00be:
            java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x0108 }
            if (r5 == 0) goto L_0x0014
            android.bluetooth.BluetoothDevice r0 = r13.getDevice()     // Catch:{ Exception -> 0x0108 }
            java.lang.String r4 = r0.getAddress()     // Catch:{ Exception -> 0x0108 }
            long r7 = r13.getTimestampNanos()     // Catch:{ Exception -> 0x0108 }
            X.0JP r0 = r2.A05     // Catch:{ Exception -> 0x0108 }
            long r9 = r0.now()     // Catch:{ Exception -> 0x0108 }
            int r6 = r13.getRssi()     // Catch:{ Exception -> 0x0108 }
            X.Rx4 r3 = new X.Rx4     // Catch:{ Exception -> 0x0108 }
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ Exception -> 0x0108 }
            java.util.List r1 = r2.A09     // Catch:{ Exception -> 0x0111 }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0111 }
            if (r0 != 0) goto L_0x00fc
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0111 }
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0111 }
            if (r0 == 0) goto L_0x0014
            r1.next()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r0 = "onBleScanResult"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)     // Catch:{ Exception -> 0x0111 }
        L_0x00fb:
            throw r1     // Catch:{ Exception -> 0x0111 }
        L_0x00fc:
            java.util.List r0 = r2.A0A     // Catch:{ Exception -> 0x0111 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0111 }
            r0.add(r3)     // Catch:{ all -> 0x0104 }
            monitor-exit(r0)     // Catch:{ all -> 0x0104 }
            goto L_0x0107
        L_0x0104:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0104 }
            goto L_0x00fb
        L_0x0107:
            return
        L_0x0108:
            r2 = move-exception
            java.lang.Class<X.S3S> r1 = X.S3S.class
            java.lang.String r0 = "Couldn't parse BLE payload"
            X.0KC.A05(r1, r0, r2)     // Catch:{ Exception -> 0x0111 }
            return
        L_0x0111:
            r2 = move-exception
            java.lang.Class<X.S3S> r1 = X.S3S.class
            java.lang.String r0 = "Couldn't handle BLE scanresult"
            X.0KC.A05(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7347Q5k.onScanResult(int, android.bluetooth.le.ScanResult):void");
    }
}
