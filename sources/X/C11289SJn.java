package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;

/* renamed from: X.SJn  reason: case insensitive filesystem */
public final class C11289SJn {
    public static final C11289SJn A05;
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02 = true;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.SJn] */
    static {
        ? obj = new Object();
        obj.A01 = -1;
        obj.A00 = 0;
        obj.A03 = new int[0];
        obj.A04 = new Object[0];
        obj.A02 = false;
        A05 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C11289SJn)) {
                C11289SJn sJn = (C11289SJn) obj;
                int i = this.A00;
                if (i == sJn.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = sJn.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = sJn.A04;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i;
        int i2;
        int i3;
        int i4 = this.A01;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A00; i6++) {
            int i7 = this.A03[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0R = AnonymousClass7TE.A0R(this.A04[i6]);
                i = SQE.A05(i8);
                i2 = CodedOutputStream.A01(A0R);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    boolean z = CodedOutputStream.A02;
                    i = SQE.A05(i8);
                    int A022 = ((TAP) this.A04[i6]).A02();
                    i2 = CodedOutputStream.A00(A022) + A022;
                } else if (i9 == 3) {
                    i = SQE.A05(i8) * 2;
                    i2 = ((C11289SJn) this.A04[i6]).A00();
                } else if (i9 == 5) {
                    i3 = SQE.A05(i8) + 4;
                } else {
                    throw new IllegalStateException(AnonymousClass5I7.A00());
                }
                i3 = i + i2;
            } else {
                i3 = SQE.A05(i8) + 8;
            }
            i5 += i3;
        }
        this.A01 = i5;
        return i5;
    }

    public final void A01(int i, Object obj) {
        if (this.A02) {
            int i2 = this.A00;
            int[] iArr = this.A03;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A03 = Arrays.copyOf(iArr, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
            }
            int[] iArr2 = this.A03;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A04[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw C66580MXl.A11();
    }

    public final void A02(C10281Rpf rpf) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    rpf.A00.A0C(i3, AnonymousClass7TE.A0R(obj));
                } else if (i4 == 1) {
                    rpf.A00.A0B(i3, AnonymousClass7TE.A0R(obj));
                } else if (i4 == 2) {
                    CodedOutputStream codedOutputStream = rpf.A00;
                    SQE.A08(codedOutputStream, i3);
                    codedOutputStream.A0H((TAP) obj);
                } else if (i4 == 3) {
                    CodedOutputStream codedOutputStream2 = rpf.A00;
                    int i5 = i3 << 3;
                    codedOutputStream2.A07(i5 | 3);
                    ((C11289SJn) obj).A02(rpf);
                    codedOutputStream2.A07(i5 | 4);
                } else if (i4 == 5) {
                    rpf.A00.A08(i3, AnonymousClass7TE.A0M(obj));
                } else {
                    throw C41845B3m.A0j(AnonymousClass5I7.A00());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int A012 = C66583MXo.A01(i);
        int[] iArr = this.A03;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (A012 + i2) * 31;
        Object[] objArr = this.A04;
        int i5 = 17;
        for (int i6 = 0; i6 < i; i6++) {
            i5 = AnonymousClass7TE.A0N(objArr[i6], i5 * 31);
        }
        return i4 + i5;
    }
}
