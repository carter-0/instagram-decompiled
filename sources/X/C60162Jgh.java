package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jgh  reason: case insensitive filesystem */
public final class C60162Jgh extends 2YL {
    public final UserSession A00;
    public final 1Yy A01;
    public final User A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public /* synthetic */ C60162Jgh(HighlightReelTypeStr highlightReelTypeStr, UserSession userSession) {
        Boolean bool;
        1Yy A012 = FC8.A01();
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = A012;
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        this.A02 = A0Q;
        FanClubInfoDict B3v = A0Q.A03.B3v();
        if (B3v != null) {
            bool = B3v.Ae7();
        } else {
            bool = null;
        }
        02z A013 = 106.A01(bool);
        this.A03 = A013;
        this.A04 = 10b.A02(new C61082JwK((C266444Yx) null, (DefaultConstructorMarker) null, 3, 7, false), C318116oQ.A00(this), MCA.A00(A013, highlightReelTypeStr, 20), AnonymousClass10A.A01);
    }
}
