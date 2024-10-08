package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.model.sharelater.ShareLaterMedia;

/* renamed from: X.Lzq  reason: case insensitive filesystem */
public final class C65798Lzq implements MUP {
    public final /* synthetic */ ShareLaterFragment A00;

    public final void Cha(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        ShareLaterFragment shareLaterFragment = this.A00;
        UserSession userSession = shareLaterFragment.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
        0qQ.A0A(shareLaterMedia);
        C22031Xty.A09(shareLaterFragment, userSession, (Long) null, shareLaterMedia.A05, "share_later_view", str2);
    }

    public final void Civ(String str) {
        0qQ.A0B(str, 0);
        ShareLaterFragment shareLaterFragment = this.A00;
        UserSession userSession = shareLaterFragment.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
        0qQ.A0A(shareLaterMedia);
        C22031Xty.A0E(shareLaterFragment, userSession, shareLaterMedia.A05, "share_later_view", str);
    }

    public C65798Lzq(ShareLaterFragment shareLaterFragment) {
        this.A00 = shareLaterFragment;
    }
}
