package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.GAx  reason: case insensitive filesystem */
public final class C52000GAx extends C230502pj {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public final void ATF(AnonymousClass30Y r12, C252093oY r13) {
        0bb r5;
        String A0j;
        AnonymousClass7TF.A1H(r12, r13);
        Object obj = r12.A03;
        C267324bN r7 = (C267324bN) obj;
        String id = r7.getId();
        AnonymousClass59B r2 = (AnonymousClass59B) AnonymousClass59A.A02.get(id);
        if (r13.CEk(r12) == AnonymousClass05K.A0C) {
            if (r2 != null && (!r2.A01.isEmpty())) {
                0qQ.A06(obj);
                LinkedHashMap A022 = C244083ac.A02(id);
                if (!A022.isEmpty()) {
                    AnonymousClass6KP A002 = AnonymousClass59A.A00(id);
                    AdFormatType adFormatType = r7.A0E;
                    if (adFormatType != null) {
                        if (adFormatType == AdFormatType.H_SCROLL) {
                            A0j = "hscroll";
                        } else {
                            A0j = AnonymousClass7TF.A0j(adFormatType.name());
                        }
                        A002.A06("format_type", A0j);
                    }
                    UserSession userSession = this.A01;
                    String str = null;
                    if (182.A06(0Tu.A05, userSession, 36315155374345261L)) {
                        r5 = (0bb) AnonymousClass59A.A04.get(id);
                    } else {
                        r5 = null;
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_rendering_validation_automatic");
                    if (A0e.isSampled()) {
                        A0e.AAJ("ad_id", r7.getId());
                        String A15 = C51968G9o.A15(r7.A0K);
                        String str2 = "";
                        if (A15 == null) {
                            A15 = str2;
                        }
                        A0e.AAJ("a_pk", A15);
                        C51965G9l.A1I(A0e, r7.A0B());
                        String ByO = r7.ByO(userSession);
                        if (ByO == null) {
                            ByO = str2;
                        }
                        C51965G9l.A1L(A0e, ByO);
                        String moduleName = this.A02.getModuleName();
                        if (moduleName != null) {
                            str2 = moduleName;
                        }
                        A0e.AAJ("source_of_action", str2);
                        A0e.AAJ("locale", AnonymousClass1Q2.A00());
                        A0e.AAK(A002, "layout_info");
                        A0e.AAJ("country", AnonymousClass1Q2.A02().getCountry());
                        1iA r0 = r7.A0J;
                        if (r0 != null) {
                            str = r0.name();
                        }
                        C51974G9v.A0t(A0e, "media_type", str, A022);
                        if (r5 != null) {
                            A0e.AAK(r5, "lead_gen_info");
                        }
                        A0e.Cgf();
                    }
                }
            }
            AnonymousClass59A.A03(id);
            return;
        }
        A02(r12, r13, r7.getId(), false);
    }

    public C52000GAx(UserSession userSession, AnonymousClass4DU r3) {
        super(userSession);
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = AnonymousClass0kN.A00(r3, 0kJ.A05, userSession);
    }
}
