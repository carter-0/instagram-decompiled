package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Ax  reason: invalid class name and case insensitive filesystem */
public final class C303826Ax extends 2dy implements C303796Au {
    public byte[] A00;
    public AnonymousClass6B9[] A01;

    public final void ANd(ByteBuffer byteBuffer, int i) {
        C303796Au r0;
        C303796Au r02;
        int i2 = 0;
        int A002 = C303816Aw.A00(byteBuffer, i, 0);
        if (A002 != 0) {
            i2 = byteBuffer.getInt(A002);
        }
        this.A0M = i2;
        this.A0x = C303816Aw.A06(C303826Ax.class, byteBuffer, i, 1);
        float f = 0.0f;
        int A003 = C303816Aw.A00(byteBuffer, i, 2);
        if (A003 != 0) {
            f = byteBuffer.getFloat(A003);
        }
        this.A04 = f;
        float f2 = 1.0f;
        int A004 = C303816Aw.A00(byteBuffer, i, 3);
        if (A004 != 0) {
            f2 = byteBuffer.getFloat(A004);
        }
        this.A0E = f2;
        Class<AnonymousClass6Ay> cls = AnonymousClass6Ay.class;
        C303836Az r1 = (C303836Az) C303816Aw.A01(cls, byteBuffer, i, 4);
        if (r1 != null) {
            this.A0g = (AnonymousClass3JV) r1.A00;
            if (r1.A00 != null) {
                this.A0X = r1;
            }
        }
        Class<AnonymousClass6B3> cls2 = AnonymousClass6B3.class;
        AnonymousClass6B3 r3 = (AnonymousClass6B3) C303816Aw.A01(cls2, byteBuffer, i, 5);
        if (r3 != null) {
            float f3 = r3.A00;
            if (f3 == -1.0f) {
                f3 = 0.0f;
            }
            this.A0I = f3;
            if (r3.A00 != null) {
                this.A0p = r3;
            }
        }
        AnonymousClass6B3 r32 = (AnonymousClass6B3) C303816Aw.A01(cls2, byteBuffer, i, 6);
        if (r32 != null) {
            float f4 = r32.A00;
            if (f4 == -1.0f) {
                f4 = 0.0f;
            }
            this.A0J = f4;
            if (r32.A00 != null) {
                this.A0q = r32;
            }
        }
        AnonymousClass6B3 r33 = (AnonymousClass6B3) C303816Aw.A01(cls2, byteBuffer, i, 7);
        if (r33 != null) {
            float f5 = r33.A00;
            if (f5 == -1.0f) {
                f5 = 0.0f;
            }
            this.A08 = f5;
            if (r33.A00 != null) {
                this.A0k = r33;
            }
        }
        C303836Az r12 = (C303836Az) C303816Aw.A01(cls, byteBuffer, i, 8);
        if (r12 != null) {
            this.A0h = (AnonymousClass3JV) r12.A00;
            if (r12.A00 != null) {
                this.A0c = r12;
            }
        }
        Class<AnonymousClass6B5> cls3 = AnonymousClass6B5.class;
        C303836Az r13 = (C303836Az) C303816Aw.A01(cls3, byteBuffer, i, 9);
        if (r13 != null) {
            this.A0f = r13.A00;
            if (r13.A00 != null) {
                this.A0a = r13;
            }
        }
        AnonymousClass6B3 r6 = (AnonymousClass6B3) C303816Aw.A01(cls2, byteBuffer, i, 10);
        if (r6 != null) {
            float f6 = r6.A00;
            if (f6 == -1.0f) {
                f6 = 0.0f;
            }
            this.A06 = f6;
            if (r6.A00 != null) {
                this.A0j = r6;
            }
        } else {
            this.A06 = 1.0f;
        }
        Class<AnonymousClass6B6> cls4 = AnonymousClass6B6.class;
        C303836Az r14 = (C303836Az) C303816Aw.A01(cls4, byteBuffer, i, 11);
        if (r14 != null) {
            this.A0S = r14.A00;
            if (r14.A00 != null) {
                this.A0Z = r14;
            }
        }
        C303836Az r15 = (C303836Az) C303816Aw.A01(cls4, byteBuffer, i, 12);
        if (r15 != null) {
            this.A0T = r15.A00;
            if (r15.A00 != null) {
                this.A0d = r15;
            }
        }
        AnonymousClass6B3 r62 = (AnonymousClass6B3) C303816Aw.A01(cls2, byteBuffer, i, 13);
        if (r62 != null) {
            float f7 = r62.A00;
            if (f7 == -1.0f) {
                f7 = 0.0f;
            }
            this.A09 = f7;
            if (r62.A00 != null) {
                this.A0l = r62;
            }
        }
        byte b = 0;
        int A005 = C303816Aw.A00(byteBuffer, i, 14);
        if (A005 != 0) {
            b = byteBuffer.get(A005);
        }
        this.A00 = b;
        this.A0V = (AnonymousClass6B8) C303816Aw.A01(AnonymousClass6B7.class, byteBuffer, i, 15);
        byte b2 = 0;
        int A006 = C303816Aw.A00(byteBuffer, i, 16);
        if (A006 != 0) {
            b2 = byteBuffer.get(A006);
        }
        this.A01 = b2;
        AnonymousClass6B3 r16 = (AnonymousClass6B3) C303816Aw.A01(cls2, byteBuffer, i, 17);
        if (r16 != null) {
            this.A05 = r16.A00;
            if (r16.A00 != null) {
                this.A0i = r16;
            }
        } else {
            this.A05 = -1.0f;
        }
        int i3 = -1;
        int A007 = C303816Aw.A00(byteBuffer, i, 18);
        if (A007 != 0) {
            i3 = byteBuffer.getInt(A007);
        }
        this.A0L = i3;
        this.A0K = -1;
        int i4 = -1;
        int A008 = C303816Aw.A00(byteBuffer, i, 19);
        if (A008 != 0) {
            i4 = byteBuffer.getInt(A008);
        }
        this.A0N = i4;
        this.A01 = (AnonymousClass6B9[]) C303816Aw.A06(AnonymousClass6B9.class, byteBuffer, i, 20);
        float f8 = 0.0f;
        int A009 = C303816Aw.A00(byteBuffer, i, 21);
        if (A009 != 0) {
            f8 = byteBuffer.getFloat(A009);
        }
        this.A07 = f8;
        C303836Az r17 = (C303836Az) C303816Aw.A01(cls3, byteBuffer, i, 22);
        if (r17 != null) {
            this.A0e = r17.A00;
            if (r17.A00 != null) {
                this.A0Y = r17;
            }
        }
        this.A0b = (AnonymousClass6B0) C303816Aw.A01(cls3, byteBuffer, i, 23);
        boolean z = false;
        int A0010 = C303816Aw.A00(byteBuffer, i, 24);
        if (A0010 != 0 && byteBuffer.get(A0010) == 1) {
            z = true;
        }
        this.A0u = z;
        byte b3 = 0;
        int A0011 = C303816Aw.A00(byteBuffer, i, 25);
        if (A0011 != 0) {
            b3 = byteBuffer.get(A0011);
        }
        this.A02 = b3;
        byte b4 = 0;
        int A0012 = C303816Aw.A00(byteBuffer, i, 26);
        if (A0012 != 0) {
            b4 = byteBuffer.get(A0012);
        }
        this.A03 = b4;
        this.A0t = true;
        this.A0s = C303816Aw.A03(byteBuffer, i, 27);
        C303816Aw.A03(byteBuffer, i, 28);
        float f9 = 0.0f;
        int A0013 = C303816Aw.A00(byteBuffer, i, 29);
        if (A0013 != 0) {
            f9 = byteBuffer.getFloat(A0013);
        }
        this.A0C = f9;
        Class<AnonymousClass6BA> cls5 = AnonymousClass6BA.class;
        int A0014 = C303816Aw.A00(byteBuffer, i, 30);
        if (A0014 != 0) {
            r0 = cls5.newInstance();
            r0.ANd(byteBuffer, A0014);
        } else {
            r0 = null;
        }
        this.A0U = (2dn) r0;
        float f10 = 0.0f;
        int A0015 = C303816Aw.A00(byteBuffer, i, 31);
        if (A0015 != 0) {
            f10 = byteBuffer.getFloat(A0015);
        }
        this.A0A = f10;
        int A0016 = C303816Aw.A00(byteBuffer, i, 32);
        if (A0016 != 0) {
            byteBuffer.getFloat(A0016);
        }
        float f11 = 0.0f;
        int A0017 = C303816Aw.A00(byteBuffer, i, 33);
        if (A0017 != 0) {
            f11 = byteBuffer.getFloat(A0017);
        }
        this.A0D = f11;
        float f12 = 0.0f;
        int A0018 = C303816Aw.A00(byteBuffer, i, 34);
        if (A0018 != 0) {
            f12 = byteBuffer.getFloat(A0018);
        }
        this.A0B = f12;
        boolean z2 = false;
        int A0019 = C303816Aw.A00(byteBuffer, i, 35);
        if (A0019 != 0 && byteBuffer.get(A0019) == 1) {
            z2 = true;
        }
        this.A0v = z2;
        Class<C303806Av> cls6 = C303806Av.class;
        int A0020 = C303816Aw.A00(byteBuffer, i, 37);
        if (A0020 != 0) {
            r02 = cls6.newInstance();
            r02.ANd(byteBuffer, A0020);
        } else {
            r02 = null;
        }
        this.A0r = (C71542dx) r02;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        r14.A00 = r7.A0C;
        r5 = r7.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ea, code lost:
        if (r5 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ec, code lost:
        r7 = new float[2];
        r14.A0w = r7;
        r2 = r5[0];
        r7[0] = r2.A00;
        r1 = r5[1];
        r7[1] = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fe, code lost:
        if (r2.A00 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0102, code lost:
        if (r1.A00 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0104, code lost:
        r1 = new X.AnonymousClass6B4[2];
        r14.A0y = r1;
        r1[0] = r2;
        r1[1] = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0162, code lost:
        if (r2.equals("Sound") == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0174, code lost:
        r7.A0C = X.C303816Aw.A04(r11, r5, 0);
        r7.A0D = (X.AnonymousClass6B3[]) X.C303816Aw.A06(X.AnonymousClass6B3.class, r11, r5, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C303776As r15, X.C303786At r16, java.lang.String[] r17) {
        /*
            r14 = this;
            X.6B9[] r10 = r14.A01
            r6 = -1
            r3 = 0
            r4 = r17
            if (r10 == 0) goto L_0x01ee
            if (r17 == 0) goto L_0x01ee
            int r9 = r10.length
            r8 = 0
        L_0x000c:
            if (r8 >= r9) goto L_0x01ee
            r7 = r10[r8]
            byte[] r0 = r7.A0B
            if (r0 == 0) goto L_0x0034
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r11.order(r0)
            int r0 = r11.position()
            int r5 = r11.getInt(r0)
            int r5 = r5 + r0
            int r0 = r7.A02
            r2 = r17[r0]
            int r0 = r2.hashCode()
            r1 = 3
            r12 = 2
            r13 = 1
            switch(r0) {
                case -1202599304: goto L_0x011e;
                case 80074991: goto L_0x015c;
                case 339512554: goto L_0x0166;
                case 1572589447: goto L_0x0186;
                default: goto L_0x0034;
            }
        L_0x0034:
            int r0 = r7.A02
            r1 = r17[r0]
            int r0 = r1.hashCode()
            r11 = 2
            r12 = 1
            switch(r0) {
                case -1202599304: goto L_0x0110;
                case 80074991: goto L_0x00ce;
                case 339512554: goto L_0x00d8;
                case 1572589447: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            int r8 = r8 + 1
            goto L_0x000c
        L_0x0044:
            java.lang.String r0 = "TrimPath"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            X.6B3 r2 = r7.A0A
            r5 = 0
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x0062
            float r1 = r2.A00
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r1 = 0
        L_0x005a:
            r14.A0H = r1
            float[] r0 = r2.A00
            if (r0 == 0) goto L_0x0062
            r14.A0o = r2
        L_0x0062:
            X.6B3 r2 = r7.A08
            if (r2 == 0) goto L_0x0075
            float r1 = r2.A00
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            r1 = 0
        L_0x006d:
            r14.A0F = r1
            float[] r0 = r2.A00
            if (r0 == 0) goto L_0x0075
            r14.A0m = r2
        L_0x0075:
            X.6B3 r2 = r7.A09
            if (r2 == 0) goto L_0x0088
            float r1 = r2.A00
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            r5 = r1
        L_0x0080:
            r14.A0G = r5
            float[] r0 = r2.A00
            if (r0 == 0) goto L_0x0088
            r14.A0n = r2
        L_0x0088:
            X.6B5 r1 = r7.A05
            if (r1 == 0) goto L_0x0041
            X.6Au r0 = r1.A00
            X.2dt r0 = (X.2dt) r0
            r14.A0f = r0
            java.lang.Object[] r0 = r1.A00
            if (r0 == 0) goto L_0x0098
            r14.A0a = r1
        L_0x0098:
            X.6B6 r1 = r7.A04
            if (r1 == 0) goto L_0x00a8
            X.6Au r0 = r1.A00
            X.2dn r0 = (X.2dn) r0
            r14.A0T = r0
            java.lang.Object[] r0 = r1.A00
            if (r0 == 0) goto L_0x00a8
            r14.A0d = r1
        L_0x00a8:
            X.6B3 r1 = r7.A07
            if (r1 == 0) goto L_0x00b6
            float r0 = r1.A00
            r14.A09 = r0
            float[] r0 = r1.A00
            if (r0 == 0) goto L_0x00b6
            r14.A0l = r1
        L_0x00b6:
            byte r0 = r7.A00
            r14.A00 = r0
            byte r0 = r7.A01
            r14.A01 = r0
            X.6B3 r1 = r7.A06
            if (r1 == 0) goto L_0x0041
            float r0 = r1.A00
            r14.A05 = r0
            float[] r0 = r1.A00
            if (r0 == 0) goto L_0x0041
            r14.A0i = r1
            goto L_0x0041
        L_0x00ce:
            java.lang.String r0 = "Sound"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e4
            goto L_0x0041
        L_0x00d8:
            java.lang.String r0 = "LayerTags"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            java.lang.String[] r0 = r7.A0E
            r14.A0z = r0
        L_0x00e4:
            byte[] r0 = r7.A0C
            r14.A00 = r0
            X.6B3[] r5 = r7.A0D
            if (r5 == 0) goto L_0x0041
            float[] r7 = new float[r11]
            r14.A0w = r7
            r2 = r5[r3]
            float r0 = r2.A00
            r7[r3] = r0
            r1 = r5[r12]
            float r0 = r1.A00
            r7[r12] = r0
            float[] r0 = r2.A00
            if (r0 == 0) goto L_0x0041
            float[] r0 = r1.A00
            if (r0 == 0) goto L_0x0041
            X.6B4[] r1 = new X.AnonymousClass6B4[r11]
            r14.A0y = r1
            r1[r3] = r2
            r0 = r5[r12]
            r1[r12] = r0
            goto L_0x0041
        L_0x0110:
            java.lang.String r0 = "RandomSubdocument"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            int r0 = r7.A03
            r14.A0N = r0
            goto L_0x0041
        L_0x011e:
            java.lang.String r0 = "RandomSubdocument"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0034
            int r1 = X.C303816Aw.A00(r11, r5, r3)
            if (r1 == 0) goto L_0x0034
            int r0 = r11.getInt(r1)
            int r0 = r0 + r1
            int r5 = r11.getInt(r0)
            int r0 = r11.getInt(r1)
            int r1 = r1 + r0
            int r12 = r1 + 4
            int[] r2 = new int[r5]
            r1 = 0
        L_0x013f:
            if (r1 >= r5) goto L_0x014d
            int r0 = r1 * 4
            int r0 = r0 + r12
            int r0 = r11.getInt(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x013f
        L_0x014d:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r0 = r0.nextInt(r5)
            r0 = r2[r0]
            r7.A03 = r0
            goto L_0x0034
        L_0x015c:
            java.lang.String r0 = "Sound"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0174
            goto L_0x0034
        L_0x0166:
            java.lang.String r0 = "LayerTags"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String[] r0 = X.C303816Aw.A07(r11, r5, r3)
            r7.A0E = r0
        L_0x0174:
            byte[] r0 = X.C303816Aw.A04(r11, r5, r3)
            r7.A0C = r0
            java.lang.Class<X.6B3> r0 = X.AnonymousClass6B3.class
            X.6Au[] r0 = X.C303816Aw.A06(r0, r11, r5, r13)
            X.6B3[] r0 = (X.AnonymousClass6B3[]) r0
            r7.A0D = r0
            goto L_0x0034
        L_0x0186:
            java.lang.String r0 = "TrimPath"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.Class<X.6B3> r2 = X.AnonymousClass6B3.class
            X.6Au r0 = X.C303816Aw.A01(r2, r11, r5, r3)
            X.6B3 r0 = (X.AnonymousClass6B3) r0
            r7.A0A = r0
            X.6Au r0 = X.C303816Aw.A01(r2, r11, r5, r13)
            X.6B3 r0 = (X.AnonymousClass6B3) r0
            r7.A08 = r0
            X.6Au r0 = X.C303816Aw.A01(r2, r11, r5, r12)
            X.6B3 r0 = (X.AnonymousClass6B3) r0
            r7.A09 = r0
            java.lang.Class<X.6B5> r0 = X.AnonymousClass6B5.class
            X.6Au r0 = X.C303816Aw.A01(r0, r11, r5, r1)
            X.6B5 r0 = (X.AnonymousClass6B5) r0
            r7.A05 = r0
            r1 = 4
            java.lang.Class<X.6B6> r0 = X.AnonymousClass6B6.class
            X.6Au r0 = X.C303816Aw.A01(r0, r11, r5, r1)
            X.6B6 r0 = (X.AnonymousClass6B6) r0
            r7.A04 = r0
            r0 = 5
            X.6Au r0 = X.C303816Aw.A01(r2, r11, r5, r0)
            X.6B3 r0 = (X.AnonymousClass6B3) r0
            r7.A07 = r0
            r0 = 6
            r1 = 0
            int r0 = X.C303816Aw.A00(r11, r5, r0)
            if (r0 == 0) goto L_0x01d2
            byte r1 = r11.get(r0)
        L_0x01d2:
            r7.A00 = r1
            r0 = 7
            r1 = 0
            int r0 = X.C303816Aw.A00(r11, r5, r0)
            if (r0 == 0) goto L_0x01e0
            byte r1 = r11.get(r0)
        L_0x01e0:
            r7.A01 = r1
            r0 = 8
            X.6Au r0 = X.C303816Aw.A01(r2, r11, r5, r0)
            X.6B3 r0 = (X.AnonymousClass6B3) r0
            r7.A06 = r0
            goto L_0x0034
        L_0x01ee:
            int r2 = r14.A0N
            r5 = r16
            if (r2 == r6) goto L_0x0204
            X.2e2[] r0 = r5.A01
            if (r0 == 0) goto L_0x0204
            java.util.List r1 = r15.A01
            if (r1 == 0) goto L_0x0204
            r0 = r0[r2]
            int r0 = r1.indexOf(r0)
            r14.A0N = r0
        L_0x0204:
            int r2 = r14.A0L
            if (r2 == r6) goto L_0x0218
            X.6BC[] r0 = r5.A00
            if (r0 == 0) goto L_0x0218
            java.util.List r1 = r15.A00
            if (r1 == 0) goto L_0x0218
            r0 = r0[r2]
            int r0 = r1.indexOf(r0)
            r14.A0L = r0
        L_0x0218:
            X.2dy[] r2 = r14.A0x
            if (r2 == 0) goto L_0x0229
            int r1 = r2.length
        L_0x021d:
            if (r3 >= r1) goto L_0x0229
            r0 = r2[r3]
            X.6Ax r0 = (X.C303826Ax) r0
            r0.A02(r15, r5, r4)
            int r3 = r3 + 1
            goto L_0x021d
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C303826Ax.A02(X.6As, X.6At, java.lang.String[]):void");
    }
}
