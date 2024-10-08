package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Fav  reason: case insensitive filesystem */
public final class C50392Fav implements C74468PvO {
    public User A00;
    public String A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final C255773uh A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final void CMO(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        0qQ.A0B(viewStub, 0);
        viewStub.setLayoutResource(R.layout.fragment_direct_reply_modal_feed_media_with_badged_profile);
        View inflate = viewStub.inflate();
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass7TF.A0F(inflate, R.id.context_image);
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        1Xj r2 = this.A04;
        roundedCornerImageView.A05 = r2.A17();
        ImageUrl A1Q = r2.A1Q();
        if (A1Q != null) {
            roundedCornerImageView.setUrl(A1Q, this.A02);
        }
        User user = this.A00;
        if (user != null) {
            DbT.A0b(inflate, R.id.context_badge).setUrl(user.Bh3(), this.A02);
        }
    }

    public final /* synthetic */ void DBt(C317486nL r1) {
    }

    public final void EMw(AnonymousClass2Ep r22, 2Dm r23, DirectShareTarget directShareTarget, String str, boolean z) {
        String str2;
        String str3 = str;
        0qQ.A0B(str3, 0);
        DirectShareTarget directShareTarget2 = directShareTarget;
        AnonymousClass7TG.A1U(r23, r22, directShareTarget2);
        String str4 = this.A01;
        boolean z2 = z;
        if (!this.A08) {
            AnonymousClass7Z6.A00(this.A03).EMx((C69343Nji) null, directShareTarget2, false, str3, str4, this.A06, z2);
        } else if (str4 != null) {
            1as r5 = 1as.A04;
            UserSession userSession = this.A03;
            C255773uh r3 = this.A05;
            User user = r3.A0i;
            if (user != null) {
                String id = user.getId();
                String str5 = r3.A0k;
                0qQ.A07(str5);
                1Xj r0 = r3.A0b;
                if (r0 != null) {
                    boolean z3 = z2;
                    r5.A0D(userSession, new C68165N3f(r0, directShareTarget2, id, str5, str3, "reel", z3).A00(), str4, this.A06);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        UserSession userSession2 = this.A03;
        AnonymousClass0iw r4 = this.A02;
        String str6 = this.A07;
        1Xj r02 = this.A04;
        String id2 = r02.getId();
        if (id2 != null) {
            User A2A = r02.A2A(userSession2);
            if (A2A != null) {
                C3265677h.A0L(r4, userSession2, str6, id2, A2A.getId());
                User user2 = this.A05.A0i;
                if (user2 != null) {
                    str2 = user2.getId();
                } else {
                    str2 = "";
                }
                AnonymousClass59S.A01(userSession2, str2, 766842320);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final User CD0() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C50392Fav(AnonymousClass0iw r5, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        User user;
        AnonymousClass7TG.A1R(str2, str3);
        this.A03 = userSession;
        this.A02 = r5;
        this.A07 = str;
        this.A08 = z;
        this.A06 = str6 == null ? "" : str6;
        Reel A0L = Dba.A0L(userSession, str2);
        if (A0L != null) {
            for (C255773uh r2 : A0L.A0O(userSession)) {
                if (str3.equals(r2.A0j)) {
                    this.A05 = r2;
                    1Xj r1 = r2.A0b;
                    if (r1 != null) {
                        this.A04 = r1;
                        if (str4 != null) {
                            user = DbV.A0j(this.A03, str4);
                            if (user == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            user = r2.A0i;
                            if (user == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                        this.A00 = user;
                        String str7 = this.A07;
                        this.A01 = str5 != null ? 002.A0R(str7, str5) : str7;
                        if (r1.getId() != null) {
                            User A2A = r1.A2A(this.A03);
                            if (A2A != null) {
                                A2A.getId();
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            throw AnonymousClass7TE.A0z("Reel item not available");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
