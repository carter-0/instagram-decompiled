package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;

/* renamed from: X.6Vv  reason: invalid class name and case insensitive filesystem */
public final class C308846Vv implements 1UV {
    public final User A00;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        1Ns r2;
        ReelType reelType;
        Reel reel = (Reel) obj;
        if (reel == null || (r2 = reel.A0W) == null || ((reelType = reel.A0P) != null && reelType.equals(ReelType.A0I))) {
            return true;
        }
        return !r2.getId().equals(this.A00.getId());
    }

    public C308846Vv(User user) {
        this.A00 = user;
    }
}
