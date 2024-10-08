package X;

/* renamed from: X.Szy  reason: case insensitive filesystem */
public abstract class C12614Szy implements 1UV {
    public static String A02(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public final int A04(CharSequence charSequence) {
        if (this instanceof C7249Q0w) {
            charSequence.getClass();
        } else if (!(this instanceof C8638Qyb)) {
            return A05(charSequence, 0);
        } else {
            if (charSequence.length() == 0) {
                return -1;
            }
            return 0;
        }
        return -1;
    }

    public final int A05(CharSequence charSequence, int i) {
        if (this instanceof C7249Q0w) {
            17k.A02(i, charSequence.length());
        } else if (this instanceof C8638Qyb) {
            int length = charSequence.length();
            17k.A02(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        } else {
            int length2 = charSequence.length();
            17k.A02(i, length2);
            while (i < length2) {
                if (A09(charSequence.charAt(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final C12614Szy A06() {
        if (this instanceof C8644Qyh) {
            return ((C8644Qyh) this).A00;
        }
        if (!(this instanceof C8642Qyf)) {
            return new C8644Qyh(this);
        }
        C8642Qyf qyf = (C8642Qyf) this;
        if (qyf instanceof C8635QyY) {
            return new C7247Q0t(((C8635QyY) qyf).A00);
        }
        if (qyf instanceof C7247Q0t) {
            return new C8635QyY(((C7247Q0t) qyf).A00);
        }
        if (qyf instanceof C7249Q0w) {
            return C8638Qyb.A00;
        }
        if (qyf instanceof C8638Qyb) {
            return C7249Q0w.A00;
        }
        return new C8644Qyh(qyf);
    }

    public final C12614Szy A07(C12614Szy szy) {
        if (this instanceof C8635QyY) {
            C8635QyY qyY = (C8635QyY) this;
            if (szy.A09(qyY.A00)) {
                return C8638Qyb.A00;
            }
            return qyY;
        } else if (this instanceof C7247Q0t) {
            C7247Q0t q0t = (C7247Q0t) this;
            C12614Szy szy2 = szy;
            if (!szy.A09(q0t.A00)) {
                return new C8645Qyi(q0t, szy);
            }
            return szy2;
        } else if (this instanceof C7249Q0w) {
            szy.getClass();
            return szy;
        } else if (!(this instanceof C8638Qyb)) {
            return new C8645Qyi(this, szy);
        } else {
            szy.getClass();
            return this;
        }
    }

    public final String A08(CharSequence charSequence) {
        if (this instanceof C7249Q0w) {
            return charSequence.toString();
        }
        if (this instanceof C8638Qyb) {
            return "";
        }
        String charSequence2 = charSequence.toString();
        int A04 = A04(charSequence2);
        if (A04 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            A04++;
            if (A04 == charArray.length) {
                return new String(charArray, 0, A04 - i);
            }
            if (A09(charArray[A04])) {
                i++;
            } else {
                charArray[A04 - i] = charArray[A04];
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(char r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C8645Qyi
            if (r0 == 0) goto L_0x001a
            r1 = r2
            X.Qyi r1 = (X.C8645Qyi) r1
            X.Szy r0 = r1.A00
            boolean r0 = r0.A09(r3)
            if (r0 != 0) goto L_0x0018
            X.Szy r0 = r1.A01
            boolean r0 = r0.A09(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r1 = 1
        L_0x0019:
            return r1
        L_0x001a:
            boolean r0 = r2 instanceof X.C8644Qyh
            if (r0 == 0) goto L_0x002a
            r0 = r2
            X.Qyh r0 = (X.C8644Qyh) r0
            X.Szy r0 = r0.A00
            boolean r0 = r0.A09(r3)
            r1 = r0 ^ 1
            return r1
        L_0x002a:
            boolean r0 = r2 instanceof X.C8643Qyg
            if (r0 == 0) goto L_0x003c
            r0 = r2
            X.Qyg r0 = (X.C8643Qyg) r0
            char[] r0 = r0.A00
            int r0 = java.util.Arrays.binarySearch(r0, r3)
            boolean r1 = X.Pxf.A1R(r0)
            return r1
        L_0x003c:
            boolean r0 = r2 instanceof X.C8635QyY
            if (r0 == 0) goto L_0x004a
            r0 = r2
            X.QyY r0 = (X.C8635QyY) r0
            char r0 = r0.A00
            boolean r1 = X.JTQ.A1O(r3, r0)
            return r1
        L_0x004a:
            boolean r0 = r2 instanceof X.C8636QyZ
            if (r0 == 0) goto L_0x005b
            r1 = r2
            X.QyZ r1 = (X.C8636QyZ) r1
            char r0 = r1.A00
            if (r3 == r0) goto L_0x0018
            char r0 = r1.A01
            r1 = 0
            if (r3 != r0) goto L_0x0019
            goto L_0x0018
        L_0x005b:
            boolean r0 = r2 instanceof X.C7247Q0t
            if (r0 == 0) goto L_0x0069
            r0 = r2
            X.Q0t r0 = (X.C7247Q0t) r0
            char r0 = r0.A00
            boolean r1 = X.AnonymousClass7TF.A1S(r3, r0)
            return r1
        L_0x0069:
            boolean r0 = r2 instanceof X.C8637Qya
            if (r0 == 0) goto L_0x007b
            r1 = r2
            X.Qya r1 = (X.C8637Qya) r1
            char r0 = r1.A01
            if (r0 > r3) goto L_0x0079
            char r0 = r1.A00
            r1 = 1
            if (r3 <= r0) goto L_0x0019
        L_0x0079:
            r1 = 0
            return r1
        L_0x007b:
            boolean r0 = r2 instanceof X.C8640Qyd
            if (r0 == 0) goto L_0x0092
            r1 = 1682554634(0x6449bf0a, float:1.4886245E22)
            int r1 = r1 * r3
            int r0 = X.C8640Qyd.A00
            int r1 = r1 >>> r0
            java.lang.String r0 = " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　"
            char r0 = r0.charAt(r1)
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r3)
            return r1
        L_0x0092:
            boolean r0 = r2 instanceof X.C7249Q0w
            if (r0 != 0) goto L_0x0079
            boolean r0 = r2 instanceof X.C8639Qyc
            if (r0 == 0) goto L_0x0018
            r0 = 127(0x7f, float:1.78E-43)
            boolean r1 = X.Pxg.A1T(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12614Szy.A09(char):boolean");
    }

    public final boolean A0A(CharSequence charSequence) {
        if (this instanceof C8644Qyh) {
            C12614Szy szy = ((C8644Qyh) this).A00;
            if (szy instanceof C8644Qyh) {
                return ((C8644Qyh) szy).A00.A0A(charSequence);
            }
            if (!(szy instanceof C7249Q0w)) {
                if (szy instanceof C8638Qyb) {
                    return AnonymousClass7TF.A1Q(charSequence.length());
                }
                return AnonymousClass7TF.A1S(szy.A04(charSequence), -1);
            }
        } else if (this instanceof C7249Q0w) {
            return AnonymousClass7TF.A1Q(charSequence.length());
        } else {
            if (!(this instanceof C8638Qyb)) {
                for (int length = charSequence.length() - 1; length >= 0; length--) {
                    if (!A09(charSequence.charAt(length))) {
                        return false;
                    }
                }
                return true;
            }
        }
        charSequence.getClass();
        return true;
    }

    public static C12614Szy A01(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return C7249Q0w.A00;
        }
        if (length == 1) {
            return new C7247Q0t(charSequence.charAt(0));
        }
        if (length != 2) {
            return new C8643Qyg(charSequence);
        }
        return new C8636QyZ(charSequence.charAt(0), charSequence.charAt(1));
    }

    public static String A03(C12614Szy szy, CharSequence charSequence) {
        String A08 = szy.A06().A08(charSequence);
        0qQ.A07(A08);
        return A08;
    }
}
