package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl;

/* renamed from: X.OnK  reason: case insensitive filesystem */
public abstract class C71583OnK implements AnonymousClass39G {
    public static PandoGraphQLRequest A00(2IS r10, 2IS r11) {
        return new PandoGraphQLRequest(C41845B3m.A05(), "IGGetThemePreview", r10.getParamsCopy(), r11.getParamsCopy(), IGGetThemePreviewResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_theme_preview", AnonymousClass7TE.A1C());
    }
}
