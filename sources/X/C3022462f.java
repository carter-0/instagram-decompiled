package X;

import android.graphics.RectF;
import android.text.Layout;
import java.util.List;

/* renamed from: X.62f  reason: invalid class name and case insensitive filesystem */
public final class C3022462f {
    public final float A00;
    public final float A01;
    public final long A02;
    public final C3022262d A03;
    public final AnonymousClass62Y A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3022462f) {
                C3022462f r8 = (C3022462f) obj;
                if (!0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A03, r8.A03) || this.A02 != r8.A02 || this.A00 != r8.A00 || this.A01 != r8.A01 || !0qQ.A0K(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A00(int i) {
        float f;
        C3022262d r0 = this.A03;
        C3022262d.A02(r0, i);
        List list = r0.A04;
        C3022362e r02 = (C3022362e) list.get(C304636Ep.A02(list, i));
        C292055iK r1 = r02.A06;
        int i2 = i - r02.A03;
        C292075iM r2 = ((C292045iJ) r1).A01;
        float lineLeft = r2.A09.getLineLeft(i2);
        if (i2 == r2.A06 - 1) {
            f = r2.A02;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    public final float A01(int i) {
        float f;
        C3022262d r0 = this.A03;
        C3022262d.A02(r0, i);
        List list = r0.A04;
        C3022362e r02 = (C3022362e) list.get(C304636Ep.A02(list, i));
        C292055iK r1 = r02.A06;
        int i2 = i - r02.A03;
        C292075iM r2 = ((C292045iJ) r1).A01;
        float lineRight = r2.A09.getLineRight(i2);
        if (i2 == r2.A06 - 1) {
            f = r2.A03;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    public final float A02(int i, boolean z) {
        int A012;
        C3022262d r1 = this.A03;
        C3022262d.A01(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            0qQ.A0B(list, 0);
            A012 = list.size() - 1;
        } else {
            A012 = C304636Ep.A01(list, i);
        }
        C3022362e r0 = (C3022362e) list.get(A012);
        C292055iK r3 = r0.A06;
        int i2 = r0.A05;
        int A032 = C229632nm.A03(i, i2, r0.A04) - i2;
        C292075iM r12 = ((C292045iJ) r3).A01;
        if (z) {
            return r12.A03(A032, false);
        }
        return r12.A04(A032, false);
    }

    public final int A03(int i) {
        C3022262d r0 = this.A03;
        C3022262d.A02(r0, i);
        List list = r0.A04;
        C3022362e r2 = (C3022362e) list.get(C304636Ep.A02(list, i));
        C292055iK r1 = r2.A06;
        return ((C292045iJ) r1).A01.A09.getLineStart(i - r2.A03) + r2.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        if (X.SRG.A02(r5, r2) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        if (X.SRG.A02(r5, r2) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        if (X.SRG.A01(r5, r2) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if (X.SRG.A01(r5, r2) != false) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A04(int r8) {
        /*
            r7 = this;
            X.62d r1 = r7.A03
            X.C3022262d.A01(r1, r8)
            X.62Z r0 = r1.A03
            X.5Tq r0 = r0.A00
            int r0 = r0.length()
            java.util.List r1 = r1.A04
            if (r8 != r0) goto L_0x00db
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r0 = r1.size()
            int r0 = r0 + -1
        L_0x001b:
            java.lang.Object r3 = r1.get(r0)
            X.62e r3 = (X.C3022362e) r3
            X.5iK r4 = r3.A06
            int r1 = r3.A05
            int r0 = r3.A04
            int r2 = X.C229632nm.A03(r8, r1, r0)
            int r2 = r2 - r1
            X.5iJ r4 = (X.C292045iJ) r4
            X.5iM r0 = r4.A01
            X.SRG r5 = r0.A06()
            r6 = r2
            X.SRG.A00(r5, r2)
            java.text.BreakIterator r4 = r5.A00
            int r0 = r4.preceding(r2)
            boolean r0 = r5.A04(r0)
            r1 = r2
            if (r0 == 0) goto L_0x00ba
            X.SRG.A00(r5, r2)
        L_0x0048:
            r0 = -1
            if (r1 == r0) goto L_0x005b
            boolean r0 = r5.A04(r1)
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r5.A03(r1)
            if (r0 != 0) goto L_0x00b2
        L_0x0057:
            r0 = -1
            if (r1 == r0) goto L_0x005b
            r6 = r1
        L_0x005b:
            X.SRG.A00(r5, r2)
            int r0 = r4.following(r2)
            boolean r0 = r5.A03(r0)
            r1 = r2
            if (r0 == 0) goto L_0x0091
            X.SRG.A00(r5, r2)
        L_0x006c:
            r0 = -1
            if (r1 == r0) goto L_0x007f
            boolean r0 = r5.A04(r1)
            if (r0 != 0) goto L_0x0089
            boolean r0 = r5.A03(r1)
            if (r0 == 0) goto L_0x0089
        L_0x007b:
            r0 = -1
            if (r1 == r0) goto L_0x007f
            r2 = r1
        L_0x007f:
            long r1 = X.C3026964x.A00(r6, r2)
            r0 = 0
            long r0 = r3.A00(r1, r0)
            return r0
        L_0x0089:
            X.SRG.A00(r5, r1)
            int r1 = r4.following(r1)
            goto L_0x006c
        L_0x0091:
            X.SRG.A00(r5, r2)
            boolean r0 = X.SRG.A01(r5, r2)
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r4.isBoundary(r2)
            if (r0 == 0) goto L_0x00a6
            boolean r0 = X.SRG.A02(r5, r2)
            if (r0 == 0) goto L_0x007b
        L_0x00a6:
            int r1 = r4.following(r2)
            goto L_0x007b
        L_0x00ab:
            boolean r0 = X.SRG.A02(r5, r2)
            if (r0 == 0) goto L_0x007f
            goto L_0x00a6
        L_0x00b2:
            X.SRG.A00(r5, r1)
            int r1 = r4.preceding(r1)
            goto L_0x0048
        L_0x00ba:
            X.SRG.A00(r5, r2)
            boolean r0 = X.SRG.A02(r5, r2)
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r4.isBoundary(r2)
            if (r0 == 0) goto L_0x00cf
            boolean r0 = X.SRG.A01(r5, r2)
            if (r0 == 0) goto L_0x0057
        L_0x00cf:
            int r1 = r4.preceding(r2)
            goto L_0x0057
        L_0x00d4:
            boolean r0 = X.SRG.A01(r5, r2)
            if (r0 == 0) goto L_0x005b
            goto L_0x00cf
        L_0x00db:
            int r0 = X.C304636Ep.A01(r1, r8)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3022462f.A04(int):long");
    }

    public final AnonymousClass5VN A05(int i) {
        float A042;
        float A043;
        C3022262d r0 = this.A03;
        C3022262d.A00(r0, i);
        List list = r0.A04;
        C3022362e r5 = (C3022362e) list.get(C304636Ep.A01(list, i));
        C292055iK r4 = r5.A06;
        int i2 = r5.A05;
        int A032 = C229632nm.A03(i, i2, r5.A04) - i2;
        C292045iJ r42 = (C292045iJ) r4;
        if (A032 < 0 || A032 >= r42.A03.length()) {
            throw new IllegalArgumentException(002.A0X("offset(", ") is out of bounds [0,", ')', A032, r42.A03.length()));
        }
        C292075iM r8 = r42.A01;
        Layout layout = r8.A09;
        int lineForOffset = layout.getLineForOffset(A032);
        float A022 = r8.A02(lineForOffset);
        float A012 = r8.A01(lineForOffset);
        boolean z = false;
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z = true;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(A032);
        if (z) {
            if (!isRtlCharAt) {
                A042 = r8.A03(A032, false);
                A043 = r8.A03(A032 + 1, true);
            } else {
                A043 = r8.A04(A032, false);
                A042 = r8.A04(A032 + 1, true);
            }
        } else if (isRtlCharAt) {
            A043 = r8.A03(A032, false);
            A042 = r8.A03(A032 + 1, true);
        } else {
            A042 = r8.A04(A032, false);
            A043 = r8.A04(A032 + 1, true);
        }
        RectF rectF = new RectF(A042, A022, A043, A012);
        return new AnonymousClass5VN(rectF.left, rectF.top, rectF.right, rectF.bottom).A03(C289325dP.A00(0.0f, r5.A01));
    }

    public final AnonymousClass5VN A06(int i) {
        int A012;
        C3022262d r1 = this.A03;
        C3022262d.A01(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            0qQ.A0B(list, 0);
            A012 = list.size() - 1;
        } else {
            A012 = C304636Ep.A01(list, i);
        }
        C3022362e r5 = (C3022362e) list.get(A012);
        C292055iK r6 = r5.A06;
        int i2 = r5.A05;
        int A032 = C229632nm.A03(i, i2, r5.A04) - i2;
        C292045iJ r62 = (C292045iJ) r6;
        if (A032 < 0 || A032 > r62.A03.length()) {
            throw new IllegalArgumentException(002.A0X("offset(", ") is out of bounds [0,", ']', A032, r62.A03.length()));
        }
        C292075iM r2 = r62.A01;
        float A033 = r2.A03(A032, false);
        int lineForOffset = r2.A09.getLineForOffset(A032);
        return new AnonymousClass5VN(A033, r2.A02(lineForOffset), A033, r2.A01(lineForOffset)).A03(C289325dP.A00(0.0f, r5.A01));
    }

    public final C3018160e A07(int i, int i2) {
        C3022262d r1 = this.A03;
        int i3 = i;
        int i4 = i2;
        if (i < 0 || i > i2 || i2 > r1.A03.A00.A00.length()) {
            throw new IllegalArgumentException(002.A0z("Start(", ") or End(", ") is out of range [0..", "), or start > end!", i3, i4, r1.A03.A00.A00.length()));
        }
        C3018160e A002 = C3026864w.A00();
        if (i != i2) {
            C304636Ep.A03(r1.A04, new C377359Ln(A002, i2, i, 0), C3026964x.A00(i, i2));
        }
        return A002;
    }

    public final C52430GSi A08(int i) {
        int A012;
        C3022262d r1 = this.A03;
        C3022262d.A01(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            0qQ.A0B(list, 0);
            A012 = list.size() - 1;
        } else {
            A012 = C304636Ep.A01(list, i);
        }
        C3022362e r0 = (C3022362e) list.get(A012);
        C292055iK r3 = r0.A06;
        int i2 = r0.A05;
        if (((C292045iJ) r3).A01.A09.isRtlCharAt(C229632nm.A03(i, i2, r0.A04) - i2)) {
            return C52430GSi.Rtl;
        }
        return C52430GSi.Ltr;
    }

    public final C52430GSi A09(int i) {
        int A012;
        C3022262d r1 = this.A03;
        C3022262d.A01(r1, i);
        int length = r1.A03.A00.length();
        List list = r1.A04;
        if (i == length) {
            0qQ.A0B(list, 0);
            A012 = list.size() - 1;
        } else {
            A012 = C304636Ep.A01(list, i);
        }
        C3022362e r0 = (C3022362e) list.get(A012);
        C292055iK r3 = r0.A06;
        int i2 = r0.A05;
        int A032 = C229632nm.A03(i, i2, r0.A04) - i2;
        Layout layout = ((C292045iJ) r3).A01.A09;
        if (layout.getParagraphDirection(layout.getLineForOffset(A032)) == 1) {
            return C52430GSi.Ltr;
        }
        return C52430GSi.Rtl;
    }

    public final boolean A0A() {
        long j = this.A02;
        C3022262d r2 = this.A03;
        if (((float) ((int) (j >> 32))) < r2.A01 || r2.A06 || ((float) C289005cr.A00(j)) < r2.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A02;
        return (((((((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A05.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextLayoutResult(layoutInput=");
        sb.append(this.A04);
        sb.append(", multiParagraph=");
        sb.append(this.A03);
        sb.append(", size=");
        long j = this.A02;
        sb.append(002.A0P(" x ", (int) (j >> 32), C289005cr.A00(j)));
        sb.append(", firstBaseline=");
        sb.append(this.A00);
        sb.append(", lastBaseline=");
        sb.append(this.A01);
        sb.append(", placeholderRects=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }

    public C3022462f(C3022262d r4, AnonymousClass62Y r5, long j) {
        float A002;
        float A003;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = j;
        List list = r4.A04;
        if (list.isEmpty()) {
            A002 = 0.0f;
        } else {
            A002 = ((C292045iJ) ((C3022362e) list.get(0)).A06).A01.A00(0);
        }
        this.A00 = A002;
        if (list.isEmpty()) {
            A003 = 0.0f;
        } else {
            C3022362e r2 = (C3022362e) 00k.A0K(list);
            C292075iM r1 = ((C292045iJ) r2.A06).A01;
            A003 = r1.A00(r1.A06 - 1) + r2.A01;
        }
        this.A01 = A003;
        this.A05 = r4.A05;
    }
}
