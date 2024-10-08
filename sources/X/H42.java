package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public final class H42 extends C231632rz {
    public C55786HnL A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C54177H1x A04;
    public final boolean A05;
    public final boolean A06;

    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x051d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r42, android.view.View r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            r41 = this;
            r21 = r45
            r20 = r44
            r0 = -1357595063(0xffffffffaf14be49, float:-1.3528124E-10)
            int r18 = X.AnonymousClass0fD.A03(r0)
            r2 = r43
            r0 = r20
            X.AnonymousClass7TG.A1O(r2, r0)
            r19 = 3
            r1 = r21
            r0 = r19
            X.0qQ.A0B(r1, r0)
            r1 = r41
            android.content.Context r3 = r1.A01
            X.0iw r13 = r1.A02
            com.instagram.common.session.UserSession r4 = r1.A03
            java.lang.Object r12 = r2.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.save.adapter.home.SavedCollectionGridRowViewBinder.Holder"
            X.0qQ.A0C(r12, r0)
            X.Hj1 r12 = (X.C55519Hj1) r12
            r0 = r20
            X.71g r0 = (X.C3251571g) r0
            r20 = r0
            X.H1x r0 = r1.A04
            r40 = r0
            r0 = r21
            X.HlB r0 = (X.C55652HlB) r0
            r21 = r0
            boolean r0 = r1.A06
            r22 = r0
            boolean r0 = r1.A05
            r23 = r0
            X.HnL r11 = r1.A00
            r2 = 0
            boolean r25 = X.AnonymousClass7TF.A1U(r2, r3, r13)
            r24 = 2
            r0 = r24
            X.0qQ.A0B(r4, r0)
            r6 = r19
            r5 = r20
            r1 = r40
            r0 = r21
            X.C51974G9v.A0d(r6, r12, r5, r1, r0)
            int r0 = X.AnonymousClass7TG.A02(r3)
            int r1 = r0 * 2
            int r1 = r1 + r0
            int r0 = X.AnonymousClass0nB.A01(r3)
            int r0 = r0 - r1
            int r0 = r0 / 2
            r39 = r0
            int r26 = r20.A01()
            r5 = 0
        L_0x0074:
            r0 = r26
            if (r5 >= r0) goto L_0x0572
            X.Hoy[] r0 = r12.A00
            r1 = r0[r5]
            if (r1 == 0) goto L_0x026a
            r1 = r0[r5]
            if (r1 == 0) goto L_0x056d
            android.view.ViewGroup r9 = r1.A04
            android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r8, r0)
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            r0 = r39
            r8.width = r0
            r0 = -2
            r8.height = r0
            r0 = r21
            java.lang.Integer r14 = r0.A01
            int r10 = X.AnonymousClass7TG.A02(r3)
            android.content.res.Resources r6 = r3.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r7 = r6.getDimensionPixelSize(r0)
            r8.setMarginStart(r10)
            int r6 = r14.intValue()
            r0 = r24
            if (r6 == r0) goto L_0x050f
            int r0 = X.DbY.A01(r3)
            r8.bottomMargin = r0
        L_0x00bd:
            r9.setLayoutParams(r8)
            com.instagram.ui.widget.thumbnailview.ThumbnailView r10 = r1.A09
            r6 = r39
            X.0nA.A0g(r10, r6, r6)
            r0 = r20
            java.lang.Object r0 = r0.A02(r5)
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            r6 = r21
            int r6 = r6.A00
            r37 = r6
            r16 = 4
            r6 = r16
            X.0qQ.A0B(r0, r6)
            android.view.ViewGroup r7 = r1.A04
            r7.setVisibility(r2)
            X.HMw r8 = r0.A07
            X.HMw r6 = X.C54665HMw.SAVED_ENTRYPOINT_COLLECTION
            if (r8 != r6) goto L_0x04fd
            boolean r6 = X.I31.A01(r4)
            if (r6 == 0) goto L_0x04fd
            if (r22 == 0) goto L_0x04fd
            android.widget.TextView r8 = r1.A06
            r9 = 2131970945(0x7f134b81, float:1.9578855E38)
            X.DbT.A18(r3, r8, r9)
            android.widget.ImageView r6 = r1.A05
            r6.setVisibility(r2)
            java.lang.String r6 = r3.getString(r9)
        L_0x0100:
            r7.setContentDescription(r6)
            X.HMw r6 = r0.A07
            int r9 = r6.ordinal()
            r6 = 0
            java.lang.String r17 = "Required value was null."
            switch(r9) {
                case 0: goto L_0x04f2;
                case 1: goto L_0x04c1;
                case 2: goto L_0x010f;
                case 3: goto L_0x010f;
                case 4: goto L_0x04a3;
                case 5: goto L_0x042b;
                case 6: goto L_0x0490;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04f2;
                default: goto L_0x010f;
            }
        L_0x010f:
            X.1Xj r9 = r0.A04
            if (r9 == 0) goto L_0x0409
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r9.A1n(r3)
            if (r9 == 0) goto L_0x0409
            X.1Xj r14 = r0.A04
            if (r14 == 0) goto L_0x0563
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r14.A1n(r3)
            if (r9 == 0) goto L_0x0563
            r10.setSingleImageFromMedia(r14, r9, r13)
        L_0x0126:
            java.lang.String r14 = r0.A0F
            java.lang.String r9 = "my_favs"
            boolean r9 = X.0qQ.A0K(r14, r9)
            if (r9 != 0) goto L_0x013a
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            java.lang.Boolean r9 = r0.A0A
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x014b
        L_0x013a:
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r3)
            r9 = 2131627115(0x7f0e0c6b, float:1.8881485E38)
            android.view.View r9 = r14.inflate(r9, r6)
            X.0qQ.A07(r9)
            r10.setCustomView(r9)
        L_0x014b:
            X.3oV r15 = r1.A08
            r14 = 0
            r15.setVisibility(r2)
            X.HMw r9 = r0.A07
            int r10 = r9.ordinal()
            r9 = 7
            if (r10 == r9) goto L_0x03f1
            r9 = r25
            if (r10 == r9) goto L_0x03e7
            r9 = r16
            if (r10 == r9) goto L_0x03fb
            r9 = 5
            if (r10 == r9) goto L_0x03dd
            r9 = 8
            r15.setVisibility(r9)
        L_0x016a:
            android.view.ViewGroup$MarginLayoutParams r10 = X.DbX.A0G(r8)
            int r9 = r15.CFV()
            if (r9 != 0) goto L_0x017f
            android.content.res.Resources r14 = r3.getResources()
            r9 = 2131165217(0x7f070021, float:1.7944645E38)
            int r14 = r14.getDimensionPixelSize(r9)
        L_0x017f:
            r10.setMarginStart(r14)
            r8.setLayoutParams(r10)
            boolean r8 = X.I56.A02(r4)
            r16 = 8
            if (r8 != 0) goto L_0x01a9
            boolean r8 = X.I31.A01(r4)
            if (r8 == 0) goto L_0x019b
            java.lang.String r8 = r4.A06
            boolean r8 = r0.A07(r8)
            if (r8 != 0) goto L_0x01a9
        L_0x019b:
            boolean r8 = X.I31.A00(r4)
            if (r8 == 0) goto L_0x03d4
            java.lang.String r8 = r4.A06
            boolean r8 = r0.A07(r8)
            if (r8 != 0) goto L_0x03d4
        L_0x01a9:
            X.3oV r8 = r1.A07
            r36 = r8
            r8.setVisibility(r2)
            com.instagram.save.model.CollaborativeCollectionMetadata r10 = r0.A05
            if (r10 == 0) goto L_0x026e
            com.instagram.common.ui.widget.imageview.IgImageView r14 = r1.A01
            if (r14 == 0) goto L_0x0518
            java.lang.String r15 = r13.getModuleName()
            java.util.List r9 = r10.A02
            int r8 = r1.A02
            android.graphics.drawable.Drawable r8 = X.C244283aw.A02(r3, r15, r9, r8)
            r14.setImageDrawable(r8)
            com.instagram.common.ui.base.IgTextView r9 = r1.A00
            if (r9 == 0) goto L_0x0513
            java.lang.String r8 = r10.A01
            r9.setText(r8)
        L_0x01d0:
            X.HMw r9 = r0.A07
            X.HMw r8 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            if (r9 != r8) goto L_0x022d
            X.0Tu r10 = X.0Tu.A05
            r8 = 36314146056178143(0x810386000009df, double:3.028550419031809E-306)
            boolean r8 = X.182.A06(r10, r4, r8)
            if (r8 == 0) goto L_0x022d
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r9 = new java.util.BitSet
            r9.<init>(r2)
            java.lang.String r14 = ""
            java.lang.String r9 = "shopping_session_id"
            r8.put(r9, r14)
            java.lang.String r15 = r13.getModuleName()
            java.lang.String r9 = "prior_module"
            r8.put(r9, r15)
            java.lang.String r15 = r0.A0F
            java.lang.String r9 = "collection_id"
            r8.put(r9, r15)
            r9 = 769(0x301, float:1.078E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            r8.put(r9, r14)
            r14 = 36595621032954057(0x820386000108c9, double:3.2065563277536544E-306)
            long r32 = X.182.A01(r10, r4, r14)
            X.8dD r9 = new X.8dD
            r9.<init>(r4)
            java.util.HashMap r31 = X.C359608dC.A01(r8)
            r8 = 1185(0x4a1, float:1.66E-42)
            java.lang.String r29 = X.AnonymousClass000.A00(r8)
            r27 = r3
            r28 = r9
            r30 = r6
            X.C359638dF.A03(r27, r28, r29, r30, r31, r32)
        L_0x022d:
            X.FO4 r6 = new X.FO4
            r27 = r6
            r28 = r0
            r29 = r5
            r30 = r40
            r31 = r37
            r32 = r19
            r27.<init>(r28, r29, r30, r31, r32)
            X.AnonymousClass0fU.A00(r6, r7)
            r6 = 10
            X.C56815IDm.A00(r7, r6, r1)
            if (r11 == 0) goto L_0x026a
            r8 = 21
            X.Gms r6 = new X.Gms
            r1 = r37
            r6.<init>(r1, r5, r8)
            java.lang.String r1 = r0.A0F
            X.30a r9 = X.AnonymousClass30Y.A00(r0, r6, r1)
            com.instagram.common.session.UserSession r8 = r11.A01
            X.4DU r6 = r11.A03
            X.1Bk r1 = r11.A00
            X.H8Y r0 = new X.H8Y
            r0.<init>(r1, r8, r6)
            r9.A00(r0)
            X.2el r0 = r11.A02
            X.C51967G9n.A0z(r7, r9, r0)
        L_0x026a:
            int r5 = r5 + 1
            goto L_0x0074
        L_0x026e:
            X.HMw r9 = r0.A07
            X.HMw r8 = X.C54665HMw.NEW_COLLECTION
            if (r9 == r8) goto L_0x01d0
            com.instagram.user.model.User r8 = X.AnonymousClass7TF.A0Q(r4)
            java.lang.Integer r8 = r8.A0N()
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            boolean r14 = X.AnonymousClass7TF.A1W(r8, r10)
            boolean r8 = X.I31.A01(r4)
            if (r8 != 0) goto L_0x0298
            boolean r8 = X.I31.A00(r4)
            if (r8 != 0) goto L_0x0298
            com.instagram.common.ui.base.IgTextView r9 = r1.A00
            if (r9 == 0) goto L_0x055e
            r8 = 2131969768(0x7f1346e8, float:1.9576468E38)
            X.DbT.A18(r3, r9, r8)
        L_0x0298:
            boolean r8 = X.I31.A01(r4)
            if (r8 == 0) goto L_0x02b8
            java.lang.String r8 = r4.A06
            boolean r8 = r0.A07(r8)
            if (r8 == 0) goto L_0x02b8
            if (r14 == 0) goto L_0x0396
            boolean r8 = r0.A06()
            if (r8 == 0) goto L_0x0396
            com.instagram.common.ui.base.IgTextView r9 = r1.A00
            if (r9 == 0) goto L_0x054f
            r8 = 2131972629(0x7f135215, float:1.958227E38)
        L_0x02b5:
            X.DbT.A18(r3, r9, r8)
        L_0x02b8:
            boolean r8 = X.I31.A00(r4)
            if (r8 == 0) goto L_0x02e1
            java.lang.String r8 = r4.A06
            boolean r8 = r0.A07(r8)
            if (r8 != 0) goto L_0x02e1
            android.content.res.Resources r14 = r3.getResources()
            r9 = 2131820948(0x7f110194, float:1.9274625E38)
            java.lang.Integer r8 = r0.A0E
            int r8 = X.AnonymousClass7TG.A0A(r8)
            java.lang.String r9 = X.DbY.A0d(r14, r8, r9)
            X.0qQ.A07(r9)
            com.instagram.common.ui.base.IgTextView r8 = r1.A00
            if (r8 == 0) goto L_0x054a
            r8.setText(r9)
        L_0x02e1:
            if (r23 == 0) goto L_0x032d
            com.instagram.user.model.User r9 = r0.A08
            if (r9 == 0) goto L_0x032d
            com.instagram.common.ui.base.IgTextView r15 = r1.A00
            if (r15 == 0) goto L_0x02fb
            X.DbU.A1H(r15, r9)
            com.instagram.common.ui.base.IgTextView r8 = r1.A00
            if (r8 == 0) goto L_0x0545
            android.graphics.Typeface r8 = r8.getTypeface()
            r14 = r25
            r15.setTypeface(r8, r14)
        L_0x02fb:
            com.instagram.common.typedurl.ImageUrl r8 = r9.Bh3()
            java.util.List r33 = X.AnonymousClass7TE.A1I(r8)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r1.A01
            if (r8 == 0) goto L_0x0540
            java.lang.String r32 = r13.getModuleName()
            int r14 = r1.A02
            java.lang.Integer r29 = X.AnonymousClass05K.A00
            r27 = r3
            r28 = r6
            r30 = r6
            r31 = r6
            r34 = r14
            r35 = r2
            X.3b0 r14 = X.C244283aw.A05(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r8.setImageDrawable(r14)
            android.view.View r8 = r36.getView()
            r15 = 45
            r14 = r40
            X.ID2.A02(r8, r15, r14, r9)
        L_0x032d:
            java.lang.String r8 = r4.A06
            boolean r8 = r0.A07(r8)
            if (r8 == 0) goto L_0x03ac
            com.instagram.user.model.User r8 = X.AnonymousClass7TF.A0Q(r4)
            java.lang.Integer r8 = r8.A0N()
            boolean r10 = X.AnonymousClass7TF.A1W(r8, r10)
            android.util.DisplayMetrics r8 = X.AnonymousClass7TF.A0E(r3)
            float r9 = r8.density
            r8 = 1094713344(0x41400000, float:12.0)
            float r8 = r8 * r9
            int r8 = (int) r8
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r8, r8)
            r8 = 16
            r9.gravity = r8
            boolean r8 = X.I31.A01(r4)
            if (r8 == 0) goto L_0x0392
            if (r10 == 0) goto L_0x0381
            boolean r8 = r0.A06()
            if (r8 == 0) goto L_0x0381
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r1.A01
            if (r8 == 0) goto L_0x0522
            r8.setLayoutParams(r9)
            r10 = 2131238333(0x7f081dbd, float:1.8092942E38)
        L_0x036c:
            int r9 = r1.A03
            android.graphics.Paint r8 = X.AnonymousClass3JT.A00
            int r8 = r3.getColor(r9)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass3JT.A05(r3, r10, r8)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r1.A01
            if (r8 == 0) goto L_0x051d
            r8.setImageDrawable(r9)
            goto L_0x01d0
        L_0x0381:
            boolean r8 = r0.A06()
            if (r8 == 0) goto L_0x0392
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r1.A01
            if (r8 == 0) goto L_0x0527
            r8.setLayoutParams(r9)
            r10 = 2131238964(0x7f082034, float:1.8094222E38)
            goto L_0x036c
        L_0x0392:
            r10 = 2131238507(0x7f081e6b, float:1.8093295E38)
            goto L_0x036c
        L_0x0396:
            boolean r8 = r0.A06()
            com.instagram.common.ui.base.IgTextView r9 = r1.A00
            if (r8 == 0) goto L_0x03a5
            if (r9 == 0) goto L_0x0554
            r8 = 2131972618(0x7f13520a, float:1.9582249E38)
            goto L_0x02b5
        L_0x03a5:
            if (r9 == 0) goto L_0x0559
            r8 = 2131972625(0x7f135211, float:1.9582263E38)
            goto L_0x02b5
        L_0x03ac:
            if (r23 != 0) goto L_0x01d0
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r1.A01
            if (r9 == 0) goto L_0x053b
            r8 = r16
            r9.setVisibility(r8)
            com.instagram.common.ui.base.IgTextView r14 = r1.A00
            if (r14 == 0) goto L_0x0536
            int r10 = r14.getPaddingTop()
            com.instagram.common.ui.base.IgTextView r8 = r1.A00
            if (r8 == 0) goto L_0x0531
            int r9 = r8.getPaddingRight()
            com.instagram.common.ui.base.IgTextView r8 = r1.A00
            if (r8 == 0) goto L_0x052c
            int r8 = r8.getPaddingBottom()
            r14.setPadding(r2, r10, r9, r8)
            goto L_0x01d0
        L_0x03d4:
            X.3oV r9 = r1.A07
            r8 = r16
            r9.setVisibility(r8)
            goto L_0x01d0
        L_0x03dd:
            android.view.View r10 = r15.getView()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r9 = 2131238504(0x7f081e68, float:1.8093289E38)
            goto L_0x0404
        L_0x03e7:
            android.view.View r10 = r15.getView()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r9 = 2131238787(0x7f081f83, float:1.8093863E38)
            goto L_0x0404
        L_0x03f1:
            android.view.View r10 = r15.getView()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r9 = 2131238360(0x7f081dd8, float:1.8092997E38)
            goto L_0x0404
        L_0x03fb:
            android.view.View r10 = r15.getView()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r9 = 2131238579(0x7f081eb3, float:1.809344E38)
        L_0x0404:
            r10.setImageResource(r9)
            goto L_0x016a
        L_0x0409:
            com.instagram.common.typedurl.ImageUrl r9 = r0.A01
            if (r9 == 0) goto L_0x0412
            r10.setSingleImageFromUrl(r9, r13)
            goto L_0x0126
        L_0x0412:
            com.instagram.ui.widget.thumbnailview.ThumbnailView.A04(r10)
            X.2eb r9 = r10.A01
            r9.A03(r2)
            X.2eb r9 = r10.A01
            android.view.View r9 = r9.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r9 = (com.instagram.common.ui.widget.imageview.IgImageView) r9
            r9.setImageDrawable(r6)
            r9.A0E = r6
            r9.A0D = r6
            goto L_0x0126
        L_0x042b:
            X.Vuc r14 = new X.Vuc
            r14.<init>()
            r14.A0A = r2
            r14.A07 = r2
            r14.A0B = r2
            r14.A0E = r2
            r14.A09 = r2
            java.lang.String r9 = "ig_saved_places"
            r14.A06 = r9
            java.lang.String r9 = "SavedCollectionGridItemViewBinder.java"
            r14.A01(r9)
            boolean r9 = X.AnonymousClass1GD.A03()
            r14.A08 = r9
            X.U4m r9 = new X.U4m
            r9.<init>((android.content.Context) r3, (X.C18585Vuc) r14)
            r9.D6V(r6)
            r15 = 9
            X.IDm r14 = new X.IDm
            r14.<init>(r9, r15)
            r9.setOnTouchListener(r14)
            r10.setCustomView(r9)
            com.instagram.discovery.mediamap.model.MediaMapPin r14 = r0.A03
            if (r14 == 0) goto L_0x0126
            java.lang.Double r15 = r14.A0A
            X.0qQ.A07(r15)
            double r32 = r15.doubleValue()
            java.lang.Double r15 = r14.A0B
            X.0qQ.A07(r15)
            double r34 = r15.doubleValue()
            r15 = 64
            int r36 = X.DbS.A02(r3, r15)
            X.WFT r15 = new X.WFT
            r27 = r15
            r28 = r4
            r29 = r14
            r30 = r40
            r31 = r0
            r38 = r5
            r27.<init>(r28, r29, r30, r31, r32, r34, r36, r37, r38)
            r9.A0G(r15)
            goto L_0x0126
        L_0x0490:
            android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r3)
            r9 = 2131627289(0x7f0e0d19, float:1.8881838E38)
            android.view.View r9 = r14.inflate(r9, r6)
            X.0qQ.A07(r9)
            r10.setCustomView(r9)
            goto L_0x0126
        L_0x04a3:
            java.util.List r9 = r0.A0J
            if (r9 == 0) goto L_0x0568
            java.util.ArrayList r14 = X.C51970G9q.A0m(r9)
            java.util.Iterator r15 = r9.iterator()
        L_0x04af:
            boolean r9 = r15.hasNext()
            if (r9 == 0) goto L_0x04ed
            java.lang.Object r9 = r15.next()
            X.VOp r9 = (X.C17262VOp) r9
            com.instagram.common.typedurl.ImageUrl r9 = r9.A00
            r14.add(r9)
            goto L_0x04af
        L_0x04c1:
            java.util.List r9 = r0.A0M
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.util.ArrayList r14 = X.C51970G9q.A0m(r9)
            java.util.List r9 = r0.A0M
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.util.Iterator r15 = r9.iterator()
        L_0x04d5:
            boolean r9 = r15.hasNext()
            if (r9 == 0) goto L_0x04ed
            java.lang.Object r9 = r15.next()
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r9 = (com.instagram.model.shopping.productimagecontainer.ProductImageContainer) r9
            com.instagram.model.mediasize.ImageInfo r9 = r9.BGO()
            com.instagram.model.mediasize.ExtendedImageUrl r9 = X.1iI.A01(r3, r9)
            r14.add(r9)
            goto L_0x04d5
        L_0x04ed:
            r10.setGridImages(r14, r13)
            goto L_0x0126
        L_0x04f2:
            java.util.List r9 = r0.A0L
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            r10.setGridImagesFromMedia(r3, r13, r9)
            goto L_0x0126
        L_0x04fd:
            android.widget.TextView r8 = r1.A06
            java.lang.String r6 = r0.A0G
            r8.setText(r6)
            android.widget.ImageView r9 = r1.A05
            r6 = 8
            r9.setVisibility(r6)
            java.lang.String r6 = r0.A0G
            goto L_0x0100
        L_0x050f:
            r8.bottomMargin = r7
            goto L_0x00bd
        L_0x0513:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0518:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x051d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0522:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0527:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x052c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r17)
            throw r0
        L_0x0531:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r17)
            throw r0
        L_0x0536:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x053b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0540:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0545:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x054a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x054f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0554:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0559:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x055e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0563:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r17)
            throw r0
        L_0x0568:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x056d:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x0572:
            r1 = 2037673261(0x79746d2d, float:7.9320924E34)
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H42.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        C3251571g r6 = (C3251571g) obj;
        boolean A1b = C51973G9u.A1b(r5, r6, obj2);
        if (r6.A01() == A1b && ((SavedCollection) r6.A02(0)).A07 == C54665HMw.MEDIA) {
            r5.A7V(0, r6, obj2);
        } else {
            r5.A7V(A1b ? 1 : 0, r6, obj2);
        }
    }

    public H42(Context context, AnonymousClass0iw r2, UserSession userSession, C55786HnL hnL, C54177H1x h1x, boolean z, boolean z2) {
        this.A01 = context;
        this.A02 = r2;
        this.A04 = h1x;
        this.A03 = userSession;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = hnL;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(880697076);
        Context context = this.A01;
        int i2 = 1;
        if (i == 1) {
            i2 = 2;
        }
        0qQ.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        C55519Hj1 hj1 = new C55519Hj1(i2);
        int i3 = 0;
        do {
            ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(context), linearLayout, R.layout.save_home_collections_saved_collection, false);
            viewGroup2.setTag(new C55877Hoy(viewGroup2));
            linearLayout.addView(viewGroup2);
            Object[] objArr = hj1.A00;
            Object tag = viewGroup2.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.save.adapter.home.SavedCollectionGridItemViewBinder.Holder");
            objArr[i3] = tag;
            i3++;
        } while (i3 < i2);
        linearLayout.setTag(hj1);
        AnonymousClass0fD.A0A(2049314033, A032);
        return linearLayout;
    }
}
