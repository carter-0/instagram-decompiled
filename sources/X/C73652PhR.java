package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.PhR  reason: case insensitive filesystem */
public final /* synthetic */ class C73652PhR extends 03J implements 0sJ {
    public static final C73652PhR A00 = new C73652PhR();

    public C73652PhR() {
        super(4, C69632NpE.class, "genPlaceholderHeaderUiState", "genPlaceholderHeaderUiState(Lcom/instagram/common/session/UserSession;Lcom/instagram/model/reels/Reel;Lcom/instagram/model/reels/ReelItem;Lcom/instagram/stories/common/data/StoriesViewerParameters;)Lcom/instagram/stories/header/domain/StoriesHeaderViewModel$UiState;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        UserSession userSession = (UserSession) obj;
        Reel reel = (Reel) obj2;
        C255773uh r5 = (C255773uh) obj3;
        C311716d8 r6 = (C311716d8) obj4;
        C51974G9v.A1O(userSession, reel, r5, r6);
        return OUk.A00.A00((View.OnClickListener) null, (View.OnClickListener) null, userSession, reel, r5, r6, new OAL(userSession), C74208Pqp.A00, true);
    }
}
