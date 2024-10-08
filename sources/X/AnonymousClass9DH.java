package X;

import android.net.NetworkInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9DH  reason: invalid class name */
public final class AnonymousClass9DH implements AnonymousClass0qK {
    public B14 A00;
    public final AnonymousClass9DF A01;
    public final AnonymousClass9DI A02;
    public final AtomicReference A03 = new AtomicReference();
    public final AtomicReference A04 = new AtomicReference();
    public volatile int A05 = 0;

    public AnonymousClass9DH(AnonymousClass9DF r3) {
        AnonymousClass9DI r1 = new AnonymousClass9DI(r3);
        this.A01 = r3;
        this.A02 = r1;
    }

    public final Object A00() {
        AnonymousClass2h0 r0;
        boolean z;
        ListenableFuture Eyk;
        C239973Ja r02;
        int i = this.A05;
        if (i == 2) {
            return this.A03.get();
        }
        if (i == 0) {
            A01();
            i = this.A05;
        }
        AtomicReference atomicReference = this.A04;
        Future future = (Future) atomicReference.get();
        if (future == null) {
            AnonymousClass9DI r3 = this.A02;
            AnonymousClass9DF r2 = this.A01;
            if (r2.A01 == null) {
                synchronized (r2) {
                    if (r2.A01 == null) {
                        AnonymousClass9DF r1 = r2;
                        if (r2 instanceof AnonymousClass9DE) {
                            r02 = ((AnonymousClass9DE) r1).A01;
                        } else {
                            r02 = ((C381049b5) r1).A01;
                        }
                        r2.A01 = ((AnonymousClass3JZ) r02).A00;
                    }
                }
            }
            AnonymousClass3JY r22 = r2.A01;
            List list = AnonymousClass9DK.A01;
            if (list.contains(r22)) {
                Eyk = null;
            } else {
                list.add(r22);
                Eyk = AnonymousClass9DI.A02.Eyk(new AnonymousClass9DL(r22, r3));
            }
            if (1FH.A00((Object) null, Eyk, atomicReference)) {
                r3.A01 = this;
                C62670v5.A0B.A03(this);
            }
        } else if (future.isDone()) {
            try {
                AnonymousClass9DP r32 = (AnonymousClass9DP) future.get();
                if (r32 != null) {
                    File file = r32.A00;
                    AnonymousClass9DF r12 = this.A01;
                    if (r12 instanceof AnonymousClass9DE) {
                        r0 = ((AnonymousClass9DE) r12).A03;
                    } else {
                        r0 = ((C381049b5) r12).A03;
                    }
                    Object AJs = r0.AJs(file);
                    AtomicReference atomicReference2 = this.A03;
                    synchronized (atomicReference2) {
                        if (i == this.A05) {
                            atomicReference2.set(AJs);
                            this.A05 = 2;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        if (!r32.A01) {
                            C61940qJ.A00(this);
                        }
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return this.A03.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r1.isFile() != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r5 = this;
            int r0 = r5.A05
            if (r0 != 0) goto L_0x0073
            X.9DI r0 = r5.A02
            X.9DG r0 = r0.A00
            X.9DF r0 = (X.AnonymousClass9DF) r0
            X.9DJ r3 = r0.A02()
            android.content.SharedPreferences r4 = r3.A01
            if (r4 != 0) goto L_0x001d
            android.content.Context r2 = r3.A00
            r1 = 0
            java.lang.String r0 = "asset_preferences"
            android.content.SharedPreferences r4 = r2.getSharedPreferences(r0, r1)
            r3.A01 = r4
        L_0x001d:
            X.95S r0 = r3.A02
            if (r0 != 0) goto L_0x0033
            java.lang.String r2 = "location"
            X.95S r1 = X.AnonymousClass95R.A04
            java.lang.String r0 = r3.A04
            X.95T r0 = r1.A00(r0)
            X.95T r0 = r0.A00(r2)
            X.95S r0 = (X.AnonymousClass95S) r0
            r3.A02 = r0
        L_0x0033:
            java.lang.String r0 = r0.toString()
            r3 = 0
            java.lang.String r0 = r4.getString(r0, r3)
            if (r0 == 0) goto L_0x0060
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x0060
        L_0x0049:
            X.9DF r2 = r5.A01
            boolean r0 = r2 instanceof X.AnonymousClass9DE
            if (r0 == 0) goto L_0x005b
            X.9DE r2 = (X.AnonymousClass9DE) r2
            X.2h0 r0 = r2.A03
        L_0x0053:
            java.lang.Object r2 = r0.AJs(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r5.A03
            monitor-enter(r1)
            goto L_0x0062
        L_0x005b:
            X.9b5 r2 = (X.C381049b5) r2
            X.2h0 r0 = r2.A03
            goto L_0x0053
        L_0x0060:
            r1 = 0
            goto L_0x0049
        L_0x0062:
            int r0 = r5.A05     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006e
            r0 = 1
            r5.A05 = r0     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x006e
            X.1FH.A00(r3, r2, r1)     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r1)     // Catch:{ all -> 0x0070 }
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0070 }
            throw r0
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9DH.A01():void");
    }

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return;
        }
        if (networkInfo.getType() == 1 || networkInfo.getType() == 0) {
            AtomicReference atomicReference = this.A04;
            Future future = (Future) atomicReference.get();
            if (future != null && future.isDone()) {
                try {
                    AnonymousClass9DP r0 = (AnonymousClass9DP) future.get();
                    if ((r0 == null || r0.A01) && 1FH.A00(future, (Object) null, atomicReference)) {
                        A00();
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
    }

    public final boolean A02() {
        A01();
        if (this.A03.get() != null) {
            return true;
        }
        return false;
    }
}
