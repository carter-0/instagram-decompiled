package com.google.protobuf;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10094RmW;
import X.Pxf;
import X.R5g;
import X.R5h;
import X.R5i;
import X.SK5;
import X.TLV;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

public final class UnsafeUtil {
    public static final long A00;
    public static final long A01 = ((long) A01(byte[].class));
    public static final SK5 A02;
    public static final Unsafe A03 = A04();
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07 = A09(Long.TYPE);
    public static final boolean A08 = AnonymousClass7TF.A1W(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    public static final Class A09;

    static {
        boolean A0K;
        boolean A0J;
        long j;
        Class<double[]> cls = double[].class;
        Class<float[]> cls2 = float[].class;
        Class<long[]> cls3 = long[].class;
        Class<int[]> cls4 = int[].class;
        Class<boolean[]> cls5 = boolean[].class;
        Class cls6 = C10094RmW.A00;
        A09 = cls6;
        boolean A092 = A09(Integer.TYPE);
        A06 = A092;
        Unsafe unsafe = A03;
        SK5 sk5 = null;
        if (unsafe != null) {
            if (cls6 == null || C10094RmW.A01) {
                sk5 = new R5i(unsafe);
            } else if (A07) {
                sk5 = new R5h(unsafe);
            } else if (A092) {
                sk5 = new R5g(unsafe);
            }
        }
        A02 = sk5;
        if (sk5 == null) {
            A0K = false;
        } else {
            A0K = sk5.A0K();
        }
        A05 = A0K;
        SK5 sk52 = A02;
        if (sk52 == null) {
            A0J = false;
        } else {
            A0J = sk52.A0J();
        }
        A04 = A0J;
        A01(cls5);
        boolean z = A04;
        if (z) {
            sk52.A0A(cls5);
        }
        A01(cls4);
        if (z) {
            sk52.A0A(cls4);
        }
        A01(cls3);
        if (z) {
            sk52.A0A(cls3);
        }
        A01(cls2);
        if (z) {
            sk52.A0A(cls2);
        }
        A01(cls);
        if (z) {
            sk52.A0A(cls);
        }
        Class<Object[]> cls7 = Object[].class;
        A01(cls7);
        if (z) {
            sk52.A0A(cls7);
        }
        Field A032 = A03();
        if (A032 == null || sk52 == null) {
            j = -1;
        } else {
            j = sk52.A08(A032);
        }
        A00 = j;
    }

    public static byte A00(byte[] bArr, long j) {
        return A02.A02(bArr, A01 + j);
    }

    public static int A01(Class cls) {
        if (A04) {
            return A02.A05(cls);
        }
        return -1;
    }

    public static Object A02(Class cls) {
        try {
            return A03.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.C10094RmW.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A03() {
        /*
            java.lang.Class r0 = X.C10094RmW.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.C10094RmW.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x0019
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x0019
            return r2
        L_0x0019:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x002e
            return r2
        L_0x002e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.A03():java.lang.reflect.Field");
    }

    public static Unsafe A04() {
        try {
            return (Unsafe) AccessController.doPrivileged(new TLV());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A05(Object obj, long j, int i) {
        A02.A0E(obj, j, i);
    }

    public static void A06(Object obj, long j, Object obj2) {
        A02.A0G(obj, j, obj2);
    }

    public static void A07(Throwable th) {
        Pxf.A11(UnsafeUtil.class).log(Level.WARNING, AnonymousClass7TG.A0m(th, "platform method missing - proto runtime falling back to safer methods: ", AnonymousClass7TE.A1A()));
    }

    public static void A08(byte[] bArr, byte b, long j) {
        A02.A0B(bArr, A01 + j, b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C10094RmW.A01 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class r0 = X.C10094RmW.A00
            if (r0 == 0) goto L_0x000b
            boolean r1 = X.C10094RmW.A01
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r7 = 0
            if (r0 != 0) goto L_0x0010
            return r7
        L_0x0010:
            java.lang.Class r3 = A09     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "peekLong"
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006c }
            r5 = 1
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "pokeLong"
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x006c }
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0, r6}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "pokeInt"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x006c }
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r2, r6}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "peekInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "pokeByte"
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x006c }
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "peekByte"
            java.lang.Class[] r0 = new java.lang.Class[]{r8}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "pokeByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "peekByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch:{ all -> 0x006c }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x006c }
            return r5
        L_0x006c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnsafeUtil.A09(java.lang.Class):boolean");
    }
}
