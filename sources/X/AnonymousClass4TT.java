package X;

import android.util.Pair;

/* renamed from: X.4TT  reason: invalid class name */
public final class AnonymousClass4TT implements AnonymousClass4TI {
    public final boolean A00 = 2BY.A02(2BQ.A0d);
    public final AnonymousClass4TI[] A01;

    private boolean A00(AnonymousClass4TI r6) {
        int i;
        if (r6 instanceof AnonymousClass4TP) {
            i = ((AnonymousClass4TP) r6).A0F;
        } else {
            if (this.A00 && (r6 instanceof C284835Ol)) {
                C264844Rn r1 = ((C284835Ol) r6).A06;
                if (r1.A01 == 1) {
                    C264854Ro r12 = (C264854Ro) r1.A02.get(0);
                    if (r12.A01 == 1) {
                        i = r12.A02;
                    }
                }
            }
            return false;
        }
        if (i != 3) {
            return false;
        }
        return true;
    }

    public final Pair A01() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MIN_VALUE;
        for (AnonymousClass4TI r1 : this.A01) {
            if (!A00(r1)) {
                long BWC = r1.BWC();
                if (BWC != Long.MIN_VALUE) {
                    j = Math.min(j, BWC);
                    j2 = Math.max(j2, BWC);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return new Pair(Long.MIN_VALUE, Long.MIN_VALUE);
        }
        return new Pair(Long.valueOf(j), Long.valueOf(j2));
    }

    public final void AGR(long j) {
        for (AnonymousClass4TI AGR : this.A01) {
            AGR.AGR(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r4 > r18) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJh(long r18, long r20) {
        /*
            r17 = this;
            r16 = 0
        L_0x0002:
            r1 = r17
            android.util.Pair r9 = r1.A01()
            java.lang.Object r0 = r9.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r14 = r0.longValue()
            r12 = -9223372036854775808
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            X.4TI[] r8 = r1.A01
            int r7 = r8.length
            r0 = 0
        L_0x001a:
            if (r0 >= r7) goto L_0x001f
            int r0 = r0 + 1
            goto L_0x001a
        L_0x001f:
            r6 = 0
            r11 = 0
        L_0x0021:
            if (r6 >= r7) goto L_0x004d
            r10 = r8[r6]
            long r4 = r10.BWC()
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            r2 = r18
            if (r0 == 0) goto L_0x0034
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            java.lang.Object r0 = r9.second
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0045
            if (r1 != 0) goto L_0x0045
        L_0x0042:
            int r6 = r6 + 1
            goto L_0x0021
        L_0x0045:
            r0 = r20
            boolean r0 = r10.AJh(r2, r0)
            r11 = r11 | r0
            goto L_0x0042
        L_0x004d:
            r16 = r16 | r11
            if (r11 != 0) goto L_0x0002
        L_0x0051:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TT.AJh(long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r3 > r11.A01) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJi(X.C21415XaP r18) {
        /*
            r17 = this;
            r16 = 0
        L_0x0002:
            r1 = r17
            android.util.Pair r10 = r1.A01()
            java.lang.Object r0 = r10.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r14 = r0.longValue()
            r12 = -9223372036854775808
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            X.4TI[] r9 = r1.A01
            int r8 = r9.length
            r0 = 0
        L_0x001a:
            if (r0 >= r8) goto L_0x001f
            int r0 = r0 + 1
            goto L_0x001a
        L_0x001f:
            r7 = 0
            r6 = 0
        L_0x0021:
            if (r7 >= r8) goto L_0x004d
            r5 = r9[r7]
            long r3 = r5.BWC()
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r11 = r18
            if (r0 == 0) goto L_0x0036
            long r1 = r11.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            java.lang.Object r0 = r10.second
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0047
            if (r1 != 0) goto L_0x0047
        L_0x0044:
            int r7 = r7 + 1
            goto L_0x0021
        L_0x0047:
            boolean r0 = r5.AJi(r11)
            r6 = r6 | r0
            goto L_0x0044
        L_0x004d:
            r16 = r16 | r6
            if (r6 != 0) goto L_0x0002
        L_0x0051:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TT.AJi(X.XaP):boolean");
    }

    public final long AiS(long j) {
        long j2 = Long.MAX_VALUE;
        for (AnonymousClass4TI r1 : this.A01) {
            if (!A00(r1)) {
                long AiS = r1.AiS(j);
                if (AiS == Long.MIN_VALUE) {
                    continue;
                } else if (AiS <= 0) {
                    return 0;
                } else {
                    j2 = Math.min(j2, AiS);
                }
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return 0;
        }
        return j2;
    }

    public final long AiU() {
        long j = Long.MAX_VALUE;
        for (AnonymousClass4TI r1 : this.A01) {
            if (!A00(r1)) {
                long AiU = r1.AiU();
                if (AiU != Long.MIN_VALUE) {
                    j = Math.min(j, AiU);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long BWC() {
        long j = Long.MAX_VALUE;
        for (AnonymousClass4TI r1 : this.A01) {
            if (!A00(r1)) {
                long BWC = r1.BWC();
                if (BWC != Long.MIN_VALUE) {
                    j = Math.min(j, BWC);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void EB7(long j) {
        for (AnonymousClass4TI EB7 : this.A01) {
            EB7.EB7(j);
        }
    }

    public final void Efw(boolean z) {
        for (AnonymousClass4TI Efw : this.A01) {
            Efw.Efw(z);
        }
    }

    public final void FKi(byte b, boolean z) {
        for (AnonymousClass4TI FKi : this.A01) {
            FKi.FKi(b, z);
        }
    }

    public final boolean isLoading() {
        for (AnonymousClass4TI isLoading : this.A01) {
            if (isLoading.isLoading()) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass4TT(AnonymousClass4TI[] r2) {
        this.A01 = r2;
    }
}
