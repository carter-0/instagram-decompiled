package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HVp  reason: case insensitive filesystem */
public abstract class C54858HVp {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        C267324bN r0;
        List list;
        1Xj r02;
        AnonymousClass3HX r03;
        Object A03 = r12.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(0));
        C307786Rm r7 = (C307786Rm) A03;
        Object A02 = r12.A02();
        0qQ.A0C(A02, C66579MXk.A00(5));
        List list2 = (List) A02;
        int A04 = DbW.A04(r12.A00(), "null cannot be cast to non-null type kotlin.Number");
        String str = (String) DbW.A0g(r12, 4);
        if (A04 >= 0 && A04 < list2.size()) {
            UserSession A0R = DbW.A0R(r11);
            ArrayList<AnonymousClass3HX> A0p = AnonymousClass7TF.A0p(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                try {
                    r03 = AnonymousClass3HR.parseFromJson(0c9.A04.A01(A0R, AnonymousClass7TE.A18(it)));
                } catch (IOException unused) {
                    r03 = null;
                }
                A0p.add(r03);
            }
            ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
            for (AnonymousClass3HX r04 : A0p) {
                if (r04 == null || (list = r04.A1j) == null || (r02 = (1Xj) 00k.A0J(list)) == null) {
                    r0 = null;
                } else {
                    r0 = C295375o3.A02(r02);
                }
                A0p2.add(r0);
            }
            C267324bN r5 = (C267324bN) A0p2.get(A04);
            if (r5 != null) {
                List A0X = 00k.A0X(A0p2);
                String moduleName = C308206Td.A07(r7).getModuleName();
                String str2 = 1L2.A00().A00;
                C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.SHOPPING_HOME, A0R);
                A0i.A1C = G9t.A1A(r5);
                A0i.A1F = str2;
                A0i.A1S = false;
                A0i.A1N = false;
                A0i.A1c = false;
                A0i.A0p = moduleName;
                A0i.A15 = str;
                ClipsViewerConfig A00 = A0i.A00();
                C229352nF A0Y = C51967G9n.A0Y(A0R);
                A0Y.A02(str2);
                A0Y.A08(str2, A0X, false, false);
                C250563lf.A0X(C308206Td.A03(r7), A00, A0R);
            }
        }
        return null;
    }
}
