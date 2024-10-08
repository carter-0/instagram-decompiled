package X;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.Pyc  reason: case insensitive filesystem */
public abstract class C7189Pyc extends RLH {
    public static final Logger A01 = Pxf.A11(C7189Pyc.class);
    public static final boolean A02 = C284115La.A04;
    public C7194Pyh A00;

    public static int A00(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int A01(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public final void A07(int i) {
        C7193Pyg pyg = (C7193Pyg) this;
        C7193Pyg.A06(pyg, 5);
        pyg.A0H(i);
    }

    public final void A08(int i, int i2) {
        C7193Pyg pyg = (C7193Pyg) this;
        C7193Pyg.A06(pyg, 14);
        pyg.A0H((i << 3) | 5);
        pyg.A0G(i2);
    }

    public final void A09(int i, int i2) {
        C7193Pyg pyg = (C7193Pyg) this;
        C7193Pyg.A06(pyg, 20);
        pyg.A0H(i << 3);
        if (i2 >= 0) {
            pyg.A0H(i2);
        } else {
            pyg.A0J((long) i2);
        }
    }

    public final void A0A(int i, long j) {
        C7193Pyg pyg = (C7193Pyg) this;
        C7193Pyg.A06(pyg, 18);
        pyg.A0H((i << 3) | 1);
        pyg.A0I(j);
    }

    public final void A0B(int i, long j) {
        C7193Pyg pyg = (C7193Pyg) this;
        C7193Pyg.A06(pyg, 20);
        pyg.A0H(i << 3);
        pyg.A0J(j);
    }

    public final void A0C(long j) {
        C7193Pyg pyg = (C7193Pyg) this;
        C7193Pyg.A06(pyg, 10);
        pyg.A0J(j);
    }

    public final void A0D(AnonymousClass5L9 r5) {
        C7193Pyg pyg = (C7193Pyg) this;
        pyg.A07(r5.A03());
        AnonymousClass5LA r52 = (AnonymousClass5LA) r5;
        pyg.A0K(r52.A00, r52.A04(), r52.A03());
    }

    public final void A0E(String str) {
        int i;
        int i2;
        int i3;
        C7193Pyg pyg = (C7193Pyg) this;
        try {
            int length = str.length();
            int i4 = length * 3;
            int A002 = A00(i4);
            int i5 = A002 + i4;
            int i6 = pyg.A02;
            if (i5 > i6) {
                byte[] bArr = new byte[i4];
                int A003 = C284185Lh.A00.A00(str, bArr, 0, i4);
                pyg.A07(A003);
                pyg.A0K(bArr, 0, A003);
                return;
            }
            if (i5 > i6 - pyg.A00) {
                C7193Pyg.A05(pyg);
            }
            int A004 = A00(length);
            i = pyg.A00;
            if (A004 == A002) {
                int i7 = i + A004;
                pyg.A00 = i7;
                i3 = C284185Lh.A00.A00(str, pyg.A03, i7, i6 - i7);
                pyg.A00 = i;
                i2 = (i3 - i) - A004;
                pyg.A0H(i2);
            } else {
                i2 = C284185Lh.A00(str);
                pyg.A0H(i2);
                i3 = C284185Lh.A00.A00(str, pyg.A03, pyg.A00, i2);
            }
            pyg.A00 = i3;
            pyg.A01 += i2;
        } catch (C8996RKp e) {
            pyg.A01 -= pyg.A00 - i;
            pyg.A00 = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
        } catch (C8996RKp e3) {
            A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e3);
            byte[] bytes = str.getBytes(C284045Ks.A03);
            try {
                int length2 = bytes.length;
                pyg.A07(length2);
                pyg.A0K(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e4) {
                throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e4);
            } catch (RCR e5) {
                throw e5;
            }
        }
    }

    public final void A0F(boolean z) {
        byte b = z ? (byte) 1 : 0;
        C7193Pyg pyg = (C7193Pyg) this;
        if (pyg.A00 == pyg.A02) {
            C7193Pyg.A05(pyg);
        }
        byte[] bArr = pyg.A03;
        int i = pyg.A00;
        pyg.A00 = i + 1;
        bArr[i] = b;
        pyg.A01++;
    }

    public static int A02(AnonymousClass5L9 r1, int i) {
        int A002 = A00(i << 3);
        int A03 = r1.A03();
        return A002 + A00(A03) + A03;
    }

    @Deprecated
    public static int A03(C284005Km r4, AnonymousClass5L3 r5, int i) {
        int A002 = A00(i << 3) * 2;
        C283995Kl r42 = (C283995Kl) r4;
        C283985Kk r2 = (C283985Kk) r42;
        int i2 = r2.memoizedSerializedSize;
        if (i2 == -1) {
            i2 = r5.Bsa(r42);
            r2.memoizedSerializedSize = i2;
        }
        return A002 + i2;
    }

    public static int A04(String str) {
        int i;
        String str2;
        try {
            str2 = str;
            int A002 = C284185Lh.A00(str);
            str2 = A002;
            i = A002;
        } catch (C8996RKp unused) {
            i = str2.getBytes(C284045Ks.A03).length;
        }
        return A00(i) + i;
    }
}
