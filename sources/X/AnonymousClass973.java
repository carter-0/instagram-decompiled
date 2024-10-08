package X;

import java.io.IOException;

/* renamed from: X.973  reason: invalid class name */
public abstract class AnonymousClass973 implements AnonymousClass974 {
    public int memoizedHashCode = 0;

    public final int A09(C374899Bg r7) {
        int i;
        AnonymousClass972 r5 = (AnonymousClass972) this;
        int i2 = r5.memoizedSerializedSize;
        if ((i2 & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            if (r7 == null) {
                r7 = AnonymousClass9BZ.A02.A00(r5.getClass());
            }
            i = r7.Bsa(r5);
            if (i < 0) {
                throw new IllegalStateException(002.A0O(Pxd.A00(268), i));
            }
        } else {
            i = i2 & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                if (r7 == null) {
                    r7 = AnonymousClass9BZ.A02.A00(r5.getClass());
                }
                int Bsa = r7.Bsa(r5);
                if (Bsa >= 0) {
                    r5.memoizedSerializedSize = (Bsa & Integer.MAX_VALUE) | (r5.memoizedSerializedSize & AnonymousClass972.MUTABLE_FLAG_MASK);
                    return Bsa;
                }
                throw new IllegalStateException(002.A0O(Pxd.A00(268), Bsa));
            }
        }
        return i;
    }

    public final AnonymousClass97V A0A() {
        try {
            int A09 = A09((C374899Bg) null);
            AnonymousClass97Z r0 = AnonymousClass97R.A02;
            byte[] bArr = new byte[A09];
            C384019gd r2 = new C384019gd(bArr, A09);
            C374899Bg A00 = AnonymousClass9BZ.A02.A00(getClass());
            A8T a8t = r2.A01;
            if (a8t == null) {
                a8t = new A8T(r2);
            }
            A00.FOD(a8t, this);
            if (r2.A02 - r2.A00 == 0) {
                return new AnonymousClass97V(bArr);
            }
            throw new IllegalStateException(Pxd.A00(144));
        } catch (IOException e) {
            throw new RuntimeException(002.A11("Serializing ", getClass().getName(), " to a ", "ByteString", Pxd.A00(111)), e);
        }
    }

    public final byte[] A0B() {
        try {
            int A09 = A09((C374899Bg) null);
            byte[] bArr = new byte[A09];
            C384019gd r2 = new C384019gd(bArr, A09);
            C374899Bg A00 = AnonymousClass9BZ.A02.A00(getClass());
            A8T a8t = r2.A01;
            if (a8t == null) {
                a8t = new A8T(r2);
            }
            A00.FOD(a8t, this);
            if (r2.A02 - r2.A00 == 0) {
                return bArr;
            }
            throw new IllegalStateException(Pxd.A00(144));
        } catch (IOException e) {
            throw new RuntimeException(002.A11("Serializing ", getClass().getName(), " to a ", "byte array", Pxd.A00(111)), e);
        }
    }

    public static C384309h7 A08(C3739997t r2) {
        C384309h7 r1 = (C384309h7) C3741498i.DEFAULT_INSTANCE.A0C();
        r1.A06(r2.A05);
        r1.A05(r2.A02);
        r1.A04(r2.A00);
        return r1;
    }
}
