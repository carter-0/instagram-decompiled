package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.97U  reason: invalid class name */
public abstract class AnonymousClass97U {
    public int A00;
    public AnonymousClass9CF A01;

    public final double A06() {
        long A0U;
        if (this instanceof AnonymousClass9BY) {
            A0U = ((AnonymousClass9BY) this).A0U();
        } else {
            A0U = ((AnonymousClass97T) this).A0U();
        }
        return Double.longBitsToDouble(A0U);
    }

    public final float A07() {
        int A0S;
        if (this instanceof AnonymousClass9BY) {
            A0S = ((AnonymousClass9BY) this).A0S();
        } else {
            A0S = ((AnonymousClass97T) this).A0S();
        }
        return Float.intBitsToFloat(A0S);
    }

    public final int A08() {
        if (this instanceof AnonymousClass9BY) {
            AnonymousClass9BY r0 = (AnonymousClass9BY) this;
            return r0.A04 + r0.A03;
        }
        AnonymousClass97T r02 = (AnonymousClass97T) this;
        return r02.A03 - r02.A04;
    }

    public final int A09() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0T();
        }
        return ((AnonymousClass97T) this).A0T();
    }

    public final int A0A() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0S();
        }
        return ((AnonymousClass97T) this).A0S();
    }

    public final int A0B() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0T();
        }
        return ((AnonymousClass97T) this).A0T();
    }

    public final int A0C() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0S();
        }
        return ((AnonymousClass97T) this).A0S();
    }

    public final int A0D() {
        int A0T;
        if (this instanceof AnonymousClass9BY) {
            A0T = ((AnonymousClass9BY) this).A0T();
        } else {
            A0T = ((AnonymousClass97T) this).A0T();
        }
        return (-(A0T & 1)) ^ (A0T >>> 1);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final int A0E() {
        if (this instanceof AnonymousClass9BY) {
            AnonymousClass9BY r2 = (AnonymousClass9BY) this;
            if (r2.A0Q()) {
                r2.A02 = 0;
                return 0;
            }
            int A0T = r2.A0T();
            r2.A02 = A0T;
            if ((A0T >>> 3) != 0) {
                return A0T;
            }
            ? iOException = new IOException(Pxd.A00(16));
            iOException.A00 = null;
            throw iOException;
        }
        AnonymousClass97T r22 = (AnonymousClass97T) this;
        if (r22.A0Q()) {
            r22.A01 = 0;
            return 0;
        }
        int A0T2 = r22.A0T();
        r22.A01 = A0T2;
        if ((A0T2 >>> 3) != 0) {
            return A0T2;
        }
        ? iOException2 = new IOException(Pxd.A00(16));
        iOException2.A00 = null;
        throw iOException2;
    }

    public final int A0F() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0T();
        }
        return ((AnonymousClass97T) this).A0T();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final int A0G(int i) {
        if (this instanceof AnonymousClass97T) {
            AnonymousClass97T r2 = (AnonymousClass97T) this;
            if (i >= 0) {
                int i2 = i + (r2.A03 - r2.A04);
                if (i2 >= 0) {
                    int i3 = r2.A00;
                    if (i2 <= i3) {
                        r2.A00 = i2;
                        AnonymousClass97T.A00(r2);
                        return i3;
                    }
                } else {
                    ? iOException = new IOException("Failed to parse the message.");
                    iOException.A00 = null;
                    throw iOException;
                }
            }
            ? iOException2 = new IOException(C273654mx.A00(6));
            iOException2.A00 = null;
            throw iOException2;
        }
        AnonymousClass9BY r22 = (AnonymousClass9BY) this;
        if (i >= 0) {
            int i4 = i + r22.A04 + r22.A03;
            int i5 = r22.A01;
            if (i4 <= i5) {
                r22.A01 = i4;
                AnonymousClass9BY.A01(r22);
                return i5;
            }
        }
        ? iOException22 = new IOException(C273654mx.A00(6));
        iOException22.A00 = null;
        throw iOException22;
        throw AnonymousClass9GO.A01();
    }

    public final long A0H() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0U();
        }
        return ((AnonymousClass97T) this).A0U();
    }

    public final long A0I() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0V();
        }
        return ((AnonymousClass97T) this).A0V();
    }

    public final long A0J() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0U();
        }
        return ((AnonymousClass97T) this).A0U();
    }

    public final long A0K() {
        long A0V;
        if (this instanceof AnonymousClass9BY) {
            A0V = ((AnonymousClass9BY) this).A0V();
        } else {
            A0V = ((AnonymousClass97T) this).A0V();
        }
        return (-(A0V & 1)) ^ (A0V >>> 1);
    }

    public final long A0L() {
        if (this instanceof AnonymousClass9BY) {
            return ((AnonymousClass9BY) this).A0V();
        }
        return ((AnonymousClass97T) this).A0V();
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final AnonymousClass97R A0M() {
        if (this instanceof AnonymousClass97T) {
            AnonymousClass97T r3 = (AnonymousClass97T) this;
            int A0T = r3.A0T();
            if (A0T > 0) {
                int i = r3.A02;
                int i2 = r3.A03;
                if (A0T <= i - i2) {
                    AnonymousClass97V A012 = AnonymousClass97R.A01(r3.A06, i2, A0T);
                    r3.A03 += A0T;
                    return A012;
                }
                throw AnonymousClass9GO.A01();
            } else if (A0T != 0) {
                ? iOException = new IOException(C273654mx.A00(6));
                iOException.A00 = null;
                throw iOException;
            }
        } else {
            AnonymousClass9BY r6 = (AnonymousClass9BY) this;
            int A0T2 = r6.A0T();
            int i3 = r6.A00;
            int i4 = r6.A03;
            if (A0T2 <= i3 - i4 && A0T2 > 0) {
                AnonymousClass97V A013 = AnonymousClass97R.A01(r6.A07, i4, A0T2);
                r6.A03 += A0T2;
                return A013;
            } else if (A0T2 != 0) {
                byte[] A05 = AnonymousClass9BY.A05(r6, A0T2);
                if (A05 != null) {
                    return AnonymousClass97R.A01(A05, 0, A05.length);
                }
                int i5 = r6.A03;
                int i6 = r6.A00;
                int i7 = i6 - i5;
                r6.A04 += i6;
                r6.A03 = 0;
                r6.A00 = 0;
                ArrayList A002 = AnonymousClass9BY.A00(r6, A0T2 - i7);
                byte[] bArr = new byte[A0T2];
                System.arraycopy(r6.A07, i5, bArr, 0, i7);
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i7, length);
                    i7 += length;
                }
                return new AnonymousClass97V(bArr);
            }
        }
        return AnonymousClass97R.A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0N() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass9BY
            if (r0 == 0) goto L_0x0023
            r4 = r6
            X.9BY r4 = (X.AnonymousClass9BY) r4
            int r3 = r4.A0T()
            if (r3 <= 0) goto L_0x0052
            int r0 = r4.A00
            int r2 = r4.A03
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x0057
            byte[] r1 = r4.A07
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2, r3, r0)
        L_0x001d:
            int r0 = r4.A03
            int r0 = r0 + r3
            r4.A03 = r0
            return r5
        L_0x0023:
            r4 = r6
            X.97T r4 = (X.AnonymousClass97T) r4
            int r3 = r4.A0T()
            if (r3 <= 0) goto L_0x0042
            int r0 = r4.A02
            int r2 = r4.A03
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x006a
            byte[] r1 = r4.A06
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2, r3, r0)
            int r0 = r4.A03
            int r0 = r0 + r3
            r4.A03 = r0
            return r5
        L_0x0042:
            if (r3 == 0) goto L_0x0054
            r0 = 6
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x0052:
            if (r3 != 0) goto L_0x0057
        L_0x0054:
            java.lang.String r5 = ""
            return r5
        L_0x0057:
            int r0 = r4.A00
            if (r3 > r0) goto L_0x006f
            X.AnonymousClass9BY.A02(r4, r3)
            byte[] r2 = r4.A07
            int r1 = r4.A03
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2, r1, r3, r0)
            goto L_0x001d
        L_0x006a:
            X.9GO r1 = X.AnonymousClass9GO.A01()
            throw r1
        L_0x006f:
            byte[] r1 = X.AnonymousClass9BY.A04(r4, r3)
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass97U.A0N():java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final String A0O() {
        byte[] A04;
        if (this instanceof AnonymousClass9BY) {
            AnonymousClass9BY r4 = (AnonymousClass9BY) this;
            int A0T = r4.A0T();
            int i = r4.A03;
            int i2 = r4.A00;
            if (A0T <= i2 - i && A0T > 0) {
                A04 = r4.A07;
                r4.A03 = i + A0T;
            } else if (A0T == 0) {
                return "";
            } else {
                if (A0T <= i2) {
                    AnonymousClass9BY.A02(r4, A0T);
                    A04 = r4.A07;
                    r4.A03 = A0T;
                } else {
                    A04 = AnonymousClass9BY.A04(r4, A0T);
                }
                i = 0;
            }
            return AnonymousClass9CG.A00.A02(A04, i, A0T);
        }
        AnonymousClass97T r42 = (AnonymousClass97T) this;
        int A0T2 = r42.A0T();
        if (A0T2 > 0) {
            int i3 = r42.A02;
            int i4 = r42.A03;
            if (A0T2 <= i3 - i4) {
                String A02 = AnonymousClass9CG.A00.A02(r42.A06, i4, A0T2);
                r42.A03 += A0T2;
                return A02;
            }
            throw AnonymousClass9GO.A01();
        } else if (A0T2 == 0) {
            return "";
        } else {
            ? iOException = new IOException(C273654mx.A00(6));
            iOException.A00 = null;
            throw iOException;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final void A0P() {
        if (this instanceof AnonymousClass97T) {
            if (((AnonymousClass97T) this).A01 != 0) {
                ? iOException = new IOException(Pxd.A00(11));
                iOException.A00 = null;
                throw iOException;
            }
        } else if (((AnonymousClass9BY) this).A02 != 0) {
            ? iOException2 = new IOException(Pxd.A00(11));
            iOException2.A00 = null;
            throw iOException2;
        }
    }

    public final boolean A0Q() {
        boolean z;
        if (this instanceof AnonymousClass9BY) {
            AnonymousClass9BY r3 = (AnonymousClass9BY) this;
            z = true;
            if (r3.A03 != r3.A00 || AnonymousClass9BY.A03(r3, 1)) {
                return false;
            }
        } else {
            AnonymousClass97T r0 = (AnonymousClass97T) this;
            z = false;
            if (r0.A03 == r0.A02) {
                return true;
            }
        }
        return z;
    }

    public final boolean A0R() {
        long A0V;
        if (this instanceof AnonymousClass9BY) {
            A0V = ((AnonymousClass9BY) this).A0V();
        } else {
            A0V = ((AnonymousClass97T) this).A0V();
        }
        if (A0V != 0) {
            return true;
        }
        return false;
    }
}
