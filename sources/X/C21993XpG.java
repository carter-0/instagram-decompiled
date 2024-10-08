package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.XpG  reason: case insensitive filesystem */
public abstract class C21993XpG {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r0 >= 0) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(java.util.Map r7, int r8, int r9) {
        /*
            r0 = 400(0x190, float:5.6E-43)
            if (r8 == r0) goto L_0x005c
            r0 = 401(0x191, float:5.62E-43)
            if (r8 == r0) goto L_0x005c
            r0 = 403(0x193, float:5.65E-43)
            if (r8 == r0) goto L_0x005c
            r0 = 404(0x194, float:5.66E-43)
            r3 = 1
            if (r8 == r0) goto L_0x004b
            r0 = 410(0x19a, float:5.75E-43)
            if (r8 == r0) goto L_0x005c
            r0 = 416(0x1a0, float:5.83E-43)
            if (r8 == r0) goto L_0x005c
            r0 = 429(0x1ad, float:6.01E-43)
            r5 = 1000(0x3e8, double:4.94E-321)
            if (r8 == r0) goto L_0x0046
            r0 = 502(0x1f6, float:7.03E-43)
            if (r8 == r0) goto L_0x005c
            r0 = 503(0x1f7, float:7.05E-43)
            if (r8 != r0) goto L_0x0062
            java.lang.String r0 = "Retry-After"
            java.lang.String r1 = A01(r0, r7)
            r0 = -1
            if (r1 == 0) goto L_0x0062
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0036 }
            if (r0 < 0) goto L_0x0062
        L_0x0036:
            long r3 = (long) r0
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            long r3 = r3 * r5
            r0 = 60000(0xea60, double:2.9644E-319)
            long r0 = java.lang.Math.min(r3, r0)
            return r0
        L_0x0046:
            if (r9 != r3) goto L_0x0062
            r0 = 1000(0x3e8, double:4.94E-321)
            return r0
        L_0x004b:
            java.lang.String r0 = "x-fb-one-variant"
            java.lang.String r2 = A01(r0, r7)
            if (r2 == 0) goto L_0x0062
            java.lang.String r1 = "-RE"
            r0 = 0
            boolean r0 = X.00l.A0d(r2, r1, r0)
            if (r0 != r3) goto L_0x0062
        L_0x005c:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        L_0x0062:
            if (r9 > 0) goto L_0x0065
            r9 = 1
        L_0x0065:
            int r0 = r9 + -1
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r0 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 + r0
            r0 = 5000(0x1388, double:2.4703E-320)
            long r1 = java.lang.Math.min(r2, r0)
            int r0 = (int) r1
            long r0 = (long) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21993XpG.A00(java.util.Map, int, int):long");
    }

    public static final String A01(String str, Map map) {
        List list;
        if (map == null || (list = (List) map.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(java.util.Map r4) {
        /*
            java.lang.String r3 = ""
            r2 = 0
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "x-fb-one"
            java.lang.String r0 = A01(r0, r4)
            if (r0 == 0) goto L_0x0016
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0019:
            int r0 = java.lang.Integer.parseInt(r3)
            if (r1 > r0) goto L_0x0020
            r2 = 1
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21993XpG.A02(java.util.Map):boolean");
    }
}
