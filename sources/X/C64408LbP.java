package X;

import com.facebook.pando.PandoGraphQLConnectionConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.LbP  reason: case insensitive filesystem */
public final class C64408LbP implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public 2IS A01 = C41845B3m.A04();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ 1Ef build() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new PandoGraphQLConnectionConfig("Query", "edges", AnonymousClass000.A00(830), "AiAgentListFilterQuery_At_Pando_Connection_Pagination_Query_xfb_fetch_genai_personas_by_section", "xfb_fetch_genai_personas_by_section_before_cursor", "xfb_fetch_genai_personas_by_section_after_cursor", "count", "xfb_fetch_genai_personas_by_section_last", "xfb_fetch_genai_personas_by_section_stream_enabled", "xfb_fetch_genai_personas_by_section_stream_initial_count", true));
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "AiAgentListFilterQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C43149BtZ.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_fetch_genai_personas_by_section", A1C);
    }
}
