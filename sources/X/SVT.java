package X;

import android.content.ComponentName;
import android.content.ServiceConnection;

public final class SVT implements ServiceConnection {
    public final /* synthetic */ 02R A00;
    public final /* synthetic */ 2Fg A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.2Fg r2 = r3.A01     // Catch:{ RemoteException -> 0x002e }
            monitor-enter(r2)     // Catch:{ RemoteException -> 0x002e }
            r2.A03 = r5     // Catch:{ all -> 0x002b }
            monitor-exit(r2)     // Catch:{ RemoteException -> 0x002e }
            X.02R r0 = r3.A00     // Catch:{ RemoteException -> 0x002e }
            r0.accept(r5)     // Catch:{ RemoteException -> 0x002e }
            com.fbpay.w3c.FBPaymentService r1 = com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1.A00(r5)     // Catch:{ RemoteException -> 0x002e }
            com.fbpay.w3c.FBPaymentServiceCardDetailsCallback r0 = r2.A0A     // Catch:{ RemoteException -> 0x002e }
            r1.A81(r0)     // Catch:{ RemoteException -> 0x002e }
            com.fbpay.w3c.FBPaymentService r1 = com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1.A00(r5)     // Catch:{ RemoteException -> 0x002e }
            com.fbpay.w3c.FBPaymentServiceAddressCallback r0 = r2.A09     // Catch:{ RemoteException -> 0x002e }
            r1.A7m(r0)     // Catch:{ RemoteException -> 0x002e }
            com.fbpay.w3c.FBPaymentService r1 = com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1.A00(r5)     // Catch:{ RemoteException -> 0x002e }
            com.fbpay.w3c.FBPaymentServiceContactCallback r0 = r2.A0B     // Catch:{ RemoteException -> 0x002e }
            r1.A86(r0)     // Catch:{ RemoteException -> 0x002e }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ RemoteException -> 0x002e }
            throw r0     // Catch:{ RemoteException -> 0x002e }
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SVT.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public SVT(02R r1, 2Fg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        2Fg r1 = this.A01;
        synchronized (r1) {
            r1.A01 = null;
            r1.A03 = null;
        }
    }
}
