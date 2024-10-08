package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.repository.WallPendingPostManager;
import com.instagram.wonderwall.repository.WallPostComposerRepository;

/* renamed from: X.H6b  reason: case insensitive filesystem */
public final class C54284H6b extends C228042kh {
    public final UserSession A00;
    public final WallInfo A01;
    public final WallPostItem A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C53563GqZ gqZ;
        String str;
        WallInfo wallInfo = this.A01;
        UserSession userSession = this.A00;
        String str2 = this.A03;
        boolean A1V = AnonymousClass7TF.A1V(str2);
        WallPostItem wallPostItem = this.A02;
        AnonymousClass7TG.A1N(userSession, wallInfo);
        WallPendingPostManager A002 = C56353Hx4.A00(userSession);
        1Xj A0U = DbV.A0U(userSession, str2);
        if (A0U != null) {
            gqZ = new C53563GqZ(A0U.A09, A0U, C51970G9q.A0j(A0U));
        } else {
            gqZ = null;
        }
        if (wallPostItem == null || (str = 002.A0E(wallPostItem.BeB().A03.getUsername(), '@', ' ')) == null) {
            str = "";
        }
        return new C53029GhK(userSession, wallInfo, new WallPostComposerRepository(userSession, gqZ, wallInfo, A002, str), A1V);
    }

    public C54284H6b(UserSession userSession, WallInfo wallInfo, WallPostItem wallPostItem, String str) {
        AnonymousClass7TG.A1O(userSession, wallInfo);
        this.A00 = userSession;
        this.A01 = wallInfo;
        this.A02 = wallPostItem;
        this.A03 = str;
    }
}
