package com.instagram.shopping.fragment.cart;

import X.0Aj;
import X.0Tu;
import X.0hq;
import X.0qQ;
import X.1Au;
import X.1QP;
import X.1wn;
import X.2da;
import X.2el;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass1QO;
import X.AnonymousClass3AQ;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZA;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13990Tnq;
import X.C14819UAy;
import X.C15047ULa;
import X.C16225Uqo;
import X.C16508Uw5;
import X.C16599Uxt;
import X.C16675UzB;
import X.C17074VGw;
import X.C17372VSz;
import X.C17468VWv;
import X.C17730Vcz;
import X.C17827Vgg;
import X.C17931ViM;
import X.C18617VvA;
import X.C18622VvF;
import X.C18626VvJ;
import X.C18695Vwt;
import X.C18748Vzj;
import X.C18785W1l;
import X.C19221WQb;
import X.C19562Wbm;
import X.C19590WcF;
import X.C19603WcS;
import X.C19604WcT;
import X.C19652WdG;
import X.C20987X8d;
import X.C228022kf;
import X.C231032ql;
import X.C231112qt;
import X.C2362432z;
import X.C249763kK;
import X.C252063oV;
import X.C268374dH;
import X.C273494mf;
import X.C320156rr;
import X.C322776wO;
import X.C323426xT;
import X.C323486xZ;
import X.C45393CvZ;
import X.C51966G9m;
import X.C59613JQh;
import X.C66582MXn;
import X.C71662eb;
import X.CG7;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbY;
import X.EVS;
import X.JTP;
import X.JTS;
import X.UO3;
import X.VGZ;
import X.W27;
import X.WQN;
import X.XC9;
import X.XCA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ShoppingCartFragment extends AnonymousClass4DH implements C249763kK, AnonymousClass4DU, AnonymousClass4DR, C273494mf, C231032ql, AnonymousClass4DS, C59613JQh, C322776wO, XCA {
    public long A00;
    public UserFlowLogger A01;
    public UserSession A02;
    public IgFundedIncentive A03;
    public MultiProductComponent A04;
    public C16599Uxt A05 = C16599Uxt.A04;
    public C17730Vcz A06;
    public PinnedLinearLayoutManager A07;
    public C18785W1l A08;
    public C16508Uw5 A09 = C16508Uw5.LOADING;
    public C20987X8d A0A;
    public C17468VWv A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public C17931ViM A0L;
    public C18617VvA A0M;
    public XC9 A0N;
    public W27 A0O;
    public String A0P;
    public List A0Q;
    public List A0R;
    public boolean A0S;
    public boolean A0T;
    public final 1wn A0U = new C19221WQb(this, 49);
    public final C14819UAy A0V = new C14819UAy();
    public final 2el A0W = 2el.A00();
    public C71662eb mProductCollectionStub;
    public RecyclerView mRecyclerView;

    public static void A00(CG7 cg7, C16508Uw5 uw5, ShoppingCartFragment shoppingCartFragment) {
        String str;
        List A10;
        MultiProductComponent multiProductComponent;
        if (cg7 != null) {
            shoppingCartFragment.A0R = C51966G9m.A1J(cg7.A02);
            boolean z = shoppingCartFragment.A0K;
            List A1J = C51966G9m.A1J(cg7.A01);
            if (z) {
                ArrayList arrayList = new ArrayList(A1J);
                for (int i = 0; i < arrayList.size(); i++) {
                    User user = ((C18622VvF) arrayList.get(i)).A05;
                    if (!(user == null || AnonymousClass3ZA.A00(user) == null || !AnonymousClass3ZA.A00(user).equalsIgnoreCase(shoppingCartFragment.A0F))) {
                        arrayList.add(0, arrayList.remove(i));
                    }
                }
                A1J = arrayList;
            }
            shoppingCartFragment.A0Q = A1J;
            shoppingCartFragment.A0J = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C45393CvZ cvZ : shoppingCartFragment.A0R) {
                arrayList2.add(cvZ.A01);
                shoppingCartFragment.A0E = cvZ.A02;
                shoppingCartFragment.A0J.add(cvZ.A03);
            }
            C17468VWv vWv = shoppingCartFragment.A0B;
            List list = shoppingCartFragment.A0J;
            0qQ.A0B(list, 0);
            C15047ULa uLa = vWv.A02.A01;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JTS.A1V(arrayList3, it);
            }
            uLa.A00 = arrayList3;
            if (C51966G9m.A1J(cg7.A03).isEmpty()) {
                multiProductComponent = null;
            } else {
                multiProductComponent = (MultiProductComponent) C51966G9m.A1J(cg7.A03).get(0);
            }
            shoppingCartFragment.A04 = multiProductComponent;
            if (multiProductComponent != null && !C13988Tno.A1a(multiProductComponent.A03.A03)) {
                C16599Uxt uxt = C16599Uxt.A05;
                shoppingCartFragment.A05 = uxt;
                Class cls = uxt.A00;
                if (cls != null) {
                    PinnedLinearLayoutManager pinnedLinearLayoutManager = shoppingCartFragment.A07;
                    pinnedLinearLayoutManager.A01 = cls;
                    pinnedLinearLayoutManager.A03 = "product_collection_view_model_key";
                    pinnedLinearLayoutManager.A00 = null;
                    pinnedLinearLayoutManager.A02 = null;
                }
            }
            shoppingCartFragment.A03 = cg7.A00;
        }
        C16508Uw5 uw52 = C16508Uw5.FAILED;
        if (uw5 != uw52 || cg7 == null) {
            shoppingCartFragment.A09 = uw5;
        } else {
            C18748Vzj.A00(VGZ.A00(shoppingCartFragment.A02), 37362470, true);
            shoppingCartFragment.A09 = C16508Uw5.LOADED;
        }
        if (!shoppingCartFragment.A0S && uw5 != C16508Uw5.LOADING) {
            shoppingCartFragment.A0S = true;
            if (uw5 == uw52 && cg7 == null) {
                VGZ.A00(shoppingCartFragment.A02).A02();
                C18785W1l w1l = shoppingCartFragment.A08;
                0Aj A0e = AnonymousClass7TE.A0e(w1l.A02, "instagram_shopping_bag_index_load_failure");
                String str2 = w1l.A00;
                if (str2 != null) {
                    A0e.AAJ("global_bag_entry_point", str2);
                    String str3 = w1l.A04;
                    if (str3 != null) {
                        A0e.AAJ("global_bag_prior_module", str3);
                        String str4 = w1l.A08;
                        if (str4 == null) {
                            str4 = "";
                        }
                        C13988Tno.A1D(A0e, str4);
                        A0e.Cgf();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (uw5 == C16508Uw5.LOADED && cg7 != null) {
                C18748Vzj.A00(VGZ.A00(shoppingCartFragment.A02), 37361281, false);
                int A0D2 = C13988Tno.A0D(C323426xT.A00(shoppingCartFragment.A02).A06());
                C18785W1l w1l2 = shoppingCartFragment.A08;
                String str5 = shoppingCartFragment.A0E;
                List list2 = shoppingCartFragment.A0J;
                list2.getClass();
                IgFundedIncentive igFundedIncentive = shoppingCartFragment.A03;
                if (igFundedIncentive != null) {
                    str = igFundedIncentive.A07;
                } else {
                    str = null;
                }
                0Aj A0e2 = AnonymousClass7TE.A0e(w1l2.A02, "instagram_shopping_bag_index_load_success");
                String str6 = w1l2.A00;
                if (str6 != null) {
                    A0e2.AAJ("global_bag_entry_point", str6);
                    String str7 = w1l2.A04;
                    if (str7 != null) {
                        A0e2.AAJ("global_bag_prior_module", str7);
                        A0e2.A9F("total_item_count", Long.valueOf((long) A0D2));
                        C13988Tno.A1D(A0e2, w1l2.A08);
                        if (str == null) {
                            A10 = null;
                        } else {
                            A10 = C66582MXn.A10(Long.parseLong(str));
                        }
                        A0e2.AAe("ig_funded_discount_ids", A10);
                        if (str5 != null) {
                            A0e2.A9F("global_bag_id", AnonymousClass7TE.A10(str5));
                        }
                        if (!list2.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                JTS.A1V(arrayList4, it2);
                            }
                            A0e2.AAe("merchant_bag_ids", arrayList4);
                        }
                        A0e2.Cgf();
                        shoppingCartFragment.A01.flowStart(shoppingCartFragment.A00, new UserFlowConfig("index_cart_entry", false));
                        List list3 = shoppingCartFragment.A0R;
                        if (list3 != null) {
                            shoppingCartFragment.A01.flowAnnotate(shoppingCartFragment.A00, "num_carts", list3.size());
                            if (list3.size() == 1) {
                                String str8 = shoppingCartFragment.A0D;
                                if (!str8.equals("live_viewer_product_feed") && !str8.equals("bottom_sheet_pdp")) {
                                    shoppingCartFragment.A0T = true;
                                    A02(shoppingCartFragment, ((C45393CvZ) list3.get(0)).A01, (String) null, "index_view", true);
                                    return;
                                }
                            }
                        }
                        if (A0D2 == 0 && (!1Au.A00(shoppingCartFragment.A02).A1t())) {
                            C17074VGw.A00(shoppingCartFragment.requireActivity(), shoppingCartFragment, shoppingCartFragment.A02, shoppingCartFragment.A0H, "");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        A01(shoppingCartFragment);
    }

    public final XC9 BgB() {
        XC9 xc9 = this.A0N;
        if (xc9 != null) {
            return xc9;
        }
        C19652WdG wdG = new C19652WdG(this.A01, this, this.A0L, this.A00);
        this.A0N = wdG;
        return wdG;
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
    }

    public final void DzD(C16675UzB uzB, C268374dH r2, int i) {
    }

    public final void DzI(C268374dH r1, User user) {
    }

    public final void DzM(C268374dH r1) {
    }

    public final void DzN(C268374dH r1) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "instagram_shopping_bag_index";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.shopping.fragment.cart.ShoppingCartFragment r11) {
        /*
            android.view.View r0 = r11.mView
            if (r0 == 0) goto L_0x0194
            X.Vcz r5 = r11.A06
            X.Uw5 r4 = r11.A09
            java.util.List r3 = r11.A0R
            java.util.List r2 = r11.A0Q
            com.instagram.model.shopping.productfeed.MultiProductComponent r1 = r11.A04
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r9 = r11.A03
            X.Uxt r0 = r11.A05
            r7 = 0
            X.DbW.A1O(r4, r7, r0)
            r5.A03 = r4
            r5.A05 = r3
            r5.A04 = r2
            r5.A01 = r1
            r5.A00 = r9
            r5.A02 = r0
            com.instagram.common.recyclerview.ViewModelListUpdate r6 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r6.<init>()
            if (r3 == 0) goto L_0x0169
            if (r2 == 0) goto L_0x0169
            if (r9 == 0) goto L_0x0075
            java.lang.Integer r0 = r9.A04
            if (r0 == 0) goto L_0x0157
            X.0qQ.A0A(r9)
            java.lang.String r8 = r9.A07
            java.lang.String r3 = r9.A0A
            java.lang.String r2 = r9.A06
            android.content.Context r1 = r5.A06
            r0 = 2131972983(0x7f135377, float:1.9582989E38)
            java.lang.String r0 = r1.getString(r0)
            X.JwB r4 = new X.JwB
            r4.<init>((java.lang.String) r3, (java.lang.String) r2, (java.lang.String) r0)
            r0 = 13
            X.Wvu r3 = new X.Wvu
            r3.<init>(r0, r5, r9)
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r0 = r5.A0A
            boolean r2 = r0.isVisible()
            r1 = 14
            X.Wvu r0 = new X.Wvu
            r0.<init>(r1, r5, r9)
            X.VWr r1 = new X.VWr
            r1.<init>(r3, r0, r2)
            X.WSI r0 = new X.WSI
            r0.<init>(r4, r1, r8)
            r6.A00(r0)
            java.lang.String r0 = "incentive_divider"
            X.WRt r1 = new X.WRt
            r1.<init>(r0)
        L_0x0070:
            X.2tL r1 = (X.C232262tL) r1
            r6.A00(r1)
        L_0x0075:
            java.util.List r0 = r5.A05
            X.0qQ.A0A(r0)
            boolean r0 = r0.isEmpty()
            r4 = 0
            r9 = 1
            if (r0 == 0) goto L_0x00c0
            java.util.List r0 = r5.A04
            X.0qQ.A0A(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c0
            X.72b r3 = r5.A0B
            X.Uxt r2 = r5.A02
            X.Uxt r1 = X.C16599Uxt.A04
            boolean r0 = X.C51969G9p.A1a(r2, r1)
            r3.A0M = r0
            boolean r0 = X.AnonymousClass7TF.A1W(r2, r1)
            r3.A0L = r0
            if (r2 == r1) goto L_0x00a2
            r4 = 1
        L_0x00a2:
            r3.A0N = r4
            X.6rr r1 = X.C320156rr.EMPTY
            X.NPA r0 = new X.NPA
            r0.<init>(r3, r1)
        L_0x00ab:
            X.2tL r0 = (X.C232262tL) r0
            r6.A00(r0)
            X.Uxt r2 = r5.A02
            int r0 = r2.ordinal()
            if (r0 == r7) goto L_0x0180
            if (r0 == r9) goto L_0x018e
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00c0:
            X.UO2 r0 = r5.A08
            r6.A00(r0)
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x011e
            java.util.List r0 = r5.A04
            X.0qQ.A0A(r0)
            int r10 = r0.size()
            r8 = 0
        L_0x00d3:
            if (r8 >= r10) goto L_0x0153
            java.util.List r0 = r5.A04
            X.0qQ.A0A(r0)
            java.lang.Object r4 = r0.get(r8)
            X.VvF r4 = (X.C18622VvF) r4
            java.util.List r0 = r5.A04
            X.0qQ.A0A(r0)
            int r0 = X.DbT.A02(r0, r9)
            boolean r3 = X.AnonymousClass7TF.A1S(r8, r0)
            com.instagram.user.model.User r2 = r4.A05
            X.0qQ.A07(r2)
            android.content.Context r0 = r5.A06
            android.content.res.Resources r11 = r0.getResources()
            r1 = 2131820969(0x7f1101a9, float:1.9274668E38)
            int r0 = r4.A00
            java.lang.String r11 = X.DbY.A0d(r11, r0, r1)
            java.lang.String r1 = "·"
            X.Wh3 r0 = r4.A02
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r1, r0}
            java.lang.String r0 = "%s %s %s"
            java.lang.String r1 = X.0mp.A06(r0, r1)
            X.UNw r0 = new X.UNw
            r0.<init>(r4, r2, r1, r3)
            r6.A00(r0)
            int r8 = r8 + 1
            goto L_0x00d3
        L_0x011e:
            java.util.List r0 = r5.A05
            X.0qQ.A0A(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0127:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r4 = r8.next()
            X.CvZ r4 = (X.C45393CvZ) r4
            com.instagram.user.model.User r3 = r4.A01
            X.0qQ.A07(r3)
            android.content.Context r0 = r5.A06
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131820969(0x7f1101a9, float:1.9274668E38)
            int r0 = r4.A00
            java.lang.String r1 = X.DbY.A0d(r2, r0, r1)
            X.0qQ.A07(r1)
            X.IOX r0 = new X.IOX
            r0.<init>(r3, r1, r9)
            r6.A00(r0)
            goto L_0x0127
        L_0x0153:
            X.UO2 r0 = r5.A07
            goto L_0x00ab
        L_0x0157:
            java.lang.String r2 = r9.A06
            android.content.Context r1 = r5.A06
            r0 = 2131972983(0x7f135377, float:1.9582989E38)
            java.lang.String r0 = r1.getString(r0)
            X.Uir r1 = new X.Uir
            r1.<init>(r2, r0)
            goto L_0x0070
        L_0x0169:
            X.Uw5 r0 = X.C16508Uw5.LOADING
            if (r4 != r0) goto L_0x0177
            X.72b r1 = r5.A0D
            X.6rr r0 = X.C320156rr.LOADING
        L_0x0171:
            X.NPA r2 = new X.NPA
            r2.<init>(r1, r0)
            goto L_0x018b
        L_0x0177:
            X.Uw5 r0 = X.C16508Uw5.FAILED
            if (r4 != r0) goto L_0x018e
            X.72b r1 = r5.A0C
            X.6rr r0 = X.C320156rr.ERROR
            goto L_0x0171
        L_0x0180:
            com.instagram.model.shopping.productfeed.MultiProductComponent r1 = r5.A01
            if (r1 == 0) goto L_0x018e
            java.lang.String r0 = r2.A01
            X.WSH r2 = new X.WSH
            r2.<init>(r1, r0)
        L_0x018b:
            r6.A00(r2)
        L_0x018e:
            X.2t9 r0 = r5.A09
            r0.A05(r6)
            return
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.cart.ShoppingCartFragment.A01(com.instagram.shopping.fragment.cart.ShoppingCartFragment):void");
    }

    public static void A02(ShoppingCartFragment shoppingCartFragment, User user, String str, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6 = str2;
        shoppingCartFragment.A01.flowMarkPoint(shoppingCartFragment.A00, "cart_selected");
        C20987X8d x8d = shoppingCartFragment.A0A;
        String str7 = shoppingCartFragment.A0H;
        if (z) {
            str3 = shoppingCartFragment.A0G;
        } else {
            str3 = "instagram_shopping_bag_index";
        }
        if (z) {
            str6 = shoppingCartFragment.A0D;
            str5 = null;
            str4 = null;
        } else {
            str4 = shoppingCartFragment.A0G;
            str5 = shoppingCartFragment.A0D;
        }
        x8d.Cq1(user, Long.valueOf(shoppingCartFragment.A00), str7, str3, str6, str4, str5, shoppingCartFragment.A0I, str, shoppingCartFragment.A0P, shoppingCartFragment.A0C);
    }

    public final void A9u(C268374dH r3, int i) {
        this.A0L.A05.A03(r3, ((MultiProductComponent) r3).A00(), i);
    }

    public final void AAj(ProductFeedItem productFeedItem, C17372VSz vSz) {
        MultiProductComponent multiProductComponent = this.A04;
        if (multiProductComponent != null) {
            this.A0M.A02(vSz, new UO3(productFeedItem, multiProductComponent.A06), (String) null);
        }
    }

    public final void CuL(Product product) {
        C323486xZ r0 = C323426xT.A00(this.A02).A07;
        if (r0.A00 == r0.A02) {
            C18695Vwt.A02(new C19590WcF(this.A02).BRw(requireContext(), this.A02), 0, "cart_item_limit_reached_user_error");
            return;
        }
        List<ProductVariantPossibleValueDictIntf> list = product.A0O;
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            if (list.isEmpty()) {
                throw DbT.A0m();
            } else if (list.isEmpty()) {
                throw DbT.A0m();
            } else {
                for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                    if (productVariantPossibleValueDictIntf.CFr() == ProductVariantVisualStyle.THUMBNAIL) {
                        hashMap.put(productVariantPossibleValueDictIntf.getId(), productVariantPossibleValueDictIntf.getValue());
                    }
                }
                if (list.isEmpty()) {
                    throw DbT.A0m();
                }
                list.size();
                hashMap.size();
            }
        }
        C323426xT.A00(this.A02).A07.A0C(new C16225Uqo(this, product, product), product, AnonymousClass3ZA.A00(product.A0B));
    }

    public final void DBx() {
        this.A01.flowStart(this.A00, new UserFlowConfig(this.A0G, false));
        this.A01.flowAnnotate(this.A00, "num_carts", 0);
    }

    public final void DBy() {
        this.A01.flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
    }

    public final void DRN(User user) {
        C13990Tnq.A1N(this, user, "index_view_merchant_avatar");
    }

    public final void DRP(User user) {
        C13990Tnq.A1N(this, user, "index_view_merchant_name");
    }

    public final void DRQ(User user) {
        C13990Tnq.A1N(this, user, "index_view_row");
    }

    public final void DRR(User user) {
        C13990Tnq.A1N(this, user, "index_view_subtitle");
    }

    public final void DZc(Product product) {
        this.A01.flowMarkPoint(this.A00, "visit_pdp");
        this.A0A.CqI(product, this.A0H, this.A0G, "shopping_bag_product_collection");
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
        this.A01.flowMarkPoint(this.A00, "visit_storefront");
        this.A0A.CqQ(unavailableProduct.BRo(), this.A0H, this.A0G, this.A0D, "unavailable_product_card");
    }

    public final void EBz(View view, C268374dH r4) {
        this.A0L.A05.A01(view, r4, ((MultiProductComponent) r4).A00());
    }

    public final void ECE(View view, ProductFeedItem productFeedItem) {
        MultiProductComponent multiProductComponent = this.A04;
        if (multiProductComponent != null) {
            this.A0M.A01(view, new UO3(productFeedItem, multiProductComponent.A06));
        }
    }

    public final void FJ3(View view) {
        this.A0L.A05.A00.A04(view);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final void configureActionBar(2da r3) {
        int i = 2131973759;
        if (this.A0K) {
            i = 2131963103;
        }
        DbW.A1B(r3, i);
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final String getSessionId() {
        return this.A0H;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        this.A01.flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        C20987X8d wcS;
        int A022 = AnonymousClass0fD.A02(-1286395214);
        ShoppingCartFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = DbX.A0U(this);
        this.A0H = C228022kf.A00(requireArguments);
        this.A0G = DbU.A0l(requireArguments, "prior_module_name");
        this.A0D = DbU.A0l(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A0F = requireArguments.getString("pinned_merchant_id");
        this.A0I = requireArguments.getString("tracking_token");
        this.A0P = requireArguments.getString("media_id");
        this.A0C = requireArguments.getString(TraceFieldType.BroadcastId);
        this.A0K = DbY.A1Y(0Tu.A05, this.A02, 36311032204886436L);
        UserSession userSession = this.A02;
        this.A06 = new C17730Vcz(requireContext(), this, this.A0V, userSession, this, this.A0K);
        this.A0O = new W27(requireActivity(), this.A02);
        C18748Vzj A002 = VGZ.A00(this.A02);
        String str = this.A0G;
        0qQ.A0B(str, 0);
        C18748Vzj.A01(A002, str, "instagram_shopping_bag_index", 37361281);
        2el A003 = C2362432z.A00(this);
        UserSession userSession2 = this.A02;
        String str2 = this.A0H;
        String str3 = this.A0G;
        String obj = C16675UzB.CART.toString();
        AnonymousClass7TG.A1P(userSession2, A003);
        this.A0M = new C18617VvA(userSession2, A003, this, new C231112qt(this, userSession2, str2, (String) null, obj, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1), str2, str3, (String) null, (String) null, (List) null);
        UserSession userSession3 = this.A02;
        String str4 = this.A0G;
        String str5 = this.A0D;
        this.A0B = new C17468VWv(new C15047ULa((String) null, this.A0E, str5, str4, (String) null, (String) null, (String) null), this, userSession3, A003, new ShoppingNavigationInfo((String) null, str4, str5, this.A0H), (String) null);
        UserSession userSession4 = this.A02;
        UserSession userSession5 = userSession4;
        C18626VvJ vvJ = new C18626VvJ(this, userSession5, this, C16675UzB.SAVED, this.A0H, this.A0G, (String) null);
        vvJ.A00 = this.A0W;
        this.A0L = vvJ.A01();
        BottomSheetFragment bottomSheetFragment = this.mParentFragment;
        if (bottomSheetFragment instanceof BottomSheetFragment) {
            wcS = new C19604WcT(this, this.A02, this, bottomSheetFragment);
        } else {
            wcS = new C19603WcS(this, this.A02, this);
        }
        this.A0A = wcS;
        C18785W1l w1l = new C18785W1l(this, this.A02, false, "index_view_buy_now", "index_view_buy_now", this.A0D, this.A0G, this.A0H, this.A0P);
        this.A08 = w1l;
        w1l.A03();
        1QP A004 = AnonymousClass1QO.A00(this.A02);
        this.A01 = A004;
        this.A00 = A004.generateNewFlowId(37363419);
        AnonymousClass0fD.A09(-457034828, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1201934817);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        AnonymousClass0fD.A09(-1958080435, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-2017454704);
        super.onDestroy();
        AnonymousClass1Nd.A00(this.A02).A02(this.A0U, WQN.class);
        AnonymousClass0fD.A09(1629214776, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2091305730);
        super.onDestroyView();
        ShoppingCartFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-1194755665, A022);
    }

    public final void onResume() {
        0hq r1;
        int A022 = AnonymousClass0fD.A02(1120799360);
        super.onResume();
        if (this.A0T && (r1 = this.mFragmentManager) != null && !(this.mParentFragment instanceof BottomSheetFragment)) {
            this.A0T = false;
            r1.A0c();
        }
        AnonymousClass0fD.A09(1494289431, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C16599Uxt uxt;
        C16508Uw5 uw5;
        super.onViewCreated(view, bundle);
        this.mRecyclerView = DbX.A0K(view);
        this.A0W.A06(this.mRecyclerView, AnonymousClass3DZ.A00(this));
        this.A07 = new PinnedLinearLayoutManager(requireContext(), new C19562Wbm(this));
        MultiProductComponent multiProductComponent = this.A04;
        if (multiProductComponent == null || C13988Tno.A1a(multiProductComponent.A03.A03)) {
            uxt = C16599Uxt.A04;
        } else {
            uxt = C16599Uxt.A05;
        }
        this.A05 = uxt;
        Class cls = uxt.A00;
        if (!(uxt == C16599Uxt.A04 || cls == null)) {
            PinnedLinearLayoutManager pinnedLinearLayoutManager = this.A07;
            String str = uxt.A01;
            pinnedLinearLayoutManager.A01 = cls;
            pinnedLinearLayoutManager.A03 = str;
            pinnedLinearLayoutManager.A00 = null;
            pinnedLinearLayoutManager.A02 = null;
        }
        this.mRecyclerView.setLayoutManager(this.A07);
        this.mRecyclerView.setAdapter(this.A06.A09);
        this.mRecyclerView.setImportantForAccessibility(2);
        AnonymousClass3AQ r1 = new AnonymousClass3AQ();
        r1.A00 = false;
        this.mRecyclerView.setItemAnimator(r1);
        this.A0V.A00(this.mRecyclerView, "ShoppingCartFragment");
        CG7 A032 = C323426xT.A00(this.A02).A03();
        if (A032 == null) {
            uw5 = C16508Uw5.LOADING;
        } else {
            C18748Vzj.A00(VGZ.A00(this.A02), 37361281, true);
            uw5 = C16508Uw5.LOADED;
        }
        A00(A032, uw5, this);
        if (this.A0R == null && this.A0Q == null) {
            C323426xT.A00(this.A02).A07((C17827Vgg) null);
        }
        AnonymousClass1Nd.A00(this.A02).A01(this.A0U, WQN.class);
    }
}
