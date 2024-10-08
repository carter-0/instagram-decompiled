package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Hzm  reason: case insensitive filesystem */
public final class C56515Hzm {
    public final C58840Ae A00;
    public final C56150Htc A01;
    public final C56507Hzd A02;

    public /* synthetic */ C56515Hzm(FoaUserSession foaUserSession, C56150Htc htc) {
        C56507Hzd hzd = new C56507Hzd(foaUserSession, htc.A05);
        this.A01 = htc;
        this.A02 = hzd;
        this.A00 = AnonymousClass0kN.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }

    public static final void A00(HOC hoc, C56515Hzm hzm, String str) {
        C56150Htc htc = hzm.A01;
        C56092Hsf hsf = htc.A05;
        LinkedHashMap A0p = DbY.A0p("surface_session_id", hsf.A01, AnonymousClass7TE.A1L("app_session_id", (Object) null));
        0Aj A0d = C51969G9p.A0d(hzm.A00, "meta_ai_intents_image_editing_events");
        if (A0d.isSampled()) {
            A0d.AAJ(TraceFieldType.AdhocEventName, str);
            C51965G9l.A1A(XXv.A00(htc.A02), A0d);
            A0d.A8M(hoc, "source_image_type");
            A0d.AAJ("bottom_sheet_session_id", hsf.A00);
            A0d.AAJ("response_image_type", "");
            A0d.A9H("app_context_data", A0p);
            A0d.AAJ("surface_string_override", (String) null);
            A0d.Cgf();
        }
    }
}
