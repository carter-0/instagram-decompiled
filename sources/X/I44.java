package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;

public final class I44 {
    public final C58840Ae A00;
    public final C56150Htc A01;
    public final C56507Hzd A02;
    public final 01W A03 = new 01W(AnonymousClass7TE.A1I(AnonymousClass7TF.A0c()));

    public static final void A01(I44 i44, String str, String str2, boolean z) {
        A00(i44, str, str2, (String) null, false, z, false);
    }

    public /* synthetic */ I44(FoaUserSession foaUserSession, C56150Htc htc) {
        C56507Hzd hzd = new C56507Hzd(foaUserSession, htc.A05);
        this.A01 = htc;
        this.A02 = hzd;
        0qQ.A0B(foaUserSession, 0);
        this.A00 = AnonymousClass0kN.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }

    public static final void A00(I44 i44, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C56150Htc htc = i44.A01;
        C56092Hsf hsf = htc.A05;
        0eP A1L = AnonymousClass7TE.A1L("app_session_id", (Object) null);
        String str4 = hsf.A01;
        0eP A1L2 = AnonymousClass7TE.A1L("surface_session_id", str4);
        C69416Nky nky = htc.A02;
        LinkedHashMap A0q = DbY.A0q("entrypoint", nky.A00, A1L, A1L2);
        0Aj A0d = C51969G9p.A0d(i44.A00, "meta_ai_intents_image_creation_events");
        if (A0d.isSampled()) {
            A0d.AAJ(TraceFieldType.AdhocEventName, str);
            C51965G9l.A1A(XXv.A00(nky), A0d);
            String str5 = (String) i44.A03.A0R();
            if (str5 == null) {
                str5 = "";
            }
            A0d.AAJ("intent_session_id", str5);
            A0d.AAJ("bottom_sheet_session_id", hsf.A00);
            if (str4 == null) {
                str4 = "";
            }
            A0d.AAJ("surface_session_id", str4);
            A0d.AAJ(C66579MXk.A00(68), str2);
            if (str3 == null) {
                str3 = "";
            }
            A0d.AAJ("flash_session_id", str3);
            A0d.A7p("is_e2ee", AnonymousClass7TE.A0u());
            A0d.A7p("is_edited", Boolean.valueOf(z));
            A0d.A7p("is_personalized", Boolean.valueOf(z2));
            A0d.A9H("app_context_data", A0q);
            A0d.AAJ("surface_string_override", (String) null);
            A0d.A7p("is_ig_interest_personalized", Boolean.valueOf(z3));
            A0d.Cgf();
        }
    }
}
