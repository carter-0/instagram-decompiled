package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;

public abstract class II3 implements AnonymousClass39G {
    public static PandoGraphQLRequest A00(2IS r10, 2IS r11) {
        return new PandoGraphQLRequest(C41845B3m.A05(), "GetCreatorInspirationHubQuery", r10.getParamsCopy(), r11.getParamsCopy(), GetCreatorInspirationHubQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_async_get_creator_inspiration_hub", AnonymousClass7TE.A1C());
    }
}
