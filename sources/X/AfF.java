package X;

import com.instagram.common.session.UserSession;

public final /* synthetic */ class AfF implements C336227eH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xj A01;

    public /* synthetic */ AfF(UserSession userSession, 1Xj r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final 1OC AMt(String str) {
        UserSession userSession = this.A00;
        String id = this.A01.getId();
        1NY r3 = new 1NY(userSession, -2);
        r3.A02 = new 1NS(new 0bH(userSession), C334257ay.class);
        r3.A05();
        r3.A0A("media/story_comment/mention_search_members/");
        r3.A0G("media_id", id);
        r3.A0G("query", str);
        r3.A0G(C66579MXk.A00(41), "comment_composer_page");
        return r3.A0M();
    }
}
