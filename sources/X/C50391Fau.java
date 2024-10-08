package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.Fau  reason: case insensitive filesystem */
public final class C50391Fau implements C74468PvO {
    public User A00;
    public String A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

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
        IgImageView A0b = DbT.A0b(inflate, R.id.context_badge);
        User user = this.A00;
        if (user == null) {
            0qQ.A0F("_userToSendMessageTo");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A0b.setUrl(user.Bh3(), this.A02);
        }
    }

    public final /* synthetic */ void DBt(C317486nL r1) {
    }

    public final void EMw(AnonymousClass2Ep r15, 2Dm r16, DirectShareTarget directShareTarget, String str, boolean z) {
        String str2;
        DirectShareTarget directShareTarget2 = directShareTarget;
        String str3 = str;
        AnonymousClass7TF.A1C(str3, 0, directShareTarget2);
        boolean z2 = this.A07;
        UserSession userSession = this.A03;
        AnonymousClass7Z6 A002 = AnonymousClass7Z6.A00(userSession);
        boolean z3 = z;
        if (!z2) {
            String str4 = this.A01;
            if (str4 != null) {
                A002.EMx((C69343Nji) null, directShareTarget2, false, str3, str4, this.A05, z3);
            }
            0qQ.A0F("sendAttribution");
            throw AnonymousClass00P.createAndThrow();
        }
        1Xj r7 = this.A04;
        String str5 = this.A01;
        if (str5 != null) {
            A002.EM0(r7, directShareTarget2, str3, str5, this.A05, false, z3);
        }
        0qQ.A0F("sendAttribution");
        throw AnonymousClass00P.createAndThrow();
        1Xj r6 = this.A04;
        User CCd = r6.A0C.CCd();
        if (CCd != null) {
            str2 = CCd.getId();
        } else {
            str2 = "";
        }
        AnonymousClass59S.A01(userSession, str2, 766842320);
        AnonymousClass0iw r4 = this.A02;
        String str6 = this.A06;
        String id = r6.getId();
        if (id != null) {
            User A2A = r6.A2A(userSession);
            if (A2A != null) {
                C3265677h.A0L(r4, userSession, str6, id, A2A.getId());
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
        0qQ.A0F("_userToSendMessageTo");
        throw AnonymousClass00P.createAndThrow();
    }

    public C50391Fau(AnonymousClass0iw r4, UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z) {
        User user;
        this.A03 = userSession;
        this.A02 = r4;
        this.A06 = str;
        this.A07 = z;
        1Xj A0U = DbV.A0U(userSession, str2);
        if (A0U != null) {
            this.A04 = A0U;
            if (str3 != null) {
                user = DbV.A0j(userSession, str3);
                if (user == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                user = A0U.A2A(userSession);
                if (user == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            this.A00 = user;
            String moduleName = r4.getModuleName();
            this.A01 = str4 != null ? 002.A0R(moduleName, str4) : moduleName;
            this.A05 = str5 == null ? "" : str5;
            if (A0U.getId() != null) {
                this.A00.getId();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
