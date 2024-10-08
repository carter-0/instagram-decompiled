package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MIr  reason: case insensitive filesystem */
public final /* synthetic */ class C66210MIr extends 03J implements 0sJ {
    public static final C66210MIr A00 = new C66210MIr();

    public C66210MIr() {
        super(4, C62870Knk.class, "genLikePlaceholderState", "genLikePlaceholderState(Lcom/instagram/common/session/UserSession;Lcom/instagram/model/reels/Reel;Lcom/instagram/model/reels/ReelItem;Lcom/instagram/stories/common/data/StoriesViewerParameters;)Lcom/instagram/stories/like/domain/StoryViewerLikeViewModel$UiState;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        UserSession userSession = (UserSession) obj;
        C255773uh r4 = (C255773uh) obj3;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A1U(obj2, r4, obj4);
        return C63454KxJ.A00(userSession, r4, false);
    }
}
