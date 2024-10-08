package X;

import java.util.Arrays;

/* renamed from: X.QvF  reason: case insensitive filesystem */
public final class C8470QvF extends TA9 {
    public final TAO A00;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r4.A00;
        r3 = r2.A02();
        r1 = ((X.C8470QvF) r5).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            X.TA9 r5 = (X.TA9) r5
            int r0 = r5.A02()
            r3 = 2
            if (r3 != r0) goto L_0x0028
            X.QvF r5 = (X.C8470QvF) r5
            X.TAO r2 = r4.A00
            int r3 = r2.A02()
            X.TAO r1 = r5.A00
            int r0 = r1.A02()
            if (r3 != r0) goto L_0x0028
            byte[] r2 = r2.A03()
            byte[] r1 = r1.A03()
            java.util.Comparator r0 = X.C11141SBw.A00
            int r3 = r0.compare(r2, r1)
            return r3
        L_0x0028:
            int r3 = r3 - r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8470QvF.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C8470QvF) obj).A00);
    }

    public final String toString() {
        SJF sjf;
        int i;
        boolean z;
        C8465QvA qvA = (C8465QvA) S01.A00;
        S01 s01 = qvA.A02;
        if (s01 == null) {
            SJF sjf2 = qvA.A00;
            int i2 = 0;
            while (true) {
                char[] cArr = sjf2.A07;
                int length = cArr.length;
                if (i2 >= length) {
                    sjf = sjf2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        i = 65;
                        if (i3 >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        char[] cArr2 = new char[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            char c3 = cArr[i4];
                            if (c3 >= 'a' && c3 <= 'z') {
                                c3 ^= ' ';
                            }
                            cArr2[i4] = (char) c3;
                        }
                        sjf = new SJF(sjf2.A04.concat(".upperCase()"), cArr2);
                        if (sjf2.A05 && !sjf.A05) {
                            byte[] bArr = sjf.A06;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            do {
                                int i5 = i | 32;
                                byte b = bArr[i];
                                byte b2 = bArr[i5];
                                if (b == -1) {
                                    copyOf[i] = b2;
                                } else {
                                    char c4 = (char) i;
                                    char c5 = (char) i5;
                                    if (b2 == -1) {
                                        copyOf[i5] = b;
                                    } else {
                                        throw AnonymousClass7TE.A0z(C9705RfO.A00("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    }
                                }
                                i++;
                            } while (i <= 90);
                            String str = sjf.A04;
                            sjf = new SJF(str.concat(".ignoreCase()"), copyOf, sjf.A07, true);
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Cannot call upperCase() on a mixed-case alphabet");
                    }
                }
            }
            if (sjf == sjf2) {
                s01 = qvA;
            } else {
                Character ch = qvA.A01;
                if (qvA instanceof C8463Qv8) {
                    s01 = new C8465QvA(sjf, ch);
                    if (sjf.A07.length != 64) {
                        throw Pxe.A0g();
                    }
                } else if (qvA instanceof C8464Qv9) {
                    s01 = new C8464Qv9(sjf);
                } else {
                    s01 = new C8465QvA(sjf, ch);
                }
            }
            qvA.A02 = s01;
        }
        return 002.A0g("h'", Pxi.A0h(s01, this.A00), "'");
    }

    public C8470QvF(TAO tao) {
        this.A00 = tao;
    }

    public final int hashCode() {
        return Pxf.A0A(C66580MXl.A0q(), this.A00);
    }
}
