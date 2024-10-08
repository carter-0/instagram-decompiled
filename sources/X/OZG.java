package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

public final class OZG {
    public long A00;
    public final UserSession A01;

    public static final void A00(OZG ozg, QWO qwo, String str) {
        Enum optionalEnumField;
        String obj;
        String A07;
        Enum optionalEnumField2;
        String obj2;
        C250663lr A02 = qwo.A02(QWN.class, "xfb_biig_ads_event_sharing_notice(business_ig_id:$business_ig_id,consumer_ig_id:$consumer_ig_id,event_type:$event_type)", -788572440);
        if (A02 != null && (optionalEnumField = A02.getOptionalEnumField(1, "notice_type", C69388NkS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null && (obj = optionalEnumField.toString()) != null && (A07 = A02.A07("notice_content_text")) != null && (optionalEnumField2 = A02.getOptionalEnumField(2, "notice_ui_type", C69389NkT.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null && (obj2 = optionalEnumField2.toString()) != null) {
            new C370818x7(ozg.A01).A04(obj, A07, obj2, str);
        }
    }

    public static final void A01(OZG ozg, String str, String str2, 0sP r16) {
        UserSession userSession = ozg.A01;
        1vn A012 = 1vm.A01(userSession);
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        A04.A04("event_type", str);
        A04.A04("business_ig_id", userSession.A06);
        1Ef ensureCacheWrite = new PandoGraphQLRequest(DbU.A0J(A04, "consumer_ig_id", str2), "DetectedOutcomesAdsEventSharingQuery", A04.getParamsCopy(), A042.getParamsCopy(), QWO.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_should_show_biig_ads_event_sharing_consent_at_thread_entry", AnonymousClass7TE.A1C()).setMaxToleratedCacheAgeMs(0).setEnsureCacheWrite(false);
        A012.ATL(C71562Omx.A00, new C71570On7(r16, 3), ensureCacheWrite);
    }

    public final boolean A02() {
        UserSession userSession = this.A01;
        if (DcS.A00(userSession, false)) {
            return DbY.A1Z(0Tu.A06, userSession, 36325261431747373L);
        }
        return false;
    }

    public OZG(UserSession userSession, long j) {
        this.A01 = userSession;
        this.A00 = j;
    }
}
