package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PAy  reason: case insensitive filesystem */
public final class C72567PAy implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7DZ A02;
    public final C72492P8b A03;

    /* renamed from: A00 */
    public final void FIP(C72578PBj pBj) {
        AnonymousClass7L3 r1;
        this.A02.A01(pBj);
        C72492P8b p8b = this.A03;
        if (p8b != null) {
            if (!182.A06(0Tu.A05, p8b.A00, 2342159139545288697L) && (r1 = (AnonymousClass7L3) p8b.A04.get(pBj)) != null) {
                r1.A03("scroll");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0149, code lost:
        if (r12 != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r0 == false) goto L_0x024e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0246  */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADp(X.C72578PBj r25, X.C328697Fu r26) {
        /*
            r24 = this;
            r6 = r25
            android.widget.FrameLayout r14 = r6.A05
            android.content.Context r13 = r14.getContext()
            r7 = r24
            X.P8b r8 = r7.A03
            r5 = r26
            X.7FE r0 = r5.A05
            X.JwM r4 = r5.A03
            X.3Us r0 = X.C71049OaR.A00(r0, r6)
            if (r0 == 0) goto L_0x0051
            float[] r9 = r0.A01
            r10 = 1
            if (r4 == 0) goto L_0x024e
            java.lang.Object r0 = r4.A02
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            boolean r2 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.Object r0 = r4.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.Object r0 = r4.A01
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r2 != 0) goto L_0x0047
            if (r1 != 0) goto L_0x0047
            if (r0 == 0) goto L_0x024e
        L_0x0047:
            r3 = 0
            if (r10 == 0) goto L_0x0246
            r2 = 0
            r1 = 0
        L_0x004c:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r6.A0K
            r0.A01(r3, r3, r2, r1)
        L_0x0051:
            X.9Iu r3 = r5.A02
            com.instagram.common.session.UserSession r2 = r7.A01
            X.0iw r10 = r7.A00
            X.C71049OaR.A01(r3, r10, r2, r6)
            X.Nop r1 = r5.A07
            X.0eM r0 = r5.A0F
            java.lang.Object r0 = r0.getValue()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r0
            boolean r21 = X.AnonymousClass7TF.A1V(r3)
            r15 = r10
            r16 = r2
            r17 = r6
            r18 = r8
            r19 = r1
            r20 = r0
            X.C71049OaR.A02(r15, r16, r17, r18, r19, r20, r21)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r1 = r6.A0K
            float r0 = r5.A00
            r1.A00 = r0
            com.instagram.feed.widget.IgProgressImageView r8 = r6.A0I
            r8.setAspectRatio(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r8.setScaleType(r0)
            java.lang.Integer r2 = r5.A0B
            if (r2 == 0) goto L_0x023f
            X.2eb r1 = r6.A0E
            r0 = 0
            r1.A03(r0)
            android.view.View r1 = r1.A01()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r2.intValue()
            r1.setImageResource(r0)
        L_0x009d:
            X.Nor r3 = r5.A09
            boolean r0 = r3 instanceof X.C68869Na1
            if (r0 == 0) goto L_0x010d
            X.Na1 r3 = (X.C68869Na1) r3
            X.Noo r12 = r5.A06
            boolean r0 = r12 instanceof X.C68861NZt
            r19 = 0
            if (r0 == 0) goto L_0x023b
            r9 = r12
            X.NZt r9 = (X.C68861NZt) r9
        L_0x00b0:
            com.instagram.model.hashtag.Hashtag r11 = r5.A0A
            r2 = 8
            r1 = 0
            if (r11 == 0) goto L_0x01bb
            android.view.View r0 = r6.A03
            r0.setVisibility(r1)
            X.2eb r0 = r6.A0F
            r0.A03(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A0C
            X.C18767W0m.A03(r10, r0, r11)
            X.2eb r10 = r6.A0D
            r10.A03(r1)
            android.view.View r9 = r10.A01()
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r9 = (com.instagram.reels.ui.badge.ReelBrandingBadgeView) r9
            X.3Nl r0 = X.C240993Nl.HASHTAG
            r9.A03(r0)
            android.view.View r9 = r10.A01()
            com.instagram.ui.widget.badgeicon.BadgeIconView r9 = (com.instagram.ui.widget.badgeicon.BadgeIconView) r9
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.setBorderWidth(r0)
        L_0x00e1:
            android.widget.TextView r10 = r6.A0B
            int r0 = r3.A01
            r10.setTextColor(r0)
            java.lang.CharSequence r0 = r3.A04
            r10.setText(r0)
            android.graphics.Typeface r9 = r10.getTypeface()
            int r0 = r3.A02
            r10.setTypeface(r9, r0)
            java.lang.CharSequence r9 = r3.A03
            if (r9 == 0) goto L_0x01b4
            android.widget.TextView r2 = r6.A0A
            r2.setVisibility(r1)
            int r0 = r3.A00
            r2.setTextColor(r0)
            r2.setText(r9)
        L_0x0107:
            android.view.View r1 = r6.A04
            r0 = 0
            r1.setVisibility(r0)
        L_0x010d:
            if (r4 == 0) goto L_0x019f
            java.lang.Object r2 = r4.A02
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r16 = r0 ^ 1
            java.lang.Object r11 = r4.A00
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r15 = r0 ^ 1
            java.lang.Object r10 = r4.A01
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r12 = r0 ^ 1
            if (r16 != 0) goto L_0x0133
            if (r15 != 0) goto L_0x0133
            if (r12 == 0) goto L_0x019f
        L_0x0133:
            int r9 = X.AnonymousClass7TG.A02(r13)
            int r4 = X.C51972G9s.A08(r13)
            r3 = 0
            android.widget.TextView r1 = r6.A09
            if (r16 == 0) goto L_0x0199
            r1.setText(r2)
            r1.setVisibility(r3)
            if (r15 != 0) goto L_0x014b
            r0 = r4
            if (r12 == 0) goto L_0x014c
        L_0x014b:
            r0 = 0
        L_0x014c:
            r1.setPadding(r9, r4, r9, r0)
        L_0x014f:
            if (r15 == 0) goto L_0x0164
            android.widget.TextView r2 = r6.A07
            r2.setText(r11)
            r2.setVisibility(r3)
            r1 = r4
            if (r16 == 0) goto L_0x015d
            r1 = 0
        L_0x015d:
            r0 = r4
            if (r12 == 0) goto L_0x0161
            r0 = 0
        L_0x0161:
            r2.setPadding(r9, r1, r9, r0)
        L_0x0164:
            if (r12 == 0) goto L_0x0176
            android.widget.TextView r0 = r6.A08
            r0.setText(r10)
            r0.setVisibility(r3)
            if (r16 != 0) goto L_0x0173
            if (r15 != 0) goto L_0x0173
            r3 = r4
        L_0x0173:
            r0.setPadding(r9, r3, r9, r4)
        L_0x0176:
            r0 = 2131231216(0x7f0801f0, float:1.8078507E38)
        L_0x0179:
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            r8.setForeground(r0)
            android.content.res.Resources r2 = r13.getResources()
            r1 = 2131976347(0x7f13609b, float:1.9589812E38)
            java.lang.String r0 = r5.A0E
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r14.setContentDescription(r0)
            X.AnonymousClass7PV.A02(r14)
            X.7DZ r0 = r7.A02
            r0.A02(r6, r5)
            return
        L_0x0199:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x014f
        L_0x019f:
            android.widget.TextView r0 = r6.A09
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.A07
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.A08
            r0.setVisibility(r1)
            r0 = 2131231215(0x7f0801ef, float:1.8078505E38)
            goto L_0x0179
        L_0x01b4:
            android.widget.TextView r0 = r6.A0A
            r0.setVisibility(r2)
            goto L_0x0107
        L_0x01bb:
            if (r9 == 0) goto L_0x0215
            java.util.List r11 = r9.A04
            if (r11 == 0) goto L_0x0215
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0215
            android.view.View r12 = r6.A03
            r12.setVisibility(r2)
            X.2eb r0 = r6.A0F
            r0.A03(r1)
            android.content.Context r15 = r12.getContext()
            android.view.View r0 = r0.A01()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r20 = r10.getModuleName()
            android.content.res.Resources r12 = r15.getResources()
            r10 = 2131165266(0x7f070052, float:1.7944744E38)
            int r22 = r12.getDimensionPixelSize(r10)
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            boolean r9 = r9.A05
            r10 = 1058642330(0x3f19999a, float:0.6)
            if (r9 == 0) goto L_0x01f5
            r10 = 1056964608(0x3f000000, float:0.5)
        L_0x01f5:
            java.lang.Float r16 = java.lang.Float.valueOf(r10)
            r18 = 0
            if (r9 == 0) goto L_0x0208
            android.content.res.Resources r10 = r15.getResources()
            r9 = 2131165302(0x7f070076, float:1.7944817E38)
            java.lang.Integer r19 = X.JTP.A0k(r10, r9)
        L_0x0208:
            r21 = r11
            r23 = r1
            X.3b0 r9 = X.C244283aw.A05(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.setImageDrawable(r9)
            goto L_0x00e1
        L_0x0215:
            android.view.View r0 = r6.A03
            r0.setVisibility(r1)
            X.2eb r0 = r6.A0F
            r0.A03(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r6.A0C
            r9.setPadding(r1, r1, r1, r1)
            X.2eb r0 = r6.A0D
            r0.A03(r2)
            if (r12 == 0) goto L_0x0236
            X.NZt r12 = (X.C68861NZt) r12
            com.instagram.common.typedurl.ImageUrl r0 = r12.A00
            if (r0 == 0) goto L_0x0236
            r9.setUrl(r0, r10)
            goto L_0x00e1
        L_0x0236:
            r9.A09()
            goto L_0x00e1
        L_0x023b:
            r9 = r19
            goto L_0x00b0
        L_0x023f:
            X.2eb r0 = r6.A0E
            r0.A02()
            goto L_0x009d
        L_0x0246:
            r0 = 4
            r2 = r9[r0]
            r0 = 6
            r1 = r9[r0]
            goto L_0x004c
        L_0x024e:
            r10 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72567PAy.ADp(X.PBj, X.7Fu):void");
    }

    public C72567PAy(AnonymousClass0iw r2, UserSession userSession, C72492P8b p8b, List list) {
        this.A00 = r2;
        this.A01 = userSession;
        this.A03 = p8b;
        this.A02 = new AnonymousClass7DZ(list);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C72578PBj pBj = new C72578PBj(DbT.A0C(layoutInflater, viewGroup, R.layout.direct_media_share_message));
        this.A02.A00(pBj);
        return pBj;
    }
}
