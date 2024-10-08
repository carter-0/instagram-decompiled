package X;

import java.util.List;

public final class IFG implements AnonymousClass6JL, MW2 {
    public int A00;
    public int A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final long A0C;
    public final AnonymousClass6H4 A0D;
    public final Object A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final long A0M;
    public final AnonymousClass5Q8 A0N;
    public final Object A0O;

    public final void E3D(int i, int i2, int i3, int i4) {
        A00(i, i2, i3, i4, -1, -1);
    }

    public final void EeC(boolean z) {
        this.A06 = true;
    }

    public final void A00(int i, int i2, int i3, int i4, int i5, int i6) {
        long A002;
        boolean z = this.A0G;
        if (!z) {
            i4 = i3;
        }
        this.A01 = i4;
        if (z) {
            if (this.A0N == AnonymousClass5Q8.Rtl) {
                i2 = (i3 - i2) - this.A0J;
            }
            A002 = AnonymousClass5TW.A00(i2, i);
        } else {
            A002 = AnonymousClass5TW.A00(i, i2);
        }
        this.A05 = A002;
        this.A04 = i5;
        this.A00 = i6;
        this.A03 = -this.A0I;
        this.A02 = i4 + this.A07;
    }

    public final long Aq6() {
        return this.A0M;
    }

    public final int BKU() {
        return this.A0K;
    }

    public final int BOp() {
        return this.A0A;
    }

    public final Object BaY(int i) {
        return ((C267974cY) this.A0F.get(i)).BaX();
    }

    public final int Bco() {
        return this.A0F.size();
    }

    public final int By3() {
        return this.A0L;
    }

    public final boolean CeR() {
        return this.A0G;
    }

    public final int getIndex() {
        return this.A08;
    }

    public final Object getKey() {
        return this.A0E;
    }

    public IFG(AnonymousClass6H4 r6, AnonymousClass5Q8 r7, Object obj, Object obj2, List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, boolean z, boolean z2) {
        long A002;
        int i8;
        this.A08 = i;
        this.A0E = obj;
        this.A0G = z;
        this.A0J = i2;
        this.A0H = z2;
        this.A0N = r7;
        this.A0I = i4;
        this.A07 = i5;
        this.A0F = list;
        this.A0C = j;
        this.A0O = obj2;
        this.A0D = r6;
        this.A0M = j2;
        this.A0K = i6;
        this.A0L = i7;
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C267974cY r1 = (C267974cY) list.get(i10);
            if (this.A0G) {
                i8 = r1.A00;
            } else {
                i8 = r1.A01;
            }
            i9 = Math.max(i9, i8);
        }
        this.A09 = i9;
        int i11 = i9 + i3;
        this.A0A = C51970G9q.A07(i11, i11);
        boolean z3 = this.A0G;
        int i12 = this.A0J;
        if (z3) {
            A002 = C289155d7.A00(i12, i9);
        } else {
            A002 = C289155d7.A00(i9, i12);
        }
        this.A0B = A002;
        this.A05 = 0;
        this.A04 = -1;
        this.A00 = -1;
    }

    public final long BXq(int i) {
        return this.A05;
    }
}
