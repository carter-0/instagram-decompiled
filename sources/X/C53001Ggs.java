package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.Ggs  reason: case insensitive filesystem */
public final class C53001Ggs extends 2YL {
    public final 2Fk A00;
    public final C22338Xzn A01;
    public final 05G A02;
    public final 05G A03;
    public final 05G A04;
    public final C55450Hhu A05;
    public final UserSession A06;

    public C53001Ggs(C55450Hhu hhu, UserSession userSession, String str) {
        AnonymousClass7TF.A1B(userSession, 1, str);
        this.A06 = userSession;
        this.A05 = hhu;
        02z A012 = 106.A01((Object) null);
        this.A03 = A012;
        02z A013 = 106.A01((Object) null);
        this.A02 = A013;
        02z A10 = C51970G9q.A10(true);
        this.A04 = A10;
        this.A01 = C319596qs.A02(userSession);
        0pt A002 = AnonymousClass10H.A00(C58121Imn.A00, A10, A012, A013);
        this.A00 = C226292g8.A00(19B.A00, 10b.A02(new C55707Hm4((String) null, (List) null, true), C318116oQ.A00(this), A002, AnonymousClass10A.A00));
        1NY A0M = DbU.A0M(hhu.A00);
        A0M.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0M.A05();
        A0M.A0A("business/account/get_content_inspiration_medias/");
        DbY.A19(this, new MGZ(this, (AnonymousClass4D7) null, 40), JUM.A00(new JVD(41, (AnonymousClass4D7) null), JUM.A01(new JVD(40, (AnonymousClass4D7) null), DbU.A0S(A0M, C54054Gyd.class, C56244HvB.class).A03(1994055631))));
    }
}
