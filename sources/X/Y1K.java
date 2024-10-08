package X;

import com.facebook.common.dextricks.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class Y1K implements Closeable {
    public static final ExecutorService A0N;
    public int A00;
    public int A01;
    public long A02 = 0;
    public long A03;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public long A07 = 0;
    public long A08 = 0;
    public long A09 = 0;
    public C21481XcW A0A = new C21481XcW();
    public boolean A0B;
    public final String A0C;
    public final Socket A0D;
    public final Map A0E = AnonymousClass7TE.A1H();
    public final Set A0F;
    public final ScheduledExecutorService A0G;
    public final C21293XTb A0H;
    public final Y7J A0I;
    public final Y1J A0J;
    public final YBS A0K;
    public final C21481XcW A0L;
    public final ExecutorService A0M;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        C22023Xt4 xt4 = SUS.A04;
        A0N = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new Y4C("OkHttp Http2Connection", true));
    }

    public static synchronized void A00(Y2B y2b, Y1K y1k) {
        synchronized (y1k) {
            if (!y1k.A0B) {
                y1k.A0M.execute(y2b);
            }
        }
    }

    public final synchronized C21989Xp3 A01(int i) {
        return (C21989Xp3) this.A0E.get(Integer.valueOf(i));
    }

    public final synchronized C21989Xp3 A02(int i) {
        C21989Xp3 xp3;
        xp3 = (C21989Xp3) this.A0E.remove(Integer.valueOf(i));
        notifyAll();
        return xp3;
    }

    public final synchronized void A04(long j) {
        synchronized (this) {
            long j2 = this.A09 + j;
            this.A09 = j2;
            if (j2 >= ((long) (this.A0A.A00() / 2))) {
                try {
                    this.A0G.execute(new Y7M(this, new Object[]{this.A0C, 0}, 0, j2));
                } catch (RejectedExecutionException unused) {
                }
                this.A09 = 0;
            }
        }
    }

    public final void A03(int i, Integer num) {
        try {
            this.A0G.execute(new Y7L(num, this, new Object[]{this.A0C, Integer.valueOf(i)}, i));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0037=Splitter:B:27:0x0037, B:17:0x002c=Splitter:B:17:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.Integer r7) {
        /*
            r6 = this;
            X.Y1J r5 = r6.A0J
            monitor-enter(r5)
            monitor-enter(r6)     // Catch:{ all -> 0x0038 }
            boolean r0 = r6.A0B     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x002c
        L_0x000a:
            r0 = 1
            r6.A0B = r0     // Catch:{ all -> 0x0035 }
            int r4 = r6.A00     // Catch:{ all -> 0x0035 }
            monitor-exit(r6)     // Catch:{ all -> 0x0035 }
            X.Xt4 r0 = X.SUS.A04     // Catch:{ all -> 0x0038 }
            boolean r0 = r5.A01     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x002e
            int r3 = X.XY0.A00(r7)     // Catch:{ all -> 0x0033 }
            r2 = 0
            r1 = 8
            r0 = 7
            r5.A01(r0, r2, r2, r1)     // Catch:{ all -> 0x0033 }
            X.YCS r0 = r5.A04     // Catch:{ all -> 0x0033 }
            r0.FNw(r4)     // Catch:{ all -> 0x0033 }
            r0.FNw(r3)     // Catch:{ all -> 0x0033 }
            r0.flush()     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            return
        L_0x002e:
            java.io.IOException r0 = X.C21055XCg.A0H()     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0035 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y1K.A06(java.lang.Integer):void");
    }

    public final void A07(boolean z, int i, int i2) {
        try {
            Y1J y1j = this.A0J;
            synchronized (y1j) {
                if (!y1j.A01) {
                    y1j.A01((byte) 6, AnonymousClass7TF.A1P(z ? 1 : 0) ? (byte) 1 : 0, 0, 8);
                    YCS ycs = y1j.A04;
                    ycs.FNw(i);
                    ycs.FNw(i2);
                    ycs.flush();
                } else {
                    throw C21055XCg.A0H();
                }
            }
        } catch (IOException e) {
            Integer num = AnonymousClass05K.A01;
            A05(e, num, num);
        }
    }

    public final void close() {
        A05((IOException) null, AnonymousClass05K.A00, AnonymousClass05K.A0j);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|4|(2:11|(5:13|14|15|29|16))|18|19|20|21|22|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.io.IOException r5, java.lang.Integer r6, java.lang.Integer r7) {
        /*
            r4 = this;
            r4.A06(r6)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r3 = 0
            monitor-enter(r4)
            java.util.Map r2 = r4.A0E     // Catch:{ all -> 0x0044 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0020
            java.util.Collection r1 = r2.values()     // Catch:{ all -> 0x0044 }
            int r0 = r2.size()     // Catch:{ all -> 0x0044 }
            X.Xp3[] r0 = new X.C21989Xp3[r0]     // Catch:{ all -> 0x0044 }
            java.lang.Object[] r3 = r1.toArray(r0)     // Catch:{ all -> 0x0044 }
            X.Xp3[] r3 = (X.C21989Xp3[]) r3     // Catch:{ all -> 0x0044 }
            r2.clear()     // Catch:{ all -> 0x0044 }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x002f
            int r2 = r3.length
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x002f
            r0 = r3[r1]
            r0.A04(r5, r7)     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x002f:
            X.Y1J r0 = r4.A0J     // Catch:{ IOException -> 0x0034 }
            r0.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            java.net.Socket r0 = r4.A0D     // Catch:{ IOException -> 0x0039 }
            r0.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            java.util.concurrent.ScheduledExecutorService r0 = r4.A0G
            r0.shutdown()
            java.util.concurrent.ExecutorService r0 = r4.A0M
            r0.shutdown()
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0044 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y1K.A05(java.io.IOException, java.lang.Integer, java.lang.Integer):void");
    }

    public Y1K(String str, Socket socket, C21293XTb xTb, YBS ybs, YCS ycs, YCT yct, int i) {
        C21481XcW xcW = new C21481XcW();
        this.A0L = xcW;
        this.A0F = new LinkedHashSet();
        this.A0K = ybs;
        this.A0H = xTb;
        this.A01 = 1;
        this.A01 = 3;
        this.A0A.A01(7, 16777216);
        this.A0C = str;
        C22023Xt4 xt4 = SUS.A04;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new Y4C(String.format(locale, "OkHttp %s Writer", new Object[]{str}), false));
        this.A0G = scheduledThreadPoolExecutor;
        int i2 = i;
        if (i != 0) {
            long j = (long) i2;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new Y7E(this), j, j, TimeUnit.MILLISECONDS);
        }
        this.A0M = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Y4C(String.format(locale, "OkHttp %s Push Observer", new Object[]{str}), true));
        xcW.A01(7, 65535);
        xcW.A01(5, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        this.A03 = (long) xcW.A00();
        this.A0D = socket;
        this.A0J = new Y1J(ycs);
        this.A0I = new Y7J(this, new Y1L(yct));
    }
}
