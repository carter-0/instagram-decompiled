package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.FnT  reason: case insensitive filesystem */
public final class C51037FnT implements AnonymousClass3UM {
    public final User A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final String BxN() {
        return this.A04;
    }

    public final String C8Y() {
        return null;
    }

    public final User CCd() {
        return this.A00;
    }

    public final String CDC() {
        return this.A05;
    }

    public final String getAlgorithm() {
        return this.A02;
    }

    public final String getId() {
        return this.A03;
    }

    public final ImmutableList getSocialContextFacepileUsers() {
        return this.A01;
    }

    public C51037FnT(ImmutableList immutableList, User user, String str, String str2, String str3, String str4, boolean z) {
        this.A03 = str;
        this.A00 = user;
        this.A04 = str2;
        this.A01 = immutableList;
        this.A02 = str3;
        this.A05 = str4;
        if (user.B6o() == FollowStatus.A08 || user.B6o() == FollowStatus.A04) {
            user.A0n(FollowStatus.A06);
        }
        user.A12(AnonymousClass7TF.A1W(user.B6o(), FollowStatus.A05));
        user.A13(z);
    }

    public final Reel BkU(UserSession userSession) {
        return null;
    }
}
