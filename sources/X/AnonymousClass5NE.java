package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5NE  reason: invalid class name */
public final class AnonymousClass5NE {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass4TC A04;
    public AnonymousClass4TC A05;
    public AnonymousClass4TC A06;
    public Object A07;
    public boolean A08;
    public final int A09;
    public final C264744Rc A0A = new C264744Rc();
    public final AnonymousClass4RE A0B = new AnonymousClass4RE();
    public final AnonymousClass4RR A0C;
    public final AnonymousClass4S6 A0D;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4Rq, X.4Rr] */
    public static AnonymousClass4TB A01(AnonymousClass5NE r13, Timeline timeline, Object obj, int i, int i2, long j, long j2) {
        long j3;
        ? r6 = new C264884Rr(obj, i, i2, -1, j2);
        long A012 = timeline.A0B(r13.A0A, r6.A04).A01(r6.A00, r6.A01);
        if (A012 == -9223372036854775807L || 0 < A012) {
            j3 = 0;
        } else {
            j3 = Math.max(0, A012 - 1);
        }
        return new AnonymousClass4TB(r6, j3, j, -9223372036854775807L, A012, false, false, false, false);
    }

    public final boolean A0A(AnonymousClass4TC r5) {
        boolean z = false;
        boolean z2 = false;
        if (r5 != null) {
            z2 = true;
        }
        C256703wD.A04(z2);
        if (!r5.equals(this.A04)) {
            this.A04 = r5;
            while (r5.A01 != null) {
                r5 = r5.A01;
                if (r5 == this.A06) {
                    this.A06 = this.A05;
                    z = true;
                }
                r5.A03();
                this.A00--;
            }
            AnonymousClass4TC r2 = this.A04;
            if (null != r2.A01) {
                r2.A01 = null;
            }
            A03(this);
        }
        return z;
    }

    public static AnonymousClass4TB A00(AnonymousClass4TC r27, AnonymousClass5NE r28, Timeline timeline, long j) {
        long j2;
        AnonymousClass4TC r12 = r27;
        AnonymousClass4TB r9 = r12.A02;
        long j3 = r12.A00;
        long j4 = r9.A00;
        long j5 = (j3 + j4) - j;
        AnonymousClass5NE r10 = r28;
        Timeline timeline2 = timeline;
        if (r9.A07) {
            C264874Rq r3 = r9.A04;
            Object obj = r3.A04;
            int A062 = timeline2.A06(obj);
            C264744Rc r7 = r10.A0A;
            AnonymousClass4RE r14 = r10.A0B;
            int A052 = timeline2.A05(r7, r14, A062, r10.A01, r10.A08);
            if (A052 == -1) {
                return null;
            }
            int i = timeline2.A0D(r7, A052, true).A00;
            Object obj2 = r7.A05;
            obj2.getClass();
            long j6 = r3.A03;
            long j7 = 0;
            if (timeline2.A0E(r14, i, 0).A00 == A052) {
                Pair A0A2 = timeline2.A0A(r7, r14, i, -9223372036854775807L, Math.max(0, j5));
                if (A0A2 == null) {
                    return null;
                }
                obj2 = A0A2.first;
                j7 = ((Number) A0A2.second).longValue();
                AnonymousClass4TC r1 = r12.A01;
                if (r1 == null || !r1.A09.equals(obj2)) {
                    j6 = r10.A02;
                    r10.A02 = 1 + j6;
                } else {
                    j6 = r1.A02.A04.A03;
                }
                j2 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            timeline2.A0B(r7, obj2);
            timeline2.A0E(r14, r7.A00, 0);
            timeline2.A06(obj2);
            timeline2.A0B(r7, obj2);
            C264884Rr r17 = new C264884Rr(obj2, -1, -1, -1, j6);
            if (!(j2 == -9223372036854775807L || r9.A02 == -9223372036854775807L)) {
                timeline2.A0B(r7, obj);
            }
            Object obj3 = r17.A04;
            timeline2.A0B(r7, obj3);
            return A02(r10, timeline2, obj3, j7, j2, r17.A03);
        }
        C264874Rq r72 = r9.A04;
        Object obj4 = r72.A04;
        C264744Rc r11 = r10.A0A;
        timeline2.A0B(r11, obj4);
        int i2 = r72.A00;
        if (i2 != -1) {
            C264754Rd r13 = r11.A03;
            int i3 = r72.A01;
            C264764Re A002 = r13.A00(i2);
            while (true) {
                i3++;
                int[] iArr = A002.A00;
                if (i3 < iArr.length) {
                    int i4 = iArr[i3];
                    if (i4 != 0) {
                        if (i4 == 1) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i3 < 0) {
                return A01(r10, timeline2, obj4, i2, i3, r9.A02, r72.A03);
            }
            long j8 = r9.A02;
            long j9 = j8;
            if (j8 == -9223372036854775807L) {
                AnonymousClass4RE r6 = r10.A0B;
                Pair A0A3 = timeline2.A0A(r11, r6, r11.A00, -9223372036854775807L, Math.max(0, j5));
                if (A0A3 == null) {
                    return null;
                }
                j8 = ((Number) A0A3.second).longValue();
            }
            timeline2.A0B(r11, obj4);
            return A02(r10, timeline2, obj4, Math.max(0, j8), j9, r72.A03);
        }
        int i5 = r72.A02;
        int A003 = r11.A00(i5);
        if (A003 != 0) {
            return A01(r10, timeline2, obj4, i5, A003, j4, r72.A03);
        }
        timeline2.A0B(r11, obj4);
        return A02(r10, timeline2, obj4, 0, j4, r72.A03);
    }

    public static AnonymousClass4TB A02(AnonymousClass5NE r17, Timeline timeline, Object obj, long j, long j2, long j3) {
        AnonymousClass5NE r8 = r17;
        long j4 = j;
        C264744Rc r1 = r8.A0A;
        Timeline timeline2 = timeline;
        Object obj2 = obj;
        timeline2.A0B(r1, obj2);
        C264884Rr r12 = new C264884Rr(obj2, -1, -1, -1, j3);
        boolean z = false;
        Object obj3 = r12.A04;
        int i = timeline2.A0B(r1, obj3).A00;
        if (timeline2.A0E(r8.A0B, i, 0).A01 == timeline2.A06(obj3)) {
            z = true;
        }
        boolean A052 = r8.A05(timeline2, r12, true);
        long j5 = r1.A01;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0, j5 - 1);
        }
        return new AnonymousClass4TB(r12, j4, j2, -9223372036854775807L, j5, false, true, z, A052);
    }

    public static boolean A04(AnonymousClass5NE r9, Timeline timeline) {
        AnonymousClass4TC r1;
        AnonymousClass4TC r2 = r9.A05;
        if (r2 == null) {
            return true;
        }
        Timeline timeline2 = timeline;
        int A062 = timeline.A06(r2.A09);
        while (true) {
            A062 = timeline2.A05(r9.A0A, r9.A0B, A062, r9.A01, r9.A08);
            while (true) {
                r1 = r2.A01;
                if (r1 != null && !r2.A02.A07) {
                    r2 = r1;
                }
            }
            if (A062 == -1 || r1 == null || timeline.A06(r1.A09) != A062) {
                boolean A0A2 = r9.A0A(r2);
                r2.A02 = r9.A07(r2.A02, timeline);
            } else {
                r2 = r1;
            }
        }
        boolean A0A22 = r9.A0A(r2);
        r2.A02 = r9.A07(r2.A02, timeline);
        return !A0A22;
    }

    private boolean A05(Timeline timeline, C264874Rq r11, boolean z) {
        Timeline timeline2 = timeline;
        int A062 = timeline.A06(r11.A04);
        C264744Rc r4 = this.A0A;
        int i = timeline.A0D(r4, A062, false).A00;
        AnonymousClass4RE r5 = this.A0B;
        if (timeline.A0E(r5, i, 0).A0D || timeline2.A05(r4, r5, A062, this.A01, this.A08) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final AnonymousClass4TC A06() {
        AnonymousClass4TC r2 = this.A05;
        if (r2 == null) {
            return null;
        }
        if (r2 == this.A06) {
            this.A06 = r2.A01;
        }
        r2.A03();
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            this.A04 = null;
            AnonymousClass4TC r1 = this.A05;
            this.A07 = r1.A09;
            this.A03 = r1.A02.A04.A03;
        }
        this.A05 = this.A05.A01;
        A03(this);
        return this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r11 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r12.A02 != -1) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r12.A02 != -1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4TB A07(X.AnonymousClass4TB r26, com.google.android.exoplayer2.Timeline r27) {
        /*
            r25 = this;
            r3 = r26
            X.4Rq r12 = r3.A04
            int r5 = r12.A00
            r4 = -1
            r11 = 0
            if (r5 == r4) goto L_0x000b
            r11 = 1
        L_0x000b:
            if (r11 != 0) goto L_0x0012
            int r0 = r12.A02
            r2 = 1
            if (r0 == r4) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r5 != r4) goto L_0x001a
            int r0 = r12.A02
            r1 = 1
            if (r0 == r4) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r23 = 0
            r10 = r25
            r9 = r27
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r12.A04
            X.4Rc r0 = r10.A0A
            X.4Rc r0 = r9.A0B(r0, r1)
            int r8 = r0.A00
            int r7 = r9.A06(r1)
            X.4RE r6 = r10.A0B
            r0 = 0
            X.4RE r0 = r9.A0E(r6, r8, r0)
            int r0 = r0.A01
            if (r0 != r7) goto L_0x003f
            r23 = 1
        L_0x003f:
            boolean r24 = r10.A05(r9, r12, r2)
            java.lang.Object r0 = r12.A04
            X.4Rc r6 = r10.A0A
            r9.A0B(r6, r0)
            if (r11 != 0) goto L_0x0066
            int r1 = r12.A02
            if (r1 == r4) goto L_0x0066
            r17 = 0
            r0 = 0
        L_0x0054:
            int r5 = r12.A02
        L_0x0056:
            r21 = 0
            long r13 = r3.A03
            long r15 = r3.A02
            X.4TB r11 = new X.4TB
            r22 = r2
            r19 = r0
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r11
        L_0x0066:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 == 0) goto L_0x0076
            int r0 = r12.A01
            long r0 = r6.A01(r5, r0)
        L_0x0073:
            if (r11 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0076:
            long r0 = r6.A01
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NE.A07(X.4TB, com.google.android.exoplayer2.Timeline):X.4TB");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4Rq, X.4Rr] */
    public final C264874Rq A08(Timeline timeline, Object obj) {
        AnonymousClass4TC r2;
        long j;
        int A062;
        C264744Rc r3 = this.A0A;
        Object obj2 = obj;
        int i = timeline.A0B(r3, obj).A00;
        Object obj3 = this.A07;
        if (obj3 == null || (A062 = timeline.A06(obj3)) == -1 || timeline.A0D(r3, A062, false).A00 != i) {
            AnonymousClass4TC r22 = this.A05;
            while (true) {
                if (r2 != null) {
                    if (r2.A09.equals(obj)) {
                        break;
                    }
                    r22 = r2.A01;
                } else {
                    r2 = this.A05;
                    while (true) {
                        if (r2 != null) {
                            int A063 = timeline.A06(r2.A09);
                            if (A063 != -1 && timeline.A0D(r3, A063, false).A00 == i) {
                                break;
                            }
                            r2 = r2.A01;
                        } else {
                            j = this.A02;
                            this.A02 = 1 + j;
                            if (this.A05 == null) {
                                this.A07 = obj;
                                this.A03 = j;
                            }
                        }
                    }
                }
            }
            j = r2.A02.A04.A03;
        } else {
            j = this.A03;
        }
        timeline.A0B(r3, obj);
        int i2 = r3.A00;
        AnonymousClass4RE r5 = this.A0B;
        timeline.A0E(r5, i2, 0);
        for (int A064 = timeline.A06(obj); A064 >= r5.A00; A064--) {
            timeline.A0D(r3, A064, true);
        }
        timeline.A0B(r3, obj);
        timeline.A0E(r5, r3.A00, 0);
        timeline.A06(obj);
        timeline.A0B(r3, obj);
        return new C264884Rr(obj2, -1, -1, -1, j);
    }

    public final void A09() {
        if (this.A00 != 0) {
            AnonymousClass4TC r2 = this.A05;
            C256703wD.A01(r2);
            this.A07 = r2.A09;
            this.A03 = r2.A02.A04.A03;
            do {
                r2.A03();
                r2 = r2.A01;
            } while (r2 != null);
            this.A05 = null;
            this.A04 = null;
            this.A06 = null;
            this.A00 = 0;
            A03(this);
        }
    }

    public AnonymousClass5NE(AnonymousClass4RR r3, AnonymousClass4S6 r4) {
        this.A0C = r3;
        this.A0D = r4;
        int A002 = 2BY.A00(2Bb.A03);
        this.A09 = A002 >= 0 ? Math.min(A002, 100) : 100;
    }

    public static void A03(AnonymousClass5NE r4) {
        C264874Rq r2;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (AnonymousClass4TC r0 = r4.A05; r0 != null; r0 = r0.A01) {
            builder.add(r0.A02.A04);
        }
        AnonymousClass4TC r02 = r4.A06;
        if (r02 == null) {
            r2 = null;
        } else {
            r2 = r02.A02.A04;
        }
        AnonymousClass4S6 r03 = r4.A0D;
        ((AnonymousClass4S5) r03).A00.post(new C284635Ni(r4, r2, builder));
    }
}
