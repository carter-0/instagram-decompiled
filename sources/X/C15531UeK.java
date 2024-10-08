package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UeK  reason: case insensitive filesystem */
public final class C15531UeK extends C231632rz {
    public final XCB A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        boolean A1U = AnonymousClass7TF.A1U(0, r3, obj);
        r3.A7U(0);
        r3.A7U(A1U ? 1 : 0);
        this.A00.AAk(obj);
    }

    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r0 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if (r10 != r1) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r18, android.view.View r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            r17 = this;
            r5 = r20
            r0 = 1617229770(0x6064f7ca, float:6.599551E19)
            int r16 = X.AnonymousClass0fD.A03(r0)
            r13 = 1
            r3 = r19
            int r12 = X.DbW.A02(r13, r3, r5)
            r0 = r18
            if (r18 == 0) goto L_0x010d
            if (r0 != r13) goto L_0x00ee
            X.0eP r5 = (X.0eP) r5
            java.lang.Object r0 = r5.A00
            X.1Xj r0 = (X.1Xj) r0
            r6 = r17
            com.instagram.common.session.UserSession r10 = r6.A02
            com.instagram.user.model.User r2 = r0.A2A(r10)
            if (r2 == 0) goto L_0x00e9
            X.0iw r1 = r6.A01
            java.lang.Object r8 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.adapter.featuredproducts.FeaturedProductViewBinder.Holder"
            X.0qQ.A0C(r8, r0)
            X.VYS r8 = (X.VYS) r8
            java.lang.String r9 = r2.getId()
            java.lang.Object r4 = r5.A01
            X.BIj r4 = (X.C42130BIj) r4
            X.XCB r2 = r6.A00
            X.Dba.A0j(r13, r10, r1)
            X.C51973G9u.A0r(r12, r8, r4, r2)
            com.instagram.user.model.ProductDetailsProductItemDict r7 = r4.A01
            r11 = 0
            if (r7 == 0) goto L_0x0082
            com.instagram.user.model.Product r15 = X.C14502TxO.A00(r7)
            com.instagram.model.mediasize.ImageInfo r0 = r15.A08
            if (r0 == 0) goto L_0x0056
            com.instagram.model.mediasize.ExtendedImageUrl r14 = X.1iI.A03(r0)
            if (r14 != 0) goto L_0x0060
        L_0x0056:
            com.instagram.model.mediasize.ImageInfo r0 = r15.A07
            if (r0 == 0) goto L_0x0065
            com.instagram.model.mediasize.ExtendedImageUrl r14 = X.1iI.A03(r0)
            if (r14 == 0) goto L_0x0065
        L_0x0060:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A03
            r0.setUrl(r14, r1)
        L_0x0065:
            android.widget.TextView r1 = r8.A02
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            android.text.SpannableStringBuilder r14 = X.W2t.A00(r0)
            boolean r0 = r15.A04()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r15.A0J
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r0, r14}
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r0)
        L_0x007f:
            r1.setText(r0)
        L_0x0082:
            java.lang.String r1 = r10.A06
            if (r7 == 0) goto L_0x0107
            com.instagram.user.model.User r0 = r7.A0G
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
        L_0x008e:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009b
            boolean r0 = X.0qQ.A0K(r1, r9)
            r1 = 0
            if (r0 == 0) goto L_0x009c
        L_0x009b:
            r1 = 1
        L_0x009c:
            if (r7 == 0) goto L_0x00a6
            com.instagram.user.model.User r0 = r7.A0G
            if (r0 == 0) goto L_0x00a6
            java.lang.String r11 = X.C13988Tno.A0b(r0)
        L_0x00a6:
            X.N8v r0 = r4.A00
            if (r0 == 0) goto L_0x00e2
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r10 = r0.A00
            if (r10 == 0) goto L_0x00e2
            android.widget.TextView r9 = r8.A01
            X.0qQ.A0A(r11)
            android.content.Context r7 = r9.getContext()
            if (r1 == 0) goto L_0x00d3
            int r1 = r10.ordinal()
            r0 = 11
            if (r1 == r0) goto L_0x00fb
            if (r1 == r13) goto L_0x00cc
            r0 = 6
            if (r1 == r0) goto L_0x00ff
            if (r1 == r12) goto L_0x00f7
            r0 = 3
            if (r1 == r0) goto L_0x00f7
            r11 = 0
        L_0x00cc:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
            if (r10 == r1) goto L_0x00d6
        L_0x00d3:
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x00d6:
            int r0 = X.2Yu.A0H(r7, r0)
            if (r11 == 0) goto L_0x00df
            r9.setText(r11)
        L_0x00df:
            X.DbT.A17(r7, r9, r0)
        L_0x00e2:
            android.view.View r1 = r8.A00
            r0 = 58
            X.WBD.A00(r1, r0, r4, r2)
        L_0x00e9:
            X.XCB r0 = r6.A00
            r0.ECF(r3, r5)
        L_0x00ee:
            r1 = -800568534(0xffffffffd0484b2a, float:-1.34414766E10)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x00f7:
            r0 = 2131962259(0x7f132993, float:1.9561238E38)
            goto L_0x0102
        L_0x00fb:
            r0 = 2131962261(0x7f132995, float:1.9561242E38)
            goto L_0x0102
        L_0x00ff:
            r0 = 2131962260(0x7f132994, float:1.956124E38)
        L_0x0102:
            java.lang.String r11 = r7.getString(r0)
            goto L_0x00cc
        L_0x0107:
            r0 = r11
            goto L_0x008e
        L_0x0109:
            java.lang.String r0 = r15.A0J
            goto L_0x007f
        L_0x010d:
            java.lang.Object r2 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.adapter.common.SectionHeaderViewBinder.Holder"
            X.0qQ.A0C(r2, r0)
            X.UDD r2 = (X.UDD) r2
            android.content.Context r1 = r3.getContext()
            r0 = 2131962247(0x7f132987, float:1.9561214E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r1, r0)
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r4, r4}
            java.lang.String r0 = "%s_%s_%s:"
            java.lang.String r7 = X.0mp.A06(r0, r1)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.UNy r3 = new X.UNy
            r5 = r4
            r9 = r4
            r10 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.C18246VoD.A01(r2, r3)
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15531UeK.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C15531UeK(AnonymousClass0iw r1, UserSession userSession, XCB xcb) {
        this.A02 = userSession;
        this.A01 = r1;
        this.A00 = xcb;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A002;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1388355232);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            A002 = C18246VoD.A00(viewGroup);
            i2 = 1247998490;
        } else if (i == 1) {
            A002 = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.featured_product_row, false);
            A002.setTag(new VYS(A002));
            i2 = -1434351889;
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unexpected view type");
            AnonymousClass0fD.A0A(-19314914, A03);
            throw illegalArgumentException;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return A002;
    }
}
