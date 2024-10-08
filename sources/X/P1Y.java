package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;
import java.util.Map;

public final class P1Y implements C74316Pss {
    public final /* synthetic */ NJV A00;

    public P1Y(NJV njv) {
        this.A00 = njv;
    }

    public final void Dho(DirectSearchResult directSearchResult) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(directSearchResult, 0);
        boolean z = directSearchResult instanceof DirectMessageSearchMessage;
        if (z) {
            str = ((DirectMessageSearchMessage) directSearchResult).A0A;
        } else if (directSearchResult instanceof DirectMessageSearchThread) {
            str = ((DirectMessageSearchThread) directSearchResult).A0A;
        } else {
            return;
        }
        NJV njv = this.A00;
        C72200OyM oyM = njv.A05;
        if (oyM == null) {
            str3 = "messageSearchLogger";
        } else {
            String str4 = njv.A07;
            if (str4 == null) {
                str3 = "query";
            } else if (oyM.A00 != null) {
                double d = 0.0d;
                if (z) {
                    DirectMessageSearchMessage directMessageSearchMessage = (DirectMessageSearchMessage) directSearchResult;
                    str2 = directMessageSearchMessage.A09;
                    d = (double) directMessageSearchMessage.A02;
                } else if (directSearchResult instanceof DirectMessageSearchThread) {
                    str2 = ((DirectMessageSearchThread) directSearchResult).A08;
                } else {
                    return;
                }
                if (str2 != null) {
                    Map map = oyM.A06;
                    1Ln r4 = new 1Ln(AnonymousClass7TE.A0e(oyM.A04, "direct_message_search_thread_impression"), 145);
                    if (DbT.A1Y(r4)) {
                        r4.A0R("message_search_session_id", oyM.A00);
                        r4.A0R("surface_name", "thread_list");
                        r4.A0R("query_string", str4);
                        r4.A0R("thread_type", str);
                        r4.A0P("message_sent_time", Double.valueOf(d));
                        r4.A0R("universal_search_session_id", oyM.A02);
                        r4.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, (String) null);
                    } else {
                        r4 = null;
                    }
                    map.put(str2, r4);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }
}
