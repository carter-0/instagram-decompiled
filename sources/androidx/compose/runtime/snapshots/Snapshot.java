package androidx.compose.runtime.snapshots;

import X.0Yw;
import X.0sP;
import X.0vq;
import X.AnonymousClass00P;
import X.AnonymousClass01q;
import X.AnonymousClass5P3;
import X.AnonymousClass5P8;
import X.AnonymousClass5P9;
import X.AnonymousClass5PC;
import X.AnonymousClass5PD;
import X.AnonymousClass5PF;
import X.AnonymousClass5PG;
import X.AnonymousClass5Q0;
import X.AnonymousClass9L6;
import X.C18086VlG;
import X.C21524Xds;
import X.C284925Ox;
import X.C288435bu;
import X.XGI;

public abstract class Snapshot {
    public int A00;
    public int A01;
    public boolean A02;
    public AnonymousClass5P8 A03;

    public void A0H() {
        this.A02 = true;
        synchronized (AnonymousClass5P3.A07) {
            int i = this.A01;
            if (i >= 0) {
                AnonymousClass5P3.A0F(i);
                this.A01 = -1;
            }
        }
    }

    public final int A01() {
        Snapshot snapshot;
        if (this instanceof AnonymousClass5PF) {
            snapshot = AnonymousClass5PF.A00((AnonymousClass5PF) this);
        } else if (!(this instanceof AnonymousClass5PG)) {
            return this.A00;
        } else {
            snapshot = ((AnonymousClass5PG) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AnonymousClass5P3.A08.get();
            }
        }
        return snapshot.A01();
    }

    public final int A02() {
        if (!(this instanceof AnonymousClass5PD)) {
            return 0;
        }
        AnonymousClass5PD r1 = (AnonymousClass5PD) this;
        if (r1 instanceof AnonymousClass5PF) {
            return AnonymousClass5PF.A00((AnonymousClass5PF) r1).A02();
        }
        return r1.A01;
    }

    public Snapshot A03(0sP r8) {
        XGI xgi;
        if (this instanceof AnonymousClass5PD) {
            AnonymousClass5PD r4 = (AnonymousClass5PD) this;
            if (r4 instanceof AnonymousClass5PC) {
                AnonymousClass9L6 r2 = new AnonymousClass9L6(r8, 39);
                int i = AnonymousClass5P3.A00;
                return (Snapshot) AnonymousClass5P3.A0A(new AnonymousClass9L6(r2, 40));
            } else if (r4 instanceof AnonymousClass5PF) {
                AnonymousClass5PF r42 = (AnonymousClass5PF) r4;
                0sP A0C = AnonymousClass5P3.A0C(r8, r42.A00, true);
                boolean z = r42.A03;
                AnonymousClass5PD A002 = AnonymousClass5PF.A00(r42);
                if (!z) {
                    return AnonymousClass5P3.A01(A002.A03((0sP) null), A0C, true);
                }
                return A002.A03(A0C);
            } else {
                if (!(!r4.A02)) {
                    C18086VlG.A00("Cannot use a disposed snapshot");
                } else if (!r4.A03 || r4.A01 >= 0) {
                    int A012 = r4.A01();
                    r4.A0N(r4.A01());
                    Object obj = AnonymousClass5P3.A07;
                    synchronized (obj) {
                        int i2 = AnonymousClass5P3.A00;
                        AnonymousClass5P3.A00 = i2 + 1;
                        AnonymousClass5P3.A01 = AnonymousClass5P3.A01.A01(i2);
                        AnonymousClass5P8 A04 = r4.A04();
                        for (int i3 = A012 + 1; i3 < i2; i3++) {
                            A04 = A04.A01(i3);
                        }
                        xgi = new XGI(r4, A04, AnonymousClass5P3.A0C(r8, r4.A07, true), i2);
                    }
                    if (r4.A03 || r4.A02) {
                        return xgi;
                    }
                    int A013 = r4.A01();
                    synchronized (obj) {
                        int i4 = AnonymousClass5P3.A00;
                        AnonymousClass5P3.A00 = i4 + 1;
                        r4.A00 = i4;
                        AnonymousClass5P3.A01 = AnonymousClass5P3.A01.A01(r4.A01());
                    }
                    AnonymousClass5P8 A042 = r4.A04();
                    int A014 = r4.A01();
                    for (int i5 = A013 + 1; i5 < A014; i5++) {
                        A042 = A042.A01(i5);
                    }
                    r4.A0E(A042);
                    return xgi;
                } else {
                    C18086VlG.A01("Unsupported operation on a disposed or applied snapshot");
                }
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (this instanceof C288435bu) {
            C288435bu r43 = (C288435bu) this;
            AnonymousClass5P3.A0G(r43);
            return new XGI(r43, r43.A04(), AnonymousClass5P3.A0C(r8, r43.A01, true), r43.A01());
        } else {
            AnonymousClass5PG r44 = (AnonymousClass5PG) this;
            0sP A0C2 = AnonymousClass5P3.A0C(r8, r44.A00, true);
            Snapshot snapshot = r44.A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AnonymousClass5P3.A08.get();
            }
            return AnonymousClass5P3.A01(snapshot.A03((0sP) null), A0C2, true);
        }
    }

    public final AnonymousClass5P8 A04() {
        Snapshot snapshot;
        if (this instanceof AnonymousClass5PF) {
            snapshot = AnonymousClass5PF.A00((AnonymousClass5PF) this);
        } else if (!(this instanceof AnonymousClass5PG)) {
            return this.A03;
        } else {
            snapshot = ((AnonymousClass5PG) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AnonymousClass5P3.A08.get();
            }
        }
        return snapshot.A04();
    }

    public 0sP A05() {
        if (this instanceof AnonymousClass5PD) {
            AnonymousClass5PD r1 = (AnonymousClass5PD) this;
            if (r1 instanceof AnonymousClass5PF) {
                return ((AnonymousClass5PF) r1).A00;
            }
            return r1.A07;
        } else if (this instanceof C288435bu) {
            return ((C288435bu) this).A01;
        } else {
            return ((AnonymousClass5PG) this).A00;
        }
    }

    public 0sP A06() {
        if (!(this instanceof AnonymousClass5PD)) {
            return null;
        }
        AnonymousClass5PD r1 = (AnonymousClass5PD) this;
        if (r1 instanceof AnonymousClass5PF) {
            return ((AnonymousClass5PF) r1).A01;
        }
        return r1.A08;
    }

    public final void A07() {
        AnonymousClass5P8 A002;
        if (this instanceof AnonymousClass5PD) {
            AnonymousClass5PD r2 = (AnonymousClass5PD) this;
            A002 = AnonymousClass5P3.A01.A00(r2.A01()).A02(r2.A02);
        } else {
            A002 = AnonymousClass5P3.A01.A00(A01());
        }
        AnonymousClass5P3.A01 = A002;
    }

    public void A08() {
        Snapshot snapshot;
        if (this instanceof AnonymousClass5PD) {
            AnonymousClass5PD r1 = (AnonymousClass5PD) this;
            if (r1 instanceof AnonymousClass5PC) {
                AnonymousClass5P3.A0A(AnonymousClass5Q0.A00);
                return;
            } else if (r1 instanceof AnonymousClass5PF) {
                snapshot = AnonymousClass5PF.A00((AnonymousClass5PF) r1);
            } else if (!r1.A03 && !r1.A02) {
                r1.A0M();
                return;
            } else {
                return;
            }
        } else if (!(this instanceof C288435bu)) {
            snapshot = ((AnonymousClass5PG) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AnonymousClass5P3.A08.get();
            }
        } else {
            return;
        }
        snapshot.A08();
    }

    public void A09() {
        int i = this.A01;
        if (i >= 0) {
            AnonymousClass5P3.A0F(i);
            this.A01 = -1;
        }
    }

    public final void A0A() {
        synchronized (AnonymousClass5P3.A07) {
            A07();
            A09();
        }
    }

    public final void A0B(int i) {
        if (this instanceof AnonymousClass5PD) {
            AnonymousClass5PD r1 = (AnonymousClass5PD) this;
            if (r1 instanceof AnonymousClass5PF) {
                AnonymousClass5PF.A00((AnonymousClass5PF) r1).A0B(i);
            } else {
                r1.A01 = i;
            }
        } else {
            throw new IllegalStateException("Updating write count is not supported for this snapshot");
        }
    }

    public void A0C(Snapshot snapshot) {
        if (this instanceof C288435bu) {
            ((C288435bu) this).A00++;
            return;
        }
        if (!(this instanceof AnonymousClass5PG)) {
            AnonymousClass5PD r1 = (AnonymousClass5PD) this;
            if (!(r1 instanceof AnonymousClass5PF) && !(r1 instanceof AnonymousClass5PC)) {
                r1.A00++;
                return;
            }
        }
        C21524Xds.A00();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.5bu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.5PD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.5bu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: X.5bu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.5bu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: X.5bu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: X.5bu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(androidx.compose.runtime.snapshots.Snapshot r17) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1 instanceof X.AnonymousClass5PD
            if (r0 == 0) goto L_0x00a3
            r11 = r1
            X.5PD r11 = (X.AnonymousClass5PD) r11
            boolean r0 = r11 instanceof X.AnonymousClass5PF
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r11 instanceof X.AnonymousClass5PC
            if (r0 != 0) goto L_0x00b6
            int r0 = r11.A00
            if (r0 <= 0) goto L_0x009d
            int r0 = r0 + -1
            r11.A00 = r0
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r11.A03
            if (r0 != 0) goto L_0x00b5
            X.0vq r1 = r11.A0I()
            if (r1 == 0) goto L_0x00b2
            boolean r0 = r11.A03
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "Unsupported operation on a snapshot that has been applied"
            X.C18086VlG.A01(r0)
        L_0x0030:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0035:
            r0 = 0
            r11.A0O(r0)
            int r10 = r11.A01()
            java.lang.Object[] r9 = r1.A03
            long[] r8 = r1.A02
            int r0 = r8.length
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x00b2
            r6 = 0
        L_0x0047:
            r14 = r8[r6]
            r3 = -1
            long r3 = r3 ^ r14
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r14
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0098
            int r0 = r6 - r7
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L_0x0064:
            if (r3 >= r4) goto L_0x0096
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r9[r0]
            X.5Ox r0 = (X.C284925Ox) r0
            X.5P2 r0 = r0.B6D()
        L_0x007a:
            if (r0 == 0) goto L_0x0092
            int r1 = r0.A00
            if (r1 == r10) goto L_0x008c
            X.5P8 r2 = r11.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = X.00k.A0u(r2, r1)
            if (r1 == 0) goto L_0x008f
        L_0x008c:
            r1 = 0
            r0.A00 = r1
        L_0x008f:
            X.5P2 r0 = r0.A01
            goto L_0x007a
        L_0x0092:
            long r14 = r14 >> r5
            int r3 = r3 + 1
            goto L_0x0064
        L_0x0096:
            if (r4 != r5) goto L_0x00b2
        L_0x0098:
            if (r6 == r7) goto L_0x00b2
            int r6 = r6 + 1
            goto L_0x0047
        L_0x009d:
            java.lang.String r0 = "no pending nested snapshots"
            X.C18086VlG.A00(r0)
            goto L_0x0030
        L_0x00a3:
            boolean r0 = r1 instanceof X.C288435bu
            if (r0 == 0) goto L_0x00b6
            r11 = r1
            X.5bu r11 = (X.C288435bu) r11
            int r0 = r11.A00
            int r0 = r0 + -1
            r11.A00 = r0
            if (r0 != 0) goto L_0x00b5
        L_0x00b2:
            r11.A0A()
        L_0x00b5:
            return
        L_0x00b6:
            X.C21524Xds.A00()
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.Snapshot.A0D(androidx.compose.runtime.snapshots.Snapshot):void");
    }

    public final void A0E(AnonymousClass5P8 r2) {
        if (this instanceof AnonymousClass5PF) {
            C21524Xds.A00();
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A03 = r2;
        }
    }

    public void A0F(C284925Ox r4) {
        Snapshot snapshot;
        if (this instanceof AnonymousClass5PD) {
            AnonymousClass5PD r2 = (AnonymousClass5PD) this;
            if (r2 instanceof AnonymousClass5PF) {
                snapshot = AnonymousClass5PF.A00((AnonymousClass5PF) r2);
            } else {
                0vq A0I = r2.A0I();
                if (A0I == null) {
                    0vq r0 = AnonymousClass01q.A00;
                    A0I = new 0vq(6);
                    r2.A0O(A0I);
                }
                A0I.A09(r4);
                return;
            }
        } else if (this instanceof AnonymousClass5PG) {
            snapshot = ((AnonymousClass5PG) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AnonymousClass5P3.A08.get();
            }
        } else {
            int i = AnonymousClass5P3.A00;
            throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
        }
        snapshot.A0F(r4);
    }

    public boolean A0G() {
        Snapshot snapshot;
        if (this instanceof AnonymousClass5PD) {
            AnonymousClass5PD r1 = (AnonymousClass5PD) this;
            if (!(r1 instanceof AnonymousClass5PF)) {
                return false;
            }
            snapshot = AnonymousClass5PF.A00((AnonymousClass5PF) r1);
        } else if (!(this instanceof AnonymousClass5PG)) {
            return true;
        } else {
            snapshot = ((AnonymousClass5PG) this).A02;
            if (snapshot == null) {
                snapshot = (Snapshot) AnonymousClass5P3.A08.get();
            }
        }
        return snapshot.A0G();
    }

    public Snapshot(AnonymousClass5P8 r10, int i) {
        int i2;
        int i3;
        this.A03 = r10;
        this.A00 = i;
        if (i != 0) {
            AnonymousClass5P8 A04 = A04();
            int i4 = AnonymousClass5P3.A00;
            int[] iArr = A04.A03;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = A04.A01;
                if (j != 0) {
                    i3 = A04.A00;
                } else {
                    j = A04.A02;
                    i3 = j != 0 ? A04.A00 + 64 : i3;
                }
                i = i3 + Long.numberOfTrailingZeros(j);
            }
            synchronized (AnonymousClass5P3.A07) {
                AnonymousClass5P9 r5 = AnonymousClass5P3.A06;
                int i5 = r5.A01 + 1;
                int[] iArr2 = r5.A04;
                int length = iArr2.length;
                if (i5 > length) {
                    int i6 = length * 2;
                    int[] iArr3 = new int[i6];
                    int[] iArr4 = new int[i6];
                    0Yw.A0T(iArr2, iArr3, 0, 0, length);
                    int[] iArr5 = r5.A03;
                    0Yw.A0T(iArr5, iArr4, 0, 0, iArr5.length);
                    r5.A04 = iArr3;
                    r5.A03 = iArr4;
                }
                int i7 = r5.A01;
                r5.A01 = i7 + 1;
                int[] iArr6 = r5.A02;
                int length2 = iArr6.length;
                if (r5.A00 >= length2) {
                    int i8 = 0;
                    int i9 = length2 * 2;
                    int[] iArr7 = new int[i9];
                    while (i8 < i9) {
                        int i10 = i8 + 1;
                        iArr7[i8] = i10;
                        i8 = i10;
                    }
                    0Yw.A0T(iArr6, iArr7, 0, 0, length2);
                    r5.A02 = iArr7;
                    iArr6 = iArr7;
                }
                i2 = r5.A00;
                r5.A00 = iArr6[i2];
                int[] iArr8 = r5.A04;
                iArr8[i7] = i;
                r5.A03[i7] = i2;
                iArr6[i2] = i7;
                int i11 = iArr8[i7];
                while (i7 > 0) {
                    int i12 = ((i7 + 1) >> 1) - 1;
                    if (iArr8[i12] <= i11) {
                        break;
                    }
                    AnonymousClass5P9.A00(r5, i12, i7);
                    i7 = i12;
                }
            }
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
