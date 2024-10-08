package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.502  reason: invalid class name */
public final class AnonymousClass502 implements AnonymousClass0TL {
    public String A00 = null;
    public int A01 = -1;
    public long A02 = 0;
    public final int A03;
    public final AnonymousClass0JR A04;

    public final boolean shouldCollectMetrics(int i) {
        return (i & 256) != 0;
    }

    public final /* synthetic */ boolean shouldCollectMetrics(int i, 0TA r3) {
        return AnonymousClass0TK.A00(r3, this, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0105, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0106, code lost:
        X.0KC.A08(r5, "Caught exception when getting root view info", r4, new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass502 r10) {
        /*
            X.0JR r0 = r10.A04
            long r1 = r0.now()
            long r3 = r10.A02
            long r5 = r1 - r3
            int r0 = r10.A03
            long r3 = (long) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0127
            java.lang.Class<X.504> r5 = X.AnonymousClass504.class
            monitor-enter(r5)
            boolean r0 = X.AnonymousClass504.A03     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x0051
            r7 = 1
            r6 = 0
            r8 = 0
            java.lang.String r0 = "android.view.WindowManagerGlobal"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = "getInstance"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0045 }
            java.lang.reflect.Method r0 = r4.getMethod(r3, r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r0 = r0.invoke(r6, r6)     // Catch:{ Exception -> 0x0045 }
            X.AnonymousClass504.A00 = r0     // Catch:{ Exception -> 0x0045 }
            java.lang.String r3 = "getViewRootNames"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0045 }
            java.lang.reflect.Method r0 = r4.getMethod(r3, r0)     // Catch:{ Exception -> 0x0045 }
            X.AnonymousClass504.A02 = r0     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "mRoots"
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch:{ Exception -> 0x0045 }
            X.AnonymousClass504.A01 = r0     // Catch:{ Exception -> 0x0045 }
            r0.setAccessible(r7)     // Catch:{ Exception -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            r4 = move-exception
            java.lang.String r3 = "Caught exception when initializing WindowManagerGlobalUtil"
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x0102 }
            X.0KC.A08(r5, r3, r4, r0)     // Catch:{ all -> 0x0102 }
            X.AnonymousClass504.A00 = r6     // Catch:{ all -> 0x0102 }
        L_0x004f:
            X.AnonymousClass504.A03 = r7     // Catch:{ all -> 0x0102 }
        L_0x0051:
            monitor-exit(r5)
            java.lang.Object r3 = X.AnonymousClass504.A00
            if (r3 == 0) goto L_0x010d
            r6 = 0
            java.lang.reflect.Field r0 = X.AnonymousClass504.A01     // Catch:{ Exception -> 0x0105 }
            java.lang.Object r7 = r0.get(r3)     // Catch:{ Exception -> 0x0105 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x0105 }
            if (r7 == 0) goto L_0x010d
            int r0 = r7.size()     // Catch:{ Exception -> 0x0105 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0105 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0105 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0105 }
            r4.<init>()     // Catch:{ Exception -> 0x0105 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ Exception -> 0x0105 }
        L_0x0073:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0105 }
            if (r0 == 0) goto L_0x0111
            java.lang.Object r7 = r9.next()     // Catch:{ Exception -> 0x0105 }
            java.lang.String r0 = "title: "
            r4.append(r0)     // Catch:{ Exception -> 0x0105 }
            java.lang.Class<X.SD8> r8 = X.SD8.class
            monitor-enter(r8)     // Catch:{ Exception -> 0x0105 }
            boolean r0 = X.SD8.A05     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = "mWindowAttributes"
            java.lang.reflect.Field r0 = X.SD8.A00(r0)     // Catch:{ all -> 0x00ff }
            X.SD8.A02 = r0     // Catch:{ all -> 0x00ff }
            r0 = 1
            X.SD8.A05 = r0     // Catch:{ all -> 0x00ff }
        L_0x0094:
            monitor-exit(r8)     // Catch:{ Exception -> 0x0105 }
            java.lang.reflect.Field r0 = X.SD8.A02     // Catch:{ Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x0105 }
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0     // Catch:{ Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00af
            java.lang.CharSequence r0 = r0.getTitle()     // Catch:{ Exception -> 0x0105 }
        L_0x00a5:
            r4.append(r0)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r0 = ", w:"
            r4.append(r0)     // Catch:{ Exception -> 0x0105 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x0105 }
            goto L_0x00b2
        L_0x00af:
            java.lang.String r0 = "Failed to retrieve title"
            goto L_0x00a5
        L_0x00b2:
            boolean r0 = X.SD8.A04     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "mWidth"
            java.lang.reflect.Field r0 = X.SD8.A00(r0)     // Catch:{ all -> 0x00ff }
            X.SD8.A01 = r0     // Catch:{ all -> 0x00ff }
            r0 = 1
            X.SD8.A04 = r0     // Catch:{ all -> 0x00ff }
        L_0x00c1:
            monitor-exit(r8)     // Catch:{ Exception -> 0x0105 }
            java.lang.reflect.Field r0 = X.SD8.A01     // Catch:{ Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.getInt(r7)     // Catch:{ Exception -> 0x0105 }
        L_0x00ca:
            r4.append(r0)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r0 = ", h:"
            r4.append(r0)     // Catch:{ Exception -> 0x0105 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x0105 }
            goto L_0x00d6
        L_0x00d4:
            r0 = 0
            goto L_0x00ca
        L_0x00d6:
            boolean r0 = X.SD8.A03     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "mHeight"
            java.lang.reflect.Field r0 = X.SD8.A00(r0)     // Catch:{ all -> 0x00ff }
            X.SD8.A00 = r0     // Catch:{ all -> 0x00ff }
            r0 = 1
            X.SD8.A03 = r0     // Catch:{ all -> 0x00ff }
        L_0x00e5:
            monitor-exit(r8)     // Catch:{ Exception -> 0x0105 }
            java.lang.reflect.Field r0 = X.SD8.A00     // Catch:{ Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00fd
            int r0 = r0.getInt(r7)     // Catch:{ Exception -> 0x0105 }
        L_0x00ee:
            r4.append(r0)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0105 }
            r3.add(r0)     // Catch:{ Exception -> 0x0105 }
            r4.setLength(r6)     // Catch:{ Exception -> 0x0105 }
            goto L_0x0073
        L_0x00fd:
            r0 = 0
            goto L_0x00ee
        L_0x00ff:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ Exception -> 0x0105 }
            throw r0     // Catch:{ Exception -> 0x0105 }
        L_0x0102:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0105:
            r4 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r0 = "Caught exception when getting root view info"
            X.0KC.A08(r5, r0, r4, r3)
        L_0x010d:
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x0111:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0127
            int r0 = r3.size()
            r10.A01 = r0
            java.lang.String r0 = ";"
            java.lang.String r0 = X.0mp.A05(r0, r3)
            r10.A00 = r0
            r10.A02 = r1
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass502.A00(X.502):void");
    }

    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    public AnonymousClass502(AnonymousClass0JR r3, int i) {
        this.A03 = Math.max(30, i) * IgNetworkConsentStorage.MAX_ENTRIES;
        this.A04 = r3;
    }

    public final Collection getDataPoints() {
        A00(this);
        ArrayList arrayList = new ArrayList(1);
        int i = this.A01;
        if (i > 0) {
            arrayList.add(new 0TD(0TJ.A17, (long) i));
            this.A01 = -1;
        }
        return arrayList;
    }
}
