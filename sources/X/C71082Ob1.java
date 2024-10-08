package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ob1  reason: case insensitive filesystem */
public final class C71082Ob1 {
    public static final C71082Ob1 A00 = new Object();

    public static final boolean A01(N0V n0v, Integer num, Integer num2) {
        List singletonList;
        C69439Nlj nlj;
        boolean z = true;
        if (num2 == null || num2.intValue() != 1) {
            if (num2 == null || num2.intValue() <= 1) {
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        z = false;
                    } else if (intValue > 1) {
                        singletonList = Collections.singletonList(false);
                    }
                }
                return false;
            }
            singletonList = Collections.singletonList(true);
            0qQ.A07(singletonList);
            n0v.A07("is_animated", singletonList);
            nlj = C69439Nlj.STACK;
            n0v.A01(nlj, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            return true;
        }
        n0v.A07("is_animated", AnonymousClass7TE.A1I(z));
        nlj = C69439Nlj.SINGLE_IMAGE;
        n0v.A01(nlj, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        return true;
    }

    public static final XSV A00(0lg r4, DirectThreadKey directThreadKey) {
        List list;
        if (!(directThreadKey == null || (list = directThreadKey.A02) == null)) {
            if (list.size() > 1) {
                return XSV.A05;
            }
            if (list.size() == 1) {
                if (0qQ.A0K(00k.A0N(list), 182.A04(0Tu.A06, r4, 36887781888885515L))) {
                    return XSV.A02;
                }
                return XSV.A06;
            }
        }
        return XSV.A07;
    }

    public final void A02(UserSession userSession, DirectThreadKey directThreadKey, Boolean bool, int i, boolean z) {
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ai_image_interaction");
        if (A0e.isSampled()) {
            boolean z2 = !z;
            String A002 = AnonymousClass000.A00(365);
            if (!z2) {
                AnonymousClass7TE.A1W(A0e, A002, z2 ? 1 : 0);
            } else {
                A0e.AAJ(A002, (String) null);
            }
            AnonymousClass7TE.A1W(A0e, "view_name", 24);
            String str = null;
            A0e.AAJ("selected_item", (String) null);
            AnonymousClass7TE.A1W(A0e, "action_type", i);
            DbS.A1F((AnonymousClass0Ac) null, A0e);
            0bb r2 = new 0bb();
            r2.A03("is_blurred", bool);
            A0e.AAK(r2, "ai_image");
            A0e.A8M(A00(userSession, directThreadKey), "thread_type");
            C66581MXm.A1H(A0e, false);
            if (directThreadKey != null) {
                str = directThreadKey.A01;
            }
            C66580MXl.A1J(A0e, str);
            A0e.Cgf();
        }
    }

    public final void A03(UserSession userSession, C254743sy r7, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i, int i2, int i3) {
        Long l;
        XSV xsv;
        String A01;
        if (0qQ.A0K(str2, 182.A04(0Tu.A06, userSession, 36887781888885515L))) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ai_image_interaction");
            if (A0e.isSampled()) {
                0bb r1 = new 0bb();
                if (num3 != null) {
                    l = C51969G9p.A0r(num3);
                } else {
                    l = null;
                }
                r1.A05("stack_index", l);
                if (A01(r1, num, num2)) {
                    AnonymousClass7TE.A1W(A0e, AnonymousClass000.A00(365), 999);
                    AnonymousClass7TE.A1W(A0e, "view_name", i);
                    A0e.AAJ("selected_item", str3);
                    AnonymousClass7TE.A1W(A0e, "action_type", i2);
                    DbS.A1F((AnonymousClass0Ac) null, A0e);
                    A0e.AAK(r1, "ai_image");
                    int i4 = i3;
                    if (i4 == 47) {
                        xsv = XSV.A05;
                    } else if (i4 == 1003) {
                        xsv = XSV.A06;
                    } else if (i4 != 1012) {
                        xsv = XSV.A07;
                    } else {
                        xsv = XSV.A02;
                    }
                    A0e.A8M(xsv, "thread_type");
                    A0e.A7p("is_e2ee", bool);
                    if (!(r7 == null || (A01 = C67003Mgb.A01(r7)) == null)) {
                        str = A01;
                    }
                    C66580MXl.A1J(A0e, str);
                    A0e.Cgf();
                }
            }
        }
    }
}
