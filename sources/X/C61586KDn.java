package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository;

/* renamed from: X.KDn  reason: case insensitive filesystem */
public final class C61586KDn extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public C61586KDn(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        StoryCommentsDashboardRepository storyCommentsDashboardRepository = new StoryCommentsDashboardRepository(new L2D(userSession));
        return new C60317JjL(1E7.A00(userSession), new C317746nl(userSession), storyCommentsDashboardRepository, this.A02, this.A01);
    }
}
