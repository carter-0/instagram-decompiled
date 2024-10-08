package X;

import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class I49 {
    public final C58840Ae A00;
    public final C54678HOj A01;
    public final XSJ A02;
    public final FoaUserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Map A07;

    public I49(C54678HOj hOj, XSJ xsj, FoaUserSession foaUserSession, String str, String str2, String str3, Map map) {
        0qQ.A0B(foaUserSession, 1);
        this.A03 = foaUserSession;
        this.A05 = str;
        this.A04 = str2;
        this.A07 = map;
        this.A01 = hOj;
        this.A06 = str3;
        this.A02 = xsj;
        this.A00 = AnonymousClass0kN.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }

    public static final void A01(C54687HOs hOs, I49 i49) {
        A00(hOs, (HOB) null, (HOW) null, (C54680HOl) null, (C62650KkC) null, i49, (Integer) null, (Integer) null, (Integer) null, (JSONArray) null, false);
    }

    public static final void A00(C54687HOs hOs, HOB hob, HOW how, C54680HOl hOl, C62650KkC kkC, I49 i49, Integer num, Integer num2, Integer num3, JSONArray jSONArray, boolean z) {
        String str;
        HOX hox;
        Long l;
        0Aj A0d = C51969G9p.A0d(i49.A00, C273654mx.A00(343));
        if (A0d.isSampled()) {
            JSONObject A11 = DbS.A11();
            if (z) {
                A11.put("has_extended_capture_photos", z);
            }
            if (num2 != null) {
                A11.put("success_count", num2.intValue());
            }
            if (num3 != null) {
                A11.put("total_count", num3.intValue());
            }
            if (jSONArray != null) {
                A11.put("verification_results", jSONArray);
            }
            A0d.A8M(hOs, "event_type");
            A0d.AAJ("surface_session_id", i49.A05);
            A0d.AAJ("bottom_sheet_session_id", i49.A04);
            A0d.AAJ("intent_session_id", "0");
            Map map = i49.A07;
            A0d.A9H("app_context_data", map);
            String str2 = null;
            if (map != null) {
                str = DbT.A11("thread_type", map);
            } else {
                str = null;
            }
            A0d.AAJ("thread_type", str);
            String str3 = i49.A06;
            if (str3 == null) {
                hox = null;
            } else if (str3.equals("AI_BOT")) {
                hox = HOX.AI_BOT;
            } else if (str3.equals("GROUP")) {
                hox = HOX.GROUP;
            } else {
                hox = HOX.ONE_TO_ONE;
            }
            A0d.A8M(hox, "thread_type_enum");
            DbS.A1F(i49.A01, A0d);
            A0d.AAJ("entry_point_string_override", (String) null);
            A0d.A8M(hOl, "exit_reason");
            A0d.A8M(kkC, "onboarding_result");
            A0d.A8M(how, "capture_type");
            if (num != null) {
                l = C51969G9p.A0r(num);
            } else {
                l = null;
            }
            A0d.A9F("num_images_selected", l);
            A0d.A8M(hob, "action_result");
            if (A11.length() > 0) {
                str2 = A11.toString();
            }
            A0d.AAJ("extended_capture_extras", str2);
            C51965G9l.A1A(i49.A02, A0d);
            A0d.AAJ("surface_string_override", (String) null);
            A0d.Cgf();
        }
    }
}
