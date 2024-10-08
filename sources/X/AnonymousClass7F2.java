package X;

import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7F2  reason: invalid class name */
public abstract class AnonymousClass7F2 {
    public static final Set A00 = new HashSet(Arrays.asList(new 2FW[]{2FW.A1e, 2FW.A0K, 2FW.A1X, 2FW.A1b, 2FW.A0G, 2FW.A16, 2FW.A1i, 2FW.A18, 2FW.A0k, 2FW.A0p}));

    public static boolean A01(AnonymousClass7LQ r7, String str) {
        User user;
        boolean z;
        if (r7 == null || (user = r7.A0K) == null || !user.getId().equals(str)) {
            return false;
        }
        C254703su r3 = r7.A0e;
        boolean A002 = A00(r3.C7c(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        if ((!A03(r3) || !A04(r3)) && (A02(r3) || r3.A0G() != AnonymousClass5FV.None)) {
            z = false;
        } else {
            z = true;
        }
        return A002 && z && (r3.A1N() ^ true) && (r3.A1O() ^ true) && r7.A03() == C327627Bo.NUX_TYPE_NONE;
    }

    public static boolean A05(C254703su r5, C254703su r6, boolean z) {
        AnonymousClass5FV r2;
        boolean z2 = false;
        if (r5 != null && AnonymousClass7F3.A00(r5, r6) && A00(r5.C7c(), r6.C7c()) && ((!r6.A2F || !z) && r6.A0G() == (r2 = AnonymousClass5FV.None))) {
            if (r6.A01 > 0 && z) {
                return false;
            }
            if (A03(r6)) {
                if (z || !A04(r6) || A02(r5) || A03(r5) || r5.A2P != r6.A2P) {
                    return false;
                }
            } else if (A02(r6) || A02(r5) || r5.A2P != r6.A2P) {
                return false;
            } else {
                boolean A03 = A03(r5);
                if (z) {
                    z2 = true;
                    if (((!A03 || !A04(r5)) && A03(r5)) || r5.A0G() != r2) {
                        return false;
                    }
                } else if (A03 || r5.A2F || r5.A0G() != r2) {
                    return false;
                } else {
                    if (r5.A0H() != null && !r5.A0H().isEmpty() && ((C254873tC) r5.A0H().get(0)).A02 == 5) {
                        return false;
                    }
                }
            }
            z2 = true;
            if (r5.A01 > 0) {
                return false;
            }
        }
        return z2;
    }

    public static boolean A06(C254703su r2, C254703su r3, boolean z, boolean z2, boolean z3) {
        return A05(r3, r2, true) && (r3.A1N() ^ true) && (r3.A1O() ^ true) && !z3 && !z && !z2;
    }

    public static boolean A00(long j, long j2) {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (Math.abs(timeUnit.toSeconds(j) - timeUnit.toSeconds(j2)) < 60) {
            return true;
        }
        return false;
    }

    public static boolean A02(C254703su r2) {
        if (A00.contains(r2.A10) || r2.A13 != null || r2.A1Y() || r2.CRd() || r2.A1X() || r2.A1Z()) {
            return true;
        }
        return false;
    }

    public static boolean A03(C254703su r2) {
        2FW r1 = r2.A10;
        if (r1 == 2FW.A1T || r1 == 2FW.A1c || r2.A0P() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r1 == X.AnonymousClass7Q3.QUESTION_RESPONSE) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C254703su r3) {
        /*
            X.2FW r1 = r3.A10
            if (r1 == 0) goto L_0x0046
            X.74x r0 = X.C3259774x.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 22
            if (r1 == r0) goto L_0x0027
            r0 = 45
            if (r1 != r0) goto L_0x0046
            X.OMp r0 = r3.A0p
            r0.getClass()
            java.lang.String r0 = r0.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r3.A1Z()
        L_0x0023:
            if (r0 != 0) goto L_0x0046
        L_0x0025:
            r0 = 1
        L_0x0026:
            return r0
        L_0x0027:
            java.lang.Object r2 = r3.A1T
            X.7FN r2 = (X.AnonymousClass7FN) r2
            if (r2 == 0) goto L_0x0046
            X.7Q3 r1 = r2.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.REPLY
            if (r1 == r0) goto L_0x003f
            X.7Q3 r1 = r2.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.QUESTION_RESPONSE
            if (r1 != r0) goto L_0x0046
        L_0x003f:
            java.lang.String r0 = r2.A0A
            boolean r0 = X.0mp.A0E(r0)
            goto L_0x0023
        L_0x0046:
            X.3tI r1 = r3.A0P()
            r0 = 0
            if (r1 == 0) goto L_0x0026
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7F2.A04(X.3su):boolean");
    }
}
