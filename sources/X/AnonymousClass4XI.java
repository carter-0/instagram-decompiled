package X;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4XI  reason: invalid class name */
public abstract class AnonymousClass4XI implements AnonymousClass4RX {
    public int A00;
    public final int A01;
    public final C256683wB[] A02;
    public final long[] A03;
    public final C264854Ro A04;
    public final int[] A05;

    public final int CM9(int i) {
        for (int i2 = 0; i2 < this.A01; i2++) {
            if (this.A05[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int CMA(C256683wB r4) {
        boolean equals;
        int i = 0;
        while (i < this.A01) {
            C256683wB[] r1 = this.A02;
            C256683wB r0 = r1[i];
            if (r0 != r4) {
                if (r0.A0T != null) {
                    equals = r1[i].A0T.equals(r4.A0T);
                } else if (r4.A0T == null) {
                    equals = r1[i].equals(r4);
                } else {
                    continue;
                    i++;
                }
                if (!equals) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4XI r5 = (AnonymousClass4XI) obj;
            if (this.A04 != r5.A04 || !Arrays.equals(this.A05, r5.A05)) {
                return false;
            }
        }
        return true;
    }

    public final C256683wB B7Q(int i) {
        return this.A02[i];
    }

    public final int BGu(int i) {
        return this.A05[i];
    }

    public final long BTQ(C264034Oi r25, AnonymousClass4XP r26, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2, boolean z3) {
        if (!(this instanceof AnonymousClass4XH)) {
            return -9223372036854775807L;
        }
        return ((AnonymousClass4XH) this).A01.BTQ(r25, r26, j, j2, j3, j4, j5, j6, j7, j8, j9, z, z2, z3);
    }

    public final C256683wB Brg() {
        return this.A02[Brh()];
    }

    public final C264854Ro C98() {
        return this.A04;
    }

    public final boolean CPT(int i, long j) {
        if (this.A03[i] > j) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r2.A04 != r4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void DXU(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass4XH
            if (r0 == 0) goto L_0x0015
            r2 = r3
            X.4XH r2 = (X.AnonymousClass4XH) r2
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0010
            boolean r1 = r2.A04
            r0 = 0
            if (r1 == r4) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r2.A03 = r0
            r2.A04 = r4
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XI.DXU(boolean):void");
    }

    public final void DXe(float f) {
        if (this instanceof AnonymousClass4XH) {
            ((AnonymousClass4XH) this).A00 = f;
        }
    }

    public final /* synthetic */ boolean Erq(C266194Xx r4, List list, long j) {
        if (!(this instanceof AnonymousClass4XH)) {
            return false;
        }
        AnonymousClass4XH r2 = (AnonymousClass4XH) this;
        if (!r2.A03) {
            return false;
        }
        r2.A03 = false;
        return !r2.A04;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
        this.A00 = identityHashCode;
        return identityHashCode;
    }

    public final int length() {
        return this.A05.length;
    }

    public AnonymousClass4XI(C264854Ro r8, int[] iArr) {
        int length = iArr.length;
        C256703wD.A04(length > 0);
        this.A04 = r8;
        this.A01 = length;
        C256683wB[] r3 = new C256683wB[length];
        this.A02 = r3;
        for (int i = 0; i < length; i++) {
            r3[i] = r8.A04[iArr[i]];
        }
        Arrays.sort(r3, new AnonymousClass4XJ());
        int i2 = this.A01;
        int[] iArr2 = new int[i2];
        this.A05 = iArr2;
        for (int i3 = 0; i3 < i2; i3++) {
            C256683wB r32 = this.A02[i3];
            int i4 = 0;
            while (true) {
                C256683wB[] r1 = r8.A04;
                if (i4 < r1.length) {
                    if (r32 == r1[i4]) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            iArr2[i3] = i4;
        }
        this.A03 = new long[i2];
    }

    public final boolean ADu(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean CPT = CPT(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.A01) {
                if (CPT) {
                    break;
                }
                if (i2 != i) {
                    CPT = true;
                    if (!CPT(i2, elapsedRealtime)) {
                        i2++;
                    }
                }
                CPT = false;
                i2++;
            } else if (!CPT) {
                return false;
            }
        }
        long[] jArr = this.A03;
        long j2 = jArr[i];
        long j3 = elapsedRealtime + j;
        if (((elapsedRealtime ^ j3) & (j ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    public final int ASz(List list, long j) {
        return list.size();
    }

    public void FLS(AnonymousClass4XP r1, AnonymousClass4Y2 r2, long j, long j2, long j3, long j4, boolean z, boolean z2) {
    }
}
