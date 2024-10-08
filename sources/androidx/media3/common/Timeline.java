package androidx.media3.common;

import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.C21133XGa;
import X.C21134XGb;
import X.C21142XGj;
import X.C22094XvK;
import X.SIQ;
import X.XGZ;
import X.XcO;
import android.util.Pair;
import java.util.Arrays;

public abstract class Timeline {
    public static final Timeline A00 = new XGZ();

    public abstract XcO A0B(XcO xcO, int i, boolean z);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r8 = (androidx.media3.common.Timeline) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x005f
            boolean r0 = r8 instanceof androidx.media3.common.Timeline
            r5 = 0
            if (r0 == 0) goto L_0x005e
            androidx.media3.common.Timeline r8 = (androidx.media3.common.Timeline) r8
            int r0 = r8.A02()
            int r4 = r7.A02()
            if (r0 != r4) goto L_0x005e
            int r0 = r8.A01()
            int r3 = r7.A01()
            if (r0 != r3) goto L_0x005e
            X.SIQ r2 = new X.SIQ
            r2.<init>()
            X.XcO r1 = new X.XcO
            r1.<init>()
            X.SJ0 r0 = X.SJ0.A02
            if (r5 >= r4) goto L_0x0034
            r7.A0A(r2, r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0034:
            if (r5 >= r3) goto L_0x003b
            r7.A0B(r1, r5, r6)
            r0 = 0
            throw r0
        L_0x003b:
            int r3 = r7.A06(r6)
            int r0 = r8.A06(r6)
            if (r3 != r0) goto L_0x005e
            int r2 = r7.A07(r6)
            int r0 = r8.A07(r6)
            if (r2 == r0) goto L_0x0050
            return r5
        L_0x0050:
            if (r3 == r2) goto L_0x005f
            int r1 = r7.A04(r3, r6)
            int r0 = r8.A04(r3, r6)
            if (r1 != r0) goto L_0x005e
            r3 = r1
            goto L_0x0050
        L_0x005e:
            return r5
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.Timeline.equals(java.lang.Object):boolean");
    }

    public final int A01() {
        if (this instanceof C21133XGa) {
            return ((C21133XGa) this).A00.A01();
        }
        if (this instanceof C21142XGj) {
            return ((C21142XGj) this).A00;
        }
        return 0;
    }

    public final int A02() {
        if (this instanceof C21133XGa) {
            return ((C21133XGa) this).A00.A02();
        }
        if (this instanceof C21142XGj) {
            return ((C21142XGj) this).A01;
        }
        return 0;
    }

    public final int A03(int i) {
        if (this instanceof C21133XGa) {
            return ((C21133XGa) this).A00.A03(i);
        }
        if (this instanceof C21134XGb) {
            C21142XGj xGj = (C21142XGj) ((C21134XGb) this);
            int[] iArr = xGj.A04;
            int i2 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i2);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i2);
            }
            int i3 = iArr[binarySearch];
            Timeline[] timelineArr = xGj.A05;
            int A03 = timelineArr[binarySearch].A03(i - i3);
            if (A03 != -1) {
                return i3 + A03;
            }
            while (binarySearch > 0) {
                binarySearch--;
                if (binarySearch == -1) {
                    return -1;
                }
                Timeline timeline = timelineArr[binarySearch];
                if (!AnonymousClass7TF.A1Q(timeline.A02())) {
                    if (binarySearch != -1) {
                        return iArr[binarySearch] + timeline.A07(false);
                    }
                    return -1;
                }
            }
            return -1;
        }
        int i4 = i - 1;
        if (i == A06(false)) {
            return -1;
        }
        return i4;
    }

    public final int A04(int i, boolean z) {
        Timeline timeline;
        if (this instanceof C21133XGa) {
            return ((C21133XGa) this).A00.A04(i, z);
        }
        if (this instanceof C21134XGb) {
            C21134XGb xGb = (C21134XGb) this;
            C21142XGj xGj = (C21142XGj) xGb;
            int[] iArr = xGj.A04;
            int i2 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i2);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i2);
            }
            int i3 = iArr[binarySearch];
            Timeline[] timelineArr = xGj.A05;
            int A04 = timelineArr[binarySearch].A04(i - i3, z);
            if (A04 != -1) {
                return i3 + A04;
            }
            do {
                binarySearch = C21134XGb.A00(xGb, binarySearch, z);
                if (binarySearch == -1) {
                    return -1;
                }
                timeline = timelineArr[binarySearch];
            } while (AnonymousClass7TF.A1Q(timeline.A02()));
            if (binarySearch != -1) {
                return iArr[binarySearch] + timeline.A06(z);
            }
            return -1;
        } else if (i == A07(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final int A05(Object obj) {
        int intValue;
        int A05;
        if (this instanceof C21133XGa) {
            return ((C21133XGa) this).A00.A05(obj);
        }
        if (!(this instanceof C21134XGb)) {
            return -1;
        }
        C21134XGb xGb = (C21134XGb) this;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C21142XGj xGj = (C21142XGj) xGb;
        Number number = (Number) xGj.A02.get(obj2);
        if (number == null || (intValue = number.intValue()) == -1 || (A05 = xGj.A05[intValue].A05(obj3)) == -1) {
            return -1;
        }
        return xGj.A03[intValue] + A05;
    }

    public final int A06(boolean z) {
        if (this instanceof C21133XGa) {
            return ((C21133XGa) this).A00.A06(z);
        }
        if (this instanceof C21134XGb) {
            C21134XGb xGb = (C21134XGb) this;
            if (xGb.A00 == 0) {
                return -1;
            }
            int i = 0;
            if (z) {
                int[] iArr = ((C22094XvK) xGb.A01).A02;
                if (iArr.length > 0) {
                    i = iArr[0];
                } else {
                    i = -1;
                }
            }
            do {
                C21142XGj xGj = (C21142XGj) xGb;
                Timeline timeline = xGj.A05[i];
                if (!AnonymousClass7TF.A1Q(timeline.A02())) {
                    return xGj.A04[i] + timeline.A06(z);
                }
                i = C21134XGb.A00(xGb, i, z);
            } while (i != -1);
            return -1;
        } else if (AnonymousClass7TF.A1Q(A02())) {
            return -1;
        } else {
            return 0;
        }
    }

    public final int A07(boolean z) {
        int i;
        int i2;
        if (this instanceof C21133XGa) {
            return ((C21133XGa) this).A00.A07(z);
        }
        if (this instanceof C21134XGb) {
            C21134XGb xGb = (C21134XGb) this;
            int i3 = xGb.A00;
            if (i3 == 0) {
                return -1;
            }
            if (z) {
                int[] iArr = ((C22094XvK) xGb.A01).A02;
                int length = iArr.length;
                if (length > 0) {
                    i = iArr[length - 1];
                } else {
                    i = -1;
                }
            } else {
                i = i3 - 1;
            }
            do {
                C21142XGj xGj = (C21142XGj) xGb;
                Timeline timeline = xGj.A05[i];
                if (!AnonymousClass7TF.A1Q(timeline.A02())) {
                    return xGj.A04[i] + timeline.A07(z);
                }
                if (z) {
                    C22094XvK xvK = (C22094XvK) xGb.A01;
                    int i4 = xvK.A01[i] - 1;
                    if (i4 < 0) {
                        return -1;
                    }
                    i2 = xvK.A02[i4];
                    continue;
                } else if (i <= 0) {
                    return -1;
                } else {
                    i2 = i - 1;
                    continue;
                }
            } while (i != -1);
            return -1;
        } else if (AnonymousClass7TF.A1Q(A02())) {
            return -1;
        } else {
            return A02() - 1;
        }
    }

    public final void A08(int i) {
        Timeline timeline;
        if (this instanceof C21133XGa) {
            timeline = ((C21133XGa) this).A00;
        } else if (this instanceof C21134XGb) {
            C21142XGj xGj = (C21142XGj) ((C21134XGb) this);
            int[] iArr = xGj.A03;
            int i2 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i2);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i2);
            }
            int i3 = iArr[binarySearch];
            timeline = xGj.A05[binarySearch];
            i -= i3;
        } else {
            throw new IndexOutOfBoundsException();
        }
        timeline.A08(i);
        throw null;
    }

    public final void A09(XcO xcO, Object obj) {
        int intValue;
        if (this instanceof C21134XGb) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            C21142XGj xGj = (C21142XGj) ((C21134XGb) this);
            Number number = (Number) xGj.A02.get(obj2);
            if (number == null) {
                intValue = -1;
            } else {
                intValue = number.intValue();
            }
            xGj.A05[intValue].A09(xcO, obj3);
        } else {
            A0B(xcO, A05(obj), true);
        }
        throw null;
    }

    public final void A0A(SIQ siq, int i) {
        Timeline timeline;
        if (this instanceof C21133XGa) {
            timeline = ((C21133XGa) this).A00;
        } else if (this instanceof C21134XGb) {
            C21142XGj xGj = (C21142XGj) ((C21134XGb) this);
            int[] iArr = xGj.A04;
            int i2 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i2);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i2);
            }
            int i3 = iArr[binarySearch];
            timeline = xGj.A05[binarySearch];
            i -= i3;
        } else {
            throw new IndexOutOfBoundsException();
        }
        timeline.A0A(siq, i);
        throw null;
    }

    public final int hashCode() {
        SIQ siq = new SIQ();
        XcO xcO = new XcO();
        int A02 = A02();
        int i = (217 + A02) * 31;
        if (0 < A02) {
            A0A(siq, 0);
            throw AnonymousClass00P.createAndThrow();
        }
        int A01 = A01();
        int i2 = i + A01;
        if (0 < A01) {
            A0B(xcO, 0, true);
            throw null;
        }
        int A06 = A06(true);
        while (A06 != -1) {
            i2 = (i2 * 31) + A06;
            A06 = A04(A06, true);
        }
        return i2;
    }
}
