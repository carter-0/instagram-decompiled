package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UAP extends 2Rw {
    public ProductTileMedia A00;
    public ProductCollection A01;
    public List A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C324356z9 A06;
    public final 1Xj A07;
    public final C21003X9a A08;
    public final C15029UKi A09;
    public final C18617VvA A0A;
    public final C18617VvA A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();
    public final Map A0G = new HashMap();
    public final Map A0H = new HashMap();
    public final boolean A0I;
    public final C17984VjM A0J;
    public final C20983X7y A0K;
    public final Integer A0L;

    /* JADX WARNING: type inference failed for: r1v4, types: [X.UKG, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b7, code lost:
        if (r11.A0I != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UAP(android.content.Context r12, X.AnonymousClass0iw r13, com.instagram.common.session.UserSession r14, X.C324356z9 r15, X.1Xj r16, X.C17984VjM r17, X.C21003X9a r18, X.C15029UKi r19, X.C18617VvA r20, X.C18617VvA r21, X.C20983X7y r22, java.lang.Integer r23, java.lang.String r24, java.lang.String r25, java.util.List r26, boolean r27) {
        /*
            r11 = this;
            r5 = 1
            r3 = r20
            r2 = r21
            X.C51973G9u.A0t(r5, r12, r3, r2)
            r0 = 15
            r1 = r26
            X.0qQ.A0B(r1, r0)
            r11.<init>()
            r11.A03 = r12
            r11.A05 = r14
            r11.A04 = r13
            r0 = r16
            r11.A07 = r0
            r0 = r19
            r11.A09 = r0
            r0 = r18
            r11.A08 = r0
            r0 = r22
            r11.A0K = r0
            r11.A0B = r3
            r11.A0A = r2
            r11.A06 = r15
            r0 = r24
            r11.A0C = r0
            r0 = r25
            r11.A0D = r0
            r0 = r23
            r11.A0L = r0
            r0 = r17
            r11.A0J = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.A0H = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.A0E = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.A0G = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.A0F = r0
            java.util.Iterator r10 = r1.iterator()
        L_0x005e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r9 = r10.next()
            X.UxB r9 = (X.C16559UxB) r9
            int r2 = r9.ordinal()
            r1 = 3
            r0 = 2
            if (r2 == r5) goto L_0x00b0
            if (r2 == r0) goto L_0x00aa
            if (r2 != r1) goto L_0x00be
            java.lang.Integer r8 = X.AnonymousClass05K.A1I
            r0 = 1
            r7 = 10
        L_0x007b:
            r6 = 0
        L_0x007c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r1 = r11.A0D
            boolean r3 = X.C55146Hcu.A00(r1)
            r2 = 0
            X.UKG r1 = new X.UKG
            r1.<init>()
            r1.A04 = r9
            r1.A06 = r4
            r1.A07 = r3
            r1.A08 = r2
            r1.A02 = r0
            r1.A01 = r2
            r1.A03 = r7
            r1.A00 = r6
            r1.A05 = r8
            java.util.List r0 = r11.A0E
            r0.add(r1)
            java.util.Map r0 = r11.A0G
            r0.put(r9, r1)
            goto L_0x005e
        L_0x00aa:
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            r0 = 1
            r7 = 3
            r6 = 2
            goto L_0x007c
        L_0x00b0:
            com.instagram.user.model.ProductCollection r0 = r11.A01
            if (r0 != 0) goto L_0x00b9
            boolean r1 = r11.A0I
            r0 = 0
            if (r1 == 0) goto L_0x00ba
        L_0x00b9:
            r0 = 1
        L_0x00ba:
            java.lang.Integer r8 = X.AnonymousClass05K.A1F
            r7 = 1
            goto L_0x007b
        L_0x00be:
            java.lang.String r1 = "Invalid module type"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            r11.A01()
            r0 = r27
            r11.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAP.<init>(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.6z9, X.1Xj, X.VjM, X.X9a, X.UKi, X.VvA, X.VvA, X.X7y, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    private final void A01() {
        int i = 0;
        ArrayList arrayList = new ArrayList(AnonymousClass7TE.A1I(0));
        for (UKG ukg : this.A0E) {
            i += ukg.A01;
            AnonymousClass7TF.A1M(arrayList, i);
        }
        this.A02 = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r5.A0I != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C16559UxB r6, java.util.List r7) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r7, r4)
            r2 = 1
            java.util.Map r0 = r5.A0G
            java.lang.Object r3 = r0.get(r6)
            X.UKG r3 = (X.UKG) r3
            if (r3 == 0) goto L_0x0048
            X.UxB r0 = X.C16559UxB.TAGGED_PRODUCT
            if (r6 != r0) goto L_0x001f
            com.instagram.user.model.ProductCollection r0 = r5.A01
            if (r0 != 0) goto L_0x001c
            boolean r1 = r5.A0I
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r3.A02 = r0
        L_0x001f:
            r1 = 0
            r5.A04(r6, r4)
            r3.A08 = r2
            java.util.List r0 = r3.A06
            java.util.ArrayList r2 = X.00k.A0U(r0)
            r2.clear()
            r2.addAll(r7)
            r3.A06 = r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0040
            int r1 = r3.A02
            int r0 = r2.size()
            int r1 = r1 + r0
        L_0x0040:
            r3.A01 = r1
            r5.A01()
            r5.notifyDataSetChanged()
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAP.A03(X.UxB, java.util.List):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object obj;
        String str;
        TextView textView;
        String str2;
        0qQ.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                textView = C66582MXn.A0E(DbV.A0D(viewGroup), viewGroup, R.layout.more_products_section_title, false);
                Context context = this.A03;
                0nA.A0e(textView, AnonymousClass7TG.A02(context));
                ProductCollection productCollection = this.A01;
                if (productCollection == null || (str2 = productCollection.getTitle()) == null) {
                    if (this.A0I) {
                        str2 = AnonymousClass7TF.A0d(context.getResources(), 2131973840);
                    } else {
                        throw new IllegalStateException("Invalid tagged product section title");
                    }
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Context context2 = this.A03;
                        obj = C18248VoF.A00(context2, viewGroup, 0nA.A08(context2) / (0nA.A09(context2) / 2)).getTag();
                        str = "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ProductFeedShimmerViewBinder.Holder";
                    } else if (i == 5) {
                        View inflate = DbV.A0D(viewGroup).inflate(R.layout.account_section, viewGroup, false);
                        C13988Tno.A0q(inflate.getContext(), inflate, R.attr.elevatedBackgroundDrawable);
                        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                        0qQ.A0A(inflate);
                        inflate.setTag(new UDY(inflate));
                        0nA.A0e(inflate, AnonymousClass7TG.A02(this.A03));
                        obj = inflate.getTag();
                        str = "null cannot be cast to non-null type com.instagram.shopping.widget.continueshopping.ContinueShoppingViewBinder.Holder";
                    } else if (i == 10) {
                        View A0D2 = DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.visual_search_headline, false);
                        C14892UDu uDu = new C14892UDu(A0D2);
                        A0D2.setTag(uDu);
                        return uDu;
                    } else {
                        throw DbW.A0b("Invalid viewType: ", i);
                    }
                    0qQ.A0C(obj, str);
                    return (C249703kE) obj;
                }
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                textView = C66582MXn.A0E(DbV.A0D(viewGroup), viewGroup, R.layout.more_products_section_title, false);
                Context context3 = this.A03;
                0nA.A0e(textView, AnonymousClass7TG.A02(context3));
                str2 = AnonymousClass7TF.A0d(context3.getResources(), 2131973778);
            }
            return new UC8(textView, this, str2);
        }
        boolean A022 = A02(this, i);
        LayoutInflater A0D3 = DbV.A0D(viewGroup);
        if (A022) {
            0qQ.A07(A0D3);
            int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UE2(DbT.A0D(A0D3, viewGroup, R.layout.full_width_product_tile, false));
        }
        View A092 = DbU.A09(A0D3, viewGroup, R.layout.product_tile_grid_item, false);
        A092.setTag(new UEM(A092, false));
        0nA.A0f(A092, 0nA.A09(this.A03) / 2);
        obj = A092.getTag();
        str = "null cannot be cast to non-null type com.instagram.shopping.widget.producttile.ProductTileViewBinder.ViewHolder";
        0qQ.A0C(obj, str);
        return (C249703kE) obj;
    }

    public static final User A00(UAP uap) {
        User A11;
        boolean A002 = C55146Hcu.A00(uap.A0D);
        1Xj r3 = uap.A07;
        if (!A002) {
            Object obj = uap.A0G.get(C16559UxB.TAGGED_PRODUCT);
            if (obj != null) {
                List<ProductFeedItem> list = ((UKG) obj).A06;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (ProductFeedItem A022 : list) {
                        Product A023 = A022.A02();
                        if (A023 != null) {
                            arrayList.add(A023);
                        }
                    }
                }
                User A003 = C17089VHl.A00(uap.A05, r3, arrayList);
                0qQ.A0A(A003);
                return A003;
            }
            throw AnonymousClass7TE.A0y();
        } else if (r3 != null && (A11 = C51966G9m.A11(r3)) != null) {
            return A11;
        } else {
            throw new IllegalStateException("Merchant is null");
        }
    }

    public static final boolean A02(UAP uap, int i) {
        UKG ukg;
        List list;
        1Xj r1 = uap.A07;
        if (r1 == null || C51968G9o.A1W(uap.A05, r1) || i != 0 || (ukg = (UKG) uap.A0G.get(C16559UxB.TAGGED_PRODUCT)) == null || (list = ukg.A06) == null || list.size() != 1) {
            return false;
        }
        return true;
    }

    public final void A04(C16559UxB uxB, boolean z) {
        Map map = this.A0G;
        if (map.get(uxB) != null) {
            UKG ukg = (UKG) map.get(uxB);
            if (ukg != null) {
                ukg.A07 = z;
            }
            notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: X.Vj5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: X.Vj5} */
    /* JADX WARNING: type inference failed for: r10v22, types: [X.V3k, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0468, code lost:
        if (X.C55146Hcu.A00(r0.A0D) != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0596, code lost:
        if (r4.A1e(r0.A05).A63() == false) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0139, code lost:
        if (r12 == X.C16560UxC.A07) goto L_0x013b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r43, int r44) {
        /*
            r42 = this;
            r6 = r44
            r1 = r43
            r2 = 0
            r0 = r42
            int r8 = X.JTP.A07(r0, r1, r2, r6)
            r4 = 1
            if (r8 == 0) goto L_0x0072
            if (r8 == r4) goto L_0x0071
            r3 = 2
            if (r8 == r3) goto L_0x0072
            r3 = 3
            if (r8 == r3) goto L_0x0071
            r3 = 4
            if (r8 == r3) goto L_0x05f3
            r3 = 5
            if (r8 == r3) goto L_0x057a
            r3 = 10
            if (r8 != r3) goto L_0x0573
            X.UDu r1 = (X.C14892UDu) r1
            X.1Xj r4 = r0.A07
            java.lang.Integer r3 = r0.A0L
            if (r3 == 0) goto L_0x0035
            int r3 = r3.intValue()
            if (r4 == 0) goto L_0x0035
            X.1Xj r3 = r4.A1c(r3)
            if (r3 == 0) goto L_0x0035
            r4 = r3
        L_0x0035:
            X.0iw r6 = r0.A04
            X.VjM r5 = r0.A0J
            X.0qQ.A0B(r1, r2)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r1.A00
            r0 = 8
            r3.setVisibility(r0)
            if (r4 == 0) goto L_0x0071
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r4.A1n(r0)
            if (r0 == 0) goto L_0x0055
            r3.setVisibility(r2)
            r3.setUrl(r0, r6)
        L_0x0055:
            com.instagram.igds.components.button.IgdsButton r2 = r1.A02
            r0 = 64
            X.WB4.A00(r2, r1, r4, r5, r0)
            com.instagram.igds.components.button.IgdsButton r2 = r1.A04
            r0 = 65
            X.WB4.A00(r2, r1, r4, r5, r0)
            com.instagram.igds.components.button.IgdsButton r2 = r1.A01
            r0 = 66
            X.WB4.A00(r2, r1, r4, r5, r0)
            com.instagram.igds.components.button.IgdsButton r2 = r1.A03
            r0 = 67
            X.WB4.A00(r2, r1, r4, r5, r0)
        L_0x0071:
            return
        L_0x0072:
            java.util.List r10 = r0.A0E
            int r9 = r10.size()
            r5 = 0
        L_0x0079:
            if (r5 >= r9) goto L_0x0071
            java.lang.Object r7 = r10.get(r5)
            X.UKG r7 = (X.UKG) r7
            int r3 = r7.A00
            if (r3 != r8) goto L_0x0442
            java.util.List r5 = r0.A02
            if (r5 != 0) goto L_0x0093
            java.lang.String r0 = "moduleTypeBoundaries"
            X.0qQ.A0F(r0)
        L_0x008e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0093:
            int r3 = r10.indexOf(r7)
            int r3 = X.C51971G9r.A0I(r5, r3)
            int r6 = r44 - r3
            int r3 = r7.A02
            int r6 = r6 - r3
            java.util.List r3 = r7.A06
            java.lang.Object r3 = X.00k.A0O(r3, r6)
            com.instagram.model.shopping.productfeed.ProductFeedItem r3 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r3
            if (r3 == 0) goto L_0x0071
            java.lang.Integer r5 = r7.A05
            java.lang.String r39 = X.VH1.A00(r5)
            boolean r5 = A02(r0, r8)
            if (r5 == 0) goto L_0x0446
            X.UE2 r1 = (X.UE2) r1
            com.instagram.common.session.UserSession r7 = r0.A05
            X.1Xj r9 = r0.A07
            com.instagram.user.model.Product r6 = r3.A02()
            if (r6 == 0) goto L_0x0648
            if (r9 == 0) goto L_0x0428
            boolean r5 = r9.A6X(r7)
            if (r5 == 0) goto L_0x0428
            com.instagram.api.schemas.ProductCardSubtitleType r12 = com.instagram.api.schemas.ProductCardSubtitleType.MERCHANT_NAME
        L_0x00cc:
            X.X9a r5 = r0.A08
            java.lang.Integer r16 = X.AnonymousClass05K.A06
            r17 = 0
            java.lang.String r6 = r0.A0D
            boolean r20 = X.C55146Hcu.A00(r6)
            r13 = r7
            r14 = r3
            r15 = r5
            r18 = r2
            r19 = r2
            X.0eP r6 = X.W3C.A05(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r8 = r6.A00
            X.4Yx r8 = (X.C266444Yx) r8
            java.lang.Object r6 = r6.A01
            java.util.List r6 = (java.util.List) r6
            if (r9 == 0) goto L_0x0124
            com.instagram.user.model.Product r10 = r3.A02()
            if (r10 == 0) goto L_0x0124
            java.lang.String r11 = r10.A0C
            if (r11 == 0) goto L_0x0103
            java.lang.String r10 = "_"
            java.util.List r10 = X.DbW.A0o(r11, r10)
            java.lang.String[] r10 = X.DbU.A1b(r10, r2)
            if (r10 != 0) goto L_0x0105
        L_0x0103:
            java.lang.String[] r10 = new java.lang.String[r2]
        L_0x0105:
            r12 = r10[r2]
            r11 = r10[r4]
            X.1Xv r10 = X.1Xj.A0h
            java.lang.String r10 = r9.getId()
            if (r10 == 0) goto L_0x0643
            java.lang.String r10 = X.1Xv.A06(r10)
            X.1OC r13 = X.C17069VGr.A00(r7, r12, r11, r10)
            X.6z9 r12 = r0.A06
            r11 = 4
            X.HAu r10 = new X.HAu
            r10.<init>(r11, r3, r0)
            r12.A03(r13, r10)
        L_0x0124:
            r12 = 0
            if (r9 == 0) goto L_0x0425
            X.UxC r11 = r9.A25()
        L_0x012b:
            X.UxC r10 = X.C16560UxC.ADS_PRODUCT_PAGE
            if (r11 == r10) goto L_0x013b
            if (r9 == 0) goto L_0x0135
            X.UxC r12 = r9.A25()
        L_0x0135:
            X.UxC r9 = X.C16560UxC.SHOPLESS_IN_APP_BROWSER
            r27 = 1
            if (r12 != r9) goto L_0x013d
        L_0x013b:
            r27 = 0
        L_0x013d:
            java.lang.String r24 = r3.getId()
            X.0qQ.A07(r24)
            X.0iw r9 = r0.A04
            r38 = r9
            r10 = 2131967982(0x7f133fee, float:1.9572846E38)
            java.lang.String r9 = r3.A03()
            if (r9 != 0) goto L_0x0153
            java.lang.String r9 = ""
        L_0x0153:
            X.HsR r20 = X.JTR.A0g(r9, r10)
            com.instagram.model.mediasize.ImageInfo r22 = r3.A00()
            boolean r28 = r3.A05(r7)
            X.C18552Vu4.A00(r7)
            java.lang.String r33 = "tags"
            X.Wxh r26 = new X.Wxh
            r29 = r26
            r30 = r17
            r31 = r5
            r32 = r3
            r34 = r17
            r35 = r2
            r36 = r2
            r37 = r4
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.String r9 = r3.getId()
            X.0qQ.A07(r9)
            java.util.Map r7 = r0.A0H
            java.lang.Object r5 = r7.get(r9)
            X.Vj5 r5 = (X.C17969Vj5) r5
            if (r5 != 0) goto L_0x0192
            X.Vj5 r5 = new X.Vj5
            r5.<init>()
            r7.put(r9, r5)
        L_0x0192:
            X.WSP r7 = new X.WSP
            r21 = r8
            r23 = r5
            r25 = r6
            r19 = r38
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.util.List r5 = r0.A0F
            X.JwL r9 = new X.JwL
            r9.<init>((X.WSP) r7, (java.util.List) r5)
            r5 = 47
            X.PqS r8 = new X.PqS
            r8.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r3)
            r5 = 49
            X.JG2 r7 = new X.JG2
            r7.<init>(r5, r3, r0)
            r6 = 22
            X.JJS r5 = new X.JJS
            r5.<init>(r6, r0, r3)
            X.VX2 r0 = new X.VX2
            r0.<init>(r8, r7, r5)
            X.WSD r5 = new X.WSD
            r5.<init>(r9, r0)
            X.0qQ.A0B(r1, r2)
            r16 = 2
            X.0eM r0 = r1.A02
            java.lang.Object r6 = r0.getValue()
            X.UDZ r6 = (X.UDZ) r6
            X.JwL r0 = r5.A00
            r25 = r0
            java.lang.Object r8 = r0.A00
            X.WSP r8 = (X.WSP) r8
            X.0qQ.A0B(r6, r2)
            X.0qQ.A0B(r8, r4)
            android.view.View r0 = r6.A00
            r0.setVisibility(r2)
            X.VZt r10 = r6.A01
            X.0qQ.A0B(r10, r2)
            X.UL5 r7 = r8.A00
            boolean r11 = r7.A05
            r3 = 8
            if (r11 == 0) goto L_0x0414
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A02
            r0.setVisibility(r2)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r10.A04
            r0.setVisibility(r3)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r13 = r10.A03
            r13.setVisibility(r2)
            int r15 = r13.getPaddingStart()
            int r14 = r13.getPaddingTop()
            android.content.Context r12 = r10.A01
            int r9 = X.DbY.A01(r12)
            int r0 = r13.getPaddingBottom()
            r13.setPaddingRelative(r15, r14, r9, r0)
            r0 = 2131972502(0x7f135196, float:1.9582013E38)
            X.DbU.A12(r12, r13, r0)
            boolean r0 = r7.A04
            r13.setSelected(r0)
            r13.A05()
            r0 = 16
            X.WBE.A00(r13, r0, r10, r8)
            X.Vj5 r12 = r10.A00
            X.VX1 r0 = r8.A01
            X.Vj5 r9 = r0.A01
            if (r12 == r9) goto L_0x0249
            if (r12 == 0) goto L_0x0244
            java.lang.ref.WeakReference r0 = r12.A00
            if (r0 == 0) goto L_0x0244
            java.lang.Object r0 = r0.get()
            if (r0 != r13) goto L_0x0244
            r0 = r17
            r12.A01(r0)
        L_0x0244:
            r10.A00 = r9
            r9.A01(r13)
        L_0x0249:
            X.VX0 r13 = r6.A02
            r9 = 341(0x155, float:4.78E-43)
            X.0qQ.A0B(r13, r2)
            java.util.List r0 = r7.A03
            r24 = r0
            boolean r10 = r24.isEmpty()
            com.instagram.shopping.widget.clickabletext.ClickableTextContainer r0 = r13.A02
            if (r10 == 0) goto L_0x032c
            r0.setVisibility(r3)
            android.widget.TextView r0 = r13.A01
            r0.setVisibility(r3)
            android.widget.TextView r0 = r13.A00
            r0.setVisibility(r3)
        L_0x0269:
            X.VZu r10 = r6.A03
            r11 = 2131165236(0x7f070034, float:1.7944683E38)
            X.0qQ.A0B(r10, r2)
            android.view.View r9 = r10.A02
            boolean r0 = r9 instanceof com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout
            if (r0 == 0) goto L_0x028c
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r9 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout) r9
            if (r9 == 0) goto L_0x028c
            android.content.Context r0 = r10.A00
            android.content.res.Resources r6 = r0.getResources()
            r0 = 2131165252(0x7f070044, float:1.7944716E38)
            int r0 = r6.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r9.setStrokeWidth(r0)
        L_0x028c:
            com.instagram.model.mediasize.ImageInfo r9 = r7.A02
            if (r9 == 0) goto L_0x02a7
            r0 = 1080(0x438, float:1.513E-42)
            int r6 = java.lang.Math.min(r11, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.model.mediasize.ExtendedImageUrl r9 = X.1iI.A05(r9, r0, r6)
            if (r9 == 0) goto L_0x02a7
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r10.A04
            X.VX1 r0 = r8.A01
            X.0iw r0 = r0.A00
            r6.setUrl(r9, r0)
        L_0x02a7:
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r10.A04
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            X.2eS.A04(r9, r8)
            android.content.Context r0 = r10.A00
            android.content.res.Resources r6 = X.AnonymousClass7TF.A0A(r0)
            X.HsR r0 = r7.A00
            java.lang.String r0 = X.C56259HvT.A00(r6, r0)
            r9.setContentDescription(r0)
            android.view.View r6 = r10.A01
            X.AnonymousClass7TG.A1N(r9, r6)
            X.IOw r0 = new X.IOw
            r0.<init>(r6, r2)
            r9.A0E = r0
            r0 = r25
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r12 = r0.iterator()
            r10 = 0
        L_0x02d4:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0602
            java.lang.Object r9 = r12.next()
            int r11 = r10 + 1
            if (r10 >= 0) goto L_0x02e7
            X.0sr.A1T()
            goto L_0x008e
        L_0x02e7:
            com.instagram.model.shopping.productfeed.ProductTileMedia r9 = (com.instagram.model.shopping.productfeed.ProductTileMedia) r9
            X.0eM r0 = r1.A04
            java.lang.Object r7 = X.C13989Tnp.A0h(r0, r10)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7
            X.0eM r0 = r1.A03
            java.lang.Object r6 = X.C13989Tnp.A0h(r0, r10)
            android.view.View r6 = (android.view.View) r6
            X.AnonymousClass7TG.A1N(r7, r6)
            X.IOw r0 = new X.IOw
            r0.<init>(r6, r2)
            r7.A0E = r0
            if (r9 == 0) goto L_0x0314
            com.instagram.model.mediasize.ImageInfoImpl r0 = r9.A00
            if (r0 == 0) goto L_0x0314
            com.instagram.model.mediasize.ExtendedImageUrl r6 = X.1iI.A04(r0, r8)
            if (r6 == 0) goto L_0x0314
            r0 = r38
            r7.setUrl(r6, r0)
        L_0x0314:
            r23 = 5
            X.ICQ r0 = new X.ICQ
            r17 = r0
            r18 = r1
            r19 = r7
            r20 = r5
            r21 = r9
            r22 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r0, r7)
            r10 = r11
            goto L_0x02d4
        L_0x032c:
            r0.setVisibility(r2)
            android.widget.TextView r12 = r13.A01
            r12.setVisibility(r2)
            android.widget.TextView r10 = r13.A00
            r10.setVisibility(r2)
            android.content.res.Resources r13 = r12.getResources()
            r15 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r13.getDimensionPixelSize(r15)
            X.0nA.A0d(r12, r0)
            android.content.res.Resources r14 = r10.getResources()
            int r0 = r14.getDimensionPixelSize(r15)
            X.0nA.A0d(r10, r0)
            int r0 = r14.getDimensionPixelSize(r15)
            X.0nA.A0U(r10, r0)
            if (r11 == 0) goto L_0x03a7
            android.content.Context r0 = r12.getContext()
            int r0 = X.JTR.A06(r0)
        L_0x0363:
            int r9 = r9 - r0
            X.0qQ.A07(r13)
            X.4Yx r0 = r7.A01
            X.0qQ.A0B(r0, r4)
            java.lang.CharSequence r0 = r0.A00(r13)
            r12.setContentDescription(r0)
            r0 = r24
            java.lang.Object r0 = r0.get(r4)
            X.VkX r0 = (X.C18049VkX) r0
            X.VkX[] r0 = new X.C18049VkX[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            java.util.ArrayList r14 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x038b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03a9
            java.lang.Object r13 = r15.next()
            X.VkX r13 = (X.C18049VkX) r13
            android.content.Context r11 = X.AnonymousClass7TE.A0S(r12)
            X.0rN r0 = X.C17097VHt.A00(r12, r9)
            java.lang.CharSequence r0 = r13.A00(r11, r0)
            r14.add(r0)
            goto L_0x038b
        L_0x03a7:
            r0 = 0
            goto L_0x0363
        L_0x03a9:
            java.util.ArrayList r22 = X.00k.A0U(r14)
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            java.lang.String r19 = "\n"
            java.lang.String r20 = ""
            r18 = r11
            r21 = r20
            r23 = r17
            X.00k.A0q(r18, r19, r20, r21, r22, r23)
            android.content.Context r14 = r12.getContext()
            r13 = 2132018624(0x7f1405c0, float:1.967556E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r14, r13)
            X.C66582MXn.A12(r11, r0, r2)
            r12.setText(r11)
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            r0 = r24
            java.lang.Object r11 = r0.get(r2)
            X.VkX r11 = (X.C18049VkX) r11
            android.content.Context r13 = X.AnonymousClass7TE.A0S(r10)
            X.0rN r0 = X.C17097VHt.A00(r10, r9)
            java.lang.CharSequence r0 = r11.A00(r13, r0)
            android.text.SpannableStringBuilder r12 = r12.append(r0)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            android.text.style.TextAppearanceSpan r9 = new android.text.style.TextAppearanceSpan
            r9.<init>(r13, r0)
            int r0 = r12.length()
            r11 = 17
            r12.setSpan(r9, r2, r0, r11)
            int r0 = X.C51968G9o.A04(r13)
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            r9.<init>(r0)
            int r0 = r12.length()
            r12.setSpan(r9, r2, r0, r11)
            r10.setText(r12)
            goto L_0x0269
        L_0x0414:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r10.A03
            r0.setVisibility(r3)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r10.A04
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgFrameLayout r0 = r10.A02
            r0.setVisibility(r3)
            goto L_0x0249
        L_0x0425:
            r11 = r12
            goto L_0x012b
        L_0x0428:
            com.instagram.api.schemas.ProductReviewStatus r5 = r6.A05
            if (r5 == 0) goto L_0x043e
            int r6 = r5.ordinal()
            r5 = 5
            if (r6 == r5) goto L_0x043a
            r5 = 4
            if (r6 != r5) goto L_0x043e
            com.instagram.api.schemas.ProductCardSubtitleType r12 = com.instagram.api.schemas.ProductCardSubtitleType.IN_REVIEW
            goto L_0x00cc
        L_0x043a:
            com.instagram.api.schemas.ProductCardSubtitleType r12 = com.instagram.api.schemas.ProductCardSubtitleType.NOT_APPROVED
            goto L_0x00cc
        L_0x043e:
            com.instagram.api.schemas.ProductCardSubtitleType r12 = com.instagram.api.schemas.ProductCardSubtitleType.PRICE
            goto L_0x00cc
        L_0x0442:
            int r5 = r5 + 1
            goto L_0x0079
        L_0x0446:
            int r12 = r6 / 2
            int r7 = r6 % 2
            X.1Xj r6 = r0.A07
            if (r6 == 0) goto L_0x0570
            X.UxC r9 = r6.A25()
        L_0x0452:
            X.UxC r5 = X.C16560UxC.ADS_PRODUCT_PAGE
            if (r9 == r5) goto L_0x046a
            if (r6 == 0) goto L_0x056d
            X.UxC r9 = r6.A25()
        L_0x045c:
            X.UxC r5 = X.C16560UxC.SHOPLESS_IN_APP_BROWSER
            if (r9 == r5) goto L_0x046a
            java.lang.String r5 = r0.A0D
            boolean r5 = X.C55146Hcu.A00(r5)
            r37 = 0
            if (r5 == 0) goto L_0x046c
        L_0x046a:
            r37 = 1
        L_0x046c:
            android.view.View r11 = r1.itemView
            X.0qQ.A06(r11)
            android.content.Context r13 = r0.A03
            int r10 = X.DbY.A01(r13)
            android.content.res.Resources r5 = r13.getResources()
            r9 = 2131165184(0x7f070000, float:1.7944578E38)
            int r5 = r5.getDimensionPixelSize(r9)
            if (r7 != 0) goto L_0x0565
            X.0nA.A0Z(r11, r5)
            X.0nA.A0b(r11, r10)
        L_0x0489:
            int r5 = X.AnonymousClass7TF.A02(r13, r9)
            X.0nA.A0e(r11, r5)
            r11 = r1
            X.UEM r11 = (X.UEM) r11
            com.instagram.common.session.UserSession r10 = r0.A05
            X.0iw r14 = r0.A04
            if (r8 != 0) goto L_0x0561
            java.lang.String r27 = "tags"
        L_0x049b:
            r16 = 0
            com.instagram.user.model.Product r5 = r3.A02()
            if (r6 == 0) goto L_0x0545
            boolean r6 = r6.A6X(r10)
            if (r6 == 0) goto L_0x0545
            com.instagram.api.schemas.ProductCardSubtitleType r15 = com.instagram.api.schemas.ProductCardSubtitleType.MERCHANT_NAME
        L_0x04ab:
            java.lang.Integer r25 = X.AnonymousClass05K.A06
            X.X9a r13 = r0.A08
            java.lang.String r9 = r3.getId()
            X.0qQ.A07(r9)
            java.util.Map r6 = r0.A0H
            java.lang.Object r5 = r6.get(r9)
            X.Vj5 r5 = (X.C17969Vj5) r5
            if (r5 != 0) goto L_0x04c8
            X.Vj5 r5 = new X.Vj5
            r5.<init>()
            r6.put(r9, r5)
        L_0x04c8:
            java.lang.String r6 = r0.A0D
            boolean r38 = X.C55146Hcu.A00(r6)
            r18 = r16
            r20 = r16
            r24 = r16
            r26 = r16
            r28 = r27
            r29 = r12
            r30 = r7
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r4
            r21 = r5
            r22 = r3
            r23 = r13
            r19 = r10
            r17 = r14
            X.WSj r2 = X.W3C.A03(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.C17099VHv.A00(r11, r2)
            if (r8 != 0) goto L_0x0543
            X.UKi r2 = r0.A09
            if (r2 == 0) goto L_0x0543
            java.lang.String r4 = r2.A05
        L_0x0501:
            if (r8 != 0) goto L_0x0541
            X.UKi r2 = r0.A09
            if (r2 == 0) goto L_0x0541
            X.9Iz r2 = r2.A01
        L_0x0509:
            X.ULC r6 = new X.ULC
            r37 = r2
            r38 = r16
            r40 = r4
            r41 = r16
            r36 = r6
            r36.<init>(r37, r38, r39, r40, r41)
            com.instagram.user.model.Product r5 = r3.A02()
            if (r5 == 0) goto L_0x0071
            com.instagram.model.shopping.productfeed.ProductFeedItem r2 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r2.<init>(r5)
            X.UO3 r4 = new X.UO3
            r4.<init>((com.instagram.model.shopping.productfeed.ProductFeedItem) r2, (X.ULC) r6)
            if (r8 != 0) goto L_0x053e
            X.VvA r3 = r0.A0B
        L_0x052c:
            java.lang.String r2 = X.C13989Tnp.A0q(r5)
            X.VSz r0 = new X.VSz
            r0.<init>(r12, r7)
            r3.A02(r0, r4, r2)
            android.view.View r0 = r1.itemView
            r3.A01(r0, r4)
            return
        L_0x053e:
            X.VvA r3 = r0.A0A
            goto L_0x052c
        L_0x0541:
            r2 = 0
            goto L_0x0509
        L_0x0543:
            r4 = 0
            goto L_0x0501
        L_0x0545:
            if (r5 == 0) goto L_0x055d
            com.instagram.api.schemas.ProductReviewStatus r5 = r5.A05
            if (r5 == 0) goto L_0x055d
            int r6 = r5.ordinal()
            r5 = 5
            if (r6 == r5) goto L_0x0559
            r5 = 4
            if (r6 != r5) goto L_0x055d
            com.instagram.api.schemas.ProductCardSubtitleType r15 = com.instagram.api.schemas.ProductCardSubtitleType.IN_REVIEW
            goto L_0x04ab
        L_0x0559:
            com.instagram.api.schemas.ProductCardSubtitleType r15 = com.instagram.api.schemas.ProductCardSubtitleType.NOT_APPROVED
            goto L_0x04ab
        L_0x055d:
            com.instagram.api.schemas.ProductCardSubtitleType r15 = com.instagram.api.schemas.ProductCardSubtitleType.PRICE
            goto L_0x04ab
        L_0x0561:
            java.lang.String r27 = "more_from_this_business"
            goto L_0x049b
        L_0x0565:
            X.0nA.A0Z(r11, r10)
            X.0nA.A0b(r11, r5)
            goto L_0x0489
        L_0x056d:
            r9 = 0
            goto L_0x045c
        L_0x0570:
            r9 = 0
            goto L_0x0452
        L_0x0573:
            java.lang.String r0 = "Invalid viewType: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r8)
            throw r0
        L_0x057a:
            com.instagram.user.model.User r7 = A00(r0)
            r8 = r1
            X.UDY r8 = (X.UDY) r8
            X.0iw r6 = r0.A04
            android.content.Context r5 = r0.A03
            X.1Xj r4 = r0.A07
            if (r4 == 0) goto L_0x0598
            com.instagram.common.session.UserSession r3 = r0.A05
            X.1Xj r3 = r4.A1e(r3)
            boolean r4 = r3.A63()
            r3 = 2131973743(0x7f13566f, float:1.958453E38)
            if (r4 != 0) goto L_0x059b
        L_0x0598:
            r3 = 2131973742(0x7f13566e, float:1.9584528E38)
        L_0x059b:
            java.lang.String r4 = r5.getString(r3)
            if (r7 == 0) goto L_0x05f1
            java.lang.String r3 = X.C13988Tno.A0b(r7)
        L_0x05a5:
            X.V3k r10 = new X.V3k
            r10.<init>()
            r10.A00 = r7
            r10.A02 = r4
            r10.A01 = r3
            X.X7y r5 = r0.A0K
            X.0qQ.A0B(r8, r2)
            java.lang.String r9 = r10.A02
            X.0qQ.A07(r9)
            java.lang.String r4 = r10.A01
            com.instagram.user.model.User r0 = r10.A00
            X.4Cl r0 = r0.A03
            com.instagram.common.typedurl.ImageUrl r3 = r0.Bh3()
            r0 = 14
            X.WBE r2 = new X.WBE
            r2.<init>((int) r0, (java.lang.Object) r10, (java.lang.Object) r5)
            android.view.View r0 = r8.A00
            X.AnonymousClass0fU.A00(r2, r0)
            android.widget.TextView r0 = r8.A02
            r0.setText(r9)
            android.widget.TextView r0 = r8.A01
            r0.setText(r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r8.A03
            if (r3 != 0) goto L_0x05ed
            r0.A09()
        L_0x05e1:
            r5.A8A(r7)
            android.view.View r0 = r1.itemView
            X.0qQ.A06(r0)
            r5.EBX(r0)
            return
        L_0x05ed:
            r0.setUrl(r3, r6)
            goto L_0x05e1
        L_0x05f1:
            r3 = 0
            goto L_0x05a5
        L_0x05f3:
            X.UBY r1 = (X.UBY) r1
            X.Uit r0 = new X.Uit
            r0.<init>(r4)
            X.HES r0 = r0.A00()
            X.C18248VoF.A01(r1, r0)
            return
        L_0x0602:
            android.view.View r2 = r1.A00
            r0 = 2131442764(0x7f0b3c4c, float:1.8507577E38)
            android.view.View r9 = r2.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            X.4gb r8 = X.JTQ.A0C(r9)
            r7 = 2131442003(0x7f0b3953, float:1.8506034E38)
            r6 = 2131434531(0x7f0b1c23, float:1.8490879E38)
            r2 = r16
            r8.A0D(r7, r2, r6, r2)
            r0 = 3
            r8.A0D(r7, r0, r6, r0)
            r8.A0D(r7, r4, r6, r4)
            r0 = 4
            r8.A0D(r7, r0, r6, r0)
            r8.A0G(r9)
            android.view.View r6 = r1.itemView
            X.VX2 r4 = r5.A01
            X.0sP r2 = r4.A00
            r0 = 9
            X.WB0.A00(r6, r0, r2)
            X.Vjm r2 = r1.A01
            X.Wvv r0 = new X.Wvv
            r0.<init>(r3, r1, r5)
            r2.A00 = r0
            X.0sL r0 = r4.A01
            r2.A01 = r0
            return
        L_0x0643:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0648:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAP.onBindViewHolder(X.3kE, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r3.A1e(r6.A05).A5j() != true) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemCount() {
        /*
            r6 = this;
            r0 = -1680864216(0xffffffff9bd00c28, float:-3.441857E-22)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.util.List r0 = r6.A0E
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r2.next()
            X.UKG r0 = (X.UKG) r0
            boolean r1 = r0.A07
            int r0 = r0.A01
            if (r1 == 0) goto L_0x005f
            int r5 = r5 + 1
        L_0x0022:
            X.1Xj r3 = r6.A07
            r2 = 1
            if (r3 == 0) goto L_0x0034
            com.instagram.common.session.UserSession r0 = r6.A05
            X.1Xj r0 = r3.A1e(r0)
            boolean r0 = r0.A5j()
            r1 = 1
            if (r0 == r2) goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            java.lang.String r0 = r6.A0D
            boolean r0 = X.C55146Hcu.A00(r0)
            if (r0 != 0) goto L_0x0056
            if (r1 != 0) goto L_0x0056
            r2 = 0
            if (r3 == 0) goto L_0x005d
            X.UxC r1 = r3.A25()
        L_0x0046:
            X.UxC r0 = X.C16560UxC.ADS_PRODUCT_PAGE
            if (r1 == r0) goto L_0x0056
            if (r3 == 0) goto L_0x0050
            X.UxC r2 = r3.A25()
        L_0x0050:
            X.UxC r0 = X.C16560UxC.SHOPLESS_IN_APP_BROWSER
            if (r2 == r0) goto L_0x0056
            int r5 = r5 + 1
        L_0x0056:
            r0 = -606195482(0xffffffffdbde30e6, float:-1.25082418E17)
            X.AnonymousClass0fD.A0A(r0, r4)
            return r5
        L_0x005d:
            r1 = r2
            goto L_0x0046
        L_0x005f:
            int r5 = r5 + r0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAP.getItemCount():int");
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(-1585778236);
        List list = this.A02;
        if (list != null) {
            int size = list.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i2 = 5;
                    i3 = -108388082;
                    break;
                }
                List list2 = this.A02;
                if (list2 == null) {
                    break;
                }
                int A0I2 = C51971G9r.A0I(list2, i4);
                if (i <= A0I2) {
                    if (i == A0I2) {
                        List list3 = this.A02;
                        if (list3 == null) {
                            break;
                        } else if (i4 == C51966G9m.A06(list3)) {
                            continue;
                        }
                    }
                    if (i < A0I2) {
                        i2 = ((UKG) this.A0E.get(i4 - 1)).A00;
                        i3 = 101405055;
                        break;
                    } else if (i == A0I2) {
                        UKG ukg = (UKG) this.A0E.get(i4);
                        boolean z = ukg.A07;
                        int i5 = ukg.A02;
                        int i6 = ukg.A01;
                        i2 = ukg.A03;
                        int i7 = ukg.A00;
                        if (z) {
                            i2 = 4;
                            i3 = 847079414;
                            break;
                        } else if (i5 == 0) {
                            AnonymousClass0fD.A0A(1884661589, A032);
                            return i7;
                        } else if (i6 > 0) {
                            i3 = -1753520951;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i4++;
            }
            AnonymousClass0fD.A0A(i3, A032);
            return i2;
        }
        0qQ.A0F("moduleTypeBoundaries");
        throw AnonymousClass00P.createAndThrow();
    }
}
