package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7bV  reason: invalid class name and case insensitive filesystem */
public final class C334567bV implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334567bV(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String A002;
        String str;
        int A03 = AnonymousClass0fD.A03(-1463703112);
        C240243Kd r6 = (C240243Kd) obj;
        int A032 = AnonymousClass0fD.A03(-1141547635);
        0qQ.A0B(r6, 0);
        1Xj r1 = r6.A01;
        String str2 = null;
        if (r1 != null) {
            C334537bS r7 = this.A00;
            UserSession userSession = r7.A0E;
            1Xj A1e = r1.A1e(userSession);
            if (!A1e.A4c()) {
                boolean z = false;
                if (r6.A02 == AnonymousClass05K.A01) {
                    z = true;
                }
                AnonymousClass4DU r8 = r7.A0G;
                if (z) {
                    A002 = "caption";
                    str = null;
                } else {
                    A002 = C273654mx.A00(364);
                    str = r6.A03;
                }
                I6Q.A02(userSession, A1e, r8, A002, str);
                Fragment fragment = r7.A01;
                I6Q.A00(fragment, userSession, A1e);
                AnonymousClass5OB r11 = r6.A00;
                String BpP = A1e.BpP();
                String moduleName = r8.getModuleName();
                String str3 = r6.A03;
                boolean A02 = 2R8.A02(userSession, A1e);
                boolean isOrganicEligible = r8.isOrganicEligible();
                boolean isSponsoredEligible = r8.isSponsoredEligible();
                if (r11 == null) {
                    if (z) {
                        r11 = AnonymousClass5OB.EXPANDED_CAPTION;
                    } else {
                        r11 = AnonymousClass5OB.PREVIEW_COMMENT;
                    }
                }
                C249763kK r72 = r7.A00;
                if (r72 != null) {
                    str2 = r72.getSessionId();
                }
                C3018960m.A00().A00().A01(fragment.requireActivity(), new C53335GmL(r11, (Float) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, BpP, (String) null, moduleName, str3, (String) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, A1e.A0r(), A02, isOrganicEligible, isSponsoredEligible, false, false, false, false, false, A1e.A5v(), false, false, false, false, false, false, false, false, A1e.A4l(), A1e.CcK(), false, false, false, false, false, false, false), userSession, A09.A00(userSession).booleanValue(), A1e.CcK());
            }
        }
        AnonymousClass0fD.A0A(1305059978, A032);
        AnonymousClass0fD.A0A(-512737976, A03);
    }
}
