package com.instagram.shopping.fragment.moreproducts;

import X.002;
import X.02m;
import X.0Aj;
import X.0KC;
import X.0Tu;
import X.0f9;
import X.0jB;
import X.0qQ;
import X.0wb;
import X.0wj;
import X.15p;
import X.182;
import X.1NY;
import X.1Ng;
import X.1OC;
import X.1Xj;
import X.1wn;
import X.2da;
import X.2el;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass1Nd;
import X.AnonymousClass37D;
import X.AnonymousClass3AS;
import X.AnonymousClass3DT;
import X.AnonymousClass3DZ;
import X.AnonymousClass3JR;
import X.AnonymousClass3Jb;
import X.AnonymousClass3ZA;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C11307SKv;
import X.C13988Tno;
import X.C14005To7;
import X.C14673U0u;
import X.C15029UKi;
import X.C15619Ufl;
import X.C15625Ufr;
import X.C16226Uqp;
import X.C16559UxB;
import X.C16560UxC;
import X.C16675UzB;
import X.C17089VHl;
import X.C17597Vap;
import X.C17984VjM;
import X.C18251VoI;
import X.C18591Vui;
import X.C18617VvA;
import X.C18626VvJ;
import X.C18661VwI;
import X.C18694Vws;
import X.C19134WMp;
import X.C19221WQb;
import X.C19649WdD;
import X.C20983X7y;
import X.C21003X9a;
import X.C229402nK;
import X.C231112qt;
import X.C231122qu;
import X.C231142qw;
import X.C232682uF;
import X.C249713kF;
import X.C249763kK;
import X.C252063oV;
import X.C273374mT;
import X.C273494mf;
import X.C273654mx;
import X.C323426xT;
import X.C323956yN;
import X.C45622CzY;
import X.C51965G9l;
import X.C51968G9o;
import X.C51969G9p;
import X.C51972G9s;
import X.C55146Hcu;
import X.C66582MXn;
import X.CE1;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.EVS;
import X.JTP;
import X.LJM;
import X.U9T;
import X.UAP;
import X.UAx;
import X.ULV;
import X.WBC;
import X.WQI;
import X.X71;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingMoreProductsFragment extends C273374mT implements C249763kK, C232682uF, C21003X9a, C273494mf, C20983X7y, AnonymousClass4DS {
    public 2el A00;
    public 1Xj A01;
    public C16559UxB A02;
    public UAP A03;
    public C17597Vap A04;
    public C17984VjM A05;
    public C18661VwI A06;
    public X71 A07;
    public ProductCollection A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public long A0E;
    public long A0F;
    public C229402nK A0G;
    public C231112qt A0H;
    public C231112qt A0I;
    public C231142qw A0J;
    public C16560UxC A0K;
    public C15029UKi A0L;
    public C18617VvA A0M;
    public C18617VvA A0N;
    public C19649WdD A0O;
    public Integer A0P;
    public List A0Q;
    public List A0R;
    public boolean A0S;
    public final 1wn A0T = new C19221WQb(this, 65);
    public final 1wn A0U = new C19221WQb(this, 64);
    public final 1wn A0V = new C19221WQb(this, 66);
    public final C14005To7 A0W = new C14005To7();
    public final List A0X = new ArrayList();
    public View mContainerView;
    public RecyclerView mRecyclerView;

    public final /* synthetic */ void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final /* synthetic */ void DZf(String str, int i) {
    }

    public final void DZg(Product product, int i, int i2) {
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final void DZm(Product product) {
        String A002;
        C18661VwI vwI = this.A06;
        if (vwI == null) {
            String str = null;
            C18626VvJ vvJ = new C18626VvJ(this, getSession(), this, C16675UzB.SAVED, this.A0D, this.A0A, (String) null);
            User A003 = A00();
            String str2 = "";
            if (!(A003 == null || (A002 = AnonymousClass3ZA.A00(A003)) == null)) {
                str2 = A002;
            }
            vvJ.A0B = str2;
            String str3 = null;
            if (A00() != null) {
                str = C13988Tno.A0b(A00());
            }
            vvJ.A0C = str;
            1Xj r0 = this.A01;
            vvJ.A01 = r0;
            if (r0 != null) {
                str3 = r0.getId();
            }
            vvJ.A0A = str3;
            vvJ.A00 = this.A00;
            vwI = vvJ.A02();
            this.A06 = vwI;
        }
        vwI.A05(product);
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    private User A00() {
        String A002;
        boolean isEmpty = this.A0R.isEmpty();
        1Xj r2 = this.A01;
        if (!isEmpty) {
            return C17089VHl.A00(getSession(), r2, this.A0R);
        } else if (r2 != null) {
            if (C231122qu.A07(getSession(), this.A01) != null) {
                A002 = C231122qu.A07(getSession(), this.A01);
            } else {
                A002 = C273654mx.A00(1434);
            }
            0f9 AEf = 0wj.A01.AEf("AD_SHOPPING_BOTTOMSHEET_EMPTY_TAGGED_PRODUCTS", 817903741);
            AEf.ABQ(DialogModule.KEY_MESSAGE, 002.A0R("Expected non-empty tagged products list for ad ", A002));
            AEf.report();
            return null;
        } else {
            0KC.A0C(C273654mx.A00(505), C273654mx.A00(810));
            return null;
        }
    }

    private String A01() {
        1Xj r1 = this.A01;
        String str = null;
        if (r1 == null || (r1.CcK() && (str = C231122qu.A0F(getSession(), this.A01)) != null)) {
            return str;
        }
        return C231122qu.A0F(getSession(), this.A01.A1e(getSession()));
    }

    public static void A02(C16559UxB uxB, ShoppingMoreProductsFragment shoppingMoreProductsFragment) {
        if (shoppingMoreProductsFragment.A01 != null && !shoppingMoreProductsFragment.A07()) {
            int ordinal = uxB.ordinal();
            if (ordinal == 2) {
                UserSession session = shoppingMoreProductsFragment.getSession();
                String A30 = shoppingMoreProductsFragment.A01.A30();
                String str = shoppingMoreProductsFragment.A0A;
                String A012 = shoppingMoreProductsFragment.A01();
                Dba.A0j(1, session, A30);
                0qQ.A0B(str, 2);
                1NY A0M2 = DbU.A0M(session);
                DbU.A1P(A0M2, "commerce/media/%s/related_products/", new Object[]{A30});
                A0M2.A05();
                A0M2.A0Q(ProductFeedResponse.class, LJM.class);
                A0M2.A9m("prior_module", str);
                A0M2.A9m("is_cam_media", "false");
                A0M2.A0G("ads_tracking_token", A012);
                1OC A0M3 = A0M2.A0M();
                C15619Ufl.A00(A0M3, shoppingMoreProductsFragment, uxB, 23);
                shoppingMoreProductsFragment.schedule(A0M3);
                shoppingMoreProductsFragment.A03.A04(uxB, true);
            } else if (ordinal == 3) {
                UserSession session2 = shoppingMoreProductsFragment.getSession();
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, session2, 36328444002319712L) || 182.A06(r3, shoppingMoreProductsFragment.getSession(), 36328444002385249L)) {
                    1Xj r5 = shoppingMoreProductsFragment.A01;
                    Integer num = shoppingMoreProductsFragment.A09;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (r5 != null) {
                            1Xj A1c = r5.A1c(intValue);
                            if (A1c != null) {
                                r5 = A1c;
                            }
                        } else {
                            return;
                        }
                    } else if (r5 == null) {
                        return;
                    }
                    if (r5.A30() != null) {
                        UserSession session3 = shoppingMoreProductsFragment.getSession();
                        String A302 = r5.A30();
                        boolean A1S = DbW.A1S(1, session3, A302);
                        Long l = null;
                        1NY A0M4 = DbU.A0M(session3);
                        A0M4.A0A("ads/intent_aware_ads/shoppable_everything/feed/api/views/search_similar_products_dogfood/");
                        A0M4.A04();
                        A0M4.A9m("seed_media_id", A302);
                        1OC A0R2 = DbT.A0R((15p) null, A0M4, CE1.class, C45622CzY.class, A1S);
                        A0R2.A00 = new C15625Ufr(18, shoppingMoreProductsFragment, r5, uxB);
                        shoppingMoreProductsFragment.schedule(A0R2);
                        shoppingMoreProductsFragment.A03.A04(uxB, true);
                        C17984VjM vjM = shoppingMoreProductsFragment.A05;
                        if (vjM != null && shoppingMoreProductsFragment.A01 != null) {
                            0Aj A0e = AnonymousClass7TE.A0e(vjM.A00, "instagram_shoppable_everything_fetch_start");
                            if (A0e.isSampled()) {
                                C51969G9p.A1A(A0e, vjM.A02);
                                A0e.A9F("seed_media_id", C51972G9s.A0j(r5.A30()));
                                String A072 = C231122qu.A07(vjM.A01, r5);
                                if (A072 != null) {
                                    l = AnonymousClass7TE.A10(A072);
                                }
                                A0e.A9F("seed_ad_id", l);
                                A0e.Cgf();
                            }
                        }
                    }
                }
            } else {
                throw C66582MXn.A0k(uxB, C273654mx.A00(115), new StringBuilder());
            }
        }
    }

    public static void A03(ShoppingMoreProductsFragment shoppingMoreProductsFragment, Product product) {
        String A002 = AnonymousClass3ZA.A00(product.A0B);
        if (A002 != null) {
            C323426xT.A00(shoppingMoreProductsFragment.getSession()).A07.A0C(new C16226Uqp(shoppingMoreProductsFragment, product, A002), product, A002);
        }
    }

    public static void A04(ShoppingMoreProductsFragment shoppingMoreProductsFragment, String str) {
        C249713kF.A00.A1C(shoppingMoreProductsFragment.requireActivity(), shoppingMoreProductsFragment.getSession(), shoppingMoreProductsFragment.A0D, shoppingMoreProductsFragment.getModuleName(), "tags", shoppingMoreProductsFragment.A01(), str, (String) null);
    }

    public static void A05(ShoppingMoreProductsFragment shoppingMoreProductsFragment, String str) {
        Iterator it;
        int i;
        List list = shoppingMoreProductsFragment.A0X;
        C11307SKv.A01(new C19134WMp(shoppingMoreProductsFragment, str, 0), list.iterator());
        UAP uap = shoppingMoreProductsFragment.A03;
        uap.A01 = shoppingMoreProductsFragment.A08;
        uap.A03(C16559UxB.TAGGED_PRODUCT, list);
        1Xj r0 = shoppingMoreProductsFragment.A01;
        if (r0 != null) {
            boolean A5G = r0.A5G();
            1Xj r02 = shoppingMoreProductsFragment.A01;
            if (A5G) {
                if (r02.A0C.getClipsMetadata() != null && shoppingMoreProductsFragment.A01.A0C.getClipsMetadata().Btl() != null) {
                    it = shoppingMoreProductsFragment.A01.A0C.getClipsMetadata().Btl().Bga().iterator();
                    i = 1;
                } else {
                    return;
                }
            } else if (r02.A3G() != null) {
                it = shoppingMoreProductsFragment.A01.A3G().iterator();
                i = 2;
            } else {
                return;
            }
            C11307SKv.A01(new C19134WMp(shoppingMoreProductsFragment, str, i), it);
        }
    }

    private boolean A06() {
        boolean equals;
        if (C55146Hcu.A00(this.A0B)) {
            return true;
        }
        if (A07()) {
            return false;
        }
        1Xj r0 = this.A01;
        if (r0 != null) {
            if (!(r0.A25() == C16560UxC.ADS_PRODUCT_PAGE || this.A01.A25() == C16560UxC.SHOPLESS_IN_APP_BROWSER)) {
                if (!this.A01.A6X(getSession())) {
                    return true;
                }
                UserSession session = getSession();
                1Xj r1 = this.A01;
                0qQ.A0B(session, 0);
                0qQ.A0B(r1, 1);
                if (r1.A4u() && C51968G9o.A1W(session, r1)) {
                    equals = 0qQ.A0K(r1.A1e(session).A2r(), "105622048790232");
                }
            }
            return false;
        }
        if (!this.A0R.isEmpty()) {
            equals = getSession().A06.equals(AnonymousClass3ZA.A00(((Product) this.A0R.get(0)).A0B));
        }
        return false;
        if (equals) {
            return true;
        }
        return false;
    }

    private boolean A07() {
        1Xj r1;
        if (!C55146Hcu.A00(this.A0B) && (r1 = this.A01) != null && C51968G9o.A1W(getSession(), r1)) {
            if (!182.A06(0Tu.A05, getSession(), 36328289383496901L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A8A(User user) {
        C19649WdD wdD = this.A0O;
        if (wdD != null) {
            wdD.A8A(user);
        }
    }

    public final void DZY(ULV ulv, Product product) {
        List list = product.A0O;
        if (list == null || list.isEmpty()) {
            A03(this, product);
        } else {
            C249713kF.A00.A0h(requireActivity(), (ProductGroup) null, product);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DZa(android.view.View r24, X.ULV r25, com.instagram.model.shopping.productfeed.ProductFeedItem r26, int r27, int r28) {
        /*
            r23 = this;
            r8 = r26
            com.instagram.user.model.Product r5 = r8.A02()
            r6 = r23
            java.util.List r0 = r6.A0R
            boolean r15 = r0.contains(r5)
            if (r15 == 0) goto L_0x0341
            java.lang.String r1 = r6.A0B
            java.lang.String r4 = "cta_bar"
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x0024
            java.lang.String r4 = "shopping_indicator"
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x0024
            java.lang.String r4 = "tags"
        L_0x0024:
            java.lang.String r9 = "related_products"
            java.lang.String r0 = r6.A0B
            boolean r0 = X.C55146Hcu.A00(r0)
            if (r0 == 0) goto L_0x033b
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
        L_0x0030:
            java.lang.String r9 = X.VH1.A00(r0)
        L_0x0034:
            com.instagram.common.session.UserSession r7 = r6.getSession()
            X.1Xj r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x0338
            X.1Xj r2 = r0.A1e(r7)
        L_0x0041:
            java.lang.String r0 = r6.A0B
            boolean r0 = X.C55146Hcu.A00(r0)
            r11 = r27
            r1 = r28
            if (r0 == 0) goto L_0x01ad
            X.VjM r13 = r6.A05
            if (r13 == 0) goto L_0x00c0
            X.1Xj r12 = r6.A01
            if (r12 == 0) goto L_0x00c0
            com.instagram.user.model.Product r9 = r8.A02()
            if (r9 == 0) goto L_0x00c0
            X.0wc r8 = r13.A00
            java.lang.String r0 = "instagram_shoppable_everything_item_click"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r8, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x00c0
            X.4DU r0 = r13.A02
            X.C51969G9p.A1A(r8, r0)
            java.lang.String r0 = r12.A30()
            java.lang.Long r10 = X.C51972G9s.A0j(r0)
            java.lang.String r0 = "seed_media_id"
            r8.A9F(r0, r10)
            com.instagram.common.session.UserSession r0 = r13.A01
            java.lang.String r0 = X.C231122qu.A07(r0, r12)
            java.lang.Long r10 = X.C51972G9s.A0i(r0)
            java.lang.String r0 = "seed_ad_id"
            r8.A9F(r0, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x01aa
            if (r10 == 0) goto L_0x01aa
            int r0 = r0.intValue()
            int r1 = r0 * 2
            int r0 = r10.intValue()
            int r1 = r1 + r0
            long r0 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x00a6:
            java.lang.String r0 = "position"
            r8.A9F(r0, r1)
            java.lang.String r1 = r9.A0H
            java.lang.String r0 = "product_id"
            r8.AAJ(r0, r1)
            com.instagram.user.model.User r0 = r9.A0B
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            java.lang.String r0 = "merchant_id"
            r8.AAJ(r0, r1)
            r8.Cgf()
        L_0x00c0:
            X.1Xj r8 = r6.A01
            r10 = 0
            if (r8 == 0) goto L_0x00fe
            java.lang.String r1 = r6.A0A
            r0 = 288(0x120, float:4.04E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00df
            r0 = 1354(0x54a, float:1.897E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00fe
        L_0x00df:
            X.W07 r0 = X.VKH.A00
            boolean r0 = r0.A04(r7, r8)
            if (r0 == 0) goto L_0x0199
            X.AnonymousClass3KE.A00()
            android.content.Context r9 = r6.requireContext()
            X.1Xj r0 = r6.A01
            X.1Xj r8 = r0.A1e(r7)
            X.Wbn r1 = new X.Wbn
            r1.<init>(r6)
            java.lang.String r0 = "shopping_indicator"
            X.AnonymousClass3KD.A00(r9, r7, r8, r1, r0)
        L_0x00fe:
            X.3kF r16 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r17 = r6.getActivity()
            java.lang.String r0 = r6.A0D
            r20 = r5
            r21 = r4
            r22 = r0
            r18 = r7
            r19 = r6
            X.WNN r4 = r16.A0L(r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = r6.A0A
            r4.A0N = r0
            java.lang.String r0 = r6.A0B
            r4.A0O = r0
            r5 = 1
            r4.A0Z = r5
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x0197
            com.instagram.user.model.User r0 = r0.A2A(r7)
            if (r0 == 0) goto L_0x0197
            X.1Xj r0 = r6.A01
            com.instagram.user.model.User r0 = r0.A2A(r7)
            java.lang.String r0 = r0.getId()
        L_0x0133:
            r4.A0F = r0
            X.UAP r1 = r6.A03
            com.instagram.model.shopping.productfeed.ProductTileMedia r0 = r1.A00
            if (r0 == 0) goto L_0x013f
            r4.A05 = r0
            r1.A00 = r3
        L_0x013f:
            if (r2 == 0) goto L_0x014a
            boolean r0 = r2.A63()
            if (r0 == 0) goto L_0x014a
            r10 = 1
            r4.A0X = r5
        L_0x014a:
            if (r15 != 0) goto L_0x014e
            if (r10 == 0) goto L_0x0179
        L_0x014e:
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x015d
            int r0 = r0.A15(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02(r2, r0)
        L_0x015d:
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x0170
            boolean r0 = r0.A5v()
            if (r0 != 0) goto L_0x0170
            X.Wd0 r0 = new X.Wd0
            r0.<init>(r6)
            r4.A0b = r5
            r4.A08 = r0
        L_0x0170:
            if (r15 == 0) goto L_0x0179
            X.Wcu r0 = new X.Wcu
            r0.<init>(r6)
            r4.A07 = r0
        L_0x0179:
            X.UxC r0 = r6.A0K
            if (r0 == 0) goto L_0x018c
            r4.A09 = r0
            android.content.Context r1 = r6.requireContext()
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A14(r1, r0)
        L_0x0188:
            X.WNN.A01(r4)
            return
        L_0x018c:
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x0188
            X.UxC r0 = r0.A25()
            r4.A09 = r0
            goto L_0x0188
        L_0x0197:
            r0 = r3
            goto L_0x0133
        L_0x0199:
            java.util.HashMap r1 = X.AnonymousClass3KD.A05
            X.1Xj r0 = r6.A01
            X.1Xj r0 = r0.A1e(r7)
            java.lang.String r0 = r0.A2n()
            r1.put(r0, r3)
            goto L_0x00fe
        L_0x01aa:
            r1 = 0
            goto L_0x00a6
        L_0x01ad:
            r10 = r25
            if (r2 == 0) goto L_0x0243
            boolean r0 = r2.CcK()
            if (r0 == 0) goto L_0x0243
            java.lang.String r12 = r5.A0H
            java.lang.String r11 = r6.A0A
            if (r25 == 0) goto L_0x0240
            java.lang.String r10 = r10.A00
        L_0x01bf:
            X.1Xj r9 = r6.A01
            java.lang.String r8 = "product_card_tap"
            java.lang.String r1 = "instagram_shopping"
            java.lang.String r0 = "_"
            java.lang.String r0 = X.002.A0g(r1, r0, r8)
            X.3sc r1 = new X.3sc
            r1.<init>(r6, r0)
            r1.A0G(r7, r9)
            r1.A6U = r12
            r1.A6S = r11
            r1.A5C = r10
            java.lang.String r0 = "shopping"
            r1.A4J = r0
            java.lang.String r0 = "product_tag"
            r1.A5K = r0
            X.C18694Vws.A00(r7, r1, r9, r6)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36325811187365111(0x810e22000034f7, double:3.0359274949661605E-306)
            boolean r0 = X.182.A06(r8, r7, r0)
            if (r0 == 0) goto L_0x00c0
            X.3Dp r8 = X.C238833Dp.A00(r7)
            X.3Ds r0 = X.C238863Ds.PRODUCT_TAG
            r9 = r24
            r8.A05(r9, r0)
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x021f
            boolean r0 = r0.A5v()
            if (r0 == 0) goto L_0x021f
            android.content.Context r0 = r6.requireContext()
            X.6Q1 r10 = new X.6Q1
            r10.<init>(r0, r7, r2)
        L_0x020f:
            X.3e7 r0 = new X.3e7
            r0.<init>(r10, r7, r2, r6)
            r8.A0A(r9, r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r8.A0B(r9, r0)
            goto L_0x00c0
        L_0x021f:
            X.3W1 r1 = X.G9t.A18(r2)
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x0236
            boolean r0 = r2.A5D()
            if (r0 == 0) goto L_0x0236
            X.1Xj r0 = r6.A01
            int r0 = r0.A15(r7)
            r1.A0B(r0)
        L_0x0236:
            android.content.Context r0 = r6.requireContext()
            X.4HH r10 = new X.4HH
            r10.<init>(r0, r1, r7, r2)
            goto L_0x020f
        L_0x0240:
            r10 = r3
            goto L_0x01bf
        L_0x0243:
            if (r15 == 0) goto L_0x032a
            if (r25 == 0) goto L_0x02c2
            java.lang.Object r0 = r10.A02
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x02c2
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02c2
            X.1Xj r13 = r6.A01
            if (r13 == 0) goto L_0x00c0
            if (r5 == 0) goto L_0x00c0
            java.lang.Object r0 = r10.A03
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00c0
            int r11 = r0.intValue()
            java.lang.String r12 = r6.A0A
            java.lang.String r10 = r6.A0B
            r0 = 1
            X.0qQ.A0B(r7, r0)
            com.instagram.user.model.User r0 = r5.A0B
            if (r0 == 0) goto L_0x00c0
            java.lang.String r14 = X.AnonymousClass3ZA.A00(r0)
            if (r14 == 0) goto L_0x00c0
            X.0wc r1 = X.AnonymousClass0kN.A01(r6, r7)
            java.lang.String r0 = "instagram_shopping_bottomsheet_product_row_tile_tap"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = r7.A06
            X.4Ny r1 = X.C263944Ny.A00(r0)
            java.lang.String r0 = "ig_user_id"
            r8.AAE(r1, r0)
            X.C13988Tno.A1A(r8, r14)
            java.lang.String r0 = r5.A0H
            X.C13991Tnr.A17(r8, r0)
            java.lang.String r0 = r13.getId()
            if (r0 == 0) goto L_0x0345
            X.C51965G9l.A1I(r8, r0)
            X.327 r1 = X.C13989Tnp.A0Q(r12)
            java.lang.String r0 = "submodule"
            r1.A06(r0, r9)
            java.lang.String r0 = "prior_submodule"
            X.C13988Tno.A19(r8, r1, r0, r10)
            long r0 = (long) r11
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3679(0xe5f, float:5.155E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A9F(r0, r1)
            r8.Cgf()
            goto L_0x00c0
        L_0x02c2:
            X.2qt r0 = r6.A0I
            X.Vkn r13 = r0.A02(r8, r11, r1)
            r13.A03(r9)
            java.lang.String r10 = X.C51969G9p.A0u(r2)
            X.2qt r0 = r13.A04
            if (r10 == 0) goto L_0x02ef
            X.1Ln r1 = r13.A03
            r1.A0m(r10)
            com.instagram.common.session.UserSession r9 = r0.A02
            java.lang.String r0 = X.C231122qu.A0I(r9, r10)
            java.lang.String r8 = "tracking_token"
            r1.A0R(r8, r0)
            X.1Ln r1 = r13.A01
            r1.A0m(r10)
            java.lang.String r0 = X.C231122qu.A0I(r9, r10)
            r1.A0R(r8, r0)
        L_0x02ef:
            X.UKi r0 = r6.A0L
            if (r0 == 0) goto L_0x0325
            X.9Iz r8 = r0.A01
            if (r8 == 0) goto L_0x0325
            X.1Ln r1 = r13.A03
            java.lang.Object r0 = r8.A00
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.String r12 = "carousel_index"
            r1.A0Q(r12, r0)
            java.lang.String r11 = r8.A02
            java.lang.String r10 = "carousel_media_id"
            r1.A0R(r10, r11)
            java.lang.Object r9 = r8.A01
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.String r8 = "carousel_m_t"
            r1.A0Q(r8, r9)
            X.1Ln r1 = r13.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A0R(r12, r0)
            r1.A0R(r10, r11)
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r1.A0R(r8, r0)
        L_0x0325:
            r13.A00()
            goto L_0x00c0
        L_0x032a:
            X.2qt r0 = r6.A0H
            X.Vkn r0 = r0.A02(r8, r11, r1)
            r0.A03(r9)
            r0.A00()
            goto L_0x00c0
        L_0x0338:
            r2 = r3
            goto L_0x0041
        L_0x033b:
            if (r15 == 0) goto L_0x0034
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            goto L_0x0030
        L_0x0341:
            java.lang.String r4 = "more_from_this_business"
            goto L_0x0024
        L_0x0345:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.DZa(android.view.View, X.ULV, com.instagram.model.shopping.productfeed.ProductFeedItem, int, int):void");
    }

    public final void DZd(Product product, String str, String str2, int i, int i2) {
        1Xj r1;
        C17984VjM vjM = this.A05;
        if (vjM != null && (r1 = this.A01) != null) {
            vjM.A00(r1, product, Integer.valueOf(i), Integer.valueOf(i2), str, str2);
        }
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        1Xj r1;
        C231142qw r3 = this.A0J;
        Product product = productTile.A07;
        String str = null;
        if (product == null || !this.A0R.contains(product)) {
            r1 = null;
        } else {
            r1 = this.A01;
        }
        C18591Vui A012 = r3.A01(r1, productTile);
        if (ulv != null) {
            str = ulv.A04;
        }
        A012.A08 = str;
        A012.A00();
    }

    public final void DZl(Product product) {
        A04(this, product.A0H);
    }

    public final 0jB E4k() {
        0jB r1 = new 0jB();
        r1.A06(this.A0W.A00);
        return r1;
    }

    public final void EBX(View view) {
        C19649WdD wdD = this.A0O;
        if (wdD != null) {
            wdD.EBX(view);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final void configureActionBar(2da r6) {
        String str;
        boolean z;
        if (this.A0S && (str = this.A0C) != null) {
            DbW.A1C(r6, str);
            1Xj r0 = this.A01;
            if (r0 == null || !(r0.A25() == C16560UxC.ADS_PRODUCT_PAGE || this.A01.A25() == C16560UxC.SHOPLESS_IN_APP_BROWSER)) {
                z = false;
            } else {
                z = true;
            }
            if (182.A06(0Tu.A05, getSession(), 36311835363771167L) && !z) {
                WBC wbc = new WBC(this, 59);
                Context requireContext = requireContext();
                Integer num = this.A0P;
                AnonymousClass3JR r1 = new AnonymousClass3JR();
                r1.A0G = wbc;
                r1.A0F = new C14673U0u(requireContext, num);
                r1.A05 = 2131973759;
                r6.AA3(new AnonymousClass3Jb(r1));
            }
        }
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

    public final String getModuleName() {
        if (C55146Hcu.A00(this.A0B)) {
            String str = this.A0B;
            if (str == null) {
                return "";
            }
            return str;
        }
        1Xj r0 = this.A01;
        if (r0 != null && r0.A5G()) {
            return "instagram_shopping_clips_viewer_product_feed";
        }
        return StringFormatUtil.formatStrLocaleSafe(AnonymousClass000.A00(4083), this.A0A);
    }

    public final String getSessionId() {
        return this.A0D;
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

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final void D6L(User user) {
        DbX.A14(requireContext(), AnonymousClass37D.A00);
        C19649WdD wdD = this.A0O;
        if (wdD != null) {
            wdD.D6L(user);
        }
    }

    public final 0jB E4l(1Xj r2) {
        return E4k();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: X.X9a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: X.X7y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: X.4DU} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f4, code lost:
        if (((com.instagram.user.model.Product) r3.A0R.get(0)).A04() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r48) {
        /*
            r47 = this;
            r0 = -1996123487(0xffffffff890592a1, float:-1.6078237E-33)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r3 = r47
            r0 = r48
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.super.onCreate(r0)
            android.os.Bundle r6 = r3.requireArguments()
            com.instagram.common.session.UserSession r1 = r3.getSession()
            java.lang.String r0 = X.C228022kf.A00(r6)
            r3.A0D = r0
            java.lang.String r0 = "product_collection"
            android.os.Parcelable r0 = r6.getParcelable(r0)
            com.instagram.user.model.ProductCollection r0 = (com.instagram.user.model.ProductCollection) r0
            r3.A08 = r0
            java.lang.String r0 = "tagged_products"
            java.util.ArrayList r0 = r6.getParcelableArrayList(r0)
            r3.A0R = r0
            java.util.Iterator r7 = r0.iterator()
        L_0x0032:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r5 = r7.next()
            com.instagram.user.model.Product r5 = (com.instagram.user.model.Product) r5
            java.util.List r4 = r3.A0X
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r0.<init>(r5)
            r4.add(r0)
            goto L_0x0032
        L_0x0049:
            java.lang.String r0 = "surface_title"
            java.lang.String r0 = r6.getString(r0)
            r3.A0C = r0
            java.lang.String r0 = "as_fullscreen"
            boolean r0 = r6.getBoolean(r0)
            r3.A0S = r0
            java.lang.String r0 = "media_id"
            java.lang.String r11 = r6.getString(r0)
            X.1Xj r0 = X.DbV.A0U(r1, r11)
            r3.A01 = r0
            r10 = 0
            if (r0 == 0) goto L_0x0169
            X.1Xj r4 = r0.A1e(r1)
            boolean r0 = r4.A5D()
            if (r0 == 0) goto L_0x016a
            X.1Xj r0 = r3.A01
            int r0 = r0.A15(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x007c:
            X.UKi r0 = X.C294165ly.A07(r4, r0, r10)
            r3.A0L = r0
            java.lang.String r0 = "prior_module_name"
            java.lang.String r0 = r6.getString(r0)
            r3.A0A = r0
            java.lang.String r0 = "prior_submodule_name"
            java.lang.String r0 = r6.getString(r0)
            r3.A0B = r0
            java.lang.String r0 = "media_carousel_index"
            java.lang.Integer r0 = X.DbV.A0o(r6, r0)
            r3.A09 = r0
            java.lang.String r4 = "ad_product_destination_override"
            boolean r0 = r6.containsKey(r4)
            if (r0 == 0) goto L_0x00b6
            java.lang.Integer r4 = X.DbV.A0o(r6, r4)
            if (r4 == 0) goto L_0x00b2
            java.util.Map r0 = X.C16560UxC.A01
            java.lang.Object r0 = r0.get(r4)
            X.UxC r0 = (X.C16560UxC) r0
            if (r0 != 0) goto L_0x00b4
        L_0x00b2:
            X.UxC r0 = X.C16560UxC.PRODUCT_DETAILS_PAGE
        L_0x00b4:
            r3.A0K = r0
        L_0x00b6:
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            r4 = 23605379(0x1683083, float:4.2646476E-38)
            X.2nK r0 = new X.2nK
            r0.<init>(r5, r3, r1, r4)
            r3.A0G = r0
            r3.registerLifecycleListener(r0)
            java.lang.String r12 = r3.getModuleName()
            java.lang.String r9 = r3.A0A
            com.instagram.user.model.User r0 = r3.A00()
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x00de
            r7 = r0
        L_0x00de:
            java.util.List r0 = r3.A0R
            boolean r4 = r0.isEmpty()
            r0 = 0
            if (r4 != 0) goto L_0x00f6
            java.util.List r4 = r3.A0R
            java.lang.Object r4 = r4.get(r0)
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            boolean r5 = r4.A04()
            r4 = 1
            if (r5 != 0) goto L_0x00f7
        L_0x00f6:
            r4 = 0
        L_0x00f7:
            X.Vap r8 = new X.Vap
            r8.<init>(r12, r9, r7, r4)
            r3.A04 = r8
            boolean r5 = r3.A06()
            r4 = 37370292(0x23a39b4, float:1.3681682E-37)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            if (r5 == 0) goto L_0x0164
            r4 = 37365602(0x23a2762, float:1.3676424E-37)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer[] r4 = new java.lang.Integer[]{r9, r4}
            java.util.List r4 = X.0sr.A1P(r4)
        L_0x011a:
            java.util.Iterator r14 = r4.iterator()
        L_0x011e:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x016d
            int r12 = X.AnonymousClass7TG.A0F(r14)
            java.util.Set r13 = r8.A04
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            boolean r4 = r13.contains(r7)
            if (r4 == 0) goto L_0x013b
            X.02m r5 = r8.A00
            r4 = 111(0x6f, float:1.56E-43)
            r5.markerEnd(r12, r4)
        L_0x013b:
            r13.add(r7)
            X.02m r7 = r8.A00
            r7.markerStart(r12)
            java.lang.String r5 = r8.A02
            java.lang.String r4 = "container_module"
            r7.markerAnnotate(r12, r4, r5)
            java.lang.String r5 = r8.A03
            java.lang.String r4 = "prior_module"
            r7.markerAnnotate(r12, r4, r5)
            java.lang.String r5 = r8.A01
            java.lang.String r4 = "merchant_id"
            r7.markerAnnotate(r12, r4, r5)
            boolean r5 = r8.A05
            r4 = 545(0x221, float:7.64E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r7.markerAnnotate(r12, r4, r5)
            goto L_0x011e
        L_0x0164:
            java.util.List r4 = X.AnonymousClass7TE.A1I(r9)
            goto L_0x011a
        L_0x0169:
            r4 = r10
        L_0x016a:
            r0 = r10
            goto L_0x007c
        L_0x016d:
            X.To7 r4 = r3.A0W
            r4.A00(r6)
            java.lang.String r8 = r3.A0D
            java.lang.String r7 = r3.A0A
            java.lang.String r6 = r3.A0B
            X.0qQ.A0B(r1, r0)
            r32 = 0
            com.instagram.user.model.ProductCollection r4 = r3.A08
            if (r4 == 0) goto L_0x03c1
            java.lang.String r22 = r4.Aoi()
        L_0x0185:
            com.instagram.user.model.ProductCollection r4 = r3.A08
            if (r4 == 0) goto L_0x0191
            com.instagram.api.schemas.ProductCollectionV2Type r4 = r4.Aou()
            java.lang.String r10 = r4.toString()
        L_0x0191:
            X.1Xj r4 = r3.A01
            if (r4 == 0) goto L_0x03be
            X.1Xj r4 = r4.A1e(r1)
            X.1iA r4 = r4.BR7()
            int r5 = r4.A00
        L_0x019f:
            X.2qt r4 = new X.2qt
            r12 = r4
            r13 = r3
            r14 = r1
            r15 = r8
            r16 = r32
            r17 = r10
            r18 = r7
            r19 = r6
            r20 = r32
            r21 = r32
            r23 = r32
            r24 = r32
            r25 = r32
            r26 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3.A0I = r4
            java.lang.String r7 = r3.A0D
            java.lang.String r6 = r3.A0A
            java.lang.String r5 = r3.A0B
            r26 = -1
            X.2qt r4 = new X.2qt
            r12 = r4
            r15 = r7
            r17 = r32
            r18 = r6
            r19 = r5
            r22 = r32
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3.A0H = r4
            X.2el r10 = r3.A00
            if (r10 != 0) goto L_0x01e1
            X.2el r10 = X.C51969G9p.A0k()
            r3.A00 = r10
        L_0x01e1:
            java.lang.String r8 = r3.A0D
            java.lang.String r7 = r3.A0A
            java.lang.String r6 = r3.A0B
            X.2qt r5 = r3.A0I
            X.VvA r4 = new X.VvA
            r12 = r4
            r13 = r1
            r14 = r10
            r15 = r3
            r16 = r5
            r17 = r8
            r18 = r7
            r19 = r6
            r20 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.A0N = r4
            X.2el r10 = r3.A00
            if (r10 != 0) goto L_0x0208
            X.2el r10 = X.C51969G9p.A0k()
            r3.A00 = r10
        L_0x0208:
            java.lang.String r8 = r3.A0D
            java.lang.String r7 = r3.A0A
            java.lang.String r6 = r3.A0B
            X.2qt r5 = r3.A0H
            X.VvA r4 = new X.VvA
            r11 = r4
            r12 = r1
            r13 = r10
            r14 = r3
            r15 = r5
            r16 = r8
            r17 = r7
            r18 = r6
            r19 = r32
            r20 = r32
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.A0M = r4
            java.lang.String r4 = r3.A0B
            boolean r4 = X.C55146Hcu.A00(r4)
            if (r4 == 0) goto L_0x03ae
            X.UxB r4 = X.C16559UxB.SHOP_SIMILAR
            X.UxB[] r4 = new X.C16559UxB[]{r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.A0Q = r4
            X.VjM r4 = new X.VjM
            r4.<init>(r1, r3)
            r3.A05 = r4
        L_0x0241:
            java.util.List r4 = r3.A0Q
            java.lang.Object r4 = r4.get(r0)
            X.UxB r4 = (X.C16559UxB) r4
            r3.A02 = r4
            android.content.Context r16 = r3.getContext()
            X.1Xj r14 = r3.A01
            X.UKi r13 = r3.A0L
            X.VvA r12 = r3.A0N
            X.VvA r11 = r3.A0M
            android.content.Context r4 = r3.requireContext()
            X.6z9 r19 = X.C51970G9q.A0g(r4, r3, r1)
            java.lang.String r10 = r3.A0A
            java.lang.String r8 = r3.A0B
            java.lang.Integer r7 = r3.A09
            X.VjM r6 = r3.A05
            java.util.List r5 = r3.A0Q
            boolean r4 = r3.A0S
            X.UAP r15 = new X.UAP
            r22 = r3
            r23 = r13
            r24 = r12
            r25 = r11
            r26 = r3
            r27 = r7
            r28 = r10
            r29 = r8
            r30 = r5
            r31 = r4
            r20 = r14
            r21 = r6
            r18 = r1
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r3.A03 = r15
            java.lang.String r4 = r3.A0B
            boolean r4 = X.C55146Hcu.A00(r4)
            if (r4 != 0) goto L_0x02a6
            X.UAP r6 = r3.A03
            java.util.List r5 = r3.A0X
            com.instagram.user.model.ProductCollection r4 = r3.A08
            X.0qQ.A0B(r5, r0)
            r6.A01 = r4
            X.UxB r4 = X.C16559UxB.TAGGED_PRODUCT
            r6.A03(r4, r5)
        L_0x02a6:
            X.Vap r4 = r3.A04
            X.02m r8 = r4.A00
            X.0qQ.A06(r8)
            java.util.Set r7 = r4.A04
            r5 = 37370292(0x23a39b4, float:1.3681682E-37)
            r6 = 1
            X.0qQ.A0B(r7, r6)
            boolean r4 = r7.contains(r9)
            if (r4 == 0) goto L_0x02c3
            r4 = 2
            r8.markerEnd(r5, r4)
            r7.remove(r9)
        L_0x02c3:
            androidx.fragment.app.FragmentActivity r31 = r3.getActivity()
            android.content.Context r30 = r3.getContext()
            java.lang.String r7 = r3.A0D
            java.lang.String r41 = r3.getModuleName()
            com.instagram.user.model.ProductCollection r4 = r3.A08
            android.content.Context r9 = r3.requireContext()
            if (r4 == 0) goto L_0x0396
            int r8 = X.Dbb.A01(r9)
            int r4 = X.DbY.A01(r9)
        L_0x02e1:
            int r4 = r4 * 2
            int r8 = r8 + r4
            java.lang.Integer r35 = java.lang.Integer.valueOf(r8)
            r33 = r1
            r34 = r3
            r36 = r32
            r37 = r32
            r38 = r32
            r39 = r32
            r40 = r32
            r42 = r32
            r43 = r32
            r44 = r7
            r45 = r6
            r46 = r0
            X.2qw r4 = X.C231132qv.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r3.A0J = r4
            androidx.fragment.app.FragmentActivity r12 = r3.requireActivity()
            X.2el r10 = r3.A00
            if (r10 != 0) goto L_0x0314
            X.2el r10 = X.C51969G9p.A0k()
            r3.A00 = r10
        L_0x0314:
            java.lang.String r9 = r3.A0A
            java.lang.String r8 = r3.A0B
            java.lang.String r7 = r3.A0D
            java.lang.Integer r18 = X.AnonymousClass05K.A0N
            X.1Xj r5 = r3.A01
            X.WdD r4 = new X.WdD
            r11 = r4
            r13 = r1
            r14 = r10
            r15 = r5
            r16 = r3
            r17 = r32
            r19 = r9
            r20 = r8
            r21 = r7
            r22 = r32
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.A0O = r4
            boolean r4 = r3.A06()
            if (r4 == 0) goto L_0x0356
            java.lang.String r4 = r3.A0B
            boolean r4 = X.C55146Hcu.A00(r4)
            if (r4 == 0) goto L_0x038f
            java.util.List r4 = r3.A0Q
            int r4 = r4.size()
            if (r4 < r6) goto L_0x038f
            java.util.List r4 = r3.A0Q
            java.lang.Object r0 = r4.get(r0)
        L_0x0351:
            X.UxB r0 = (X.C16559UxB) r0
            A02(r0, r3)
        L_0x0356:
            X.6xT r0 = X.C323426xT.A00(r1)
            java.lang.Integer r0 = r0.A06()
            r3.A0P = r0
            X.X71 r5 = r3.A07
            if (r5 == 0) goto L_0x036f
            if (r0 == 0) goto L_0x036f
            java.lang.String r4 = r3.A0D
            int r0 = r0.intValue()
            r5.FLW(r3, r4, r0)
        L_0x036f:
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.3DT> r1 = X.AnonymousClass3DT.class
            X.1wn r0 = r3.A0U
            r4.A01(r0, r1)
            java.lang.Class<X.6yN> r1 = X.C323956yN.class
            X.1wn r0 = r3.A0T
            r4.A01(r0, r1)
            java.lang.Class<X.WQI> r1 = X.WQI.class
            X.1wn r0 = r3.A0V
            r4.A01(r0, r1)
            r0 = 230497104(0xdbd1b50, float:1.16546E-30)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x038f:
            java.util.List r0 = r3.A0Q
            java.lang.Object r0 = r0.get(r6)
            goto L_0x0351
        L_0x0396:
            android.content.res.Resources r5 = r9.getResources()
            r4 = 2131165236(0x7f070034, float:1.7944683E38)
            int r8 = r5.getDimensionPixelOffset(r4)
            android.content.res.Resources r5 = r9.getResources()
            r4 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r4 = r5.getDimensionPixelOffset(r4)
            goto L_0x02e1
        L_0x03ae:
            X.UxB r5 = X.C16559UxB.TAGGED_PRODUCT
            X.UxB r4 = X.C16559UxB.SAME_MERCHANT
            X.UxB[] r4 = new X.C16559UxB[]{r5, r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.A0Q = r4
            goto L_0x0241
        L_0x03be:
            r5 = -1
            goto L_0x019f
        L_0x03c1:
            r22 = r10
            goto L_0x0185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-488034455);
        this.mContainerView = DbT.A0C(layoutInflater, viewGroup, R.layout.shopping_more_products_fragment);
        2el r2 = this.A00;
        if (r2 == null) {
            r2 = DbY.A0U();
            this.A00 = r2;
        }
        r2.A06(this.mContainerView, AnonymousClass3DZ.A00(this));
        this.mRecyclerView = DbZ.A0F(this.mContainerView, R.id.more_products_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.A01 = new U9T(this, 7);
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.A03);
        if (this.A07 != null && !C55146Hcu.A00(this.A0B)) {
            this.mRecyclerView.A15(new UAx(3, gridLayoutManager, this));
        }
        this.mRecyclerView.setItemAnimator((AnonymousClass3AS) null);
        this.mRecyclerView.A15(this.A0G);
        this.A0E = System.currentTimeMillis();
        View view = this.mContainerView;
        AnonymousClass0fD.A09(198947167, A022);
        return view;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(648876521);
        1Ng A002 = AnonymousClass1Nd.A00(getSession());
        A002.A02(this.A0U, AnonymousClass3DT.class);
        A002.A02(this.A0T, C323956yN.class);
        A002.A02(this.A0V, WQI.class);
        super.onDestroy();
        unregisterLifecycleListener(this.A0G);
        AnonymousClass0fD.A09(-349888486, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-907910798);
        1Xj r1 = this.A01;
        if (r1 != null && C51968G9o.A1W(getSession(), r1) && this.A0K == null) {
            1Xj r7 = this.A01;
            long currentTimeMillis = System.currentTimeMillis() - this.A0E;
            UserSession session = getSession();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, session), "instagram_shopping_sheet_closed");
            if (r7.A5E()) {
                r7 = r7.A1e(session);
            }
            String C9L = r7.C9L();
            if (A0e.isSampled()) {
                C51965G9l.A1L(A0e, C9L);
                A0e.A9F("time_spent", Long.valueOf(currentTimeMillis));
                A0e.Cgf();
            }
        }
        super.onDestroyView();
        ShoppingMoreProductsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(341167547, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1721854133);
        ShoppingMoreProductsFragment.super.onPause();
        C17597Vap vap = this.A04;
        if (vap != null) {
            try {
                02m r1 = vap.A00;
                0qQ.A06(r1);
                C18251VoI.A00(r1, vap.A04);
            } catch (Exception e) {
                0wb.A06(C273654mx.A00(505), "PerfLogger logCancel() failed", e);
            }
        }
        1Xj r12 = this.A01;
        if (r12 != null && C51968G9o.A1W(getSession(), r12) && !C55146Hcu.A00(this.A0B)) {
            C18694Vws.A02(getSession(), this.A01, this, this.A0R, System.currentTimeMillis() - this.A0F);
        }
        AnonymousClass0fD.A09(-759774084, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1049845941);
        super.onResume();
        this.A0F = System.currentTimeMillis();
        UAP uap = this.A03;
        if (uap != null) {
            uap.notifyDataSetChanged();
        }
        AnonymousClass0fD.A09(-1666942313, A022);
    }
}
