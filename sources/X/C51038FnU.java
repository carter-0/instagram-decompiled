package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.FnU  reason: case insensitive filesystem */
public final class C51038FnU implements AnonymousClass3UM {
    public static final Map A03 = AnonymousClass7TE.A1H();
    public final ImmutableList A00;
    public final User A01;
    public final String A02;

    public final Reel BkU(UserSession userSession) {
        return null;
    }

    public final String C8Y() {
        return null;
    }

    public final String CDC() {
        return null;
    }

    public final String getAlgorithm() {
        return "";
    }

    public final String BxN() {
        return this.A02;
    }

    public final User CCd() {
        return this.A01;
    }

    public final String getId() {
        return this.A01.getId();
    }

    public final ImmutableList getSocialContextFacepileUsers() {
        return this.A00;
    }

    public C51038FnU(User user) {
        this.A01 = user;
        String A0o = DbS.A0o(user);
        this.A02 = A0o == null ? "" : A0o;
        this.A00 = user.A09();
    }
}
