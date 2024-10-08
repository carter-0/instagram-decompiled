package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import instagram.features.clips.viewer.controller.EmojiReactionTrayView;

public final class OLV {
    public View A00;
    public EmojiReactionTrayView A01;
    public final UserSession A02;
    public final OD8 A03 = new OD8(this);
    public final GME A04;

    public OLV(UserSession userSession, GME gme) {
        0qQ.A0B(userSession, 2);
        this.A04 = gme;
        this.A02 = userSession;
    }

    public final void A00(boolean z) {
        View view = this.A00;
        int i = 0;
        if (view != null) {
            view.setVisibility(DbW.A01(z ? 1 : 0));
        }
        EmojiReactionTrayView emojiReactionTrayView = this.A01;
        if (emojiReactionTrayView != null) {
            if (!z) {
                i = 8;
            }
            emojiReactionTrayView.setVisibility(i);
        }
    }
}
