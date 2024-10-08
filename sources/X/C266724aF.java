package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4aF  reason: invalid class name and case insensitive filesystem */
public final class C266724aF {
    public final long A00;
    public final long A01;
    public final TimeUnit A02;

    public final boolean A06(TimeUnit timeUnit, long j, boolean z) {
        if (j < 0) {
            return false;
        }
        int i = (j > A03(timeUnit) ? 1 : (j == A03(timeUnit) ? 0 : -1));
        if (!z ? i < 0 || j > A02(timeUnit) : i < 0 || j >= A02(timeUnit)) {
            if (A02(timeUnit) >= 0 || j < A03(timeUnit)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C266724aF r8 = (C266724aF) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (!(A03(timeUnit) == r8.A03(timeUnit) && A02(timeUnit) == r8.A02(timeUnit))) {
                return false;
            }
        }
        return true;
    }

    public static C266724aF A00(JSONObject jSONObject) {
        long j = jSONObject.getLong("mStartTime");
        long j2 = jSONObject.getLong("mEndTime");
        String string = jSONObject.getString("mTimeUnit");
        for (TimeUnit timeUnit : TimeUnit.values()) {
            if (string.equals(A01(timeUnit))) {
                return new C266724aF(timeUnit, j, j2);
            }
        }
        throw new JSONException("invalid jsonObject for TimeRange");
    }

    public static String A01(TimeUnit timeUnit) {
        switch (C266734aG.A00[timeUnit.ordinal()]) {
            case 1:
                return "DAYS";
            case 2:
                return "HOURS";
            case 3:
                return "MINUTES";
            case 4:
                return "SECONDS";
            case 5:
                return "NANOSECONDS";
            case 6:
                return "MICROSECONDS";
            case 7:
                return "MILLISECONDS";
            default:
                return "";
        }
    }

    public final long A02(TimeUnit timeUnit) {
        return timeUnit.convert(this.A00, this.A02);
    }

    public final long A03(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01, this.A02);
    }

    public final JSONObject A04() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mStartTime", this.A01);
        jSONObject.put("mEndTime", this.A00);
        jSONObject.put("mTimeUnit", A01(this.A02));
        return jSONObject;
    }

    public final boolean A05(C266724aF r7, boolean z) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (A06(timeUnit, r7.A03(timeUnit), z)) {
            return true;
        }
        if ((A06(timeUnit, r7.A02(timeUnit), z) && (!z || r7.A02(timeUnit) != A03(timeUnit))) || r7.A06(timeUnit, A03(timeUnit), z)) {
            return true;
        }
        if (!r7.A06(timeUnit, A02(timeUnit), z)) {
            return false;
        }
        if (!z || A02(timeUnit) != r7.A03(timeUnit)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A01), Long.valueOf(this.A00), this.A02});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r10 < r12) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C266724aF(java.util.concurrent.TimeUnit r9, long r10, long r12) {
        /*
            r8 = this;
            r8.<init>()
            r1 = 0
            r4 = r10
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r6 = r12
            if (r0 <= 0) goto L_0x0014
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            java.lang.String r2 = "startTime: "
            java.lang.String r3 = " endTime: "
            java.lang.String r0 = X.002.A0f(r2, r3, r4, r6)
            X.02V.A06(r1, r0)
            r8.A01 = r10
            r8.A00 = r12
            r8.A02 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266724aF.<init>(java.util.concurrent.TimeUnit, long, long):void");
    }

    public final String toString() {
        try {
            return A04().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
