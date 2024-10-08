package X;

/* renamed from: X.40W  reason: invalid class name */
public abstract class AnonymousClass40W {
    public int A00;
    public String A01;
    public StringBuilder A02 = new StringBuilder();
    public final AnonymousClass40X A03 = new AnonymousClass40X();

    public static final void A02(String str, AnonymousClass40W r6, int i) {
        String str2;
        String str3 = ((AnonymousClass40V) r6).A00;
        int length = str3.length() - i;
        int length2 = str.length();
        if (length >= length2) {
            int i2 = 0;
            while (i2 < length2) {
                if (str.charAt(i2) == (str3.charAt(i + i2) | ' ')) {
                    i2++;
                } else {
                    str2 = 002.A0S("Expected valid boolean literal prefix, but had '", r6.A0A(), '\'');
                }
            }
            r6.A00 = i + length2;
            return;
        }
        str2 = "Unexpected end of boolean literal";
        r6.A0F(str2, "", r6.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final byte A03() {
        char charAt;
        AnonymousClass40V r5 = (AnonymousClass40V) this;
        if (r5 instanceof AnonymousClass4CP) {
            String str = r5.A00;
            int A06 = r5.A06();
            if (A06 >= str.length() || A06 == -1) {
                return 10;
            }
            r5.A00 = A06 + 1;
            charAt = str.charAt(A06);
        } else {
            String str2 = r5.A00;
            int i = r5.A00;
            while (i != -1 && i < str2.length()) {
                int i2 = i + 1;
                charAt = str2.charAt(i);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i = i2;
                } else {
                    r5.A00 = i2;
                }
            }
            r5.A00 = str2.length();
            return 10;
        }
        if (charAt < '~') {
            return C2591340n.A00[charAt];
        }
        return 0;
    }

    public final int A06() {
        int i;
        AnonymousClass40V r3 = (AnonymousClass40V) this;
        boolean z = r3 instanceof AnonymousClass4CP;
        int i2 = r3.A00;
        if (z) {
            if (i2 != -1) {
                String str = r3.A00;
                while (true) {
                    int length = str.length();
                    if (i2 >= length) {
                        break;
                    }
                    char charAt = str.charAt(i2);
                    if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                        if (charAt != '/' || (i = i2 + 1) >= length) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if (charAt2 != '/') {
                            if (charAt2 != '*') {
                                break;
                            }
                            int A08 = 00l.A08(str, "*/", i2 + 2, false);
                            if (A08 != -1) {
                                i2 = A08 + 2;
                            } else {
                                r3.A00 = length;
                                r3.A0F("Expected end of the block comment: \"*/\", but had EOF instead", "", length);
                                throw AnonymousClass00P.createAndThrow();
                            }
                        } else {
                            i2 = 00l.A04(str, 10, i2 + 2);
                            if (i2 == -1) {
                                i2 = length;
                            }
                        }
                    }
                    i2++;
                }
            }
            return i2;
        }
        if (i2 != -1) {
            String str2 = r3.A00;
            while (i2 < str2.length() && ((r1 = str2.charAt(i2)) == ' ' || r1 == 10 || r1 == 13 || r1 == 9)) {
                i2++;
            }
        }
        return i2;
        r3.A00 = i2;
        return i2;
    }

    public final String A08() {
        int i;
        String obj;
        String str;
        char c;
        AnonymousClass40V r3 = (AnonymousClass40V) this;
        r3.A0E('\"');
        int i2 = r3.A00;
        String str2 = r3.A00;
        int A04 = 00l.A04(str2, '\"', i2);
        if (A04 != -1) {
            int i3 = i2;
            while (i < A04) {
                if (str2.charAt(i) == '\\') {
                    int i4 = r3.A00;
                    char charAt = str2.charAt(i);
                    boolean z = false;
                    while (charAt != '\"') {
                        if (charAt == '\\') {
                            StringBuilder sb = r3.A02;
                            sb.append(str2, i4, i);
                            int i5 = i + 1;
                            int length = str2.length();
                            if (i5 >= length || i5 == -1) {
                                str = "Expected escape sequence to continue, got EOF";
                            } else {
                                i4 = i5 + 1;
                                char charAt2 = str2.charAt(i5);
                                if (charAt2 == 'u') {
                                    i4 = A01(str2, r3, i4);
                                } else if (charAt2 >= 'u' || (c = C2591340n.A01[charAt2]) == 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Invalid escaped char '");
                                    sb2.append(charAt2);
                                    sb2.append('\'');
                                    str = sb2.toString();
                                } else {
                                    sb.append(c);
                                }
                                if (i4 >= length) {
                                    r3.A0F("Unexpected EOF", "", -1);
                                }
                            }
                            r3.A0F(str, "", r3.A00);
                        } else {
                            i++;
                            int length2 = str2.length();
                            if (i >= length2) {
                                r3.A02.append(str2, i4, i);
                                i4 = i;
                                if (i >= length2) {
                                    r3.A0F("Unexpected EOF", "", -1);
                                }
                            } else {
                                continue;
                                charAt = str2.charAt(i);
                            }
                        }
                        if (i4 != -1) {
                            i = i4;
                            z = true;
                            charAt = str2.charAt(i);
                        } else {
                            r3.A0F("Unexpected EOF", "", -1);
                        }
                    }
                    if (!z) {
                        obj = str2.subSequence(i4, i).toString();
                    } else {
                        StringBuilder sb3 = r3.A02;
                        sb3.append(str2, i4, i);
                        obj = sb3.toString();
                        0qQ.A07(obj);
                        sb3.setLength(0);
                    }
                    r3.A00 = i + 1;
                    return obj;
                }
                i3 = i + 1;
            }
            r3.A00 = A04 + 1;
            String substring = str2.substring(i2, A04);
            0qQ.A07(substring);
            return substring;
        }
        r3.A0A();
        r3.A0D((byte) 1, false);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(char r8) {
        /*
            r7 = this;
            r3 = r7
            X.40V r3 = (X.AnonymousClass40V) r3
            boolean r0 = r3 instanceof X.AnonymousClass4CP
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r3.A00
            int r2 = r3.A06()
            int r0 = r1.length()
            r6 = -1
            if (r2 >= r0) goto L_0x0047
            if (r2 == r6) goto L_0x0047
            char r1 = r1.charAt(r2)
            int r2 = r2 + 1
        L_0x001c:
            r3.A00 = r2
            r5 = r2
            if (r1 != r8) goto L_0x004a
            return
        L_0x0022:
            int r5 = r3.A00
            r6 = -1
            if (r5 == r6) goto L_0x004a
            java.lang.String r4 = r3.A00
        L_0x0029:
            int r0 = r4.length()
            if (r5 >= r0) goto L_0x0047
            int r2 = r5 + 1
            char r1 = r4.charAt(r5)
            r0 = 32
            if (r1 == r0) goto L_0x0045
            r0 = 10
            if (r1 == r0) goto L_0x0045
            r0 = 13
            if (r1 == r0) goto L_0x0045
            r0 = 9
            if (r1 != r0) goto L_0x001c
        L_0x0045:
            r5 = r2
            goto L_0x0029
        L_0x0047:
            r3.A00 = r6
            r5 = r6
        L_0x004a:
            if (r5 <= 0) goto L_0x005d
            r0 = 34
            if (r8 != r0) goto L_0x005d
            int r0 = r5 + -1
            r3.A00 = r0     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = r3.A0A()     // Catch:{ all -> 0x0059 }
            goto L_0x0066
        L_0x0059:
            r0 = move-exception
            r3.A00 = r5
            throw r0
        L_0x005d:
            byte[] r0 = X.C2591340n.A00
            byte r1 = r0[r8]
            r0 = 1
            r3.A0D(r1, r0)
            goto L_0x007b
        L_0x0066:
            r3.A00 = r5
            java.lang.String r0 = "null"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005d
            int r0 = r3.A00
            int r2 = r0 + -1
            java.lang.String r1 = "Expected string literal but 'null' literal was found"
            java.lang.String r0 = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value."
            r3.A0F(r1, r0, r2)
        L_0x007b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass40W.A0E(char):void");
    }

    public final void A0F(String str, String str2, int i) {
        String A0D;
        0qQ.A0B(str, 0);
        if (str2.length() == 0) {
            A0D = "";
        } else {
            A0D = 002.A0D(str2, 10);
        }
        throw C18804W2u.A01(((AnonymousClass40V) this).A00, 002.A0u(str, " at path: ", this.A03.A00(), A0D), i);
    }

    public final boolean A0G() {
        char charAt;
        AnonymousClass40V r5 = (AnonymousClass40V) this;
        if (r5 instanceof AnonymousClass4CP) {
            int A06 = r5.A06();
            String str = r5.A00;
            if (A06 >= str.length() || A06 == -1 || (charAt = str.charAt(A06)) == '}' || charAt == ']' || charAt == ':' || charAt == ',') {
                return false;
            }
            return true;
        }
        int i = r5.A00;
        if (i == -1) {
            return false;
        }
        String str2 = r5.A00;
        while (i < str2.length()) {
            char charAt2 = str2.charAt(i);
            if (charAt2 == ' ' || charAt2 == 10 || charAt2 == 13 || charAt2 == 9) {
                i++;
            } else {
                r5.A00 = i;
                if (charAt2 == '}' || charAt2 == ']' || charAt2 == ':' || charAt2 == ',') {
                    return false;
                }
                return true;
            }
        }
        r5.A00 = i;
        return false;
    }

    public static final int A01(CharSequence charSequence, AnonymousClass40W r5, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            r5.A00 = i;
            if (i2 < charSequence.length()) {
                return A01(charSequence, r5, r5.A00);
            }
            r5.A0F("Unexpected EOF during unicode escape", "", r5.A00);
            throw AnonymousClass00P.createAndThrow();
        }
        r5.A02.append((char) ((r5.A00(charSequence, i) << 12) + (r5.A00(charSequence, i + 1) << 8) + (r5.A00(charSequence, i + 2) << 4) + r5.A00(charSequence, i + 3)));
        return i2;
    }

    public final byte A04() {
        char charAt;
        if (this instanceof AnonymousClass4CP) {
            AnonymousClass40V r3 = (AnonymousClass40V) this;
            String str = r3.A00;
            int A06 = r3.A06();
            if (A06 >= str.length() || A06 == -1) {
                return 10;
            }
            r3.A00 = A06;
            charAt = str.charAt(A06);
        } else {
            String str2 = ((AnonymousClass40V) this).A00;
            int i = this.A00;
            while (true) {
                if (i >= str2.length()) {
                    i = -1;
                }
                if (i != -1) {
                    charAt = str2.charAt(i);
                    if (charAt != ' ' && charAt != 10 && charAt != 13 && charAt != 9) {
                        this.A00 = i;
                        break;
                    }
                    i++;
                } else {
                    this.A00 = i;
                    return 10;
                }
            }
        }
        if (charAt < '~') {
            return C2591340n.A00[charAt];
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return -r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r2 == r4) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        if (r12 < '~') goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a0, code lost:
        r2 = "Unexpected symbol '-' in numeric literal";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a4, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a5, code lost:
        if (r2 == r4) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a7, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
        if (r4 == r2) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00aa, code lost:
        if (r14 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ae, code lost:
        if (r4 == (r2 - 1)) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b0, code lost:
        if (r18 == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b2, code lost:
        if (r1 == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ba, code lost:
        if (r3.charAt(r2) != '\"') goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bc, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00be, code lost:
        r5.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c0, code lost:
        if (r15 == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c2, code lost:
        r3 = (double) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c5, code lost:
        if (r13 != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c7, code lost:
        r0 = -((double) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c9, code lost:
        r3 = r3 * java.lang.Math.pow(10.0d, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d2, code lost:
        if (r3 > 9.223372036854776E18d) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d8, code lost:
        if (r3 < -9.223372036854776E18d) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e0, code lost:
        if (java.lang.Math.floor(r3) != r3) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e2, code lost:
        r6 = (long) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e3, code lost:
        if (r14 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e9, code lost:
        if (r6 == Long.MIN_VALUE) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ed, code lost:
        r0 = (double) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ef, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Can't convert ");
        r1.append(r3);
        r1.append(" to Long");
        r2 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0109, code lost:
        r2 = "Expected closing quotation mark";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x010c, code lost:
        r2 = "Expected numeric literal";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0121, code lost:
        r1.append(r0);
        r2 = r1.toString();
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00a4 A[EDGE_INSN: B:93:0x00a4->B:51:0x00a4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A07() {
        /*
            r19 = this;
            r5 = r19
            int r4 = r5.A06()
            r0 = r5
            X.40V r0 = (X.AnonymousClass40V) r0
            java.lang.String r3 = r0.A00
            int r8 = r3.length()
            if (r4 < r8) goto L_0x0012
            r4 = -1
        L_0x0012:
            if (r4 >= r8) goto L_0x010f
            r0 = -1
            if (r4 == r0) goto L_0x010f
            char r1 = r3.charAt(r4)
            r0 = 34
            if (r1 != r0) goto L_0x0088
            int r4 = r4 + 1
            if (r4 == r8) goto L_0x010f
            r18 = 1
        L_0x0025:
            r16 = 0
            r2 = r4
            r6 = 0
            r10 = 0
            r15 = 0
            r14 = 0
        L_0x002e:
            r13 = 0
        L_0x002f:
            if (r2 == r8) goto L_0x00a4
            char r12 = r3.charAt(r2)
            r0 = 101(0x65, float:1.42E-43)
            if (r12 == r0) goto L_0x0048
            r0 = 69
            if (r12 == r0) goto L_0x0048
            r1 = 45
            if (r12 != r1) goto L_0x0050
            if (r15 == 0) goto L_0x0082
            if (r2 == r4) goto L_0x00a0
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0048:
            if (r15 != 0) goto L_0x0062
            if (r2 == r4) goto L_0x0112
            int r2 = r2 + 1
            r15 = 1
            goto L_0x005a
        L_0x0050:
            r0 = 43
            if (r12 != r0) goto L_0x005c
            if (r15 == 0) goto L_0x0062
            if (r2 == r4) goto L_0x008b
            int r2 = r2 + 1
        L_0x005a:
            r13 = 1
            goto L_0x002f
        L_0x005c:
            if (r12 == r1) goto L_0x0082
            r0 = 126(0x7e, float:1.77E-43)
            if (r12 >= r0) goto L_0x0068
        L_0x0062:
            byte[] r0 = X.C2591340n.A00
            byte r0 = r0[r12]
            if (r0 != 0) goto L_0x00a4
        L_0x0068:
            int r2 = r2 + 1
            int r9 = r12 + -48
            r0 = 10
            if (r9 < 0) goto L_0x008f
            if (r9 >= r0) goto L_0x008f
            r0 = 10
            if (r15 == 0) goto L_0x007a
            long r10 = r10 * r0
            long r0 = (long) r9
            long r10 = r10 + r0
            goto L_0x002f
        L_0x007a:
            long r6 = r6 * r0
            long r0 = (long) r9
            long r6 = r6 - r0
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0106
            goto L_0x002f
        L_0x0082:
            if (r2 != r4) goto L_0x00a0
            int r2 = r2 + 1
            r14 = 1
            goto L_0x002f
        L_0x0088:
            r18 = 0
            goto L_0x0025
        L_0x008b:
            java.lang.String r2 = "Unexpected symbol '+' in numeric literal"
            goto L_0x0128
        L_0x008f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unexpected symbol '"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "' in numeric literal"
            goto L_0x0121
        L_0x00a0:
            java.lang.String r2 = "Unexpected symbol '-' in numeric literal"
            goto L_0x0128
        L_0x00a4:
            r1 = 0
            if (r2 == r4) goto L_0x00a8
            r1 = 1
        L_0x00a8:
            if (r4 == r2) goto L_0x010c
            if (r14 == 0) goto L_0x00b0
            int r0 = r2 + -1
            if (r4 == r0) goto L_0x010c
        L_0x00b0:
            if (r18 == 0) goto L_0x00be
            if (r1 == 0) goto L_0x010f
            char r1 = r3.charAt(r2)
            r0 = 34
            if (r1 != r0) goto L_0x0109
            int r2 = r2 + 1
        L_0x00be:
            r5.A00 = r2
            if (r15 == 0) goto L_0x00e3
            double r3 = (double) r6
            r8 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r13 != 0) goto L_0x00ed
            double r6 = (double) r10
            double r0 = -r6
        L_0x00c9:
            double r0 = java.lang.Math.pow(r8, r0)
            double r3 = r3 * r0
            r1 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0106
            r1 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0106
            double r1 = java.lang.Math.floor(r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00ef
            long r6 = (long) r3
        L_0x00e3:
            if (r14 != 0) goto L_0x00ec
            r1 = -9223372036854775808
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0106
            long r6 = -r6
        L_0x00ec:
            return r6
        L_0x00ed:
            double r0 = (double) r10
            goto L_0x00c9
        L_0x00ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Can't convert "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " to Long"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            goto L_0x0128
        L_0x0106:
            java.lang.String r2 = "Numeric value overflow"
            goto L_0x0128
        L_0x0109:
            java.lang.String r2 = "Expected closing quotation mark"
            goto L_0x0128
        L_0x010c:
            java.lang.String r2 = "Expected numeric literal"
            goto L_0x0128
        L_0x010f:
            java.lang.String r2 = "EOF"
            goto L_0x0128
        L_0x0112:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unexpected symbol "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " in numeric literal"
        L_0x0121:
            r1.append(r0)
            java.lang.String r2 = r1.toString()
        L_0x0128:
            int r1 = r5.A00
            java.lang.String r0 = ""
            r5.A0F(r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass40W.A07():long");
    }

    public final String A09() {
        String str = this.A01;
        if (str == null) {
            return A08();
        }
        0qQ.A0A(str);
        this.A01 = null;
        return str;
    }

    public final String A0A() {
        String obj;
        String str = this.A01;
        if (str != null) {
            0qQ.A0A(str);
            this.A01 = null;
            return str;
        }
        int A06 = A06();
        String str2 = ((AnonymousClass40V) this).A00;
        int length = str2.length();
        if (A06 >= length || A06 == -1) {
            A0F("EOF", "", A06);
        } else {
            char charAt = str2.charAt(A06);
            if (charAt < '~') {
                byte b = C2591340n.A00[charAt];
                if (b == 1) {
                    return A09();
                }
                if (b != 0) {
                    A0F(002.A0C("Expected beginning of the string, but got ", str2.charAt(A06)), "", this.A00);
                }
            }
            boolean z = false;
            while (true) {
                char charAt2 = str2.charAt(A06);
                if (charAt2 >= '~' || C2591340n.A00[charAt2] == 0) {
                    A06++;
                    if (A06 >= length) {
                        this.A02.append(str2, this.A00, A06);
                        if (A06 >= length || A06 == -1) {
                            this.A00 = A06;
                            StringBuilder sb = this.A02;
                            sb.append(str2, 0, 0);
                            String obj2 = sb.toString();
                            0qQ.A07(obj2);
                            sb.setLength(0);
                        } else {
                            z = true;
                        }
                    }
                } else {
                    int i = this.A00;
                    if (!z) {
                        obj = str2.subSequence(i, A06).toString();
                    } else {
                        StringBuilder sb2 = this.A02;
                        sb2.append(str2, i, A06);
                        obj = sb2.toString();
                        0qQ.A07(obj);
                        sb2.setLength(0);
                    }
                    this.A00 = A06;
                    return obj;
                }
            }
            this.A00 = A06;
            StringBuilder sb3 = this.A02;
            sb3.append(str2, 0, 0);
            String obj22 = sb3.toString();
            0qQ.A07(obj22);
            sb3.setLength(0);
            return obj22;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonReader(source='");
        sb.append(((AnonymousClass40V) this).A00);
        sb.append("', currentPosition=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    private final int A00(CharSequence charSequence, int i) {
        char c;
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt) {
            if (charAt < ':') {
                return charAt - '0';
            }
            char c2 = 'a';
            if ('a' <= charAt) {
                c = 'g';
            } else {
                c2 = 'A';
                if ('A' <= charAt) {
                    c = 'G';
                }
            }
            if (charAt < c) {
                return (charAt - c2) + 10;
            }
        }
        A0F(002.A0T("Invalid toHexChar char '", "' in unicode escape", charAt), "", this.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final byte A05(byte b) {
        byte A032 = A03();
        if (A032 == b) {
            return A032;
        }
        A0D(b, true);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A0B() {
        String A0A = A0A();
        if (!0qQ.A0K(A0A, "null") || ((AnonymousClass40V) this).A00.charAt(this.A00 - 1) == '\"') {
            return A0A;
        }
        A0F("Unexpected 'null' value instead of string literal", "", this.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A0C(boolean z) {
        String str;
        byte A04 = A04();
        if (z) {
            if (A04 == 1 || A04 == 0) {
                str = A0A();
                this.A01 = str;
                return str;
            }
        } else if (A04 == 1) {
            str = A09();
            this.A01 = str;
            return str;
        }
        return null;
    }

    public final void A0D(byte b, boolean z) {
        String str;
        String A002 = VJ8.A00(b);
        int i = this.A00;
        int i2 = i;
        if (z) {
            i--;
        }
        String str2 = ((AnonymousClass40V) this).A00;
        if (i2 == str2.length() || i < 0) {
            str = "EOF";
        } else {
            str = String.valueOf(str2.charAt(i));
        }
        A0F(002.A11("Expected ", A002, ", but had '", str, "' instead"), "", i);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0H() {
        int A06 = A06();
        String str = ((AnonymousClass40V) this).A00;
        if (A06 >= str.length() || A06 == -1 || str.charAt(A06) != ',') {
            return false;
        }
        this.A00++;
        return true;
    }

    public final boolean A0I(boolean z) {
        char charAt;
        int A06 = A06();
        String str = ((AnonymousClass40V) this).A00;
        int length = str.length();
        if (A06 >= length) {
            A06 = -1;
        }
        int i = length - A06;
        if (i >= 4 && A06 != -1) {
            int i2 = 0;
            while (true) {
                if ("null".charAt(i2) != str.charAt(A06 + i2)) {
                    break;
                }
                i2++;
                if (i2 >= 4) {
                    if (i <= 4 || ((charAt = str.charAt(A06 + 4)) < '~' && C2591340n.A00[charAt] != 0)) {
                        if (!z) {
                            return true;
                        }
                        this.A00 = A06 + 4;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
