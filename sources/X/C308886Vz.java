package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6Vz  reason: invalid class name and case insensitive filesystem */
public final class C308886Vz implements 1UV {
    public UserSession A00;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        Reel reel = (Reel) obj;
        String id = reel.getId();
        0qQ.A0B(id, 0);
        if (!id.equals("story_interstitial_roll_call")) {
            return !reel.A16(this.A00);
        }
        return true;
    }
}
