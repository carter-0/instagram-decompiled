package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/* renamed from: X.4zx  reason: invalid class name and case insensitive filesystem */
public final class C280074zx {
    public static final C280074zx A00 = new Object();

    public static final ArrayList A02() {
        ArrayList arrayList = new ArrayList(Collections.nCopies(7, 0L));
        int[] A03 = 2MJ.A01.A03(0);
        0qQ.A07(A03);
        int length = A03.length - 1;
        int i = 6;
        while (length >= 0) {
            arrayList.set(i, Long.valueOf((long) A03[length]));
            i--;
            length--;
            if (i < 0) {
                break;
            }
        }
        return arrayList;
    }

    public static final long A00() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public static final long A01() {
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis() / 1000;
    }

    public static final Calendar A03(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j * 1000);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r2.length() == 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A04(com.instagram.common.session.UserSession r12) {
        /*
            r11 = this;
            java.util.ArrayList r8 = A02()
            X.2B1 r5 = X.2B0.A01
            java.lang.String r4 = "Corrupted Aggregated Time Spent Data"
            java.lang.String r3 = "TimeSpentPreferences"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0xa r2 = r5.A07(r12)
            java.lang.String r1 = "AGGREGATED_TIME_SPENT_PER_DAY"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            if (r2 == 0) goto L_0x0024
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 != 0) goto L_0x003e
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ 1Aw | IllegalStateException -> 0x0039 }
            r1.<init>()     // Catch:{ 1Aw | IllegalStateException -> 0x0039 }
            java.lang.Class r0 = r7.getClass()     // Catch:{ 1Aw | IllegalStateException -> 0x0039 }
            java.lang.Object r0 = r1.A08(r2, r0)     // Catch:{ 1Aw | IllegalStateException -> 0x0039 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 1Aw | IllegalStateException -> 0x0039 }
            if (r0 == 0) goto L_0x003e
            goto L_0x003d
        L_0x0039:
            X.0wb.A03(r3, r4)
            goto L_0x003e
        L_0x003d:
            r7 = r0
        L_0x003e:
            X.0xa r1 = r5.A07(r12)
            java.lang.String r0 = "LAST_SCREEN_TIME_UPLOAD"
            r2 = 0
            long r9 = r1.getLong(r0, r2)
            long r4 = A00()
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            r6 = 0
        L_0x0053:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0 = 7
            java.util.List r0 = java.util.Collections.nCopies(r0, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            r9 = 6
        L_0x0062:
            if (r6 <= 0) goto L_0x007c
            if (r9 < 0) goto L_0x007c
            java.lang.Object r0 = r8.get(r9)
            r10.set(r9, r0)
            int r9 = r9 + -1
            int r6 = r6 + -1
            goto L_0x0062
        L_0x0072:
            long r4 = r4 - r9
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 / r0
            r0 = 1
            long r4 = r4 + r0
            int r6 = (int) r4
            goto L_0x0053
        L_0x007c:
            int r0 = r7.size()
            int r6 = r0 + -1
        L_0x0082:
            if (r9 < 0) goto L_0x00a8
            if (r6 < 0) goto L_0x00a8
            java.lang.Object r0 = r8.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            java.lang.Object r0 = r7.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            double r2 = r0.doubleValue()
            long r0 = (long) r2
            long r4 = r4 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r10.set(r9, r0)
            int r6 = r6 + -1
            int r9 = r9 + -1
            goto L_0x0082
        L_0x00a8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C280074zx.A04(com.instagram.common.session.UserSession):java.util.ArrayList");
    }
}
