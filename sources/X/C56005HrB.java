package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.HrB  reason: case insensitive filesystem */
public final class C56005HrB {
    public final UserSession A00;
    public final C56022HrU A01;
    public final 0V2 A02;
    public final 0V2 A03;
    public final 0V2 A04;
    public final 0V2 A05;
    public final C61770pa A06;
    public final C61770pa A07;
    public final C61770pa A08;
    public final C61770pa A09;

    public /* synthetic */ C56005HrB(UserSession userSession) {
        C56022HrU hrU = new C56022HrU(userSession);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = hrU;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A04 = A012;
        this.A08 = new 0V1((C262204Co) null, A012);
        05D A013 = 10D.A01(num, 0, 0);
        this.A05 = A013;
        this.A09 = new 0V1((C262204Co) null, A013);
        05D A014 = 10D.A01(num, 0, 0);
        this.A03 = A014;
        this.A07 = new 0V1((C262204Co) null, A014);
        05D A015 = 10D.A01(num, 0, 0);
        this.A02 = A015;
        this.A06 = new 0V1((C262204Co) null, A015);
    }

    public final Object A00(String str, String str2, String str3, AnonymousClass4D7 r12) {
        C56022HrU hrU = this.A01;
        0qQ.A0B(str, 0);
        1NY A0M = DbU.A0M(hrU.A00);
        A0M.A05();
        A0M.A02();
        String A11 = 002.A11("api/", "v1/", "creators/", "achievements/", "info/");
        0qQ.A07(A11);
        A0M.A0E = A11;
        A0M.A0O((15p) null, C43785CDd.class, C45500Cxa.class, false);
        A0M.A9m("achievement_id", str);
        if (str2 != null) {
            A0M.A9m("media_id", str2);
        }
        if (str3 != null) {
            A0M.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        }
        Object collect = new C343637qX(new C66162MFz(3, (AnonymousClass4D7) null), A0M.A0M().A04(1525447983, 3)).collect(new C58037IkV(this, 21), r12);
        if (collect != 1Hj.A02) {
            return C60340gF.A00;
        }
        return collect;
    }
}
