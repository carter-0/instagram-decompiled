package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import org.webrtc.EglBase14Impl;

/* renamed from: X.T8z  reason: case insensitive filesystem */
public abstract class C12828T8z implements Closeable {
    public static final String[] A04 = new String[128];
    public int A00;
    public int[] A01 = new int[32];
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];

    public static void A0A(C7494QGl qGl) {
        qGl.A00 = 0;
        int[] iArr = qGl.A01;
        int i = qGl.A00 - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double A0B() {
        /*
            r8 = this;
            r5 = r8
            X.QGl r5 = (X.C7494QGl) r5
            int r1 = A07(r5)
            r0 = 16
            if (r1 != r0) goto L_0x0012
            A0A(r5)
            long r0 = r5.A02
            double r2 = (double) r0
            return r2
        L_0x0012:
            r0 = 17
            java.lang.String r3 = "Expected a double but was "
            r7 = 11
            java.lang.String r4 = " at path "
            if (r1 != r0) goto L_0x002c
            X.TPe r6 = r5.A04
            int r0 = r5.A01
            long r1 = (long) r0
            java.nio.charset.Charset r0 = X.SCP.A00
            java.lang.String r0 = r6.A07(r0, r1)
        L_0x0027:
            r5.A03 = r0
        L_0x0029:
            r5.A00 = r7
            goto L_0x004e
        L_0x002c:
            r0 = 9
            if (r1 != r0) goto L_0x0037
            X.TAH r0 = X.C7494QGl.A06
        L_0x0032:
            java.lang.String r0 = X.C7494QGl.A04(r5, r0)
            goto L_0x0027
        L_0x0037:
            r0 = 8
            if (r1 != r0) goto L_0x003e
            X.TAH r0 = X.C7494QGl.A07
            goto L_0x0032
        L_0x003e:
            r0 = 10
            if (r1 != r0) goto L_0x0047
            java.lang.String r0 = X.C7494QGl.A03(r5)
            goto L_0x0027
        L_0x0047:
            if (r1 == r7) goto L_0x0029
            X.TQ2 r1 = A08(r5, r3)
            throw r1
        L_0x004e:
            java.lang.String r0 = r5.A03     // Catch:{ NumberFormatException -> 0x0088 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0088 }
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L_0x0067
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto L_0x0067
            r0 = 0
            r5.A03 = r0
            A0A(r5)
            return r2
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 452(0x1c4, float:6.33E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r5.A0H()
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            X.RCD r1 = new X.RCD
            r1.<init>(r0)
            throw r1
        L_0x0088:
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r5.A0H()
            java.lang.String r1 = X.002.A0u(r3, r1, r4, r0)
            X.TQ2 r0 = new X.TQ2
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12828T8z.A0B():double");
    }

    public final int A0C() {
        TAH tah;
        C7494QGl qGl = (C7494QGl) this;
        int A07 = A07(qGl);
        if (A07 == 16) {
            long j = qGl.A02;
            int i = (int) j;
            if (j == ((long) i)) {
                A0A(qGl);
                return i;
            }
            throw new RuntimeException(002.A0r("Expected an int but was ", " at path ", qGl.A0H(), j));
        }
        if (A07 == 17) {
            qGl.A03 = qGl.A04.A07(SCP.A00, (long) qGl.A01);
        } else {
            if (A07 == 9) {
                tah = C7494QGl.A06;
            } else if (A07 == 8) {
                tah = C7494QGl.A07;
            } else if (A07 != 11) {
                throw A08(qGl, "Expected an int but was ");
            }
            String A042 = C7494QGl.A04(qGl, tah);
            qGl.A03 = A042;
            try {
                int parseInt = Integer.parseInt(A042);
                A0A(qGl);
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        qGl.A00 = 11;
        try {
            String str = qGl.A03;
            double parseDouble = Double.parseDouble(str);
            int i2 = (int) parseDouble;
            if (((double) i2) == parseDouble) {
                qGl.A03 = null;
                A0A(qGl);
                return i2;
            }
            throw new RuntimeException(002.A0u("Expected an int but was ", str, " at path ", qGl.A0H()));
        } catch (NumberFormatException unused2) {
            throw new RuntimeException(002.A0u("Expected an int but was ", qGl.A03, " at path ", qGl.A0H()));
        }
    }

    public final int A0D(SNH snh) {
        String str;
        int i;
        C7494QGl qGl = (C7494QGl) this;
        int A07 = A07(qGl);
        if (A07 < 12 || A07 > 15) {
            return -1;
        }
        if (A07 == 15) {
            str = qGl.A03;
            String[] strArr = snh.A01;
            int length = strArr.length;
            i = 0;
            while (i < length) {
                if (str.equals(strArr[i])) {
                    qGl.A00 = 0;
                } else {
                    i++;
                }
            }
            return -1;
        }
        int EL6 = qGl.A05.EL6(snh.A00);
        if (EL6 != -1) {
            qGl.A00 = 0;
            qGl.A03[qGl.A00 - 1] = snh.A01[EL6];
            return EL6;
        }
        str = qGl.A03[qGl.A00 - 1];
        String A0F = qGl.A0F();
        String[] strArr2 = snh.A01;
        int length2 = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                i2 = -1;
                break;
            } else if (A0F.equals(strArr2[i2])) {
                qGl.A00 = 0;
                qGl.A03[qGl.A00 - 1] = A0F;
                break;
            } else {
                i2++;
            }
        }
        if (i == -1) {
            qGl.A00 = 15;
            qGl.A03 = A0F;
        }
        return i;
        qGl.A03[qGl.A00 - 1] = str;
        return i;
    }

    public final Integer A0E() {
        switch (A07((C7494QGl) this)) {
            case 1:
                return AnonymousClass05K.A0C;
            case 2:
                return AnonymousClass05K.A0N;
            case 3:
                return AnonymousClass05K.A00;
            case 4:
                return AnonymousClass05K.A01;
            case 5:
            case 6:
                return AnonymousClass05K.A15;
            case 7:
                return AnonymousClass05K.A1F;
            case 8:
            case 9:
            case 10:
            case 11:
                return AnonymousClass05K.A0j;
            case 16:
            case 17:
                return AnonymousClass05K.A0u;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return AnonymousClass05K.A1I;
            default:
                return AnonymousClass05K.A0Y;
        }
    }

    public final String A0F() {
        String str;
        TAH tah;
        C7494QGl qGl = (C7494QGl) this;
        int A07 = A07(qGl);
        if (A07 == 14) {
            str = C7494QGl.A03(qGl);
        } else {
            if (A07 == 13) {
                tah = C7494QGl.A06;
            } else if (A07 == 12) {
                tah = C7494QGl.A07;
            } else if (A07 == 15) {
                str = qGl.A03;
            } else {
                throw A09(qGl, AnonymousClass000.A00(939));
            }
            str = C7494QGl.A04(qGl, tah);
        }
        qGl.A00 = 0;
        qGl.A03[qGl.A00 - 1] = str;
        return str;
    }

    public final String A0G() {
        String A07;
        TAH tah;
        C7494QGl qGl = (C7494QGl) this;
        int A072 = A07(qGl);
        if (A072 == 10) {
            A07 = C7494QGl.A03(qGl);
        } else {
            if (A072 == 9) {
                tah = C7494QGl.A06;
            } else if (A072 == 8) {
                tah = C7494QGl.A07;
            } else if (A072 == 11) {
                A07 = qGl.A03;
                qGl.A03 = null;
            } else if (A072 == 16) {
                A07 = Long.toString(qGl.A02);
            } else if (A072 == 17) {
                A07 = qGl.A04.A07(SCP.A00, (long) qGl.A01);
            } else {
                throw A09(qGl, "Expected a string but was ");
            }
            A07 = C7494QGl.A04(qGl, tah);
        }
        A0A(qGl);
        return A07;
    }

    public final void A0I() {
        C7494QGl qGl = (C7494QGl) this;
        if (A07(qGl) == 3) {
            qGl.A0O(1);
            qGl.A01[qGl.A00 - 1] = 0;
            qGl.A00 = 0;
            return;
        }
        throw A09(qGl, "Expected BEGIN_ARRAY but was ");
    }

    public final void A0J() {
        C7494QGl qGl = (C7494QGl) this;
        if (A07(qGl) == 1) {
            qGl.A0O(3);
            qGl.A00 = 0;
            return;
        }
        throw A09(qGl, "Expected BEGIN_OBJECT but was ");
    }

    public final void A0K() {
        C7494QGl qGl = (C7494QGl) this;
        if (A07(qGl) == 4) {
            int i = qGl.A00 - 1;
            qGl.A00 = i;
            int[] iArr = qGl.A01;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            qGl.A00 = 0;
            return;
        }
        throw A09(qGl, "Expected END_ARRAY but was ");
    }

    public final void A0L() {
        C7494QGl qGl = (C7494QGl) this;
        if (A07(qGl) == 2) {
            int i = qGl.A00 - 1;
            qGl.A00 = i;
            qGl.A03[i] = null;
            int[] iArr = qGl.A01;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            qGl.A00 = 0;
            return;
        }
        throw A09(qGl, "Expected END_OBJECT but was ");
    }

    public final void A0M() {
        TAH tah;
        C7494QGl qGl = (C7494QGl) this;
        int A07 = A07(qGl);
        if (A07 == 14) {
            long CMF = qGl.A05.CMF(C7494QGl.A08);
            C13198TPe tPe = qGl.A04;
            if (CMF == -1) {
                CMF = tPe.A00;
            }
            tPe.Evi(CMF);
        } else {
            if (A07 == 13) {
                tah = C7494QGl.A06;
            } else if (A07 == 12) {
                tah = C7494QGl.A07;
            } else if (A07 != 15) {
                throw A09(qGl, AnonymousClass000.A00(939));
            }
            C7494QGl.A05(qGl, tah);
        }
        qGl.A00 = 0;
        qGl.A03[qGl.A00 - 1] = "null";
    }

    public final void A0N() {
        TAH tah;
        C7494QGl qGl = (C7494QGl) this;
        int i = 0;
        do {
            int A07 = A07(qGl);
            if (A07 == 3) {
                qGl.A0O(1);
            } else if (A07 == 1) {
                qGl.A0O(3);
            } else {
                if (A07 == 4) {
                    i--;
                    if (i < 0) {
                        throw A08(qGl, "Expected a value but was ");
                    }
                } else if (A07 == 2) {
                    i--;
                    if (i < 0) {
                        throw A08(qGl, "Expected a value but was ");
                    }
                } else if (A07 == 14 || A07 == 10) {
                    long CMF = qGl.A05.CMF(C7494QGl.A08);
                    C13198TPe tPe = qGl.A04;
                    if (CMF == -1) {
                        CMF = tPe.A00;
                    }
                    tPe.Evi(CMF);
                    qGl.A00 = 0;
                } else {
                    if (A07 == 9 || A07 == 13) {
                        tah = C7494QGl.A06;
                    } else if (A07 == 8 || A07 == 12) {
                        tah = C7494QGl.A07;
                    } else {
                        if (A07 == 17) {
                            qGl.A04.Evi((long) qGl.A01);
                        } else if (A07 == 18) {
                            throw A08(qGl, "Expected a value but was ");
                        }
                        qGl.A00 = 0;
                    }
                    C7494QGl.A05(qGl, tah);
                    qGl.A00 = 0;
                }
                qGl.A00--;
                qGl.A00 = 0;
            }
            i++;
            qGl.A00 = 0;
        } while (i != 0);
        int[] iArr = qGl.A01;
        int i2 = qGl.A00 - 1;
        iArr[i2] = iArr[i2] + 1;
        qGl.A03[i2] = "null";
    }

    public final boolean A0Q() {
        int A07 = A07((C7494QGl) this);
        if (A07 == 2 || A07 == 4 || A07 == 18) {
            return false;
        }
        return true;
    }

    public final boolean A0R() {
        C7494QGl qGl = (C7494QGl) this;
        int A07 = A07(qGl);
        if (A07 == 5) {
            qGl.A00 = 0;
            int[] iArr = qGl.A01;
            int i = qGl.A00 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        } else if (A07 == 6) {
            qGl.A00 = 0;
            int[] iArr2 = qGl.A01;
            int i2 = qGl.A00 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        } else {
            throw A09(qGl, "Expected a boolean but was ");
        }
    }

    static {
        String[] strArr;
        int i = 0;
        do {
            strArr = A04;
            strArr[i] = String.format("\\u%04x", AnonymousClass7TF.A1b(i));
            i++;
        } while (i <= 31);
        Pxh.A1U(strArr);
    }

    public static int A07(C7494QGl qGl) {
        int i = qGl.A00;
        if (i == 0) {
            return C7494QGl.A01(qGl);
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.TQ2, java.lang.RuntimeException] */
    public static TQ2 A08(C12828T8z t8z, String str) {
        return new RuntimeException(002.A0u(str, RSN.A00(t8z.A0E()), " at path ", t8z.A0H()));
    }

    public final String A0H() {
        int i = this.A00;
        int[] iArr = this.A02;
        String[] strArr = this.A03;
        int[] iArr2 = this.A01;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                A1A.append('[');
                A1A.append(iArr2[i2]);
                A1A.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                A1A.append('.');
                String str = strArr[i2];
                if (str != null) {
                    A1A.append(str);
                }
            }
        }
        return A1A.toString();
    }

    public final void A0O(int i) {
        int i2 = this.A00;
        int[] iArr = this.A02;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.A02 = Arrays.copyOf(iArr, length * 2);
                String[] strArr = this.A03;
                this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.A01;
                this.A01 = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException(002.A0R("Nesting too deep at ", A0H()));
            }
        }
        int[] iArr3 = this.A02;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr3[i3] = i;
    }

    public final void A0P(String str) {
        throw new IOException(002.A0g(str, " at path ", A0H()));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.TQ2, java.lang.RuntimeException] */
    public static TQ2 A09(C12828T8z t8z, String str) {
        return new RuntimeException(002.A0u(str, RSN.A00(t8z.A0E()), " at path ", t8z.A0H()));
    }
}
