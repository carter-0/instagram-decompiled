package X;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.9CA  reason: invalid class name */
public final class AnonymousClass9CA {
    public static final long A00 = ((long) A00(byte[].class));
    public static final AnonymousClass9CD A01;
    public static final Unsafe A02 = A03();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06 = A08(Long.TYPE);
    public static final boolean A07;
    public static final Class A08;

    static {
        boolean A0H;
        boolean A0G;
        Class<double[]> cls = double[].class;
        Class<float[]> cls2 = float[].class;
        Class<long[]> cls3 = long[].class;
        Class<int[]> cls4 = int[].class;
        Class<boolean[]> cls5 = boolean[].class;
        Class cls6 = AnonymousClass97X.A00;
        A08 = cls6;
        boolean A082 = A08(Integer.TYPE);
        A05 = A082;
        Unsafe unsafe = A02;
        AnonymousClass9CD r1 = null;
        if (unsafe != null) {
            if (cls6 == null || AnonymousClass97X.A01) {
                r1 = new R28(unsafe);
            } else if (A06) {
                r1 = new AnonymousClass9CC(unsafe);
            } else if (A082) {
                r1 = new C384469hN(unsafe);
            }
        }
        A01 = r1;
        if (r1 == null) {
            A0H = false;
        } else {
            A0H = r1.A0H();
        }
        A04 = A0H;
        AnonymousClass9CD r2 = A01;
        if (r2 == null) {
            A0G = false;
        } else {
            A0G = r2.A0G();
        }
        A03 = A0G;
        A00(cls5);
        boolean z = A03;
        if (z) {
            r2.A07(cls5);
        }
        A00(cls4);
        if (z) {
            r2.A07(cls4);
        }
        A00(cls3);
        if (z) {
            r2.A07(cls3);
        }
        A00(cls2);
        if (z) {
            r2.A07(cls2);
        }
        A00(cls);
        if (z) {
            r2.A07(cls);
        }
        Class<Object[]> cls7 = Object[].class;
        A00(cls7);
        if (z) {
            r2.A07(cls7);
        }
        Field A022 = A02();
        if (!(A022 == null || r2 == null)) {
            r2.A0F(A022);
        }
        boolean z2 = false;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z2 = true;
        }
        A07 = z2;
    }

    public static int A00(Class cls) {
        if (A03) {
            return A01.A03(cls);
        }
        return -1;
    }

    public static Object A01(Class cls) {
        try {
            return A02.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.AnonymousClass97X.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class r0 = X.AnonymousClass97X.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.AnonymousClass97X.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x001d
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            r0 = 2304(0x900, float:3.229E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 == 0) goto L_0x001d
            return r2
        L_0x001d:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0032
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x0032
            return r2
        L_0x0032:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CA.A02():java.lang.reflect.Field");
    }

    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new AnonymousClass9CB());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Object obj, long j, int i) {
        A01.A0B(obj, j, i);
    }

    public static void A05(Object obj, long j, Object obj2) {
        A01.A0D(obj, j, obj2);
    }

    public static void A06(Throwable th) {
        Logger logger = Logger.getLogger(AnonymousClass9CA.class.getName());
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder();
        sb.append(C273654mx.A00(3128));
        sb.append(th);
        logger.log(level, sb.toString());
    }

    public static void A07(byte[] bArr, byte b, long j) {
        A01.A08(bArr, A00 + j, b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.AnonymousClass97X.A01 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class r0 = X.AnonymousClass97X.A00
            if (r0 == 0) goto L_0x000b
            boolean r1 = X.AnonymousClass97X.A01
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r7 = 0
            if (r0 != 0) goto L_0x0010
            return r7
        L_0x0010:
            java.lang.Class r3 = A08     // Catch:{ all -> 0x006c }
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
            r0 = 3129(0xc39, float:4.385E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x006c }
            java.lang.Class[] r1 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch:{ all -> 0x006c }
            r3.getMethod(r0, r1)     // Catch:{ all -> 0x006c }
            r0 = 3120(0xc30, float:4.372E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x006c }
            java.lang.Class[] r1 = new java.lang.Class[]{r8, r4, r2, r2}     // Catch:{ all -> 0x006c }
            r3.getMethod(r0, r1)     // Catch:{ all -> 0x006c }
            return r5
        L_0x006c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CA.A08(java.lang.Class):boolean");
    }
}
