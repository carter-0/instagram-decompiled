package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.schools.management.data.UserSchoolEligibilityResponseImpl;

public abstract class II4 implements AnonymousClass39G {
    public static PandoGraphQLRequest A00(2IS r10, 2IS r11) {
        return new PandoGraphQLRequest(C41845B3m.A05(), "UserSchoolEligibility", r10.getParamsCopy(), r11.getParamsCopy(), UserSchoolEligibilityResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_user_school_eligibility", AnonymousClass7TE.A1C());
    }
}
