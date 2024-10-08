package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Hzd  reason: case insensitive filesystem */
public final class C56507Hzd {
    public final C58840Ae A00;
    public final C56092Hsf A01;

    public static final void A00(C54673HOe hOe, XSJ xsj, C56507Hzd hzd, String str, String str2) {
        C56092Hsf hsf = hzd.A01;
        0eP A1L = AnonymousClass7TE.A1L("app_session_id", (Object) null);
        String str3 = hsf.A01;
        LinkedHashMap A0p = DbY.A0p("surface_session_id", str3, A1L);
        0Aj A0d = C51969G9p.A0d(hzd.A00, "meta_ai_intents_platform_events");
        if (A0d.isSampled()) {
            A0d.AAJ(TraceFieldType.AdhocEventName, str);
            C51965G9l.A1A(xsj, A0d);
            A0d.A8M(hOe, "intent_name");
            A0d.AAJ("bottom_sheet_session_id", hsf.A00);
            if (str3 == null) {
                str3 = "";
            }
            A0d.AAJ("surface_session_id", str3);
            A0d.AAJ(C66579MXk.A00(130), str2);
            A0d.A9H("app_context_data", A0p);
            A0d.AAJ("surface_string_override", (String) null);
            A0d.Cgf();
        }
    }

    public C56507Hzd(FoaUserSession foaUserSession, C56092Hsf hsf) {
        this.A01 = hsf;
        this.A00 = AnonymousClass0kN.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }
}
