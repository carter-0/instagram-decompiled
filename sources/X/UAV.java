package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import java.util.ArrayList;
import java.util.List;

public final class UAV extends 2Rw implements XC8 {
    public C268374dH A00;
    public C17524VZd A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final XC9 A05;
    public final Integer A06;
    public final String A07;
    public final List A08 = new ArrayList();

    public UAV(Context context, AnonymousClass0iw r4, UserSession userSession, C268374dH r6, XC9 xc9, Integer num, String str) {
        0qQ.A0B(xc9, 4);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = r4;
        this.A05 = xc9;
        this.A07 = str;
        this.A06 = num;
        this.A00 = r6;
        setHasStableIds(true);
    }

    public final void D1a(String str, String str2, String str3, int i, int i2) {
        AnonymousClass7TG.A1T(str, str2, str3);
        this.A05.Bg8().D1a(str, str2, str3, i, i2);
    }

    public final void DZY(ULV ulv, Product product) {
        0qQ.A0B(product, 0);
        this.A05.Bg8().DZY((ULV) null, product);
    }

    public final /* synthetic */ void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        ProductFeedItem productFeedItem2 = productFeedItem;
        0qQ.A0B(productFeedItem, 0);
        if (ulv != null) {
            C17524VZd vZd = this.A01;
            if (vZd != null) {
                String str = ulv.A00;
                this.A05.DZb((0xF) ulv.A01, productFeedItem2, this.A00, str, vZd.A02.Bxr(), i, i2, vZd.A01);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ void DZd(Product product, String str, String str2, int i, int i2) {
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final /* synthetic */ void DZf(String str, int i) {
    }

    public final void DZg(Product product, int i, int i2) {
        Product product2 = product;
        0qQ.A0B(product, 0);
        C268374dH r2 = this.A00;
        if (r2.B5W() == C16675UzB.RECENTLY_VIEWED) {
            this.A05.DZh(r2, new C19628Wcr(this, 1), product2, i, i2);
        }
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        0qQ.A0B(productTile, 0);
        C17524VZd vZd = this.A01;
        if (vZd != null) {
            C19633Wcw wcw = new C19633Wcw(productTile, this);
            Product product = productTile.A07;
            if (product != null) {
                this.A05.DZj(this.A00, wcw, product, Integer.valueOf(vZd.A01), vZd.A02.Bxr(), i, i2);
            }
        }
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final void DZl(Product product) {
        0qQ.A0B(product, 0);
        this.A05.Bg8().DZl(product);
    }

    public final void DZm(Product product) {
        0qQ.A0B(product, 0);
        this.A05.Bg8().DZm(product);
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
        0qQ.A0B(unavailableProduct, 0);
        this.A05.Bg8().DuP(unavailableProduct, i, i2);
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
        0qQ.A0B(productFeedItem, 0);
        A00(this.A08.indexOf(productFeedItem));
        this.A05.Bg8().DuQ(productFeedItem);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbW.A09(LayoutInflater.from(this.A02), viewGroup, R.layout.product_feed_list_item_layout, false);
        Object A0U = C13988Tno.A0U(A09, new UE5(A09));
        if (A0U != null) {
            return (C249703kE) A0U;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A00(int i) {
        C17524VZd vZd;
        List list = this.A08;
        list.remove(i);
        if (list.isEmpty() && (vZd = this.A01) != null) {
            this.A05.APY(this.A00, vZd.A01);
        }
        notifyItemRemoved(i);
        notifyItemRangeChanged(i, getItemCount());
    }

    public static final void A01(UAV uav, String str) {
        Product A022;
        List list = uav.A08;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ProductFeedItem productFeedItem = (ProductFeedItem) list.get(i);
            if (productFeedItem == null || (A022 = productFeedItem.A02()) == null || !0qQ.A0K(A022.A0H, str)) {
                i++;
            } else {
                uav.A00(i);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.Vj5} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r10 != X.C16675UzB.RECENTLY_VIEWED) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r4 == null) goto L_0x0021;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r24, int r25) {
        /*
            r23 = this;
            r1 = r24
            X.UE5 r1 = (X.UE5) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2 = r23
            X.VZd r7 = r2.A01
            if (r7 == 0) goto L_0x00c1
            java.util.List r3 = r2.A08
            r5 = r25
            java.lang.Object r9 = r3.get(r5)
            com.instagram.model.shopping.productfeed.ProductFeedItem r9 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r9
            com.instagram.model.shopping.productfeed.ProductTile r3 = r9.A02
            if (r3 == 0) goto L_0x0021
            com.instagram.user.model.Product r4 = r3.A07
            r3 = 1
            if (r4 != 0) goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r11 = 0
            if (r3 == 0) goto L_0x00c2
            com.instagram.user.model.Product r3 = r9.A02()
            if (r3 == 0) goto L_0x00c4
            java.lang.String r6 = r3.A0H
            java.util.Map r3 = r7.A03
            java.lang.Object r4 = r3.get(r6)
            X.Vj5 r4 = (X.C17969Vj5) r4
            if (r4 != 0) goto L_0x0044
            X.Vj5 r4 = new X.Vj5
            r4.<init>()
            r3.put(r6, r4)
            java.util.Map r3 = r7.A04
            X.C66580MXl.A1T(r6, r3, r5)
        L_0x0044:
            X.0xF r8 = new X.0xF
            r8.<init>()
            java.lang.String r6 = "chaining_position"
            int r3 = r7.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            X.0xF.A00(r8, r3, r6)
            X.4dH r3 = r7.A02
            java.lang.String r7 = r3.Bxn()
            if (r7 == 0) goto L_0x0061
            java.lang.String r6 = "m_pk"
            X.0xF.A00(r8, r7, r6)
        L_0x0061:
            java.lang.String r7 = r3.Bxr()
            if (r7 == 0) goto L_0x006c
            java.lang.String r6 = "source_media_type"
            X.0xF.A00(r8, r7, r6)
        L_0x006c:
            X.4dH r6 = r2.A00
            X.UzB r10 = r6.B5W()
            java.lang.Integer r12 = r2.A06
            com.instagram.api.schemas.ProductCardSubtitleType r7 = r6.Bfz()
            r18 = 1
            java.lang.String r15 = r2.A07
            if (r10 == 0) goto L_0x0084
            X.UzB r6 = X.C16675UzB.RECENTLY_VIEWED
            r19 = 1
            if (r10 == r6) goto L_0x0086
        L_0x0084:
            r19 = 0
        L_0x0086:
            X.UKw r6 = new X.UKw
            r13 = r11
            r14 = r11
            r20 = r18
            r21 = r0
            r22 = r0
            r16 = r0
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.VWz r0 = new X.VWz
            r0.<init>(r4, r11, r11)
            X.UNs r4 = new X.UNs
            r4.<init>(r6, r0)
            android.content.Context r10 = r2.A02
            X.0iw r11 = r2.A03
            com.instagram.common.session.UserSession r0 = r2.A04
            r12 = r0
            r13 = r2
            r14 = r4
            r15 = r1
            X.C17096VHs.A00(r10, r11, r12, r13, r14, r15)
            com.instagram.model.shopping.productfeed.ProductTile r0 = r9.A02
            if (r0 == 0) goto L_0x00c1
            com.instagram.user.model.Product r0 = r0.A07
            if (r0 == 0) goto L_0x00c1
            X.XC9 r2 = r2.A05
            android.view.View r1 = r1.A03
            java.lang.String r0 = r3.Bxn()
            r2.EBy(r1, r9, r0)
        L_0x00c1:
            return
        L_0x00c2:
            r4 = r11
            goto L_0x0044
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAV.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(505822537);
        int size = this.A08.size();
        AnonymousClass0fD.A0A(-156695709, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(1641598240);
        long hashCode = (long) ((ProductFeedItem) this.A08.get(i)).getId().hashCode();
        AnonymousClass0fD.A0A(2137977173, A032);
        return hashCode;
    }
}
