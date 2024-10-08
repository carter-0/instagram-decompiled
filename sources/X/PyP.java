package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;

public final class PyP implements ServiceConnection {
    public int A00 = 0;
    public PyT A01;
    public final Messenger A02 = new Messenger(new Handler(Looper.getMainLooper(), new PyQ(this)));
    public final SparseArray A03 = Pxe.A0L();
    public final Queue A04 = new ArrayDeque();
    public final /* synthetic */ PyO A05;

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.A00 = 3;
            AnonymousClass64D.A00().A02(this.A05.A02, this);
        }
    }

    public final synchronized void A01(int i, String str) {
        SparseArray sparseArray;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(str);
        }
        int i2 = this.A00;
        if (i2 == 0) {
            throw Pxe.A0i();
        } else if (i2 == 1 || i2 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.A00 = 4;
            AnonymousClass64D.A00().A02(this.A05.A02, this);
            RKU rku = new RKU(i, str);
            Queue<PyR> queue = this.A04;
            for (PyR pyR : queue) {
                PyR.A00(pyR, rku);
                pyR.A03.A00(rku);
            }
            queue.clear();
            int i3 = 0;
            while (true) {
                sparseArray = this.A03;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                PyR pyR2 = (PyR) sparseArray.valueAt(i3);
                PyR.A00(pyR2, rku);
                pyR2.A03.A00(rku);
                i3++;
            }
            sparseArray.clear();
        } else if (i2 == 3) {
            this.A00 = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A02(X.PyR r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.A00     // Catch:{ all -> 0x006a }
            r1 = 2
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r5) goto L_0x0020
            if (r0 == r1) goto L_0x000e
            monitor-exit(r6)
            return r4
        L_0x000e:
            java.util.Queue r0 = r6.A04     // Catch:{ all -> 0x006a }
            r0.add(r7)     // Catch:{ all -> 0x006a }
            X.PyO r0 = r6.A05     // Catch:{ all -> 0x006a }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x006a }
            X.PyU r0 = new X.PyU     // Catch:{ all -> 0x006a }
            r0.<init>(r6)     // Catch:{ all -> 0x006a }
            r1.execute(r0)     // Catch:{ all -> 0x006a }
            goto L_0x0063
        L_0x0020:
            java.util.Queue r0 = r6.A04     // Catch:{ all -> 0x006a }
            r0.add(r7)     // Catch:{ all -> 0x006a }
            goto L_0x0063
        L_0x0026:
            java.util.Queue r0 = r6.A04     // Catch:{ all -> 0x006a }
            r0.add(r7)     // Catch:{ all -> 0x006a }
            int r0 = r6.A00     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "MessengerIpcClient"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x006a }
            r6.A00 = r5     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r3 = X.Pxe.A0G(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "com.google.android.gms"
            r3.setPackage(r0)     // Catch:{ all -> 0x006a }
            X.64D r2 = X.AnonymousClass64D.A00()     // Catch:{ all -> 0x006a }
            X.PyO r1 = r6.A05     // Catch:{ all -> 0x006a }
            android.content.Context r0 = r1.A02     // Catch:{ all -> 0x006a }
            boolean r0 = r2.A03(r0, r3, r6, r5)     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "Unable to bind to service"
            r6.A01(r4, r0)     // Catch:{ all -> 0x006a }
            goto L_0x0063
        L_0x0055:
            java.util.concurrent.ScheduledExecutorService r4 = r1.A03     // Catch:{ all -> 0x006a }
            X.PyS r3 = new X.PyS     // Catch:{ all -> 0x006a }
            r3.<init>(r6)     // Catch:{ all -> 0x006a }
            r1 = 30
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x006a }
            r4.schedule(r3, r1, r0)     // Catch:{ all -> 0x006a }
        L_0x0063:
            monitor-exit(r6)
            return r5
        L_0x0065:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PyP.A02(X.PyR):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            str = "Null service connection";
        } else {
            try {
                this.A01 = new PyT(iBinder);
                this.A00 = 2;
                this.A05.A03.execute(new PyU(this));
            } catch (RemoteException e) {
                str = e.getMessage();
            }
        }
        A01(0, str);
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        A01(2, "Service disconnected");
    }

    public PyP(PyO pyO) {
        this.A05 = pyO;
    }
}
