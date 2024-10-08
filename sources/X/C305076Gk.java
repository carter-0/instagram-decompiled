package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6Gk  reason: invalid class name and case insensitive filesystem */
public final class C305076Gk implements C289145d6, C305086Gl {
    public float A00;
    public int A01;
    public boolean A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final AnonymousClass6Gj A0A;
    public final AnonymousClass6JK A0B;
    public final C268024cd A0C;
    public final List A0D;
    public final C262224Cq A0E;
    public final boolean A0F;
    public final /* synthetic */ C289145d6 A0G;

    public final Map Aam() {
        return this.A0G.Aam();
    }

    public final 0sP Bov() {
        return this.A0G.Bov();
    }

    public final void E2n() {
        this.A0G.E2n();
    }

    public final int getHeight() {
        return this.A0G.getHeight();
    }

    public final int getWidth() {
        return this.A0G.getWidth();
    }

    public final boolean A00(int i, boolean z) {
        AnonymousClass6JK r0;
        if (this.A0F) {
            return false;
        }
        List list = this.A0D;
        if (list.isEmpty() || (r0 = this.A0B) == null) {
            return false;
        }
        int i2 = r0.A08;
        int i3 = this.A01 - i;
        if (i3 < 0 || i3 >= i2) {
            return false;
        }
        AnonymousClass6JK r1 = (AnonymousClass6JK) 00k.A0I(list);
        AnonymousClass6JK r3 = (AnonymousClass6JK) 00k.A0K(list);
        if (r1.A03 || r3.A03) {
            return false;
        }
        if (i < 0) {
            if (Math.min((r1.A02 + r1.A08) - this.A08, (r3.A02 + r3.A08) - this.A07) <= (-i)) {
                return false;
            }
        } else if (Math.min(this.A08 - r1.A02, this.A07 - r3.A02) <= i) {
            return false;
        }
        this.A01 -= i;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnonymousClass6JK r7 = (AnonymousClass6JK) list.get(i4);
            if (!r7.A03) {
                r7.A02 += i;
                int[] iArr = r7.A0E;
                int length = iArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (r7.A0D) {
                        if (i5 % 2 != 1) {
                        }
                        iArr[i5] = iArr[i5] + i;
                    } else {
                        if (i5 % 2 != 0) {
                        }
                        iArr[i5] = iArr[i5] + i;
                    }
                }
                if (z) {
                    int size2 = r7.A0C.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C56602I4b A052 = r7.A0A.A05(r7.A0B, i6);
                        if (A052 != null) {
                            long j = A052.A02;
                            boolean z2 = r7.A0D;
                            int i7 = (int) (j >> 32);
                            if (!z2) {
                                i7 += i;
                            }
                            int i8 = (int) (j & 4294967295L);
                            if (z2) {
                                i8 += i;
                            }
                            A052.A02 = AnonymousClass5TW.A00(i7, i8);
                        }
                    }
                }
            }
        }
        this.A00 = (float) i;
        if (!this.A02 && i > 0) {
            this.A02 = true;
        }
        return true;
    }

    public C305076Gk(AnonymousClass6Gj r3, AnonymousClass6JK r4, C289145d6 r5, C268024cd r6, List list, C262224Cq r8, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, boolean z2) {
        this.A0B = r4;
        this.A01 = i;
        this.A02 = z;
        this.A00 = f;
        this.A03 = f2;
        this.A0F = z2;
        this.A0E = r8;
        this.A0C = r6;
        this.A09 = j;
        this.A0D = list;
        this.A08 = i2;
        this.A07 = i3;
        this.A06 = i4;
        this.A0A = r3;
        this.A04 = i5;
        this.A05 = i6;
        this.A0G = r5;
    }
}
