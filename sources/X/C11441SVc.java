package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.util.Log;

/* renamed from: X.SVc  reason: case insensitive filesystem */
public final class C11441SVc implements ServiceConnection {
    public static final String A01 = AnonymousClass389.A01("ListenableWorkerImplSession");
    public final C2379539x A00 = new Object();

    public final void onBindingDied(ComponentName componentName) {
        AnonymousClass389.A00();
        Log.w(A01, "Binding died");
        this.A00.A08(AnonymousClass7TE.A15("Binding died"));
    }

    public final void onNullBinding(ComponentName componentName) {
        AnonymousClass389.A00();
        Log.e(A01, "Unable to bind to service");
        this.A00.A08(AnonymousClass7TE.A15(AnonymousClass7TG.A0m(componentName, "Cannot bind to service ", AnonymousClass7TE.A1A())));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 != false) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            X.AnonymousClass389.A00()
            if (r5 != 0) goto L_0x000c
            r2 = 0
        L_0x0006:
            X.39x r0 = r3.A00
            r0.A07(r2)
            return
        L_0x000c:
            java.lang.String r0 = androidx.work.multiprocess.IListenableWorkerImpl.A00
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x0019
            boolean r0 = r2 instanceof androidx.work.multiprocess.IListenableWorkerImpl
            if (r0 == 0) goto L_0x0019
            goto L_0x0006
        L_0x0019:
            androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy r2 = new androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy
            r2.<init>()
            r0 = 1831782174(0x6d2ec71e, float:3.3806944E27)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r5
            r0 = -1197377167(0xffffffffb8a17971, float:-7.6996985E-5)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11441SVc.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AnonymousClass389.A00();
        Log.w(A01, "Service disconnected");
        this.A00.A08(AnonymousClass7TE.A15("Service disconnected"));
    }
}
