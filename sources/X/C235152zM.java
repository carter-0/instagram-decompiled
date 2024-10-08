package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.2zM  reason: invalid class name and case insensitive filesystem */
public final class C235152zM extends C230502pj {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        String str;
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        Object obj = r8.A03;
        1Xj r5 = (1Xj) obj;
        String id = r5.getId();
        if (id != null) {
            AnonymousClass59B r3 = (AnonymousClass59B) AnonymousClass59A.A02.get(id);
            if (r9.CEk(r8) == AnonymousClass05K.A0C) {
                if (r3 != null && (!r3.A01.isEmpty()) && r3.A02 && r3.A03) {
                    0qQ.A06(obj);
                    LinkedHashMap A022 = C244083ac.A02(id);
                    if (!A022.isEmpty()) {
                        0wc r32 = this.A00;
                        0Aj A002 = r32.A00(r32.A00, "ig_rendering_validation_automatic");
                        if (A002.isSampled()) {
                            String A07 = C231122qu.A07(this.A01, r5);
                            String str2 = "";
                            if (A07 == null) {
                                A07 = str2;
                            }
                            A002.AAJ("ad_id", A07);
                            User CCd = r5.A0C.CCd();
                            if (CCd != null) {
                                str = CCd.getId();
                            } else {
                                str = str2;
                            }
                            A002.AAJ("a_pk", str);
                            A002.AAJ("m_pk", id);
                            String A2v = r5.A2v();
                            if (A2v == null) {
                                A2v = str2;
                            }
                            A002.AAJ("tracking_token", A2v);
                            String moduleName = this.A02.getModuleName();
                            if (moduleName != null) {
                                str2 = moduleName;
                            }
                            A002.AAJ("source_of_action", str2);
                            A002.AAJ("locale", AnonymousClass1Q2.A00());
                            A002.AAJ("country", AnonymousClass1Q2.A02().getCountry());
                            A002.AAJ("media_type", r5.BR7().name());
                            A002.A9H("pc_component_dict_new", A022);
                            A002.A7p("is_dark_mode", Boolean.valueOf(AnonymousClass1GD.A03()));
                            A002.Cgf();
                        }
                    }
                }
                AnonymousClass59A.A03(id);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C235152zM(UserSession userSession, AnonymousClass4DU r3) {
        super(userSession);
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = AnonymousClass0kN.A00(r3, 0kJ.A05, userSession);
    }
}
