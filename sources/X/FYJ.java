package X;

import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.user.model.User;

public final class FYJ implements C232262tL {
    public final FanClubCategoryType A00;
    public final User A01;
    public final User A02;
    public final String A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        FYJ fyj = (FYJ) obj;
        0qQ.A0B(fyj, 0);
        if (this.A00 != fyj.A00 || !0qQ.A0K(this.A03, fyj.A03)) {
            return false;
        }
        return true;
    }

    public FYJ(FanClubCategoryType fanClubCategoryType, User user, User user2, String str, String str2) {
        AnonymousClass7TG.A1U(fanClubCategoryType, str, str2);
        AnonymousClass7TG.A1R(user, user2);
        this.A00 = fanClubCategoryType;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = user;
        this.A01 = user2;
    }
}
