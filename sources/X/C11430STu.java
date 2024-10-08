package X;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* renamed from: X.STu  reason: case insensitive filesystem */
public final class C11430STu {
    public static final long A00 = ((long) A00(byte[].class));
    public static final S7k A01;
    public static final Unsafe A02 = A03();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06 = A06(Long.TYPE);
    public static final boolean A07 = AnonymousClass7TF.A1W(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    public static final Class A08;

    static {
        boolean A0G;
        boolean A0F;
        Class<double[]> cls = double[].class;
        Class<float[]> cls2 = float[].class;
        Class<long[]> cls3 = long[].class;
        Class<int[]> cls4 = int[].class;
        Class<boolean[]> cls5 = boolean[].class;
        Class cls6 = C10099Rmb.A00;
        A08 = cls6;
        boolean A062 = A06(Integer.TYPE);
        A05 = A062;
        Unsafe unsafe = A02;
        S7k s7k = null;
        if (unsafe != null) {
            if (cls6 == null || C10099Rmb.A01) {
                s7k = new R75(unsafe);
            } else if (A06) {
                s7k = new R74(unsafe);
            } else if (A062) {
                s7k = new R73(unsafe);
            }
        }
        A01 = s7k;
        if (s7k == null) {
            A0G = false;
        } else {
            A0G = s7k.A0G();
        }
        A04 = A0G;
        S7k s7k2 = A01;
        if (s7k2 == null) {
            A0F = false;
        } else {
            A0F = s7k2.A0F();
        }
        A03 = A0F;
        A00(cls5);
        boolean z = A03;
        if (z) {
            s7k2.A07(cls5);
        }
        A00(cls4);
        if (z) {
            s7k2.A07(cls4);
        }
        A00(cls3);
        if (z) {
            s7k2.A07(cls3);
        }
        A00(cls2);
        if (z) {
            s7k2.A07(cls2);
        }
        A00(cls);
        if (z) {
            s7k2.A07(cls);
        }
        Class<Object[]> cls7 = Object[].class;
        A00(cls7);
        if (z) {
            s7k2.A07(cls7);
        }
        Field A022 = A02();
        if (!(A022 == null || s7k2 == null)) {
            s7k2.A0E(A022);
        }
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
        if (X.C10099Rmb.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class r0 = X.C10099Rmb.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.C10099Rmb.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C11430STu.A02():java.lang.reflect.Field");
    }

    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new TLW());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Object obj, long j, Object obj2) {
        A01.A0C(obj, j, obj2);
    }

    public static void A05(Throwable th) {
        Pxf.A11(C11430STu.class).log(Level.WARNING, AnonymousClass7TG.A0m(th, "platform method missing - proto runtime falling back to safer methods: ", AnonymousClass7TE.A1A()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C10099Rmb.A01 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(java.lang.Class r8) {
        /*
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Class r0 = X.C10099Rmb.A00
            if (r0 == 0) goto L_0x000b
            boolean r1 = X.C10099Rmb.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C11430STu.A06(java.lang.Class):boolean");
    }
}
