package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;

/* renamed from: X.Lx4  reason: case insensitive filesystem */
public final class C65627Lx4 implements G7M {
    public final int A00;
    public final Object A01;

    public C65627Lx4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAuthorizeFail() {
    }

    public final void onAuthorizeSuccess(String str) {
        switch (this.A00) {
            case 0:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                UserSession userSession = shareLaterFragment.A00;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    C363388je.A00(userSession).A01(ShareLaterFragment.A0I, shareLaterFragment.A02, "feed_share_later");
                    return;
                }
            case 1:
                0qQ.A0B(str, 0);
                C66576MXh A02 = ((LP2) this.A01).A02();
                0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.creation.fragment.followersshare.FeedPublishScreenDelegate");
                ((C65171Loa) A02).A04(str);
                return;
            case 2:
                C60258JiF jiF = (C60258JiF) this.A01;
                jiF.A01();
                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                AnonymousClass5w9.A00(jiF.A04).A09((C3034168s) null, "video_feed_relink");
                return;
            default:
                ESM esm = (ESM) this.A01;
                AnonymousClass0eM r3 = esm.A06;
                C363378jd A002 = C363388je.A00(AnonymousClass7TE.A0l(r3));
                CallerContext callerContext = esm.A05;
                0qQ.A06(callerContext);
                C299935wF A003 = A002.A00(callerContext);
                if (A003.A01 == AnonymousClass05K.A01) {
                    ESM.A07(esm, true);
                } else {
                    esm.setItems(ESM.A06(esm));
                }
                if (C363388je.A03(A003)) {
                    C363528js r2 = esm.A03;
                    if (r2 == null) {
                        r2 = new C363528js(AnonymousClass7TE.A0l(r3));
                        esm.A03 = r2;
                    }
                    r2.A06(AnonymousClass000.A00(2557), false);
                    return;
                }
                return;
        }
    }
}
