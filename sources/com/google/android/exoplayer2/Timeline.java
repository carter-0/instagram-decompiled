package com.google.android.exoplayer2;

import X.AnonymousClass4RE;
import X.AnonymousClass4S9;
import X.AnonymousClass4T8;
import X.AnonymousClass4TA;
import X.AnonymousClass5N6;
import X.C256703wD;
import X.C264744Rc;
import X.C264834Rm;
import android.util.Pair;
import java.util.Arrays;

public abstract class Timeline {
    public static final Timeline A00 = new C264834Rm();

    public final int A05(C264744Rc r5, AnonymousClass4RE r6, int i, int i2, boolean z) {
        int i3 = A0D(r5, i, false).A00;
        if (A0E(r6, i3, 0).A01 != i) {
            return i + 1;
        }
        int A04 = A04(i3, i2, z);
        if (A04 != -1) {
            return A0E(r6, A04, 0).A00;
        }
        return -1;
    }

    public abstract C264744Rc A0D(C264744Rc r1, int i, boolean z);

    public abstract AnonymousClass4RE A0E(AnonymousClass4RE r1, int i, long j);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r12 = (com.google.android.exoplayer2.Timeline) r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r5 = 1
            if (r11 == r12) goto L_0x0084
            boolean r0 = r12 instanceof com.google.android.exoplayer2.Timeline
            r4 = 0
            if (r0 == 0) goto L_0x0083
            com.google.android.exoplayer2.Timeline r12 = (com.google.android.exoplayer2.Timeline) r12
            int r0 = r12.A02()
            int r10 = r11.A02()
            if (r0 != r10) goto L_0x0083
            int r1 = r12.A01()
            int r0 = r11.A01()
            if (r1 != r0) goto L_0x0083
            X.4RE r9 = new X.4RE
            r9.<init>()
            X.4Rc r6 = new X.4Rc
            r6.<init>()
            X.4RE r8 = new X.4RE
            r8.<init>()
            X.4Rc r3 = new X.4Rc
            r3.<init>()
            r7 = 0
        L_0x0033:
            if (r7 >= r10) goto L_0x0048
            r0 = 0
            X.4RE r2 = r11.A0E(r9, r7, r0)
            X.4RE r0 = r12.A0E(r8, r7, r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0083
            int r7 = r7 + 1
            goto L_0x0033
        L_0x0048:
            r2 = 0
        L_0x0049:
            int r0 = r11.A01()
            if (r2 >= r0) goto L_0x0060
            X.4Rc r1 = r11.A0D(r6, r2, r5)
            X.4Rc r0 = r12.A0D(r3, r2, r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0083
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0060:
            int r3 = r11.A07(r5)
            int r0 = r12.A07(r5)
            if (r3 != r0) goto L_0x0083
            int r2 = r11.A08(r5)
            int r0 = r12.A08(r5)
            if (r2 == r0) goto L_0x0075
            return r4
        L_0x0075:
            if (r3 == r2) goto L_0x0084
            int r1 = r11.A04(r3, r4, r5)
            int r0 = r12.A04(r3, r4, r5)
            if (r1 != r0) goto L_0x0083
            r3 = r1
            goto L_0x0075
        L_0x0083:
            return r4
        L_0x0084:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Timeline.equals(java.lang.Object):boolean");
    }

    public int A01() {
        if (this instanceof AnonymousClass4S9) {
            return ((AnonymousClass4S9) this).A04.A0Q.size();
        }
        if (this instanceof AnonymousClass4TA) {
            return ((AnonymousClass4TA) this).A01;
        }
        if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A01();
        }
        return 0;
    }

    public int A02() {
        if (this instanceof AnonymousClass4S9) {
            return 1;
        }
        if (this instanceof C264834Rm) {
            return 0;
        }
        if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A02();
        }
        return ((AnonymousClass4TA) this).A02;
    }

    public final int A03(int i, int i2) {
        if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A03(i, i2);
        }
        if (this instanceof AnonymousClass4TA) {
            AnonymousClass4TA r8 = (AnonymousClass4TA) this;
            int i3 = 0;
            int[] iArr = r8.A06;
            int i4 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i4);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i4);
            }
            int i5 = iArr[binarySearch];
            Timeline[] timelineArr = r8.A07;
            Timeline timeline = timelineArr[binarySearch];
            int i6 = i - i5;
            if (i2 != 2) {
                i3 = i2;
            }
            int A03 = timeline.A03(i6, i3);
            if (A03 != -1) {
                return i5 + A03;
            }
            while (true) {
                if (binarySearch > 0) {
                    binarySearch--;
                    if (binarySearch == -1) {
                        break;
                    }
                    Timeline timeline2 = timelineArr[binarySearch];
                    if (timeline2.A02() != 0) {
                        if (binarySearch != -1) {
                            return iArr[binarySearch] + timeline2.A08(false);
                        }
                    }
                } else {
                    break;
                }
            }
            if (i2 == 2) {
                return r8.A08(false);
            }
            return -1;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i == A07(false)) {
                return A08(false);
            }
        } else if (i == A07(false)) {
            return -1;
        }
        return i - 1;
    }

    public final int A04(int i, int i2, boolean z) {
        if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A04(i, i2, z);
        }
        if (this instanceof AnonymousClass4TA) {
            AnonymousClass4TA r7 = (AnonymousClass4TA) this;
            int i3 = 0;
            int[] iArr = r7.A06;
            int i4 = i + 1;
            int binarySearch = Arrays.binarySearch(iArr, i4);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i4);
            }
            int i5 = iArr[binarySearch];
            Timeline[] timelineArr = r7.A07;
            Timeline timeline = timelineArr[binarySearch];
            int i6 = i - i5;
            if (i2 != 2) {
                i3 = i2;
            }
            int A04 = timeline.A04(i6, i3, z);
            if (A04 != -1) {
                return i5 + A04;
            }
            while (true) {
                binarySearch = AnonymousClass4TA.A00(r7, binarySearch, z);
                if (binarySearch == -1) {
                    break;
                }
                Timeline timeline2 = timelineArr[binarySearch];
                if (timeline2.A02() != 0) {
                    if (binarySearch != -1) {
                        return iArr[binarySearch] + timeline2.A07(z);
                    }
                }
            }
            if (i2 == 2) {
                return r7.A07(z);
            }
            return -1;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == A08(z)) {
                return A07(z);
            }
        } else if (i == A08(z)) {
            return -1;
        }
        return i + 1;
    }

    public int A06(Object obj) {
        int i;
        int intValue;
        int A06;
        int intValue2;
        if (this instanceof AnonymousClass4S9) {
            AnonymousClass4S9 r3 = (AnonymousClass4S9) this;
            i = -1;
            if (!(obj instanceof Integer) || (intValue2 = ((Number) obj).intValue() - r3.A00) < 0 || intValue2 >= r3.A01()) {
                return i;
            }
            return intValue2;
        } else if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A06(obj);
        } else {
            if (!(this instanceof AnonymousClass4TA)) {
                return -1;
            }
            AnonymousClass4TA r4 = (AnonymousClass4TA) this;
            i = -1;
            if (obj instanceof Pair) {
                Pair pair = (Pair) obj;
                Object obj2 = pair.first;
                Object obj3 = pair.second;
                Number number = (Number) r4.A04.get(obj2);
                if (!(number == null || (intValue = number.intValue()) == -1 || (A06 = r4.A07[intValue].A06(obj3)) == -1)) {
                    return r4.A05[intValue] + A06;
                }
            }
        }
        return i;
    }

    public final int A07(boolean z) {
        if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A07(z);
        }
        if (this instanceof AnonymousClass4TA) {
            AnonymousClass4TA r4 = (AnonymousClass4TA) this;
            if (r4.A00 == 0) {
                return -1;
            }
            int i = 0;
            if (z) {
                int[] iArr = ((AnonymousClass5N6) r4.A03).A02;
                if (iArr.length > 0) {
                    i = iArr[0];
                } else {
                    i = -1;
                }
            }
            do {
                Timeline timeline = r4.A07[i];
                if (timeline.A02() != 0) {
                    return r4.A06[i] + timeline.A07(z);
                }
                i = AnonymousClass4TA.A00(r4, i, z);
            } while (i != -1);
            return -1;
        } else if (A02() != 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public final int A08(boolean z) {
        int i;
        int i2;
        if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A08(z);
        }
        if (this instanceof AnonymousClass4TA) {
            AnonymousClass4TA r4 = (AnonymousClass4TA) this;
            int i3 = r4.A00;
            if (i3 == 0) {
                return -1;
            }
            if (z) {
                int[] iArr = ((AnonymousClass5N6) r4.A03).A02;
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
                Timeline timeline = r4.A07[i];
                if (timeline.A02() != 0) {
                    return r4.A06[i] + timeline.A08(z);
                }
                if (z) {
                    AnonymousClass5N6 r3 = (AnonymousClass5N6) r4.A03;
                    int i4 = r3.A01[i] - 1;
                    if (i4 < 0) {
                        return -1;
                    }
                    i2 = r3.A02[i4];
                    continue;
                } else if (i <= 0) {
                    return -1;
                } else {
                    i2 = i - 1;
                    continue;
                }
            } while (i != -1);
            return -1;
        } else if (A02() == 0) {
            return -1;
        } else {
            return A02() - 1;
        }
    }

    public final Pair A09(C264744Rc r9, AnonymousClass4RE r10, int i, long j) {
        Pair A0A = A0A(r9, r10, i, j, 0);
        A0A.getClass();
        return A0A;
    }

    public final C264744Rc A0B(C264744Rc r6, Object obj) {
        int intValue;
        if (!(this instanceof AnonymousClass4TA)) {
            return A0D(r6, A06(obj), true);
        }
        AnonymousClass4TA r4 = (AnonymousClass4TA) this;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Number number = (Number) r4.A04.get(obj2);
        if (number == null) {
            intValue = -1;
        } else {
            intValue = number.intValue();
        }
        int i = r4.A06[intValue];
        r4.A07[intValue].A0B(r6, obj3);
        r6.A00 += i;
        r6.A05 = obj;
        return r6;
    }

    public Object A0C(int i) {
        if (this instanceof AnonymousClass4S9) {
            AnonymousClass4S9 r1 = (AnonymousClass4S9) this;
            C256703wD.A00(i, r1.A01());
            return Integer.valueOf(r1.A00 + i);
        } else if (this instanceof AnonymousClass4T8) {
            return ((AnonymousClass4T8) this).A00.A0C(i);
        } else {
            if (this instanceof C264834Rm) {
                throw new IndexOutOfBoundsException();
            }
            AnonymousClass4TA r4 = (AnonymousClass4TA) this;
            int[] iArr = r4.A05;
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
            return Pair.create(r4.A08[binarySearch], r4.A07[binarySearch].A0C(i - iArr[binarySearch]));
        }
    }

    public final int hashCode() {
        int i;
        AnonymousClass4RE r7 = new AnonymousClass4RE();
        C264744Rc r6 = new C264744Rc();
        int A02 = A02();
        int i2 = 217 + A02;
        int i3 = 0;
        while (true) {
            i = i2 * 31;
            if (i3 >= A02) {
                break;
            }
            i2 = i + A0E(r7, i3, 0).hashCode();
            i3++;
        }
        int A01 = i + A01();
        for (int i4 = 0; i4 < A01(); i4++) {
            A01 = (A01 * 31) + A0D(r6, i4, true).hashCode();
        }
        int A07 = A07(true);
        while (A07 != -1) {
            A01 = (A01 * 31) + A07;
            A07 = A04(A07, 0, true);
        }
        return A01;
    }

    public final Pair A0A(C264744Rc r9, AnonymousClass4RE r10, int i, long j, long j2) {
        C256703wD.A00(i, A02());
        A0E(r10, i, j2);
        if (j == -9223372036854775807L) {
            j = r10.A02;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = r10.A00;
        A0D(r9, i2, false);
        while (i2 < r10.A01 && r9.A02 != j) {
            int i3 = i2 + 1;
            if (A0D(r9, i3, false).A02 > j) {
                break;
            }
            i2 = i3;
        }
        A0D(r9, i2, true);
        long j3 = j - r9.A02;
        long j4 = r9.A01;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0, j3);
        Object obj = r9.A05;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }
}
