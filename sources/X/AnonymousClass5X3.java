package X;

import java.util.ArrayList;

/* renamed from: X.5X3  reason: invalid class name */
public final class AnonymousClass5X3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final C286505Wq A09;
    public final int[] A0A;
    public final Object[] A0B;
    public final int A0C;
    public final AnonymousClass5X0 A0D = new AnonymousClass5X0();

    public final void A07() {
        this.A06 = true;
        C286505Wq r1 = this.A09;
        int i = r1.A01;
        if (i > 0) {
            r1.A01 = i - 1;
        } else {
            AnonymousClass5XN.A03("Unexpected reader close()");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final Object A00(AnonymousClass5X3 r4, int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return r4.A0B[iArr[i2 + 4] + AnonymousClass5X6.A00(i3 >> 30)];
        }
        return null;
    }

    public final int A01() {
        int i = 1;
        if (this.A04 == 0) {
            int[] iArr = this.A0A;
            int i2 = this.A01;
            if (!AnonymousClass5X6.A03(iArr, i2)) {
                i = iArr[(i2 * 5) + 1] & 67108863;
            }
            this.A01 = i2 + iArr[(i2 * 5) + 3];
            return i;
        }
        AnonymousClass5XN.A03("Cannot skip while in an empty region");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.5X7, java.lang.Object] */
    public final AnonymousClass5X7 A02(int i) {
        ArrayList arrayList = this.A09.A05;
        int A012 = AnonymousClass5X6.A01(arrayList, i, this.A08);
        if (A012 >= 0) {
            return (AnonymousClass5X7) arrayList.get(A012);
        }
        ? obj = new Object();
        obj.A00 = i;
        arrayList.add(-(A012 + 1), obj);
        return obj;
    }

    public final Object A03() {
        int i = this.A01;
        if (i >= this.A00) {
            return 0;
        }
        int[] iArr = this.A0A;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return AnonymousClass5XT.A00;
        }
        Object[] objArr = this.A0B;
        int length = iArr.length;
        if (i2 < length) {
            length = AnonymousClass5X6.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A04() {
        int i;
        if (this.A04 > 0 || (i = this.A02) >= this.A03) {
            this.A07 = false;
            return AnonymousClass5XT.A00;
        }
        this.A07 = true;
        Object[] objArr = this.A0B;
        this.A02 = i + 1;
        return objArr[i];
    }

    public final Object A05(int i) {
        int[] iArr = this.A0A;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return AnonymousClass5XT.A00;
        }
        Object[] objArr = this.A0B;
        int length = iArr.length;
        if (i2 < length) {
            length = AnonymousClass5X6.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A06(int i, int i2) {
        int i3;
        int[] iArr = this.A0A;
        int i4 = i * 5;
        int A002 = iArr[i4 + 4] + AnonymousClass5X6.A00(iArr[i4 + 1] >> 28);
        int i5 = i + 1;
        if (i5 < this.A08) {
            i3 = iArr[(i5 * 5) + 4];
        } else {
            i3 = this.A0C;
        }
        int i6 = A002 + i2;
        if (i6 < i3) {
            return this.A0B[i6];
        }
        return AnonymousClass5XT.A00;
    }

    public final void A08() {
        int i;
        int i2;
        if (this.A04 != 0) {
            return;
        }
        if (this.A01 == this.A00) {
            int[] iArr = this.A0A;
            int i3 = iArr[(this.A05 * 5) + 2];
            this.A05 = i3;
            if (i3 < 0) {
                i = this.A08;
            } else {
                i = iArr[(i3 * 5) + 3] + i3;
            }
            this.A00 = i;
            AnonymousClass5X0 r2 = this.A0D;
            int[] iArr2 = r2.A01;
            int i4 = r2.A00 - 1;
            r2.A00 = i4;
            int i5 = iArr2[i4];
            if (i5 < 0) {
                this.A02 = 0;
                this.A03 = 0;
                return;
            }
            this.A02 = i5;
            if (i3 >= this.A08 - 1) {
                i2 = this.A0C;
            } else {
                i2 = iArr[((i3 + 1) * 5) + 4];
            }
            this.A03 = i2;
            return;
        }
        AnonymousClass5XN.A03("endGroup() not called at the end of a group");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A09() {
        if (this.A04 == 0) {
            this.A01 = this.A00;
            this.A02 = 0;
            this.A03 = 0;
            return;
        }
        AnonymousClass5XN.A03("Cannot skip the enclosing group while in an empty region");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0A() {
        int i;
        if (this.A04 <= 0) {
            int i2 = this.A05;
            int i3 = this.A01;
            int[] iArr = this.A0A;
            if (iArr[(i3 * 5) + 2] == i2) {
                AnonymousClass5X0 r2 = this.A0D;
                int i4 = this.A02;
                int i5 = this.A03;
                if (i4 == 0 && i5 == 0) {
                    i4 = -1;
                }
                r2.A00(i4);
                this.A05 = i3;
                int i6 = i3 * 5;
                this.A00 = iArr[i6 + 3] + i3;
                int i7 = i3 + 1;
                this.A01 = i7;
                this.A02 = iArr[i6 + 4] + AnonymousClass5X6.A00(iArr[i6 + 1] >> 28);
                if (i3 >= this.A08 - 1) {
                    i = this.A0C;
                } else {
                    i = iArr[(i7 * 5) + 4];
                }
                this.A03 = i;
                return;
            }
            C18086VlG.A00("Invalid slot table detected");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0B(int i) {
        int i2;
        if (this.A04 == 0) {
            this.A01 = i;
            int i3 = this.A08;
            if (i < i3) {
                i2 = this.A0A[(i * 5) + 2];
            } else {
                i2 = -1;
            }
            this.A05 = i2;
            if (i2 >= 0) {
                i3 = i2 + this.A0A[(i2 * 5) + 3];
            }
            this.A00 = i3;
            this.A02 = 0;
            this.A03 = 0;
            return;
        }
        AnonymousClass5XN.A03("Cannot reposition while in an empty region");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String toString() {
        int i;
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 < i3) {
            i = this.A0A[i2 * 5];
        } else {
            i = 0;
        }
        return 002.A0w("SlotReader(current=", ", key=", ", parent=", ", end=", ')', i2, i, this.A05, i3);
    }

    public AnonymousClass5X3(C286505Wq r3) {
        this.A09 = r3;
        this.A0A = r3.A08;
        int i = r3.A00;
        this.A08 = i;
        this.A0B = r3.A09;
        this.A0C = r3.A02;
        this.A00 = i;
    }
}
