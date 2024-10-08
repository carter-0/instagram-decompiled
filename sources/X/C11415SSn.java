package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SSn  reason: case insensitive filesystem */
public abstract class C11415SSn {
    public static final Map A00;
    public static final Map A01;
    public static final Pattern A02 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A03 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        boolean A0h = Pxk.A0h(A1E);
        A01 = Collections.unmodifiableMap(A1E);
        HashMap A1E2 = AnonymousClass7TE.A1E();
        Pxk.A0f(A1E2, A0h ? 1 : 0);
        A00 = Collections.unmodifiableMap(A1E2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        X.STH.A03("WebvttCueParser", X.002.A0g("ignoring unsupported entity: '&", r3, ";'"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r2 != r1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r4.append(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r9 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        r4.append(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannedString A00(java.lang.String r13, java.lang.String r14, java.util.List r15) {
        /*
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r3 = 0
        L_0x000f:
            int r1 = r14.length()
            if (r3 >= r1) goto L_0x018f
            char r5 = r14.charAt(r3)
            r0 = 38
            if (r5 == r0) goto L_0x0027
            r0 = 60
            if (r5 == r0) goto L_0x0095
            r4.append(r5)
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0027:
            r0 = 59
            int r3 = r3 + 1
            int r2 = r14.indexOf(r0, r3)
            r0 = 32
            int r1 = r14.indexOf(r0, r3)
            r0 = -1
            if (r2 != r0) goto L_0x008e
            r2 = r1
        L_0x0039:
            if (r2 == r0) goto L_0x018a
            java.lang.String r3 = r14.substring(r3, r2)
            int r0 = r3.hashCode()
            switch(r0) {
                case 3309: goto L_0x005e;
                case 3464: goto L_0x0069;
                case 96708: goto L_0x0074;
                case 3374865: goto L_0x007f;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r5 = "ignoring unsupported entity: '&"
            java.lang.String r0 = ";'"
            java.lang.String r3 = X.002.A0g(r5, r3, r0)
            java.lang.String r0 = "WebvttCueParser"
            X.STH.A03(r0, r3)
        L_0x0053:
            if (r2 != r1) goto L_0x005a
            java.lang.String r0 = " "
            r4.append(r0)
        L_0x005a:
            int r9 = r2 + 1
            goto L_0x00ea
        L_0x005e:
            java.lang.String r0 = "gt"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 62
            goto L_0x008a
        L_0x0069:
            java.lang.String r0 = "lt"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 60
            goto L_0x008a
        L_0x0074:
            java.lang.String r0 = "amp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 38
            goto L_0x008a
        L_0x007f:
            java.lang.String r0 = "nbsp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 32
        L_0x008a:
            r4.append(r0)
            goto L_0x0053
        L_0x008e:
            if (r1 == r0) goto L_0x0039
            int r2 = java.lang.Math.min(r2, r1)
            goto L_0x0039
        L_0x0095:
            int r9 = r3 + 1
            if (r9 >= r1) goto L_0x00ea
            char r0 = r14.charAt(r9)
            r8 = 47
            r2 = 1
            boolean r12 = X.AnonymousClass7TF.A1S(r0, r8)
            r0 = 62
            int r0 = r14.indexOf(r0, r9)
            r5 = -1
            int r9 = r0 + 1
            if (r0 != r5) goto L_0x00b0
            r9 = r1
        L_0x00b0:
            int r1 = r9 + -2
            char r0 = r14.charAt(r1)
            boolean r8 = X.AnonymousClass7TF.A1S(r0, r8)
            if (r12 == 0) goto L_0x00bd
            r2 = 2
        L_0x00bd:
            int r3 = r3 + r2
            if (r8 != 0) goto L_0x00c2
            int r1 = r9 + -1
        L_0x00c2:
            java.lang.String r10 = r14.substring(r3, r1)
            boolean r0 = X.Pxi.A1Z(r10)
            if (r0 != 0) goto L_0x00ea
            java.lang.String r2 = r10.trim()
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            X.C11366SPh.A01(r0)
            java.lang.String r1 = "[ \\.]"
            r0 = 2
            java.lang.String[] r0 = r2.split(r1, r0)
            r11 = 0
            r3 = r0[r11]
            int r0 = r3.hashCode()
            switch(r0) {
                case 98: goto L_0x00ed;
                case 99: goto L_0x00f0;
                case 105: goto L_0x00f3;
                case 117: goto L_0x00f6;
                case 118: goto L_0x00fa;
                case 3650: goto L_0x00fe;
                case 3314158: goto L_0x0102;
                case 3511770: goto L_0x0105;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            r3 = r9
            goto L_0x000f
        L_0x00ed:
            java.lang.String r0 = "b"
            goto L_0x0108
        L_0x00f0:
            java.lang.String r0 = "c"
            goto L_0x0108
        L_0x00f3:
            java.lang.String r0 = "i"
            goto L_0x0108
        L_0x00f6:
            java.lang.String r0 = "u"
            goto L_0x0108
        L_0x00fa:
            java.lang.String r0 = "v"
            goto L_0x0108
        L_0x00fe:
            java.lang.String r0 = "rt"
            goto L_0x0108
        L_0x0102:
            java.lang.String r0 = "lang"
            goto L_0x0108
        L_0x0105:
            java.lang.String r0 = "ruby"
        L_0x0108:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ea
            if (r12 != 0) goto L_0x015b
            if (r8 != 0) goto L_0x00ea
            int r8 = r4.length()
            java.lang.String r3 = r10.trim()
            boolean r0 = r3.isEmpty()
            r10 = 1
            r0 = r0 ^ 1
            X.C11366SPh.A01(r0)
            java.lang.String r0 = " "
            int r2 = r3.indexOf(r0)
            if (r2 != r5) goto L_0x0145
            java.lang.String r1 = ""
        L_0x012e:
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r3.split(r0, r5)
            r3 = r5[r11]
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
        L_0x013a:
            int r0 = r5.length
            if (r10 >= r0) goto L_0x0152
            r0 = r5[r10]
            r2.add(r0)
            int r10 = r10 + 1
            goto L_0x013a
        L_0x0145:
            java.lang.String r0 = r3.substring(r2)
            java.lang.String r1 = r0.trim()
            java.lang.String r3 = r3.substring(r11, r2)
            goto L_0x012e
        L_0x0152:
            X.Rvk r0 = new X.Rvk
            r0.<init>(r3, r1, r2, r8)
            r7.push(r0)
            goto L_0x00ea
        L_0x015b:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00ea
            java.lang.Object r2 = r7.pop()
            X.Rvk r2 = (X.C10651Rvk) r2
            A03(r4, r2, r13, r6, r15)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0186
            int r1 = r4.length()
            X.SEM r0 = new X.SEM
            r0.<init>(r2, r1)
            r6.add(r0)
        L_0x017c:
            java.lang.String r0 = r2.A01
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x015b
            goto L_0x00ea
        L_0x0186:
            r6.clear()
            goto L_0x017c
        L_0x018a:
            r4.append(r5)
            goto L_0x000f
        L_0x018f:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x019f
            java.lang.Object r0 = r7.pop()
            X.Rvk r0 = (X.C10651Rvk) r0
            A03(r4, r0, r13, r6, r15)
            goto L_0x018f
        L_0x019f:
            java.util.Set r3 = java.util.Collections.emptySet()
            java.lang.String r2 = ""
            r0 = 0
            X.Rvk r1 = new X.Rvk
            r1.<init>(r2, r2, r3, r0)
            java.util.List r0 = java.util.Collections.emptyList()
            A03(r4, r1, r13, r0, r15)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11415SSn.A00(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static C10515RtU A01(C11389SRd sRd, String str, List list, Matcher matcher) {
        S3R s3r = new S3R();
        try {
            s3r.A09 = SL4.A01(Pxf.A0o(matcher, 1));
            s3r.A08 = SL4.A01(Pxf.A0o(matcher, 2));
            A04(s3r, Pxf.A0o(matcher, 3));
            StringBuilder A1A = AnonymousClass7TE.A1A();
            while (true) {
                String A0H = sRd.A0H(AnonymousClass2RN.A05);
                if (!TextUtils.isEmpty(A0H)) {
                    if (A1A.length() > 0) {
                        A1A.append("\n");
                    }
                    A1A.append(A0H.trim());
                } else {
                    s3r.A0A = A00(str, A1A.toString(), list);
                    return new C10515RtU(s3r.A00().A00(), s3r.A09, s3r.A08);
                }
            }
        } catch (NumberFormatException unused) {
            STH.A03("WebvttCueParser", 002.A0R("Skipping cue with bad header: ", matcher.group()));
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d8, code lost:
        r1 = new android.text.style.BackgroundColorSpan(X.Pxg.A06(r11, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e2, code lost:
        r0 = new android.text.style.StyleSpan(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ee, code lost:
        if (r1.equals(r0) != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
        switch(r0) {
            case 1: goto L_0x01e2;
            case 2: goto L_0x01a9;
            case 3: goto L_0x01a2;
            default: goto L_0x00ff;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        r0 = new android.text.style.UnderlineSpan();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        r9.setSpan(r0, r6, r5, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0107, code lost:
        r8 = A02(r8, r19, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
        if (r3 >= r8.size()) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        r10 = ((X.TA5) r8.get(r3)).A01;
        r1 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        if (r1 != -1) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        if (r10.A05 != -1) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0124, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r1 == -1) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        X.C9174RRz.A00(r9, new android.text.style.StyleSpan(r1), r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r10.A07 != 1) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0135, code lost:
        r9.setSpan(new android.text.style.UnderlineSpan(), r6, r5, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013f, code lost:
        if (r10.A0F == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0141, code lost:
        X.C9174RRz.A00(r9, new android.text.style.ForegroundColorSpan(r10.A03), r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014d, code lost:
        if (r10.A0E == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014f, code lost:
        X.C9174RRz.A00(r9, new android.text.style.BackgroundColorSpan(r10.A01), r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r1 = r10.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        if (r1 == null) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015d, code lost:
        X.C9174RRz.A00(r9, new android.text.style.TypefaceSpan(r1), r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0165, code lost:
        r1 = r10.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0167, code lost:
        if (r1 == 1) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0169, code lost:
        if (r1 == 2) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016c, code lost:
        if (r1 != 3) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016e, code lost:
        r1 = r10.A00 / 100.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0173, code lost:
        r0 = new android.text.style.RelativeSizeSpan(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0178, code lost:
        X.C9174RRz.A00(r9, r0, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017d, code lost:
        if (r10.A0D == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017f, code lost:
        r9.setSpan(new java.lang.Object(), r6, r5, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0187, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018a, code lost:
        r1 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018d, code lost:
        r0 = new android.text.style.AbsoluteSizeSpan((int) r10.A00, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0196, code lost:
        r7 = 0;
        r1 = X.AnonymousClass7TF.A1S(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019d, code lost:
        if (r10.A05 != 1) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019f, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a0, code lost:
        r1 = r1 | r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a2, code lost:
        r0 = new android.text.style.StyleSpan(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a9, code lost:
        r12 = r8.A03.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b3, code lost:
        if (r12.hasNext() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b5, code lost:
        r11 = r12.next();
        r1 = A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c1, code lost:
        if (r1.containsKey(r11) == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c3, code lost:
        r1 = new android.text.style.ForegroundColorSpan(X.Pxg.A06(r11, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01cc, code lost:
        r9.setSpan(r1, r6, r5, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d0, code lost:
        r1 = A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d6, code lost:
        if (r1.containsKey(r11) == false) goto L_0x01af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.text.SpannableStringBuilder r17, X.C10651Rvk r18, java.lang.String r19, java.util.List r20, java.util.List r21) {
        /*
            r8 = r18
            int r6 = r8.A00
            r9 = r17
            int r5 = r9.length()
            java.lang.String r1 = r8.A01
            int r0 = r1.hashCode()
            r4 = 2
            r3 = 0
            r2 = 1
            r7 = r21
            switch(r0) {
                case 0: goto L_0x00e8;
                case 98: goto L_0x00f1;
                case 99: goto L_0x00df;
                case 105: goto L_0x00d5;
                case 117: goto L_0x0019;
                case 118: goto L_0x00d1;
                case 3314158: goto L_0x00ce;
                case 3511770: goto L_0x0025;
                default: goto L_0x0018;
            }
        L_0x0018:
            return
        L_0x0019:
            java.lang.String r0 = "u"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 4
            goto L_0x00fa
        L_0x0025:
            java.lang.String r0 = "ruby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = r19
            java.util.ArrayList r10 = A02(r8, r0, r7)
            r1 = 0
        L_0x0035:
            int r0 = r10.size()
            r13 = -1
            if (r1 >= r0) goto L_0x004b
            java.lang.Object r0 = r10.get(r1)
            X.TA5 r0 = (X.TA5) r0
            X.RzD r0 = r0.A01
            int r12 = r0.A06
            if (r12 != r13) goto L_0x004c
            int r1 = r1 + 1
            goto L_0x0035
        L_0x004b:
            r12 = -1
        L_0x004c:
            r0 = r20
            java.util.ArrayList r11 = X.C51970G9q.A0m(r0)
            r11.addAll(r0)
            java.util.Comparator r0 = X.SEM.A02
            java.util.Collections.sort(r11, r0)
            r18 = r6
            r10 = 0
            r17 = 0
        L_0x005f:
            int r0 = r11.size()
            if (r10 >= r0) goto L_0x0107
            java.lang.Object r0 = r11.get(r10)
            X.SEM r0 = (X.SEM) r0
            X.Rvk r0 = r0.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "rt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r14 = r11.get(r10)
            X.SEM r14 = (X.SEM) r14
            X.Rvk r1 = r14.A01
            r0 = r19
            java.util.ArrayList r16 = A02(r1, r0, r7)
            r15 = 0
        L_0x0087:
            int r0 = r16.size()
            if (r15 >= r0) goto L_0x009e
            r0 = r16
            java.lang.Object r0 = r0.get(r15)
            X.TA5 r0 = (X.TA5) r0
            X.RzD r0 = r0.A01
            int r0 = r0.A06
            if (r0 != r13) goto L_0x00a2
            int r15 = r15 + 1
            goto L_0x0087
        L_0x009e:
            r0 = 1
            if (r12 == r13) goto L_0x00a2
            r0 = r12
        L_0x00a2:
            int r1 = r1.A00
            int r1 = r1 - r17
            int r14 = r14.A00
            int r14 = r14 - r17
            java.lang.CharSequence r16 = r9.subSequence(r1, r14)
            r9.delete(r1, r14)
            java.lang.String r14 = X.C11175SEb.A02
            java.lang.String r15 = r16.toString()
            X.SEb r14 = new X.SEb
            r14.<init>(r15, r0)
            r15 = 33
            r0 = r18
            r9.setSpan(r14, r0, r1, r15)
            int r0 = r16.length()
            int r17 = r17 + r0
            r18 = r1
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x005f
        L_0x00ce:
            java.lang.String r0 = "lang"
            goto L_0x00ea
        L_0x00d1:
            java.lang.String r0 = "v"
            goto L_0x00ea
        L_0x00d5:
            java.lang.String r0 = "i"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 3
            goto L_0x00fa
        L_0x00df:
            java.lang.String r0 = "c"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01a9
            return
        L_0x00e8:
            java.lang.String r0 = ""
        L_0x00ea:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0107
            return
        L_0x00f1:
            java.lang.String r0 = "b"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            r0 = 1
        L_0x00fa:
            r1 = 33
            switch(r0) {
                case 1: goto L_0x01e2;
                case 2: goto L_0x01a9;
                case 3: goto L_0x01a2;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x0104:
            r9.setSpan(r0, r6, r5, r1)
        L_0x0107:
            r0 = r19
            java.util.ArrayList r8 = A02(r8, r0, r7)
        L_0x010d:
            int r0 = r8.size()
            if (r3 >= r0) goto L_0x0018
            java.lang.Object r0 = r8.get(r3)
            X.TA5 r0 = (X.TA5) r0
            X.RzD r10 = r0.A01
            int r1 = r10.A02
            r11 = -1
            if (r1 != r11) goto L_0x0196
            int r0 = r10.A05
            if (r0 != r11) goto L_0x0196
            r1 = -1
        L_0x0125:
            r7 = 33
            if (r1 == r11) goto L_0x0131
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            X.C9174RRz.A00(r9, r0, r6, r5)
        L_0x0131:
            int r0 = r10.A07
            if (r0 != r2) goto L_0x013d
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r9.setSpan(r0, r6, r5, r7)
        L_0x013d:
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x014b
            int r1 = r10.A03
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.C9174RRz.A00(r9, r0, r6, r5)
        L_0x014b:
            boolean r0 = r10.A0E
            if (r0 == 0) goto L_0x0159
            int r1 = r10.A01
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            X.C9174RRz.A00(r9, r0, r6, r5)
        L_0x0159:
            java.lang.String r1 = r10.A08
            if (r1 == 0) goto L_0x0165
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
            X.C9174RRz.A00(r9, r0, r6, r5)
        L_0x0165:
            int r1 = r10.A04
            if (r1 == r2) goto L_0x018d
            if (r1 == r4) goto L_0x018a
            r0 = 3
            if (r1 != r0) goto L_0x017b
            float r1 = r10.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
        L_0x0173:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r1)
        L_0x0178:
            X.C9174RRz.A00(r9, r0, r6, r5)
        L_0x017b:
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0187
            X.RRy r0 = new X.RRy
            r0.<init>()
            r9.setSpan(r0, r6, r5, r7)
        L_0x0187:
            int r3 = r3 + 1
            goto L_0x010d
        L_0x018a:
            float r1 = r10.A00
            goto L_0x0173
        L_0x018d:
            float r0 = r10.A00
            int r1 = (int) r0
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            r0.<init>(r1, r2)
            goto L_0x0178
        L_0x0196:
            r7 = 0
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r2)
            int r0 = r10.A05
            if (r0 != r2) goto L_0x01a0
            r7 = 2
        L_0x01a0:
            r1 = r1 | r7
            goto L_0x0125
        L_0x01a2:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            goto L_0x0104
        L_0x01a9:
            java.util.Set r0 = r8.A03
            java.util.Iterator r12 = r0.iterator()
        L_0x01af:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r11 = r12.next()
            java.util.Map r1 = A01
            boolean r0 = r1.containsKey(r11)
            r10 = 33
            if (r0 == 0) goto L_0x01d0
            int r0 = X.Pxg.A06(r11, r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
        L_0x01cc:
            r9.setSpan(r1, r6, r5, r10)
            goto L_0x01af
        L_0x01d0:
            java.util.Map r1 = A00
            boolean r0 = r1.containsKey(r11)
            if (r0 == 0) goto L_0x01af
            int r0 = X.Pxg.A06(r11, r1)
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            r1.<init>(r0)
            goto L_0x01cc
        L_0x01e2:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11415SSn.A03(android.text.SpannableStringBuilder, X.Rvk, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r5.equals(r0) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r7.A03 = r0;
        r4 = r4.substring(0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        X.Pxh.A1J("Invalid alignment value: ", r4, "WebvttCueParser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c8, code lost:
        if (r4.equals(r0) != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d3, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d4, code lost:
        r7.A06 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010b, code lost:
        if (r1.equals(r0) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0114, code lost:
        if (r1.equals(r0) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011e, code lost:
        if (r1.equals(r0) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0124, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0126, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0128, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0129, code lost:
        r7.A05 = r0;
        r4 = X.Pxe.A0x(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.S3R r7, java.lang.String r8) {
        /*
            java.lang.String r2 = "WebvttCueParser"
            java.util.regex.Pattern r0 = A03
            java.util.regex.Matcher r3 = r0.matcher(r8)
        L_0x0008:
            boolean r0 = r3.find()
            if (r0 == 0) goto L_0x0189
            r0 = 1
            java.lang.String r5 = X.Pxf.A0o(r3, r0)
            r0 = 2
            java.lang.String r4 = X.Pxf.A0o(r3, r0)
            java.lang.String r0 = "line"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0083
            r0 = 44
            int r6 = r4.indexOf(r0)     // Catch:{ NumberFormatException -> 0x017e }
            r1 = 0
            r0 = -1
            if (r6 == r0) goto L_0x0069
            java.lang.String r5 = X.Pxe.A0v(r6, r4)     // Catch:{ NumberFormatException -> 0x017e }
            int r0 = r5.hashCode()     // Catch:{ NumberFormatException -> 0x017e }
            switch(r0) {
                case -1364013995: goto L_0x003b;
                case -1074341483: goto L_0x003e;
                case 100571: goto L_0x0048;
                case 109757538: goto L_0x0051;
                default: goto L_0x0035;
            }     // Catch:{ NumberFormatException -> 0x017e }
        L_0x0035:
            java.lang.String r0 = "Invalid anchor value: "
            X.Pxh.A1J(r0, r5, r2)     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x005b
        L_0x003b:
            java.lang.String r0 = "center"
            goto L_0x0041
        L_0x003e:
            java.lang.String r0 = "middle"
        L_0x0041:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0035
            goto L_0x005e
        L_0x0048:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0035
            goto L_0x0060
        L_0x0051:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0035
            goto L_0x0062
        L_0x005b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0063
        L_0x005e:
            r0 = 1
            goto L_0x0063
        L_0x0060:
            r0 = 2
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r7.A03 = r0     // Catch:{ NumberFormatException -> 0x017e }
            java.lang.String r4 = r4.substring(r1, r6)     // Catch:{ NumberFormatException -> 0x017e }
        L_0x0069:
            java.lang.String r0 = "%"
            boolean r0 = r4.endsWith(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x007a
            float r0 = X.SL4.A00(r4)     // Catch:{ NumberFormatException -> 0x017e }
            r7.A00 = r0     // Catch:{ NumberFormatException -> 0x017e }
        L_0x0077:
            r7.A04 = r1     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0008
        L_0x007a:
            int r0 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x017e }
            float r0 = (float) r0     // Catch:{ NumberFormatException -> 0x017e }
            r7.A00 = r0     // Catch:{ NumberFormatException -> 0x017e }
            r1 = 1
            goto L_0x0077
        L_0x0083:
            java.lang.String r0 = "align"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x00d8
            int r0 = r4.hashCode()     // Catch:{ NumberFormatException -> 0x017e }
            switch(r0) {
                case -1364013995: goto L_0x00c2;
                case -1074341483: goto L_0x00be;
                case 100571: goto L_0x00b5;
                case 3317767: goto L_0x00ac;
                case 108511772: goto L_0x00a2;
                case 109757538: goto L_0x0098;
                default: goto L_0x0092;
            }     // Catch:{ NumberFormatException -> 0x017e }
        L_0x0092:
            java.lang.String r0 = "Invalid alignment value: "
            X.Pxh.A1J(r0, r4, r2)     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x00d3
        L_0x0098:
            java.lang.String r0 = "start"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0092
            goto L_0x00cb
        L_0x00a2:
            java.lang.String r0 = "right"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0092
            goto L_0x00cd
        L_0x00ac:
            java.lang.String r0 = "left"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0092
            goto L_0x00cf
        L_0x00b5:
            java.lang.String r0 = "end"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0092
            goto L_0x00d1
        L_0x00be:
            java.lang.String r0 = "middle"
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r0 = "center"
        L_0x00c4:
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 != 0) goto L_0x00d3
            goto L_0x0092
        L_0x00cb:
            r0 = 1
            goto L_0x00d4
        L_0x00cd:
            r0 = 5
            goto L_0x00d4
        L_0x00cf:
            r0 = 4
            goto L_0x00d4
        L_0x00d1:
            r0 = 3
            goto L_0x00d4
        L_0x00d3:
            r0 = 2
        L_0x00d4:
            r7.A06 = r0     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0008
        L_0x00d8:
            java.lang.String r0 = "position"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0137
            r0 = 44
            int r5 = r4.indexOf(r0)     // Catch:{ NumberFormatException -> 0x017e }
            r0 = -1
            if (r5 == r0) goto L_0x012f
            java.lang.String r1 = X.Pxe.A0v(r5, r4)     // Catch:{ NumberFormatException -> 0x017e }
            int r0 = r1.hashCode()     // Catch:{ NumberFormatException -> 0x017e }
            switch(r0) {
                case -1842484672: goto L_0x00fb;
                case -1364013995: goto L_0x00fe;
                case -1276788989: goto L_0x0101;
                case -1074341483: goto L_0x0104;
                case 100571: goto L_0x010e;
                case 109757538: goto L_0x0117;
                default: goto L_0x00f5;
            }     // Catch:{ NumberFormatException -> 0x017e }
        L_0x00f5:
            java.lang.String r0 = "Invalid anchor value: "
            X.Pxh.A1J(r0, r1, r2)     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0121
        L_0x00fb:
            java.lang.String r0 = "line-left"
            goto L_0x011a
        L_0x00fe:
            java.lang.String r0 = "center"
            goto L_0x0107
        L_0x0101:
            java.lang.String r0 = "line-right"
            goto L_0x0110
        L_0x0104:
            java.lang.String r0 = "middle"
        L_0x0107:
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x00f5
            goto L_0x0124
        L_0x010e:
            java.lang.String r0 = "end"
        L_0x0110:
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x00f5
            goto L_0x0126
        L_0x0117:
            java.lang.String r0 = "start"
        L_0x011a:
            boolean r0 = r1.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x00f5
            goto L_0x0128
        L_0x0121:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0129
        L_0x0124:
            r0 = 1
            goto L_0x0129
        L_0x0126:
            r0 = 2
            goto L_0x0129
        L_0x0128:
            r0 = 0
        L_0x0129:
            r7.A05 = r0     // Catch:{ NumberFormatException -> 0x017e }
            java.lang.String r4 = X.Pxe.A0x(r4, r5)     // Catch:{ NumberFormatException -> 0x017e }
        L_0x012f:
            float r0 = X.SL4.A00(r4)     // Catch:{ NumberFormatException -> 0x017e }
            r7.A01 = r0     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0008
        L_0x0137:
            java.lang.String r0 = "size"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0148
            float r0 = X.SL4.A00(r4)     // Catch:{ NumberFormatException -> 0x017e }
            r7.A02 = r0     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0008
        L_0x0148:
            java.lang.String r0 = "vertical"
            boolean r0 = r0.equals(r5)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = "lr"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 != 0) goto L_0x016c
            java.lang.String r0 = "rl"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x017e }
            if (r0 != 0) goto L_0x016a
            java.lang.String r0 = "Invalid 'vertical' value: "
            X.Pxh.A1J(r0, r4, r2)     // Catch:{ NumberFormatException -> 0x017e }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x016d
        L_0x016a:
            r0 = 1
            goto L_0x016d
        L_0x016c:
            r0 = 2
        L_0x016d:
            r7.A07 = r0     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0008
        L_0x0171:
            java.lang.String r1 = "Unknown cue setting "
            java.lang.String r0 = ":"
            java.lang.String r0 = X.002.A0u(r1, r5, r0, r4)     // Catch:{ NumberFormatException -> 0x017e }
            X.STH.A03(r2, r0)     // Catch:{ NumberFormatException -> 0x017e }
            goto L_0x0008
        L_0x017e:
            java.lang.String r1 = "Skipping bad cue setting: "
            java.lang.String r0 = r3.group()
            X.Pxh.A1J(r1, r0, r2)
            goto L_0x0008
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11415SSn.A04(X.S3R, java.lang.String):void");
    }

    public static ArrayList A02(C10651Rvk rvk, String str, List list) {
        int size;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < list.size(); i++) {
            C10853RzD rzD = (C10853RzD) list.get(i);
            String str2 = rvk.A01;
            Set set = rvk.A03;
            String str3 = rvk.A02;
            if (!rzD.A09.isEmpty() || !rzD.A0A.isEmpty() || !rzD.A0C.isEmpty() || !rzD.A0B.isEmpty()) {
                String str4 = rzD.A09;
                int i2 = 0;
                if (!str4.isEmpty()) {
                    i2 = -1;
                    if (str4.equals(str)) {
                        i2 = SN3.MAX_SIGNED_POWER_OF_TWO;
                    }
                }
                String str5 = rzD.A0A;
                if (!str5.isEmpty()) {
                    int i3 = -1;
                    if (i2 != -1) {
                        if (str5.equals(str2)) {
                            i3 = i2 + 2;
                        }
                        i2 = i3;
                    }
                }
                String str6 = rzD.A0B;
                if (!str6.isEmpty()) {
                    if (i2 != -1 && str6.equals(str3)) {
                        i2 += 4;
                    }
                }
                if (i2 != -1 && set.containsAll(rzD.A0C)) {
                    size = i2 + (rzD.A0C.size() * 4);
                }
            } else {
                size = TextUtils.isEmpty(str2);
            }
            if (size > 0) {
                A1C.add(new TA5(rzD, size));
            }
        }
        Collections.sort(A1C);
        return A1C;
    }
}
