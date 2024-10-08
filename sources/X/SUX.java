package X;

import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class SUX {
    public static final C11034S6m A00;
    public static final boolean A01;
    public static final boolean A02;
    public static final Class A03 = Memory.class;
    public static final Unsafe A04;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r1.getDeclaredField("effectiveDirectAddress") == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x013a, code lost:
        if (r1 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0148, code lost:
        if (r1.getType() == r5) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014a, code lost:
        if (r1 == null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014c, code lost:
        if (r9 == null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014e, code lost:
        r9.A00.objectFieldOffset(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015b  */
    static {
        /*
            java.lang.Class<double[]> r15 = double[].class
            java.lang.Class<float[]> r14 = float[].class
            java.lang.Class<long[]> r13 = long[].class
            java.lang.Class<int[]> r12 = int[].class
            java.lang.Class<boolean[]> r11 = boolean[].class
            sun.misc.Unsafe r3 = A03()
            A04 = r3
            java.lang.Class<libcore.io.Memory> r0 = libcore.io.Memory.class
            A03 = r0
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r2 = A0C(r5)
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r1 = A0C(r8)
            r0 = 0
            if (r3 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x0037
            X.QuM r0 = new X.QuM
            r0.<init>(r3)
        L_0x002a:
            A00 = r0
            java.lang.String r7 = "getLong"
            java.lang.String r6 = "objectFieldOffset"
            r10 = 1
            if (r0 == 0) goto L_0x0086
            sun.misc.Unsafe r0 = r0.A00
            goto L_0x003f
        L_0x0037:
            if (r1 == 0) goto L_0x002a
            X.QuL r0 = new X.QuL
            r0.<init>(r3)
            goto L_0x002a
        L_0x003f:
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x006b }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x006b }
            r1.getMethod(r6, r0)     // Catch:{ all -> 0x006b }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r5}     // Catch:{ all -> 0x006b }
            r1.getMethod(r7, r0)     // Catch:{ all -> 0x006b }
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0086
        L_0x005f:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0086
            r0.getType()     // Catch:{ all -> 0x006b }
            goto L_0x0086
        L_0x006b:
            r1 = move-exception
            java.lang.Class<X.SUX> r0 = X.SUX.class
            java.util.logging.Logger r4 = X.Pxf.A11(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = r0.concat(r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "logMissingMethod"
            r4.logp(r3, r1, r0, r2)
        L_0x0086:
            X.S6m r9 = A00
            if (r9 == 0) goto L_0x0102
            sun.misc.Unsafe r0 = r9.A00
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x00e7 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r6, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "arrayBaseOffset"
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r0 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "getInt"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r5}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "putInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r5, r8}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r5}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r7, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r5, r5}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r5}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r5, r3}     // Catch:{ all -> 0x00e7 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x0104
        L_0x00e7:
            r1 = move-exception
            java.lang.Class<X.SUX> r0 = X.SUX.class
            java.util.logging.Logger r4 = X.Pxf.A11(r0)
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r2 = r0.concat(r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "logMissingMethod"
            r4.logp(r3, r1, r0, r2)
        L_0x0102:
            r0 = 0
            goto L_0x0105
        L_0x0104:
            r0 = 1
        L_0x0105:
            A02 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            A05(r0)
            A05(r11)
            A06(r11)
            A05(r12)
            A06(r12)
            A05(r13)
            A06(r13)
            A05(r14)
            A06(r14)
            A05(r15)
            A06(r15)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            A05(r0)
            A06(r0)
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r1 = r2.getDeclaredField(r0)     // Catch:{ all -> 0x013c }
            if (r1 != 0) goto L_0x014a
        L_0x013c:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r1 = r2.getDeclaredField(r0)     // Catch:{ all -> 0x0153 }
            if (r1 == 0) goto L_0x0153
            java.lang.Class r0 = r1.getType()
            if (r0 != r5) goto L_0x0153
        L_0x014a:
            if (r1 == 0) goto L_0x0153
            if (r9 == 0) goto L_0x0153
            sun.misc.Unsafe r0 = r9.A00
            r0.objectFieldOffset(r1)
        L_0x0153:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 == r0) goto L_0x015c
            r10 = 0
        L_0x015c:
            A01 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUX.<clinit>():void");
    }

    public static int A00(Object obj, long j) {
        return A00.A00.getInt(obj, j);
    }

    public static long A01(Object obj, long j) {
        return A00.A00.getLong(obj, j);
    }

    public static Object A02(Object obj, long j) {
        return A00.A00.getObject(obj, j);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Class cls) {
        try {
            A04.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void A05(Class cls) {
        if (A02) {
            A00.A00.arrayBaseOffset(cls);
        }
    }

    public static void A06(Class cls) {
        if (A02) {
            A00.A00.arrayIndexScale(cls);
        }
    }

    public static void A07(Object obj, long j, int i) {
        A00.A00.putInt(obj, j, i);
    }

    public static void A08(Object obj, long j, long j2) {
        A00.A00.putLong(obj, j, j2);
    }

    public static void A09(Object obj, long j, Object obj2) {
        A00.A00.putObject(obj, j, obj2);
    }

    public static /* synthetic */ void A0A(Object obj, long j, boolean z) {
        Unsafe unsafe = A00.A00;
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        int i2 = (z ? 1 : 0) << i;
        unsafe.putInt(obj, j2, i2 | (((255 << i) ^ -1) & unsafe.getInt(obj, j2)));
    }

    public static /* synthetic */ void A0B(Object obj, long j, boolean z) {
        Unsafe unsafe = A00.A00;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (z ? 1 : 0) << i;
        unsafe.putInt(obj, j2, i2 | (((255 << i) ^ -1) & unsafe.getInt(obj, j2)));
    }

    public static boolean A0C(Class cls) {
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
}
