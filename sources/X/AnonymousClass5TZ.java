package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.5TZ  reason: invalid class name */
public final class AnonymousClass5TZ extends AnonymousClass5P2 {
    public static final Object A05 = new Object();
    public int A00;
    public int A01;
    public int A02;
    public 01h A03;
    public Object A04 = A05;

    public final int A02(AnonymousClass5TY r20, Snapshot snapshot) {
        01h r4;
        AnonymousClass5P2 A042;
        synchronized (AnonymousClass5P3.A07) {
            r4 = this.A03;
        }
        boolean z = false;
        if (r4.A01 != 0) {
            z = true;
        }
        int i = 7;
        if (z) {
            C285045Pl A002 = AnonymousClass5XF.A00();
            int i2 = A002.A00;
            AnonymousClass5TY r5 = r20;
            if (i2 > 0) {
                Object[] objArr = A002.A02;
                int i3 = 0;
                do {
                    ((AnonymousClass5X2) objArr[i3]).EwH(r5);
                    i3++;
                } while (i3 < i2);
            }
            try {
                Object[] objArr2 = r4.A04;
                int[] iArr = r4.A02;
                long[] jArr = r4.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    int i5 = 7;
                    while (true) {
                        long j = jArr[i4];
                        if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i6 = 8 - (((i4 - length) ^ -1) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    C284925Ox r15 = (C284925Ox) objArr2[i8];
                                    if (iArr[i8] == 1) {
                                        Snapshot snapshot2 = snapshot;
                                        if (r15 instanceof AnonymousClass5TX) {
                                            AnonymousClass5TX r152 = (AnonymousClass5TX) r15;
                                            A042 = AnonymousClass5TX.A00((AnonymousClass5TZ) AnonymousClass5P3.A04(snapshot2, r152.A00), r152, snapshot2, r152.A02, false);
                                        } else {
                                            A042 = AnonymousClass5P3.A04(snapshot2, r15.B6D());
                                        }
                                        i5 = (((i5 * 31) + System.identityHashCode(A042)) * 31) + A042.A00;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                    i = i5;
                }
                int i9 = A002.A00;
                if (i9 > 0) {
                    Object[] objArr3 = A002.A02;
                    int i10 = 0;
                    do {
                        ((AnonymousClass5X2) objArr3[i10]).AQ4(r5);
                        i10++;
                    } while (i10 < i9);
                }
            } catch (Throwable th) {
                int i11 = A002.A00;
                if (i11 > 0) {
                    Object[] objArr4 = A002.A02;
                    int i12 = 0;
                    do {
                        ((AnonymousClass5X2) objArr4[i12]).AQ4(r5);
                        i12++;
                    } while (i12 < i11);
                }
                throw th;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r5.A02 != r7.A02()) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.AnonymousClass5TY r6, androidx.compose.runtime.snapshots.Snapshot r7) {
        /*
            r5 = this;
            java.lang.Object r4 = X.AnonymousClass5P3.A07
            monitor-enter(r4)
            int r1 = r5.A01     // Catch:{ all -> 0x0039 }
            int r0 = r7.A01()     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 != r0) goto L_0x0015
            int r1 = r5.A02     // Catch:{ all -> 0x0039 }
            int r0 = r7.A02()     // Catch:{ all -> 0x0039 }
            r2 = 0
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            monitor-exit(r4)
            java.lang.Object r1 = r5.A04
            java.lang.Object r0 = A05
            if (r1 == r0) goto L_0x0038
            if (r2 == 0) goto L_0x0027
            int r1 = r5.A00
            int r0 = r5.A02(r6, r7)
            if (r1 != r0) goto L_0x0038
        L_0x0027:
            r3 = 1
            if (r2 == 0) goto L_0x0038
            monitor-enter(r4)
            int r0 = r7.A01()     // Catch:{ all -> 0x0039 }
            r5.A01 = r0     // Catch:{ all -> 0x0039 }
            int r0 = r7.A02()     // Catch:{ all -> 0x0039 }
            r5.A02 = r0     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)
        L_0x0038:
            return r3
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TZ.A03(X.5TY, androidx.compose.runtime.snapshots.Snapshot):boolean");
    }

    public AnonymousClass5TZ() {
        0vu r1 = AnonymousClass01i.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.A03 = r1;
    }
}
