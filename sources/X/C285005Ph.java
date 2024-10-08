package X;

import java.util.Arrays;

/* renamed from: X.5Ph  reason: invalid class name and case insensitive filesystem */
public final class C285005Ph {
    public static final C285005Ph A04 = new C285005Ph((C286865Yc) null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final C286865Yc A03;

    private final C285005Ph A06(C286865Yc r10, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        if (i3 > 30) {
            return new C285005Ph(r10, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
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
            return new C285005Ph(r10, objArr, (1 << i4) | (1 << i5), 0);
        }
        return new C285005Ph(r10, new Object[]{A06(r10, obj, obj2, obj3, obj4, i, i2, i3 + 5)}, 0, 1 << i4);
    }

    private final boolean A07(C285005Ph r8) {
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

    private final int A00() {
        if (this.A01 == 0) {
            return this.A02.length / 2;
        }
        int bitCount = Integer.bitCount(this.A00);
        int length = this.A02.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += A0D(i).A00();
        }
        return bitCount;
    }

    private final C285005Ph A03(C285005Ph r8, int i, int i2) {
        Object[] objArr = r8.A02;
        if (objArr.length == 2 && r8.A01 == 0) {
            Object[] objArr2 = this.A02;
            int length = objArr2.length;
            if (length == 1) {
                r8.A00 = this.A01;
                return r8;
            }
            int A0A = A0A(i2);
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, length + 1);
            0qQ.A07(copyOf);
            int i3 = i + 1;
            System.arraycopy(copyOf, i3, copyOf, i + 2, length - i3);
            System.arraycopy(copyOf, A0A, copyOf, A0A + 2, i - A0A);
            copyOf[A0A] = obj;
            copyOf[A0A + 1] = obj2;
            return new C285005Ph((C286865Yc) null, copyOf, this.A00 ^ i2, i2 ^ this.A01);
        }
        Object[] objArr3 = this.A02;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        0qQ.A07(copyOf2);
        copyOf2[i] = r8;
        return new C285005Ph((C286865Yc) null, copyOf2, this.A00, this.A01);
    }

    private final C285005Ph A04(C285005Ph r6, C285005Ph r7, C286865Yc r8, int i, int i2) {
        if (r7 == null) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (length == 1) {
                return null;
            }
            C286865Yc r1 = this.A03;
            Object[] objArr2 = new Object[(length - 1)];
            0Yw.A0V(objArr, objArr2, 0, 0, i);
            0Yw.A0V(objArr, objArr2, i, i + 1, length);
            if (r1 != r8) {
                return new C285005Ph(r8, objArr2, this.A00, i2 ^ this.A01);
            }
            this.A02 = objArr2;
            this.A01 ^= i2;
        } else if (this.A03 == r8 || r6 != r7) {
            return A05(r7, r8, i);
        }
        return this;
    }

    private final C285005Ph A05(C285005Ph r5, C286865Yc r6, int i) {
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
            return new C285005Ph(r6, copyOf, this.A00, this.A01);
        }
    }

    private final boolean A08(Object obj) {
        2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, this.A02.length), 2);
        int i = A0B.A00;
        int i2 = A0B.A01;
        int i3 = A0B.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (!0qQ.A0K(obj, this.A02[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final Object[] A09(C286865Yc r18, Object obj, Object obj2, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i;
        Object obj3 = this.A02[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        C285005Ph A06 = A06(r18, obj3, this.A02[i + 1], obj, obj2, i5, i3, i4 + 5);
        int A0B = A0B(i2) + 1;
        Object[] objArr = this.A02;
        int i7 = A0B - 2;
        int length = objArr.length;
        Object[] objArr2 = new Object[((length - 2) + 1)];
        0Yw.A0V(objArr, objArr2, 0, 0, i6);
        0Yw.A0V(objArr, objArr2, i6, i + 2, A0B);
        objArr2[i7] = A06;
        0Yw.A0V(objArr, objArr2, i7 + 1, A0B, length);
        return objArr2;
    }

    public final int A0A(int i) {
        return Integer.bitCount((i - 1) & this.A00) * 2;
    }

    public final int A0B(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final C285125Pv A0C(Object obj, Object obj2, int i, int i2) {
        C285005Ph r3;
        int i3;
        C285125Pv A0C;
        int i4 = i;
        int i5 = i2;
        int i6 = 1 << ((i >> i2) & 31);
        boolean z = false;
        if ((i6 & this.A00) != 0) {
            z = true;
        }
        Object obj3 = obj;
        Object obj4 = obj2;
        if (z) {
            int A0A = A0A(i6);
            if (0qQ.A0K(obj3, this.A02[A0A])) {
                Object[] objArr = this.A02;
                int i7 = A0A + 1;
                if (objArr[i7] != obj4) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    0qQ.A07(copyOf);
                    copyOf[i7] = obj2;
                    r3 = new C285005Ph((C286865Yc) null, copyOf, this.A00, this.A01);
                    i3 = 0;
                }
                return null;
            }
            r3 = new C285005Ph((C286865Yc) null, A09((C286865Yc) null, obj3, obj4, A0A, i6, i4, i5), this.A00 ^ i6, i6 | this.A01);
            i3 = 1;
        } else if ((this.A01 & i6) != 0) {
            int A0B = A0B(i6);
            C285005Ph A0D = A0D(A0B);
            if (i5 == 30) {
                2HZ A0B2 = C229632nm.A0B(C229632nm.A0C(0, A0D.A02.length), 2);
                int i8 = A0B2.A00;
                int i9 = A0B2.A01;
                int i10 = A0B2.A02;
                if (i10 <= 0 ? !(i10 >= 0 || i9 > i8) : i8 <= i9) {
                    while (true) {
                        if (!0qQ.A0K(obj3, A0D.A02[i8])) {
                            if (i8 == i9) {
                                break;
                            }
                            i8 += i10;
                        } else {
                            Object[] objArr2 = A0D.A02;
                            int i11 = i8 + 1;
                            if (obj4 != objArr2[i11]) {
                                Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                0qQ.A07(copyOf2);
                                copyOf2[i11] = obj2;
                                A0C = new C285125Pv(new C285005Ph((C286865Yc) null, copyOf2, 0, 0), 0);
                            }
                        }
                    }
                    return null;
                }
                A0C = new C285125Pv(new C285005Ph((C286865Yc) null, C285115Pu.A00(obj3, obj4, A0D.A02, 0), 0, 0), 1);
            } else {
                A0C = A0D.A0C(obj3, obj4, i4, i2 + 5);
                if (A0C == null) {
                    return null;
                }
            }
            A0C.A00 = A03(A0C.A00, A0B, i6);
            return A0C;
        } else {
            r3 = new C285005Ph((C286865Yc) null, C285115Pu.A00(obj3, obj4, this.A02, A0A(i6)), i6 | this.A00, this.A01);
            i3 = 1;
        }
        return new C285125Pv(r3, i3);
    }

    public final C285005Ph A0D(int i) {
        Object obj = this.A02[i];
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C285005Ph) obj;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.util.AbstractMap, X.5Ya] */
    public final C285005Ph A0E(C286845Ya r30, C285005Ph r31, C286875Yd r32, int i) {
        C285005Ph r6;
        C285005Ph r9;
        int i2;
        int i3;
        int i4;
        C286875Yd r5 = r32;
        C285005Ph r2 = r31;
        if (this == r2) {
            r5.A00 += A00();
            return this;
        }
        ? r10 = r30;
        if (i > 30) {
            C286865Yc r11 = r10.A02;
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
                    if (!A08(r2.A02[i5])) {
                        Object[] objArr2 = r2.A02;
                        copyOf[length] = objArr2[i5];
                        copyOf[length + 1] = objArr2[i5 + 1];
                        length += 2;
                    } else {
                        r5.A00++;
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
                return new C285005Ph(r11, copyOf, 0, 0);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            0qQ.A07(copyOf2);
            return new C285005Ph(r11, copyOf2, 0, 0);
        }
        int i8 = this.A01 | r2.A01;
        int i9 = this.A00;
        int i10 = r2.A00;
        int i11 = (i9 ^ i10) & (i8 ^ -1);
        int i12 = i9 & i10;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            if (0qQ.A0K(this.A02[A0A(lowestOneBit)], r2.A02[r2.A0A(lowestOneBit)])) {
                i11 |= lowestOneBit;
            } else {
                i8 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        int i13 = 0;
        if ((i8 & i11) == 0) {
            if (0qQ.A0K(this.A03, r10.A02) && this.A00 == i11 && this.A01 == i8) {
                r6 = this;
            } else {
                r6 = new C285005Ph((C286865Yc) null, new Object[((Integer.bitCount(i11) * 2) + Integer.bitCount(i8))], i11, i8);
            }
            int i14 = 0;
            while (i8 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i8);
                Object[] objArr3 = r6.A02;
                int length2 = (objArr3.length - 1) - i14;
                boolean z = false;
                if ((lowestOneBit2 & this.A01) != 0) {
                    z = true;
                }
                int i15 = 0;
                if (z) {
                    r9 = A0D(A0B(lowestOneBit2));
                    if ((r2.A01 & lowestOneBit2) != 0) {
                        r9 = r9.A0E(r10, r2.A0D(r2.A0B(lowestOneBit2)), r5, i + 5);
                    } else if ((r2.A00 & lowestOneBit2) != 0) {
                        int A0A = r2.A0A(lowestOneBit2);
                        Object[] objArr4 = r2.A02;
                        Object obj = objArr4[A0A];
                        Object obj2 = objArr4[A0A + 1];
                        int size = r10.size();
                        if (obj != null) {
                            i15 = obj.hashCode();
                        }
                        r9 = r9.A0G(r10, obj, obj2, i15, i + 5);
                        if (r10.size() != size) {
                        }
                        r5.A00++;
                    }
                } else if ((r2.A01 & lowestOneBit2) != 0) {
                    r9 = r2.A0D(r2.A0B(lowestOneBit2));
                    if ((this.A00 & lowestOneBit2) != 0) {
                        int A0A2 = A0A(lowestOneBit2);
                        Object obj3 = this.A02[A0A2];
                        if (obj3 != null) {
                            i3 = obj3.hashCode();
                        } else {
                            i3 = 0;
                        }
                        int i16 = i + 5;
                        if (!r9.A0K(obj3, i3, i16)) {
                            Object obj4 = this.A02[A0A2 + 1];
                            if (obj3 != null) {
                                i4 = obj3.hashCode();
                            } else {
                                i4 = 0;
                            }
                            r9 = r9.A0G(r10, obj3, obj4, i4, i16);
                        }
                        r5.A00++;
                    }
                } else {
                    int A0A3 = A0A(lowestOneBit2);
                    Object[] objArr5 = this.A02;
                    Object obj5 = objArr5[A0A3];
                    Object obj6 = objArr5[A0A3 + 1];
                    int A0A4 = r2.A0A(lowestOneBit2);
                    Object[] objArr6 = r2.A02;
                    Object obj7 = objArr6[A0A4];
                    Object obj8 = objArr6[A0A4 + 1];
                    if (obj5 != null) {
                        i2 = obj5.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (obj7 != null) {
                        i15 = obj7.hashCode();
                    }
                    r9 = A06(r10.A02, obj5, obj6, obj7, obj8, i2, i15, i + 5);
                }
                objArr3[length2] = r9;
                i14++;
                i8 ^= lowestOneBit2;
            }
            while (i11 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i11);
                int i17 = i13 * 2;
                if ((r2.A00 & lowestOneBit3) != 0) {
                    int A0A5 = r2.A0A(lowestOneBit3);
                    Object[] objArr7 = r6.A02;
                    Object[] objArr8 = r2.A02;
                    objArr7[i17] = objArr8[A0A5];
                    objArr7[i17 + 1] = objArr8[A0A5 + 1];
                    if ((this.A00 & lowestOneBit3) != 0) {
                        r5.A00++;
                    }
                } else {
                    int A0A6 = A0A(lowestOneBit3);
                    Object[] objArr9 = r6.A02;
                    Object[] objArr10 = this.A02;
                    objArr9[i17] = objArr10[A0A6];
                    objArr9[i17 + 1] = objArr10[A0A6 + 1];
                }
                i13++;
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
        C18086VlG.A01("Check failed.");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C285005Ph A0F(C286845Ya r11, Object obj, int i, int i2) {
        C285005Ph A0F;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int A0A = A0A(i3);
            if (0qQ.A0K(obj, this.A02[A0A])) {
                return A02(r11, A0A, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A0B = A0B(i3);
            C285005Ph A0D = A0D(A0B);
            if (i2 == 30) {
                2HZ A0B2 = C229632nm.A0B(C229632nm.A0C(0, A0D.A02.length), 2);
                int i4 = A0B2.A00;
                int i5 = A0B2.A01;
                int i6 = A0B2.A02;
                if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                    while (true) {
                        if (!0qQ.A0K(obj, A0D.A02[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            A0F = A0D.A01(r11, i4);
                            break;
                        }
                    }
                }
                A0F = A0D;
            } else {
                A0F = A0D.A0F(r11, obj, i, i2 + 5);
            }
            return A04(A0D, A0F, r11.A02, A0B, i3);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.5Ya] */
    public final C285005Ph A0G(C286845Ya r22, Object obj, Object obj2, int i, int i2) {
        int i3;
        C286865Yc r10;
        Object[] objArr;
        int i4;
        C285005Ph A0G;
        Object[] copyOf;
        int i5 = i;
        int i6 = i2;
        int i7 = 1 << ((i >> i2) & 31);
        ? r1 = r22;
        Object obj3 = obj;
        Object obj4 = obj2;
        if ((this.A00 & i7) != 0) {
            int A0A = A0A(i7);
            if (0qQ.A0K(obj3, this.A02[A0A])) {
                Object[] objArr2 = this.A02;
                int i8 = A0A + 1;
                Object obj5 = objArr2[i8];
                r1.A03 = obj5;
                if (obj5 != obj4) {
                    if (this.A03 == r1.A02) {
                        objArr2[i8] = obj2;
                        return this;
                    }
                    r1.A00++;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    0qQ.A07(copyOf2);
                    copyOf2[i8] = obj2;
                    return new C285005Ph(r1.A02, copyOf2, this.A00, this.A01);
                }
            } else {
                r1.A05(r1.size() + 1);
                r10 = r1.A02;
                C286865Yc r0 = this.A03;
                objArr = A09(r10, obj3, obj4, A0A, i7, i5, i6);
                if (r0 == r10) {
                    this.A02 = objArr;
                    this.A00 ^= i7;
                    this.A01 |= i7;
                    return this;
                }
                i4 = this.A00 ^ i7;
                i3 = i7 | this.A01;
                return new C285005Ph(r10, objArr, i4, i3);
            }
        } else if ((this.A01 & i7) != 0) {
            int A0B = A0B(i7);
            C285005Ph A0D = A0D(A0B);
            if (i6 == 30) {
                2HZ A0B2 = C229632nm.A0B(C229632nm.A0C(0, A0D.A02.length), 2);
                int i9 = A0B2.A00;
                int i10 = A0B2.A01;
                int i11 = A0B2.A02;
                if (i11 <= 0 ? !(i11 >= 0 || i10 > i9) : i9 <= i10) {
                    while (true) {
                        if (!0qQ.A0K(obj3, A0D.A02[i9])) {
                            if (i9 == i10) {
                                break;
                            }
                            i9 += i11;
                        } else {
                            Object[] objArr3 = A0D.A02;
                            int i12 = i9 + 1;
                            r1.A03 = objArr3[i12];
                            if (A0D.A03 == r1.A02) {
                                objArr3[i12] = obj2;
                                A0G = A0D;
                            } else {
                                r1.A00++;
                                copyOf = Arrays.copyOf(objArr3, objArr3.length);
                                0qQ.A07(copyOf);
                                copyOf[i12] = obj2;
                            }
                        }
                    }
                }
                r1.A05(r1.size() + 1);
                copyOf = C285115Pu.A00(obj3, obj4, A0D.A02, 0);
                A0G = new C285005Ph(r1.A02, copyOf, 0, 0);
            } else {
                int i13 = i5;
                A0G = A0D.A0G(r1, obj3, obj4, i13, i2 + 5);
            }
            if (A0D != A0G) {
                return A05(A0G, r1.A02, A0B);
            }
        } else {
            r1.A05(r1.size() + 1);
            r10 = r1.A02;
            int A0A2 = A0A(i7);
            C286865Yc r12 = this.A03;
            Object[] objArr4 = this.A02;
            if (r12 == r10) {
                this.A02 = C285115Pu.A00(obj3, obj4, objArr4, A0A2);
                this.A00 = i7 | this.A00;
                return this;
            }
            objArr = C285115Pu.A00(obj3, obj4, objArr4, A0A2);
            i4 = i7 | this.A00;
            i3 = this.A01;
            return new C285005Ph(r10, objArr, i4, i3);
        }
        return this;
    }

    public final C285005Ph A0H(C286845Ya r18, Object obj, Object obj2, int i, int i2) {
        C285005Ph A0H;
        int i3 = i2;
        int i4 = i;
        int i5 = 1 << ((i >> i2) & 31);
        C286845Ya r12 = r18;
        Object obj3 = obj;
        Object obj4 = obj2;
        if ((this.A00 & i5) != 0) {
            int A0A = A0A(i5);
            if (0qQ.A0K(obj3, this.A02[A0A]) && 0qQ.A0K(obj4, this.A02[A0A + 1])) {
                return A02(r12, A0A, i5);
            }
        } else if ((this.A01 & i5) != 0) {
            int A0B = A0B(i5);
            C285005Ph A0D = A0D(A0B);
            if (i3 == 30) {
                2HZ A0B2 = C229632nm.A0B(C229632nm.A0C(0, A0D.A02.length), 2);
                int i6 = A0B2.A00;
                int i7 = A0B2.A01;
                int i8 = A0B2.A02;
                if (i8 <= 0 ? !(i8 >= 0 || i7 > i6) : i6 <= i7) {
                    while (true) {
                        if (!0qQ.A0K(obj3, A0D.A02[i6]) || !0qQ.A0K(obj4, A0D.A02[i6 + 1])) {
                            if (i6 == i7) {
                                break;
                            }
                            i6 += i8;
                        } else {
                            A0H = A0D.A01(r12, i6);
                            break;
                        }
                    }
                }
                A0H = A0D;
            } else {
                A0H = A0D.A0H(r12, obj3, obj4, i4, i2 + 5);
            }
            return A04(A0D, A0H, r12.A02, A0B, i5);
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r0 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        r3 = r10.A02;
        r1 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r1 == 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r2 = new java.lang.Object[(r1 - 1)];
        X.0Yw.A0V(r3, r2, 0, 0, r5);
        X.0Yw.A0V(r3, r2, r5, r5 + 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        return new X.C285005Ph((X.C286865Yc) null, r2, r10.A00, r4 ^ r10.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C285005Ph A0I(java.lang.Object r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r12 >> r13
            r0 = r0 & 31
            r2 = 1
            int r4 = r2 << r0
            int r0 = r10.A00
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0030
            int r3 = r10.A0A(r4)
            java.lang.Object[] r0 = r10.A02
            r0 = r0[r3]
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 == 0) goto L_0x00ab
            java.lang.Object[] r2 = r10.A02
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto L_0x00a9
            java.lang.Object[] r2 = X.C285115Pu.A01(r2, r3)
            int r0 = r10.A00
            r4 = r4 ^ r0
            int r1 = r10.A01
            r0 = 0
            X.5Ph r3 = new X.5Ph
            r3.<init>(r0, r2, r4, r1)
            return r3
        L_0x0030:
            int r0 = r10.A01
            r0 = r0 & r4
            if (r0 == 0) goto L_0x00ab
            int r5 = r10.A0B(r4)
            X.5Ph r3 = r10.A0D(r5)
            r0 = 30
            if (r13 != r0) goto L_0x0082
            java.lang.Object[] r0 = r3.A02
            int r0 = r0.length
            r6 = 0
            X.2HY r0 = X.C229632nm.A0C(r6, r0)
            r9 = 2
            X.2HZ r0 = X.C229632nm.A0B(r0, r9)
            int r8 = r0.A00
            int r7 = r0.A01
            int r1 = r0.A02
            if (r1 <= 0) goto L_0x0060
            if (r8 <= r7) goto L_0x0064
        L_0x0058:
            r0 = r3
        L_0x0059:
            if (r3 == r0) goto L_0x00a8
            X.5Ph r3 = r10.A03(r0, r5, r4)
            return r3
        L_0x0060:
            if (r1 >= 0) goto L_0x0058
            if (r7 > r8) goto L_0x0058
        L_0x0064:
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r8]
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 == 0) goto L_0x007e
            java.lang.Object[] r1 = r3.A02
            int r0 = r1.length
            if (r0 == r9) goto L_0x008a
            java.lang.Object[] r2 = X.C285115Pu.A01(r1, r8)
            r1 = 0
            X.5Ph r0 = new X.5Ph
            r0.<init>(r1, r2, r6, r6)
            goto L_0x0059
        L_0x007e:
            if (r8 == r7) goto L_0x0058
            int r8 = r8 + r1
            goto L_0x0064
        L_0x0082:
            int r0 = r13 + 5
            X.5Ph r0 = r3.A0I(r11, r12, r0)
            if (r0 != 0) goto L_0x0059
        L_0x008a:
            java.lang.Object[] r3 = r10.A02
            int r1 = r3.length
            if (r1 == r2) goto L_0x00a9
            int r0 = r1 + -1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            X.0Yw.A0V(r3, r2, r0, r0, r5)
            int r0 = r5 + 1
            X.0Yw.A0V(r3, r2, r5, r0, r1)
            int r1 = r10.A00
            int r0 = r10.A01
            r4 = r4 ^ r0
            r0 = 0
            X.5Ph r3 = new X.5Ph
            r3.<init>(r0, r2, r1, r4)
            return r3
        L_0x00a8:
            return r10
        L_0x00a9:
            r3 = 0
            return r3
        L_0x00ab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285005Ph.A0I(java.lang.Object, int, int):X.5Ph");
    }

    public final Object A0J(int i, Object obj, int i2) {
        int i3;
        Object[] objArr;
        int i4 = 1 << ((i >> i2) & 31);
        boolean z = false;
        if ((i4 & this.A00) != 0) {
            z = true;
        }
        if (z) {
            i3 = A0A(i4);
            if (!0qQ.A0K(obj, this.A02[i3])) {
                return null;
            }
            objArr = this.A02;
        } else if ((this.A01 & i4) == 0) {
            return null;
        } else {
            C285005Ph A0D = A0D(A0B(i4));
            if (i2 != 30) {
                return A0D.A0J(i, obj, i2 + 5);
            }
            2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, A0D.A02.length), 2);
            i3 = A0B.A00;
            int i5 = A0B.A01;
            int i6 = A0B.A02;
            if (i6 > 0) {
                if (i3 > i5) {
                    return null;
                }
            } else if (i6 >= 0 || i5 > i3) {
                return null;
            }
            while (!0qQ.A0K(obj, A0D.A02[i3])) {
                if (i3 == i5) {
                    return null;
                }
                i3 += i6;
            }
            objArr = A0D.A02;
        }
        return objArr[i3 + 1];
    }

    public final boolean A0K(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            return 0qQ.A0K(obj, this.A02[A0A(i3)]);
        } else if ((this.A01 & i3) == 0) {
            return false;
        } else {
            C285005Ph A0D = A0D(A0B(i3));
            if (i2 == 30) {
                return A0D.A08(obj);
            }
            return A0D.A0K(obj, i, i2 + 5);
        }
    }

    public C285005Ph(C286865Yc r1, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r1;
        this.A02 = objArr;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.AbstractMap, X.5Ya] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C285005Ph A01(X.C286845Ya r5, int r6) {
        /*
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + -1
            r5.A05(r0)
            java.lang.Object[] r2 = r4.A02
            int r0 = r6 + 1
            r0 = r2[r0]
            r5.A03 = r0
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L_0x0017
            r3 = 0
            return r3
        L_0x0017:
            X.5Yc r1 = r4.A03
            X.5Yc r0 = r5.A02
            if (r1 != r0) goto L_0x0024
            java.lang.Object[] r0 = X.C285115Pu.A01(r2, r6)
            r4.A02 = r0
            return r4
        L_0x0024:
            java.lang.Object[] r2 = X.C285115Pu.A01(r2, r6)
            X.5Yc r1 = r5.A02
            r0 = 0
            X.5Ph r3 = new X.5Ph
            r3.<init>(r1, r2, r0, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285005Ph.A01(X.5Ya, int):X.5Ph");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.AbstractMap, X.5Ya] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C285005Ph A02(X.C286845Ya r5, int r6, int r7) {
        /*
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + -1
            r5.A05(r0)
            java.lang.Object[] r2 = r4.A02
            int r0 = r6 + 1
            r0 = r2[r0]
            r5.A03 = r0
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L_0x0017
            r3 = 0
            return r3
        L_0x0017:
            X.5Yc r1 = r4.A03
            X.5Yc r0 = r5.A02
            if (r1 != r0) goto L_0x0029
            java.lang.Object[] r0 = X.C285115Pu.A01(r2, r6)
            r4.A02 = r0
            int r0 = r4.A00
            r0 = r0 ^ r7
            r4.A00 = r0
            return r4
        L_0x0029:
            java.lang.Object[] r2 = X.C285115Pu.A01(r2, r6)
            int r0 = r4.A00
            r7 = r7 ^ r0
            int r1 = r4.A01
            X.5Yc r0 = r5.A02
            X.5Ph r3 = new X.5Ph
            r3.<init>(r0, r2, r7, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285005Ph.A02(X.5Ya, int, int):X.5Ph");
    }
}
