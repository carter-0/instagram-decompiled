package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OyM  reason: case insensitive filesystem */
public final class C72200OyM implements AnonymousClass0lh {
    public String A00;
    public String A01;
    public String A02;
    public UserSession A03;
    public final 0wc A04;
    public final Map A05 = new Y44();
    public final Map A06 = new Y44();

    public static C72200OyM A00(UserSession userSession) {
        return (C72200OyM) userSession.A01(C72200OyM.class, new C73467Pd9(userSession, 8));
    }

    private void A01() {
        Iterator A0v = AnonymousClass7TF.A0v(this.A05);
        while (A0v.hasNext()) {
            AnonymousClass0Ai r0 = (AnonymousClass0Ai) A0v.next();
            if (r0 != null) {
                r0.Cgf();
            }
        }
        Iterator A0v2 = AnonymousClass7TF.A0v(this.A06);
        while (A0v2.hasNext()) {
            AnonymousClass0Ai r02 = (AnonymousClass0Ai) A0v2.next();
            if (r02 != null) {
                r02.Cgf();
            }
        }
    }

    public final void A02(String str) {
        if (this.A00 != null && str != null && str.equals(this.A01)) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A04, "direct_message_search_end");
            if (A0e.isSampled()) {
                A0e.AAJ("message_search_session_id", this.A00);
                A0e.AAJ("end_action", "back");
                A0e.AAJ("universal_search_session_id", this.A02);
                A0e.Cgf();
            }
            A01();
            this.A00 = null;
            this.A02 = null;
            this.A05.clear();
            this.A06.clear();
        }
    }

    public final void A03(String str, String str2) {
        if (this.A00 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A04, "direct_message_search_thread_list_click");
            if (A0e.isSampled()) {
                A0e.AAJ("message_search_session_id", this.A00);
                A0e.AAJ("query_string", str);
                A0e.AAJ("thread_type", str2);
                A0e.AAJ("universal_search_session_id", this.A02);
                C66580MXl.A1J(A0e, (String) null);
                A0e.Cgf();
            }
        }
    }

    public final void A04(String str, String str2, String str3, long j) {
        if (this.A00 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A04, "direct_message_search_msg_result_chosen");
            if (A0e.isSampled()) {
                A0e.AAJ("message_search_session_id", this.A00);
                A0e.AAJ("query_string", str);
                A0e.AAJ("thread_type", str2);
                A0e.AAJ("click_surface_name", str3);
                A0e.A8D("message_sent_time", Double.valueOf((double) j));
                A0e.AAJ("universal_search_session_id", this.A02);
                A0e.Cgf();
            }
            A01();
        }
    }

    public final void A05(String str, String str2, String str3, boolean z) {
        if (this.A00 != null) {
            A02(this.A01);
        }
        this.A00 = AnonymousClass7TF.A0b();
        this.A02 = str;
        this.A01 = str2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "direct_message_search_start");
        if (A0e.isSampled()) {
            A0e.AAJ("message_search_session_id", this.A00);
            A0e.AAJ("surface_name", str2);
            A0e.AAJ("entry_surface", str3);
            A0e.AAJ("universal_search_session_id", this.A02);
            if (182.A06(0Tu.A05, this.A03, 36317521902900508L)) {
                A0e.A7p("is_fts", Boolean.valueOf(z));
            }
            A0e.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        A02(this.A01);
    }

    public C72200OyM(UserSession userSession) {
        this.A03 = userSession;
        this.A04 = AnonymousClass0kN.A01(new C71864Os6(this), userSession);
    }
}
