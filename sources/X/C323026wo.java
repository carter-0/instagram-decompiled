package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.archive.api.ProfileSetMyWeekMutationResponseImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.6wo  reason: invalid class name and case insensitive filesystem */
public final class C323026wo {
    public static final Object A00(UserSession userSession, Boolean bool, Boolean bool2, AnonymousClass4D7 r16) {
        String str;
        2IS r3 = new 2IS();
        2IS r5 = new 2IS();
        AnonymousClass0K0 r4 = GraphQlCallInput.A02;
        0Df r2 = null;
        if (bool != null) {
            Boolean valueOf = Boolean.valueOf(bool.booleanValue());
            r2 = r4.A02();
            0Df.A00(r2, valueOf, "my_week_enabled");
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                str = "CARDS";
            } else {
                str = "POGS";
            }
            String A00 = AnonymousClass000.A00(1414);
            if (r2 == null) {
                r2 = r4.A02();
            }
            0Df.A00(r2, str, A00);
        }
        0Df A02 = r3.A00.A02();
        if (r2 == null) {
            r2 = r4.A02();
        }
        A02.A0E(r2, "request_data");
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return AnonymousClass10c.A02(r16, 1vm.A01(userSession).A05(new PandoGraphQLRequest(AnonymousClass1vS.A00(), "ProfileSetMyWeekMutation", r3.getParamsCopy(), r5.getParamsCopy(), ProfileSetMyWeekMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_update_highlights_settings", new ArrayList())));
    }
}
