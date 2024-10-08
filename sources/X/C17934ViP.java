package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.ViP  reason: case insensitive filesystem */
public final class C17934ViP {
    public C15256UXq A00;
    public String A01;
    public boolean A02;
    public final UserSession A03;
    public final C18008Vjk A04;
    public final C18008Vjk A05;
    public final String A06;
    public final UserSession A07;
    public final EWI A08;
    public final String A09;

    public C17934ViP(UserSession userSession, EWI ewi, C18008Vjk vjk, String str, String str2) {
        DbW.A1O(userSession, 1, vjk);
        this.A03 = userSession;
        this.A06 = str;
        this.A05 = vjk;
        this.A07 = userSession;
        this.A08 = ewi;
        this.A09 = str;
        this.A01 = str2;
        this.A04 = vjk;
    }

    public final void A00(Fragment fragment, UZ2 uz2) {
        if (!this.A02) {
            UserSession userSession = this.A07;
            EWI ewi = this.A08;
            String str = this.A09;
            1NY A0O = DbU.A0O(userSession);
            A0O.A0A("civic_action/get_voting_info/");
            A0O.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ewi.A00);
            A0O.A0G("media_id", str);
            1OC A0S = DbT.A0S(A0O, C15256UXq.class, C18213Vnd.class);
            C15619Ufl.A00(A0S, uz2, this, 10);
            Dbb.A15(fragment, A0S);
        }
    }
}
