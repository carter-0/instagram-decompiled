package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;

/* renamed from: X.GMw  reason: case insensitive filesystem */
public abstract class C52306GMw {
    public static final boolean A01(UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, String str) {
        0qQ.A0B(socialContextBubbleUiState, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        if (00p.A0k(str, "clips_viewer", false) || socialContextBubbleUiState.A02 != SocialContextType.COMMENTED_BY || !AnonymousClass3DI.A00.A04(userSession)) {
            return false;
        }
        return true;
    }

    public static final Integer A00(UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        if (A01(userSession, socialContextBubbleUiState, str)) {
            return AnonymousClass05K.A0j;
        }
        if (C52114GFi.A03(userSession) || 0qQ.A0K(182.A04(0Tu.A05, userSession, 36892630906438588L), "above_caption")) {
            return AnonymousClass05K.A0u;
        }
        return AnonymousClass05K.A00;
    }
}
