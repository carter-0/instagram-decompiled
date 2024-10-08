package X;

import android.text.Layout;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.62d  reason: invalid class name and case insensitive filesystem */
public final class C3022262d {
    public final float A00;
    public final float A01;
    public final int A02;
    public final AnonymousClass62Z A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final int A07;

    public final void A0A(AnonymousClass5QA r9, C291805hu r10, C289645dx r11, C291795ht r12, long j) {
        r9.EJt();
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C292055iK r6 = ((C3022362e) list.get(i)).A06;
            C292045iJ r7 = (C292045iJ) r6;
            C291855hz r1 = r7.A02.A05;
            int i2 = r1.A00;
            r1.A02(j);
            r1.A04(r10);
            r1.A06(r12);
            r1.A05(r11);
            r1.A01(3);
            C292045iJ.A00(r9, r7);
            r1.A01(i2);
            r9.FHv(0.0f, r6.BCs());
        }
        r9.EIm();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.0rk] */
    public final void A0B(float[] fArr, long j) {
        A00(this, C285965Tk.A01(j));
        A01(this, C285965Tk.A00(j));
        ? obj = new Object();
        obj.A00 = 0;
        C304636Ep.A03(this.A04, new C58765IxC(j, fArr, obj, new Object(), 1), j);
    }

    public C3022262d(AnonymousClass62Z r21, int i, long j, boolean z) {
        boolean z2;
        AnonymousClass5VN r0;
        float BCs;
        int i2;
        AnonymousClass62Z r1 = r21;
        this.A03 = r1;
        this.A07 = i;
        if (Constraints.A03(j) == 0 && Constraints.A02(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List list = r1.A01;
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            while (true) {
                if (i3 >= size) {
                    z2 = false;
                    break;
                }
                C3022162c r7 = (C3022162c) list.get(i3);
                C291845hy r9 = r7.A02;
                int A012 = Constraints.A01(j);
                boolean A062 = Constraints.A06(j);
                int A002 = Constraints.A00(j);
                if (A062 && (A002 = A002 - ((int) ((float) Math.ceil((double) f)))) < 0) {
                    A002 = 0;
                }
                long A042 = AnonymousClass5SF.A04(0, A012, 0, A002);
                0qQ.A0C(r9, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
                C292045iJ r14 = new C292045iJ((C291835hx) r9, this.A07 - i4, A042, z);
                BCs = f + r14.BCs();
                C292075iM r92 = r14.A01;
                i2 = r92.A06 + i4;
                arrayList.add(new C3022362e(r14, f, BCs, r7.A01, r7.A00, i4, i2));
                if (r92.A0B) {
                    break;
                }
                if (i2 == this.A07) {
                    List list2 = this.A03.A01;
                    0qQ.A0B(list2, 0);
                    if (i3 != list2.size() - 1) {
                        break;
                    }
                }
                i3++;
                i4 = i2;
                f = BCs;
            }
            i4 = i2;
            f = BCs;
            z2 = true;
            this.A00 = f;
            this.A02 = i4;
            this.A06 = z2;
            this.A04 = arrayList;
            this.A01 = (float) Constraints.A01(j);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C3022362e r10 = (C3022362e) arrayList.get(i5);
                List list3 = ((C292045iJ) r10.A06).A04;
                ArrayList arrayList3 = new ArrayList(list3.size());
                int size3 = list3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    AnonymousClass5VN r13 = (AnonymousClass5VN) list3.get(i6);
                    if (r13 != null) {
                        r0 = r13.A03(C289325dP.A00(0.0f, r10.A01));
                    } else {
                        r0 = null;
                    }
                    arrayList3.add(r0);
                }
                018.A16(arrayList3, arrayList2);
            }
            if (arrayList2.size() < this.A03.A02.size()) {
                int size4 = this.A03.A02.size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList4.add((Object) null);
                }
                arrayList2 = 00k.A0S(arrayList4, arrayList2);
            }
            this.A05 = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public static final void A00(C3022262d r4, int i) {
        if (i < 0 || i >= r4.A03.A00.A00.length()) {
            throw new IllegalArgumentException(002.A0X("offset(", ") is out of bounds [0, ", ')', i, r4.A03.A00.length()));
        }
    }

    public static final void A01(C3022262d r4, int i) {
        if (i < 0 || i > r4.A03.A00.A00.length()) {
            throw new IllegalArgumentException(002.A0X("offset(", ") is out of bounds [0, ", ']', i, r4.A03.A00.length()));
        }
    }

    public static final void A02(C3022262d r4, int i) {
        if (i < 0 || i >= r4.A02) {
            throw new IllegalArgumentException(002.A0X("lineIndex(", ") is out of bounds [0, ", ')', i, r4.A02));
        }
    }

    public final int A05(float f) {
        List list = this.A04;
        C3022362e r3 = (C3022362e) list.get(C304636Ep.A00(list, f));
        if (r3.A04 - r3.A05 == 0) {
            return r3.A03;
        }
        C292055iK r1 = r3.A06;
        float f2 = f - r3.A01;
        C292075iM r0 = ((C292045iJ) r1).A01;
        return r0.A09.getLineForVertical(((int) f2) - r0.A07) + r3.A03;
    }

    public final int A06(int i) {
        int A012;
        if (i >= this.A03.A00.length()) {
            List list = this.A04;
            0qQ.A0B(list, 0);
            A012 = list.size() - 1;
        } else if (i < 0) {
            A012 = 0;
        } else {
            A012 = C304636Ep.A01(this.A04, i);
        }
        C3022362e r4 = (C3022362e) this.A04.get(A012);
        C292055iK r3 = r4.A06;
        int i2 = r4.A05;
        return ((C292045iJ) r3).A01.A09.getLineForOffset(C229632nm.A03(i, i2, r4.A04) - i2) + r4.A03;
    }

    public final int A08(long j) {
        float f;
        List list = this.A04;
        float A022 = C289295dM.A02(j);
        C3022362e r2 = (C3022362e) list.get(C304636Ep.A00(list, A022));
        int i = r2.A04;
        int i2 = r2.A05;
        if (i - i2 == 0) {
            return i2;
        }
        C292055iK r4 = r2.A06;
        long A002 = C289325dP.A00(C289295dM.A01(j), A022 - r2.A01);
        C292075iM r6 = ((C292045iJ) r4).A01;
        Layout layout = r6.A09;
        int lineForVertical = layout.getLineForVertical(((int) C289295dM.A02(A002)) - r6.A07);
        float A012 = C289295dM.A01(A002);
        if (lineForVertical == r6.A06 - 1) {
            f = r6.A02 + r6.A03;
        } else {
            f = 0.0f;
        }
        return i2 + layout.getOffsetForHorizontal(lineForVertical, A012 + (-1.0f * f));
    }

    public final long A09(AnonymousClass5VN r12, C59647JRp jRp, int i) {
        List list = this.A04;
        int A002 = C304636Ep.A00(list, r12.A03);
        float f = ((C3022362e) list.get(A002)).A00;
        float f2 = r12.A00;
        if (f >= f2 || A002 == list.size() - 1) {
            C3022362e r3 = (C3022362e) list.get(A002);
            return r3.A00(r3.A06.Bj9(r12.A03(C289325dP.A00(0.0f, -r3.A01)), jRp, i), true);
        }
        int A003 = C304636Ep.A00(list, f2);
        long j = C285965Tk.A01;
        long j2 = j;
        while (j2 == j && A002 <= A003) {
            C3022362e r32 = (C3022362e) list.get(A002);
            j2 = r32.A00(r32.A06.Bj9(r12.A03(C289325dP.A00(0.0f, -r32.A01)), jRp, i), true);
            A002++;
        }
        if (j2 == j) {
            return j;
        }
        long j3 = j;
        while (j3 == j && A002 <= A003) {
            C3022362e r8 = (C3022362e) list.get(A003);
            j3 = r8.A00(r8.A06.Bj9(r12.A03(C289325dP.A00(0.0f, -r8.A01)), jRp, i), true);
            A003--;
        }
        if (j3 == j) {
            return j2;
        }
        return C3026964x.A00((int) (j2 >> 32), (int) (j3 & 4294967295L));
    }

    public final float A03(int i) {
        A02(this, i);
        List list = this.A04;
        C3022362e r2 = (C3022362e) list.get(C304636Ep.A02(list, i));
        C292055iK r1 = r2.A06;
        return ((C292045iJ) r1).A01.A01(i - r2.A03) + r2.A01;
    }

    public final float A04(int i) {
        A02(this, i);
        List list = this.A04;
        C3022362e r2 = (C3022362e) list.get(C304636Ep.A02(list, i));
        C292055iK r1 = r2.A06;
        return ((C292045iJ) r1).A01.A02(i - r2.A03) + r2.A01;
    }

    public final int A07(int i, boolean z) {
        int A052;
        A02(this, i);
        List list = this.A04;
        C3022362e r4 = (C3022362e) list.get(C304636Ep.A02(list, i));
        C292055iK r1 = r4.A06;
        int i2 = i - r4.A03;
        C292075iM r3 = ((C292045iJ) r1).A01;
        if (z) {
            Layout layout = r3.A09;
            if (layout.getEllipsisStart(i2) == 0) {
                AnonymousClass6E3 r2 = r3.A00;
                if (r2 == null) {
                    r2 = new AnonymousClass6E3(layout);
                    r3.A00 = r2;
                }
                Layout layout2 = r2.A01;
                A052 = AnonymousClass6E3.A00(r2, layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                A052 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            A052 = r3.A05(i2);
        }
        return A052 + r4.A05;
    }
}
