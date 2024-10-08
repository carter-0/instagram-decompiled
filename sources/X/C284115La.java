package X;

import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.5La  reason: invalid class name and case insensitive filesystem */
public final class C284115La {
    public static final long A00 = ((long) A03(byte[].class));
    public static final C284145Ld A01;
    public static final Logger A02 = Logger.getLogger(C284115La.class.getName());
    public static final Unsafe A03 = A06();
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08;
    public static final Class A09;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014c A[SYNTHETIC, Splitter:B:55:0x014c] */
    static {
        /*
            java.lang.Class<double[]> r12 = double[].class
            java.lang.Class<float[]> r11 = float[].class
            java.lang.Class<long[]> r10 = long[].class
            java.lang.Class<int[]> r9 = int[].class
            java.lang.Class<boolean[]> r8 = boolean[].class
            java.lang.Class<X.5La> r0 = X.C284115La.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            A02 = r0
            sun.misc.Unsafe r0 = A06()
            A03 = r0
            java.lang.Class r14 = X.AnonymousClass5LC.A00
            A09 = r14
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r0 = A0C(r7)
            A07 = r0
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r2 = A0C(r6)
            A06 = r2
            sun.misc.Unsafe r5 = A03
            r1 = 0
            if (r5 == 0) goto L_0x0044
            if (r14 == 0) goto L_0x0055
            boolean r0 = X.AnonymousClass5LC.A01
            if (r0 != 0) goto L_0x0055
            boolean r0 = A07
            if (r0 == 0) goto L_0x004d
            X.5Lc r1 = new X.5Lc
            r1.<init>(r5)
        L_0x0044:
            A01 = r1
            java.lang.String r3 = "copyMemory"
            java.lang.String r13 = "getLong"
            if (r5 == 0) goto L_0x00df
            goto L_0x005b
        L_0x004d:
            if (r2 == 0) goto L_0x0044
            X.QBr r1 = new X.QBr
            r1.<init>(r5)
            goto L_0x0044
        L_0x0055:
            X.QBs r1 = new X.QBs
            r1.<init>(r5)
            goto L_0x0044
        L_0x005b:
            java.lang.Class r2 = r5.getClass()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r4, r7}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r13, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.reflect.Field r0 = A05()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00df
            if (r14 == 0) goto L_0x007f
            boolean r0 = X.AnonymousClass5LC.A01     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00e1
        L_0x007f:
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[]{r7}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "putByte"
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00c4 }
            java.lang.Class[] r0 = new java.lang.Class[]{r7, r0}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "getInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r7}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "putInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r7, r6}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.Class[] r0 = new java.lang.Class[]{r7}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r13, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[]{r7, r7}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.Class[] r0 = new java.lang.Class[]{r7, r7, r7}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r3, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.Class[] r0 = new java.lang.Class[]{r4, r7, r4, r7, r7}     // Catch:{ all -> 0x00c4 }
            r2.getMethod(r3, r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x00e1
        L_0x00c4:
            r4 = move-exception
            java.util.logging.Logger r3 = A02
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3.log(r2, r0)
            r0 = 0
            goto L_0x00e2
        L_0x00df:
            r0 = 0
            goto L_0x00e2
        L_0x00e1:
            r0 = 1
        L_0x00e2:
            A05 = r0
            if (r5 != 0) goto L_0x014c
            r0 = 0
        L_0x00e7:
            A04 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = A03(r0)
            long r0 = (long) r0
            A00 = r0
            A03(r8)
            boolean r2 = A04
            if (r2 == 0) goto L_0x00fe
            X.5Ld r0 = A01
            r0.A07(r8)
        L_0x00fe:
            A03(r9)
            if (r2 == 0) goto L_0x0108
            X.5Ld r0 = A01
            r0.A07(r9)
        L_0x0108:
            A03(r10)
            if (r2 == 0) goto L_0x0112
            X.5Ld r0 = A01
            r0.A07(r10)
        L_0x0112:
            A03(r11)
            if (r2 == 0) goto L_0x011c
            X.5Ld r0 = A01
            r0.A07(r11)
        L_0x011c:
            A03(r12)
            if (r2 == 0) goto L_0x0126
            X.5Ld r0 = A01
            r0.A07(r12)
        L_0x0126:
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            A03(r1)
            if (r2 == 0) goto L_0x0132
            X.5Ld r0 = A01
            r0.A07(r1)
        L_0x0132:
            java.lang.reflect.Field r1 = A05()
            if (r1 == 0) goto L_0x013f
            X.5Ld r0 = A01
            if (r0 == 0) goto L_0x013f
            r0.A0F(r1)
        L_0x013f:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0 = 0
            if (r2 != r1) goto L_0x0149
            r0 = 1
        L_0x0149:
            A08 = r0
            return
        L_0x014c:
            java.lang.Class r2 = r5.getClass()     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "arrayBaseOffset"
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r0 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "getInt"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "putInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7, r6}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r13, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7, r3}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            if (r14 == 0) goto L_0x01ab
            boolean r0 = X.AnonymousClass5LC.A01     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x01fb
        L_0x01ab:
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "putByte"
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x01fe }
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7, r0}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "putBoolean"
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01fe }
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7, r0}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "putFloat"
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x01fe }
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7, r0}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "putDouble"
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x01fe }
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r7, r0}     // Catch:{ all -> 0x01fe }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x01fe }
        L_0x01fb:
            r0 = 1
            goto L_0x00e7
        L_0x01fe:
            r4 = move-exception
            java.util.logging.Logger r3 = A02
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3.log(r2, r0)
            r0 = 0
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284115La.<clinit>():void");
    }

    public static byte A00(Object obj, long j) {
        return (byte) ((A01.A04(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255);
    }

    public static byte A01(Object obj, long j) {
        return (byte) ((A01.A04(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static byte A02(byte[] bArr, long j) {
        return A01.A00(bArr, A00 + j);
    }

    public static int A03(Class cls) {
        if (A04) {
            return A01.A03(cls);
        }
        return -1;
    }

    public static Object A04(Class cls) {
        try {
            return A03.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.AnonymousClass5LC.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A05() {
        /*
            java.lang.Class r0 = X.AnonymousClass5LC.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.AnonymousClass5LC.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C284115La.A05():java.lang.reflect.Field");
    }

    public static Unsafe A06() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C284125Lb());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A07(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        int i2 = (255 & b) << i;
        A09(obj, j2, i2 | (A01.A04(obj, j2) & ((255 << i) ^ -1)));
    }

    public static void A08(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (255 & b) << i;
        A09(obj, j2, i2 | (A01.A04(obj, j2) & ((255 << i) ^ -1)));
    }

    public static void A09(Object obj, long j, int i) {
        A01.A0B(obj, j, i);
    }

    public static void A0A(Object obj, long j, Object obj2) {
        A01.A0D(obj, j, obj2);
    }

    public static void A0B(byte[] bArr, byte b, long j) {
        A01.A08(bArr, A00 + j, b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.AnonymousClass5LC.A01 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class r0 = X.AnonymousClass5LC.A00
            if (r0 == 0) goto L_0x000b
            boolean r1 = X.AnonymousClass5LC.A01
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r7 = 0
            if (r0 != 0) goto L_0x0010
            return r7
        L_0x0010:
            java.lang.Class r3 = A09     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "peekLong"
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0064 }
            r5 = 1
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "pokeLong"
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0, r6}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "pokeInt"
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r2, r6}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "peekInt"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r6}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "pokeByte"
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0064 }
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r0}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "peekByte"
            java.lang.Class[] r0 = new java.lang.Class[]{r8}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "pokeByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "peekByteArray"
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch:{ all -> 0x0064 }
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x0064 }
            return r5
        L_0x0064:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284115La.A0C(java.lang.Class):boolean");
    }
}
