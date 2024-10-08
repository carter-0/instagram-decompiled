package X;

import com.facebook.phonenumbers.PhoneNumberUtil;
import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7A8  reason: invalid class name */
public final class AnonymousClass7A8 implements Iterator {
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern A0C = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern A0D = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    public static final Pattern A0E = Pattern.compile(":[0-5]\\d");
    public static final Pattern[] A0F = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    public int A00 = 0;
    public long A01;
    public AnonymousClass7AH A02 = null;
    public Integer A03 = AnonymousClass05K.A00;
    public final AnonymousClass7A5 A04;
    public final PhoneNumberUtil A05;
    public final CharSequence A06;
    public final String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017c, code lost:
        if (r0 != false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017e, code lost:
        r8.A08 = false;
        r8.A03 = X.AnonymousClass05K.A00;
        r8.A0E = false;
        r8.A06 = "";
        r8.A0D = false;
        r8.A05 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0194, code lost:
        return new X.AnonymousClass7AH(r8, r9, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0138 A[Catch:{ 2sh -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0195 A[EDGE_INSN: B:96:0x0195->B:92:0x0195 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7AH A00(X.AnonymousClass7A8 r16, java.lang.String r17, int r18) {
        /*
            r15 = 0
            java.util.regex.Pattern r0 = A09     // Catch:{ 2sh -> 0x0195 }
            r9 = r17
            java.util.regex.Matcher r0 = r0.matcher(r9)     // Catch:{ 2sh -> 0x0195 }
            boolean r0 = r0.matches()     // Catch:{ 2sh -> 0x0195 }
            if (r0 == 0) goto L_0x0195
            java.util.regex.Pattern r0 = A0B     // Catch:{ 2sh -> 0x0195 }
            java.util.regex.Matcher r0 = r0.matcher(r9)     // Catch:{ 2sh -> 0x0195 }
            boolean r0 = r0.find()     // Catch:{ 2sh -> 0x0195 }
            if (r0 != 0) goto L_0x0195
            r5 = r16
            X.7A5 r4 = r5.A04     // Catch:{ 2sh -> 0x0195 }
            X.7A5 r0 = X.AnonymousClass7A5.A01     // Catch:{ 2sh -> 0x0195 }
            int r0 = r4.compareTo(r0)     // Catch:{ 2sh -> 0x0195 }
            r2 = r18
            if (r0 < 0) goto L_0x0077
            if (r18 <= 0) goto L_0x0052
            java.util.regex.Pattern r0 = A08     // Catch:{ 2sh -> 0x0195 }
            java.util.regex.Matcher r0 = r0.matcher(r9)     // Catch:{ 2sh -> 0x0195 }
            boolean r0 = r0.lookingAt()     // Catch:{ 2sh -> 0x0195 }
            if (r0 != 0) goto L_0x0052
            java.lang.CharSequence r1 = r5.A06     // Catch:{ 2sh -> 0x0195 }
            int r0 = r18 + -1
            char r3 = r1.charAt(r0)     // Catch:{ 2sh -> 0x0195 }
            r0 = 37
            if (r3 == r0) goto L_0x00b0
            int r1 = java.lang.Character.getType(r3)     // Catch:{ 2sh -> 0x0195 }
            r0 = 26
            if (r1 == r0) goto L_0x00b0
            boolean r0 = A01(r3)     // Catch:{ 2sh -> 0x0195 }
            if (r0 == 0) goto L_0x0052
            return r15
        L_0x0052:
            int r3 = r9.length()     // Catch:{ 2sh -> 0x0195 }
            int r3 = r3 + r18
            java.lang.CharSequence r1 = r5.A06     // Catch:{ 2sh -> 0x0195 }
            int r0 = r1.length()     // Catch:{ 2sh -> 0x0195 }
            if (r3 >= r0) goto L_0x0077
            char r3 = r1.charAt(r3)     // Catch:{ 2sh -> 0x0195 }
            r0 = 37
            if (r3 == r0) goto L_0x00b0
            int r1 = java.lang.Character.getType(r3)     // Catch:{ 2sh -> 0x0195 }
            r0 = 26
            if (r1 == r0) goto L_0x00b0
            boolean r0 = A01(r3)     // Catch:{ 2sh -> 0x0195 }
            if (r0 == 0) goto L_0x0077
            return r15
        L_0x0077:
            com.facebook.phonenumbers.PhoneNumberUtil r7 = r5.A05     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r10 = r5.A07     // Catch:{ 2sh -> 0x0195 }
            X.74u r8 = new X.74u     // Catch:{ 2sh -> 0x0195 }
            r8.<init>()     // Catch:{ 2sh -> 0x0195 }
            r11 = 1
            r12 = r11
            com.facebook.phonenumbers.PhoneNumberUtil.A06(r7, r8, r9, r10, r11, r12)     // Catch:{ 2sh -> 0x0195 }
            int r0 = r8.A00     // Catch:{ 2sh -> 0x0195 }
            X.79y r3 = r7.A00     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r1 = r3.A01(r0)     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r0 = "IL"
            boolean r0 = r1.equals(r0)     // Catch:{ 2sh -> 0x0195 }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = com.facebook.phonenumbers.PhoneNumberUtil.A04(r8)     // Catch:{ 2sh -> 0x0195 }
            int r1 = r0.length()     // Catch:{ 2sh -> 0x0195 }
            r0 = 4
            if (r1 != r0) goto L_0x00b1
            if (r18 == 0) goto L_0x00b0
            if (r18 <= 0) goto L_0x00b1
            java.lang.CharSequence r1 = r5.A06     // Catch:{ 2sh -> 0x0195 }
            int r0 = r18 + -1
            char r1 = r1.charAt(r0)     // Catch:{ 2sh -> 0x0195 }
            r0 = 42
            if (r1 == r0) goto L_0x00b1
        L_0x00b0:
            return r15
        L_0x00b1:
            boolean r0 = r4 instanceof X.AnonymousClass7A6     // Catch:{ 2sh -> 0x0195 }
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r7.A0M(r8)     // Catch:{ 2sh -> 0x0195 }
            goto L_0x017c
        L_0x00bb:
            boolean r0 = r7.A0N(r8)     // Catch:{ 2sh -> 0x0195 }
            if (r0 == 0) goto L_0x0195
            r16 = 0
            r5 = 0
        L_0x00c4:
            int r0 = r9.length()     // Catch:{ 2sh -> 0x0195 }
            int r0 = r0 - r11
            if (r5 >= r0) goto L_0x013d
            char r0 = r9.charAt(r5)     // Catch:{ 2sh -> 0x0195 }
            r6 = 88
            r1 = 120(0x78, float:1.68E-43)
            if (r0 == r1) goto L_0x00d7
            if (r0 != r6) goto L_0x0139
        L_0x00d7:
            int r4 = r5 + 1
            char r0 = r9.charAt(r4)     // Catch:{ 2sh -> 0x0195 }
            if (r0 == r1) goto L_0x00f2
            if (r0 == r6) goto L_0x00f2
            java.lang.String r0 = r9.substring(r5)     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r1 = com.facebook.phonenumbers.PhoneNumberUtil.A05(r0)     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r0 = r8.A04     // Catch:{ 2sh -> 0x0195 }
            boolean r0 = r1.equals(r0)     // Catch:{ 2sh -> 0x0195 }
            if (r0 != 0) goto L_0x0139
            goto L_0x013c
        L_0x00f2:
            java.lang.String r14 = r9.substring(r4)     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r6 = "ZZ"
            X.74u r0 = r7.A0F(r14, r6)     // Catch:{ 2sh -> 0x0101 }
            java.lang.Integer r1 = r7.A0G(r8, r0)     // Catch:{ 2sh -> 0x0101 }
            goto L_0x0134
        L_0x0101:
            r0 = move-exception
            java.lang.Integer r0 = r0.A00     // Catch:{ 2sh -> 0x0195 }
            java.lang.Integer r5 = X.AnonymousClass05K.A00     // Catch:{ 2sh -> 0x0195 }
            if (r0 != r5) goto L_0x0133
            int r0 = r8.A00     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r1 = r3.A01(r0)     // Catch:{ 2sh -> 0x0195 }
            boolean r0 = r1.equals(r6)     // Catch:{ 2sh -> 0x0133 }
            if (r0 != 0) goto L_0x0123
            X.74u r0 = r7.A0F(r14, r1)     // Catch:{ 2sh -> 0x0133 }
            java.lang.Integer r1 = r7.A0G(r8, r0)     // Catch:{ 2sh -> 0x0133 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ 2sh -> 0x0133 }
            if (r1 != r0) goto L_0x0134
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ 2sh -> 0x0133 }
            goto L_0x0134
        L_0x0123:
            X.74u r13 = new X.74u     // Catch:{ 2sh -> 0x0133 }
            r13.<init>()     // Catch:{ 2sh -> 0x0133 }
            r12 = r7
            r17 = r16
            com.facebook.phonenumbers.PhoneNumberUtil.A06(r12, r13, r14, r15, r16, r17)     // Catch:{ 2sh -> 0x0133 }
            java.lang.Integer r1 = r7.A0G(r8, r13)     // Catch:{ 2sh -> 0x0133 }
            goto L_0x0134
        L_0x0133:
            r1 = r5
        L_0x0134:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ 2sh -> 0x0195 }
            if (r1 != r0) goto L_0x0195
            r5 = r4
        L_0x0139:
            int r5 = r5 + 1
            goto L_0x00c4
        L_0x013c:
            return r15
        L_0x013d:
            java.lang.Integer r1 = r8.A03     // Catch:{ 2sh -> 0x0195 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ 2sh -> 0x0195 }
            if (r1 != r0) goto L_0x017e
            int r0 = r8.A00     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r0 = r3.A01(r0)     // Catch:{ 2sh -> 0x0195 }
            X.T93 r4 = r7.A0E(r0)     // Catch:{ 2sh -> 0x0195 }
            if (r4 == 0) goto L_0x017e
            java.lang.String r1 = com.facebook.phonenumbers.PhoneNumberUtil.A04(r8)     // Catch:{ 2sh -> 0x0195 }
            java.util.List r0 = r4.A0Q     // Catch:{ 2sh -> 0x0195 }
            X.T92 r3 = r7.A0C(r1, r0)     // Catch:{ 2sh -> 0x0195 }
            if (r3 == 0) goto L_0x017e
            java.lang.String r1 = r3.A02     // Catch:{ 2sh -> 0x0195 }
            int r0 = r1.length()     // Catch:{ 2sh -> 0x0195 }
            if (r0 <= 0) goto L_0x017e
            boolean r0 = r3.A07     // Catch:{ 2sh -> 0x0195 }
            if (r0 != 0) goto L_0x017e
            boolean r0 = com.facebook.phonenumbers.PhoneNumberUtil.A08(r1)     // Catch:{ 2sh -> 0x0195 }
            if (r0 != 0) goto L_0x017e
            java.lang.String r0 = r8.A06     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r1 = com.facebook.phonenumbers.PhoneNumberUtil.A05(r0)     // Catch:{ 2sh -> 0x0195 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 2sh -> 0x0195 }
            r0.<init>(r1)     // Catch:{ 2sh -> 0x0195 }
            boolean r0 = r7.A0K(r4, r0, r15)     // Catch:{ 2sh -> 0x0195 }
        L_0x017c:
            if (r0 == 0) goto L_0x0195
        L_0x017e:
            r1 = 0
            r8.A08 = r1     // Catch:{ 2sh -> 0x0195 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ 2sh -> 0x0195 }
            r8.A03 = r0     // Catch:{ 2sh -> 0x0195 }
            r8.A0E = r1     // Catch:{ 2sh -> 0x0195 }
            java.lang.String r0 = ""
            r8.A06 = r0     // Catch:{ 2sh -> 0x0195 }
            r8.A0D = r1     // Catch:{ 2sh -> 0x0195 }
            r8.A05 = r0     // Catch:{ 2sh -> 0x0195 }
            X.7AH r0 = new X.7AH     // Catch:{ 2sh -> 0x0195 }
            r0.<init>(r8, r9, r2)     // Catch:{ 2sh -> 0x0195 }
            return r0
        L_0x0195:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7A8.A00(X.7A8, java.lang.String, int):X.7AH");
    }

    static {
        String A0n = 002.A0n("{", ",", "}", 0, 3);
        StringBuilder sb = new StringBuilder();
        sb.append("(?:[");
        sb.append("(\\[（［");
        sb.append("])?(?:");
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("+[");
        sb.append(")\\]）］");
        sb.append("])?");
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("+(?:[");
        sb.append("(\\[（［");
        sb.append("]");
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("+[");
        sb.append(")\\]）］");
        sb.append("])");
        sb.append(A0n);
        sb.append("[^(\\[（［)\\]）］]");
        sb.append("*");
        A09 = Pattern.compile(sb.toString());
        String A0n2 = 002.A0n("{", ",", "}", 0, 2);
        String A0n3 = 002.A0n("{", ",", "}", 0, 4);
        String A0n4 = 002.A0n("{", ",", "}", 0, 20);
        String A0R = 002.A0R("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]", A0n3);
        String A0R2 = 002.A0R("\\p{Nd}", 002.A0n("{", ",", "}", 1, 20));
        String A0g = 002.A0g("[", "(\\[（［+＋", "]");
        A08 = Pattern.compile(A0g);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(?:");
        sb2.append(A0g);
        sb2.append(A0R);
        sb2.append(")");
        sb2.append(A0n2);
        sb2.append(A0R2);
        sb2.append("(?:");
        sb2.append(A0R);
        sb2.append(A0R2);
        sb2.append(")");
        sb2.append(A0n4);
        sb2.append("(?:");
        sb2.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#");
        sb2.append(")?");
        A0A = Pattern.compile(sb2.toString(), 66);
    }

    public final boolean hasNext() {
        AnonymousClass7AH r0;
        Integer num = this.A03;
        if (num == AnonymousClass05K.A00) {
            int i = this.A00;
            Pattern pattern = A0A;
            CharSequence charSequence = this.A06;
            Matcher matcher = pattern.matcher(charSequence);
            loop0:
            while (true) {
                if (this.A01 <= 0 || !matcher.find(i)) {
                    r0 = null;
                } else {
                    int start = matcher.start();
                    CharSequence subSequence = charSequence.subSequence(start, matcher.end());
                    Pattern pattern2 = PhoneNumberUtil.A0C;
                    if (pattern2 == null) {
                        pattern2 = Pattern.compile("[\\\\/] *x", 0);
                    }
                    PhoneNumberUtil.A0C = pattern2;
                    Matcher matcher2 = pattern2.matcher(subSequence);
                    if (matcher2.find()) {
                        subSequence = subSequence.subSequence(0, matcher2.start());
                    }
                    if (!A0C.matcher(subSequence).find()) {
                        if (A0D.matcher(subSequence).find()) {
                            if (A0E.matcher(charSequence.toString().substring(subSequence.length() + start)).lookingAt()) {
                                continue;
                            }
                        }
                        String charSequence2 = subSequence.toString();
                        r0 = A00(this, charSequence2, start);
                        if (r0 != null) {
                            break;
                        }
                        Pattern[] patternArr = A0F;
                        int i2 = 0;
                        do {
                            Matcher matcher3 = patternArr[i2].matcher(charSequence2);
                            boolean z = true;
                            while (matcher3.find() && this.A01 > 0) {
                                if (z) {
                                    Pattern pattern3 = PhoneNumberUtil.A0D;
                                    if (pattern3 == null) {
                                        pattern3 = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$", 0);
                                    }
                                    PhoneNumberUtil.A0D = pattern3;
                                    String substring = charSequence2.substring(0, matcher3.start());
                                    Matcher matcher4 = pattern3.matcher(substring);
                                    CharSequence charSequence3 = substring;
                                    if (matcher4.find()) {
                                        charSequence3 = substring.subSequence(0, matcher4.start());
                                    }
                                    r0 = A00(this, charSequence3.toString(), start);
                                    if (r0 != null) {
                                        break loop0;
                                    }
                                    this.A01--;
                                    z = false;
                                }
                                Pattern pattern4 = PhoneNumberUtil.A0D;
                                if (pattern4 == null) {
                                    pattern4 = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$", 0);
                                }
                                PhoneNumberUtil.A0D = pattern4;
                                String group = matcher3.group(1);
                                Matcher matcher5 = pattern4.matcher(group);
                                CharSequence charSequence4 = group;
                                if (matcher5.find()) {
                                    charSequence4 = group.subSequence(0, matcher5.start());
                                }
                                r0 = A00(this, charSequence4.toString(), matcher3.start(1) + start);
                                if (r0 != null) {
                                    break loop0;
                                }
                                this.A01--;
                            }
                            i2++;
                        } while (i2 < 6);
                    }
                    i = start + subSequence.length();
                    this.A01--;
                }
            }
            this.A02 = r0;
            if (r0 == null) {
                num = AnonymousClass05K.A0C;
            } else {
                this.A00 = r0.A00 + r0.A01.length();
                num = AnonymousClass05K.A01;
            }
            this.A03 = num;
        }
        if (num == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public static boolean A01(char c) {
        if (Character.isLetter(c) || Character.getType(c) == 6) {
            Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
            if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            AnonymousClass7AH r1 = this.A02;
            this.A02 = null;
            this.A03 = AnonymousClass05K.A00;
            return r1;
        }
        throw new NoSuchElementException();
    }

    public AnonymousClass7A8(AnonymousClass7A5 r5, PhoneNumberUtil phoneNumberUtil, String str, String str2) {
        if (phoneNumberUtil != null) {
            this.A05 = phoneNumberUtil;
            this.A06 = str == null ? "" : str;
            this.A07 = str2;
            this.A04 = r5;
            this.A01 = Long.MAX_VALUE;
            return;
        }
        throw null;
    }
}
