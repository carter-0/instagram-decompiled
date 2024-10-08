package com.instagram.rtc.analytics;

import X.02m;
import X.0Tu;
import X.0eS;
import X.0sL;
import X.182;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import com.facebook.quicklog.EventBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.analytics.RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1", f = "RtcCallSurveyLogger.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
public final class RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ RtcCallSurveyLogger A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1(RtcCallSurveyLogger rtcCallSurveyLogger, String str, String str2, String str3, String str4, AnonymousClass4D7 r7, boolean z) {
        super(2, r7);
        this.A01 = rtcCallSurveyLogger;
        this.A06 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.rtc.analytics.RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        return new RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1(this.A01, this.A04, this.A03, this.A05, this.A02, r10, this.A06);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.rtc.analytics.RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        String str;
        1Hj r6 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            RtcCallSurveyLogger rtcCallSurveyLogger = this.A01;
            UserSession userSession = rtcCallSurveyLogger.A02;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 2342156240441837384L)) {
                String A042 = 182.A04(r2, userSession, 36876181181628506L);
                str = null;
                if (this.A06 && A042.length() != 0) {
                    this.A00 = 1;
                    obj = RtcCallSurveyLogger.A00(rtcCallSurveyLogger, A042, this);
                    if (obj == r6) {
                        return r6;
                    }
                }
                RtcCallSurveyLogger rtcCallSurveyLogger2 = this.A01;
                EventBuilder annotate = 02m.A0p.markEventBuilder(867381049, "ig_survey_qpl").annotate("reason_key", this.A04).annotate("details", this.A03).annotate("bb_trace_id", this.A05).annotate("call_id", this.A02);
                RtcCallKey rtcCallKey = rtcCallSurveyLogger2.A00;
                if (rtcCallKey == null || (r1 = rtcCallKey.A00) == null) {
                    String str2 = "null";
                }
                annotate.annotate("shared_call_id", str2).annotate("logcat", str).setLevel(7).report();
            }
            return C60340gF.A00;
        }
        str = (String) obj;
        RtcCallSurveyLogger rtcCallSurveyLogger22 = this.A01;
        EventBuilder annotate2 = 02m.A0p.markEventBuilder(867381049, "ig_survey_qpl").annotate("reason_key", this.A04).annotate("details", this.A03).annotate("bb_trace_id", this.A05).annotate("call_id", this.A02);
        RtcCallKey rtcCallKey2 = rtcCallSurveyLogger22.A00;
        String str22 = "null";
        annotate2.annotate("shared_call_id", str22).annotate("logcat", str).setLevel(7).report();
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
