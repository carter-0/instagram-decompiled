package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.5TX  reason: invalid class name */
public final class AnonymousClass5TX extends AnonymousClass5Ow implements AnonymousClass5TY {
    public AnonymousClass5TZ A00 = new AnonymousClass5TZ();
    public final C284895Os A01;
    public final C62320sa A02;

    /* JADX WARNING: type inference failed for: r12v4, types: [X.5XG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.5XG, java.lang.Object] */
    public static final AnonymousClass5TZ A00(AnonymousClass5TZ r16, AnonymousClass5TX r17, Snapshot snapshot, C62320sa r19, boolean z) {
        C285045Pl r9;
        C284895Os r0;
        AnonymousClass5TX r6 = r17;
        Snapshot snapshot2 = snapshot;
        AnonymousClass5TZ r2 = r16;
        int i = 0;
        if (!r2.A03(r6, snapshot2)) {
            0vu r8 = new 0vu(6);
            AnonymousClass5P5 r5 = AnonymousClass5XF.A00;
            AnonymousClass5XG r12 = (AnonymousClass5XG) r5.A00();
            AnonymousClass5XG r122 = r12;
            if (r12 == null) {
                ? obj = new Object();
                obj.A00 = 0;
                r5.A01(obj);
                r122 = obj;
            }
            int i2 = r122.A00;
            r9 = AnonymousClass5XF.A00();
            int i3 = r9.A00;
            if (i3 > 0) {
                Object[] objArr = r9.A02;
                int i4 = 0;
                do {
                    ((AnonymousClass5X2) objArr[i4]).EwH(r6);
                    i4++;
                } while (i4 < i3);
            }
            r122.A00 = i2 + 1;
            Object A04 = AnonymousClass5PH.A04(r19, new AnonymousClass9MM(i2, 0, r6, r122, r8));
            r122.A00 = i2;
            int i5 = r9.A00;
            if (i5 > 0) {
                Object[] objArr2 = r9.A02;
                int i6 = 0;
                do {
                    ((AnonymousClass5X2) objArr2[i6]).AQ4(r6);
                    i6++;
                } while (i6 < i5);
            }
            Object obj2 = AnonymousClass5P3.A07;
            synchronized (obj2) {
                Snapshot A002 = AnonymousClass5P3.A00();
                Object obj3 = r2.A04;
                if (obj3 == AnonymousClass5TZ.A05 || (r0 = r6.A01) == null || !r0.ASs(A04, obj3)) {
                    AnonymousClass5TZ r02 = r6.A00;
                    AnonymousClass5P2 A06 = AnonymousClass5P3.A06(r6, r02);
                    A06.A01(r02);
                    A06.A00 = A002.A01();
                    r2 = (AnonymousClass5TZ) A06;
                    r2.A03 = r8;
                    r2.A00 = r2.A02(r6, A002);
                    r2.A04 = A04;
                } else {
                    r2.A03 = r8;
                    r2.A00 = r2.A02(r6, A002);
                }
            }
            AnonymousClass5XG r03 = (AnonymousClass5XG) r5.A00();
            if (r03 != null && r03.A00 == 0) {
                AnonymousClass5P3.A00().A08();
                synchronized (obj2) {
                    Snapshot A003 = AnonymousClass5P3.A00();
                    r2.A01 = A003.A01();
                    r2.A02 = A003.A02();
                }
                return r2;
            }
        } else if (z) {
            r9 = AnonymousClass5XF.A00();
            int i7 = r9.A00;
            if (i7 > 0) {
                Object[] objArr3 = r9.A02;
                int i8 = 0;
                do {
                    ((AnonymousClass5X2) objArr3[i8]).EwH(r6);
                    i8++;
                } while (i8 < i7);
            }
            try {
                01h r1 = r2.A03;
                AnonymousClass5P5 r04 = AnonymousClass5XF.A00;
                AnonymousClass5XG r13 = (AnonymousClass5XG) r04.A00();
                AnonymousClass5XG r132 = r13;
                if (r13 == null) {
                    ? obj4 = new Object();
                    obj4.A00 = 0;
                    r04.A01(obj4);
                    r132 = obj4;
                }
                int i9 = r132.A00;
                Object[] objArr4 = r1.A04;
                int[] iArr = r1.A02;
                long[] jArr = r1.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((j & ((j ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - (((i10 - length) ^ -1) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j & 255) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    C284925Ox r15 = (C284925Ox) objArr4[i13];
                                    r132.A00 = iArr[i13] + i9;
                                    0sP A05 = snapshot2.A05();
                                    if (A05 != null) {
                                        A05.invoke(r15);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                r132.A00 = i9;
                int i14 = r9.A00;
                if (i14 > 0) {
                    Object[] objArr5 = r9.A02;
                    int i15 = 0;
                    do {
                        ((AnonymousClass5X2) objArr5[i15]).AQ4(r6);
                        i15++;
                    } while (i15 < i14);
                }
            } catch (Throwable th) {
                int i16 = r9.A00;
                if (i16 > 0) {
                    Object[] objArr6 = r9.A02;
                    do {
                        ((AnonymousClass5X2) objArr6[i]).AQ4(r6);
                        i++;
                    } while (i < i16);
                }
                throw th;
            }
        }
        return r2;
    }

    public final AnonymousClass5P2 B6D() {
        return this.A00;
    }

    public final void E4K(AnonymousClass5P2 r2) {
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.A00 = (AnonymousClass5TZ) r2;
    }

    public final String toString() {
        String str;
        AnonymousClass5P3.A08(this.A00);
        AnonymousClass5TZ r1 = (AnonymousClass5TZ) AnonymousClass5P3.A08(this.A00);
        if (r1.A03(this, AnonymousClass5P3.A00())) {
            str = String.valueOf(r1.A04);
        } else {
            str = "<Not calculated>";
        }
        return 002.A07(hashCode(), "DerivedState(value=", str, ")@");
    }

    public AnonymousClass5TX(C284895Os r2, C62320sa r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public final AnonymousClass5TZ AuM() {
        Snapshot A002 = AnonymousClass5P3.A00();
        return A00((AnonymousClass5TZ) AnonymousClass5P3.A04(A002, this.A00), this, A002, this.A02, false);
    }

    public final Object getValue() {
        0sP A05 = AnonymousClass5P3.A00().A05();
        if (A05 != null) {
            A05.invoke(this);
        }
        Snapshot A002 = AnonymousClass5P3.A00();
        return A00((AnonymousClass5TZ) AnonymousClass5P3.A04(A002, this.A00), this, A002, this.A02, true).A04;
    }
}
