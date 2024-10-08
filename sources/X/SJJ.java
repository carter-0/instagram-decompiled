package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class SJJ {
    public final BroadcastReceiver A00;
    public final Context A01;
    public final Handler A02;
    public final C10936S1p A03;
    public final Set A04 = AnonymousClass7TE.A1F();
    public final AtomicLong A05 = Pxe.A1D(0);
    public final AtomicLong A06 = Pxe.A1D(0);
    public final AtomicLong A07 = Pxe.A1D(-1);
    public final T9D A08;
    public final SN9 A09;
    public final RealtimeSinceBootClock A0A;
    public final AtomicLong A0B = Pxe.A1D(-1);

    public static synchronized void A00(NetworkInfo networkInfo, SJJ sjj) {
        AtomicLong atomicLong;
        synchronized (sjj) {
            long j = -1;
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    AtomicLong atomicLong2 = sjj.A06;
                    if (atomicLong2.compareAndSet(0, SystemClock.elapsedRealtime())) {
                        AtomicLong atomicLong3 = sjj.A0B;
                        if (atomicLong3.get() != -1) {
                            atomicLong = sjj.A07;
                            j = atomicLong2.get() - atomicLong3.get();
                            atomicLong.set(j);
                        }
                    }
                }
            }
            AtomicLong atomicLong4 = sjj.A0B;
            atomicLong4.set(SystemClock.elapsedRealtime());
            long andSet = sjj.A06.getAndSet(0);
            if (andSet != 0) {
                sjj.A05.addAndGet(atomicLong4.get() - andSet);
            }
            atomicLong = sjj.A07;
            atomicLong.set(j);
        }
    }

    public final NetworkInfo A01() {
        boolean z;
        ConnectivityManager connectivityManager;
        T9D t9d = this.A08;
        if (t9d instanceof C7860Qbk) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (connectivityManager = (ConnectivityManager) t9d.A01()) == null) {
            return null;
        }
        try {
            return connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
        } catch (Throwable th) {
            0KC.A0F("NetworkProvider", "Exception in getNetworkInfo", th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|(2:29|30)(1:31)) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r1 == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1 = r0.getNetworkInfo(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r1 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        return X.SN9.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r1 = r1.getSubtype();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        r4 = X.SN9.A01(r1);
        r3 = r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.S2M A03() {
        /*
            r8 = this;
            X.T9D r1 = r8.A08
            boolean r0 = r1 instanceof X.C7860Qbk
            if (r0 == 0) goto L_0x0016
            r0 = 0
        L_0x0007:
            X.SN9 r7 = r8.A09
            if (r0 != 0) goto L_0x001d
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r3 = 0
            r1 = -1
            r0 = 0
            X.S2M r2 = new X.S2M
            r2.<init>(r4, r0, r1, r3)
            return r2
        L_0x0016:
            java.lang.Object r0 = r1.A01()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            goto L_0x0007
        L_0x001d:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r3 = 0
            android.net.Network r6 = r0.getActiveNetwork()     // Catch:{ all -> 0x0076 }
            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r6)     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x002f
            X.S2M r2 = X.SN9.A00(r0)     // Catch:{ all -> 0x0076 }
            return r2
        L_0x002f:
            r5 = 1
            boolean r1 = r2.hasTransport(r5)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0039
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0076 }
            goto L_0x006f
        L_0x0039:
            boolean r1 = r2.hasTransport(r3)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x006f
            android.content.Context r2 = r7.A00     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r2.getSystemService(r1)     // Catch:{ all -> 0x0076 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x0055
            java.lang.Integer r1 = X.AnonymousClass05K.A15     // Catch:{ all -> 0x0076 }
            r0 = 0
            X.S2M r2 = new X.S2M     // Catch:{ all -> 0x0076 }
            r2.<init>(r1, r0, r3, r5)     // Catch:{ all -> 0x0076 }
            return r2
        L_0x0055:
            int r1 = r1.getDataNetworkType()     // Catch:{ SecurityException -> 0x005b }
            if (r1 != 0) goto L_0x006a
        L_0x005b:
            android.net.NetworkInfo r1 = r0.getNetworkInfo(r6)     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x0066
            X.S2M r2 = X.SN9.A00(r0)     // Catch:{ all -> 0x0076 }
            return r2
        L_0x0066:
            int r1 = r1.getSubtype()     // Catch:{ all -> 0x0076 }
        L_0x006a:
            java.lang.Integer r4 = X.SN9.A01(r1)     // Catch:{ all -> 0x0076 }
            r3 = r1
        L_0x006f:
            r0 = 0
            X.S2M r2 = new X.S2M
            r2.<init>(r4, r0, r3, r5)
            return r2
        L_0x0076:
            r1 = move-exception
            r0 = -1
            X.S2M r2 = new X.S2M
            r2.<init>(r4, r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJJ.A03():X.S2M");
    }

    public SJJ(Context context, Handler handler, SN9 sn9, RealtimeSinceBootClock realtimeSinceBootClock, C10936S1p s1p) {
        this.A03 = s1p;
        this.A08 = s1p.A00(ConnectivityManager.class, "connectivity");
        this.A01 = context;
        this.A0A = realtimeSinceBootClock;
        this.A02 = handler;
        this.A09 = sn9;
        this.A00 = new Q63(this, 6);
        A00(A01(), this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        0DH.A01(this.A00, this.A01, intentFilter, this.A02);
    }

    public final NetworkInfo A02() {
        NetworkInfo A012 = A01();
        if (A012 == null || !A012.isConnected()) {
            return null;
        }
        return A012;
    }
}
