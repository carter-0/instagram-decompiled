package X;

import android.graphics.Rect;

/* renamed from: X.Gft  reason: case insensitive filesystem */
public final class C52942Gft extends C56882IGd {
    public static C52942Gft A03;
    public static final C52430GSi A04 = C52430GSi.Ltr;
    public static final C52430GSi A05 = C52430GSi.Rtl;
    public AnonymousClass5SX A00;
    public C3022462f A01;
    public Rect A02 = AnonymousClass7TE.A0W();

    private final int A00(C52430GSi gSi, int i) {
        C3022462f r0 = this.A01;
        if (r0 != null) {
            int A032 = r0.A03(i);
            C3022462f r02 = this.A01;
            if (r02 != null) {
                C52430GSi A09 = r02.A09(A032);
                C3022462f r03 = this.A01;
                if (gSi != A09) {
                    if (r03 != null) {
                        return r03.A03(i);
                    }
                } else if (r03 != null) {
                    return r03.A03.A07(i, false) - 1;
                }
            }
        }
        0qQ.A0F("layoutResult");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int[] AWA(int i) {
        int i2;
        if (C56882IGd.A01(this) <= 0 || i >= C56882IGd.A01(this)) {
            return null;
        }
        try {
            AnonymousClass5SX r0 = this.A00;
            if (r0 == null) {
                0qQ.A0F("node");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass5VN A032 = r0.A03();
            int round = Math.round(A032.A00 - A032.A03);
            int i3 = 0;
            if (0 < i) {
                i3 = i;
            }
            C3022462f r02 = this.A01;
            if (r02 != null) {
                int A06 = r02.A03.A06(i3);
                C3022462f r03 = this.A01;
                if (r03 != null) {
                    float A042 = r03.A03.A04(A06) + ((float) round);
                    C3022462f r04 = this.A01;
                    if (r04 != null) {
                        C3022262d r1 = r04.A03;
                        int i4 = (A042 > r1.A04(r1.A02 - 1) ? 1 : (A042 == r1.A04(r1.A02 - 1) ? 0 : -1));
                        C3022462f r05 = this.A01;
                        if (i4 < 0) {
                            if (r05 != null) {
                                i2 = r05.A03.A05(A042);
                            }
                        } else if (r05 != null) {
                            i2 = r05.A03.A02;
                        }
                        return A04(i3, A00(A04, i2 - 1) + 1);
                    }
                }
            }
            0qQ.A0F("layoutResult");
            throw AnonymousClass00P.createAndThrow();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int[] E3T(int i) {
        int i2;
        if (C56882IGd.A01(this) <= 0 || i <= 0) {
            return null;
        }
        try {
            AnonymousClass5SX r0 = this.A00;
            if (r0 == null) {
                0qQ.A0F("node");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass5VN A032 = r0.A03();
            int round = Math.round(A032.A00 - A032.A03);
            int A012 = C56882IGd.A01(this);
            if (A012 > i) {
                A012 = i;
            }
            C3022462f r02 = this.A01;
            if (r02 != null) {
                int A06 = r02.A03.A06(A012);
                C3022462f r03 = this.A01;
                if (r03 != null) {
                    float A042 = r03.A03.A04(A06) - ((float) round);
                    if (A042 > 0.0f) {
                        C3022462f r04 = this.A01;
                        if (r04 != null) {
                            i2 = r04.A03.A05(A042);
                        }
                    } else {
                        i2 = 0;
                    }
                    if (A012 == C56882IGd.A01(this) && i2 < A06) {
                        i2++;
                    }
                    return A04(A00(A05, i2), A012);
                }
            }
            0qQ.A0F("layoutResult");
            throw AnonymousClass00P.createAndThrow();
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
