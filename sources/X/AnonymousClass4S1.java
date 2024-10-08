package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4S1  reason: invalid class name */
public final class AnonymousClass4S1 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass4TC A04;
    public AnonymousClass4TC A05;
    public AnonymousClass4TC A06;
    public Object A07;
    public boolean A08;
    public final C264744Rc A09 = new C264744Rc();
    public final AnonymousClass4RE A0A = new AnonymousClass4RE();

    public static AnonymousClass4TB A00(AnonymousClass4TC r15, AnonymousClass4S1 r16, Timeline timeline, long j) {
        long j2;
        Object obj;
        AnonymousClass4TC r8 = r15;
        AnonymousClass4TB r2 = r15.A02;
        boolean z = r2.A07;
        C264874Rq r0 = r2.A04;
        AnonymousClass4S1 r11 = r16;
        Timeline timeline2 = timeline;
        if (z) {
            int A062 = timeline2.A06(r0.A04);
            C264744Rc r13 = r11.A09;
            AnonymousClass4RE r14 = r11.A0A;
            int A052 = timeline2.A05(r13, r14, A062, r11.A01, r11.A08);
            if (A052 == -1) {
                return null;
            }
            int i = timeline2.A0D(r13, A052, true).A00;
            Object obj2 = r13.A05;
            long j3 = r2.A04.A03;
            long j4 = 0;
            if (timeline2.A0E(r14, i, 0).A00 == A052) {
                Pair A0A2 = timeline2.A0A(r13, r14, i, -9223372036854775807L, Math.max(0, (r8.A00 + r2.A00) - j));
                if (A0A2 == null) {
                    return null;
                }
                obj2 = A0A2.first;
                j4 = ((Number) A0A2.second).longValue();
                AnonymousClass4TC r1 = r8.A01;
                if (r1 == null || !r1.A09.equals(obj2)) {
                    j3 = r11.A02;
                    r11.A02 = 1 + j3;
                } else {
                    j3 = r1.A02.A04.A03;
                }
            }
            timeline2.A0B(r13, obj2);
            C264884Rr r3 = new C264884Rr(obj2, -1, -1, -1, j3);
            Object obj3 = r3.A04;
            timeline2.A0B(r13, obj3);
            return A02(r11, timeline2, obj3, j4, r3.A03);
        }
        Object obj4 = r0.A04;
        C264744Rc r12 = r11.A09;
        timeline2.A0B(r12, obj4);
        int i2 = r0.A00;
        if (i2 != -1) {
            C264754Rd r7 = r12.A03;
            int i3 = r0.A01;
            C264764Re A002 = r7.A00(i2);
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
                if (r7.A00[i2].A00[i3] == 0) {
                    return null;
                }
                return A01(r11, timeline2, r0.A04, i2, i3, r2.A02, r0.A03);
            }
            obj = r0.A04;
            j2 = r2.A02;
        } else {
            j2 = r2.A01;
            if (j2 == Long.MIN_VALUE) {
                return null;
            }
            obj = r0.A04;
        }
        return A02(r11, timeline2, obj, j2, r0.A03);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4Rq, X.4Rr] */
    public static AnonymousClass4TB A01(AnonymousClass4S1 r12, Timeline timeline, Object obj, int i, int i2, long j, long j2) {
        ? r5 = new C264884Rr(obj, i, i2, -1, j2);
        Object obj2 = r5.A04;
        C264744Rc r3 = r12.A09;
        timeline.A0B(r3, obj2);
        return new AnonymousClass4TB(r5, 0, Long.MIN_VALUE, j, timeline.A0B(r3, obj2).A01(r5.A00, r5.A01), r12.A04(timeline, r5));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4Rq, X.4Rr] */
    public static AnonymousClass4TB A02(AnonymousClass4S1 r11, Timeline timeline, Object obj, long j, long j2) {
        ? r4 = new C264884Rr(obj, -1, -1, -1, j2);
        Object obj2 = r4.A04;
        C264744Rc r0 = r11.A09;
        timeline.A0B(r0, obj2);
        timeline.A0B(r0, obj2);
        return new AnonymousClass4TB(r4, j, Long.MIN_VALUE, -9223372036854775807L, r0.A01, r11.A04(timeline, r4));
    }

    public final boolean A09(AnonymousClass4TC r5) {
        boolean z = false;
        boolean z2 = false;
        if (r5 != null) {
            z2 = true;
        }
        C256703wD.A04(z2);
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
        return z;
    }

    public static boolean A03(AnonymousClass4S1 r10, Timeline timeline) {
        AnonymousClass4TC r1;
        AnonymousClass4TC r2 = r10.A05;
        if (r2 == null) {
            r2 = r10.A04;
        }
        if (r2 == null) {
            return true;
        }
        Timeline timeline2 = timeline;
        int A062 = timeline.A06(r2.A09);
        while (true) {
            A062 = timeline2.A05(r10.A09, r10.A0A, A062, r10.A01, r10.A08);
            while (true) {
                r1 = r2.A01;
                if (r1 != null && !r2.A02.A07) {
                    r2 = r1;
                }
            }
            if (A062 == -1 || r1 == null || timeline.A06(r1.A09) != A062) {
                boolean A092 = r10.A09(r2);
                r2.A02 = r10.A06(r2.A02, timeline);
            } else {
                r2 = r1;
            }
        }
        boolean A0922 = r10.A09(r2);
        r2.A02 = r10.A06(r2.A02, timeline);
        if (!A0922 || r10.A05 == null) {
            return true;
        }
        return false;
    }

    private boolean A04(Timeline timeline, C264874Rq r11) {
        Timeline timeline2 = timeline;
        int A062 = timeline.A06(r11.A04);
        C264744Rc r4 = this.A09;
        int i = timeline.A0D(r4, A062, false).A00;
        AnonymousClass4RE r5 = this.A0A;
        if (timeline.A0E(r5, i, 0).A0D || timeline2.A05(r4, r5, A062, this.A01, this.A08) != -1) {
            return false;
        }
        return true;
    }

    public final AnonymousClass4TC A05() {
        AnonymousClass4TC r1 = this.A05;
        if (r1 != null) {
            if (r1 == this.A06) {
                this.A06 = r1.A01;
            }
            r1.A03();
            AnonymousClass4TC r12 = this.A05.A01;
            this.A05 = r12;
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
            }
            return r12;
        }
        AnonymousClass4TC r13 = this.A04;
        this.A05 = r13;
        this.A06 = r13;
        return r13;
    }

    public final AnonymousClass4TB A06(AnonymousClass4TB r15, Timeline timeline) {
        long j;
        long j2 = r15.A01;
        C264874Rq r4 = r15.A04;
        Object obj = r4.A04;
        C264744Rc r3 = this.A09;
        Timeline timeline2 = timeline;
        timeline2.A0B(r3, obj);
        boolean A042 = A04(timeline2, r4);
        timeline2.A0B(r3, obj);
        int i = r4.A00;
        if (i != -1) {
            j = r3.A01(i, r4.A01);
        } else if (j2 == Long.MIN_VALUE) {
            j = r3.A01;
        } else {
            j = j2;
        }
        return new AnonymousClass4TB(r4, r15.A03, j2, r15.A02, j, A042);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4Rq, X.4Rr] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    public final X.C264874Rq A07(com.google.android.exoplayer2.Timeline r12, java.lang.Object r13) {
        /*
            r11 = this;
            X.4Rc r2 = r11.A09
            r5 = r13
            X.4Rc r0 = r12.A0B(r2, r13)
            int r4 = r0.A00
            java.lang.Object r0 = r11.A07
            r6 = -1
            if (r0 == 0) goto L_0x002a
            int r1 = r12.A06(r0)
            if (r1 == r6) goto L_0x002a
            r0 = 0
            X.4Rc r0 = r12.A0D(r2, r1, r0)
            int r0 = r0.A00
            if (r0 != r4) goto L_0x002a
            long r9 = r11.A03
        L_0x001f:
            r12.A0B(r2, r13)
            X.4Rq r4 = new X.4Rq
            r7 = r6
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x002a:
            X.4TC r3 = r11.A05
            if (r3 != 0) goto L_0x0042
            X.4TC r3 = r11.A04
        L_0x0030:
            if (r3 != 0) goto L_0x0042
            X.4TC r3 = r11.A05
            if (r3 != 0) goto L_0x004d
            X.4TC r3 = r11.A04
        L_0x0038:
            if (r3 != 0) goto L_0x004d
            long r9 = r11.A02
            r0 = 1
            long r0 = r0 + r9
            r11.A02 = r0
            goto L_0x001f
        L_0x0042:
            java.lang.Object r0 = r3.A09
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x005e
            X.4TC r3 = r3.A01
            goto L_0x0030
        L_0x004d:
            java.lang.Object r0 = r3.A09
            int r1 = r12.A06(r0)
            if (r1 == r6) goto L_0x0065
            r0 = 0
            X.4Rc r0 = r12.A0D(r2, r1, r0)
            int r0 = r0.A00
            if (r0 != r4) goto L_0x0065
        L_0x005e:
            X.4TB r0 = r3.A02
            X.4Rq r0 = r0.A04
            long r9 = r0.A03
            goto L_0x001f
        L_0x0065:
            X.4TC r3 = r3.A01
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4S1.A07(com.google.android.exoplayer2.Timeline, java.lang.Object):X.4Rq");
    }

    public final void A08(boolean z) {
        Object obj;
        AnonymousClass4TC r3 = this.A05;
        if (r3 == null) {
            r3 = this.A04;
        }
        if (r3 != null) {
            if (z) {
                obj = r3.A09;
            } else {
                obj = null;
            }
            this.A07 = obj;
            this.A03 = r3.A02.A04.A03;
            r3.A03();
            A09(r3);
        } else if (!z) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }
}
