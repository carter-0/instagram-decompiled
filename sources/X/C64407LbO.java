package X;

import com.facebook.pando.PandoGraphQLConnectionConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.LbO  reason: case insensitive filesystem */
public final class C64407LbO implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public 2IS A01 = C41845B3m.A04();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ 1Ef build() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String A002 = AnonymousClass000.A00(1953);
        A1C.add(new PandoGraphQLConnectionConfig("Query", "edges", A002, "AiAgentContinueChattingQuery_At_Pando_Connection_Pagination_Query_xfb_fetch_continue_chatting_section_personas", "xfb_fetch_continue_chatting_section_personas_before_cursor", "xfb_fetch_continue_chatting_section_personas_after_cursor", "count", "xfb_fetch_continue_chatting_section_personas_last", "xfb_fetch_continue_chatting_section_personas_stream_enabled", "xfb_fetch_continue_chatting_section_personas_stream_initial_count", true));
        return new PandoGraphQLRequest(C41845B3m.A06(this.A02), "AiAgentContinueChattingQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C43144BtU.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, A002, A1C);
    }
}
