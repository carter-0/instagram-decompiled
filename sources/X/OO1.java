package X;

import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OO1 {
    public final C282375Cv A00;
    public final List A01 = 0sr.A1P(new Integer[]{13, 15});
    public final boolean A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 0
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0020
            r0 = 4
            r2 = 15
            java.lang.String r5 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r0, r10)
            if (r5 == 0) goto L_0x0020
        L_0x000e:
            r1 = 0
            r4 = 86
            r3 = r1
            r6 = r1
            r8 = r1
            com.facebook.msys.mci.TraceLogger.log(r1, r2, r3, r4, r5, r6, r7, r8)
            X.C282375Cv.A02(r2, r5, r10)
            r0 = 1252(0x4e4, float:1.754E-42)
            X.C282375Cv.A03(r5, r1, r2, r0, r7)
            return r5
        L_0x0020:
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x002e
            r0 = 1
            r2 = 13
            java.lang.String r5 = com.facebook.msys.mci.TraceLogger.getTraceIdForAliasId(r0, r10)
            if (r5 == 0) goto L_0x002e
            goto L_0x000e
        L_0x002e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OO1.A01(java.lang.String):java.lang.String");
    }

    public final String A02(String str, List list) {
        C282375Cv r0 = this.A00;
        String createTraceIdForType = TraceLogger.createTraceIdForType(13);
        if (createTraceIdForType == null) {
            return null;
        }
        r0.A04(list, 13, createTraceIdForType);
        C282375Cv.A02(13, createTraceIdForType, str);
        C282375Cv.A03(createTraceIdForType, (List) null, 13, 1252, 0);
        return createTraceIdForType;
    }

    public final String A00(String str) {
        return (String) C242173Sx.A06(C242173Sx.A0B(new C73943PmN(str, this, 42), 00k.A0o(this.A01)));
    }

    public final void A03(List list, int i, String str) {
        if (str != null) {
            C282375Cv.A03(str, list, 0, i, 0);
        }
    }

    public OO1(UserSession userSession) {
        C282375Cv A002 = C282375Cv.A00(userSession);
        0qQ.A07(A002);
        this.A00 = A002;
        0Tu r2 = 0Tu.A05;
        this.A02 = 182.A06(r2, userSession, 36323195552410606L);
        this.A03 = 182.A06(r2, userSession, 36323195553065973L);
    }

    public final void A04(List list, int i, String str) {
        A03(list, i, A00(str));
    }
}
