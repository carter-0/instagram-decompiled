package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.user.model.User;

/* renamed from: X.FZc  reason: case insensitive filesystem */
public final class C50345FZc implements B1O {
    public final /* synthetic */ User A00;

    public final void FHp(AnonymousClass3Q2 r4) {
        String fanClubId;
        0qQ.A0B(r4, 0);
        r4.A0U(AnonymousClass3QO.FAN_CLUB);
        FanClubInfoDict B3v = this.A00.A03.B3v();
        if (B3v != null && (fanClubId = B3v.getFanClubId()) != null) {
            r4.A11 = new ClipsFanClubMetadata(C46401DeO.WELCOME_FEEDBACK_STORY, fanClubId);
        }
    }

    public C50345FZc(User user) {
        this.A00 = user;
    }
}
