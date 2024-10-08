package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Sk4 implements C13768Tgg, ComponentCallbacks2 {
    public static final QHM A0A;
    public static final QHM A0B;
    public static final QHM A0C = ((QHM) new TA3().A0E(C10112Rmo.A01).A07(RE3.LOW).A03());
    public QHM A00;
    public final Context A01;
    public final SUv A02;
    public final C13917TlJ A03;
    public final C13700TfI A04;
    public final TZq A05;
    public final C10925S1d A06;
    public final C11986Sk2 A07 = new C11986Sk2();
    public final Runnable A08;
    public final CopyOnWriteArrayList A09;

    public final synchronized boolean A01(C13918TlK tlK) {
        boolean z;
        C13837TiC Bn5 = tlK.Bn5();
        z = true;
        if (Bn5 != null) {
            C10925S1d s1d = this.A06;
            boolean remove = s1d.A02.remove(Bn5);
            if (s1d.A01.remove(Bn5) || remove) {
                Bn5.clear();
                this.A07.A00.remove(tlK);
                tlK.Eig((C13837TiC) null);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final synchronized void onDestroy() {
        C11986Sk2 sk2 = this.A07;
        sk2.onDestroy();
        Set set = sk2.A00;
        Iterator A0m = Pxi.A0m(set);
        while (A0m.hasNext()) {
            A00((C13918TlK) A0m.next());
        }
        set.clear();
        C10925S1d s1d = this.A06;
        Set set2 = s1d.A02;
        Iterator A0m2 = Pxi.A0m(set2);
        while (A0m2.hasNext()) {
            C13837TiC tiC = (C13837TiC) A0m2.next();
            if (tiC != null) {
                boolean remove = set2.remove(tiC);
                if (s1d.A01.remove(tiC) || remove) {
                    tiC.clear();
                }
            }
        }
        s1d.A01.clear();
        C13700TfI tfI = this.A04;
        tfI.EDq(this);
        tfI.EDq(this.A03);
        C11424STg.A02().removeCallbacks(this.A08);
        List list = this.A02.A06;
        synchronized (list) {
            if (list.contains(this)) {
                list.remove(this);
            } else {
                throw AnonymousClass7TE.A0z("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onLowMemory() {
    }

    public final synchronized void onStart() {
        synchronized (this) {
            C10925S1d s1d = this.A06;
            s1d.A00 = false;
            Iterator A0m = Pxi.A0m(s1d.A02);
            while (A0m.hasNext()) {
                C13837TiC tiC = (C13837TiC) A0m.next();
                if (!tiC.isComplete() && !tiC.isRunning()) {
                    tiC.ADE();
                }
            }
            s1d.A01.clear();
            this.A07.onStart();
        }
    }

    public final synchronized void onStop() {
        synchronized (this) {
            C10925S1d s1d = this.A06;
            s1d.A00 = true;
            Iterator A0m = Pxi.A0m(s1d.A02);
            while (A0m.hasNext()) {
                C13837TiC tiC = (C13837TiC) A0m.next();
                if (tiC.isRunning()) {
                    tiC.pause();
                    s1d.A01.add(tiC);
                }
            }
            this.A07.onStop();
        }
    }

    public final synchronized String toString() {
        StringBuilder A1A;
        A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append("{tracker=");
        A1A.append(this.A06);
        A1A.append(", treeNode=");
        return C66582MXn.A0v(this.A05, A1A);
    }

    static {
        QHM qhm = (QHM) new TA3().A0F(Bitmap.class);
        qhm.A0J = true;
        A0A = qhm;
        QHM qhm2 = (QHM) new TA3().A0F(Q6Z.class);
        qhm2.A0J = true;
        A0B = qhm2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.Sjy} */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.Tgg, X.TlJ] */
    /* JADX WARNING: type inference failed for: r1v9, types: [X.TA3, X.QHM] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Sk4(android.content.Context r7, X.SUv r8, X.C13700TfI r9, X.TZq r10) {
        /*
            r6 = this;
            X.S1d r1 = new X.S1d
            r1.<init>()
            r6.<init>()
            X.Sk2 r0 = new X.Sk2
            r0.<init>()
            r6.A07 = r0
            X.TB0 r4 = new X.TB0
            r4.<init>(r6)
            r6.A08 = r4
            r6.A02 = r8
            r6.A04 = r9
            r6.A05 = r10
            r6.A06 = r1
            r6.A01 = r7
            android.content.Context r5 = r7.getApplicationContext()
            X.Sjw r3 = new X.Sjw
            r3.<init>(r6, r1)
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = X.02K.A00(r5, r0)
            boolean r2 = X.AnonymousClass7TF.A1Q(r0)
            r1 = 3
            java.lang.String r0 = "ConnectivityMonitor"
            android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L_0x0067
            X.Sjy r2 = new X.Sjy
            r2.<init>(r5, r3)
        L_0x0040:
            r6.A03 = r2
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x005f
            r9.A8t(r6)
        L_0x004f:
            r9.A8t(r2)
            X.Q6I r2 = r8.A00
            java.util.List r1 = r2.A06
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r1)
            r6.A09 = r0
            monitor-enter(r2)
            goto L_0x006d
        L_0x005f:
            android.os.Handler r0 = X.C11424STg.A02()
            r0.post(r4)
            goto L_0x004f
        L_0x0067:
            X.Sjx r2 = new X.Sjx
            r2.<init>()
            goto L_0x0040
        L_0x006d:
            X.QHM r1 = r2.A00     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x007b
            X.QHM r1 = new X.QHM     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            r0 = 1
            r1.A0J = r0     // Catch:{ all -> 0x00b3 }
            r2.A00 = r1     // Catch:{ all -> 0x00b3 }
        L_0x007b:
            monitor-exit(r2)
            r2 = r6
            monitor-enter(r2)
            X.TA3 r1 = r1.clone()     // Catch:{ all -> 0x00b3 }
            X.QHM r1 = (X.QHM) r1     // Catch:{ all -> 0x00b3 }
            boolean r0 = r1.A0J     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0093
            boolean r0 = r1.A0H     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "You cannot auto lock an already locked options object, try clone() first"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x0093:
            r0 = 1
            r1.A0H = r0     // Catch:{ all -> 0x00b3 }
            r1.A0J = r0     // Catch:{ all -> 0x00b3 }
            r6.A00 = r1     // Catch:{ all -> 0x00b3 }
            monitor-exit(r2)
            java.util.List r1 = r8.A06
            monitor-enter(r1)
            boolean r0 = r1.contains(r6)     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x00a9
            r1.add(r6)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b0 }
            return
        L_0x00a9:
            java.lang.String r0 = "Cannot register already registered manager"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sk4.<init>(android.content.Context, X.SUv, X.TfI, X.TZq):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r5.Eig((X.C13837TiC) null);
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C13918TlK r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0037
            boolean r0 = r4.A01(r5)
            X.TiC r3 = r5.Bn5()
            if (r0 != 0) goto L_0x0037
            X.SUv r0 = r4.A02
            java.util.List r2 = r0.A06
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0015:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0034 }
            X.Sk4 r0 = (X.Sk4) r0     // Catch:{ all -> 0x0034 }
            boolean r0 = r0.A01(r5)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0037
            r0 = 0
            r5.Eig(r0)
            r3.clear()
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sk4.A00(X.TlK):void");
    }

    public final void onTrimMemory(int i) {
    }
}
