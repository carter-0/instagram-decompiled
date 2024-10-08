package com.instagram.rtc.analytics;

import X.0qQ;
import X.0wc;
import X.19E;
import X.AnonymousClass0iw;
import X.AnonymousClass12U;
import X.AnonymousClass12V;
import X.AnonymousClass199;
import X.AnonymousClass19G;
import X.AnonymousClass1XJ;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262204Co;
import X.C262224Cq;
import X.C51972G9s;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;

public final class RtcCallSurveyLogger implements AnonymousClass0iw {
    public RtcCallKey A00;
    public final 0wc A01;
    public final UserSession A02;
    public final Context A03;
    public final AnonymousClass12V A04;
    public final AnonymousClass1XJ A05 = AnonymousClass1XJ.A00;
    public final C262224Cq A06;

    public RtcCallSurveyLogger(Context context, AnonymousClass12V r5, UserSession userSession, RtcCallKey rtcCallKey) {
        0qQ.A0B(r5, 4);
        this.A02 = userSession;
        this.A03 = context;
        this.A00 = rtcCallKey;
        this.A04 = r5;
        this.A01 = C51972G9s.A0a(this, userSession);
        this.A06 = 19E.A02(AnonymousClass199.A02(((AnonymousClass12U) r5).A04, new AnonymousClass19G((C262204Co) null)));
    }

    public final void A01(String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TE.A1Z(new RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1(this, str2, str, str3, str4, (AnonymousClass4D7) null, z), this.A06);
    }

    public final String getModuleName() {
        return "rtc_call_end_feedback";
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.rtc.analytics.RtcCallSurveyLogger r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 22
            boolean r0 = X.MEA.A03(r3, r8)
            if (r0 == 0) goto L_0x0022
            r5 = r8
            X.MEA r5 = (X.MEA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 != r3) goto L_0x002a
            goto L_0x004b
        L_0x0022:
            r0 = 42
            X.MEA r5 = new X.MEA
            r5.<init>(r6, r8, r3, r0)
            goto L_0x0016
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.0eS.A00(r0)
            X.12V r2 = r6.A04     // Catch:{ Exception -> 0x0052 }
            r1 = 1696731353(0x652210d9, float:4.7833385E22)
            r0 = 3
            X.0nV r2 = r2.CO6(r1, r0)     // Catch:{ Exception -> 0x0052 }
            r5.A00 = r3     // Catch:{ Exception -> 0x0052 }
            r1 = 0
            X.Pf0 r0 = new X.Pf0     // Catch:{ Exception -> 0x0052 }
            r0.<init>(r7, r1, r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.Object r0 = X.1Eo.A00(r5, r2, r0)     // Catch:{ Exception -> 0x0052 }
            if (r0 != r4) goto L_0x004e
            return r4
        L_0x004b:
            X.0eS.A00(r0)     // Catch:{ Exception -> 0x0052 }
        L_0x004e:
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0052 }
            return r4
        L_0x0052:
            r0 = move-exception
            java.lang.String r4 = r0.getMessage()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.analytics.RtcCallSurveyLogger.A00(com.instagram.rtc.analytics.RtcCallSurveyLogger, java.lang.String, X.4D7):java.lang.Object");
    }
}
