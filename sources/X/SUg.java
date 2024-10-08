package X;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class SUg {
    public static final long A00 = ((long) A02(byte[].class));
    public static final boolean A01;
    public static final S7V A02;
    public static final Class A03 = Memory.class;
    public static final Unsafe A04;
    public static final boolean A05;
    public static final boolean A06;

    public static boolean A0P() {
        return A06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0112  */
    static {
        /*
            java.lang.Class<double[]> r13 = double[].class
            java.lang.Class<float[]> r12 = float[].class
            java.lang.Class<long[]> r11 = long[].class
            java.lang.Class<int[]> r10 = int[].class
            java.lang.Class<boolean[]> r9 = boolean[].class
            sun.misc.Unsafe r4 = A09()
            A04 = r4
            java.lang.Class<libcore.io.Memory> r0 = libcore.io.Memory.class
            A03 = r0
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = A0Q(r2)
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r1 = A0Q(r7)
            r0 = 0
            if (r4 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x0037
            X.QxX r0 = new X.QxX
            r0.<init>(r4)
        L_0x002a:
            A02 = r0
            java.lang.String r5 = "getLong"
            java.lang.String r3 = "objectFieldOffset"
            r8 = 1
            if (r0 == 0) goto L_0x0061
            sun.misc.Unsafe r0 = r0.A00
            goto L_0x003f
        L_0x0037:
            if (r1 == 0) goto L_0x002a
            X.QxW r0 = new X.QxW
            r0.<init>(r4)
            goto L_0x002a
        L_0x003f:
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x005d }
            r1.getMethod(r3, r0)     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r2}     // Catch:{ all -> 0x005d }
            r1.getMethod(r5, r0)     // Catch:{ all -> 0x005d }
            java.lang.reflect.Field r0 = A07()     // Catch:{ all -> 0x005d }
            r1 = 1
            if (r0 != 0) goto L_0x0062
            goto L_0x0061
        L_0x005d:
            r0 = move-exception
            X.Pxf.A11(X.SUg.class).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x0061:
            r1 = 0
        L_0x0062:
            A05 = r1
            X.S7V r6 = A02
            if (r6 == 0) goto L_0x00c9
            sun.misc.Unsafe r0 = r6.A00
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00c5 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r3, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "arrayBaseOffset"
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r0 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "getInt"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r2}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "putInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r2, r7}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r2}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r5, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r2, r2}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r2}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r2, r3}     // Catch:{ all -> 0x00c5 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00cb
        L_0x00c5:
            r0 = move-exception
            X.Pxf.A11(X.SUg.class).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
        L_0x00c9:
            r0 = 0
            goto L_0x00cc
        L_0x00cb:
            r0 = 1
        L_0x00cc:
            A06 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = A02(r0)
            long r0 = (long) r0
            A00 = r0
            A02(r9)
            A0A(r9)
            A02(r10)
            A0A(r10)
            A02(r11)
            A0A(r11)
            A02(r12)
            A0A(r12)
            A02(r13)
            A0A(r13)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A02(r0)
            A0A(r0)
            java.lang.reflect.Field r1 = A07()
            if (r1 == 0) goto L_0x010a
            if (r6 == 0) goto L_0x010a
            sun.misc.Unsafe r0 = r6.A00
            r0.objectFieldOffset(r1)
        L_0x010a:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x0113
            r8 = 0
        L_0x0113:
            A01 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUg.<clinit>():void");
    }

    public static double A00(Object obj, long j) {
        return A02.A00(obj, j);
    }

    public static float A01(Object obj, long j) {
        return A02.A01(obj, j);
    }

    public static int A02(Class cls) {
        if (A06) {
            return A02.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int A03(Object obj, long j) {
        return A02.A00.getInt(obj, j);
    }

    public static long A04(Object obj, long j) {
        return A02.A00.getLong(obj, j);
    }

    public static Object A05(Class cls) {
        try {
            return A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object A06(Object obj, long j) {
        return A02.A00.getObject(obj, j);
    }

    public static Field A07() {
        Field A08 = A08("effectiveDirectAddress");
        if (A08 != null || ((A08 = A08("address")) != null && A08.getType() == Long.TYPE)) {
            return A08;
        }
        return null;
    }

    public static Field A08(String str) {
        try {
            return Buffer.class.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Unsafe A09() {
        try {
            return (Unsafe) AccessController.doPrivileged(new TLU());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A0A(Class cls) {
        if (A06) {
            A02.A00.arrayIndexScale(cls);
        }
    }

    public static void A0B(Object obj, long j, byte b) {
        Unsafe unsafe = A02.A00;
        long j2 = -4 & j;
        unsafe.putInt(obj, j2, Pxh.A05(((int) j) ^ -1, unsafe.getInt(obj, j2), b));
    }

    public static void A0C(Object obj, long j, byte b) {
        Unsafe unsafe = A02.A00;
        long j2 = -4 & j;
        unsafe.putInt(obj, j2, Pxh.A05((int) j, unsafe.getInt(obj, j2), b));
    }

    public static void A0F(Object obj, long j, double d) {
        A02.A03(obj, j, d);
    }

    public static void A0G(Object obj, long j, float f) {
        A02.A04(obj, j, f);
    }

    public static void A0H(Object obj, long j, int i) {
        A02.A00.putInt(obj, j, i);
    }

    public static void A0I(Object obj, long j, long j2) {
        A02.A00.putLong(obj, j, j2);
    }

    public static void A0J(Object obj, long j, Object obj2) {
        A02.A00.putObject(obj, j, obj2);
    }

    public static void A0K(Object obj, long j, boolean z) {
        A02.A05(obj, j, z);
    }

    public static void A0O(byte[] bArr, byte b, long j) {
        A02.A02(bArr, A00 + j, b);
    }

    public static boolean A0Q(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class cls3 = A03;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A0R(Object obj, long j) {
        return A02.A06(obj, j);
    }
}
