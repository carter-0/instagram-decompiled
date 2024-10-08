package com.instagram.shopping.fragment.pdp;

import X.002;
import X.0Aj;
import X.0jB;
import X.0qQ;
import X.1Au;
import X.1Av;
import X.1NY;
import X.1Ng;
import X.1OC;
import X.1Xj;
import X.1Xv;
import X.1wn;
import X.2el;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass3M7;
import X.AnonymousClass4D6;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13992Tns;
import X.C14005To7;
import X.C14819UAy;
import X.C15029UKi;
import X.C15040UKt;
import X.C15054ULx;
import X.C15625Ufr;
import X.C15678Ugj;
import X.C15688Ugt;
import X.C16231Uqu;
import X.C16232Uqv;
import X.C16233Uqw;
import X.C16234Uqx;
import X.C16235Uqy;
import X.C16236Uqz;
import X.C16237Ur0;
import X.C16238Ur1;
import X.C16239Ur2;
import X.C16605Uxz;
import X.C16679UzF;
import X.C17074VGw;
import X.C17088VHk;
import X.C17459VWm;
import X.C17469VWw;
import X.C17498VYb;
import X.C17504VYi;
import X.C17508VYm;
import X.C17537VZq;
import X.C17539VZs;
import X.C17804VgH;
import X.C17841Vgu;
import X.C17922ViD;
import X.C18001Vjd;
import X.C18020Vjw;
import X.C18021Vjx;
import X.C18044VkS;
import X.C18065Vkr;
import X.C18502Vsx;
import X.C18570VuM;
import X.C18583VuZ;
import X.C18588Vuf;
import X.C18616Vv9;
import X.C18738VzJ;
import X.C18782W1i;
import X.C19221WQb;
import X.C19226WQh;
import X.C19676Wde;
import X.C228172ku;
import X.C229382nI;
import X.C229402nK;
import X.C230882qT;
import X.C231002qi;
import X.C231122qu;
import X.C232682uF;
import X.C2370836g;
import X.C252063oV;
import X.C263944Ny;
import X.C273414mX;
import X.C273494mf;
import X.C273504mg;
import X.C2818159r;
import X.C294165ly;
import X.C45020Cox;
import X.C45703D2c;
import X.C51965G9l;
import X.C63446KxB;
import X.C64835Lix;
import X.CGR;
import X.DHZ;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbZ;
import X.EVS;
import X.JTR;
import X.Pxf;
import X.V4S;
import X.VP6;
import X.VPP;
import X.W03;
import X.W1L;
import X.W1W;
import X.W2j;
import X.WQ6;
import X.WQ7;
import X.WQO;
import X.WQU;
import X.X55;
import X.X9C;
import X.X9L;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AdsProductPageFragment extends AnonymousClass4DH implements X9C, C232682uF, C273504mg, C273494mf, C273414mX, AnonymousClass4DS, AnonymousClass3M7, X55 {
    public C229382nI A00;
    public UserSession A01;
    public 1Xj A02;
    public C231002qi A03;
    public C230882qT A04;
    public C17922ViD A05;
    public W03 A06;
    public W1W A07;
    public C18065Vkr A08;
    public C18782W1i A09;
    public C15688Ugt A0A;
    public C16235Uqy A0B;
    public C18583VuZ A0C;
    public C16238Ur1 A0D;
    public C16237Ur0 A0E;
    public C16236Uqz A0F;
    public C16239Ur2 A0G;
    public C16234Uqx A0H;
    public C16232Uqv A0I;
    public C16233Uqw A0J;
    public C17498VYb A0K;
    public C17841Vgu A0L;
    public ProductDetailsPageArguments A0M;
    public X9L A0N;
    public C18588Vuf A0O = new C18588Vuf(new W2j());
    public C17804VgH A0P;
    public C17508VYm A0Q;
    public C18020Vjw A0R;
    public C18044VkS A0S;
    public Product A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public C229402nK A0Z;
    public C17537VZq A0a;
    public C18021Vjx A0b;
    public C15678Ugj A0c;
    public C18738VzJ A0d;
    public C16231Uqu A0e;
    public C18616Vv9 A0f;
    public C19676Wde A0g;
    public VP6 A0h;
    public C17504VYi A0i;
    public C17469VWw A0j;
    public boolean A0k;
    public final C14819UAy A0l = new C14819UAy();
    public final 2el A0m = 2el.A00();
    public final String A0n = C2818159r.A01();
    public final 1wn A0o = new C19221WQb(this, 68);
    public final 1wn A0p = new C19221WQb(this, 67);
    public final 1wn A0q = new WQU(this, 9);
    public final C14005To7 A0r = new C14005To7();
    public final C228172ku A0s = new C228172ku();
    public FrameLayout mBaseFrameLayout;
    public RecyclerView mRecyclerView;

    public final void A02(CGR cgr, C15040UKt uKt) {
        X9L x9l;
        C15054ULx uLx;
        String str;
        this.A0k = true;
        UserSession userSession = this.A01;
        boolean z = uKt.A0A;
        if (z) {
            x9l = null;
        } else {
            x9l = this.A0N;
        }
        DHZ A002 = C45020Cox.A00(userSession, cgr, x9l);
        this.A0T = A002.Bft();
        User BRo = A002.BRo();
        if (BRo != null) {
            this.A0A.A00(DbT.A0K(requireActivity()), this.A0T.A01.A08, BRo);
        }
        A01(this.A0T);
        C18588Vuf A003 = this.A0P.A00(A002, this.A0O);
        W2j w2j = new W2j(A003);
        C18502Vsx vsx = A003.A02;
        C16605Uxz uxz = vsx.A00;
        C16605Uxz uxz2 = vsx.A04;
        C16605Uxz uxz3 = vsx.A05;
        C16605Uxz uxz4 = vsx.A01;
        C16605Uxz uxz5 = vsx.A02;
        C16605Uxz uxz6 = C16605Uxz.LOADED;
        w2j.A02 = new C18502Vsx(uxz, uxz4, uxz5, uxz6, uxz2, uxz3, true);
        A00(A002, new C18588Vuf(w2j));
        this.A0C.A01();
        W2j w2j2 = new W2j(this.A0O);
        C18502Vsx vsx2 = this.A0O.A02;
        boolean z2 = vsx2.A06;
        w2j2.A02 = new C18502Vsx(vsx2.A00, vsx2.A01, vsx2.A02, uxz6, vsx2.A04, vsx2.A05, z2);
        Elq(new C18588Vuf(w2j2));
        if (z) {
            W03 w03 = this.A06;
            Product product = this.A0T;
            C263944Ny r0 = null;
            if (product != null) {
                uLx = C294165ly.A03(w03.A03, product);
            } else {
                uLx = null;
            }
            0Aj A0e2 = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_load_success");
            if (A0e2.isSampled()) {
                C15029UKi uKi = w03.A01;
                if (uKi == null || (str = uKi.A05) == null) {
                    str = "";
                }
                C51965G9l.A1L(A0e2, W03.A00(A0e2, w03, str));
                if (uLx != null) {
                    r0 = uLx.A01;
                }
                W03.A01(A0e2, w03, C13992Tns.A0E(r0, A0e2, uLx));
                A0e2.Cgf();
            }
            W03 w032 = this.A06;
            Product product2 = this.A0T;
            w032.A02(product2, this.A0O.A04.A01(this.A01, product2).size());
        }
        UserSession userSession2 = this.A01;
        Product product3 = this.A0T;
        0qQ.A0B(userSession2, 0);
        0qQ.A0B(product3, 1);
        C64835Lix A004 = C63446KxB.A00(userSession2, false);
        0qQ.A0B(A004, 2);
        A004.A0H(C16679UzF.RECENTLY_VIEWED, product3);
    }

    public final void Cyc() {
    }

    public final void Cyf() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r5) {
        /*
            r4 = this;
            r0 = 1
            r5.Eu4(r0)
            X.1Xj r1 = r4.A02
            r3 = 0
            if (r1 == 0) goto L_0x0074
            com.instagram.common.session.UserSession r0 = r4.A01
            com.instagram.user.model.User r0 = r1.A2A(r0)
            if (r0 == 0) goto L_0x0074
            X.Ugt r2 = r4.A0A
            X.1Xj r1 = r4.A02
            com.instagram.common.session.UserSession r0 = r4.A01
            com.instagram.user.model.User r0 = r1.A2A(r0)
        L_0x001b:
            r2.A00(r5, r3, r0)
        L_0x001e:
            java.lang.String r2 = r4.A0U
            com.instagram.common.session.UserSession r1 = r4.A01
            java.lang.String r0 = r1.A06
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005a
            boolean r0 = X.2R8.A00(r1)
            if (r0 != 0) goto L_0x005a
            com.instagram.common.session.UserSession r0 = r4.A01
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.AkH()
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r4.A0U
            com.instagram.common.session.UserSession r0 = r4.A01
            java.lang.String r0 = r0.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0073
            com.instagram.user.model.Product r0 = r4.A0T
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0073
        L_0x005a:
            X.3JR r2 = new X.3JR
            r2.<init>()
            r0 = 2131238568(0x7f081ea8, float:1.8093418E38)
            r2.A06 = r0
            r0 = 2131966173(0x7f1338dd, float:1.9569177E38)
            r2.A05 = r0
            r1 = 60
            X.WBC r0 = new X.WBC
            r0.<init>(r4, r1)
            X.DbX.A19(r0, r2, r5)
        L_0x0073:
            return
        L_0x0074:
            X.X9L r0 = r4.A0N
            if (r0 == 0) goto L_0x001e
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x001e
            X.Ugt r2 = r4.A0A
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.pdp.AdsProductPageFragment.configureActionBar(X.2da):void");
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return "instagram_ads_app";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.3Vq, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        r2 = X.C242663Vj.A03(r12.A00, r6, r15, X.AnonymousClass05K.A00, r12.A02.getModuleName());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.X9L r17, X.C18588Vuf r18) {
        /*
            r16 = this;
            r3 = r16
            r2 = r17
            r3.A0N = r2
            r1 = r18
            r3.A0O = r1
            X.ViD r0 = r3.A05
            r0.A00(r2, r1)
            X.VYb r12 = r3.A0K
            X.X9L r1 = r3.A0N
            X.Vuf r14 = r3.A0O
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            r13 = 8
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0q(r14, r0)
            com.instagram.user.model.Product r11 = r14.A09
            if (r11 == 0) goto L_0x00d1
            java.lang.String r0 = r11.A0H
            java.util.List r10 = r1.Bqs(r0)
            r9 = 0
            int r7 = r10.size()
        L_0x002f:
            if (r9 >= r7) goto L_0x00c2
            java.lang.Object r0 = r10.get(r9)
            X.WSU r0 = (X.WSU) r0
            java.lang.Integer r0 = r0.A01
            int r1 = r0.intValue()
            if (r1 == r13) goto L_0x005e
            r0 = 17
            if (r1 != r0) goto L_0x00be
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0056
            int r0 = X.Pxe.A0A(r8)
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.uigraph.creation.SimpleUiGraphNodeParams<com.instagram.uigraph.data.UiGraphNodeData<com.instagram.shopping.controller.pdp.prefetch.ProductDetailsPagePrefetchMetadata>>"
            X.0qQ.A0C(r1, r0)
        L_0x0056:
            java.lang.String r1 = "getProductFeedResponse"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x005e:
            X.W1L r0 = r14.A04
            com.instagram.common.session.UserSession r6 = r12.A01
            java.util.List r5 = r0.A01(r6, r11)
            r4 = 0
            int r3 = r5.size()
        L_0x006b:
            if (r4 >= r3) goto L_0x00be
            java.lang.Object r1 = r5.get(r4)
            X.0qQ.A07(r1)
            X.Vjd r1 = (X.C18001Vjd) r1
            java.lang.Integer r0 = r1.A02
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x00a6;
                case 2: goto L_0x007f;
                case 3: goto L_0x007f;
                case 4: goto L_0x00a3;
                case 5: goto L_0x00ab;
                default: goto L_0x007f;
            }
        L_0x007f:
            android.content.Context r0 = r12.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x00a3
            X.4DU r0 = r12.A02
            java.lang.String r0 = r0.getModuleName()
            X.3Vo r2 = X.C242663Vj.A06(r6, r1, r0)
        L_0x0091:
            X.WfS r0 = new X.WfS
            r0.<init>()
            X.1yX r1 = new X.1yX
            r1.<init>(r2, r0)
            X.9IN r0 = new X.9IN
            r0.<init>(r1, r9, r4)
            r8.add(r0)
        L_0x00a3:
            int r4 = r4 + 1
            goto L_0x006b
        L_0x00a6:
            X.UrZ r1 = (X.C16272UrZ) r1
            X.1Xj r15 = r1.A00
            goto L_0x00af
        L_0x00ab:
            X.Urb r1 = (X.C16274Urb) r1
            X.1Xj r15 = r1.A00
        L_0x00af:
            android.content.Context r2 = r12.A00
            X.4DU r0 = r12.A02
            java.lang.String r1 = r0.getModuleName()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.3Vo r2 = X.C242663Vj.A03(r2, r6, r15, r0, r1)
            goto L_0x0091
        L_0x00be:
            int r9 = r9 + 1
            goto L_0x002f
        L_0x00c2:
            com.instagram.common.session.UserSession r0 = r12.A01
            X.1y3 r1 = X.1y1.A00(r0)
            X.4DU r0 = r12.A02
            java.lang.String r0 = r0.getModuleName()
            r1.A06(r0, r8)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.pdp.AdsProductPageFragment.A00(X.X9L, X.Vuf):void");
    }

    private void A01(Product product) {
        String str;
        C18782W1i w1i = this.A09;
        0qQ.A0B(product, 0);
        w1i.A03 = product;
        C18020Vjw vjw = this.A0R;
        vjw.A06.A00 = product;
        vjw.A08.A00 = product;
        vjw.A00 = product;
        C17537VZq vZq = this.A0a;
        if (!vZq.A00) {
            vZq.A00 = true;
            UserSession userSession = vZq.A02;
            1Av A002 = 1Au.A00(userSession);
            if (product.A04() && !A002.A1t()) {
                AnonymousClass4DU r3 = vZq.A03;
                FragmentActivity fragmentActivity = vZq.A01;
                String str2 = vZq.A04;
                User user = product.A0B;
                if (user != null) {
                    str = user.getUsername();
                } else {
                    str = "";
                }
                C17074VGw.A00(fragmentActivity, r3, userSession, str2, str);
            }
        }
    }

    public final void A03(boolean z) {
        String str;
        String str2;
        ProductTileMedia productTileMedia;
        String str3;
        boolean z2 = z;
        if (z || this.A0N.getNextMaxId() != null) {
            W2j w2j = new W2j(this.A0O);
            C18502Vsx vsx = this.A0O.A02;
            W2j.A02(vsx, w2j, vsx.A06);
            Elq(new C18588Vuf(w2j));
            C17504VYi vYi = this.A0i;
            String str4 = this.A0W;
            String str5 = this.A0U;
            String str6 = this.A0M.A0M;
            String str7 = null;
            if (str6 != null) {
                1Xv r0 = 1Xj.A0h;
                str = 1Xv.A06(str6);
            } else {
                str = null;
            }
            ProductDetailsPageArguments productDetailsPageArguments = this.A0M;
            String str8 = null;
            if (!productDetailsPageArguments.A0a && !(((productTileMedia = productDetailsPageArguments.A03) == null || (str3 = productTileMedia.A02) == null) && (str3 = productDetailsPageArguments.A0K) == null)) {
                1Xv r02 = 1Xj.A0h;
                str8 = 1Xv.A06(str3);
            }
            1Xj r03 = this.A02;
            if (r03 == null || !r03.CcK()) {
                str2 = null;
            } else {
                str2 = C231122qu.A0F(this.A01, this.A02);
            }
            X9L x9l = this.A0N;
            if (x9l != null && !z) {
                str7 = x9l.getNextMaxId();
            }
            ProductDetailsPageArguments productDetailsPageArguments2 = this.A0M;
            C15040UKt uKt = new C15040UKt(str4, str5, str, str8, str2, str7, productDetailsPageArguments2.A0H, this.A0O.A03.A03, productDetailsPageArguments2.A0D, z2, productDetailsPageArguments2.A0b, AnonymousClass7TF.A1V(this.A0T), this.mParentFragment instanceof BottomSheetFragment);
            HashSet hashSet = vYi.A03;
            if (hashSet.contains(uKt)) {
                return;
            }
            if (uKt.A0A || uKt.A05 != null) {
                C19226WQh wQh = vYi.A01;
                HashMap hashMap = wQh.A03;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator A0s2 = AnonymousClass7TF.A0s(hashMap);
                while (A0s2.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s2);
                    if (AnonymousClass7TE.A0R(A1J.getValue()) < System.currentTimeMillis()) {
                        JTR.A1U(linkedHashMap, A1J);
                    }
                }
                Iterator A0u = Pxf.A0u(linkedHashMap);
                while (A0u.hasNext()) {
                    Object next = A0u.next();
                    wQh.A01.remove(next);
                    hashMap.remove(next);
                }
                CGR cgr = (CGR) wQh.A01.get(uKt);
                if (cgr != null) {
                    vYi.A00.A02(cgr, uKt);
                    return;
                }
                hashSet.add(uKt);
                C17539VZs vZs = vYi.A02;
                VPP vpp = new VPP(vYi);
                String A0g2 = 002.A0g("ads/app/products/", uKt.A07, "/details/");
                1NY A0b2 = AnonymousClass7TG.A0b(vZs.A01);
                A0b2.A0A(A0g2);
                A0b2.A9m("merchant_id", uKt.A04);
                A0b2.A9m("shopping_bag_enabled", "false");
                A0b2.A9m("device_capabilities", vZs.A04.toString());
                A0b2.A9m("device_width", String.valueOf(vZs.A00));
                A0b2.A0H("should_fetch_hero_carousel", uKt.A0B);
                A0b2.A0G("source_media_id", uKt.A08);
                A0b2.A0G("pinned_media_id", uKt.A06);
                A0b2.A0G("ads_tracking_token", uKt.A00);
                A0b2.A0G("max_id", uKt.A05);
                A0b2.A0G(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, uKt.A02);
                A0b2.A0E("should_show_all_catalogs_last", Boolean.valueOf(uKt.A0C));
                A0b2.A0G("featured_product_permission_id", uKt.A03);
                A0b2.A9m("ig_recyclerview_adapter_enabled", "true");
                A0b2.A0G("marketer_id", uKt.A01);
                A0b2.A0E("is_caller_bottom_sheet", Boolean.valueOf(uKt.A09));
                1OC A0S2 = DbU.A0S(A0b2, CGR.class, C45703D2c.class);
                C15625Ufr ufr = new C15625Ufr(20, vpp, uKt, vZs);
                AnonymousClass4D6 r04 = vZs.A03.A00;
                A0S2.A00 = ufr;
                r04.schedule(A0S2);
            }
        }
    }

    public final X9L BTa() {
        return this.A0N;
    }

    public final 1Xj Bxm() {
        return this.A02;
    }

    public final C18588Vuf Bz5() {
        return this.A0O;
    }

    public final void D1b(V4S v4s) {
        W2j w2j = new W2j(this.A0O);
        C17459VWm vWm = this.A0O.A06;
        0qQ.A0B(vWm, 1);
        w2j.A06 = new C17459VWm(v4s, vWm.A00, vWm.A01);
        Elq(new C18588Vuf(w2j));
    }

    public final 0jB E4k() {
        0jB r1 = new 0jB();
        r1.A06(this.A0r.A00);
        return r1;
    }

    public final void Eda(X9L x9l) {
        A00(x9l, this.A0O);
    }

    public final void Ele(1Xj r1) {
        this.A02 = r1;
    }

    public final void Elq(C18588Vuf vuf) {
        A00(this.A0N, vuf);
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final AnonymousClass0wW getSession() {
        return this.A01;
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

    public final boolean isScrolledToBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return !recyclerView.canScrollVertically(1);
        }
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (((LinearLayoutManager) recyclerView.A0D).A1a() == 1 && this.mRecyclerView.getChildAt(0).getTop() >= 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0105, code lost:
        if (r0.A04() == false) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r2 = r22
            r5 = r23
            r0 = r24
            super.onViewCreated(r5, r0)
            X.W03 r6 = r2.A06
            com.instagram.user.model.Product r1 = r2.A0T
            r18 = 0
            if (r1 == 0) goto L_0x0161
            com.instagram.common.session.UserSession r0 = r6.A03
            X.ULx r4 = X.C294165ly.A03(r0, r1)
        L_0x0017:
            X.0wc r1 = r6.A02
            java.lang.String r0 = "instagram_ads_app_surface_enter"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0045
            X.UKi r0 = r6.A01
            if (r0 == 0) goto L_0x015d
            java.lang.String r1 = r0.A05
        L_0x002b:
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0030
            r1 = r0
        L_0x0030:
            java.lang.String r0 = X.W03.A00(r3, r6, r1)
            X.C51965G9l.A1L(r3, r0)
            if (r4 == 0) goto L_0x0159
            X.4Ny r0 = r4.A01
        L_0x003b:
            java.lang.Long r0 = X.C13992Tns.A0E(r0, r3, r4)
            X.W03.A01(r3, r6, r0)
            r3.Cgf()
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView r0 = X.DbX.A0K(r5)
            r2.mRecyclerView = r0
            android.content.Context r0 = r2.getContext()
            r4 = 1
            r6 = 0
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r0, r4, r6)
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            X.2ku r0 = r2.A0s
            r1.A15(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            X.2nK r0 = r2.A0Z
            r1.A15(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            X.ViD r0 = r2.A05
            X.2t9 r0 = r0.A04
            r1.setAdapter(r0)
            X.3AQ r1 = new X.3AQ
            r1.<init>()
            r1.A00 = r6
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.setItemAnimator(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.setLayoutManager(r3)
            X.WTv r0 = new X.WTv
            r0.<init>(r2)
            X.2el r3 = r2.A0m
            X.3DZ r1 = X.AnonymousClass3DZ.A00(r2)
            X.2eo[] r0 = new X.AnonymousClass2eo[]{r0}
            r3.A08(r5, r1, r0)
            com.instagram.common.session.UserSession r0 = r2.A01
            X.3Dp r3 = X.C238833Dp.A00(r0)
            X.3Ds r0 = X.C238863Ds.ADS_PRODUCT_PAGE
            r3.A05(r5, r0)
            java.lang.String r14 = "instagram_ads_app"
            com.instagram.user.model.Product r0 = r2.A0T
            if (r0 == 0) goto L_0x0155
            java.lang.String r15 = r0.A0H
        L_0x00a3:
            if (r0 == 0) goto L_0x0151
            com.instagram.user.model.User r0 = r0.A0B
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
        L_0x00ab:
            com.instagram.user.model.Product r0 = r2.A0T
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = r0.A0F
        L_0x00b1:
            X.1Xj r13 = r2.A02
            X.IL9 r12 = new X.IL9
            r17 = r0
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r3.A0A(r5, r12)
            X.Vgu r0 = r2.A0L
            r0.A00()
            X.2qi r3 = r2.A03
            java.lang.String r1 = r2.A0W
            java.lang.String r0 = "product_id"
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r0, r1)
            r3.Dh4(r0)
            X.07Z r6 = r2.getViewLifecycleOwner()
            com.instagram.common.session.UserSession r5 = r2.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36313248408012628(0x8102b500000754, double:3.027982742717398E-306)
            boolean r0 = X.DbY.A1Y(r3, r5, r0)
            if (r0 == 0) goto L_0x014d
            com.instagram.common.session.UserSession r5 = r2.A01
            r0 = 36313248408078165(0x8102b500010755, double:3.027982742758844E-306)
            boolean r0 = X.DbY.A1Y(r3, r5, r0)
            if (r0 == 0) goto L_0x014d
            X.W1i r8 = r2.A09
            java.lang.String r9 = r2.A0V
            java.lang.String r10 = r2.A0W
            java.lang.String r11 = r2.A0X
            java.lang.String r12 = r2.A0n
            com.instagram.user.model.Product r0 = r2.A0T
            if (r0 == 0) goto L_0x0107
            boolean r0 = r0.A04()
            r16 = 1
            if (r0 != 0) goto L_0x0109
        L_0x0107:
            r16 = 0
        L_0x0109:
            com.instagram.common.session.UserSession r2 = r2.A01
            r0 = 36876198361694299(0x8302b50004005b, double:3.3839945602432024E-306)
            java.lang.String r13 = X.182.A04(r3, r2, r0)
            java.lang.String r15 = "hero_carousel"
            X.0qQ.A0B(r9, r4)
            X.C51974G9v.A1M(r10, r11, r12)
            X.VZr r0 = r8.A02
            if (r0 != 0) goto L_0x0123
            X.C18782W1i.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0123:
            X.VZr r7 = r8.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r8.A00
            if (r7 == 0) goto L_0x014d
            if (r0 == 0) goto L_0x014d
            long r1 = r8.A04
            X.8dD r16 = r0.A05()
            X.0xx r6 = X.AnonymousClass07a.A00(r6)
            X.12V r5 = r7.A01
            r3 = 1377103879(0x5214f007, float:1.59920538E11)
            r0 = 3
            X.0nV r0 = r5.CO6(r3, r0)
            X.WvI r15 = new X.WvI
            r19 = r4
            r20 = r1
            r17 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            X.1Eo.A05(r0, r15, r6)
        L_0x014d:
            return
        L_0x014e:
            r0 = 0
            goto L_0x00b1
        L_0x0151:
            java.lang.String r1 = r2.A0U
            goto L_0x00ab
        L_0x0155:
            java.lang.String r15 = r2.A0W
            goto L_0x00a3
        L_0x0159:
            r0 = r18
            goto L_0x003b
        L_0x015d:
            r1 = r18
            goto L_0x002b
        L_0x0161:
            r4 = r18
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.pdp.AdsProductPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
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

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 15) {
            UserSession userSession = this.A01;
            long j = C19226WQh.A04;
            C17088VHk.A00(userSession).A00();
            A03(true);
        } else if (i2 == -1 && i == 7) {
            intent.getClass();
            String stringExtra = intent.getStringExtra("item_id");
            String stringExtra2 = intent.getStringExtra("source_id");
            if (stringExtra != null && stringExtra2 != null) {
                Product product = this.A0O.A09;
                product.getClass();
                List A012 = this.A0O.A04.A01(this.A01, product);
                for (int i3 = 0; i3 < A012.size(); i3++) {
                    if (((C18001Vjd) A012.get(i3)).A01().equals(stringExtra)) {
                        W2j w2j = new W2j(this.A0O);
                        C18570VuM vuM = new C18570VuM(this.A0O.A04);
                        vuM.A03 = Integer.valueOf(i3);
                        w2j.A04 = new W1L(vuM);
                        Elq(new C18588Vuf(w2j));
                        C17922ViD viD = this.A05;
                        viD.A00(viD.A00, viD.A01);
                        viD.A04.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: X.X55} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: com.instagram.shopping.fragment.pdp.AdsProductPageFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: com.instagram.shopping.fragment.pdp.AdsProductPageFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.X9C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: com.instagram.shopping.fragment.pdp.AdsProductPageFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: X.0iw} */
    /* JADX WARNING: type inference failed for: r4v43, types: [X.VP2, X.Uqu] */
    /* JADX WARNING: type inference failed for: r3v47, types: [X.1pi, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x054e, code lost:
        if (r4.A01.A0F != null) goto L_0x0550;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x06a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r44) {
        /*
            r43 = this;
            r0 = -1976644738(0xffffffff8a2ecb7e, float:-8.416068E-33)
            int r16 = X.AnonymousClass0fD.A02(r0)
            r0 = r43
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "pdp_arguments"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            r1.getClass()
            com.instagram.shopping.intf.ProductDetailsPageArguments r1 = (com.instagram.shopping.intf.ProductDetailsPageArguments) r1
            r0.A0M = r1
            com.instagram.common.session.UserSession r1 = X.DbX.A0U(r0)
            r0.A01 = r1
            r1 = r44
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment.super.onCreate(r1)
            java.lang.String r1 = X.C228022kf.A00(r2)
            r0.A0X = r1
            com.instagram.common.session.UserSession r1 = r0.A01
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.36g> r2 = X.C2370836g.class
            X.1wn r1 = r0.A0q
            r3.A01(r1, r2)
            java.lang.Class<X.WQ7> r2 = X.WQ7.class
            X.1wn r1 = r0.A0p
            r3.A01(r1, r2)
            java.lang.Class<X.WQ6> r2 = X.WQ6.class
            X.1wn r1 = r0.A0o
            r3.A01(r1, r2)
            com.instagram.common.session.UserSession r2 = r0.A01
            X.2el r1 = r0.A0m
            r42 = r1
            X.2nI r1 = X.C229382nI.A02(r0, r0, r2, r1)
            r0.A00 = r1
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = r0.A01
            r2 = 23603490(0x1682922, float:4.2641182E-38)
            X.2nK r1 = new X.2nK
            r1.<init>(r4, r0, r3, r2)
            r0.A0Z = r1
            r0.registerLifecycleListener(r1)
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = r0.A01
            X.0gy r2 = X.AnonymousClass07i.A00(r0)
            X.VYi r1 = new X.VYi
            r1.<init>(r4, r2, r3, r0)
            r0.A0i = r1
            com.instagram.shopping.intf.ProductDetailsPageArguments r1 = r0.A0M
            java.lang.String r1 = r1.A0M
            if (r1 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r1 = r0.A01
            X.1E8 r2 = X.1E7.A00(r1)
            com.instagram.shopping.intf.ProductDetailsPageArguments r1 = r0.A0M
            java.lang.String r1 = r1.A0M
            X.1Xj r1 = r2.A02(r1)
            r0.A02 = r1
        L_0x008e:
            com.instagram.shopping.intf.ProductDetailsPageArguments r2 = r0.A0M
            com.instagram.user.model.Product r1 = r2.A06
            r0.A0T = r1
            if (r1 == 0) goto L_0x0688
            java.lang.String r1 = r1.A0H
            r1.getClass()
            r0.A0W = r1
            com.instagram.user.model.Product r1 = r0.A0T
            com.instagram.user.model.User r1 = r1.A0B
            java.lang.String r1 = X.C13988Tno.A0b(r1)
            r0.A0V = r1
            com.instagram.user.model.Product r1 = r0.A0T
            com.instagram.user.model.User r1 = r1.A0B
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r1)
            r0.A0U = r1
            com.instagram.common.session.UserSession r2 = r0.A01
            com.instagram.user.model.Product r3 = r0.A0T
            r1 = 0
            X.AnonymousClass7TF.A1H(r2, r3)
            X.Lix r2 = X.C63446KxB.A00(r2, r1)
            r1 = 2
            X.0qQ.A0B(r2, r1)
            X.UzF r1 = X.C16679UzF.RECENTLY_VIEWED
            r2.A0H(r1, r3)
        L_0x00c6:
            X.Vuf r1 = r0.A0O
            X.W2j r6 = new X.W2j
            r6.<init>(r1)
            r3 = 0
            X.Uxz r5 = X.C16605Uxz.UNINITIALIZED
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r2 = r4.A0I
            X.VYe r1 = new X.VYe
            r1.<init>(r3, r3, r5, r2)
            r6.A03 = r1
            X.Vuf r1 = new X.Vuf
            r1.<init>(r6)
            r0.A0O = r1
            android.os.Bundle r2 = r4.A01
            if (r2 == 0) goto L_0x00eb
            X.To7 r1 = r0.A0r
            r1.A00(r2)
        L_0x00eb:
            X.VP6 r1 = new X.VP6
            r1.<init>(r0)
            r0.A0h = r1
            com.instagram.shopping.intf.ProductDetailsPageArguments r2 = r0.A0M
            java.lang.String r8 = r2.A0R
            if (r8 != 0) goto L_0x00fa
            java.lang.String r8 = r2.A0H
        L_0x00fa:
            java.lang.String r11 = r0.A0W
            java.lang.String r10 = r2.A0Q
            com.instagram.common.session.UserSession r9 = r0.A01
            java.lang.String r1 = r0.A0n
            r41 = r1
            java.lang.String r7 = r0.A0X
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r6 = r2.A05
            com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo r5 = r2.A04
            com.instagram.api.schemas.RankingInfo r4 = r2.A02
            java.lang.String r2 = r2.A0G
            X.W1W r1 = new X.W1W
            r19 = r9
            r20 = r0
            r21 = r5
            r22 = r6
            r23 = r0
            r24 = r11
            r25 = r10
            r26 = r8
            r27 = r41
            r28 = r7
            r29 = r3
            r30 = r2
            r17 = r1
            r18 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0.A07 = r1
            java.lang.String r5 = r0.A0W
            com.instagram.shopping.intf.ProductDetailsPageArguments r1 = r0.A0M
            java.lang.String r4 = r1.A0Q
            com.instagram.common.session.UserSession r2 = r0.A01
            X.W03 r1 = new X.W03
            r9 = r1
            r10 = r2
            r11 = r0
            r12 = r0
            r13 = r5
            r14 = r4
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.A06 = r1
            com.instagram.common.session.UserSession r5 = r0.A01
            com.instagram.shopping.intf.ProductDetailsPageArguments r1 = r0.A0M
            java.lang.String r4 = r1.A0H
            X.W1W r2 = r0.A07
            X.VYm r1 = new X.VYm
            r6 = r1
            r7 = r5
            r8 = r42
            r9 = r2
            r10 = r41
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A0Q = r1
            com.instagram.common.session.UserSession r4 = r0.A01
            java.lang.String r2 = r0.A0X
            X.VZq r1 = new X.VZq
            r1.<init>(r0, r4, r0, r2)
            r0.A0a = r1
            com.instagram.common.session.UserSession r13 = r0.A01
            X.VP6 r12 = r0.A0h
            java.lang.String r11 = r0.A0X
            com.instagram.shopping.intf.ProductDetailsPageArguments r2 = r0.A0M
            java.lang.String r10 = r2.A0H
            java.lang.String r9 = r2.A0Q
            com.instagram.api.schemas.RankingInfo r8 = r2.A02
            java.lang.String r7 = r0.A0W
            java.lang.String r6 = r2.A0G
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r1 = r2.A05
            if (r1 == 0) goto L_0x0685
            java.lang.String r5 = r1.A01
        L_0x0181:
            java.lang.String r4 = r2.A0J
            r2 = 1
            X.W1i r1 = new X.W1i
            r19 = r0
            r20 = r13
            r21 = r0
            r22 = r12
            r24 = r11
            r25 = r41
            r26 = r10
            r27 = r9
            r28 = r7
            r29 = r6
            r30 = r5
            r31 = r4
            r17 = r1
            r18 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.A09 = r1
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r5 = r0.A01
            X.1wY r4 = X.1wY.A00(r5)
            X.C51972G9s.A1C(r5, r4)
            X.VYb r1 = new X.VYb
            r6 = r1
            r8 = r5
            r9 = r0
            r10 = r4
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A0K = r1
            com.instagram.common.session.UserSession r14 = r0.A01
            X.W1W r13 = r0.A07
            X.W03 r12 = r0.A06
            X.W1i r11 = r0.A09
            java.lang.String r10 = r0.A0X
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r9 = r4.A0H
            java.lang.String r8 = r4.A0Q
            r1 = 0
            com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo r7 = r4.A04
            java.lang.String r6 = r4.A0G
            java.lang.String r5 = r4.A0D
            X.Vjx r4 = new X.Vjx
            r17 = r4
            r18 = r0
            r19 = r14
            r20 = r0
            r21 = r12
            r22 = r13
            r23 = r11
            r24 = r7
            r25 = r0
            r26 = r41
            r27 = r10
            r28 = r9
            r29 = r8
            r30 = r6
            r31 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.A0b = r4
            com.instagram.common.session.UserSession r6 = r0.A01
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r5 = r4.A0H
            X.VgH r4 = new X.VgH
            r4.<init>(r6, r5)
            r0.A0P = r4
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            com.instagram.common.session.UserSession r7 = r0.A01
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r6 = r4.A0Q
            java.lang.String r5 = r4.A0H
            X.VzJ r4 = new X.VzJ
            r8 = r4
            r10 = r7
            r11 = r0
            r12 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A0d = r4
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r6 = r0.A01
            X.Wce r5 = new X.Wce
            r5.<init>(r0)
            X.Vkr r4 = new X.Vkr
            r4.<init>(r7, r6, r0, r5)
            r0.A08 = r4
            X.0eM r4 = X.SFL.A04
            java.lang.Object r6 = r4.getValue()
            X.SFL r6 = (X.SFL) r6
            com.instagram.common.session.UserSession r4 = r0.A01
            r6.A00 = r4
            com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule r5 = r6.A01
            if (r5 == 0) goto L_0x0245
            r5.mUserSession = r4
        L_0x0245:
            X.VzJ r4 = r0.A0d
            r6.A02 = r4
            if (r5 == 0) goto L_0x024d
            r5.mSurveyController = r4
        L_0x024d:
            androidx.fragment.app.FragmentActivity r18 = r0.requireActivity()
            android.content.Context r17 = r0.requireContext()
            com.instagram.common.session.UserSession r13 = r0.A01
            java.lang.String r12 = r0.A0X
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r11 = r4.A0Q
            java.lang.String r10 = r4.A0H
            java.lang.String r9 = r0.A0W
            java.lang.String r8 = r0.A0U
            com.instagram.api.schemas.RankingInfo r7 = r4.A02
            java.lang.String r6 = r4.A0G
            java.lang.String r5 = r4.A0D
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r4 = r4.A05
            if (r4 == 0) goto L_0x0682
            java.lang.String r4 = r4.A01
        L_0x026f:
            r21 = r0
            r22 = r3
            r23 = r6
            r24 = r9
            r25 = r5
            r26 = r8
            r27 = r9
            r28 = r11
            r29 = r10
            r30 = r4
            r31 = r12
            r32 = r1
            r33 = r1
            r19 = r7
            r20 = r13
            X.2qw r36 = X.C231132qv.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            com.instagram.common.session.UserSession r6 = r0.A01
            java.lang.String r11 = "instagram_ads_app"
            java.lang.String r5 = r0.A0U
            X.Vgu r4 = new X.Vgu
            r7 = r4
            r8 = r0
            r9 = r6
            r10 = r0
            r12 = r5
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.A0L = r4
            com.instagram.common.session.UserSession r7 = r0.A01
            java.lang.String r6 = r0.A0X
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r5 = r4.A0Q
            java.lang.String r4 = r4.A0H
            X.326 r28 = new X.326
            r29 = r0
            r30 = r7
            r31 = r6
            r32 = r5
            r33 = r4
            r28.<init>(r29, r30, r31, r32, r33)
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r6 = r0.A01
            com.instagram.user.model.Product r5 = r0.A0T
            X.Wde r4 = new X.Wde
            r4.<init>(r7, r0, r6, r5)
            r0.A0g = r4
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r10 = r4.A0H
            androidx.fragment.app.FragmentActivity r18 = r0.requireActivity()
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r9 = r4.A0Q
            java.lang.String r8 = r0.A0X
            com.instagram.common.session.UserSession r7 = r0.A01
            X.1Xj r6 = r0.A02
            java.lang.String r5 = r4.A0J
            X.VuZ r4 = new X.VuZ
            r22 = r0
            r23 = r41
            r24 = r10
            r25 = r9
            r26 = r8
            r27 = r5
            r17 = r4
            r19 = r7
            r20 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.A0C = r4
            com.instagram.common.session.UserSession r9 = r0.A01
            android.content.Context r30 = r0.requireContext()
            X.W1W r8 = r0.A07
            X.Vjx r7 = r0.A0b
            X.Wde r6 = r0.A0g
            X.VuZ r5 = r0.A0C
            X.Vv9 r4 = new X.Vv9
            r33 = r7
            r34 = r5
            r35 = r6
            r37 = r0
            r29 = r4
            r31 = r9
            r32 = r8
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            r0.A0f = r4
            com.instagram.common.session.UserSession r5 = r0.A01
            X.Ugj r4 = new X.Ugj
            r4.<init>(r5)
            r0.A0c = r4
            com.instagram.common.session.UserSession r7 = r0.A01
            X.W1W r6 = r0.A07
            X.W03 r5 = r0.A06
            java.util.List r25 = java.util.Collections.singletonList(r4)
            X.Vjw r4 = new X.Vjw
            r17 = r4
            r18 = r7
            r19 = r42
            r20 = r5
            r21 = r6
            r23 = r0
            r24 = r41
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A0R = r4
            X.2oe r7 = new X.2oe
            r7.<init>()
            com.instagram.common.session.UserSession r5 = r0.A01
            X.W1W r4 = r0.A07
            X.UkC r6 = new X.UkC
            r6.<init>(r5, r4)
            X.VWw r5 = new X.VWw
            r4 = r42
            r5.<init>(r4, r7, r6)
            r0.A0j = r5
            X.W1i r7 = r0.A09
            X.Vjw r6 = r0.A0R
            X.W1W r5 = r0.A07
            X.Uqy r4 = new X.Uqy
            r33 = r4
            r34 = r5
            r35 = r7
            r38 = r6
            r33.<init>(r34, r35, r36, r37, r38)
            r0.A0B = r4
            com.instagram.common.session.UserSession r14 = r0.A01
            X.W1W r13 = r0.A07
            X.W03 r12 = r0.A06
            X.W1i r11 = r0.A09
            X.Vjx r10 = r0.A0b
            X.VzJ r9 = r0.A0d
            X.Vjw r8 = r0.A0R
            X.Vv9 r7 = r0.A0f
            X.VuZ r5 = r0.A0C
            X.Ugj r4 = r0.A0c
            X.Ur1 r6 = new X.Ur1
            r29 = r6
            r30 = r14
            r31 = r12
            r32 = r13
            r33 = r11
            r34 = r10
            r35 = r5
            r36 = r4
            r37 = r9
            r38 = r7
            r39 = r0
            r40 = r8
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0.A0D = r6
            X.Vjw r5 = r0.A0R
            X.Ur0 r4 = new X.Ur0
            r4.<init>(r6, r5)
            r0.A0E = r4
            android.content.Context r19 = r0.requireContext()
            com.instagram.common.session.UserSession r15 = r0.A01
            androidx.fragment.app.FragmentActivity r18 = r0.requireActivity()
            X.W1W r14 = r0.A07
            X.W03 r13 = r0.A06
            X.Vjx r12 = r0.A0b
            X.W1i r11 = r0.A09
            X.Vjw r10 = r0.A0R
            X.Vkr r9 = r0.A08
            X.VzJ r8 = r0.A0d
            X.VWw r7 = r0.A0j
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            java.lang.String r6 = r4.A0H
            com.instagram.api.schemas.RankingInfo r5 = r4.A02
            X.Ur2 r4 = new X.Ur2
            r21 = r15
            r22 = r13
            r23 = r14
            r24 = r9
            r25 = r11
            r26 = r12
            r27 = r8
            r29 = r0
            r30 = r7
            r31 = r10
            r32 = r6
            r17 = r4
            r20 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.A0G = r4
            com.instagram.common.session.UserSession r7 = r0.A01
            X.W1W r6 = r0.A07
            X.W03 r5 = r0.A06
            X.VkS r8 = new X.VkS
            r9 = r7
            r10 = r42
            r11 = r5
            r12 = r6
            r13 = r4
            r14 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.A0S = r8
            com.instagram.common.session.UserSession r9 = r0.A01
            androidx.fragment.app.FragmentActivity r18 = r0.requireActivity()
            X.W1W r8 = r0.A07
            X.W03 r7 = r0.A06
            X.W1i r6 = r0.A09
            X.Vjw r5 = r0.A0R
            X.Uqx r4 = new X.Uqx
            r19 = r0
            r20 = r9
            r21 = r7
            r22 = r8
            r23 = r6
            r24 = r0
            r25 = r5
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A0H = r4
            X.Vjw r5 = r0.A0R
            X.Uqv r4 = new X.Uqv
            r4.<init>(r0, r0, r5)
            r0.A0I = r4
            X.W1i r6 = r0.A09
            X.Vjw r5 = r0.A0R
            X.Uqw r4 = new X.Uqw
            r4.<init>(r6, r0, r5)
            r0.A0J = r4
            X.Vjw r5 = r0.A0R
            X.0qQ.A0B(r5, r2)
            X.Uqu r4 = new X.Uqu
            r4.<init>(r5)
            r0.A0e = r4
            android.content.Context r9 = r0.requireContext()
            com.instagram.common.session.UserSession r8 = r0.A01
            X.Vjw r7 = r0.A0R
            X.Vjx r6 = r0.A0b
            X.W1i r5 = r0.A09
            X.Uqz r4 = new X.Uqz
            r10 = r8
            r11 = r5
            r12 = r6
            r13 = r28
            r14 = r0
            r15 = r7
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.A0F = r4
            com.instagram.common.session.UserSession r6 = r0.A01
            X.W1i r5 = r0.A09
            X.Ugt r4 = new X.Ugt
            r4.<init>(r0, r6, r5)
            r0.A0A = r4
            r0.registerLifecycleListener(r4)
            X.1YN r6 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r5 = r0.A01
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            X.2qT r9 = r6.A04(r5, r4)
            r0.A04 = r9
            X.1YN r10 = X.AnonymousClass2bO.A00()
            com.instagram.common.session.UserSession r8 = r0.A01
            com.instagram.quickpromotion.intf.QuickPromotionSlot r15 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A11
            X.AnonymousClass2bO.A00()
            r5 = 2
            X.WZX r7 = new X.WZX
            r7.<init>(r0, r5)
            r6 = 4
            X.WZY r4 = new X.WZY
            r4.<init>(r0, r6)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r1)
            r17 = r3
            r18 = r3
            r19 = r7
            r20 = r4
            r21 = r3
            r22 = r9
            X.2bW r14 = X.2bV.A01(r17, r18, r19, r20, r21, r22, r23)
            r11 = r0
            r12 = r0
            r13 = r8
            X.2qi r3 = r10.A01(r11, r12, r13, r14, r15)
            r0.A03 = r3
            X.2qT r3 = r0.A04
            r0.registerLifecycleListener(r3)
            android.content.Context r18 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = r0.A01
            r22 = r3
            X.W03 r3 = r0.A06
            r25 = r3
            X.W1W r15 = r0.A07
            X.Vjw r14 = r0.A0R
            X.VkS r13 = r0.A0S
            X.VYb r12 = r0.A0K
            X.UAy r11 = r0.A0l
            X.Vkr r10 = r0.A08
            X.Vgu r9 = r0.A0L
            com.instagram.shopping.intf.ProductDetailsPageArguments r3 = r0.A0M
            X.2nI r8 = r0.A00
            X.VYm r7 = r0.A0Q
            java.lang.String r6 = r3.A0V
            X.2qi r4 = r0.A03
            X.ViD r3 = new X.ViD
            r28 = r12
            r29 = r9
            r30 = r0
            r31 = r7
            r32 = r14
            r33 = r13
            r34 = r41
            r35 = r6
            r17 = r3
            r19 = r8
            r20 = r0
            r21 = r11
            r23 = r42
            r24 = r4
            r26 = r15
            r27 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0.A05 = r3
            X.1Xj r7 = r0.A02
            if (r7 == 0) goto L_0x0668
            X.W1W r6 = r0.A07
            com.instagram.shopping.intf.ProductDetailsPageArguments r3 = r0.A0M
            java.lang.Integer r4 = r3.A09
            r6.A00 = r7
            java.lang.String r3 = r6.A0G
            X.UKi r3 = X.C294165ly.A07(r7, r4, r3)
            r6.A01 = r3
            X.W03 r7 = r0.A06
            X.1Xj r6 = r0.A02
            com.instagram.shopping.intf.ProductDetailsPageArguments r3 = r0.A0M
            java.lang.Integer r4 = r3.A09
            X.0qQ.A0B(r6, r1)
            r7.A00 = r6
            java.lang.String r3 = r7.A07
            X.UKi r3 = X.C294165ly.A07(r6, r4, r3)
            r7.A01 = r3
            X.W1i r4 = r0.A09
            X.1Xj r3 = r0.A02
            X.0qQ.A0B(r3, r1)
            r4.A01 = r3
        L_0x0536:
            com.instagram.user.model.Product r3 = r0.A0T
            if (r3 == 0) goto L_0x0601
            r0.A01(r3)
            com.instagram.user.model.Product r4 = r0.A0T
            r4.getClass()
            boolean r3 = r4.A04()
            if (r3 == 0) goto L_0x0550
            com.instagram.user.model.ProductDetailsProductItemDict r3 = r4.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r3 = r3.A0F
            r25 = 1
            if (r3 == 0) goto L_0x0552
        L_0x0550:
            r25 = 0
        L_0x0552:
            com.instagram.user.model.Product r3 = r0.A0T
            r3.getClass()
            com.instagram.user.model.ProductDetailsProductItemDict r3 = r3.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r3 = r3.A0F
            boolean r26 = X.DbW.A1a(r3)
            android.content.Context r18 = r0.requireContext()
            com.instagram.common.session.UserSession r9 = r0.A01
            android.os.Parcelable$Creator r3 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.Product r3 = r0.A0T
            com.instagram.user.model.User r3 = r3.A0B
            java.lang.String r4 = X.AnonymousClass3ZA.A00(r3)
            com.instagram.user.model.Product r3 = r0.A0T
            com.instagram.user.model.User r3 = r3.A0B
            java.lang.String r3 = X.C13988Tno.A0b(r3)
            com.instagram.user.model.User r8 = new com.instagram.user.model.User
            r8.<init>(r4, r3)
            com.instagram.user.model.Product r6 = r0.A0T
            com.instagram.shopping.intf.ProductDetailsPageArguments r4 = r0.A0M
            boolean r3 = r4.A0a
            if (r3 == 0) goto L_0x0656
            r4 = 0
        L_0x0585:
            r27 = 1
        L_0x0587:
            java.lang.String r3 = r0.A0U
            X.WdB r7 = new X.WdB
            r24 = r1
            r19 = r9
            r20 = r4
            r21 = r6
            r22 = r8
            r23 = r3
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.VgH r4 = r0.A0P
            X.Vuf r3 = r0.A0O
            X.Vuf r3 = r4.A00(r7, r3)
            X.W2j r6 = new X.W2j
            r6.<init>(r3)
            X.Vuf r3 = r0.A0O
            X.Vsx r4 = r3.A02
            boolean r3 = r4.A06
            X.W2j.A02(r4, r6, r3)
            X.Vuf r3 = new X.Vuf
            r3.<init>(r6)
            r0.A00(r7, r3)
            X.Vjx r9 = r0.A0b
            com.instagram.user.model.Product r3 = r0.A0T
            X.0qQ.A0B(r3, r1)
            java.lang.String r8 = X.C13989Tnp.A0q(r3)
            com.instagram.common.session.UserSession r7 = r9.A01
            com.instagram.user.model.User r3 = X.DbV.A0j(r7, r8)
            if (r3 == 0) goto L_0x05db
            X.4Cl r3 = r3.A03
            java.lang.Boolean r3 = r3.CRw()
            if (r3 == 0) goto L_0x0601
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0601
        L_0x05db:
            X.0Tu r6 = X.0Tu.A06
            r3 = 36312702947165401(0x810236000004d9, double:3.027637791081217E-306)
            boolean r3 = X.182.A06(r6, r7, r3)
            if (r3 == 0) goto L_0x0601
            X.1pi r3 = X.C66631pj.A00
            if (r3 != 0) goto L_0x05f3
            X.1ph r3 = new X.1ph
            r3.<init>()
            X.C66631pj.A00 = r3
        L_0x05f3:
            X.1pi r4 = X.C66631pj.A00()
            if (r8 == 0) goto L_0x06a3
            X.WgP r3 = new X.WgP
            r3.<init>(r9)
            r4.AyO(r7, r3, r8)
        L_0x0601:
            r0.A03(r2)
            com.instagram.user.model.Product r3 = r0.A0T
            if (r3 == 0) goto L_0x0622
            X.Vjx r8 = r0.A0b
            com.instagram.shopping.intf.ProductDetailsPageArguments r7 = r0.A0M
            boolean r3 = r7.A0a
            r6 = 0
            if (r3 != 0) goto L_0x061f
            com.instagram.model.shopping.productfeed.ProductTileMedia r3 = r7.A03
            if (r3 == 0) goto L_0x0651
            java.lang.String r4 = r3.A02
            if (r4 == 0) goto L_0x0651
        L_0x0619:
            X.1Xv r3 = X.1Xj.A0h
            java.lang.String r6 = X.1Xv.A06(r4)
        L_0x061f:
            r8.A01(r6)
        L_0x0622:
            com.instagram.common.session.UserSession r3 = r0.A01
            X.VPQ r3 = X.C17091VHn.A00(r3)
            com.instagram.common.session.UserSession r3 = r3.A00
            X.ERE r6 = new X.ERE
            r6.<init>(r3)
            java.lang.String r4 = r0.A0U
            java.lang.String r3 = r0.A0V
            java.lang.String r0 = r0.A0W
            X.0qQ.A0B(r4, r1)
            X.0qQ.A0B(r3, r2)
            X.0qQ.A0B(r0, r5)
            X.EyN r1 = new X.EyN
            r1.<init>(r4, r3, r0)
            java.lang.String r0 = "recent"
            X.ERE.A01(r1, r6, r0)
            r1 = -343425103(0xffffffffeb87bfb1, float:-3.2822045E26)
            r0 = r16
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x0651:
            java.lang.String r4 = r7.A0K
            if (r4 == 0) goto L_0x061f
            goto L_0x0619
        L_0x0656:
            com.instagram.model.shopping.productfeed.ProductTileMedia r4 = r4.A03
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x0664
            boolean r3 = r3.A63()
            if (r3 == 0) goto L_0x0664
            goto L_0x0585
        L_0x0664:
            r27 = 0
            goto L_0x0587
        L_0x0668:
            com.instagram.shopping.intf.ProductDetailsPageArguments r3 = r0.A0M
            java.lang.String r4 = r3.A0M
            if (r4 == 0) goto L_0x0536
            X.Vjx r7 = r0.A0b
            X.4DH r6 = r7.A00
            com.instagram.common.session.UserSession r3 = r7.A01
            X.1OC r4 = X.C3724090s.A04(r3, r4)
            r3 = 11
            X.C15622Ufo.A00(r4, r7, r3)
            r6.schedule(r4)
            goto L_0x0536
        L_0x0682:
            r4 = 0
            goto L_0x026f
        L_0x0685:
            r5 = 0
            goto L_0x0181
        L_0x0688:
            java.lang.String r1 = r2.A0U
            r1.getClass()
            r0.A0W = r1
            com.instagram.shopping.intf.ProductDetailsPageArguments r1 = r0.A0M
            java.lang.String r1 = r1.A0O
            r1.getClass()
            r0.A0V = r1
            com.instagram.shopping.intf.ProductDetailsPageArguments r1 = r0.A0M
            java.lang.String r1 = r1.A0N
            r1.getClass()
            r0.A0U = r1
            goto L_0x00c6
        L_0x06a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.pdp.AdsProductPageFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1044524053);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.product_details_page_layout, viewGroup, false);
        this.mBaseFrameLayout = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = this.mBaseFrameLayout;
        AnonymousClass0fD.A09(-1418270454, A022);
        return frameLayout2;
    }

    public final void onDestroy() {
        C15054ULx uLx;
        String str;
        C15054ULx A032;
        String str2;
        String str3;
        C263944Ny r0;
        int A022 = AnonymousClass0fD.A02(2010863285);
        super.onDestroy();
        W03 w03 = this.A06;
        Product product = this.A0T;
        if (product != null) {
            uLx = C294165ly.A03(w03.A03, product);
        } else {
            uLx = null;
        }
        0Aj A0e2 = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_surface_end");
        if (A0e2.isSampled()) {
            C15029UKi uKi = w03.A01;
            if (uKi != null) {
                str3 = uKi.A05;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            C51965G9l.A1L(A0e2, W03.A00(A0e2, w03, str3));
            if (uLx != null) {
                r0 = uLx.A01;
            } else {
                r0 = null;
            }
            W03.A01(A0e2, w03, C13992Tns.A0E(r0, A0e2, uLx));
            A0e2.Cgf();
        }
        if (!this.A0k) {
            Product product2 = this.A0T;
            W03 w032 = this.A06;
            if (product2 == null) {
                String str4 = this.A0W;
                String str5 = this.A0U;
                AnonymousClass7TG.A1N(str4, str5);
                A032 = new C15054ULx(C263944Ny.A00(str5), (Boolean) null, (Boolean) null, (Boolean) null, (Double) null, (Long) null, (Long) null, DbZ.A07(str4));
            } else {
                A032 = C294165ly.A03(w032.A03, product2);
            }
            0Aj A0e3 = AnonymousClass7TE.A0e(w032.A02, "instagram_ads_app_abandon");
            if (A0e3.isSampled()) {
                C15029UKi uKi2 = w032.A01;
                if (uKi2 == null || (str2 = uKi2.A05) == null) {
                    str2 = "";
                }
                C51965G9l.A1L(A0e3, W03.A00(A0e3, w032, str2));
                W03.A01(A0e3, w032, C15054ULx.A00(A0e3, A032));
                A0e3.Cgf();
            }
        }
        C16238Ur1 ur1 = this.A0D;
        AnonymousClass1Nd.A00(ur1.A01).A02(ur1.A00, WQO.class);
        C17498VYb vYb = this.A0K;
        vYb.A03.A08(vYb.A02.getModuleName());
        unregisterLifecycleListener(this.A0Z);
        unregisterLifecycleListener(this.A0A);
        unregisterLifecycleListener(this.A04);
        1Ng A002 = AnonymousClass1Nd.A00(this.A01);
        A002.A02(this.A0q, C2370836g.class);
        A002.A02(this.A0p, WQ7.class);
        A002.A02(this.A0o, WQ6.class);
        C18738VzJ vzJ = this.A0d;
        X9C x9c = vzJ.A04;
        Product product3 = x9c.Bz5().A08;
        if (product3 == null || !x9c.BTa().CKq() || vzJ.A02 || C18738VzJ.A09.contains(vzJ.A05)) {
            String str6 = vzJ.A06;
            if (!str6.startsWith("tags_list_") && !"instagram_shopping_pdp".equals(str6) && product3 != null && product3.A04() && product3.A0P) {
                str = "2463936483829671";
            }
            AnonymousClass0fD.A09(1252303073, A022);
        }
        str = "785516298687912";
        C18738VzJ.A00(vzJ, str);
        AnonymousClass0fD.A09(1252303073, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1150024813);
        super.onDestroyView();
        AdsProductPageFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(1156095657, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(928976259);
        AdsProductPageFragment.super.onPause();
        C14819UAy uAy = this.A0l;
        Map map = uAy.A00;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            ((RecyclerView) A16.next()).A16(uAy);
        }
        map.clear();
        this.A08.A02("fragment_paused");
        AnonymousClass0fD.A09(-574478748, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1531202901);
        super.onResume();
        C18738VzJ vzJ = this.A0d;
        Product product = vzJ.A04.Bz5().A08;
        if (product != null && product.A04() && vzJ.A01) {
            C18738VzJ.A00(vzJ, "2479230905637782");
        }
        if (this.A0Y && isAdded()) {
            this.A0Y = false;
            DbT.A1I(this);
        }
        AnonymousClass0fD.A09(-1988561707, A022);
    }
}
