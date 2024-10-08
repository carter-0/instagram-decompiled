package X;

import java.util.regex.Pattern;

/* renamed from: X.SMn  reason: case insensitive filesystem */
public abstract class C11313SMn {
    public static final Pattern A00 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A01 = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r1.equals(r0) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        switch(r0) {
            case 1: goto L_0x0073;
            case 2: goto L_0x0051;
            case 3: goto L_0x006d;
            default: goto L_0x0049;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r0 = new android.text.style.UnderlineSpan();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r7.setSpan(r0, r6, r5, 33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r10.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (0 >= r9.size()) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r9.get(0);
        java.util.Collections.addAll(X.AnonymousClass7TE.A1F(), r8.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        throw X.AnonymousClass7TE.A11("getSpecificityScore");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r0 = new android.text.style.StyleSpan(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r0 = new android.text.style.StyleSpan(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        java.util.Collections.sort(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (0 >= r10.size()) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        r10.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        throw X.AnonymousClass7TE.A11("style");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.text.SpannableStringBuilder r7, X.C11195SEv r8, java.util.List r9, java.util.List r10) {
        /*
            int r6 = r8.A00
            int r5 = r7.length()
            java.lang.String r1 = r8.A01
            int r0 = r1.hashCode()
            r4 = 2
            r3 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0032;
                case 98: goto L_0x003b;
                case 99: goto L_0x002f;
                case 105: goto L_0x0025;
                case 117: goto L_0x0013;
                case 118: goto L_0x0021;
                case 3314158: goto L_0x001e;
                default: goto L_0x0012;
            }
        L_0x0012:
            return
        L_0x0013:
            java.lang.String r0 = "u"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 4
            goto L_0x0044
        L_0x001e:
            java.lang.String r0 = "lang"
            goto L_0x0034
        L_0x0021:
            java.lang.String r0 = "v"
            goto L_0x0034
        L_0x0025:
            java.lang.String r0 = "i"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 3
            goto L_0x0044
        L_0x002f:
            java.lang.String r0 = "c"
            goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0051
            return
        L_0x003b:
            java.lang.String r0 = "b"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0012
            r0 = 1
        L_0x0044:
            r1 = 33
            switch(r0) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0051;
                case 3: goto L_0x006d;
                default: goto L_0x0049;
            }
        L_0x0049:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
        L_0x004e:
            r7.setSpan(r0, r6, r5, r1)
        L_0x0051:
            r10.clear()
            int r0 = r9.size()
            if (r3 >= r0) goto L_0x0079
            r9.get(r3)
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            java.lang.String[] r0 = r8.A02
            java.util.Collections.addAll(r1, r0)
            java.lang.String r0 = "getSpecificityScore"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x006d:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            goto L_0x004e
        L_0x0073:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            goto L_0x004e
        L_0x0079:
            java.util.Collections.sort(r10)
            int r0 = r10.size()
            if (r3 >= r0) goto L_0x0012
            r10.get(r3)
            java.lang.String r0 = "style"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11313SMn.A01(android.text.SpannableStringBuilder, X.SEv, java.util.List, java.util.List):void");
    }

    public static int A00(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1364013995:
                str2 = "center";
                break;
            case -1074341483:
                str2 = "middle";
                break;
            case 100571:
                if (str.equals("end")) {
                    return 2;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 0;
                }
                break;
        }
        if (str.equals(str2)) {
            return 1;
        }
        2AG.A04("WebvttCueParser", 002.A0R("Invalid anchor value: ", str));
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }
}
