package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl;
import java.util.ArrayList;

/* renamed from: X.61B  reason: invalid class name */
public final class AnonymousClass61B implements AnonymousClass39G {
    public final 2IS A00 = new 2IS();
    public final 2IS A01 = new 2IS();

    public final /* bridge */ /* synthetic */ 1Ef build() {
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AnonymousClass1vS.A00(), "FBToIGDefaultAudienceSettingQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), FBToIGDefaultAudienceSettingQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_get_feed_crossposting_default_audience_status", new ArrayList());
    }
}
