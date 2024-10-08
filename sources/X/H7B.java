package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class H7B extends C232222tE {
    public final UserSession A00;
    public final C55479HiN A01;

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a1, code lost:
        if (r4.A05() == r5) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bb, code lost:
        if (r4 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bf, code lost:
        if (r4.A07 != r3) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c3, code lost:
        if (r12.A02 == false) goto L_0x01c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r12, X.C249703kE r13) {
        /*
            r11 = this;
            X.IOZ r12 = (X.IOZ) r12
            X.GjK r13 = (X.C53148GjK) r13
            boolean r5 = X.AnonymousClass7TG.A1Z(r12, r13)
            X.HiN r3 = r11.A01
            com.instagram.common.session.UserSession r2 = r11.A00
            r6 = 0
            X.AnonymousClass7TG.A1Q(r3, r2)
            boolean r0 = r12.A03
            r8 = 16
            r4 = 1
            if (r0 == 0) goto L_0x00a4
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            java.lang.Integer r1 = r0.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0024
            r4 = 0
        L_0x0024:
            com.instagram.common.ui.base.IgTextView r2 = r13.A04
            android.content.Context r1 = r2.getContext()
            r0 = 2131970939(0x7f134b7b, float:1.9578843E38)
            X.DbT.A18(r1, r2, r0)
            com.instagram.common.ui.base.IgTextView r2 = r13.A03
            android.content.Context r1 = r2.getContext()
            r0 = 2131968270(0x7f13410e, float:1.957343E38)
            if (r4 == 0) goto L_0x003e
            r0 = 2131968266(0x7f13410a, float:1.9573422E38)
        L_0x003e:
            X.DbT.A18(r1, r2, r0)
            r1 = 2131238964(0x7f082034, float:1.8094222E38)
            if (r4 == 0) goto L_0x0049
            r1 = 2131238333(0x7f081dbd, float:1.8092942E38)
        L_0x0049:
            android.content.Context r4 = r13.A00
            r0 = 2131100473(0x7f060339, float:1.7813328E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A06(r4, r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r13.A05
            r2.setImageDrawable(r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.DbS.A02(r4, r8)
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.DbS.A02(r4, r8)
            r1.height = r0
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r13.A07
            r0 = -2
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            r5.setLayoutParams(r1)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r5.setScaleType(r0)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r5)
            r1 = 2131238737(0x7f081f51, float:1.8093761E38)
            r0 = 2131100475(0x7f06033b, float:1.7813332E38)
            int r0 = r2.getColor(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r2, r1, r0)
            r5.setImageDrawable(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r13.A06
            r0 = 2131952359(0x7f1302e7, float:1.9541159E38)
            X.DbU.A12(r4, r1, r0)
            android.view.View r1 = r13.A01
            r0 = 15
            X.ID2.A02(r1, r0, r3, r13)
            return
        L_0x00a4:
            android.view.View r1 = r13.A01
            r0 = 6
            X.ID0.A00(r1, r3, r13, r12, r0)
            com.instagram.save.model.SavedCollection r4 = r12.A00
            if (r4 == 0) goto L_0x00c3
            X.1Xj r0 = r4.A04
            if (r0 == 0) goto L_0x00c3
            com.instagram.common.typedurl.ImageUrl r3 = r0.A1Q()
            if (r3 == 0) goto L_0x00c3
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r13.A07
            java.lang.String r0 = r12.A01
            X.0xG r0 = X.DbS.A0O(r0)
            r1.setUrl(r3, r0)
        L_0x00c3:
            com.instagram.common.ui.base.IgTextView r3 = r13.A04
            r7 = 0
            if (r4 == 0) goto L_0x0113
            java.lang.String r0 = r4.A0G
        L_0x00ca:
            r3.setText(r0)
            boolean r0 = X.I7Q.A0C(r4)
            if (r0 == 0) goto L_0x00db
            android.content.Context r1 = r13.A00
            r0 = 2131956265(0x7f131229, float:1.954908E38)
            X.DbT.A18(r1, r3, r0)
        L_0x00db:
            if (r4 == 0) goto L_0x0111
            X.HMw r0 = r4.A07
        L_0x00df:
            X.HMw r3 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            if (r0 != r3) goto L_0x0115
            if (r4 == 0) goto L_0x0149
            java.util.List r0 = r4.A0M
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x0149
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x00f5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r9.next()
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = (com.instagram.model.shopping.productimagecontainer.ProductImageContainer) r0
            com.instagram.model.mediasize.ImageInfo r1 = r0.BGO()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A04(r1, r0)
            if (r0 == 0) goto L_0x00f5
            r10.add(r0)
            goto L_0x00f5
        L_0x0111:
            r0 = r7
            goto L_0x00df
        L_0x0113:
            r0 = r7
            goto L_0x00ca
        L_0x0115:
            if (r4 == 0) goto L_0x0130
            X.HMw r1 = r4.A07
        L_0x0119:
            X.HMw r0 = X.C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION
            if (r1 != r0) goto L_0x0149
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r13.A07
            r0.A09()
            com.instagram.common.ui.base.IgSimpleImageView r9 = r13.A02
            android.content.Context r1 = r13.A00
            r0 = 2131238789(0x7f081f85, float:1.8093867E38)
            X.DbU.A13(r1, r9, r0)
            r9.setVisibility(r6)
            goto L_0x0149
        L_0x0130:
            r1 = r7
            goto L_0x0119
        L_0x0132:
            boolean r0 = X.AnonymousClass7TE.A1b(r10)
            if (r0 != r5) goto L_0x0149
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r13.A07
            java.lang.Object r1 = r10.get(r6)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r0 = r12.A01
            X.0xG r0 = X.DbS.A0O(r0)
            r9.setUrl(r1, r0)
        L_0x0149:
            boolean r0 = X.I7Q.A0C(r4)
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = X.C54953HZj.A00(r2, r13, r12)
            java.lang.String r0 = X.002.A0B(r0)
            X.0qQ.A0A(r0)
        L_0x015a:
            int r1 = r0.length()
            boolean r9 = X.AnonymousClass7TF.A1R(r1)
            r1 = 8
            if (r9 == 0) goto L_0x0228
            com.instagram.common.ui.base.IgTextView r9 = r13.A03
            r9.setText(r0)
        L_0x016b:
            if (r4 == 0) goto L_0x0173
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r4.A05
            if (r0 == 0) goto L_0x0173
            java.util.List r7 = r0.A02
        L_0x0173:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x01db
            if (r4 == 0) goto L_0x01db
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r4.A05
            if (r0 == 0) goto L_0x01db
            if (r7 == 0) goto L_0x01db
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r13.A05
            android.content.Context r2 = r13.A00
            java.lang.String r1 = r12.A01
            X.0eM r0 = r13.A08
            int r0 = X.DbX.A07(r0)
            android.graphics.drawable.Drawable r0 = X.C244283aw.A02(r2, r1, r7, r0)
            r8.setImageDrawable(r0)
            r8.setVisibility(r6)
        L_0x0195:
            boolean r0 = X.I7Q.A0C(r4)
            if (r0 != 0) goto L_0x01bb
            if (r4 == 0) goto L_0x01c6
            boolean r0 = r4.A05()
            if (r0 != r5) goto L_0x01bd
        L_0x01a3:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r13.A06
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r13.A00
            int r0 = X.2Yu.A0B(r1)
            X.DbX.A12(r1, r2, r0)
            r0 = 2131972028(0x7f134fbc, float:1.9581052E38)
        L_0x01b7:
            X.DbU.A12(r1, r2, r0)
            return
        L_0x01bb:
            if (r4 == 0) goto L_0x01c6
        L_0x01bd:
            X.HMw r0 = r4.A07
            if (r0 != r3) goto L_0x01c6
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x01c6
            goto L_0x01a3
        L_0x01c6:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r13.A06
            r0 = 2131238101(0x7f081cd5, float:1.8092471E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r13.A00
            int r0 = X.2Yu.A09(r1)
            X.DbX.A12(r1, r2, r0)
            r0 = 2131952359(0x7f1302e7, float:1.9541159E38)
            goto L_0x01b7
        L_0x01db:
            boolean r0 = X.I31.A01(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r13.A05
            if (r0 == 0) goto L_0x0223
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            android.content.Context r7 = r13.A00
            int r0 = X.DbS.A02(r7, r8)
            r1.width = r0
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            int r0 = X.DbS.A02(r7, r8)
            r1.height = r0
            if (r4 == 0) goto L_0x021f
            boolean r0 = r4.A06()
            if (r0 != r5) goto L_0x021f
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            java.lang.Integer r2 = r0.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1 = 2131238964(0x7f082034, float:1.8094222E38)
            if (r2 != r0) goto L_0x0213
            r1 = 2131238333(0x7f081dbd, float:1.8092942E38)
        L_0x0213:
            r0 = 2131100473(0x7f060339, float:1.7813328E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A06(r7, r1, r0)
            r6.setImageDrawable(r0)
            goto L_0x0195
        L_0x021f:
            r1 = 2131238512(0x7f081e70, float:1.8093305E38)
            goto L_0x0213
        L_0x0223:
            r6.setVisibility(r1)
            goto L_0x0195
        L_0x0228:
            com.instagram.common.ui.base.IgTextView r0 = r13.A03
            r0.setVisibility(r1)
            goto L_0x016b
        L_0x022f:
            if (r4 == 0) goto L_0x0239
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r4.A05
            if (r0 == 0) goto L_0x0239
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x015a
        L_0x0239:
            java.lang.String r0 = X.C54953HZj.A00(r2, r13, r12)
            goto L_0x015a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H7B.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return IOZ.class;
    }

    public H7B(UserSession userSession, C55479HiN hiN) {
        this.A01 = hiN;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53148GjK(DbT.A0D(layoutInflater, viewGroup, R.layout.collection_row, false));
    }
}
