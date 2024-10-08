package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WzE  reason: case insensitive filesystem */
public final class C20802WzE extends C2590140a {
    public final AnonymousClass40W A00;
    public final AnonymousClass40R A01;

    public static void A00(String str, String str2, AnonymousClass40W r5) {
        r5.A0F(002.A0v(AnonymousClass000.A00(947), str, AnonymousClass000.A00(838), str2, '\''), "", r5.A00);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte ANj() {
        /*
            r5 = this;
            X.40W r4 = r5.A00
            java.lang.String r3 = r4.A0A()
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0027 }
            X.8eN r0 = X.C18281Vp1.A00(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
            if (r0 == 0) goto L_0x001f
            int r2 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0027 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r2 ^ r0
            r0 = -2147483393(0xffffffff800000ff, float:-3.57E-43)
            if (r1 == r0) goto L_0x001d
            if (r1 >= r0) goto L_0x001f
        L_0x001d:
            byte r0 = (byte) r2     // Catch:{ IllegalArgumentException -> 0x0027 }
            return r0
        L_0x001f:
            X.00y.A0o(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IllegalArgumentException -> 0x0027 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0027 }
        L_0x0027:
            java.lang.String r0 = "UByte"
            A00(r0, r3, r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20802WzE.ANj():byte");
    }

    public final int ANp(SerialDescriptor serialDescriptor) {
        throw new IllegalStateException("unsupported");
    }

    public final int ANy() {
        AnonymousClass40W r2 = this.A00;
        String A0A = r2.A0A();
        try {
            0qQ.A0B(A0A, 0);
            C360308eN A002 = C18281Vp1.A00(A0A);
            if (A002 != null) {
                return A002.A00;
            }
            00y.A0o(A0A);
            throw AnonymousClass00P.createAndThrow();
        } catch (IllegalArgumentException unused) {
            A00("UInt", A0A, r2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final long AO1() {
        AnonymousClass40W r2 = this.A00;
        String A0A = r2.A0A();
        try {
            0qQ.A0B(A0A, 0);
            C360238eG A012 = C18281Vp1.A01(A0A);
            if (A012 != null) {
                return A012.A00;
            }
            00y.A0o(A0A);
            throw AnonymousClass00P.createAndThrow();
        } catch (IllegalArgumentException unused) {
            A00("ULong", A0A, r2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final short AO7() {
        /*
            r5 = this;
            X.40W r4 = r5.A00
            java.lang.String r3 = r4.A0A()
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0027 }
            X.8eN r0 = X.C18281Vp1.A00(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
            if (r0 == 0) goto L_0x001f
            int r2 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0027 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r2 ^ r0
            r0 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            if (r1 == r0) goto L_0x001d
            if (r1 >= r0) goto L_0x001f
        L_0x001d:
            short r0 = (short) r2     // Catch:{ IllegalArgumentException -> 0x0027 }
            return r0
        L_0x001f:
            X.00y.A0o(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IllegalArgumentException -> 0x0027 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0027 }
        L_0x0027:
            java.lang.String r0 = "UShort"
            A00(r0, r3, r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20802WzE.AO7():short");
    }

    public final AnonymousClass40R Bsb() {
        return this.A01;
    }

    public C20802WzE(C250863mB r2, AnonymousClass40W r3) {
        AnonymousClass7TG.A1O(r3, r2);
        this.A00 = r3;
        this.A01 = r2.A02;
    }
}
