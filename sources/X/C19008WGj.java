package X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.NativeMemoryChunk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: X.WGj  reason: case insensitive filesystem */
public abstract class C19008WGj implements AnonymousClass15X, 1T3 {
    public final SparseArray A00;
    public final AnonymousClass1Jg A01;
    public final C17307VQm A02;
    public final C17307VQm A03;
    public final C17405VUk A04;
    public final Set A05;
    public final X9i A06;
    public final Class A07 = getClass();

    private synchronized void A00(SparseIntArray sparseIntArray) {
        SparseArray sparseArray = this.A00;
        sparseArray.clear();
        SparseIntArray sparseIntArray2 = this.A04.A02;
        for (int i = 0; i < sparseIntArray2.size(); i++) {
            int keyAt = sparseIntArray2.keyAt(i);
            sparseArray.put(keyAt, new C17404VUj(keyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ECO(java.lang.Object r10) {
        /*
            r9 = this;
            r8 = r9
            r10.getClass()
            boolean r7 = r9 instanceof X.C15010UJn
            if (r7 == 0) goto L_0x000b
            r5 = 0
        L_0x0009:
            monitor-enter(r8)
            goto L_0x0014
        L_0x000b:
            r1 = r10
            byte[] r1 = (byte[]) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r5 = r1.length
            goto L_0x0009
        L_0x0014:
            android.util.SparseArray r0 = r9.A00     // Catch:{ all -> 0x00fe }
            java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x00fe }
            X.VUj r2 = (X.C17404VUj) r2     // Catch:{ all -> 0x00fe }
            java.util.Set r0 = r9.A05     // Catch:{ all -> 0x0103 }
            boolean r0 = r0.remove(r10)     // Catch:{ all -> 0x0103 }
            if (r0 != 0) goto L_0x0051
            java.lang.Class r6 = r9.A07     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            int r0 = java.lang.System.identityHashCode(r10)     // Catch:{ all -> 0x0103 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0103 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x0103 }
            X.0I2 r2 = X.0I1.A00     // Catch:{ all -> 0x0103 }
            r0 = 6
            boolean r0 = r2.isLoggable(r0)     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r1 = r6.getSimpleName()     // Catch:{ all -> 0x0103 }
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r4, r3)     // Catch:{ all -> 0x0103 }
            r2.e(r1, r0)     // Catch:{ all -> 0x0103 }
        L_0x004d:
            if (r7 == 0) goto L_0x00fc
            goto L_0x00f4
        L_0x0051:
            if (r2 == 0) goto L_0x00b4
            int r1 = r2.A00     // Catch:{ all -> 0x0103 }
            java.util.Queue r6 = r2.A02     // Catch:{ all -> 0x0103 }
            int r0 = r6.size()     // Catch:{ all -> 0x0103 }
            int r1 = r1 + r0
            int r0 = r2.A01     // Catch:{ all -> 0x0103 }
            if (r1 > r0) goto L_0x00a7
            X.VQm r4 = r9.A03     // Catch:{ all -> 0x00fe }
            int r1 = r4.A01     // Catch:{ all -> 0x00fe }
            X.VQm r3 = r9.A02     // Catch:{ all -> 0x00fe }
            int r0 = r3.A01     // Catch:{ all -> 0x00fe }
            int r1 = r1 + r0
            X.VUk r0 = r9.A04     // Catch:{ all -> 0x00fe }
            int r0 = r0.A01     // Catch:{ all -> 0x00fe }
            boolean r0 = X.C51970G9q.A1W(r1, r0)
            if (r0 != 0) goto L_0x00a7
            if (r7 == 0) goto L_0x0084
            r1 = r10
            com.facebook.imagepipeline.memory.NativeMemoryChunk r1 = (com.facebook.imagepipeline.memory.NativeMemoryChunk) r1     // Catch:{ all -> 0x0103 }
            r1.getClass()     // Catch:{ all -> 0x0103 }
            monitor-enter(r1)     // Catch:{ all -> 0x0103 }
            boolean r0 = r1.mIsClosed     // Catch:{ all -> 0x0100 }
            monitor-exit(r1)     // Catch:{ all -> 0x0103 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0084
            goto L_0x00a7
        L_0x0084:
            r1 = 1
            int r0 = r2.A00     // Catch:{ all -> 0x0103 }
            if (r0 <= 0) goto L_0x009b
            int r0 = r0 - r1
            r2.A00 = r0     // Catch:{ all -> 0x0103 }
            r6.add(r10)     // Catch:{ all -> 0x0103 }
        L_0x008f:
            int r0 = r3.A00     // Catch:{ all -> 0x0103 }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x0103 }
            int r0 = r3.A01     // Catch:{ all -> 0x0103 }
            int r0 = r0 + r5
            r3.A01 = r0     // Catch:{ all -> 0x0103 }
            goto L_0x00c0
        L_0x009b:
            java.lang.Object[] r2 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "BUCKET"
            java.lang.String r0 = "Tried to release value %s from an empty bucket!"
            X.0I1.A08(r1, r0, r2)     // Catch:{ all -> 0x0103 }
            goto L_0x008f
        L_0x00a7:
            int r3 = r2.A00     // Catch:{ all -> 0x0103 }
            r1 = 1
            boolean r0 = X.AnonymousClass7TF.A1R(r3)
            X.0He.A00(r0)     // Catch:{ all -> 0x0103 }
            int r3 = r3 - r1
            r2.A00 = r3     // Catch:{ all -> 0x0103 }
        L_0x00b4:
            if (r7 == 0) goto L_0x00be
            com.facebook.imagepipeline.memory.NativeMemoryChunk r10 = (com.facebook.imagepipeline.memory.NativeMemoryChunk) r10     // Catch:{ all -> 0x0103 }
            r10.getClass()     // Catch:{ all -> 0x0103 }
            r10.close()     // Catch:{ all -> 0x0103 }
        L_0x00be:
            X.VQm r4 = r9.A03     // Catch:{ all -> 0x0103 }
        L_0x00c0:
            int r3 = r4.A01     // Catch:{ all -> 0x0103 }
            r1 = 1
            if (r3 < r5) goto L_0x00d0
            int r0 = r4.A00     // Catch:{ all -> 0x0103 }
            if (r0 <= 0) goto L_0x00d0
            int r0 = r0 - r1
            r4.A00 = r0     // Catch:{ all -> 0x0103 }
            int r3 = r3 - r5
            r4.A01 = r3     // Catch:{ all -> 0x0103 }
            goto L_0x00fc
        L_0x00d0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0103 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0103 }
            int r0 = r4.A00     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r4 = X.Pxf.A1Y(r2, r1, r0)     // Catch:{ all -> 0x0103 }
            java.lang.String r3 = "com.facebook.imagepipeline.memory.BasePool.Counter"
            java.lang.String r2 = "Unexpected decrement of %d. Current numBytes = %d, count = %d"
            X.0I2 r1 = X.0I1.A00     // Catch:{ all -> 0x0103 }
            r0 = 6
            boolean r0 = r1.isLoggable(r0)     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x00fc
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r2, r4)     // Catch:{ all -> 0x0103 }
            r1.wtf(r3, r0)     // Catch:{ all -> 0x0103 }
            goto L_0x00fc
        L_0x00f4:
            com.facebook.imagepipeline.memory.NativeMemoryChunk r10 = (com.facebook.imagepipeline.memory.NativeMemoryChunk) r10     // Catch:{ all -> 0x0103 }
            r10.getClass()     // Catch:{ all -> 0x0103 }
            r10.close()     // Catch:{ all -> 0x0103 }
        L_0x00fc:
            monitor-exit(r8)     // Catch:{ all -> 0x0103 }
            return
        L_0x00fe:
            r0 = move-exception
            goto L_0x0102
        L_0x0100:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0103 }
        L_0x0102:
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0103 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19008WGj.ECO(java.lang.Object):void");
    }

    public final void FI1(1Jh r10) {
        int i;
        ArrayList arrayList;
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            arrayList = new ArrayList(sparseArray.size());
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                C17404VUj vUj = (C17404VUj) sparseArray.valueAt(i2);
                vUj.getClass();
                if (vUj.A02.size() > 0) {
                    arrayList.add(vUj);
                }
                sparseIntArray.put(sparseArray.keyAt(i2), vUj.A00);
            }
            A00(sparseIntArray);
            C17307VQm vQm = this.A02;
            vQm.A00 = 0;
            vQm.A01 = 0;
        }
        for (i = 0; i < arrayList.size(); i++) {
            C17404VUj vUj2 = (C17404VUj) arrayList.get(i);
            while (true) {
                Object poll = vUj2.A02.poll();
                if (poll == null) {
                    break;
                } else if (this instanceof C15010UJn) {
                    NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) poll;
                    nativeMemoryChunk.getClass();
                    nativeMemoryChunk.close();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.VQm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.VQm, java.lang.Object] */
    public C19008WGj(AnonymousClass1Jg r3, C17405VUk vUk, X9i x9i) {
        r3.getClass();
        this.A01 = r3;
        vUk.getClass();
        this.A04 = vUk;
        x9i.getClass();
        this.A06 = x9i;
        this.A00 = new SparseArray();
        A00(new SparseIntArray(0));
        this.A05 = Collections.newSetFromMap(new IdentityHashMap());
        this.A02 = new Object();
        this.A03 = new Object();
    }
}
