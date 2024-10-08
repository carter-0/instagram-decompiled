package X;

import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectSearchResult;
import java.util.Map;

public final class P1X implements C74316Pss {
    public final /* synthetic */ C68488NKh A00;

    public P1X(C68488NKh nKh) {
        this.A00 = nKh;
    }

    public final void Dho(DirectSearchResult directSearchResult) {
        C68488NKh nKh = this.A00;
        C72200OyM oyM = nKh.A05;
        String str = nKh.A09;
        String str2 = nKh.A0C;
        if (oyM.A00 != null && (directSearchResult instanceof DirectMessageSearchMessage)) {
            DirectMessageSearchMessage directMessageSearchMessage = (DirectMessageSearchMessage) directSearchResult;
            Map map = oyM.A05;
            String str3 = directMessageSearchMessage.A07;
            double d = (double) directMessageSearchMessage.A02;
            1Ln r4 = new 1Ln(AnonymousClass7TE.A0e(oyM.A04, "direct_message_search_msg_impression"), 144);
            if (DbT.A1Y(r4)) {
                r4.A0R("message_search_session_id", oyM.A00);
                r4.A0R("surface_name", "message_list");
                r4.A0R("query_string", str);
                r4.A0R("thread_type", str2);
                r4.A0P("message_sent_time", Double.valueOf(d));
                r4.A0R("universal_search_session_id", oyM.A02);
            } else {
                r4 = null;
            }
            map.put(str3, r4);
        }
    }
}
