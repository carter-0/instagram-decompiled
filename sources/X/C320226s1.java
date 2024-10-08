package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6s1  reason: invalid class name and case insensitive filesystem */
public final class C320226s1 {
    public Map A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final void A00(Hashtag hashtag, String str, int i) {
        AnonymousClass0iw r0 = this.A01;
        UserSession userSession = this.A02;
        String id = hashtag.getId();
        if (id == null) {
            id = "";
        }
        C48906Em6.A00(r0, userSession, str, "hashtag", id, this.A03, this.A05, C281965Ag.A02(hashtag), this.A00, i);
    }

    public final void A01(User user, String str, int i) {
        C48906Em6.A00(this.A01, this.A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_USER, user.getId(), this.A03, this.A05, 1aC.A06(user.B6o()), this.A00, i);
    }

    public C320226s1(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3, Map map) {
        this.A01 = r1;
        this.A02 = userSession;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = map == null ? new HashMap() : map;
    }
}
