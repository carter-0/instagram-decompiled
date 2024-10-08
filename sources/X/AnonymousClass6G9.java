package X;

import java.util.Arrays;

/* renamed from: X.6G9  reason: invalid class name */
public final class AnonymousClass6G9 {
    public static final AnonymousClass6G9 A04 = new AnonymousClass6G9((AnonymousClass6GA) null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final AnonymousClass6GA A03;

    private final AnonymousClass6G9 A02(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass6GA r14, int i, int i2, int i3) {
        if (i3 > 30) {
            return new AnonymousClass6G9(r14, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            Object[] objArr = new Object[4];
            if (i4 < i5) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new AnonymousClass6G9(r14, objArr, (1 << i4) | (1 << i5), 0);
        }
        return new AnonymousClass6G9(r14, new Object[]{A02(obj, obj2, obj3, obj4, r14, i, i2, i3 + 5)}, 0, 1 << i4);
    }

    private final AnonymousClass6G9 A06(AnonymousClass6G9 r5, AnonymousClass6GA r6, int i) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1 && r5.A02.length == 2 && r5.A01 == 0) {
            r5.A00 = this.A01;
            return r5;
        } else if (this.A03 == r6) {
            objArr[i] = r5;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, length);
            0qQ.A07(copyOf);
            copyOf[i] = r5;
            return new AnonymousClass6G9(r6, copyOf, this.A00, this.A01);
        }
    }

    private final boolean A07(AnonymousClass6G9 r8) {
        if (this != r8) {
            if (this.A01 == r8.A01 && this.A00 == r8.A00) {
                Object[] objArr = this.A02;
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    if (objArr[i] == r8.A02[i]) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0G(X.0sL r10, X.AnonymousClass6G9 r11) {
        /*
            r9 = this;
            r8 = 0
            X.0qQ.A0B(r11, r8)
            r7 = 1
            X.0qQ.A0B(r10, r7)
            r5 = 1
            if (r9 == r11) goto L_0x00c9
            int r3 = r9.A00
            int r0 = r11.A00
            if (r3 != r0) goto L_0x00c8
            int r1 = r9.A01
            int r0 = r11.A01
            if (r1 != r0) goto L_0x00c8
            r2 = 2
            if (r3 != 0) goto L_0x006e
            if (r1 != 0) goto L_0x006e
            java.lang.Object[] r0 = r9.A02
            int r1 = r0.length
            java.lang.Object[] r0 = r11.A02
            int r0 = r0.length
            if (r1 != r0) goto L_0x00c8
            X.2HY r0 = X.C229632nm.A0C(r8, r1)
            X.2HZ r1 = X.C229632nm.A0B(r0, r2)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x003a
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            return r5
        L_0x003a:
            java.util.Iterator r4 = r1.iterator()
        L_0x003e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0039
            r0 = r4
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            java.lang.Object[] r2 = r11.A02
            r1 = r2[r0]
            int r0 = r0 + 1
            r3 = r2[r0]
            int r2 = r9.A01(r1)
            r0 = -1
            if (r2 == r0) goto L_0x006c
            java.lang.Object[] r1 = r9.A02
            int r0 = r2 + 1
            r0 = r1[r0]
            java.lang.Object r0 = r10.invoke(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003e
        L_0x006c:
            r5 = 0
            return r5
        L_0x006e:
            int r0 = java.lang.Integer.bitCount(r3)
            int r6 = r0 * 2
            X.2HY r0 = X.C229632nm.A0C(r8, r6)
            X.2HZ r0 = X.C229632nm.A0B(r0, r2)
            int r5 = r0.A00
            int r4 = r0.A01
            int r3 = r0.A02
            if (r3 <= 0) goto L_0x009c
            if (r5 <= r4) goto L_0x00a0
        L_0x0086:
            java.lang.Object[] r0 = r9.A02
            int r2 = r0.length
        L_0x0089:
            if (r6 >= r2) goto L_0x00c9
            X.6G9 r1 = r9.A0A(r6)
            X.6G9 r0 = r11.A0A(r6)
            boolean r0 = r1.A0G(r10, r0)
            if (r0 == 0) goto L_0x00c8
            int r6 = r6 + 1
            goto L_0x0089
        L_0x009c:
            if (r3 >= 0) goto L_0x0086
            if (r4 > r5) goto L_0x0086
        L_0x00a0:
            java.lang.Object[] r0 = r9.A02
            r1 = r0[r5]
            java.lang.Object[] r0 = r11.A02
            r0 = r0[r5]
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object[] r0 = r9.A02
            int r2 = r5 + 1
            r1 = r0[r2]
            java.lang.Object[] r0 = r11.A02
            r0 = r0[r2]
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c8
            if (r5 == r4) goto L_0x0086
            int r5 = r5 + r3
            goto L_0x00a0
        L_0x00c8:
            return r8
        L_0x00c9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6G9.A0G(X.0sL, X.6G9):boolean");
    }

    private final int A00() {
        if (this.A01 == 0) {
            return this.A02.length / 2;
        }
        int bitCount = Integer.bitCount(this.A00);
        int length = this.A02.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += A0A(i).A00();
        }
        return bitCount;
    }

    private final int A01(Object obj) {
        2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, this.A02.length), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? i3 >= 0 || i2 > i : i > i2) {
            return -1;
        }
        while (!0qQ.A0K(obj, this.A02[i])) {
            int i4 = i;
            i += i3;
            if (i4 == i2) {
                return -1;
            }
        }
        return i;
    }

    private final AnonymousClass6G9 A05(AnonymousClass6G9 r6, AnonymousClass6G9 r7, AnonymousClass6GA r8, int i, int i2) {
        if (r7 == null) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (length == 1) {
                return null;
            }
            AnonymousClass6GA r1 = this.A03;
            Object[] objArr2 = new Object[(length - 1)];
            0Yw.A0V(objArr, objArr2, 0, 0, i);
            0Yw.A0V(objArr, objArr2, i, i + 1, length);
            if (r1 != r8) {
                return new AnonymousClass6G9(r8, objArr2, this.A00, i2 ^ this.A01);
            }
            this.A02 = objArr2;
            this.A01 ^= i2;
        } else if (r6 != r7) {
            return A06(r7, r8, i);
        }
        return this;
    }

    public final int A08(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final Object A09(int i, Object obj, int i2) {
        int A012;
        Object[] objArr;
        int i3 = 1 << ((i >> i2) & 31);
        int i4 = this.A00;
        boolean z = false;
        if ((i3 & i4) != 0) {
            z = true;
        }
        if (z) {
            A012 = Integer.bitCount((i3 - 1) & i4) * 2;
            if (!0qQ.A0K(obj, this.A02[A012])) {
                return null;
            }
            objArr = this.A02;
        } else if ((this.A01 & i3) == 0) {
            return null;
        } else {
            AnonymousClass6G9 A0A = A0A(A08(i3));
            if (i2 != 30) {
                return A0A.A09(i, obj, i2 + 5);
            }
            A012 = A0A.A01(obj);
            if (A012 == -1) {
                return null;
            }
            objArr = A0A.A02;
        }
        return objArr[A012 + 1];
    }

    public final AnonymousClass6G9 A0A(int i) {
        Object obj = this.A02[i];
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (AnonymousClass6G9) obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractMap, X.XDx] */
    public final AnonymousClass6G9 A0B(Object obj, Object obj2, C21084XDx xDx, int i, int i2) {
        AnonymousClass6G9 A0B;
        Object[] objArr;
        int i3;
        int i4 = i;
        int i5 = i2;
        int i6 = 1 << ((i >> i2) & 31);
        int i7 = this.A00;
        Object obj3 = obj;
        Object obj4 = obj2;
        ? r6 = xDx;
        if ((i6 & i7) != 0) {
            int bitCount = Integer.bitCount((i6 - 1) & i7) * 2;
            if (0qQ.A0K(obj3, this.A02[bitCount])) {
                Object[] objArr2 = this.A02;
                int i8 = bitCount + 1;
                Object obj5 = objArr2[i8];
                r6.A02 = obj5;
                if (obj5 != obj4) {
                    if (this.A03 == r6.A05) {
                        objArr2[i8] = obj2;
                        return this;
                    }
                    r6.A00++;
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    0qQ.A07(copyOf);
                    copyOf[i8] = obj2;
                    return new AnonymousClass6G9(r6.A05, copyOf, this.A00, this.A01);
                }
            } else {
                r6.A05(r6.size() + 1);
                AnonymousClass6GA r15 = r6.A05;
                AnonymousClass6GA r3 = this.A03;
                Object obj6 = this.A02[bitCount];
                if (obj6 != null) {
                    i3 = obj6.hashCode();
                } else {
                    i3 = 0;
                }
                Object A022 = A02(obj6, this.A02[bitCount + 1], obj3, obj4, r15, i3, i4, i2 + 5);
                int A08 = A08(i6) + 1;
                Object[] objArr3 = this.A02;
                int i9 = A08 - 2;
                int length = objArr3.length;
                Object[] objArr4 = new Object[((length - 2) + 1)];
                0Yw.A0V(objArr3, objArr4, 0, 0, bitCount);
                0Yw.A0V(objArr3, objArr4, bitCount, bitCount + 2, A08);
                objArr4[i9] = A022;
                0Yw.A0V(objArr3, objArr4, i9 + 1, A08, length);
                if (r3 != r15) {
                    return new AnonymousClass6G9(r15, objArr4, this.A00 ^ i6, i6 | this.A01);
                }
                this.A02 = objArr4;
                this.A00 ^= i6;
                this.A01 |= i6;
                return this;
            }
        } else if ((this.A01 & i6) != 0) {
            int A082 = A08(i6);
            AnonymousClass6G9 A0A = A0A(A082);
            if (i5 == 30) {
                int A012 = A0A.A01(obj3);
                if (A012 != -1) {
                    Object[] objArr5 = A0A.A02;
                    int i10 = A012 + 1;
                    r6.A02 = objArr5[i10];
                    if (A0A.A03 == r6.A05) {
                        objArr5[i10] = obj2;
                        A0B = A0A;
                    } else {
                        r6.A00++;
                        objArr = Arrays.copyOf(objArr5, objArr5.length);
                        0qQ.A07(objArr);
                        objArr[i10] = obj2;
                    }
                } else {
                    r6.A05(r6.size() + 1);
                    Object[] objArr6 = A0A.A02;
                    int length2 = objArr6.length;
                    objArr = new Object[(length2 + 2)];
                    0Yw.A0V(objArr6, objArr, 0, 0, 0);
                    0Yw.A0V(objArr6, objArr, 2, 0, length2);
                    objArr[0] = obj;
                    objArr[1] = obj2;
                }
                A0B = new AnonymousClass6G9(r6.A05, objArr, 0, 0);
            } else {
                A0B = A0A.A0B(obj3, obj4, r6, i4, i2 + 5);
            }
            if (A0A != A0B) {
                return A06(A0B, r6.A05, A082);
            }
        } else {
            r6.A05(r6.size() + 1);
            AnonymousClass6GA r62 = r6.A05;
            int bitCount2 = Integer.bitCount((i6 - 1) & this.A00) * 2;
            AnonymousClass6GA r1 = this.A03;
            Object[] objArr7 = this.A02;
            int length3 = objArr7.length;
            int i11 = length3 + 2;
            if (r1 == r62) {
                Object[] objArr8 = new Object[i11];
                0Yw.A0V(objArr7, objArr8, 0, 0, bitCount2);
                0Yw.A0V(objArr7, objArr8, bitCount2 + 2, bitCount2, length3);
                objArr8[bitCount2] = obj;
                objArr8[bitCount2 + 1] = obj2;
                this.A02 = objArr8;
                this.A00 = i6 | this.A00;
                return this;
            }
            Object[] objArr9 = new Object[i11];
            0Yw.A0V(objArr7, objArr9, 0, 0, bitCount2);
            0Yw.A0V(objArr7, objArr9, bitCount2 + 2, bitCount2, length3);
            objArr9[bitCount2] = obj;
            objArr9[bitCount2 + 1] = obj2;
            return new AnonymousClass6G9(r62, objArr9, i6 | this.A00, this.A01);
        }
        return this;
    }

    public final AnonymousClass6G9 A0C(Object obj, Object obj2, C21084XDx xDx, int i, int i2) {
        AnonymousClass6G9 A0C;
        int i3 = i;
        int i4 = i2;
        int i5 = 1 << ((i >> i2) & 31);
        int i6 = this.A00;
        Object obj3 = obj;
        Object obj4 = obj2;
        C21084XDx xDx2 = xDx;
        if ((i5 & i6) != 0) {
            int bitCount = Integer.bitCount((i5 - 1) & i6) * 2;
            if (0qQ.A0K(obj3, this.A02[bitCount]) && 0qQ.A0K(obj4, this.A02[bitCount + 1])) {
                return A04(xDx2, bitCount, i5);
            }
        } else if ((this.A01 & i5) != 0) {
            int A08 = A08(i5);
            AnonymousClass6G9 A0A = A0A(A08);
            if (i4 == 30) {
                int A012 = A0A.A01(obj3);
                if (A012 == -1 || !0qQ.A0K(obj4, A0A.A02[A012 + 1])) {
                    A0C = A0A;
                } else {
                    A0C = A0A.A03(xDx2, A012);
                }
            } else {
                A0C = A0A.A0C(obj3, obj4, xDx2, i3, i2 + 5);
            }
            return A05(A0A, A0C, xDx2.A05, A08, i5);
        }
        return this;
    }

    public final AnonymousClass6G9 A0D(Object obj, C21084XDx xDx, int i, int i2) {
        AnonymousClass6G9 A0D;
        int i3 = 1 << ((i >> i2) & 31);
        int i4 = this.A00;
        if ((i3 & i4) != 0) {
            int bitCount = Integer.bitCount((i3 - 1) & i4) * 2;
            if (0qQ.A0K(obj, this.A02[bitCount])) {
                return A04(xDx, bitCount, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A08 = A08(i3);
            AnonymousClass6G9 A0A = A0A(A08);
            if (i2 == 30) {
                int A012 = A0A.A01(obj);
                if (A012 != -1) {
                    A0D = A0A.A03(xDx, A012);
                } else {
                    A0D = A0A;
                }
            } else {
                A0D = A0A.A0D(obj, xDx, i, i2 + 5);
            }
            return A05(A0A, A0D, xDx.A05, A08, i3);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.util.AbstractMap, X.XDx] */
    public final AnonymousClass6G9 A0E(C21084XDx xDx, AnonymousClass6G9 r31, C21497Xcx xcx, int i) {
        AnonymousClass6G9 r6;
        AnonymousClass6G9 r9;
        int i2;
        int i3;
        int i4;
        AnonymousClass6G9 r2 = r31;
        0qQ.A0B(r2, 0);
        C21497Xcx xcx2 = xcx;
        if (this == r2) {
            xcx2.A00 += A00();
            return this;
        }
        ? r10 = xDx;
        if (i > 30) {
            AnonymousClass6GA r12 = r10.A05;
            Object[] objArr = this.A02;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + r2.A02.length);
            0qQ.A07(copyOf);
            int length = this.A02.length;
            2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, r2.A02.length), 2);
            int i5 = A0B.A00;
            int i6 = A0B.A01;
            int i7 = A0B.A02;
            if (i7 <= 0 ? !(i7 >= 0 || i6 > i5) : i5 <= i6) {
                while (true) {
                    if (A01(r2.A02[i5]) != -1) {
                        xcx2.A00++;
                    } else {
                        Object[] objArr2 = r2.A02;
                        copyOf[length] = objArr2[i5];
                        copyOf[length + 1] = objArr2[i5 + 1];
                        length += 2;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length == this.A02.length) {
                return this;
            }
            if (length == r2.A02.length) {
                return r2;
            }
            if (length == copyOf.length) {
                return new AnonymousClass6G9(r12, copyOf, 0, 0);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            0qQ.A07(copyOf2);
            return new AnonymousClass6G9(r12, copyOf2, 0, 0);
        }
        int i8 = this.A01 | r2.A01;
        int i9 = this.A00;
        int i10 = r2.A00;
        int i11 = (i9 ^ i10) & (i8 ^ -1);
        int i12 = i9 & i10;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            int i13 = lowestOneBit - 1;
            if (0qQ.A0K(this.A02[Integer.bitCount(this.A00 & i13) * 2], r2.A02[Integer.bitCount(i13 & r2.A00) * 2])) {
                i11 |= lowestOneBit;
            } else {
                i8 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        int i14 = 0;
        if ((i8 & i11) == 0) {
            if (0qQ.A0K(this.A03, r10.A05) && this.A00 == i11 && this.A01 == i8) {
                r6 = this;
            } else {
                r6 = new AnonymousClass6G9((AnonymousClass6GA) null, new Object[((Integer.bitCount(i11) * 2) + Integer.bitCount(i8))], i11, i8);
            }
            int i15 = 0;
            while (i8 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i8);
                Object[] objArr3 = r6.A02;
                int length2 = (objArr3.length - 1) - i15;
                boolean z = false;
                if ((lowestOneBit2 & this.A01) != 0) {
                    z = true;
                }
                int i16 = 0;
                if (z) {
                    r9 = A0A(A08(lowestOneBit2));
                    if ((r2.A01 & lowestOneBit2) != 0) {
                        r9 = r9.A0E(r10, r2.A0A(r2.A08(lowestOneBit2)), xcx2, i + 5);
                    } else {
                        int i17 = r2.A00;
                        if ((lowestOneBit2 & i17) != 0) {
                            int bitCount = Integer.bitCount((lowestOneBit2 - 1) & i17) * 2;
                            Object[] objArr4 = r2.A02;
                            Object obj = objArr4[bitCount];
                            Object obj2 = objArr4[bitCount + 1];
                            int size = r10.size();
                            if (obj != null) {
                                i16 = obj.hashCode();
                            }
                            r9 = r9.A0B(obj, obj2, r10, i16, i + 5);
                            if (r10.size() != size) {
                            }
                            xcx2.A00++;
                        }
                    }
                } else if ((r2.A01 & lowestOneBit2) != 0) {
                    r9 = r2.A0A(r2.A08(lowestOneBit2));
                    int i18 = this.A00;
                    if ((lowestOneBit2 & i18) != 0) {
                        int bitCount2 = Integer.bitCount((lowestOneBit2 - 1) & i18) * 2;
                        Object obj3 = this.A02[bitCount2];
                        if (obj3 != null) {
                            i3 = obj3.hashCode();
                        } else {
                            i3 = 0;
                        }
                        int i19 = i + 5;
                        if (!r9.A0F(obj3, i3, i19)) {
                            Object obj4 = this.A02[bitCount2 + 1];
                            if (obj3 != null) {
                                i4 = obj3.hashCode();
                            } else {
                                i4 = 0;
                            }
                            r9 = r9.A0B(obj3, obj4, r10, i4, i19);
                        }
                        xcx2.A00++;
                    }
                } else {
                    int i20 = lowestOneBit2 - 1;
                    int bitCount3 = Integer.bitCount(this.A00 & i20) * 2;
                    Object[] objArr5 = this.A02;
                    Object obj5 = objArr5[bitCount3];
                    Object obj6 = objArr5[bitCount3 + 1];
                    int bitCount4 = Integer.bitCount(i20 & r2.A00) * 2;
                    Object[] objArr6 = r2.A02;
                    Object obj7 = objArr6[bitCount4];
                    Object obj8 = objArr6[bitCount4 + 1];
                    if (obj5 != null) {
                        i2 = obj5.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (obj7 != null) {
                        i16 = obj7.hashCode();
                    }
                    r9 = A02(obj5, obj6, obj7, obj8, r10.A05, i2, i16, i + 5);
                }
                objArr3[length2] = r9;
                i15++;
                i8 ^= lowestOneBit2;
            }
            while (i11 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i11);
                int i21 = i14 * 2;
                int i22 = r2.A00;
                if ((lowestOneBit3 & i22) != 0) {
                    int bitCount5 = Integer.bitCount((lowestOneBit3 - 1) & i22) * 2;
                    Object[] objArr7 = r6.A02;
                    Object[] objArr8 = r2.A02;
                    objArr7[i21] = objArr8[bitCount5];
                    objArr7[i21 + 1] = objArr8[bitCount5 + 1];
                    if ((this.A00 & lowestOneBit3) != 0) {
                        xcx2.A00++;
                    }
                } else {
                    int bitCount6 = Integer.bitCount((lowestOneBit3 - 1) & this.A00) * 2;
                    Object[] objArr9 = r6.A02;
                    Object[] objArr10 = this.A02;
                    objArr9[i21] = objArr10[bitCount6];
                    objArr9[i21 + 1] = objArr10[bitCount6 + 1];
                }
                i14++;
                i11 ^= lowestOneBit3;
            }
            if (A07(r6)) {
                return this;
            }
            if (r2.A07(r6)) {
                return r2;
            }
            return r6;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean A0F(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        int i4 = this.A00;
        if ((i3 & i4) != 0) {
            return 0qQ.A0K(obj, this.A02[Integer.bitCount((i3 - 1) & i4) * 2]);
        } else if ((this.A01 & i3) == 0) {
            return false;
        } else {
            AnonymousClass6G9 A0A = A0A(A08(i3));
            if (i2 != 30) {
                return A0A.A0F(obj, i, i2 + 5);
            }
            if (A0A.A01(obj) != -1) {
                return true;
            }
            return false;
        }
    }

    public AnonymousClass6G9(AnonymousClass6GA r1, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r1;
        this.A02 = objArr;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractMap, X.XDx] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass6G9 A03(X.C21084XDx r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.size()
            int r0 = r0 + -1
            r6.A05(r0)
            java.lang.Object[] r4 = r5.A02
            int r0 = r7 + 1
            r0 = r4[r0]
            r6.A02 = r0
            int r3 = r4.length
            r0 = 2
            if (r3 != r0) goto L_0x0017
            r3 = 0
            return r3
        L_0x0017:
            X.6GA r2 = r5.A03
            X.6GA r1 = r6.A05
            int r0 = r3 + -2
            if (r2 != r1) goto L_0x002d
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            X.0Yw.A0V(r4, r1, r0, r0, r7)
            int r0 = r7 + 2
            X.0Yw.A0V(r4, r1, r7, r0, r3)
            r5.A02 = r1
            return r5
        L_0x002d:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            X.0Yw.A0V(r4, r2, r0, r0, r7)
            int r0 = r7 + 2
            X.0Yw.A0V(r4, r2, r7, r0, r3)
            X.6GA r1 = r6.A05
            r0 = 0
            X.6G9 r3 = new X.6G9
            r3.<init>(r1, r2, r0, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6G9.A03(X.XDx, int):X.6G9");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.AbstractMap, X.XDx] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass6G9 A04(X.C21084XDx r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r6.size()
            int r0 = r0 + -1
            r6.A05(r0)
            java.lang.Object[] r4 = r5.A02
            int r0 = r7 + 1
            r0 = r4[r0]
            r6.A02 = r0
            int r3 = r4.length
            r0 = 2
            if (r3 != r0) goto L_0x0017
            r3 = 0
            return r3
        L_0x0017:
            X.6GA r2 = r5.A03
            X.6GA r1 = r6.A05
            int r0 = r3 + -2
            if (r2 != r1) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            X.0Yw.A0V(r4, r1, r0, r0, r7)
            int r0 = r7 + 2
            X.0Yw.A0V(r4, r1, r7, r0, r3)
            r5.A02 = r1
            int r0 = r5.A00
            r0 = r0 ^ r8
            r5.A00 = r0
            return r5
        L_0x0032:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            X.0Yw.A0V(r4, r2, r0, r0, r7)
            int r0 = r7 + 2
            X.0Yw.A0V(r4, r2, r7, r0, r3)
            int r0 = r5.A00
            r8 = r8 ^ r0
            int r1 = r5.A01
            X.6GA r0 = r6.A05
            X.6G9 r3 = new X.6G9
            r3.<init>(r0, r2, r8, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6G9.A04(X.XDx, int, int):X.6G9");
    }
}
