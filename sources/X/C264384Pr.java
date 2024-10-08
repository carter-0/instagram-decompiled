package X;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* renamed from: X.4Pr  reason: invalid class name and case insensitive filesystem */
public final class C264384Pr {
    public static final C264384Pr A01 = new C264384Pr(new int[]{2});
    public static final ImmutableMap A02;
    public static final C264384Pr A03 = new C264384Pr(new int[]{2, 5, 6});
    public final int[] A00;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(5, 6);
        builder.put(17, 6);
        builder.put(7, 6);
        builder.put(18, 6);
        builder.put(6, 8);
        builder.put(8, 8);
        builder.put(14, 8);
        A02 = builder.build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C264384Pr) && Arrays.equals(this.A00, ((C264384Pr) obj).A00);
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r2 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (java.util.Arrays.binarySearch(r7.A00, r2) < 0) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r3 == -1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r2 == 18) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r3 <= 8) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r0 = r8.A0G;
        r3 = 48000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r0 == -1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (com.google.android.exoplayer2.util.Util.A00 < 29) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        r3 = X.C11136SBr.A00(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (com.google.android.exoplayer2.util.Util.A00 > 28) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        if (r3 != 7) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        r0 = com.google.android.exoplayer2.util.Util.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        if (r0 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        return android.util.Pair.create(java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        if (r3 == 3) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        if (r3 == 4) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007d, code lost:
        if (r3 != 5) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0081, code lost:
        r0 = r4.getOrDefault(java.lang.Integer.valueOf(r2), 0);
        r0.getClass();
        r3 = ((java.lang.Number) r0).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009a, code lost:
        if (r2 != 8) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        if (java.util.Arrays.binarySearch(r7.A00, 8) < 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r4 = A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4.containsKey(java.lang.Integer.valueOf(r2)) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0122, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r2 != 18) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (java.util.Arrays.binarySearch(r7.A00, 18) < 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A00(X.C256683wB r8) {
        /*
            r7 = this;
            java.lang.String r3 = r8.A0W
            r3.getClass()
            java.lang.String r1 = r8.A0R
            int r0 = r3.hashCode()
            r2 = 7
            switch(r0) {
                case -2123537834: goto L_0x00aa;
                case -1095064472: goto L_0x00b6;
                case -53558318: goto L_0x00bd;
                case 187078296: goto L_0x00f2;
                case 187078297: goto L_0x00fa;
                case 1504578661: goto L_0x0106;
                case 1504831518: goto L_0x010e;
                case 1505942594: goto L_0x011a;
                case 1556697186: goto L_0x0126;
                default: goto L_0x000f;
            }
        L_0x000f:
            r2 = 0
        L_0x0010:
            com.google.common.collect.ImmutableMap r4 = A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r4.containsKey(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0045
            r5 = 18
            if (r2 != r5) goto L_0x0098
            int[] r0 = r7.A00
            int r1 = java.util.Arrays.binarySearch(r0, r5)
            r0 = 0
            if (r1 < 0) goto L_0x002b
            r0 = 1
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            r2 = 6
        L_0x002e:
            int[] r0 = r7.A00
            int r1 = java.util.Arrays.binarySearch(r0, r2)
            r0 = 0
            if (r1 < 0) goto L_0x0038
            r0 = 1
        L_0x0038:
            if (r0 == 0) goto L_0x0045
            int r3 = r8.A06
            r1 = -1
            if (r3 == r1) goto L_0x0046
            if (r2 == r5) goto L_0x0046
            r0 = 8
            if (r3 <= r0) goto L_0x0058
        L_0x0045:
            return r6
        L_0x0046:
            int r0 = r8.A0G
            r3 = 48000(0xbb80, float:6.7262E-41)
            if (r0 == r1) goto L_0x004e
            r3 = r0
        L_0x004e:
            int r1 = com.google.android.exoplayer2.util.Util.A00
            r0 = 29
            if (r1 < r0) goto L_0x0081
            int r3 = X.C11136SBr.A00(r2, r3)
        L_0x0058:
            int r1 = com.google.android.exoplayer2.util.Util.A00
            r0 = 28
            if (r1 > r0) goto L_0x0063
            r0 = 7
            if (r3 != r0) goto L_0x0076
            r3 = 8
        L_0x0063:
            int r0 = com.google.android.exoplayer2.util.Util.A00(r3)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L_0x0076:
            r0 = 3
            if (r3 == r0) goto L_0x007f
            r0 = 4
            if (r3 == r0) goto L_0x007f
            r0 = 5
            if (r3 != r0) goto L_0x0063
        L_0x007f:
            r3 = 6
            goto L_0x0063
        L_0x0081:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.getOrDefault(r1, r0)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            goto L_0x0058
        L_0x0098:
            r1 = 8
            if (r2 != r1) goto L_0x002e
            int[] r0 = r7.A00
            int r1 = java.util.Arrays.binarySearch(r0, r1)
            r0 = 0
            if (r1 < 0) goto L_0x00a6
            r0 = 1
        L_0x00a6:
            if (r0 != 0) goto L_0x002e
            r2 = 7
            goto L_0x002e
        L_0x00aa:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000f
            r2 = 18
            goto L_0x0010
        L_0x00b6:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r3.equals(r0)
            goto L_0x0122
        L_0x00bd:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000f
            if (r1 == 0) goto L_0x000f
            java.util.regex.Pattern r0 = X.2Kn.A01
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x000f
            r0 = 1
            java.lang.String r3 = r1.group(r0)
            r3.getClass()
            r0 = 2
            java.lang.String r2 = r1.group(r0)
            r1 = 0
            r0 = 16
            java.lang.Integer.parseInt(r3, r0)     // Catch:{ NumberFormatException -> 0x000f }
            if (r2 == 0) goto L_0x00ec
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x000f }
        L_0x00ec:
            int r2 = X.C265224Ta.A00(r1)
            goto L_0x0010
        L_0x00f2:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r3.equals(r0)
            r2 = 5
            goto L_0x0122
        L_0x00fa:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000f
            r2 = 17
            goto L_0x0010
        L_0x0106:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r3.equals(r0)
            r2 = 6
            goto L_0x0122
        L_0x010e:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000f
            r2 = 9
            goto L_0x0010
        L_0x011a:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r0 = r3.equals(r0)
            r2 = 8
        L_0x0122:
            if (r0 != 0) goto L_0x0010
            goto L_0x000f
        L_0x0126:
            java.lang.String r0 = "audio/true-hd"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000f
            r2 = 14
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264384Pr.A00(X.3wB):android.util.Pair");
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A00) * 31) + 8;
    }

    public final String toString() {
        return 002.A08(8, Pxd.A00(357), ", supportedEncodings=", Arrays.toString(this.A00), "]");
    }

    public C264384Pr(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.A00 = copyOf;
        Arrays.sort(copyOf);
    }
}
