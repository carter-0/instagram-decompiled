package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

public final class UmI extends C320216s0 {
    public Hashtag A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final C17996VjY A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C230152p2 A06 = new C19383WXa(this, 1);
    public final C230132oy A07;

    public UmI(Context context, FragmentActivity fragmentActivity, AnonymousClass07i r12, AnonymousClass0iw r13, 0xF r14, UserSession userSession, C17996VjY vjY, Hashtag hashtag, String str) {
        super(r13, r14, userSession, str, "hashtag", "hashtag_page");
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A05 = userSession;
        this.A04 = r13;
        this.A07 = new C230132oy(context, r12, r13, userSession);
        this.A00 = hashtag;
        this.A03 = vjY;
    }

    public final Hashtag A00(Hashtag hashtag, int i) {
        super.A00(hashtag, i);
        this.A07.A05(this.A05, this.A06, hashtag, "follow_chaining");
        return hashtag;
    }

    public final Hashtag A01(Hashtag hashtag, int i) {
        super.A01(hashtag, i);
        this.A07.A06(this.A05, this.A06, hashtag, "follow_chaining");
        return hashtag;
    }

    public final void A02() {
        super.A02();
        C17996VjY vjY = this.A03;
        vjY.A00 = C322496vv.Closed;
        C15381Ube.A03(vjY.A04.A00);
    }

    public final void A07(Hashtag hashtag, int i) {
        super.A07(hashtag, i);
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A05;
        C309516Yo r3 = new C309516Yo(fragmentActivity, userSession);
        String moduleName = this.A04.getModuleName();
        Fragment A012 = W0l.A01(userSession);
        A012.setArguments(W0l.A00(hashtag, moduleName, "follow_chaining"));
        r3.A0B((Bundle) null, A012);
        r3.A0B = "follow_chaining";
        r3.A04();
    }

    public final void A09(User user, int i) {
        super.A09(user, i);
        C51970G9q.A12(this.A02);
    }

    public final void A0G(boolean z, String str) {
        super.A0G(z, str);
        C309516Yo r3 = new C309516Yo(this.A02, this.A05);
        Hashtag hashtag = this.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelable("SimilarAccountsFragment.ARGUMENT_HASHTAG", hashtag);
        C15385Ubk ubk = new C15385Ubk();
        ubk.setArguments(bundle);
        r3.A0E(ubk);
        r3.A0B = "related_hashtag";
        r3.A04();
    }
}
