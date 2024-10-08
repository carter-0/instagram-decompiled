package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class AHF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C391759tb A06;
    public ByteBuffer A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public int[] A0B;
    public final C39609A1z A0C;

    public static ByteBuffer A00(C391759tb r2, AHF ahf, int i) {
        ByteBuffer order;
        ahf.A00 = 1;
        ahf.A0A = null;
        ahf.A05 = 0;
        ahf.A09 = false;
        ahf.A08 = false;
        ahf.A0B = new int[16];
        ahf.A01 = 0;
        ahf.A04 = 0;
        ahf.A06 = r2;
        if (r2 instanceof AnonymousClass9ZR) {
            order = ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
            0qQ.A07(order);
        } else {
            order = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
        ahf.A07 = order;
        return order;
    }

    public final void A05(int i) {
        A0B(4, 0);
        int capacity = this.A07.capacity();
        int i2 = this.A03;
        int i3 = ((capacity - i2) - i) + 4;
        ByteBuffer byteBuffer = this.A07;
        int i4 = i2 - 4;
        this.A03 = i4;
        byteBuffer.putInt(i4, i3);
    }

    public final void A09(int i, int i2) {
        if (i2 != 0) {
            A0B(4, 0);
            ByteBuffer byteBuffer = this.A07;
            int i3 = this.A03 - 4;
            this.A03 = i3;
            byteBuffer.putInt(i3, i2);
            A07(i);
        }
    }

    public final void A0A(int i, int i2) {
        if (i2 != 0) {
            A05(i2);
            A07(i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.A1z, java.lang.Object] */
    public AHF(C391759tb r3, int i) {
        C39609A1z a1z = C39609A1z.A00;
        C39609A1z a1z2 = a1z;
        if (a1z == null) {
            ? obj = new Object();
            C39609A1z.A00 = obj;
            a1z2 = obj;
        }
        ByteBuffer A002 = A00(r3, this, i);
        this.A0C = a1z2;
        this.A03 = A002.capacity();
    }

    public final int A01() {
        if (this.A0A == null || !this.A09) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        A0B(4, 0);
        ByteBuffer byteBuffer = this.A07;
        int i = this.A03 - 4;
        this.A03 = i;
        byteBuffer.putInt(i, 0);
        int capacity = this.A07.capacity() - this.A03;
        int i2 = this.A05;
        do {
            i2--;
            if (i2 < 0 || this.A0A[i2] != 0) {
                int i3 = i2 + 1;
            }
            i2--;
            break;
        } while (this.A0A[i2] != 0);
        int i32 = i2 + 1;
        while (i2 >= 0) {
            int i4 = this.A0A[i2];
            int i5 = 0;
            if (i4 != 0) {
                i5 = capacity - i4;
            }
            short s = (short) i5;
            A0B(2, 0);
            ByteBuffer byteBuffer2 = this.A07;
            int i6 = this.A03 - 2;
            this.A03 = i6;
            byteBuffer2.putShort(i6, s);
            i2--;
        }
        short s2 = (short) (capacity - this.A02);
        A0B(2, 0);
        ByteBuffer byteBuffer3 = this.A07;
        int i7 = this.A03 - 2;
        this.A03 = i7;
        byteBuffer3.putShort(i7, s2);
        A0B(2, 0);
        ByteBuffer byteBuffer4 = this.A07;
        int i8 = this.A03 - 2;
        this.A03 = i8;
        byteBuffer4.putShort(i8, (short) ((i32 + 2) * 2));
        int i9 = 0;
        while (true) {
            if (i9 >= this.A01) {
                break;
            }
            int capacity2 = this.A07.capacity() - this.A0B[i9];
            int i10 = this.A03;
            short s3 = this.A07.getShort(capacity2);
            if (s3 == this.A07.getShort(i10)) {
                int i11 = 2;
                while (i11 < s3) {
                    if (this.A07.getShort(capacity2 + i11) == this.A07.getShort(i10 + i11)) {
                        i11 += 2;
                    }
                }
                int i12 = this.A0B[i9];
                if (i12 != 0) {
                    int capacity3 = this.A07.capacity() - capacity;
                    this.A03 = capacity3;
                    this.A07.putInt(capacity3, i12 - capacity);
                }
            }
            i9++;
        }
        int i13 = this.A01;
        int[] iArr = this.A0B;
        if (i13 == iArr.length) {
            iArr = Arrays.copyOf(iArr, i13 * 2);
            this.A0B = iArr;
        }
        int i14 = this.A01;
        this.A01 = i14 + 1;
        iArr[i14] = this.A07.capacity() - this.A03;
        ByteBuffer byteBuffer5 = this.A07;
        byteBuffer5.putInt(byteBuffer5.capacity() - capacity, (this.A07.capacity() - this.A03) - capacity);
        this.A09 = false;
        return capacity;
    }

    public final int A02() {
        if (this.A09) {
            this.A09 = false;
            int i = this.A04;
            ByteBuffer byteBuffer = this.A07;
            int i2 = this.A03 - 4;
            this.A03 = i2;
            byteBuffer.putInt(i2, i);
            return this.A07.capacity() - this.A03;
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public final void A04() {
        if (!this.A08) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public final void A06(int i) {
        A0B(this.A00, 4);
        A05(i);
        this.A07.position(this.A03);
        this.A08 = true;
    }

    public final void A07(int i) {
        this.A0A[i] = this.A07.capacity() - this.A03;
    }

    public final void A08(int i) {
        if (!this.A09) {
            int[] iArr = this.A0A;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
                this.A0A = iArr;
            }
            this.A05 = i;
            Arrays.fill(iArr, 0, i, 0);
            this.A09 = true;
            this.A02 = this.A07.capacity() - this.A03;
            return;
        }
        throw new AssertionError(AnonymousClass000.A00(951));
    }

    public final void A0B(int i, int i2) {
        ByteBuffer order;
        if (i > this.A00) {
            this.A00 = i;
        }
        int capacity = this.A07.capacity();
        int i3 = this.A03;
        int i4 = ((((capacity - i3) + i2) ^ -1) + 1) & (i - 1);
        while (i3 < i4 + i + i2) {
            int capacity2 = this.A07.capacity();
            ByteBuffer byteBuffer = this.A07;
            C391759tb r2 = this.A06;
            int capacity3 = byteBuffer.capacity();
            int i5 = 1024;
            if (capacity3 != 0) {
                i5 = 2147483639;
                if (capacity3 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                } else if ((-1073741824 & capacity3) == 0) {
                    i5 = capacity3 << 1;
                }
            }
            byteBuffer.position(0);
            if (r2 instanceof AnonymousClass9ZR) {
                order = ByteBuffer.allocateDirect(i5).order(ByteOrder.LITTLE_ENDIAN);
                0qQ.A07(order);
            } else {
                order = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
            }
            order.position(order.clear().capacity() - capacity3);
            order.put(byteBuffer);
            this.A07 = order;
            i3 = this.A03 + (order.capacity() - capacity2);
            this.A03 = i3;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ByteBuffer byteBuffer2 = this.A07;
            int i7 = this.A03 - 1;
            this.A03 = i7;
            byteBuffer2.put(i7, (byte) 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: java.nio.ByteBuffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ca, code lost:
        if (r8 < 2048) goto L_0x01cc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(java.lang.CharSequence r13) {
        /*
            r12 = this;
            int r6 = r13.length()
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x0012
            char r1 = r13.charAt(r5)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x0012
            int r5 = r5 + 1
            goto L_0x0005
        L_0x0012:
            r3 = r6
        L_0x0013:
            if (r5 >= r6) goto L_0x0058
            char r0 = r13.charAt(r5)
            r7 = 2048(0x800, float:2.87E-42)
            if (r0 >= r7) goto L_0x0025
            int r0 = 127 - r0
            int r0 = r0 >>> 31
            int r3 = r3 + r0
            int r5 = r5 + 1
            goto L_0x0013
        L_0x0025:
            int r4 = r13.length()
            r2 = 0
        L_0x002a:
            if (r5 >= r4) goto L_0x0057
            char r1 = r13.charAt(r5)
            if (r1 >= r7) goto L_0x003a
            int r0 = 127 - r1
            int r0 = r0 >>> 31
            int r2 = r2 + r0
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x003a:
            int r2 = r2 + 2
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r0 > r1) goto L_0x0037
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r1 > r0) goto L_0x0037
            int r1 = java.lang.Character.codePointAt(r13, r5)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 < r0) goto L_0x0051
            int r5 = r5 + 1
            goto L_0x0037
        L_0x0051:
            X.9tY r1 = new X.9tY
            r1.<init>(r5, r4)
            throw r1
        L_0x0057:
            int r3 = r3 + r2
        L_0x0058:
            if (r3 < r6) goto L_0x029a
            r2 = 0
            r0 = 1
            r12.A0B(r0, r2)
            java.nio.ByteBuffer r1 = r12.A07
            int r0 = r12.A03
            int r0 = r0 + -1
            r12.A03 = r0
            r1.put(r0, r2)
            r1 = 1
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x028e
            r12.A04 = r3
            r0 = 4
            r12.A0B(r0, r3)
            r12.A0B(r1, r3)
            r12.A09 = r1
            java.nio.ByteBuffer r1 = r12.A07
            int r0 = r12.A03
            int r0 = r0 - r3
            r12.A03 = r0
            r1.position(r0)
            java.nio.ByteBuffer r7 = r12.A07
            boolean r0 = r7.hasArray()
            if (r0 == 0) goto L_0x00b7
            int r11 = r7.arrayOffset()
            byte[] r10 = r7.array()
            int r3 = r7.position()
            int r3 = r3 + r11
            int r6 = r7.remaining()
            int r2 = r13.length()
            int r6 = r6 + r3
            r9 = 0
        L_0x00a3:
            r5 = 128(0x80, float:1.794E-43)
            if (r9 >= r2) goto L_0x01a6
            int r1 = r9 + r3
            if (r1 >= r6) goto L_0x01a6
            char r0 = r13.charAt(r9)
            if (r0 >= r5) goto L_0x01a6
            byte r0 = (byte) r0
            r10[r1] = r0
            int r9 = r9 + 1
            goto L_0x00a3
        L_0x00b7:
            int r4 = r13.length()
            int r3 = r7.position()
            r6 = 0
        L_0x00c0:
            r5 = 128(0x80, float:1.794E-43)
            if (r6 >= r4) goto L_0x00d3
            char r0 = r13.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            if (r0 >= r5) goto L_0x00d3
            int r1 = r3 + r6
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            r7.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            int r6 = r6 + 1
            goto L_0x00c0
        L_0x00d3:
            if (r6 != r4) goto L_0x00dc
            int r0 = r3 + r6
            r7.position(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            goto L_0x01b0
        L_0x00dc:
            int r3 = r3 + r6
        L_0x00dd:
            if (r6 >= r4) goto L_0x016e
            char r8 = r13.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            if (r8 < r5) goto L_0x0158
            r0 = 2048(0x800, float:2.87E-42)
            if (r8 >= r0) goto L_0x00fc
            int r1 = r3 + 1
            int r0 = r8 >>> 6
            r0 = r0 | 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            r7.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x016c }
            r0 = r8 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x016c }
            r7.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x016c }
            r3 = r1
            goto L_0x015f
        L_0x00fc:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r0) goto L_0x0140
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r0 < r8) goto L_0x0140
            int r2 = r6 + 1
            if (r2 == r4) goto L_0x0166
            char r1 = r13.charAt(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0173 }
            boolean r0 = java.lang.Character.isSurrogatePair(r8, r1)     // Catch:{ IndexOutOfBoundsException -> 0x0173 }
            if (r0 == 0) goto L_0x0165
            int r6 = java.lang.Character.toCodePoint(r8, r1)     // Catch:{ IndexOutOfBoundsException -> 0x0173 }
            int r1 = r3 + 1
            int r0 = r6 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0173 }
            r7.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0172 }
            int r3 = r1 + 1
            int r0 = r6 >>> 12
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0172 }
            r7.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0173 }
            int r1 = r3 + 1
            int r0 = r6 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0173 }
            r7.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0172 }
            r0 = r6 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0172 }
            r7.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0172 }
            goto L_0x015d
        L_0x0140:
            int r1 = r3 + 1
            int r0 = r8 >>> 12
            r0 = r0 | 224(0xe0, float:3.14E-43)
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x016c }
            r7.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x016c }
            int r3 = r1 + 1
            int r0 = r8 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x016c }
            r7.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            r8 = r8 & 63
            r8 = r8 | r5
        L_0x0158:
            byte r0 = (byte) r8     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            r7.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            goto L_0x015f
        L_0x015d:
            r3 = r1
            r6 = r2
        L_0x015f:
            int r6 = r6 + 1
            int r3 = r3 + 1
            goto L_0x00dd
        L_0x0165:
            r6 = r2
        L_0x0166:
            X.9tY r0 = new X.9tY     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            r0.<init>(r6, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
        L_0x016c:
            r3 = r1
            goto L_0x0174
        L_0x016e:
            r7.position(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0174 }
            goto L_0x01b0
        L_0x0172:
            r3 = r1
        L_0x0173:
            r6 = r2
        L_0x0174:
            int r2 = r7.position()
            int r0 = r7.position()
            int r3 = r3 - r0
            int r0 = r3 + 1
            int r0 = java.lang.Math.max(r6, r0)
            int r2 = r2 + r0
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            char r0 = r13.charAt(r6)
            r1.append(r0)
            java.lang.String r0 = " at index "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x01a6:
            int r4 = r3 + r9
            if (r9 != r2) goto L_0x01b5
            int r4 = r3 + r2
        L_0x01ac:
            int r4 = r4 - r11
            r7.position(r4)
        L_0x01b0:
            int r0 = r12.A02()
            return r0
        L_0x01b5:
            if (r9 >= r2) goto L_0x01ac
            char r8 = r13.charAt(r9)
            if (r8 >= r5) goto L_0x01c8
            if (r4 >= r6) goto L_0x01cc
            int r1 = r4 + 1
        L_0x01c1:
            byte r0 = (byte) r8
            r10[r4] = r0
            r4 = r1
        L_0x01c5:
            int r9 = r9 + 1
            goto L_0x01b5
        L_0x01c8:
            r0 = 2048(0x800, float:2.87E-42)
            if (r8 >= r0) goto L_0x01e2
        L_0x01cc:
            int r0 = r6 + -2
            if (r4 > r0) goto L_0x01e2
            int r1 = r4 + 1
            int r0 = r8 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r10[r4] = r0
            int r4 = r1 + 1
            r0 = r8 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r10[r1] = r0
            goto L_0x01c5
        L_0x01e2:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r1) goto L_0x01ec
            if (r3 >= r8) goto L_0x0209
        L_0x01ec:
            int r0 = r6 + -3
            if (r4 > r0) goto L_0x0209
            int r1 = r4 + 1
            int r0 = r8 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r10[r4] = r0
            int r4 = r1 + 1
            int r0 = r8 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r10[r1] = r0
            int r1 = r4 + 1
            r8 = r8 & 63
            r8 = r8 | r5
            goto L_0x01c1
        L_0x0209:
            int r0 = r6 + -4
            if (r4 > r0) goto L_0x0254
            int r3 = r9 + 1
            int r0 = r13.length()
            if (r3 == r0) goto L_0x024c
            char r1 = r13.charAt(r3)
            boolean r0 = java.lang.Character.isSurrogatePair(r8, r1)
            if (r0 == 0) goto L_0x024b
            int r8 = java.lang.Character.toCodePoint(r8, r1)
            int r1 = r4 + 1
            int r0 = r8 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r10[r4] = r0
            int r4 = r1 + 1
            int r0 = r8 >>> 12
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r10[r1] = r0
            int r1 = r4 + 1
            int r0 = r8 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r10[r4] = r0
            int r4 = r1 + 1
            r0 = r8 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r10[r1] = r0
            r9 = r3
            goto L_0x01c5
        L_0x024b:
            r9 = r3
        L_0x024c:
            int r0 = r9 + -1
            X.9tY r1 = new X.9tY
            r1.<init>(r0, r2)
            throw r1
        L_0x0254:
            if (r1 > r8) goto L_0x0270
            if (r8 > r3) goto L_0x0270
            int r1 = r9 + 1
            int r0 = r13.length()
            if (r1 == r0) goto L_0x026a
            char r0 = r13.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r8, r0)
            if (r0 != 0) goto L_0x0270
        L_0x026a:
            X.9tY r1 = new X.9tY
            r1.<init>(r9, r2)
            throw r1
        L_0x0270:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " at index "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x028e:
            r0 = 951(0x3b7, float:1.333E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x029a:
            r0 = 70
            java.lang.String r4 = X.Pxd.A00(r0)
            long r2 = (long) r3
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 + r0
            java.lang.String r0 = X.002.A0Q(r4, r2)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHF.A03(java.lang.CharSequence):int");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.A1z, java.lang.Object] */
    public AHF() {
        AnonymousClass9ZQ r2 = AnonymousClass9ZQ.A00;
        C39609A1z a1z = C39609A1z.A00;
        C39609A1z a1z2 = a1z;
        if (a1z == null) {
            ? obj = new Object();
            C39609A1z.A00 = obj;
            a1z2 = obj;
        }
        ByteBuffer A002 = A00(r2, this, 1024);
        this.A0C = a1z2;
        this.A03 = A002.capacity();
    }
}
