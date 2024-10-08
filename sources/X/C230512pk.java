package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2pk  reason: invalid class name and case insensitive filesystem */
public final class C230512pk extends C230502pj {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public final void ATF(AnonymousClass30Y r12, C252093oY r13) {
        String str;
        0qQ.A0B(r12, 0);
        Object obj = r12.A03;
        C54077Gz1 gz1 = ((C53288Gla) obj).A03;
        List list = gz1.A0B;
        Object obj2 = r12.A04;
        0qQ.A06(obj2);
        String id = ((C55923Hpk) list.get(((Number) obj2).intValue())).A00().getId();
        if (id != null && r13 != null) {
            int intValue = r13.CEk(r12).intValue();
            if (intValue == 0) {
                A02(r12, r13, id, false);
            } else if (intValue == 2) {
                0qQ.A06(obj);
                for (C55923Hpk hpk : gz1.A0B) {
                    if (0qQ.A0K(hpk.A00().getId(), id)) {
                        1Xj A002 = hpk.A00();
                        LinkedHashMap A02 = C244083ac.A02(gz1.getId());
                        LinkedHashMap A022 = C244083ac.A02(id);
                        C244063aa r1 = C244063aa.SPONSORED_LABEL;
                        Object obj3 = A02.get(r1);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                        }
                        A022.put(r1, obj3);
                        C244063aa r14 = C244063aa.MULTI_ADS_TITLE;
                        Object obj4 = A02.get(r14);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                        }
                        A022.put(r14, obj4);
                        if (!A022.isEmpty()) {
                            UserSession userSession = this.A00;
                            AnonymousClass4DU r8 = this.A01;
                            0wc A003 = AnonymousClass0kN.A00(r8, 0kJ.A05, userSession);
                            0Aj A004 = A003.A00(A003.A00, "ig_rendering_validation_automatic");
                            if (A004.isSampled()) {
                                String A07 = C231122qu.A07(userSession, A002);
                                String str2 = "";
                                if (A07 == null) {
                                    A07 = str2;
                                }
                                A004.AAJ("ad_id", A07);
                                User CCd = A002.A0C.CCd();
                                if (CCd != null) {
                                    str = CCd.getId();
                                } else {
                                    str = str2;
                                }
                                A004.AAJ("a_pk", str);
                                A004.AAJ("m_pk", id);
                                String A0F = C231122qu.A0F(userSession, A002);
                                if (A0F != null) {
                                    str2 = A0F;
                                }
                                A004.AAJ("tracking_token", str2);
                                A004.AAJ("source_of_action", r8.getModuleName());
                                A004.AAJ("locale", AnonymousClass1Q2.A02().toString());
                                A004.AAJ("media_type", A002.BR7().name());
                                String id2 = gz1.getId();
                                0qQ.A0B(id2, 0);
                                0bb r15 = (0bb) AnonymousClass59A.A05.get(id2);
                                if (r15 == null) {
                                    r15 = new 0bb();
                                }
                                A004.AAK(r15, AnonymousClass000.A00(5071));
                                A004.A9H("pc_component_dict_new", A022);
                                A004.A7p("is_dark_mode", Boolean.valueOf(AnonymousClass1GD.A03()));
                                A004.Cgf();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public C230512pk(UserSession userSession, AnonymousClass4DU r2) {
        super(userSession);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
