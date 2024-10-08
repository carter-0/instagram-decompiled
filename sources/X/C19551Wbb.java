package X;

import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* renamed from: X.Wbb  reason: case insensitive filesystem */
public final class C19551Wbb implements C337247fx, G9d, C337277g0 {
    public final int A00;
    public final Object A01;

    public C19551Wbb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final 1OC AMx(String str, String str2) {
        C47165Drg drg;
        String str3;
        String str4 = str;
        switch (this.A00) {
            case 0:
                String A0j = AnonymousClass7TG.A0j();
                K5H k5h = (K5H) this.A01;
                return C64364Lag.A00(k5h.A02, k5h.A0B, k5h.A0F, str4, A0j, k5h.A00);
            case 1:
                0qQ.A0B(str4, 0);
                UZ3 uz3 = ((C17637VbT) this.A01).A00.A00;
                String A0D = uz3.A0D();
                boolean A0K = 0qQ.A0K(A0D, AnonymousClass000.A00(2725));
                UserSession A0l = AnonymousClass7TE.A0l(uz3.A08);
                if (!A0K) {
                    new C47165Drg(str4, A0D, (String) null, (String) null, (String) null, (String) null, 50, true, false, false);
                }
                return FFZ.A03(A0l, drg);
            case 2:
                C19743Wek wek = (C19743Wek) this.A01;
                1NY A0O = DbU.A0O(wek.A05);
                boolean z = wek instanceof C16230Uqt;
                if (z) {
                    ProductSource productSource = ((C16230Uqt) wek).A00;
                    if (productSource == null || productSource.A00 != C16659Uyv.BRAND) {
                        str3 = "commerce/catalogs/selected/available_product_sections/";
                    } else {
                        str3 = "commerce/highlighted_and_available_products/";
                    }
                } else if (wek instanceof C16229Uqs) {
                    str3 = "commerce/catalogs/selected/shop_manager_products/";
                } else if (wek instanceof C16228Uqr) {
                    str3 = "commerce/shop_management/edit_products_feed/";
                } else {
                    str3 = "commerce/seller_collection_picker_feed/";
                }
                A0O.A0E = str3;
                A0O.A0G("query", str4);
                A0O.A0G("max_id", wek.A02);
                A0O.A0R(UY9.class, C18264VoV.class);
                if (z) {
                    C16230Uqt uqt = (C16230Uqt) wek;
                    ProductSource productSource2 = uqt.A00;
                    if (productSource2 != null && productSource2.A00 == C16659Uyv.BRAND) {
                        0qQ.A0A(productSource2);
                        A0O.A9m("merchant_id", productSource2.A01);
                    }
                    List list = uqt.A02;
                    if (list != null) {
                        A0O.A9m(AnonymousClass000.A00(1862), C51970G9q.A0k(list));
                    }
                    C16581Uxb uxb = uqt.A03;
                    if (uxb != null) {
                        A0O.A9m("surface", uxb.A00);
                    }
                    String str5 = uqt.A01;
                    if (str5 != null) {
                        A0O.A9m("waterfall_id", str5);
                    }
                }
                return A0O.A0M();
            default:
                0qQ.A0B(str4, 0);
                C15401Uc7 uc7 = (C15401Uc7) this.A01;
                return FFZ.A03(uc7.getSession(), new C47165Drg(str4, AnonymousClass000.A00(5362), (String) null, (String) null, uc7.A08, uc7.A09, 50, false, false, false));
        }
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DeH(String str) {
        if (1 - this.A00 == 0) {
            0qQ.A0B(str, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        if (r5 == null) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DeM(X.C268654dm r15, java.lang.String r16) {
        /*
            r14 = this;
            int r0 = r14.A00
            r10 = r16
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0069;
                case 2: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r2 = r14.A01
            X.Wek r2 = (X.C19743Wek) r2
            java.lang.String r0 = r2.A01
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0007
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A00 = r0
            X.X6y r1 = r2.A06
            boolean r13 = r2.A03
            java.lang.Throwable r6 = r15.A01()
            X.WcL r1 = (X.C19596WcL) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x014b;
                case 2: goto L_0x016d;
                case 3: goto L_0x0184;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.Object r2 = r1.A01
            X.U8r r2 = (X.C14781U8r) r2
            X.Uql r1 = r2.A02
            r0 = 0
            r1.A05(r0)
            X.WyZ r0 = X.C20762WyZ.A00
            X.C14781U8r.A00(r2, r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 11
            X.C13991Tnr.A1K(r2, r1, r0)
            return
        L_0x0040:
            java.lang.Object r3 = r14.A01
            X.K5H r3 = (X.K5H) r3
            java.lang.String r0 = r3.A0M
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0007
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.7g2 r0 = r3.A0e
            X.9P5 r0 = r0.BiX(r10)
            java.util.List r1 = r0.A06
            if (r1 == 0) goto L_0x01a1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01a1
            r2.addAll(r1)
            r0 = 1
            X.K5H.A0A(r3, r2, r0)
            return
        L_0x0069:
            r2 = 0
            X.0qQ.A0B(r10, r2)
            java.lang.Object r1 = r14.A01
            X.VbT r1 = (X.C17637VbT) r1
            java.util.Set r0 = r1.A03
            r0.add(r10)
            X.VMG r0 = r1.A01
            X.UZ3 r1 = r0.A00
            X.UdQ r0 = r1.A08()
            r0.A00 = r2
            X.UdQ r0 = r1.A08()
            r0.A00()
            return
        L_0x0088:
            r3 = 1
            X.0qQ.A0B(r10, r3)
            java.lang.Object r2 = r1.A01
            X.Uan r2 = (X.C15338Uan) r2
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r1 = r2.A0A
            if (r1 == 0) goto L_0x0098
            r0 = 0
            r1.setRefreshing(r0)
        L_0x0098:
            X.UAC r5 = r2.A0M
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r5.A00 = r0
            r5.notifyDataSetChanged()
            X.W02 r4 = r2.A05
            java.lang.String r1 = "logger"
            r7 = 0
            if (r4 == 0) goto L_0x00bc
            java.util.List r0 = r5.A01()
            r4.A02 = r0
            boolean r0 = r2.A0B
            X.W02 r5 = r2.A05
            if (r0 == 0) goto L_0x00c4
            if (r5 == 0) goto L_0x00bc
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r0 = r2.A08
            if (r0 != 0) goto L_0x0134
            java.lang.String r1 = "arguments"
        L_0x00bc:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c4:
            if (r6 == 0) goto L_0x0131
            if (r5 == 0) goto L_0x00bc
            java.lang.String r7 = r6.getMessage()
        L_0x00cc:
            X.0wc r1 = r5.A03
            java.lang.String r0 = "instagram_shopping_product_tagging_load_failure"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            com.instagram.model.shopping.ProductSource r0 = r5.A01
            if (r0 == 0) goto L_0x012e
            X.Uyv r0 = r0.A00
            java.lang.String r1 = r0.toString()
        L_0x00de:
            java.lang.String r0 = "selected_source_type"
            r4.AAJ(r0, r1)
            com.instagram.model.shopping.ProductSource r0 = r5.A01
            if (r0 == 0) goto L_0x012c
            java.lang.String r1 = r0.A01
        L_0x00e9:
            java.lang.String r0 = "selected_source_id"
            java.lang.String r1 = X.W02.A00(r4, r5, r0, r1)
            java.lang.String r0 = "selected_source_name"
            r4.AAJ(r0, r1)
            java.lang.String r0 = r5.A04
            X.C13988Tno.A1C(r4, r0)
            com.instagram.model.shopping.ProductSource r0 = r5.A01
            if (r0 == 0) goto L_0x012a
            X.Uyv r1 = r0.A00
            X.Uyv r0 = X.C16659Uyv.BRAND
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0109:
            java.lang.String r0 = "is_influencer"
            r4.A7p(r0, r1)
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "waterfall_id"
            r4.AAJ(r0, r1)
            java.lang.String r0 = "error_message"
            r4.AAJ(r0, r7)
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "prior_submodule"
            r4.AAJ(r0, r1)
            X.W02.A01(r4, r5)
            r4.Cgf()
            r2.A0B = r3
            goto L_0x013f
        L_0x012a:
            r1 = 0
            goto L_0x0109
        L_0x012c:
            r1 = 0
            goto L_0x00e9
        L_0x012e:
            java.lang.String r1 = ""
            goto L_0x00de
        L_0x0131:
            if (r5 != 0) goto L_0x00cc
            goto L_0x00bc
        L_0x0134:
            java.lang.Integer r8 = r0.A01
            r11 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r13)
            r9 = r7
            r5.A03(r6, r7, r8, r9, r10, r11)
        L_0x013f:
            X.Viu r0 = r2.A06
            if (r0 != 0) goto L_0x0147
            java.lang.String r1 = "perfLogger"
            goto L_0x00bc
        L_0x0147:
            r0.A01()
            return
        L_0x014b:
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r3 = r1.A01
            X.U8e r3 = (X.C14768U8e) r3
            X.VgG r8 = r3.A02
            r9 = 0
            r12 = 0
            r11 = r9
            r8.A00(r9, r10, r11, r12, r13)
            X.WyS r2 = X.C20755WyS.A00
            X.2Fj r1 = r3.A01
            X.2Fk r0 = r3.A00
            X.C13991Tnr.A0y(r0, r1, r2)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 6
            X.C13991Tnr.A1K(r3, r1, r0)
            return
        L_0x016d:
            java.lang.Object r3 = r1.A01
            X.U8q r3 = (X.C14780U8q) r3
            X.WyT r2 = X.C20756WyT.A00
            X.2Fj r1 = r3.A02
            X.2Fk r0 = r3.A01
            X.C13991Tnr.A0y(r0, r1, r2)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 8
            X.C13991Tnr.A1K(r3, r1, r0)
            return
        L_0x0184:
            java.lang.Object r3 = r1.A01
            X.U8g r3 = (X.C14770U8g) r3
            X.Uqk r1 = r3.A04
            r0 = 0
            r1.A05(r0)
            X.WyX r2 = X.C20760WyX.A00
            X.2Fj r1 = r3.A02
            X.2Fk r0 = r3.A01
            X.C13991Tnr.A0y(r0, r1, r2)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 10
            X.C13991Tnr.A1K(r3, r1, r0)
            return
        L_0x01a1:
            X.K9J r1 = r3.A0E
            java.util.List r0 = r1.A03
            r0.clear()
            java.util.List r0 = r1.A04
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A01(r0)
            r0 = 1
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19551Wbb.DeM(X.4dm, java.lang.String):void");
    }

    public final void DeW(String str) {
        switch (this.A00) {
            case 0:
                ActionButton actionButton = ((K5H) this.A01).A0A;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(0);
                    return;
                }
                return;
            case 3:
                C15401Uc7 uc7 = (C15401Uc7) this.A01;
                uc7.A0C = true;
                C18012Vjo vjo = uc7.A06;
                if (vjo == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    vjo.A00();
                    return;
                }
            default:
                return;
        }
    }

    public final void Dem(String str) {
        switch (this.A00) {
            case 0:
                ActionButton actionButton = ((K5H) this.A01).A0A;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(1);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(str, 0);
                return;
            case 2:
                C19743Wek wek = (C19743Wek) this.A01;
                if (wek.A01.equals(str)) {
                    wek.A00 = AnonymousClass05K.A00;
                    return;
                }
                return;
            default:
                C15401Uc7 uc7 = (C15401Uc7) this.A01;
                C18012Vjo vjo = uc7.A06;
                if (vjo == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    vjo.A01(DbU.A0m(uc7, 2131965491), uc7.A00, true);
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dd, code lost:
        r1 = r8.A01.A02;
        X.0qQ.A07(r1);
        r5.DMY(r9, r1, r4, r8.CKA());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dev(X.AnonymousClass1XT r8, java.lang.String r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0039;
                case 2: goto L_0x00a2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r7.A01
            X.Uc7 r2 = (X.C15401Uc7) r2
            X.Vjo r1 = r2.A06
            if (r1 != 0) goto L_0x0017
            java.lang.String r0 = "adapter"
        L_0x000f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            X.0eM r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            X.Trf r0 = (X.C14200Trf) r0
            r0.A04()
            X.0eM r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            X.UdQ r0 = (X.C15475UdQ) r0
            r0.A01()
            r0.updateListView()
            android.widget.ListView r1 = r2.A02
            if (r1 == 0) goto L_0x00eb
            r0 = 0
            r1.setSelection(r0)
            return
        L_0x0039:
            X.AnonymousClass7TG.A1N(r9, r8)
            java.lang.Object r1 = r7.A01
            X.VbT r1 = (X.C17637VbT) r1
            java.util.Set r0 = r1.A03
            r0.remove(r9)
            X.VMG r0 = r1.A01
            X.UZ3 r2 = r0.A00
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r2.A07()
            java.lang.String r0 = r0.getSearchString()
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x00eb
            X.Trf r0 = r2.A09()
            r0.A04()
            X.UdQ r1 = r2.A08()
            r0 = 0
            r1.A00 = r0
            X.UdQ r0 = r2.A08()
            r0.A00()
            return
        L_0x006d:
            X.Xzd r8 = (X.C22328Xzd) r8
            java.lang.Object r3 = r7.A01
            X.K5H r3 = (X.K5H) r3
            java.lang.String r0 = r3.A0M
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00eb
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.7g2 r0 = r3.A0e
            X.9P5 r0 = r0.BiX(r9)
            java.util.List r0 = r0.A06
            if (r0 == 0) goto L_0x008d
            r2.addAll(r0)
        L_0x008d:
            java.util.List r0 = r8.getItems()
            r2.addAll(r0)
            X.LET r1 = r3.A0D
            java.lang.String r0 = r8.BjE()
            r1.A01(r9, r0, r2)
            r0 = 1
            X.K5H.A0A(r3, r2, r0)
            return
        L_0x00a2:
            X.UY9 r8 = (X.UY9) r8
            java.lang.Object r1 = r7.A01
            X.Wek r1 = (X.C19743Wek) r1
            java.lang.String r0 = r1.A01
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00eb
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A00 = r0
            boolean r0 = r8.CKA()
            r1.A04 = r0
            X.WWK r0 = r8.A01
            java.lang.String r0 = r0.A01
            r1.A02 = r0
            X.X6y r5 = r1.A06
            boolean r4 = r1.A03
            X.WcL r5 = (X.C19596WcL) r5
            int r1 = r5.A00
            r0 = 2
            switch(r1) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x0115;
                case 2: goto L_0x0119;
                case 3: goto L_0x012e;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r5.A01
            X.U8r r0 = (X.C14781U8r) r0
            X.Uql r1 = r0.A02
            com.instagram.model.shopping.ProductSource r0 = r8.A00
            r1.A00 = r0
            r0 = 1
            r1.A05(r0)
        L_0x00dd:
            X.WWK r0 = r8.A01
            java.util.List r1 = r0.A02
            X.0qQ.A07(r1)
            boolean r0 = r8.CKA()
            r5.DMY(r9, r1, r4, r0)
        L_0x00eb:
            return
        L_0x00ec:
            X.0qQ.A0B(r9, r0)
            java.lang.Object r6 = r5.A01
            X.Uan r6 = (X.C15338Uan) r6
            com.instagram.model.shopping.ProductSource r0 = r8.A00
            X.C15338Uan.A01(r0, r6)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r6.A09
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "productSourceOverrideState"
            goto L_0x000f
        L_0x0100:
            com.instagram.model.shopping.ProductSource r3 = r8.A00
            X.0qQ.A07(r3)
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r2 = r0.A01
            java.lang.String r1 = r0.A02
            r0 = 0
            X.0qQ.A0B(r2, r0)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = new com.instagram.shopping.model.productsource.ProductSourceOverrideState
            r0.<init>(r3, r2, r1)
            r6.A09 = r0
            goto L_0x00dd
        L_0x0115:
            X.0qQ.A0B(r9, r0)
            goto L_0x00dd
        L_0x0119:
            X.0qQ.A0B(r9, r0)
            java.lang.Object r3 = r5.A01
            X.U8q r3 = (X.C14780U8q) r3
            r0 = 7
            X.Wyw r2 = new X.Wyw
            r2.<init>(r8, r0)
            X.2Fj r1 = r3.A02
            X.2Fk r0 = r3.A01
            X.C13991Tnr.A0y(r0, r1, r2)
            goto L_0x00dd
        L_0x012e:
            X.0qQ.A0B(r9, r0)
            java.lang.Object r3 = r5.A01
            X.U8g r3 = (X.C14770U8g) r3
            X.Uqk r1 = r3.A04
            com.instagram.model.shopping.ProductSource r0 = r8.A00
            r1.A00 = r0
            r0 = 1
            r1.A05(r0)
            r0 = 10
            X.Wyw r2 = new X.Wyw
            r2.<init>(r8, r0)
            X.2Fj r1 = r3.A02
            X.2Fk r0 = r3.A01
            X.C13991Tnr.A0y(r0, r1, r2)
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19551Wbb.Dev(X.1XT, java.lang.String):void");
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }
}
