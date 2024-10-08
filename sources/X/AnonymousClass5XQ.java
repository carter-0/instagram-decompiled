package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5XQ  reason: invalid class name */
public final class AnonymousClass5XQ {
    public int A00;
    public final int A01;
    public final 0yC A02;
    public final List A03;
    public final List A04;
    public final AnonymousClass0eM A05;

    public final boolean A00(int i, int i2) {
        int i3;
        0yC r1 = this.A02;
        AnonymousClass5XV r10 = (AnonymousClass5XV) r1.A03(i);
        if (r10 == null) {
            return false;
        }
        int i4 = r10.A01;
        int i5 = i2 - r10.A00;
        r10.A00 = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = r1.A04;
        long[] jArr = r1.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                int i7 = 8 - (((i6 - length) ^ -1) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        AnonymousClass5XV r12 = (AnonymousClass5XV) objArr[(i6 << 3) + i8];
                        if (r12.A01 >= i4 && !r12.equals(r10) && (i3 = r12.A01 + i5) >= 0) {
                            r12.A01 = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.5XV, java.lang.Object] */
    public AnonymousClass5XQ(List list, int i) {
        this.A03 = list;
        this.A01 = i;
        if (i >= 0) {
            this.A04 = new ArrayList();
            0yC r5 = new 0yC(6);
            int size = this.A03.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass5XS r0 = (AnonymousClass5XS) this.A03.get(i3);
                int i4 = r0.A01;
                int i5 = r0.A02;
                ? obj = new Object();
                obj.A02 = i3;
                obj.A01 = i2;
                obj.A00 = i5;
                r5.A08(i4, obj);
                i2 += i5;
            }
            this.A02 = r5;
            this.A05 = AnonymousClass0eN.A01(new AnonymousClass9L8(this, 17));
            return;
        }
        C18086VlG.A00("Invalid start index");
        throw AnonymousClass00P.createAndThrow();
    }
}
