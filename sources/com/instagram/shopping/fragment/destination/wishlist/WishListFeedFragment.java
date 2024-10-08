package com.instagram.shopping.fragment.destination.wishlist;

import X.02m;
import X.0Aj;
import X.0nA;
import X.0qQ;
import X.1NY;
import X.1Ng;
import X.1OP;
import X.1wn;
import X.2da;
import X.2el;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass1XV;
import X.AnonymousClass2rW;
import X.AnonymousClass327;
import X.AnonymousClass36W;
import X.AnonymousClass3AS;
import X.AnonymousClass3BQ;
import X.AnonymousClass3DT;
import X.AnonymousClass3DZ;
import X.AnonymousClass3K2;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C13992Tns;
import X.C15483UdY;
import X.C15682Ugn;
import X.C15952UlT;
import X.C16675UzB;
import X.C17713Vci;
import X.C17869VhM;
import X.C17931ViM;
import X.C18025Vk1;
import X.C18661VwI;
import X.C18691Vwp;
import X.C19221WQb;
import X.C19653WdH;
import X.C19742Wej;
import X.C19764Wf5;
import X.C20658Wwq;
import X.C20928X4t;
import X.C20988X8e;
import X.C21000X8x;
import X.C231032ql;
import X.C249713kF;
import X.C249763kK;
import X.C252553pI;
import X.C268374dH;
import X.C268654dm;
import X.C3034368u;
import X.C320156rr;
import X.C322776wO;
import X.C323536xe;
import X.C3251771i;
import X.C3251871j;
import X.C51969G9p;
import X.C51974G9v;
import X.C59689JTv;
import X.C67603Mqb;
import X.DbU;
import X.DbX;
import X.DbY;
import X.Dc2;
import X.EXF;
import X.FWH;
import X.UY2;
import X.VP0;
import X.VP5;
import X.W3r;
import X.XC9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WishListFeedFragment extends AnonymousClass4DH implements C249763kK, AnonymousClass4DU, C231032ql, C21000X8x, AnonymousClass4DS, C322776wO, C20928X4t {
    public UserSession A00;
    public C15483UdY A01;
    public C15682Ugn A02;
    public C20988X8e A03;
    public C19742Wej A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public 2el A08;
    public C17931ViM A09;
    public C17713Vci A0A;
    public C18661VwI A0B;
    public C323536xe A0C;
    public C17869VhM A0D;
    public XC9 A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public final VP5 A0I = new VP5(this);
    public final 1wn A0J = new C19221WQb(this, 58);
    public final 1wn A0K = new C19221WQb(this, 57);
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final void DkL() {
    }

    public final void DzN(C268374dH r1) {
    }

    public final String getModuleName() {
        return "instagram_shopping_save_product_collection";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final boolean A01() {
        if (this.A01.A06.A01.size() != 1 || this.A04.A01.A05()) {
            return false;
        }
        return true;
    }

    public final void A9u(C268374dH r3, int i) {
        this.A09.A05.A03(r3, ((MultiProductComponent) r3).A00(), i);
    }

    public final 1NY Abz() {
        1NY A0O = DbU.A0O(this.A00);
        A0O.A0R(UY2.class, C18691Vwp.class);
        if (this.A07) {
            A0O.A0A("save/products/reconsideration/wish_list_collections_feed/");
            return A0O;
        }
        A0O.A0A("save/products/context_feed/");
        A0O.A9m("surface_type", "wishlist");
        return A0O;
    }

    public final XC9 BgB() {
        XC9 xc9 = this.A0E;
        if (xc9 != null) {
            return xc9;
        }
        C19653WdH wdH = new C19653WdH(this.A00, this.A09, this.A0A, this.A0B);
        this.A0E = wdH;
        return wdH;
    }

    public final void D7q(C3034368u r2) {
        C15483UdY.A01(this.A01);
    }

    public final void DBx() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        VP0 vp0 = (VP0) userSession.A01(VP0.class, C20658Wwq.A00);
        synchronized (vp0) {
            C13992Tns.A1C(vp0.A00, 37357157);
        }
    }

    public final /* bridge */ /* synthetic */ void DkM(AnonymousClass1XV r6, boolean z, boolean z2) {
        C15483UdY udY;
        List unmodifiableList;
        C15952UlT ulT;
        UY2 uy2 = (UY2) r6;
        if (z) {
            C15483UdY udY2 = this.A01;
            udY2.A06.A04();
            udY2.A07.A04();
            C15483UdY.A01(udY2);
        }
        if (this.A07) {
            this.A06 = false;
            udY = this.A01;
            unmodifiableList = Collections.unmodifiableList(uy2.A02.A03);
            0qQ.A0B(unmodifiableList, 0);
            ulT = udY.A07;
            ulT.A04();
        } else {
            if (!this.A04.A01.A05()) {
                this.A07 = true;
                this.A06 = true;
                this.A04.A01(false, false);
            }
            udY = this.A01;
            unmodifiableList = Collections.unmodifiableList(uy2.A02.A03);
            0qQ.A0B(unmodifiableList, 0);
            ulT = udY.A06;
        }
        ulT.A0A(unmodifiableList);
        C15483UdY.A01(udY);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A03.FKG();
        if (!this.A05) {
            this.A05 = true;
        }
    }

    public final void DzD(C16675UzB uzB, C268374dH r22, int i) {
        String title;
        String str;
        String str2;
        int i2 = i;
        C17931ViM viM = this.A09;
        ProductFeedResponse productFeedResponse = null;
        AnonymousClass4DU r9 = viM.A02;
        UserSession userSession = viM.A01;
        C268374dH r10 = r22;
        C16675UzB B5W = r10.B5W();
        B5W.getClass();
        String obj = B5W.toString();
        String str3 = viM.A06;
        String str4 = viM.A07;
        W3r.A0D(userSession, r9, r10, obj, str3, str4);
        if (r10.Aif() == null || r10.Aif().Awg() == null) {
            title = r10.getTitle();
        } else {
            title = r10.Aif().Awg();
        }
        C16675UzB uzB2 = uzB;
        boolean A1a = C51969G9p.A1a(uzB2, C16675UzB.RECENTLY_VIEWED);
        C18025Vk1 A0J2 = C249713kF.A00.A0J(viM.A00.getActivity(), userSession, uzB2, str4, r9.getModuleName());
        A0J2.A0D = title;
        String str5 = null;
        if (r10.Aif() != null) {
            str = r10.Aif().Awf();
        } else {
            str = null;
        }
        A0J2.A0C = str;
        A0J2.A03 = null;
        C16675UzB B5W2 = r10.B5W();
        C16675UzB uzB3 = C16675UzB.INCENTIVE;
        if (B5W2 == uzB3) {
            str2 = "incentive_products";
        } else {
            str2 = null;
        }
        A0J2.A0A = str2;
        if (A1a) {
            productFeedResponse = r10.Bg7();
        } else {
            i2 = 0;
        }
        A0J2.A02 = productFeedResponse;
        A0J2.A00 = i2;
        if (uzB2 == uzB3 && r10.Aif() != null) {
            str5 = r10.Aif().Awd();
        }
        A0J2.A05 = str5;
        A0J2.A00();
    }

    public final void DzM(C268374dH r15) {
        C17931ViM viM = this.A09;
        AnonymousClass4DU r3 = viM.A02;
        UserSession userSession = viM.A01;
        C268374dH r4 = r15;
        String A002 = ((MultiProductComponent) r4).A00();
        String str = viM.A06;
        String str2 = viM.A07;
        W3r.A0D(userSession, r3, r4, A002, str, str2);
        C249713kF.A00.A1A(viM.A00.getActivity(), userSession, str2, r3.getModuleName(), r15.C2K());
    }

    public final void EBz(View view, C268374dH r4) {
        this.A09.A05.A01(view, r4, ((MultiProductComponent) r4).A00());
    }

    public final void FJ3(View view) {
        this.A09.A05.A00.A04(view);
    }

    public final void configureActionBar(2da r2) {
        if (this.mFragmentManager != null) {
            r2.Eu4(true);
            r2.Eom(2131972607);
            C323536xe r0 = this.A0C;
            if (r0 != null) {
                r0.A01(r2);
            }
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final String getSessionId() {
        return this.A0H;
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    public static void A00(ProductFeedItem productFeedItem, WishListFeedFragment wishListFeedFragment, boolean z) {
        boolean A012 = wishListFeedFragment.A01();
        C15483UdY udY = wishListFeedFragment.A01;
        C15952UlT ulT = udY.A06;
        if (z) {
            AnonymousClass2rW.A01(ulT, productFeedItem, 0, true);
            C15483UdY.A01(udY);
            RecyclerView recyclerView = wishListFeedFragment.mRecyclerView;
            if (!(recyclerView == null || wishListFeedFragment.getContext() == null)) {
                C67603Mqb mqb = new C67603Mqb(wishListFeedFragment.getContext(), wishListFeedFragment, 2);
                mqb.A00 = 0;
                C252553pI r0 = recyclerView.A0D;
                if (r0 != null) {
                    r0.A0t(mqb);
                }
            }
        } else {
            String id = productFeedItem.getId();
            0qQ.A07(id);
            ulT.A0D(id);
            C15483UdY.A01(udY);
        }
        boolean A013 = wishListFeedFragment.A01();
        if (A012 != A013) {
            1Ng A002 = AnonymousClass1Nd.A00(wishListFeedFragment.A00);
            if (A013) {
                0qQ.A07(((ProductFeedItem) wishListFeedFragment.A01.A06.A01.get(0)).getId());
            }
            A002.A00(new Object());
        }
    }

    public final void DBy() {
        requireActivity().Alb().Ewb(EXF.A0J, AnonymousClass36W.FOLLOWERS_SHARE);
    }

    public final void DkK(C268654dm r7, boolean z) {
        C59689JTv.A01(getActivity(), "shopping_feed_failed", 2131956760, 0);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A03.FKG();
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        VP0 vp0 = (VP0) userSession.A01(VP0.class, C20658Wwq.A00);
        synchronized (vp0) {
            Set set = vp0.A00;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int A0F2 = AnonymousClass7TG.A0F(it);
                02m.A0p.markerPoint(A0F2, "NETWORK_FAILED");
                02m.A0p.markerEnd(A0F2, 3);
            }
            set.clear();
        }
    }

    public final void DzI(C268374dH r1, User user) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = -1984987144(0xffffffff89af7ff8, float:-4.225006E-33)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = r24
            r1 = r25
            com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment.super.onCreate(r1)
            android.os.Bundle r7 = r0.requireArguments()
            com.instagram.common.session.UserSession r5 = X.DbX.A0U(r0)
            r0.A00 = r5
            r1 = 0
            X.0qQ.A0B(r5, r1)
            X.Wwq r4 = X.C20658Wwq.A00
            java.lang.Class<X.VP0> r3 = X.VP0.class
            java.lang.Object r6 = r5.A01(r3, r4)
            X.VP0 r6 = (X.VP0) r6
            r5 = 37357157(0x23a0665, float:1.3666957E-37)
            monitor-enter(r6)
            java.util.Set r4 = r6.A00     // Catch:{ all -> 0x01e0 }
            java.lang.Integer r3 = X.C13990Tnq.A0Z(r4, r5)     // Catch:{ all -> 0x01e0 }
            r4.add(r3)     // Catch:{ all -> 0x01e0 }
            X.02m r3 = X.02m.A0p     // Catch:{ all -> 0x01e0 }
            r3.markerStart(r5)     // Catch:{ all -> 0x01e0 }
            monitor-exit(r6)
            java.lang.String r3 = X.C228022kf.A00(r7)
            r0.A0H = r3
            java.lang.String r4 = "prior_module_name"
            java.lang.String r3 = r7.getString(r4)
            if (r3 != 0) goto L_0x01ca
            java.lang.String r3 = ""
        L_0x0049:
            r0.A0F = r3
            java.lang.String r3 = "prior_submodule_name"
            java.lang.String r8 = r7.getString(r3)
            r0.A0G = r8
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.String r7 = r0.A0F
            java.lang.String r6 = r0.A0H
            X.C51974G9v.A1L(r3, r7, r6)
            X.0wc r4 = X.AnonymousClass0kN.A01(r0, r3)
            java.lang.String r3 = "instagram_shopping_wishlist_entry"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r4, r3)
            X.327 r4 = X.C13989Tnp.A0Q(r7)
            java.lang.String r3 = "prior_submodule"
            r4.A06(r3, r8)
            java.lang.String r3 = "shopping_session_id"
            X.C13989Tnp.A1K(r4, r3, r6)
            X.C13988Tno.A17(r5, r4)
            r5.Cgf()
            X.0gy r12 = X.AnonymousClass07i.A00(r0)
            android.content.Context r3 = r0.getContext()
            r3.getClass()
            android.content.Context r4 = r0.getContext()
            com.instagram.common.session.UserSession r3 = r0.A00
            r9 = 0
            X.AnonymousClass7TG.A1P(r4, r3)
            X.Wej r5 = new X.Wej
            r10 = r5
            r11 = r4
            r13 = r3
            r14 = r0
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A04 = r5
            android.content.Context r4 = r0.getContext()
            X.WcY r3 = new X.WcY
            r3.<init>(r4, r0, r5)
            r0.A03 = r3
            X.2el r3 = X.2el.A00()
            r0.A08 = r3
            com.instagram.common.session.UserSession r3 = r0.A00
            androidx.fragment.app.FragmentActivity r11 = r0.requireActivity()
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            X.Ugn r10 = new X.Ugn
            r13 = r3
            r16 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A02 = r10
            X.Wd8 r8 = new X.Wd8
            r8.<init>(r0)
            com.instagram.common.session.UserSession r6 = r0.A00
            java.lang.String r5 = r0.A0H
            java.lang.String r4 = r0.A0F
            java.lang.String r3 = r0.A0G
            X.UzB r14 = X.C16675UzB.SAVED
            X.VvJ r7 = new X.VvJ
            r10 = r7
            r11 = r0
            r12 = r6
            r13 = r0
            r15 = r5
            r16 = r4
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.2el r3 = r0.A08
            r7.A00 = r3
            r7.A03 = r0
            r7.A05 = r8
            X.VwI r3 = r7.A02()
            r0.A0B = r3
            X.2qt r14 = X.C18626VvJ.A00(r7)
            com.instagram.common.session.UserSession r11 = r7.A0L
            X.4DU r13 = r7.A0M
            X.2el r12 = r7.A00
            if (r12 == 0) goto L_0x01d8
            X.UzB r4 = r7.A0N
            java.lang.String r15 = r7.A0Q
            java.lang.String r8 = r7.A0O
            X.57K r3 = r7.A02
            if (r3 == 0) goto L_0x0105
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x0108
        L_0x0105:
            r4.toString()
        L_0x0108:
            java.util.List r3 = r7.A0G
            X.VvA r10 = new X.VvA
            r17 = r9
            r18 = r9
            r19 = r3
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.Fragment r6 = r7.A0K
            X.X56 r5 = r7.A05
            com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment r4 = r7.A03
            if (r4 == 0) goto L_0x01d0
            X.Vci r3 = new X.Vci
            r16 = r11
            r17 = r13
            r18 = r14
            r19 = r4
            r20 = r5
            r21 = r10
            r22 = r15
            r23 = r8
            r14 = r3
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A0A = r3
            X.ViM r3 = r7.A01()
            r0.A09 = r3
            android.content.Context r11 = r0.getContext()
            X.Wej r7 = r0.A04
            com.instagram.common.session.UserSession r6 = r0.A00
            X.X8e r5 = r0.A03
            X.2el r3 = r0.A08
            X.2nI r12 = X.C229382nI.A03(r0, r6, r3)
            X.Ugn r4 = r0.A02
            X.UdY r3 = new X.UdY
            r16 = r5
            r17 = r0
            r18 = r7
            r10 = r3
            r13 = r0
            r14 = r6
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A01 = r3
            com.instagram.common.session.UserSession r3 = r0.A00
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.3DT> r4 = X.AnonymousClass3DT.class
            X.1wn r3 = r0.A0K
            r5.A01(r3, r4)
            java.lang.Class<X.FWH> r4 = X.FWH.class
            X.1wn r3 = r0.A0J
            r5.A01(r3, r4)
            X.Wej r4 = r0.A04
            r3 = 1
            r4.A01(r3, r1)
            X.Ugn r1 = r0.A02
            r1.A00()
            X.X8e r1 = r0.A03
            r1.FKG()
            com.instagram.common.session.UserSession r3 = r0.A00
            X.Uxa r1 = X.C16580Uxa.WishlistListFeedFragment
            X.VhM r1 = X.C18265Vof.A00(r3, r1)
            r0.A0D = r1
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x01c3
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r1 = X.0Tu.A05
            r3 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r1 = X.DbY.A1Y(r1, r5, r3)
            if (r1 == 0) goto L_0x01c3
            X.3kF r6 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r7 = r0.getActivity()
            com.instagram.common.session.UserSession r8 = r0.A00
            java.lang.String r11 = r0.A0H
            java.lang.String r12 = "instagram_shopping_save_product_collection"
            X.VhM r10 = r0.A0D
            java.lang.String r13 = "wish_list"
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            X.6xe r1 = r6.A0Q(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A0C = r1
            r0.registerLifecycleListener(r1)
        L_0x01c3:
            r0 = 1521225881(0x5aac1099, float:2.42159727E16)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x01ca:
            java.lang.String r3 = r7.getString(r4)
            goto L_0x0049
        L_0x01d0:
            java.lang.String r1 = "wishlistFeedControllerProvider must not be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d8:
            java.lang.String r1 = "viewpointManager must not be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01e0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2076361187);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.A07 = new C19764Wf5(this, 3);
        C13990Tnq.A1O(refreshableNestedScrollingParent);
        this.mRecyclerView = DbX.A0K(this.mRefreshableContainer);
        getContext().getClass();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        linearLayoutManager.A0v(true);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.A01);
        this.mRecyclerView.setItemAnimator((AnonymousClass3AS) null);
        this.mRecyclerView.A15(new C3251871j(linearLayoutManager, this.A04, C3251771i.A0B));
        int A012 = DbY.A01(requireContext());
        0nA.A0i(this.mRecyclerView, A012, A012);
        this.mRecyclerView.setClipToPadding(false);
        this.A0D.A00();
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0fD.A09(1672513038, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1650950438);
        super.onDestroy();
        UserSession userSession = this.A00;
        String str = this.A0F;
        String str2 = this.A0G;
        String str3 = this.A0H;
        C51974G9v.A1L(userSession, str, str3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, userSession), "instagram_shopping_wishlist_exit");
        AnonymousClass327 A0Q = C13989Tnp.A0Q(str);
        A0Q.A06("prior_submodule", str2);
        C13989Tnp.A1K(A0Q, "shopping_session_id", str3);
        C13988Tno.A17(A0e, A0Q);
        A0e.Cgf();
        1Ng A002 = AnonymousClass1Nd.A00(this.A00);
        A002.A02(this.A0K, AnonymousClass3DT.class);
        A002.A02(this.A0J, FWH.class);
        C323536xe r0 = this.A0C;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
        }
        AnonymousClass0fD.A09(181832436, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1564559347);
        super.onDestroyView();
        WishListFeedFragmentLifecycleUtil.cleanupReferences(this);
        C17869VhM vhM = this.A0D;
        vhM.A01.flowEndSuccess(vhM.A00);
        AnonymousClass0fD.A09(16392404, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-220896419);
        WishListFeedFragment.super.onPause();
        C17713Vci vci = this.A0A;
        Dc2 dc2 = vci.A00;
        if (dc2 != null) {
            DbX.A1R(dc2);
            vci.A00 = null;
        }
        AnonymousClass0fD.A09(1970468112, A022);
    }

    public final void onResume() {
        AnonymousClass3BQ r1;
        int A022 = AnonymousClass0fD.A02(2076459789);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            1OP r0 = 1OP.$redex_init_class;
            AnonymousClass3K2 A042 = AnonymousClass3K2.A04(activity);
            if (A042 != null && A042.A0Z() && ((r1 = A042.A0H) == AnonymousClass3BQ.SHOP_PROFILE || r1 == AnonymousClass3BQ.SAVE_PRODUCT)) {
                A042.A0X(this);
            }
        }
        AnonymousClass0fD.A09(972404127, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            this.A08.A06(recyclerView, AnonymousClass3DZ.A00(this));
        }
    }
}
