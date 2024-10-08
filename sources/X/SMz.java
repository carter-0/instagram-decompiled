package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class SMz {
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

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r1.equals(r0) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        switch(r0) {
            case 1: goto L_0x010c;
            case 2: goto L_0x00d3;
            case 3: goto L_0x00cd;
            default: goto L_0x00b1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        r0 = new android.text.style.UnderlineSpan();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r9.setSpan(r0, r6, r5, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        r1 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (0 >= r12.size()) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        r12.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        throw X.AnonymousClass7TE.A11("getSpecificityScore");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        r0 = new android.text.style.StyleSpan(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r7 = r10.A02.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dd, code lost:
        if (r7.hasNext() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        r3 = r7.next();
        r1 = A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00eb, code lost:
        if (r1.containsKey(r3) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        r1 = new android.text.style.ForegroundColorSpan(X.Pxg.A06(r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f6, code lost:
        r9.setSpan(r1, r6, r5, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fa, code lost:
        r1 = A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        if (r1.containsKey(r3) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        r1 = new android.text.style.BackgroundColorSpan(X.Pxg.A06(r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        r0 = new android.text.style.StyleSpan(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0112, code lost:
        java.util.Collections.sort(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        if (0 >= r1.size()) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011b, code lost:
        r1.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        throw X.AnonymousClass7TE.A11("style");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.text.SpannableStringBuilder r9, X.C10596Ruq r10, java.util.List r11, java.util.List r12) {
        /*
            int r6 = r10.A00
            int r5 = r9.length()
            java.lang.String r1 = r10.A01
            int r0 = r1.hashCode()
            r3 = 2
            r4 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x009a;
                case 98: goto L_0x00a3;
                case 99: goto L_0x0091;
                case 105: goto L_0x0087;
                case 117: goto L_0x0013;
                case 118: goto L_0x0083;
                case 3314158: goto L_0x0080;
                case 3511770: goto L_0x001f;
                default: goto L_0x0012;
            }
        L_0x0012:
            return
        L_0x0013:
            java.lang.String r0 = "u"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 4
            goto L_0x00ac
        L_0x001f:
            java.lang.String r0 = "ruby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            A01(r12)
            java.util.ArrayList r5 = X.C51970G9q.A0m(r11)
            r5.addAll(r11)
            java.util.Comparator r0 = X.SEY.A02
            java.util.Collections.sort(r5, r0)
            r7 = 0
            r8 = 0
        L_0x0039:
            int r0 = r5.size()
            if (r7 >= r0) goto L_0x00b9
            java.lang.Object r0 = r5.get(r7)
            X.SEY r0 = (X.SEY) r0
            X.Ruq r0 = r0.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "rt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007d
            java.lang.Object r1 = r5.get(r7)
            X.SEY r1 = (X.SEY) r1
            X.Ruq r0 = r1.A01
            A01(r12)
            int r3 = r0.A00
            int r3 = r3 - r8
            int r0 = r1.A00
            int r0 = r0 - r8
            java.lang.CharSequence r2 = r9.subSequence(r3, r0)
            r9.delete(r3, r0)
            r2.toString()
            X.Rf9 r1 = new X.Rf9
            r1.<init>()
            r0 = 33
            r9.setSpan(r1, r6, r3, r0)
            int r0 = r2.length()
            int r8 = r8 + r0
            r6 = r3
        L_0x007d:
            int r7 = r7 + 1
            goto L_0x0039
        L_0x0080:
            java.lang.String r0 = "lang"
            goto L_0x009c
        L_0x0083:
            java.lang.String r0 = "v"
            goto L_0x009c
        L_0x0087:
            java.lang.String r0 = "i"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 3
            goto L_0x00ac
        L_0x0091:
            java.lang.String r0 = "c"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d3
            return
        L_0x009a:
            java.lang.String r0 = ""
        L_0x009c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b9
            return
        L_0x00a3:
            java.lang.String r0 = "b"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 1
        L_0x00ac:
            r1 = 33
            switch(r0) {
                case 1: goto L_0x010c;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00cd;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x00b6:
            r9.setSpan(r0, r6, r5, r1)
        L_0x00b9:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            int r0 = r12.size()
            if (r4 >= r0) goto L_0x0112
            r12.get(r4)
            java.lang.String r0 = "getSpecificityScore"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x00cd:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r3)
            goto L_0x00b6
        L_0x00d3:
            java.util.Set r0 = r10.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x00d9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r3 = r7.next()
            java.util.Map r1 = A01
            boolean r0 = r1.containsKey(r3)
            r2 = 33
            if (r0 == 0) goto L_0x00fa
            int r0 = X.Pxg.A06(r3, r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
        L_0x00f6:
            r9.setSpan(r1, r6, r5, r2)
            goto L_0x00d9
        L_0x00fa:
            java.util.Map r1 = A00
            boolean r0 = r1.containsKey(r3)
            if (r0 == 0) goto L_0x00d9
            int r0 = X.Pxg.A06(r3, r1)
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            r1.<init>(r0)
            goto L_0x00f6
        L_0x010c:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            goto L_0x00b6
        L_0x0112:
            java.util.Collections.sort(r1)
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0012
            r1.get(r4)
            java.lang.String r0 = "style"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMz.A00(android.text.SpannableStringBuilder, X.Ruq, java.util.List, java.util.List):void");
    }

    public static void A01(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass7TE.A11("getSpecificityScore");
        }
        Collections.sort(A1C);
        if (0 < A1C.size()) {
            A1C.get(0);
            throw AnonymousClass7TE.A11("style");
        }
    }
}
