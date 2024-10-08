package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7bY  reason: invalid class name and case insensitive filesystem */
public final class C334597bY implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334597bY(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        C272054k1 AlM;
        C272034jz BdV;
        int A03 = AnonymousClass0fD.A03(1325537559);
        C240263Kf r10 = (C240263Kf) obj;
        int A032 = AnonymousClass0fD.A03(-775349098);
        0qQ.A0B(r10, 0);
        1Xj r0 = r10.A00;
        if (!r0.A4c()) {
            AnonymousClass3W1 r5 = r10.A01;
            C334537bS r7 = this.A00;
            UserSession userSession = r7.A0E;
            AnonymousClass4DU r9 = r7.A0G;
            String str2 = null;
            I6Q.A02(userSession, r0, r9, "comment_count", (String) null);
            Fragment fragment = r7.A01;
            I6Q.A00(fragment, userSession, r0);
            String BpP = r0.BpP();
            String moduleName = r9.getModuleName();
            if (!r10.A03 || (AlM = r0.A0C.AlM()) == null || (BdV = AlM.BdV()) == null) {
                str = null;
            } else {
                str = BdV.getPollId();
            }
            boolean A02 = 2R8.A02(userSession, r0);
            boolean isOrganicEligible = r9.isOrganicEligible();
            boolean isSponsoredEligible = r9.isSponsoredEligible();
            AnonymousClass5OB r102 = AnonymousClass5OB.VIEW_ALL_COMMENTS_FROM_SLIDE_THREAD;
            C249763kK r72 = r7.A00;
            if (r72 != null) {
                str2 = r72.getSessionId();
            }
            C3018960m.A00().A00().A01(fragment.requireActivity(), new C53335GmL(r102, (Float) null, Integer.valueOf(r5.A03), Integer.valueOf(r5.getPosition()), (Integer) null, Integer.valueOf(r5.A0W), (Integer) null, BpP, (String) null, moduleName, (String) null, str, (String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, r0.A0r(), A02, isOrganicEligible, isSponsoredEligible, false, false, r5.A2V, false, false, r0.A5v(), false, false, false, false, false, false, false, false, r0.A4l(), r0.CcK(), false, false, false, false, false, false, false), userSession, A09.A00(userSession).booleanValue(), r0.CcK());
        }
        AnonymousClass0fD.A0A(-129357920, A032);
        AnonymousClass0fD.A0A(-927352201, A03);
    }
}
