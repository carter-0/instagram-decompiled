package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MsP  reason: case insensitive filesystem */
public final class C67687MsP extends BaseAdapter {
    public OFS A00;
    public AnonymousClass3UH A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C229992ok A07;
    public final Runnable A08;
    public final 1Ng A09;

    public final long getItemId(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public static final void A00(SuggestedUsersStyle suggestedUsersStyle, OCP ocp, int i, int i2) {
        View view = ocp.A00;
        SuggestedUsersStyle suggestedUsersStyle2 = SuggestedUsersStyle.WITH_CONTENT_THUMBNAIL;
        int i3 = R.drawable.ui_drop_shadow_rounded_corner;
        if (suggestedUsersStyle == suggestedUsersStyle2) {
            i3 = R.drawable.suggested_user_card_drop_shadow;
        }
        Drawable drawable = view.getContext().getDrawable(i3);
        Rect A0W = AnonymousClass7TE.A0W();
        if (drawable != null) {
            drawable.getPadding(A0W);
        }
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(view);
        int i4 = A0W.left;
        int i5 = A0W.right;
        A0G.width = i + i4 + i5;
        int i6 = A0W.top;
        int i7 = A0W.bottom;
        A0G.height = i2 + i6 + i7;
        A0G.topMargin = (int) (((float) (i7 - i6)) / 2.0f);
        A0G.setMarginStart(Math.round(((float) (i5 - i4)) / 2.0f));
        view.setLayoutParams(A0G);
        view.setBackground(drawable);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    public static final void A01(C67687MsP msP, int i) {
        AnonymousClass343 r0;
        List list;
        AnonymousClass3UH r1 = msP.A01;
        if (!(r1 == null || ((list = r1.A0P) == null && (list = r1.A0M) == null))) {
            list.remove(i);
        }
        OFS ofs = msP.A00;
        if (!(ofs == null || (r0 = ofs.A03) == null)) {
            r0.A01();
        }
        if (msP.getCount() == 0) {
            msP.A09.A00(new Object());
        } else {
            0fE.A00(msP, 388110832);
        }
    }

    public final int getCount() {
        AnonymousClass3UH r1 = this.A01;
        if (r1 == null) {
            return 0;
        }
        List list = r1.A0P;
        if (list == null) {
            list = r1.A0M;
        }
        return C51971G9r.A0H(list);
    }

    public final Object getItem(int i) {
        int i2;
        List list;
        AnonymousClass3UH r2 = this.A01;
        if (r2 == null) {
            return null;
        }
        if (r2.A0P != null) {
            return r2.A02(i);
        }
        List list2 = r2.A0M;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = -1;
        }
        if (i >= i2 || i < 0 || (list = r2.A0M) == null) {
            return null;
        }
        return list.get(i);
    }

    public final int getItemViewType(int i) {
        AnonymousClass3UH r0 = this.A01;
        if (r0 == null || r0.A0P == null) {
            return 1;
        }
        Object item = getItem(i);
        0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedItem");
        AnonymousClass3UO r2 = ((AnonymousClass3UI) item).A07;
        if (r2 != null) {
            int ordinal = r2.ordinal();
            if (ordinal == 0) {
                return 1;
            }
            if (ordinal == 1 || ordinal == 2 || ordinal == 4 || ordinal == 5) {
                return 2;
            }
        }
        0wb.A03("SuggestedUsersViewPagerAdapter", AnonymousClass7TG.A0m(r2, "Unhandled item view type: ", AnonymousClass7TE.A1A()));
        return -1;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025a, code lost:
        if (r1 == null) goto L_0x025c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r10 = r20
            r9 = 2
            r3 = r21
            X.0qQ.A0B(r3, r9)
            r11 = r19
            r13 = r18
            int r1 = r13.getItemViewType(r11)
            r16 = 1
            r0 = r16
            if (r1 == r0) goto L_0x01fd
            if (r1 == r9) goto L_0x0029
            java.lang.String r1 = "Unhandled item view type: "
            int r0 = r13.getItemViewType(r11)
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.String r0 = "SuggestedUsersViewPagerAdapter"
            X.0wb.A03(r0, r1)
            r10 = 0
        L_0x0028:
            return r10
        L_0x0029:
            if (r20 != 0) goto L_0x0058
            android.view.LayoutInflater r1 = X.DbV.A0D(r3)
            r0 = 2131629552(0x7f0e15f0, float:1.8886428E38)
            android.view.View r10 = X.DbT.A0C(r1, r3, r0)
            X.0qQ.A0A(r10)
            X.Ncu r3 = new X.Ncu
            r3.<init>(r10)
            int r2 = r13.A03
            int r1 = r13.A02
            android.view.View r0 = r3.A01
            X.C66580MXl.A1C(r0, r2)
            X.C66580MXl.A1B(r0, r1)
            X.3UH r0 = r13.A01
            if (r0 == 0) goto L_0x01f9
            com.instagram.api.schemas.SuggestedUsersStyle r0 = X.C266964ad.A00(r0)
        L_0x0052:
            A00(r0, r3, r2, r1)
            r10.setTag(r3)
        L_0x0058:
            java.lang.Object r1 = r13.getItem(r11)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedItem"
            X.0qQ.A0C(r1, r0)
            X.3UI r1 = (X.AnonymousClass3UI) r1
            X.3UN r6 = r1.A06
            boolean r0 = r6 instanceof X.C266904aX
            if (r0 == 0) goto L_0x0028
            X.4aX r6 = (X.C266904aX) r6
            if (r6 == 0) goto L_0x0028
            java.lang.Object r5 = r10.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.SuggestedUpsellCardHolder"
            X.0qQ.A0C(r5, r0)
            X.Ncu r5 = (X.C69018Ncu) r5
            android.widget.TextView r0 = r5.A03
            r17 = r0
            X.4Zk r2 = r6.A00
            java.lang.String r1 = r2.A03
            r0.setText(r1)
            android.widget.TextView r8 = r5.A02
            java.lang.String r0 = r2.A02
            r8.setText(r0)
            com.instagram.igds.components.button.IgdsButton r7 = r5.A06
            java.lang.String r0 = r2.A01
            r7.setText((java.lang.String) r0)
            r0 = 11
            X.C71409Ok8.A01(r7, r0, r13, r6)
            android.view.View r0 = r5.A00
            r14 = 4
            X.C71404Ok3.A01(r0, r13, r11, r14)
            com.instagram.common.session.UserSession r4 = r13.A06
            X.0iw r3 = r13.A05
            android.view.View r0 = r5.A01
            android.content.Context r2 = r0.getContext()
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r5.A05
            r12.clearColorFilter()
            com.instagram.common.ui.widget.imageview.CircularImageView r13 = r5.A04
            r1 = 8
            r13.setVisibility(r1)
            X.3UO r0 = r6.C2m()
            int r15 = r0.ordinal()
            r0 = r16
            if (r15 == r0) goto L_0x01e0
            if (r15 == r9) goto L_0x01dc
            if (r15 == r14) goto L_0x01ea
            r0 = 5
            if (r15 == r0) goto L_0x01a7
            java.lang.StringBuilder r9 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unhandled suggested upsell `SuggestedItemType`: "
            r9.append(r0)
            X.3UO r0 = r6.C2m()
            r9.append(r0)
            java.lang.String r0 = ". Please fix ASAP because otherwise the icon on your upsell will be empty."
            java.lang.String r9 = X.AnonymousClass7TF.A0l(r0, r9)
            java.lang.String r0 = "SuggestedUsersViewPagerAdapter"
            X.0wb.A03(r0, r9)
        L_0x00e0:
            X.3UO r0 = r6.C2m()
            X.3UO r9 = X.AnonymousClass3UO.COMPLETE_PROFILE_UPSELL
            if (r0 != r9) goto L_0x00fa
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            int r0 = X.VFS.A00(r0)
            if (r0 != 0) goto L_0x00fa
            r12 = 2131969930(0x7f13478a, float:1.9576797E38)
            r0 = r17
            r0.setText(r12)
        L_0x00fa:
            X.3UO r0 = r6.C2m()
            if (r0 != r9) goto L_0x0110
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            int r0 = X.VFS.A00(r0)
            if (r0 != 0) goto L_0x0110
            r0 = 2131969929(0x7f134789, float:1.9576795E38)
            r8.setText(r0)
        L_0x0110:
            android.widget.TextView r12 = r5.A01
            r12.setVisibility(r1)
            X.3UO r0 = r6.C2m()
            if (r0 != r9) goto L_0x0172
            r15 = 3
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            int r0 = X.VFS.A00(r0)
            int r14 = 3 - r0
            r5 = 2131952185(0x7f130239, float:1.9540806E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r13 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.String r1 = X.DbV.A0u(r2, r1, r0, r5)
            X.0qQ.A07(r1)
            r0 = 2131952184(0x7f130238, float:1.9540804E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r2, r0)
            r0 = 2131952183(0x7f130237, float:1.9540802E38)
            java.lang.String r0 = X.DbV.A0u(r2, r1, r5, r0)
            X.0qQ.A07(r0)
            android.text.SpannableString r8 = X.C66580MXl.A0D(r0)
            int r5 = X.00l.A08(r0, r1, r13, r13)
            if (r14 < r15) goto L_0x01a3
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            int r0 = X.2Yu.A0H(r2, r0)
        L_0x015b:
            int r0 = r2.getColor(r0)
            android.text.style.ForegroundColorSpan r2 = X.C66580MXl.A0E(r0)
            int r1 = X.C51966G9m.A05(r1, r5)
            r0 = 17
            r8.setSpan(r2, r5, r1, r0)
            r12.setVisibility(r13)
            r12.setText(r8)
        L_0x0172:
            X.3UO r0 = r6.C2m()
            if (r0 != r9) goto L_0x0188
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            int r0 = X.VFS.A00(r0)
            if (r0 != 0) goto L_0x0188
            r0 = 2131961474(0x7f132682, float:1.9559646E38)
            r7.setText((int) r0)
        L_0x0188:
            X.3UO r1 = r6.C2m()
            X.3UO r0 = X.AnonymousClass3UO.CI_UPSELL
            if (r1 != r0) goto L_0x0028
            X.6cm r5 = new X.6cm
            r5.<init>(r3, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = "empty_feed_timeline"
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r5.A01(r0, r2, r1)
            return r10
        L_0x01a3:
            r0 = 2131099673(0x7f060019, float:1.7811706E38)
            goto L_0x015b
        L_0x01a7:
            X.0eE r9 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r9.A01(r4)
            int r0 = X.VFS.A00(r0)
            if (r0 != 0) goto L_0x01cf
            r0 = 0
            r13.setVisibility(r0)
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbX.A12(r2, r13, r0)
        L_0x01c1:
            com.instagram.user.model.User r0 = r9.A01(r4)
            boolean r0 = r0.A1n()
            if (r0 == 0) goto L_0x01d3
            r0 = 2131238365(0x7f081ddd, float:1.8093007E38)
            goto L_0x01ed
        L_0x01cf:
            r13.setVisibility(r1)
            goto L_0x01c1
        L_0x01d3:
            com.instagram.user.model.User r0 = r9.A01(r4)
            X.DbU.A1S(r3, r12, r0)
            goto L_0x00e0
        L_0x01dc:
            r0 = 2131231457(0x7f0802e1, float:1.8078996E38)
            goto L_0x01ed
        L_0x01e0:
            r0 = 2131231789(0x7f08042d, float:1.8079669E38)
            X.DbU.A13(r2, r12, r0)
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
            goto L_0x01f4
        L_0x01ea:
            r0 = 2131231743(0x7f0803ff, float:1.8079576E38)
        L_0x01ed:
            X.DbU.A13(r2, r12, r0)
            int r0 = X.2Yu.A0B(r2)
        L_0x01f4:
            X.DbX.A12(r2, r12, r0)
            goto L_0x00e0
        L_0x01f9:
            com.instagram.api.schemas.SuggestedUsersStyle r0 = com.instagram.api.schemas.SuggestedUsersStyle.NO_CONTENT_THUMBNAIL
            goto L_0x0052
        L_0x01fd:
            r17 = 0
            r15 = 0
            if (r20 != 0) goto L_0x0253
            X.3UH r0 = r13.A01
            if (r0 == 0) goto L_0x038d
            com.instagram.api.schemas.SuggestedUsersStyle r1 = X.C266964ad.A00(r0)
        L_0x020a:
            com.instagram.api.schemas.SuggestedUsersStyle r0 = com.instagram.api.schemas.SuggestedUsersStyle.EMBEDDED_WITH_CONTENT_THUMBNAIL
            r2 = 2132018211(0x7f140423, float:1.9674722E38)
            if (r1 != r0) goto L_0x0214
            r2 = 2132018210(0x7f140422, float:1.967472E38)
        L_0x0214:
            android.content.Context r1 = r13.A04
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r1, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131629553(0x7f0e15f1, float:1.888643E38)
            android.view.View r10 = X.DbU.A0A(r1, r3, r0, r15)
            X.Ncv r3 = new X.Ncv
            r3.<init>(r10)
            int r2 = r13.A03
            int r1 = r13.A02
            android.view.View r0 = r3.A01
            X.C66580MXl.A1C(r0, r2)
            X.C66580MXl.A1B(r0, r1)
            X.3UH r0 = r13.A01
            if (r0 == 0) goto L_0x0389
            com.instagram.api.schemas.SuggestedUsersStyle r0 = X.C266964ad.A00(r0)
        L_0x023f:
            A00(r0, r3, r2, r1)
            com.instagram.user.follow.FollowButton r0 = r3.A0A
            android.view.View r1 = X.JTR.A0U(r0)
            X.PZQ r0 = new X.PZQ
            r0.<init>(r1, r3)
            r1.post(r0)
            r10.setTag(r3)
        L_0x0253:
            X.3UH r0 = r13.A01
            if (r0 == 0) goto L_0x025c
            java.util.List r1 = r0.A0P
            r0 = 1
            if (r1 != 0) goto L_0x025d
        L_0x025c:
            r0 = 0
        L_0x025d:
            java.lang.Object r14 = r13.getItem(r11)
            if (r0 == 0) goto L_0x0380
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedItem"
            X.0qQ.A0C(r14, r0)
            X.3UI r14 = (X.AnonymousClass3UI) r14
            X.3UL r14 = r14.A00()
        L_0x026e:
            java.lang.Object r12 = r10.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.SuggestedUserCardHolder"
            X.0qQ.A0C(r12, r0)
            X.Ncv r12 = (X.Ncv) r12
            if (r14 == 0) goto L_0x0028
            com.instagram.user.model.User r9 = r14.A03
            if (r9 == 0) goto L_0x0028
            android.view.View r3 = r12.A00
            r1 = 3
            X.Oit r0 = new X.Oit
            r0.<init>(r11, r1, r14, r13)
            X.AnonymousClass0fU.A00(r0, r3)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r12.A09
            com.instagram.common.typedurl.ImageUrl r0 = r9.Bh3()
            X.0iw r8 = r13.A05
            r1.setUrl(r0, r8)
            android.widget.TextView r4 = r12.A08
            boolean r0 = r9.isVerified()
            X.C244273av.A0B(r4, r0)
            android.view.View r2 = r12.A01
            r1 = 4
            X.Oit r0 = new X.Oit
            r0.<init>(r11, r1, r14, r13)
            X.AnonymousClass0fU.A00(r0, r2)
            X.DbU.A1H(r4, r9)
            android.widget.TextView r1 = r12.A06
            java.lang.String r0 = r9.getFullName()
            if (r0 == 0) goto L_0x037a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x037a
            java.lang.String r0 = r9.getFullName()
        L_0x02be:
            r1.setText(r0)
            android.content.Context r7 = r3.getContext()
            com.instagram.user.model.User r0 = r14.A03
            java.lang.Integer r0 = r0.A0N()
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r1 = 8
            r5 = 0
            if (r0 != r6) goto L_0x0308
            android.view.ViewGroup r0 = r12.A03
            r0.setVisibility(r1)
            android.view.View r0 = r12.A02
            r0.setVisibility(r15)
            android.widget.ImageView r1 = r12.A04
            r0 = 2131238514(0x7f081e72, float:1.8093309E38)
            X.DbU.A13(r7, r1, r0)
            android.widget.TextView r1 = r12.A07
            r0 = 2131975273(0x7f135c69, float:1.9587634E38)
        L_0x02e9:
            X.DbT.A18(r7, r1, r0)
        L_0x02ec:
            android.widget.TextView r1 = r12.A05
            java.lang.String r0 = r14.A05
            r1.setText(r0)
            com.instagram.user.follow.FollowButton r0 = r12.A0A
            r0.setVisibility(r15)
            X.4at r1 = r0.A0J
            X.NhN r0 = new X.NhN
            r0.<init>(r13, r14, r11)
            r1.A07(r0)
            com.instagram.common.session.UserSession r0 = r13.A06
            r1.A03(r8, r0, r9)
            return r10
        L_0x0308:
            java.util.List r4 = r14.A09
            if (r4 == 0) goto L_0x0361
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0361
            android.view.ViewGroup r3 = r12.A03
            r3.setVisibility(r15)
            android.view.View r0 = r12.A02
            r0.setVisibility(r1)
            int r16 = r4.size()
            int r2 = r3.getChildCount()
        L_0x0324:
            if (r5 >= r2) goto L_0x02ec
            android.view.View r1 = r3.getChildAt(r5)
            r0 = 10
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = r16
            if (r5 >= r0) goto L_0x0351
            java.lang.Object r0 = r4.get(r5)
            X.1Xj r0 = (X.1Xj) r0
            com.instagram.model.mediasize.ImageInfo r0 = r0.A1p()
            if (r0 == 0) goto L_0x034e
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A04(r0, r6)
            if (r0 == 0) goto L_0x034e
            r1.setUrl(r0, r8)
        L_0x034e:
            int r5 = r5 + 1
            goto L_0x0324
        L_0x0351:
            r0 = r17
            r1.setImageDrawable(r0)
            r0 = 2130968707(0x7f040083, float:1.7546075E38)
            int r0 = X.2Yu.A0H(r7, r0)
            X.DbT.A16(r7, r1, r0)
            goto L_0x034e
        L_0x0361:
            android.view.ViewGroup r0 = r12.A03
            r0.setVisibility(r1)
            android.view.View r0 = r12.A02
            r0.setVisibility(r15)
            android.widget.ImageView r1 = r12.A04
            r0 = 2131238040(0x7f081c98, float:1.8092347E38)
            X.DbU.A13(r7, r1, r0)
            android.widget.TextView r1 = r12.A07
            r0 = 2131968404(0x7f134194, float:1.9573702E38)
            goto L_0x02e9
        L_0x037a:
            java.lang.String r0 = r9.getUsername()
            goto L_0x02be
        L_0x0380:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.user.recommended.RecommendedUser"
            X.0qQ.A0C(r14, r0)
            X.3UL r14 = (X.AnonymousClass3UL) r14
            goto L_0x026e
        L_0x0389:
            com.instagram.api.schemas.SuggestedUsersStyle r0 = com.instagram.api.schemas.SuggestedUsersStyle.NO_CONTENT_THUMBNAIL
            goto L_0x023f
        L_0x038d:
            r1 = r17
            goto L_0x020a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67687MsP.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C67687MsP(Context context, UserSession userSession, C229992ok r4, Runnable runnable, int i, int i2) {
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = r4;
        this.A03 = i;
        this.A02 = i2;
        this.A08 = runnable;
        this.A09 = AnonymousClass1Nd.A00(userSession);
        this.A05 = r4.AbT();
    }
}
