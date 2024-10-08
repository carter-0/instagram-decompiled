package X;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;

/* renamed from: X.4Xc  reason: invalid class name and case insensitive filesystem */
public final class C265984Xc implements C265994Xd {
    public int A00;
    public int A01 = IgNetworkConsentStorage.MAX_ENTRIES;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07;
    public long A08 = Long.MIN_VALUE;
    public Uri A09;
    public C256683wB A0A;
    public C256683wB A0B;
    public C290325f8 A0C;
    public C22531Y8c A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = true;
    public int[] A0J = new int[IgNetworkConsentStorage.MAX_ENTRIES];
    public int[] A0K = new int[IgNetworkConsentStorage.MAX_ENTRIES];
    public int[] A0L = new int[IgNetworkConsentStorage.MAX_ENTRIES];
    public long[] A0M = new long[IgNetworkConsentStorage.MAX_ENTRIES];
    public long[] A0N = new long[IgNetworkConsentStorage.MAX_ENTRIES];
    public C266034Xh[] A0O = new C266034Xh[IgNetworkConsentStorage.MAX_ENTRIES];
    public C256683wB A0P;
    public boolean A0Q = true;
    public final C265184Sw A0R;
    public final C265114Sp A0S;
    public final C266004Xe A0T;
    public final C266064Xk A0U = new C266064Xk(new C266044Xi());
    public final C266024Xg A0V = new Object();

    private int A00(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.A0N[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.A0J[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.A01) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A03(long r12, boolean r14) {
        /*
            r11 = this;
            r5 = r11
            monitor-enter(r5)
            int r4 = r11.A03     // Catch:{ all -> 0x0036 }
            int r6 = r11.A04     // Catch:{ all -> 0x0036 }
            int r6 = r6 + r4
            int r0 = r11.A01     // Catch:{ all -> 0x0036 }
            if (r6 < r0) goto L_0x000c
            int r6 = r6 - r0
        L_0x000c:
            int r7 = r11.A02     // Catch:{ all -> 0x0036 }
            r0 = 0
            if (r4 == r7) goto L_0x0012
            r0 = 1
        L_0x0012:
            r3 = 0
            if (r0 == 0) goto L_0x0034
            long[] r0 = r11.A0N     // Catch:{ all -> 0x0036 }
            r1 = r0[r6]     // Catch:{ all -> 0x0036 }
            r8 = r12
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r0 = r11.A06     // Catch:{ all -> 0x0036 }
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            int r7 = r7 - r4
            r10 = 1
            int r7 = r5.A00(r6, r7, r8, r10)     // Catch:{ all -> 0x0036 }
            r0 = -1
            if (r7 != r0) goto L_0x0032
            goto L_0x0034
        L_0x002f:
            if (r14 == 0) goto L_0x0025
            int r7 = r7 - r4
        L_0x0032:
            monitor-exit(r5)
            return r7
        L_0x0034:
            monitor-exit(r5)
            return r3
        L_0x0036:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265984Xc.A03(long, boolean):int");
    }

    public final synchronized long A05() {
        return this.A06;
    }

    public final void A09() {
        A0C(true);
        C290325f8 r1 = this.A0C;
        if (r1 != null) {
            r1.ECN(this.A0R);
            this.A0C = null;
            this.A0A = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        if ((r3.A03 + r4) > r3.A02) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0A(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 < 0) goto L_0x000b
            int r2 = r3.A03     // Catch:{ all -> 0x0016 }
            int r2 = r2 + r4
            int r1 = r3.A02     // Catch:{ all -> 0x0016 }
            r0 = 1
            if (r2 <= r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            X.C256703wD.A03(r0)     // Catch:{ all -> 0x0016 }
            int r0 = r3.A03     // Catch:{ all -> 0x0016 }
            int r0 = r0 + r4
            r3.A03 = r0     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)
            return
        L_0x0016:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265984Xc.A0A(int):void");
    }

    public final void A0B(long j, boolean z, boolean z2) {
        long j2;
        int i;
        C266004Xe r3 = this.A0T;
        synchronized (this) {
            int i2 = this.A02;
            if (i2 != 0) {
                long[] jArr = this.A0N;
                int i3 = this.A04;
                long j3 = j;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.A03) != i2) {
                        i2 = i + 1;
                    }
                    int A002 = A00(i3, i2, j3, z);
                    if (A002 != -1) {
                        j2 = A01(this, A002);
                    }
                }
            }
            j2 = -1;
        }
        r3.A05(j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0D(long r11, boolean r13) {
        /*
            r10 = this;
            r4 = r10
            monitor-enter(r4)
            r3 = 0
            r10.A03 = r3     // Catch:{ all -> 0x0037 }
            X.4Xe r1 = r10.A0T     // Catch:{ all -> 0x0037 }
            X.4Xf r0 = r1.A01     // Catch:{ all -> 0x0037 }
            r1.A02 = r0     // Catch:{ all -> 0x0037 }
            int r5 = r10.A04     // Catch:{ all -> 0x0039 }
            int r0 = r10.A01     // Catch:{ all -> 0x0039 }
            if (r5 < r0) goto L_0x0012
            int r5 = r5 - r0
        L_0x0012:
            int r6 = r10.A02     // Catch:{ all -> 0x0039 }
            if (r3 == r6) goto L_0x0027
            long[] r0 = r10.A0N     // Catch:{ all -> 0x0039 }
            r1 = r0[r5]     // Catch:{ all -> 0x0039 }
            r7 = r11
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            long r0 = r10.A06     // Catch:{ all -> 0x0039 }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0029
            if (r13 != 0) goto L_0x0029
        L_0x0027:
            monitor-exit(r4)
            return r3
        L_0x0029:
            r9 = 1
            int r1 = r4.A00(r5, r6, r7, r9)     // Catch:{ all -> 0x0039 }
            r0 = -1
            if (r1 == r0) goto L_0x0027
            r10.A08 = r11     // Catch:{ all -> 0x0039 }
            r10.A03 = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)
            return r9
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265984Xc.A0D(long, boolean):boolean");
    }

    public final synchronized boolean A0E(boolean z) {
        boolean z2;
        int i = this.A03;
        boolean z3 = false;
        if (i != this.A02) {
            z3 = true;
        }
        z2 = true;
        if (!z3) {
            if (!z && !this.A0E) {
                C256683wB r2 = this.A0B;
                if (!(r2 == null || r2 == this.A0A)) {
                }
            }
        } else if (((AnonymousClass4YZ) this.A0U.A00(this.A00 + i)).A00 == this.A0A) {
            int i2 = this.A04 + this.A03;
            int i3 = this.A01;
            if (i2 >= i3) {
                i2 -= i3;
            }
            C290325f8 r0 = this.A0C;
            if (r0 == null || r0.Bz1() == 4) {
                z2 = true;
            } else if ((this.A0J[i2] & SN3.MAX_SIGNED_POWER_OF_TWO) == 0) {
                this.A0C.E2s();
            }
        }
        z2 = false;
        return z2;
    }

    public final void AWP(C256683wB r10) {
        boolean z;
        C256683wB r4 = r10;
        long j = this.A07;
        if (j != 0) {
            long j2 = r10.A0M;
            if (j2 != Long.MAX_VALUE) {
                C256653w8 r0 = new C256653w8(r10);
                r0.A0K = j2 + j;
                r4 = new C256683wB(r0);
            }
        }
        this.A0H = false;
        this.A0P = r10;
        synchronized (this) {
            this.A0I = false;
            if (Util.A0I(r4, this.A0B)) {
                z = false;
            } else {
                SparseArray sparseArray = this.A0U.A01;
                if (sparseArray.size() != 0 && ((AnonymousClass4YZ) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(r4)) {
                    r4 = ((AnonymousClass4YZ) sparseArray.valueAt(sparseArray.size() - 1)).A00;
                }
                this.A0B = r4;
                this.A0G = 2Kn.A07(r4.A0W, r4.A0R);
                this.A0F = false;
                z = true;
            }
        }
        C22531Y8c y8c = this.A0D;
        if (y8c != null && z) {
            XDJ xdj = (XDJ) y8c;
            xdj.A0L.post(xdj.A0T);
        }
    }

    public final /* synthetic */ void EJh(AnonymousClass4XV r2, int i) {
        EJi(r2, i, 0);
    }

    public final void EJn(C266034Xh r13, int i, int i2, int i3, long j) {
        AnonymousClass4YX r1;
        if (this.A0H) {
            C256683wB r0 = this.A0P;
            C256703wD.A01(r0);
            AWP(r0);
        }
        int i4 = i & 1;
        boolean z = false;
        if (i4 != 0) {
            z = true;
        }
        if (this.A0Q) {
            if (z) {
                this.A0Q = false;
            } else {
                return;
            }
        }
        long j2 = this.A07 + j;
        if (this.A0G) {
            if (j2 < this.A08) {
                return;
            }
            if (i4 == 0) {
                if (!this.A0F) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Pxd.A00(548));
                    sb.append(this.A0B);
                    2AG.A04("SampleQueue", sb.toString());
                    this.A0F = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.A0T.A00 - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i5 = this.A02;
            if (i5 > 0) {
                int i6 = this.A04 + (i5 - 1);
                int i7 = this.A01;
                if (i6 >= i7) {
                    i6 -= i7;
                }
                boolean z2 = false;
                if (this.A0M[i6] + ((long) this.A0K[i6]) <= j3) {
                    z2 = true;
                }
                C256703wD.A03(z2);
            }
            boolean z3 = false;
            if ((536870912 & i) != 0) {
                z3 = true;
            }
            this.A0E = z3;
            this.A06 = Math.max(this.A06, j2);
            int i8 = this.A04 + this.A02;
            int i9 = this.A01;
            if (i8 >= i9) {
                i8 -= i9;
            }
            this.A0N[i8] = j2;
            this.A0M[i8] = j3;
            this.A0K[i8] = i2;
            this.A0J[i8] = i;
            this.A0O[i8] = r13;
            this.A0L[i8] = 0;
            C266064Xk r3 = this.A0U;
            SparseArray sparseArray = r3.A01;
            if (sparseArray.size() == 0 || !((AnonymousClass4YZ) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(this.A0B)) {
                C265114Sp r4 = this.A0S;
                if (r4 != null) {
                    r1 = r4.E3S(this.A0B, this.A0R);
                } else {
                    r1 = AnonymousClass4YX.A00;
                }
                int i10 = this.A00 + this.A02;
                C256683wB r02 = this.A0B;
                r02.getClass();
                AnonymousClass4YZ r42 = new AnonymousClass4YZ(r02, r1);
                boolean z4 = false;
                if (r3.A00 == -1) {
                    boolean z5 = false;
                    if (sparseArray.size() == 0) {
                        z5 = true;
                    }
                    C256703wD.A04(z5);
                    r3.A00 = 0;
                }
                if (sparseArray.size() > 0) {
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i10 >= keyAt) {
                        z4 = true;
                    }
                    C256703wD.A03(z4);
                    if (keyAt == i10) {
                        r3.A02.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i10, r42);
            }
            int i11 = this.A02 + 1;
            this.A02 = i11;
            int i12 = this.A01;
            if (i11 == i12) {
                int i13 = i12 + IgNetworkConsentStorage.MAX_ENTRIES;
                int[] iArr = new int[i13];
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                int[] iArr2 = new int[i13];
                int[] iArr3 = new int[i13];
                C266034Xh[] r2 = new C266034Xh[i13];
                int i14 = this.A04;
                int i15 = i12 - i14;
                System.arraycopy(this.A0M, i14, jArr, 0, i15);
                System.arraycopy(this.A0N, this.A04, jArr2, 0, i15);
                System.arraycopy(this.A0J, this.A04, iArr2, 0, i15);
                System.arraycopy(this.A0K, this.A04, iArr3, 0, i15);
                System.arraycopy(this.A0O, this.A04, r2, 0, i15);
                System.arraycopy(this.A0L, this.A04, iArr, 0, i15);
                int i16 = this.A04;
                System.arraycopy(this.A0M, 0, jArr, i15, i16);
                System.arraycopy(this.A0N, 0, jArr2, i15, i16);
                System.arraycopy(this.A0J, 0, iArr2, i15, i16);
                System.arraycopy(this.A0K, 0, iArr3, i15, i16);
                System.arraycopy(this.A0O, 0, r2, i15, i16);
                System.arraycopy(this.A0L, 0, iArr, i15, i16);
                this.A0M = jArr;
                this.A0N = jArr2;
                this.A0J = iArr2;
                this.A0K = iArr3;
                this.A0O = r2;
                this.A0L = iArr;
                this.A04 = 0;
                this.A01 = i13;
            }
        }
    }

    public static long A01(C265984Xc r7, int i) {
        r7.A05 = Math.max(r7.A05, A02(r7, i));
        r7.A02 -= i;
        int i2 = r7.A00 + i;
        r7.A00 = i2;
        int i3 = r7.A04 + i;
        r7.A04 = i3;
        int i4 = r7.A01;
        if (i3 >= i4) {
            r7.A04 = i3 - i4;
        }
        int i5 = r7.A03 - i;
        r7.A03 = i5;
        if (i5 < 0) {
            r7.A03 = 0;
        }
        C266064Xk r5 = r7.A0U;
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = r5.A01;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            r5.A02.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = r5.A00;
            if (i8 > 0) {
                r5.A00 = i8 - 1;
            }
            i6 = i7;
        }
        if (r7.A02 != 0) {
            return r7.A0M[r7.A04];
        }
        int i9 = r7.A04;
        if (i9 == 0) {
            i9 = r7.A01;
        }
        int i10 = i9 - 1;
        return r7.A0M[i10] + ((long) r7.A0K[i10]);
    }

    public static long A02(C265984Xc r8, int i) {
        int i2;
        long j = Long.MIN_VALUE;
        if (i != 0) {
            int i3 = r8.A04 + (i - 1);
            int i4 = r8.A01;
            if (i3 >= i4) {
                i3 -= i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                j = Math.max(j, r8.A0N[i2]);
                if ((r8.A0J[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i4 - 1;
                }
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r6 != r10.A0A) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d5, code lost:
        return -5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d8, code lost:
        return -3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        if ((r12.A00 & 4) == 4) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e8, code lost:
        if ((r13 & 1) == 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ea, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ed, code lost:
        if ((r13 & 4) != 0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ef, code lost:
        r2 = r10.A0T;
        r1 = r2.A02;
        r0 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f5, code lost:
        if (r5 == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f7, code lost:
        X.C266004Xe.A01(r12, r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fa, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fb, code lost:
        if (r5 != false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        r2.A02 = X.C266004Xe.A01(r12, r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0104, code lost:
        r10.A03++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010a, code lost:
        return -4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04(X.AnonymousClass4PO r11, X.AnonymousClass4PQ r12, int r13, boolean r14) {
        /*
            r10 = this;
            r0 = r13 & 2
            r5 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0007
            r3 = 1
        L_0x0007:
            X.4Xg r4 = r10.A0V
            r9 = r10
            monitor-enter(r9)
            r12.A04 = r5     // Catch:{ all -> 0x010b }
            int r2 = r10.A03     // Catch:{ all -> 0x010b }
            int r0 = r10.A02     // Catch:{ all -> 0x010b }
            if (r2 == r0) goto L_0x0078
            X.4Xk r1 = r10.A0U     // Catch:{ all -> 0x010b }
            int r0 = r10.A00     // Catch:{ all -> 0x010b }
            int r0 = r0 + r2
            java.lang.Object r0 = r1.A00(r0)     // Catch:{ all -> 0x010b }
            X.4YZ r0 = (X.AnonymousClass4YZ) r0     // Catch:{ all -> 0x010b }
            X.3wB r6 = r0.A00     // Catch:{ all -> 0x010b }
            if (r3 != 0) goto L_0x0088
            X.3wB r0 = r10.A0A     // Catch:{ all -> 0x010b }
            if (r6 != r0) goto L_0x0088
            int r0 = r10.A03     // Catch:{ all -> 0x010b }
            int r6 = r10.A04     // Catch:{ all -> 0x010b }
            int r6 = r6 + r0
            int r0 = r10.A01     // Catch:{ all -> 0x010b }
            if (r6 < r0) goto L_0x0030
            int r6 = r6 - r0
        L_0x0030:
            X.5f8 r0 = r10.A0C     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x004e
            int r1 = r0.Bz1()     // Catch:{ all -> 0x010b }
            r0 = 4
            if (r1 == r0) goto L_0x004e
            int[] r0 = r10.A0J     // Catch:{ all -> 0x010b }
            r1 = r0[r6]     // Catch:{ all -> 0x010b }
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0049
            X.5f8 r0 = r10.A0C     // Catch:{ all -> 0x010b }
            r0.E2s()     // Catch:{ all -> 0x010b }
        L_0x0049:
            r0 = 1
            r12.A04 = r0     // Catch:{ all -> 0x010b }
            goto L_0x00d7
        L_0x004e:
            int[] r0 = r10.A0J     // Catch:{ all -> 0x010b }
            r8 = r0[r6]     // Catch:{ all -> 0x010b }
            r12.A00 = r8     // Catch:{ all -> 0x010b }
            long[] r0 = r10.A0N     // Catch:{ all -> 0x010b }
            r2 = r0[r6]     // Catch:{ all -> 0x010b }
            r12.A01 = r2     // Catch:{ all -> 0x010b }
            long r0 = r10.A08     // Catch:{ all -> 0x010b }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0065
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r8
            r12.A00 = r0     // Catch:{ all -> 0x010b }
        L_0x0065:
            int[] r0 = r10.A0K     // Catch:{ all -> 0x010b }
            r0 = r0[r6]     // Catch:{ all -> 0x010b }
            r4.A00 = r0     // Catch:{ all -> 0x010b }
            long[] r0 = r10.A0M     // Catch:{ all -> 0x010b }
            r0 = r0[r6]     // Catch:{ all -> 0x010b }
            r4.A01 = r0     // Catch:{ all -> 0x010b }
            X.4Xh[] r0 = r10.A0O     // Catch:{ all -> 0x010b }
            r0 = r0[r6]     // Catch:{ all -> 0x010b }
            r4.A02 = r0     // Catch:{ all -> 0x010b }
            goto L_0x00dd
        L_0x0078:
            if (r14 != 0) goto L_0x00da
            boolean r0 = r10.A0E     // Catch:{ all -> 0x010b }
            if (r0 != 0) goto L_0x00da
            X.3wB r6 = r10.A0B     // Catch:{ all -> 0x010b }
            if (r6 == 0) goto L_0x00d7
            if (r3 != 0) goto L_0x0088
            X.3wB r0 = r10.A0A     // Catch:{ all -> 0x010b }
            if (r6 == r0) goto L_0x00d7
        L_0x0088:
            X.3wB r0 = r10.A0A     // Catch:{ all -> 0x010b }
            if (r0 != 0) goto L_0x008f
            r5 = 1
            r4 = 0
            goto L_0x0091
        L_0x008f:
            com.google.android.exoplayer2.drm.DrmInitData r4 = r0.A0O     // Catch:{ all -> 0x010b }
        L_0x0091:
            r10.A0A = r6     // Catch:{ all -> 0x010b }
            com.google.android.exoplayer2.drm.DrmInitData r2 = r6.A0O     // Catch:{ all -> 0x010b }
            X.4Sp r3 = r10.A0S     // Catch:{ all -> 0x010b }
            if (r3 == 0) goto L_0x00b0
            int r0 = r3.At6(r6)     // Catch:{ all -> 0x010b }
            X.3w8 r1 = new X.3w8     // Catch:{ all -> 0x010b }
            r1.<init>(r6)     // Catch:{ all -> 0x010b }
            r1.A05 = r0     // Catch:{ all -> 0x010b }
            X.3wB r0 = new X.3wB     // Catch:{ all -> 0x010b }
            r0.<init>(r1)     // Catch:{ all -> 0x010b }
        L_0x00a9:
            r11.A00 = r0     // Catch:{ all -> 0x010b }
            X.5f8 r0 = r10.A0C     // Catch:{ all -> 0x010b }
            r11.A01 = r0     // Catch:{ all -> 0x010b }
            goto L_0x00b2
        L_0x00b0:
            r0 = r6
            goto L_0x00a9
        L_0x00b2:
            if (r3 == 0) goto L_0x00d4
            if (r5 != 0) goto L_0x00bd
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r4, r2)     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00bd
            goto L_0x00d4
        L_0x00bd:
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00d4
            X.5f8 r2 = r10.A0C     // Catch:{ all -> 0x010b }
            X.4Sw r1 = r10.A0R     // Catch:{ all -> 0x010b }
            X.5f8 r0 = r3.A7H(r6, r1)     // Catch:{ all -> 0x010b }
            r10.A0C = r0     // Catch:{ all -> 0x010b }
            r11.A01 = r0     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x00d4
            r2.ECN(r1)     // Catch:{ all -> 0x010b }
        L_0x00d4:
            monitor-exit(r9)
            r3 = -5
            return r3
        L_0x00d7:
            monitor-exit(r9)
            r3 = -3
            return r3
        L_0x00da:
            r0 = 4
            r12.A00 = r0     // Catch:{ all -> 0x010b }
        L_0x00dd:
            monitor-exit(r9)
            r3 = -4
            r1 = 4
            int r0 = r12.A00
            r0 = r0 & 4
            if (r0 == r1) goto L_0x00fa
            r0 = r13 & 1
            if (r0 == 0) goto L_0x00eb
            r5 = 1
        L_0x00eb:
            r0 = r13 & 4
            if (r0 != 0) goto L_0x00fb
            X.4Xe r2 = r10.A0T
            X.4Xf r1 = r2.A02
            X.4XV r0 = r2.A05
            if (r5 == 0) goto L_0x00fe
            X.C266004Xe.A01(r12, r1, r4, r0)
        L_0x00fa:
            return r3
        L_0x00fb:
            if (r5 != 0) goto L_0x00fa
            goto L_0x0104
        L_0x00fe:
            X.4Xf r0 = X.C266004Xe.A01(r12, r1, r4, r0)
            r2.A02 = r0
        L_0x0104:
            int r0 = r10.A03
            int r0 = r0 + 1
            r10.A03 = r0
            return r3
        L_0x010b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265984Xc.A04(X.4PO, X.4PQ, int, boolean):int");
    }

    public final void A06() {
        long j;
        C266004Xe r3 = this.A0T;
        synchronized (this) {
            int i = this.A02;
            if (i == 0) {
                j = -1;
            } else {
                j = A01(this, i);
            }
        }
        r3.A05(j);
    }

    public final void A07() {
        C290325f8 r0 = this.A0C;
        if (r0 != null && r0.Bz1() == 1) {
            AnonymousClass5OP B27 = this.A0C.B27();
            B27.getClass();
            throw B27;
        }
    }

    public final void A0C(boolean z) {
        SparseArray sparseArray;
        C266004Xe r5 = this.A0T;
        C266004Xe.A04(r5.A01, r5);
        C266014Xf r4 = r5.A01;
        boolean z2 = false;
        if (r4.A03 == null) {
            z2 = true;
        }
        C256703wD.A04(z2);
        r4.A01 = 0;
        r4.A00 = 65536;
        r5.A02 = r4;
        r5.A03 = r4;
        r5.A00 = 0;
        r5.A04.FI0();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0Q = true;
        this.A08 = Long.MIN_VALUE;
        this.A05 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A0E = false;
        C266064Xk r42 = this.A0U;
        int i = 0;
        while (true) {
            sparseArray = r42.A01;
            if (i >= sparseArray.size()) {
                break;
            }
            r42.A02.accept(sparseArray.valueAt(i));
            i++;
        }
        r42.A00 = -1;
        sparseArray.clear();
        if (z) {
            this.A0P = null;
            this.A0B = null;
            this.A0I = true;
        }
    }

    public final void EJi(AnonymousClass4XV r9, int i, int i2) {
        C266004Xe r6 = this.A0T;
        while (i > 0) {
            int A002 = C266004Xe.A00(r6, i);
            C266014Xf r3 = r6.A03;
            r9.A0J(r3.A03.A00, (int) (r6.A00 - r3.A01), A002);
            i -= A002;
            long j = r6.A00 + ((long) A002);
            r6.A00 = j;
            C266014Xf r5 = r6.A03;
            if (j == r5.A00) {
                r6.A03 = r5.A02;
            }
        }
    }

    public final int EJl(C257123wt r9, int i, int i2, boolean z) {
        C266004Xe r7 = this.A0T;
        int A002 = C266004Xe.A00(r7, i);
        C266014Xf r3 = r7.A03;
        int read = r9.read(r3.A03.A00, (int) (r7.A00 - r3.A01), A002);
        if (read != -1) {
            long j = r7.A00 + ((long) read);
            r7.A00 = j;
            C266014Xf r32 = r7.A03;
            if (j != r32.A00) {
                return read;
            }
            r7.A03 = r32.A02;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4Xg, java.lang.Object] */
    public C265984Xc(C265184Sw r3, C265114Sp r4, AnonymousClass4QW r5) {
        this.A0S = r4;
        this.A0R = r3;
        this.A0T = new C266004Xe(r5);
    }

    public final void A08() {
        A06();
        C290325f8 r1 = this.A0C;
        if (r1 != null) {
            r1.ECN(this.A0R);
            this.A0C = null;
            this.A0A = null;
        }
    }

    public final void FMe(Uri uri) {
        this.A09 = uri;
    }
}
