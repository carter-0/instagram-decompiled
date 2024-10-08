package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Iterator;

public final class P1Q implements C74468PvO {
    public final 1Xj A00;
    public final C255773uh A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final User A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public P1Q(AnonymousClass0iw r6, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        DbW.A1O(str2, 4, str4);
        this.A03 = userSession;
        this.A0D = str2;
        this.A07 = str;
        this.A02 = r6;
        User A0j = DbV.A0j(userSession, str2);
        if (A0j != null) {
            this.A04 = A0j;
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A032 = ReelStore.A03(userSession);
            0qQ.A07(A032);
            Reel A0M = A032.A0M(str3);
            if (A0M != null) {
                C255773uh r3 = null;
                Iterator it = A0M.A0O(userSession).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C255773uh r1 = (C255773uh) it.next();
                    if (str4.equals(r1.A0j)) {
                        r3 = r1;
                        break;
                    }
                }
                this.A0B = str8;
                this.A08 = str6;
                if (r3 != null) {
                    this.A01 = r3;
                    1Xj r12 = r3.A0b;
                    r12.getClass();
                    this.A00 = r12;
                    this.A0E = z;
                    this.A0C = str5;
                    r12.getId();
                    User A2A = r12.A2A(this.A03);
                    if (A2A != null) {
                        A2A.getId();
                        this.A09 = str7;
                        this.A0A = str9;
                        this.A05 = str10;
                        this.A06 = str11;
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void CMO(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        Context context;
        int i;
        int i2;
        C51973G9u.A1E(viewStub, viewStub2, viewStub3);
        View A0H = JTP.A0H(viewStub, R.layout.fragment_direct_reply_modal_gradient_spinner_circular_profile);
        0qQ.A0C(A0H, "null cannot be cast to non-null type com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView");
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) A0H;
        ImageUrl Bh3 = this.A04.Bh3();
        AnonymousClass0iw r3 = this.A02;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r3, Bh3);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        if (this.A0E) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable(C70899OQr.A00(AnonymousClass7TE.A0S(gradientSpinnerAvatarView)));
        } else {
            String str = this.A05;
            if (str != null) {
                context = AnonymousClass7TE.A0S(gradientSpinnerAvatarView);
                UserSession userSession = this.A03;
                gradientSpinnerAvatarView.setBottomBadgeDrawable(C320996tP.A02(context, userSession, str, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width), AnonymousClass7TF.A02(context, R.dimen.account_group_management_clickable_width), C63282KuR.A00(userSession)));
                i = R.dimen.abc_edit_text_inset_top_material;
                i2 = R.dimen.ai_agent_share_profile_sticker_padding;
            } else {
                String str2 = this.A06;
                if (str2 != null) {
                    Spannable spannable = C306386Ly.A0d;
                    context = gradientSpinnerAvatarView.getContext();
                    0qQ.A07(context);
                    C306386Ly r1 = new C306386Ly(context, context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
                    r1.A0M(str2);
                    r1.A0A((float) AnonymousClass7TF.A02(context, R.dimen.abc_dialog_padding_top_material));
                    gradientSpinnerAvatarView.setBottomBadgeDrawable(r1);
                    i = R.dimen.add_account_icon_circle_radius;
                    i2 = R.dimen.album_preview_add_item_margin;
                } else {
                    gradientSpinnerAvatarView.setBottomBadgeDrawable((Drawable) null);
                }
            }
            gradientSpinnerAvatarView.A0C(context, i, i2);
        }
        viewStub2.setLayoutResource(R.layout.fragment_direct_reply_modal_subtitle);
        String str3 = this.A0C;
        if (str3 != null) {
            View inflate = viewStub2.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
            ((TextView) inflate).setText(str3);
        }
        UserSession userSession2 = this.A03;
        String str4 = this.A07;
        1Xj r0 = this.A00;
        String A30 = r0.A30();
        if (A30 == null) {
            A30 = "";
        }
        String name = r0.BR7().name();
        0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r3, userSession2, name, 4), "ig_direct_modal_composer_open");
        DbS.A1N(A0e, str4);
        A0e.AAJ("media_type", name);
        C51969G9p.A1A(A0e, r3);
        A0e.AAJ("media_id", A30);
        A0e.Cgf();
    }

    public final /* synthetic */ void DBt(C317486nL r1) {
    }

    public final User CD0() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A03, 36314816071076662L) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EMw(X.AnonymousClass2Ep r19, X.2Dm r20, com.instagram.model.direct.DirectShareTarget r21, java.lang.String r22, boolean r23) {
        /*
            r18 = this;
            r7 = r19
            r8 = r22
            X.DbY.A1S(r8, r7)
            r5 = r18
            java.lang.String r3 = r5.A08
            if (r3 == 0) goto L_0x0027
            java.lang.String r0 = r5.A0A
            com.instagram.reels.question.model.responsetype.QuestionResponseType r1 = X.C369268u8.A00(r0)
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = com.instagram.reels.question.model.responsetype.QuestionResponseType.MUSIC
            if (r1 == r0) goto L_0x0027
            com.instagram.common.session.UserSession r4 = r5.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314816071076662(0x81042200000b36, double:3.028974139151566E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            java.util.List r0 = r7.BRZ()
            java.util.ArrayList r6 = X.AnonymousClass48M.A01(r0)
            r9 = 4
            X.Iw9 r4 = new X.Iw9
            r10 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r4)
            com.instagram.common.session.UserSession r4 = r5.A03
            if (r1 == 0) goto L_0x0081
            java.lang.Object r2 = r0.getValue()
            X.N3f r2 = (X.C68165N3f) r2
            java.lang.String r0 = r5.A0A
            r2.A0C = r0
            java.lang.String r1 = r5.A0D
            java.lang.String r0 = r5.A0B
            r2.A0A = r3
            r2.A08 = r1
            r2.A09 = r0
            java.lang.String r0 = r5.A09
            r2.A0B = r0
            X.9bk r2 = r2.A00()
            java.lang.String r1 = r5.A07
            com.instagram.model.direct.DirectShareTarget r0 = r2.A01
            X.7Z7 r0 = X.OXC.A01(r4, r0)
            r0.EMm(r2, r1)
        L_0x0067:
            X.0iw r3 = r5.A02
            java.lang.String r2 = r5.A07
            X.1Xj r0 = r5.A00
            java.lang.String r1 = r0.A30()
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = ""
        L_0x0075:
            X.1iA r0 = r0.BR7()
            java.lang.String r0 = r0.name()
            X.C3265677h.A0L(r3, r4, r2, r1, r0)
            return
        L_0x0081:
            X.7Zi r11 = X.C333527Zh.A00(r4)
            com.instagram.model.direct.DirectThreadKey r13 = r7.BJy()
            r12 = 0
            java.lang.String r15 = "none"
            r14 = r8
            r16 = r12
            r17 = r10
            r11.EMr(r12, r13, r14, r15, r16, r17)
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P1Q.EMw(X.2Ep, X.2Dm, com.instagram.model.direct.DirectShareTarget, java.lang.String, boolean):void");
    }
}
