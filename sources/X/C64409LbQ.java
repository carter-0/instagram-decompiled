package X;

import com.facebook.pando.PandoGraphQLConnectionConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.LbQ  reason: case insensitive filesystem */
public final class C64409LbQ implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public 2IS A01 = C41845B3m.A04();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ 1Ef build() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new PandoGraphQLConnectionConfig("XFBGENAIPersonaLayout", "edges", AnonymousClass000.A00(1790), "AiStudioFetchHomeSections_At_Pando_Connection_Pagination_XFBGENAIPersonaLayout_sections_query", "sections_query_before_cursor", "sections_query_after_cursor", "first_page_size", "sections_query_last", "enable_section_query_stream", "stream_initial_count", true));
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "AiStudioFetchHomeSections", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C43189BuD.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_fetch_genai_persona_discovery_paginated_layout", A1C);
    }
}
