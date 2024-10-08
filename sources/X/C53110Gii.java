package X;

/* renamed from: X.Gii  reason: case insensitive filesystem */
public abstract class C53110Gii extends C249703kE {
    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v224, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (((X.CH0) r14).A0B == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        if (r1 != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C57088IOc r14) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C54592HKb
            if (r0 == 0) goto L_0x0111
            r6 = r13
            X.HKb r6 = (X.C54592HKb) r6
            r7 = 0
            X.0qQ.A0B(r14, r7)
            boolean r5 = r14 instanceof X.H3R
            r4 = 0
            if (r5 != 0) goto L_0x001d
            boolean r0 = r14 instanceof X.C43885CGz
            if (r0 != 0) goto L_0x001d
            boolean r0 = r14 instanceof X.CH0
            if (r0 != 0) goto L_0x001d
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x001d:
            boolean r0 = r14 instanceof X.CH0
            if (r0 == 0) goto L_0x0029
            r0 = r14
            X.CH0 r0 = (X.CH0) r0
            boolean r0 = r0.A0B
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            r3 = 8
            r2 = 0
            if (r1 == 0) goto L_0x00ef
            android.widget.TextView r0 = r6.A02
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2)
            com.instagram.common.ui.base.IgCheckBox r9 = r6.A05
            r9.setVisibility(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A07
            r0.setVisibility(r3)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r6.A09
            if (r0 == 0) goto L_0x0045
            r0.setVisibility(r7)
        L_0x0045:
            android.widget.TextView r10 = r6.A02
            java.lang.String r0 = r14.A06()
            r10.setText(r0)
            android.widget.TextView r8 = r6.A03
            java.lang.String r0 = r14.A07()
            r8.setText(r0)
            android.widget.TextView r0 = r6.A04
            java.lang.String r7 = r14.A08()
            r0.setText(r7)
            if (r1 == 0) goto L_0x00e1
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r11 = r6.A09
            if (r11 == 0) goto L_0x0072
            r0 = r14
            X.CH0 r0 = (X.CH0) r0
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
            X.GiC r0 = r6.A0A
            X.0iw r0 = r0.A02
            r11.setUrl(r1, r0)
        L_0x0072:
            boolean r0 = r14.A0A()
            r9.setChecked(r0)
            if (r5 == 0) goto L_0x009d
            android.content.Context r5 = X.DbS.A07(r6)
            X.GiC r0 = r6.A0A
            com.instagram.common.session.UserSession r0 = r0.A03
            java.lang.Boolean r0 = X.C306096Kt.A00(r0)
            boolean r1 = r0.booleanValue()
            r0 = 2131238820(0x7f081fa4, float:1.809393E38)
            if (r1 == 0) goto L_0x0093
            r0 = 2131238248(0x7f081d68, float:1.809277E38)
        L_0x0093:
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r10.setCompoundDrawablesWithIntrinsicBounds(r0, r2, r2, r2)
            X.AnonymousClass4Ed.A04(r10)
        L_0x009d:
            boolean r1 = r14 instanceof X.H3E
            if (r1 == 0) goto L_0x00db
            r0 = r14
            X.H3E r0 = (X.H3E) r0
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x00db
            android.graphics.drawable.Drawable r0 = r6.A00
            r8.setCompoundDrawablesWithIntrinsicBounds(r0, r2, r2, r2)
        L_0x00af:
            r0 = r14
            X.H3E r0 = (X.H3E) r0
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x00ba
            X.0eM r0 = X.I76.A02
        L_0x00ba:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A08
            r0.setVisibility(r3)
            android.widget.TextView r1 = r6.A01
            int r0 = r7.length()
            if (r0 != 0) goto L_0x00c9
            r4 = 8
        L_0x00c9:
            r1.setVisibility(r4)
            android.view.View r2 = r6.itemView
            X.GiC r1 = r6.A0A
            r0 = 24
            X.ID3.A02(r2, r0, r14, r1)
            r0 = 34
            X.ID0.A00(r9, r14, r1, r6, r0)
            return
        L_0x00db:
            r8.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2)
            if (r1 == 0) goto L_0x00ba
            goto L_0x00af
        L_0x00e1:
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r6.A07
            com.instagram.common.typedurl.ImageUrl r1 = r14.A04()
            X.GiC r0 = r6.A0A
            X.0iw r0 = r0.A02
            r11.setUrl(r1, r0)
            goto L_0x0072
        L_0x00ef:
            X.GiC r0 = r6.A0A
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0103
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A06
            if (r0 == 0) goto L_0x00fc
            r0.setVisibility(r7)
        L_0x00fc:
            com.instagram.common.ui.base.IgCheckBox r9 = r6.A05
            r9.setVisibility(r3)
            goto L_0x0045
        L_0x0103:
            com.instagram.common.ui.base.IgCheckBox r9 = r6.A05
            r9.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A06
            if (r0 == 0) goto L_0x0045
            r0.setVisibility(r3)
            goto L_0x0045
        L_0x0111:
            boolean r0 = r13 instanceof X.HKZ
            if (r0 == 0) goto L_0x01a7
            r7 = r13
            X.HKZ r7 = (X.HKZ) r7
            r11 = 0
            X.0qQ.A0B(r14, r11)
            boolean r0 = r14 instanceof X.H3P
            if (r0 == 0) goto L_0x01a2
            android.widget.TextView r9 = r7.A01
            r4 = r14
            X.H3P r4 = (X.H3P) r4
            java.lang.String r3 = r4.A02
            r9.setText(r3)
            android.widget.TextView r1 = r7.A02
            java.lang.String r0 = r4.A03
            r1.setText(r0)
            android.widget.TextView r0 = r7.A03
            java.lang.String r8 = r4.A04
            r0.setText(r8)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r7.A04
            com.instagram.common.typedurl.ImageUrl r1 = r4.A00
            X.GiC r6 = r7.A05
            X.0iw r0 = r6.A02
            r2.setUrl(r1, r0)
            X.0eM r0 = X.I76.A02
            android.view.View r0 = r7.itemView
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r0)
            X.1Xj r0 = r6.A05
            X.1s9 r0 = r0.A1N()
            if (r0 == 0) goto L_0x01a0
            com.instagram.api.schemas.ClipsMashupType r2 = r0.BP2()
        L_0x0157:
            r10 = 1
            X.0qQ.A0B(r3, r10)
            com.instagram.api.schemas.ClipsMashupType r1 = com.instagram.api.schemas.ClipsMashupType.A0A
            r0 = 2131955699(0x7f130ff3, float:1.9547933E38)
            if (r2 != r1) goto L_0x0165
            r0 = 2131955729(0x7f131011, float:1.9547994E38)
        L_0x0165:
            java.lang.String r5 = X.DbY.A0c(r4, r3, r0)
            int r4 = X.00l.A08(r5, r3, r11, r11)
            java.util.regex.Pattern r0 = X.0mp.A00
            int r3 = X.C51966G9m.A05(r3, r4)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r10)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r5)
            r0 = 18
            r1.setSpan(r2, r4, r3, r0)
            r9.setText(r1)
            r0 = 32
            X.ID3.A02(r9, r0, r14, r6)
            android.widget.TextView r2 = r7.A00
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto L_0x0195
            r0 = 8
        L_0x0195:
            r2.setVisibility(r0)
            android.view.View r1 = r7.itemView
            r0 = 33
            X.ID3.A02(r1, r0, r14, r6)
            return
        L_0x01a0:
            r2 = 0
            goto L_0x0157
        L_0x01a2:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x01a7:
            boolean r0 = r13 instanceof X.HKU
            if (r0 == 0) goto L_0x0213
            r3 = r13
            X.HKU r3 = (X.HKU) r3
            r7 = 0
            X.0qQ.A0B(r14, r7)
            boolean r0 = r14 instanceof X.H3F
            if (r0 == 0) goto L_0x020e
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r6 = r3.A00
            r6.A01()
            r2 = r14
            X.H3F r2 = (X.H3F) r2
            java.lang.String r8 = r2.A02
            r1 = 0
            r6.A08(r8, r7)
            java.lang.String r0 = r2.A03
            r6.A07(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r2.A00
            r6.A04(r0, r1)
            X.GiC r5 = r3.A02
            r0 = 31
            X.ID3.A02(r6, r0, r14, r5)
            com.instagram.user.follow.FollowButton r4 = r3.A01
            r6.A05(r4, r1)
            com.instagram.common.session.UserSession r3 = r5.A03
            X.17i r1 = X.17h.A00(r3)
            java.lang.String r0 = r2.A01
            com.instagram.user.model.User r2 = r1.A02(r0)
            if (r2 != 0) goto L_0x01f6
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r0, r8)
            X.17i r1 = X.17h.A00(r3)
            r0 = 1
            com.instagram.user.model.User r2 = r1.A01(r2, r0, r7)
        L_0x01f6:
            X.DbY.A1O(r2)
            android.widget.TextView r1 = r6.A05
            boolean r0 = r2.isVerified()
            X.C244273av.A0B(r1, r0)
            X.4at r1 = r4.A0J
            X.1Xj r0 = r5.A05
            r1.A04 = r0
            X.0iw r0 = r5.A02
            r1.A03(r0, r3, r2)
            return
        L_0x020e:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x0213:
            boolean r0 = r13 instanceof X.HKX
            if (r0 == 0) goto L_0x027d
            r3 = r13
            X.HKX r3 = (X.HKX) r3
            r5 = 0
            X.0qQ.A0B(r14, r5)
            boolean r0 = r14 instanceof X.H3I
            if (r0 == 0) goto L_0x0278
            android.widget.TextView r1 = r3.A00
            r4 = r14
            X.H3I r4 = (X.H3I) r4
            java.lang.String r0 = r4.A02
            r1.setText(r0)
            java.lang.String r2 = r4.A03
            int r0 = r2.length()
            android.widget.TextView r1 = r3.A01
            if (r0 != 0) goto L_0x0271
            r0 = 8
            r1.setVisibility(r0)
        L_0x023b:
            com.instagram.common.typedurl.ImageUrl r2 = r4.A00
            java.lang.String r0 = r2.getUrl()
            if (r0 == 0) goto L_0x025c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x025c
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.A02
            X.GiC r0 = r3.A03
            X.0iw r0 = r0.A02
            r1.setUrl(r2, r0)
        L_0x0252:
            android.view.View r2 = r3.itemView
            X.GiC r1 = r3.A03
            r0 = 29
            X.ID3.A02(r2, r0, r14, r1)
            return
        L_0x025c:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r3.A02
            android.content.Context r1 = X.DbS.A07(r3)
            r0 = 2130970262(0x7f040696, float:1.754923E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r0)
            r2.setImageDrawable(r0)
            goto L_0x0252
        L_0x0271:
            r1.setText(r2)
            r1.setVisibility(r5)
            goto L_0x023b
        L_0x0278:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x027d:
            boolean r0 = r13 instanceof X.HKR
            if (r0 == 0) goto L_0x02bf
            r3 = r13
            X.HKR r3 = (X.HKR) r3
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r0 = r14 instanceof X.H3H
            if (r0 == 0) goto L_0x02ba
            android.widget.TextView r1 = r3.A00
            r0 = r14
            X.H3H r0 = (X.H3H) r0
            java.lang.String r0 = r0.A03
            r1.setText(r0)
            android.view.View r2 = r3.itemView
            X.GiC r1 = r3.A01
            r0 = 27
            X.ID3.A02(r2, r0, r14, r1)
            com.instagram.common.session.UserSession r3 = r1.A03
            X.0iw r0 = r1.A02
            java.lang.String r5 = r0.getModuleName()
            X.1Xj r0 = r1.A05
            java.lang.String r7 = r0.A2n()
            X.9OT r1 = X.AnonymousClass9OT.REEL
            com.instagram.api.schemas.MediaGenAIDetectionMethod r2 = r0.A1I()
            r4 = 0
            java.lang.String r6 = "genai_transparency_label_impression"
            X.C250563lf.A0e(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x02ba:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x02bf:
            boolean r0 = r13 instanceof X.C54591HKa
            if (r0 == 0) goto L_0x0301
            r4 = r13
            X.HKa r4 = (X.C54591HKa) r4
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r0 = r14 instanceof X.H3Q
            if (r0 == 0) goto L_0x02fc
            android.widget.TextView r1 = r4.A00
            r3 = r14
            X.H3Q r3 = (X.H3Q) r3
            java.lang.String r0 = r3.A03
            r1.setText(r0)
            android.widget.TextView r1 = r4.A01
            java.lang.String r0 = r3.A04
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r4.A04
            com.instagram.common.typedurl.ImageUrl r1 = r3.A00
            X.0iw r0 = r4.A02
            r2.setUrl(r1, r0)
            android.view.View r1 = r4.itemView
            r0 = 37
            X.ID3.A02(r1, r0, r14, r4)
            com.instagram.common.ui.base.IgCheckBox r1 = r4.A03
            boolean r0 = r3.A06
            r1.setChecked(r0)
            r0 = 38
            X.ID3.A02(r1, r0, r14, r4)
            return
        L_0x02fc:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x0301:
            boolean r0 = r13 instanceof X.C54593HKc
            if (r0 == 0) goto L_0x041c
            r2 = r13
            X.HKc r2 = (X.C54593HKc) r2
            r3 = 0
            X.0qQ.A0B(r14, r3)
            boolean r0 = r14 instanceof X.H3S
            if (r0 == 0) goto L_0x051b
            X.H3S r14 = (X.H3S) r14
            java.lang.String r9 = r14.A04
            r2.A00 = r9
            com.instagram.common.session.UserSession r8 = r2.A07
            X.0Tu r4 = X.0Tu.A05
            r0 = 36323083883129677(0x810ba700002b4d, double:3.0342027367856993E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x04f1
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r2.A09
            android.view.View r0 = r2.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            X.0qQ.A07(r1)
            android.content.Context r0 = r14.A03
            int r0 = X.DbY.A01(r0)
            float r0 = (float) r0
            X.LRr.A02(r1, r4, r0)
            X.5DY r0 = r14.A00
            r7 = 0
            if (r0 == 0) goto L_0x0419
            java.lang.String r1 = r0.Bzp()
        L_0x0343:
            java.lang.String r0 = "image"
            boolean r1 = X.0qQ.A0K(r1, r0)
            X.5DY r0 = r14.A00
            if (r1 == 0) goto L_0x03e7
            if (r0 == 0) goto L_0x03e4
            java.lang.String r0 = r0.BRI()
        L_0x0353:
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.0iw r0 = r2.A06
            r4.setUrl(r1, r0)
        L_0x035c:
            android.widget.TextView r1 = r2.A03
            X.5DY r0 = r14.A00
            if (r0 == 0) goto L_0x03e2
            X.5DW r0 = r0.BzX()
            if (r0 == 0) goto L_0x03e2
            java.lang.String r0 = r0.getUsername()
        L_0x036c:
            r1.setText(r0)
            X.5DY r0 = r14.A00
            if (r0 == 0) goto L_0x03ae
            X.5DW r4 = r0.Bxp()
            if (r4 == 0) goto L_0x03ae
            X.5DY r0 = r14.A00
            if (r0 == 0) goto L_0x0381
            java.lang.String r7 = r0.Bzp()
        L_0x0381:
            java.lang.String r0 = "video"
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0391
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r2.A0B
            r0 = 2131238689(0x7f081f21, float:1.8093664E38)
            r1.setImageResource(r0)
        L_0x0391:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.A0B
            r0.setVisibility(r3)
            android.widget.TextView r1 = r2.A04
            java.lang.String r0 = r4.getUsername()
            r1.setText(r0)
            int r0 = r2.A01
            r1.setPadding(r0, r3, r3, r3)
            r1.setVisibility(r3)
            android.view.View r1 = r2.itemView
            r0 = 35
            X.ID3.A02(r1, r0, r14, r2)
        L_0x03ae:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r2.A0A
            r0 = 8
            r1.setVisibility(r0)
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x03df
            X.5DY r0 = r14.A00
            r1 = 1
            if (r0 == 0) goto L_0x03df
            boolean r0 = r0.CbA()
            if (r0 != r1) goto L_0x03df
            com.instagram.common.ui.base.IgCheckBox r1 = r2.A08
            X.5DY r0 = r14.A00
            if (r0 == 0) goto L_0x03e0
            java.lang.Boolean r0 = r0.CbB()
            if (r0 == 0) goto L_0x03e0
            boolean r0 = r0.booleanValue()
        L_0x03d4:
            r1.setChecked(r0)
            r0 = 36
            X.ID3.A02(r1, r0, r14, r2)
            r1.setVisibility(r3)
        L_0x03df:
            return
        L_0x03e0:
            r0 = 0
            goto L_0x03d4
        L_0x03e2:
            r0 = r7
            goto L_0x036c
        L_0x03e4:
            r0 = r7
            goto L_0x0353
        L_0x03e7:
            if (r0 == 0) goto L_0x035c
            java.lang.String r10 = r0.BRI()
            if (r10 == 0) goto L_0x035c
            android.view.View r0 = r2.itemView
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r0)
            android.view.View r0 = r2.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165365(0x7f0700b5, float:1.7944945E38)
            int r11 = r1.getDimensionPixelSize(r0)
            android.view.View r0 = r2.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165807(0x7f07026f, float:1.7945842E38)
            int r12 = r1.getDimensionPixelSize(r0)
            X.8N6 r5 = new X.8N6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.setImageDrawable(r5)
            goto L_0x035c
        L_0x0419:
            r1 = r7
            goto L_0x0343
        L_0x041c:
            boolean r0 = r13 instanceof X.HKS
            if (r0 == 0) goto L_0x043f
            r3 = r13
            X.HKS r3 = (X.HKS) r3
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r0 = r14 instanceof X.H3J
            if (r0 == 0) goto L_0x0520
            android.widget.TextView r1 = r3.A00
            r0 = r14
            X.H3J r0 = (X.H3J) r0
            java.lang.String r0 = r0.A03
            r1.setText(r0)
            android.view.View r2 = r3.itemView
            X.GiC r1 = r3.A01
            r0 = 30
            X.ID3.A02(r2, r0, r14, r1)
            return
        L_0x043f:
            boolean r0 = r13 instanceof X.HKW
            if (r0 == 0) goto L_0x0525
            r5 = r13
            X.HKW r5 = (X.HKW) r5
            r6 = 0
            X.0qQ.A0B(r14, r6)
            boolean r4 = r14 instanceof X.H3L
            if (r4 != 0) goto L_0x045b
            boolean r0 = r14 instanceof X.H3N
            if (r0 != 0) goto L_0x045b
            boolean r0 = r14 instanceof X.H3O
            if (r0 != 0) goto L_0x045b
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x045b:
            com.instagram.common.ui.base.IgTextView r3 = r5.A01
            java.lang.String r0 = r14.A06()
            r3.setText(r0)
            java.lang.String r2 = r14.A07()
            int r0 = r2.length()
            android.widget.TextView r1 = r5.A00
            if (r0 != 0) goto L_0x04ea
            r0 = 8
            r1.setVisibility(r0)
        L_0x0475:
            com.instagram.common.typedurl.ImageUrl r6 = r14.A04()
            java.lang.String r0 = r6.getUrl()
            if (r0 == 0) goto L_0x04bb
            int r0 = r0.length()
            if (r0 == 0) goto L_0x04bb
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.A02
            X.GiC r0 = r5.A03
            X.0iw r0 = r0.A02
            r2.setUrl(r6, r0)
            android.content.Context r1 = X.DbS.A07(r5)
            r0 = 2130970262(0x7f040696, float:1.754923E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r0)
            r2.setImageDrawable(r0)
        L_0x04a0:
            android.view.View r2 = r5.itemView
            X.GiC r1 = r5.A03
            r0 = 28
            X.ID3.A02(r2, r0, r14, r1)
            if (r4 == 0) goto L_0x03df
            android.content.Context r1 = X.DbS.A07(r5)
            r0 = 2131238501(0x7f081e65, float:1.8093282E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            r0 = 0
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
            return
        L_0x04bb:
            boolean r0 = r14 instanceof X.H3O
            if (r0 == 0) goto L_0x04cc
            r0 = r14
            X.H3O r0 = (X.H3O) r0
            android.graphics.drawable.Drawable r0 = r0.A00
        L_0x04c4:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A02
            if (r0 == 0) goto L_0x04e2
            r1.setImageDrawable(r0)
            goto L_0x04a0
        L_0x04cc:
            boolean r0 = r14 instanceof X.H3N
            if (r0 == 0) goto L_0x04d6
            r0 = r14
            X.H3N r0 = (X.H3N) r0
            android.graphics.drawable.Drawable r0 = r0.A00
            goto L_0x04c4
        L_0x04d6:
            boolean r0 = r14 instanceof X.H3M
            if (r0 == 0) goto L_0x04e0
            r0 = r14
            X.H3M r0 = (X.H3M) r0
            android.graphics.drawable.Drawable r0 = r0.A00
            goto L_0x04c4
        L_0x04e0:
            r0 = 0
            goto L_0x04c4
        L_0x04e2:
            X.GiC r0 = r5.A03
            X.0iw r0 = r0.A02
            r1.setUrl(r6, r0)
            goto L_0x04a0
        L_0x04ea:
            r1.setText(r2)
            r1.setVisibility(r6)
            goto L_0x0475
        L_0x04f1:
            com.instagram.common.typedurl.ImageUrl r0 = r14.A01
            java.lang.String r0 = r0.getUrl()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0510
            X.07Z r0 = r2.A05
            X.0xx r4 = X.AnonymousClass07a.A00(r0)
            r3 = 0
            r1 = 6
            X.ImM r0 = new X.ImM
            r0.<init>(r14, r2, r3, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
        L_0x0510:
            X.C54593HKc.A00(r14, r2)
            android.view.View r1 = r2.itemView
            r0 = 34
            X.ID3.A02(r1, r0, r14, r2)
            return
        L_0x051b:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x0520:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x0525:
            boolean r0 = r13 instanceof X.HKY
            if (r0 == 0) goto L_0x0532
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x0532:
            boolean r0 = r13 instanceof X.HKQ
            if (r0 == 0) goto L_0x0550
            r1 = r13
            X.HKQ r1 = (X.HKQ) r1
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r0 = r14 instanceof X.H3K
            if (r0 == 0) goto L_0x054b
            android.view.View r2 = r1.itemView
            X.GiC r1 = r1.A01
            r0 = 26
            X.ID3.A02(r2, r0, r14, r1)
            return
        L_0x054b:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x0550:
            boolean r0 = r13 instanceof X.HKT
            if (r0 == 0) goto L_0x0585
            r3 = r13
            X.HKT r3 = (X.HKT) r3
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r0 = r14 instanceof X.H3G
            if (r0 == 0) goto L_0x0580
            android.widget.TextView r2 = r3.A00
            r1 = r14
            X.H3G r1 = (X.H3G) r1
            java.lang.String r0 = r1.A03
            r2.setText(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = r3.A01
            if (r2 == 0) goto L_0x0576
            com.instagram.common.typedurl.ImageUrl r1 = r1.A00
            X.GiC r0 = r3.A02
            X.0iw r0 = r0.A02
            r2.setUrl(r1, r0)
        L_0x0576:
            android.view.View r2 = r3.itemView
            X.GiC r1 = r3.A02
            r0 = 25
            X.ID3.A02(r2, r0, r14, r1)
            return
        L_0x0580:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        L_0x0585:
            r3 = r13
            X.HKV r3 = (X.HKV) r3
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r0 = r14 instanceof X.H3M
            if (r0 == 0) goto L_0x05dc
            android.content.Context r2 = X.DbS.A07(r3)
            r4 = r14
            X.H3M r4 = (X.H3M) r4
            boolean r1 = r4.A06
            r0 = 2131238225(0x7f081d51, float:1.8092723E38)
            if (r1 == 0) goto L_0x05a1
            r0 = 2131238839(0x7f081fb7, float:1.8093968E38)
        L_0x05a1:
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)
            android.widget.TextView r1 = r3.A00
            java.lang.String r0 = r4.A03
            r1.setText(r0)
            r0 = 0
            r1.setCompoundDrawablesWithIntrinsicBounds(r2, r0, r0, r0)
            X.AnonymousClass4Ed.A04(r1)
            android.widget.TextView r1 = r3.A01
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = r3.A02
            android.graphics.drawable.Drawable r0 = r4.A00
            r2.setImageDrawable(r0)
            android.view.View r0 = r3.itemView
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            android.content.Context r0 = X.DbS.A07(r3)
            int r0 = X.2Yu.A0B(r0)
            X.AnonymousClass4Ed.A03(r1, r2, r0)
            android.view.View r2 = r3.itemView
            X.GiC r1 = r3.A03
            r0 = 23
            X.ID3.A02(r2, r0, r14, r1)
            return
        L_0x05dc:
            java.lang.IllegalArgumentException r0 = X.C51967G9n.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53110Gii.A01(X.IOc):void");
    }
}
