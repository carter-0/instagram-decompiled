package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.ArrayList;
import java.util.List;

public final class UAA extends 2Rw {
    public final XCA A00;
    public final U9N A01 = new U9N();
    public final List A02 = new ArrayList();
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (r0.Bvo() != r9) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r19, int r20) {
        /*
            r18 = this;
            r15 = 0
            r6 = r18
            r4 = r19
            r5 = r20
            int r1 = X.JTP.A07(r6, r4, r15, r5)
            java.util.List r0 = r6.A02
            java.lang.Object r3 = r0.get(r5)
            com.instagram.model.shopping.productfeed.ProductFeedItem r3 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r3
            if (r1 == 0) goto L_0x002e
            r2 = r4
            X.UDt r2 = (X.C14891UDt) r2
            X.0iw r1 = r6.A03
            X.XCA r0 = r6.A00
            android.content.Context r4 = X.JTQ.A06(r4)
            r8 = r15
            r9 = r5
            r10 = r15
            r5 = r1
            r6 = r3
            r7 = r0
            X.WSR r0 = X.C17100VHw.A00(r4, r5, r6, r7, r8, r9, r10)
            X.C18387Vqn.A00(r2, r0)
            return
        L_0x002e:
            r5 = r4
            X.UE8 r5 = (X.UE8) r5
            X.XCA r2 = r6.A00
            X.0iw r10 = r6.A03
            boolean r9 = X.AnonymousClass7TF.A1U(r15, r5, r3)
            com.instagram.user.model.Product r6 = r3.A02()
            if (r6 == 0) goto L_0x0136
            com.instagram.model.mediasize.ImageInfo r0 = r6.A08
            if (r0 != 0) goto L_0x0129
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A04
            r0.A09()
        L_0x0048:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A04
            r0 = 54
            X.WBD.A00(r1, r0, r6, r2)
            com.instagram.model.shopping.productfeed.ProductTile r0 = r3.A02
            r7 = 0
            if (r0 == 0) goto L_0x0063
            com.instagram.api.schemas.ProductTileMetadataImpl r0 = r0.A01
            if (r0 == 0) goto L_0x0063
            com.instagram.api.schemas.ProductTileMetadataDecorations r0 = r0.A00
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.Bvo()
            r14 = 1
            if (r0 == r9) goto L_0x0064
        L_0x0063:
            r14 = 0
        L_0x0064:
            X.VZw r12 = r5.A05
            com.instagram.user.model.User r0 = r6.A0B
            if (r0 == 0) goto L_0x0125
            com.instagram.common.typedurl.ImageUrl r11 = r0.Bh3()
            java.lang.String r13 = r0.getUsername()
        L_0x0072:
            r16 = r15
            r17 = r15
            X.C18272Vom.A01(r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.ui.text.TitleTextView r10 = r5.A03
            java.lang.String r11 = r6.A0J
            r10.setText(r11)
            r10.setIsBold(r9)
            if (r11 == 0) goto L_0x00a3
            r8 = 2131165200(0x7f070010, float:1.794461E38)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r10)
            java.lang.Integer r0 = r5.A06
            X.0qQ.A0B(r0, r9)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165346(0x7f0700a2, float:1.7944907E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.CharSequence r0 = X.W2t.A06(r10, r11, r8, r0)
            r10.setText(r0)
        L_0x00a3:
            com.instagram.common.ui.text.TitleTextView r8 = r5.A01
            r8.setIsBold(r15)
            r10 = 8
            com.instagram.common.ui.text.TitleTextView r11 = r5.A02
            r11.setVisibility(r10)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r6.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0123
            java.lang.Boolean r0 = r0.A02
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r9)
        L_0x00bb:
            r1 = 2
            if (r0 != 0) goto L_0x00db
            r8.setMaxLines(r1)
            r0 = 2131964516(0x7f133264, float:1.9565816E38)
            r8.setText(r0)
            r8.setContentDescription(r7)
            r11.setVisibility(r10)
        L_0x00cd:
            android.widget.TextView r0 = r5.A00
            r0.setVisibility(r10)
        L_0x00d2:
            android.view.View r0 = r4.itemView
            X.0qQ.A06(r0)
            r2.ECE(r0, r3)
            return
        L_0x00db:
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0116
            r8.setMaxLines(r9)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r8)
            int r0 = X.C324476zN.A00(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r0 = X.C324476zN.A08(r1, r6, r7, r0)
            r8.setText(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r6.A01
            java.lang.String r0 = r1.A0V
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = r1.A0T
        L_0x00fd:
            r8.setContentDescription(r0)
            android.widget.TextView r1 = r5.A00
            r1.setVisibility(r15)
            r0 = 53
            X.WBD.A00(r1, r0, r6, r2)
            r0 = 2131952356(0x7f1302e4, float:1.9541152E38)
            r1.setText(r0)
            java.lang.Runnable r0 = r5.A07
            r1.post(r0)
            goto L_0x00d2
        L_0x0116:
            r8.setMaxLines(r1)
            r0 = 2131969827(0x7f134723, float:1.9576588E38)
            r8.setText(r0)
            r8.setContentDescription(r7)
            goto L_0x00cd
        L_0x0123:
            r0 = 0
            goto L_0x00bb
        L_0x0125:
            r11 = r7
            r13 = r7
            goto L_0x0072
        L_0x0129:
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A03(r0)
            if (r1 == 0) goto L_0x0048
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A04
            r0.setUrl(r1, r10)
            goto L_0x0048
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAA.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object A0U;
        String str;
        Context A0C = JTP.A0C(viewGroup, 0);
        if (i == 0) {
            Integer num = AnonymousClass05K.A01;
            View A09 = DbU.A09(LayoutInflater.from(A0C), viewGroup, R.layout.product_collection_product_card_layout, false);
            A0U = C13988Tno.A0U(A09, new UE8(A09, num));
            str = "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.productcollection.CartEnabledProductCardViewBinder.Holder";
        } else if (i == 1) {
            0qQ.A0A(A0C);
            Integer num2 = AnonymousClass05K.A01;
            0qQ.A0B(A0C, 0);
            0qQ.A0B(num2, 1);
            int dimensionPixelSize = A0C.getResources().getDimensionPixelSize(R.dimen.block_comment_empty_state_padding_top);
            int A08 = C51972G9s.A08(A0C);
            View A092 = DbU.A09(LayoutInflater.from(A0C), viewGroup, R.layout.unavailable_product_tile, false);
            0qQ.A0B(A092, 1);
            C14891UDt uDt = new C14891UDt(A092);
            0nA.A0f(A092, dimensionPixelSize);
            uDt.A01.setTextSize(0, (float) A08);
            A0U = C13988Tno.A0U(A092, uDt);
            str = "null cannot be cast to non-null type com.instagram.shopping.widget.unavailableproducttile.UnavailableProductTileViewBinder.ViewHolder";
        } else {
            throw DbW.A0b("Unable to create view holder for product feed item with item type = ", i);
        }
        0qQ.A0C(A0U, str);
        return (C249703kE) A0U;
    }

    public UAA(AnonymousClass0iw r2, UserSession userSession, XCA xca) {
        this.A04 = userSession;
        this.A03 = r2;
        this.A00 = xca;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-637992640);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-787218183, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        String str;
        int A032 = AnonymousClass0fD.A03(2003870284);
        int intValue = ((ProductFeedItem) this.A02.get(i)).A06.intValue();
        int i2 = 1;
        if (intValue == 2) {
            i2 = 0;
        } else if (intValue != 1) {
            if (3 - intValue != 0) {
                str = "MULTI_PRODUCT_COMPONENT";
            } else {
                str = "MEDIA";
            }
            IllegalStateException A0c = DbW.A0c("Unable to create view type for product feed item with type = ", str);
            AnonymousClass0fD.A0A(38455864, A032);
            throw A0c;
        }
        AnonymousClass0fD.A0A(1767981726, A032);
        return i2;
    }
}
