package com.instagram.shopping.fragment.cart;

import X.0qQ;
import X.1Ng;
import X.1wn;
import X.2Yu;
import X.2da;
import X.2el;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass2tB;
import X.AnonymousClass3AQ;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass4Ed;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13680Tep;
import X.C13988Tno;
import X.C13990Tnq;
import X.C14819UAy;
import X.C15047ULa;
import X.C16508Uw5;
import X.C16675UzB;
import X.C17380VTh;
import X.C17456VWj;
import X.C17468VWv;
import X.C17871VhO;
import X.C18617VvA;
import X.C18622VvF;
import X.C18748Vzj;
import X.C18785W1l;
import X.C19221WQb;
import X.C19560Wbk;
import X.C19561Wbl;
import X.C19605WcU;
import X.C19606WcV;
import X.C19875Wh3;
import X.C20072WkW;
import X.C20999X8w;
import X.C228022kf;
import X.C231112qt;
import X.C231132qv;
import X.C231142qw;
import X.C2362432z;
import X.C249763kK;
import X.C252063oV;
import X.C2606346l;
import X.C273494mf;
import X.C2818159r;
import X.C323426xT;
import X.C323486xZ;
import X.C323526xd;
import X.C323966yO;
import X.C331157Pu;
import X.C51973G9u;
import X.C66905Meo;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbY;
import X.Dc2;
import X.ERK;
import X.EVS;
import X.JTP;
import X.T70;
import X.T72;
import X.T8M;
import X.UBX;
import X.UO2;
import X.VGZ;
import X.VYP;
import X.W0O;
import X.W1F;
import X.W27;
import X.WBC;
import X.WC9;
import X.WQI;
import X.WS0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MerchantShoppingCartFragment extends AnonymousClass4DH implements C249763kK, AnonymousClass4DU, C273494mf, AnonymousClass4DS {
    public int A00;
    public C15047ULa A01;
    public UserSession A02;
    public Dc2 A03;
    public CheckoutLaunchParams A04;
    public IgFundedIncentive A05;
    public MultiProductComponent A06;
    public W1F A07;
    public VYP A08;
    public C18785W1l A09;
    public C16508Uw5 A0A = C16508Uw5.LOADING;
    public C20999X8w A0B;
    public C231142qw A0C;
    public C17456VWj A0D;
    public C18622VvF A0E;
    public W0O A0F;
    public C17871VhO A0G;
    public C17468VWv A0H;
    public C18617VvA A0I;
    public W27 A0J;
    public C13680Tep A0K;
    public Runnable A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public Map A0Z;
    public Set A0a;
    public boolean A0b;
    public boolean A0c;
    public String A0d;
    public String A0e;
    public boolean A0f;
    public boolean A0g;
    public final AnonymousClass2tB A0h = new C66905Meo(this, 2);
    public final 1wn A0i = new C19221WQb(this, 46);
    public final 1wn A0j = new C19221WQb(this, 47);
    public final 1wn A0k = new C19221WQb(this, 48);
    public final 1wn A0l = new T72(this, 7);
    public final C14819UAy A0m = new C14819UAy();
    public final C19560Wbk A0n = new C19560Wbk(this);
    public RecyclerView mRecyclerView;

    public final void configureActionBar(2da r2) {
        r2.Eu4(true);
        r2.Eom(2131973759);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "instagram_shopping_merchant_bag";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A08 = new VYP(DbU.A0C(view, R.id.merchant_cart_footer_container), this.A02);
        Context requireContext = requireContext();
        UserSession userSession = this.A02;
        C19560Wbk wbk = this.A0n;
        C14819UAy uAy = this.A0m;
        this.A07 = new W1F(requireContext, this, uAy, userSession, wbk, this.A0Z);
        RecyclerView A0K2 = DbX.A0K(view);
        this.mRecyclerView = A0K2;
        A0K2.setImportantForAccessibility(2);
        PinnedLinearLayoutManager pinnedLinearLayoutManager = new PinnedLinearLayoutManager(requireContext(), new C19561Wbl(this));
        pinnedLinearLayoutManager.A01 = WS0.class;
        pinnedLinearLayoutManager.A03 = "product_collection";
        pinnedLinearLayoutManager.A00 = UO2.class;
        pinnedLinearLayoutManager.A02 = "footer_gap_view_model_key";
        this.mRecyclerView.setLayoutManager(pinnedLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A07.A08);
        AnonymousClass3AQ r1 = new AnonymousClass3AQ();
        r1.A00 = false;
        this.mRecyclerView.setItemAnimator(r1);
        uAy.A00(this.mRecyclerView, "MerchantShoppingCartFragment");
        C18622VvF A042 = C323426xT.A00(this.A02).A04(this.A0U);
        if (A042 == null) {
            A00(C16508Uw5.LOADING, this, (C18622VvF) null);
        } else {
            C18748Vzj.A00(VGZ.A00(this.A02), 37362470, true);
            A00(C16508Uw5.LOADED, this, A042);
        }
        1Ng A002 = AnonymousClass1Nd.A00(this.A02);
        A002.A01(this.A0i, C323966yO.class);
        A002.A01(this.A0j, C323526xd.class);
        A002.A01(this.A0l, T70.class);
        A002.A01(this.A0k, WQI.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0200, code lost:
        if (r3.A01(r12.A02) > 0) goto L_0x0202;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C16508Uw5 r30, com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r31, X.C18622VvF r32) {
        /*
            r9 = r31
            android.view.View r0 = r9.mView
            if (r0 == 0) goto L_0x036f
            X.VvF r0 = r9.A0E
            r8 = r32
            if (r0 == 0) goto L_0x0017
            if (r32 == 0) goto L_0x0017
            boolean r1 = r0.A08
            boolean r0 = r8.A08
            if (r1 == r0) goto L_0x0017
            r0 = 0
            r9.A00 = r0
        L_0x0017:
            r9.A0E = r8
            java.util.Map r1 = r9.A0Z
            X.VWj r0 = r9.A0D
            if (r0 != 0) goto L_0x0034
            if (r32 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x0034
            java.util.List r0 = r8.A06
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            java.util.Set r1 = r1.keySet()
            X.VWj r0 = new X.VWj
            r0.<init>(r2, r1)
            r9.A0D = r0
        L_0x0034:
            X.VvF r1 = r9.A0E
            if (r1 == 0) goto L_0x0047
            com.instagram.model.shopping.productfeed.MultiProductComponent r0 = r9.A06
            if (r0 != 0) goto L_0x0047
            java.util.List r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009a
            r0 = 0
        L_0x0045:
            r9.A06 = r0
        L_0x0047:
            com.instagram.common.session.UserSession r0 = r9.A02
            X.6xT r0 = X.C323426xT.A00(r0)
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r0.A00
            r9.A05 = r0
            X.VvF r1 = r9.A0E
            if (r1 == 0) goto L_0x00a3
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x00a3
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.A0a = r0
            java.util.List r0 = r1.A09
            java.util.Iterator r3 = r0.iterator()
        L_0x0066:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r3.next()
            X.W0O r1 = (X.W0O) r1
            com.instagram.user.model.Product r0 = r1.A03()
            if (r0 == 0) goto L_0x0066
            java.util.List r0 = r0.A0N
            boolean r0 = X.AnonymousClass4KJ.A00(r0)
            if (r0 != 0) goto L_0x0066
            com.instagram.user.model.Product r0 = r1.A03()
            java.util.List r0 = r0.A0N
            java.util.Iterator r2 = r0.iterator()
        L_0x008a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = r9.A0a
            r0.add(r1)
            goto L_0x008a
        L_0x009a:
            java.util.List r0 = r1.A07
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.instagram.model.shopping.productfeed.MultiProductComponent r0 = (com.instagram.model.shopping.productfeed.MultiProductComponent) r0
            goto L_0x0045
        L_0x00a3:
            X.VvF r12 = r9.A0E
            X.Uw5 r7 = X.C16508Uw5.LOADED
            r6 = 1
            r10 = r30
            if (r10 != r7) goto L_0x027b
            if (r12 == 0) goto L_0x027b
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x027b
            X.6xZ r0 = X.C13990Tnq.A0V(r9)
            r0.A0B()
            X.VvF r1 = r9.A0E
            if (r1 == 0) goto L_0x0127
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0127
            java.util.List r14 = r1.A09
            boolean r0 = r14.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            X.17k.A0F(r0)
            r1 = 0
            java.lang.Object r0 = r14.get(r1)
            X.W0O r0 = (X.W0O) r0
            com.instagram.user.model.Product r0 = r0.A03()
            if (r0 != 0) goto L_0x00db
            r2 = 0
        L_0x00db:
            X.17k.A0F(r2)
            java.lang.Object r0 = r14.get(r1)
            X.W0O r0 = (X.W0O) r0
            com.instagram.user.model.Product r0 = r0.A03()
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            r16 = r0
            r16.getClass()
            X.0eM r0 = X.SFL.A04
            java.lang.Object r3 = r0.getValue()
            X.SFL r3 = (X.SFL) r3
            com.instagram.common.session.UserSession r1 = r9.A02
            r3.A00 = r1
            com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule r0 = r3.A01
            if (r0 == 0) goto L_0x0103
            r0.mUserSession = r1
        L_0x0103:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r14.iterator()
        L_0x010c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.Object r0 = r1.next()
            X.W0O r0 = (X.W0O) r0
            com.instagram.user.model.Product r0 = r0.A03()
            if (r0 == 0) goto L_0x0122
            r2.add(r0)
            goto L_0x010c
        L_0x0122:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0127:
            r0 = 0
            goto L_0x0187
        L_0x0129:
            r3.A03 = r2
            com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule r0 = r3.A01
            if (r0 == 0) goto L_0x0131
            r0.mProducts = r2
        L_0x0131:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r9.A05
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r0.A07
            r13.add(r0)
        L_0x013f:
            com.instagram.common.session.UserSession r0 = r9.A02
            r32 = r0
            X.VvF r0 = r9.A0E
            com.instagram.user.model.User r0 = r0.A05
            r17 = r0
            java.lang.String r0 = r9.A0U
            r18 = r0
            java.lang.String r0 = r9.A0N
            r19 = r0
            java.lang.String r20 = "instagram_shopping_merchant_bag"
            java.lang.String r0 = r9.A0Y
            r21 = r0
            java.lang.String r15 = r9.A0M
            java.lang.String r11 = r9.A0P
            java.lang.String r5 = r9.A0R
            java.lang.String r4 = r9.A0O
            java.lang.String r3 = r9.A0V
            java.lang.String r2 = r9.A0Q
            r2.getClass()
            java.lang.String r1 = r9.A0T
            r1.getClass()
            java.lang.String r0 = r9.A0X
            r22 = r15
            r23 = r11
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r2
            r28 = r1
            r29 = r0
            r30 = r14
            r31 = r13
            r15 = r32
            com.instagram.model.payments.checkout.CheckoutLaunchParams r0 = X.C18769W0q.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0187:
            r9.A04 = r0
            boolean r0 = r9.A0f
            if (r0 != 0) goto L_0x0347
            r9.A0f = r6
            X.W1l r5 = r9.A09
            java.lang.String r11 = r9.A0U
            java.lang.String r1 = r9.A0N
            com.instagram.common.session.UserSession r0 = r9.A02
            X.6xT r0 = X.C323426xT.A00(r0)
            java.lang.Integer r0 = r0.A06()
            int r16 = X.C13988Tno.A0D(r0)
            java.lang.String r0 = r9.A0Q
            r19 = r0
            r19.getClass()
            java.lang.String r0 = r9.A0T
            r18 = r0
            r18.getClass()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r9.A05
            if (r0 == 0) goto L_0x0278
            java.lang.String r13 = r0.A07
        L_0x01b7:
            java.lang.String r0 = r9.A0d
            r17 = r0
            X.Dba.A0j(r6, r11, r1)
            X.0wc r2 = r5.A02
            java.lang.String r0 = "instagram_shopping_merchant_bag_load_success"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            X.VPJ r0 = r12.A04
            com.instagram.model.payments.CurrencyAmountInfoImpl r0 = r0.A00
            r2 = 0
            if (r0 != 0) goto L_0x0272
            r3 = r2
        L_0x01ce:
            X.C13988Tno.A1A(r4, r11)
            java.lang.String r15 = r5.A05
            java.lang.String r14 = ""
            if (r15 != 0) goto L_0x01d8
            r15 = r14
        L_0x01d8:
            java.lang.String r0 = "merchant_bag_entry_point"
            r4.AAJ(r0, r15)
            java.lang.String r0 = "checkout_session_id"
            r4.AAJ(r0, r1)
            r0 = r16
            long r0 = (long) r0
            r15 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            java.lang.String r0 = "total_item_count"
            r4.A9F(r0, r1)
            int r0 = r12.A00
            X.C13991Tnr.A11(r4, r0)
            X.W2s.A03(r4, r12, r11)
            if (r3 == 0) goto L_0x0202
            X.Wh3 r0 = r12.A02
            int r1 = r3.compareTo(r0)
            r0 = 1
            if (r1 <= 0) goto L_0x0203
        L_0x0202:
            r0 = 0
        L_0x0203:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_free_shipping_reached"
            r4.A7p(r0, r1)
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x0211
            r14 = r0
        L_0x0211:
            X.C13988Tno.A1D(r4, r14)
            java.lang.Long r1 = X.DbV.A0q(r19)
            java.lang.String r0 = "global_bag_id"
            r4.A9F(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r18)
            java.lang.String r0 = "merchant_bag_id"
            r4.A9F(r0, r1)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.List r0 = r12.A06
            java.util.Iterator r15 = X.JTQ.A0h(r0)
        L_0x0231:
            boolean r0 = r15.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x02d4
            java.lang.Object r0 = r15.next()
            X.W0O r0 = (X.W0O) r0
            com.instagram.user.model.Product r0 = r0.A03()
            if (r0 == 0) goto L_0x0231
            java.util.List r0 = r0.A0N
            if (r0 == 0) goto L_0x0231
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0250:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0264
            java.lang.Object r0 = r14.next()
            com.instagram.api.schemas.ProductDiscountInformationDict r0 = (com.instagram.api.schemas.ProductDiscountInformationDict) r0
            java.lang.String r0 = r0.getId()
            r1.add(r0)
            goto L_0x0250
        L_0x0264:
            java.util.Iterator r1 = r1.iterator()
        L_0x0268:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0231
            X.JTS.A1V(r11, r1)
            goto L_0x0268
        L_0x0272:
            X.Wh3 r3 = X.C19875Wh3.A00(r0)
            goto L_0x01ce
        L_0x0278:
            r13 = 0
            goto L_0x01b7
        L_0x027b:
            X.Uw5 r0 = X.C16508Uw5.FAILED
            if (r10 != r0) goto L_0x0347
            boolean r0 = r9.A0f
            if (r0 != 0) goto L_0x0347
            r9.A0f = r6
            com.instagram.common.session.UserSession r0 = r9.A02
            X.Vzj r0 = X.VGZ.A00(r0)
            r0.A02()
            X.W1l r11 = r9.A09
            java.lang.String r2 = r9.A0U
            java.lang.String r12 = r9.A0N
            java.lang.String r5 = r9.A0Q
            java.lang.String r4 = r9.A0T
            X.Dba.A0j(r6, r2, r12)
            X.0wc r1 = r11.A02
            java.lang.String r0 = "instagram_shopping_merchant_bag_load_failure"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "merchant_id"
            r3.AAJ(r0, r2)
            java.lang.String r1 = r11.A05
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x02ce
            java.lang.String r0 = "merchant_bag_entry_point"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r11.A06
            if (r1 == 0) goto L_0x02c8
            java.lang.String r0 = "merchant_bag_prior_module"
            java.lang.String r0 = X.C18785W1l.A01(r3, r11, r0, r1, r12)
            X.C18785W1l.A02(r3, r11, r0, r5)
            X.C13991Tnr.A16(r3, r4)
            r3.Cgf()
            goto L_0x0347
        L_0x02c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x02ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x02d4:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x02df
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
        L_0x02df:
            java.lang.String r0 = "discount_ids"
            r4.AAe(r0, r1)
            if (r13 != 0) goto L_0x0365
            r0 = r2
        L_0x02e7:
            java.lang.String r1 = "ig_funded_discount_ids"
            r4.AAe(r1, r0)
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "merchant_bag_prior_module"
            r4.AAJ(r0, r1)
            java.lang.String r1 = "tooltip_text"
            r0 = r17
            r4.AAJ(r1, r0)
            java.lang.String r1 = r5.A00
            java.lang.String r0 = "global_bag_entry_point"
            r4.AAJ(r0, r1)
            java.lang.String r1 = r5.A04
            java.lang.String r0 = "global_bag_prior_module"
            r4.AAJ(r0, r1)
            X.Wh3 r0 = r12.A02
            java.lang.String r1 = r0.A01
            r0 = 1255(0x4e7, float:1.759E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            if (r3 == 0) goto L_0x031b
            java.lang.String r2 = X.W2s.A00(r3)
        L_0x031b:
            java.lang.String r0 = "free_shipping_order_value"
            X.C51973G9u.A14(r4, r0, r2)
            r4.Cgf()
            com.instagram.common.session.UserSession r3 = r9.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36311075154756013(0x8100bb000301ad, double:3.0266083686069263E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x0347
            androidx.fragment.app.FragmentActivity r3 = r9.requireActivity()
            androidx.fragment.app.Fragment r0 = r9.mParentFragment
            boolean r0 = r0 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0362
            java.lang.String r2 = "bottom_sheet"
        L_0x033e:
            com.instagram.model.payments.checkout.CheckoutLaunchParams r1 = r9.A04
            if (r1 == 0) goto L_0x0347
            com.instagram.common.session.UserSession r0 = r9.A02
            X.1Y5.A01(r3, r0, r1, r2)
        L_0x0347:
            X.Uw5 r0 = X.C16508Uw5.FAILED
            if (r10 != r0) goto L_0x035f
            if (r8 == 0) goto L_0x035f
            r9.A0A = r7
            com.instagram.common.session.UserSession r0 = r9.A02
            X.Vzj r1 = X.VGZ.A00(r0)
            r0 = 37362470(0x23a1b26, float:1.3672913E-37)
            X.C18748Vzj.A00(r1, r0, r6)
        L_0x035b:
            A01(r9)
            return
        L_0x035f:
            r9.A0A = r10
            goto L_0x035b
        L_0x0362:
            java.lang.String r2 = "cart"
            goto L_0x033e
        L_0x0365:
            long r0 = java.lang.Long.parseLong(r13)
            java.util.List r0 = X.C66582MXn.A10(r0)
            goto L_0x02e7
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment.A00(X.Uw5, com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment, X.VvF):void");
    }

    public static void A01(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        C19875Wh3 A002;
        if (merchantShoppingCartFragment.A0L == null) {
            VYP vyp = merchantShoppingCartFragment.A08;
            C18622VvF vvF = merchantShoppingCartFragment.A0E;
            C19560Wbk wbk = merchantShoppingCartFragment.A0n;
            C51973G9u.A1E(vyp, vvF, wbk);
            if (C13988Tno.A1a(vvF.A06)) {
                vyp.A00.setVisibility(8);
            } else {
                boolean z = false;
                vyp.A00.setVisibility(0);
                C17380VTh vTh = vvF.A03;
                if (!(vTh == null || vTh.A01 == null)) {
                    C19875Wh3 wh3 = vvF.A02;
                    0qQ.A07(wh3);
                    CurrencyAmountInfoImpl currencyAmountInfoImpl = vvF.A04.A00;
                    if (currencyAmountInfoImpl == null) {
                        A002 = null;
                    } else {
                        A002 = C19875Wh3.A00(currencyAmountInfoImpl);
                    }
                    int i = vvF.A01;
                    UBX ubx = vyp.A02;
                    0qQ.A0B(ubx, 0);
                    TextView textView = ubx.A00;
                    Context context = textView.getContext();
                    ubx.A02.setText(DbY.A0d(context.getResources(), i, R.plurals.shopping_cart_subtotal_title_text));
                    if (A002 == null) {
                        ubx.A01.setVisibility(8);
                    } else if (A002.compareTo(wh3) <= 0) {
                        TextView textView2 = ubx.A01;
                        textView2.setVisibility(0);
                        DbT.A18(context, textView2, 2131962674);
                    } else {
                        SpannableStringBuilder A0D2 = DbY.A0D(context, new C19875Wh3(A002.A01, A002.A02.subtract(wh3.A02), A002.A00).toString(), 2131966183);
                        TextView textView3 = ubx.A01;
                        textView3.setVisibility(0);
                        textView3.setText(A0D2);
                    }
                    textView.setText(wh3.toString());
                }
                WBC wbc = new WBC(wbk, 29);
                if (!vvF.A08 && !vvF.A09.isEmpty()) {
                    z = true;
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = vyp.A01;
                igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
                igdsBottomButtonLayout.setPrimaryActionOnClickListener(wbc);
                Context context2 = igdsBottomButtonLayout.getContext();
                0qQ.A0A(context2);
                String A0d2 = AnonymousClass7TF.A0d(context2.getResources(), 2131969228);
                Drawable A012 = AnonymousClass4Ed.A01(context2, R.drawable.instagram_lock_filled_12, 2Yu.A09(context2));
                if (A012 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int length = spannableStringBuilder.length();
                    int A022 = AnonymousClass7TF.A02(context2, R.dimen.account_discovery_bottom_gap);
                    A012.setBounds(0, 0, (A012.getIntrinsicWidth() * A022) / A012.getIntrinsicHeight(), A022);
                    C2606346l r2 = new C2606346l(A012);
                    r2.A02 = AnonymousClass05K.A00;
                    r2.A01 = AnonymousClass7TG.A03(context2);
                    spannableStringBuilder.append("c");
                    spannableStringBuilder.setSpan(r2, length, "c".length() + length, 33);
                    spannableStringBuilder.append(A0d2);
                    igdsBottomButtonLayout.setFooterText(spannableStringBuilder);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0 && merchantShoppingCartFragment.A00 == 0) {
                merchantShoppingCartFragment.requireView().getViewTreeObserver().addOnGlobalLayoutListener(new WC9(merchantShoppingCartFragment, 11));
            } else {
                W1F w1f = merchantShoppingCartFragment.A07;
                w1f.A00 = new UO2((Integer) null, Integer.valueOf(merchantShoppingCartFragment.A00), "footer_gap_view_model_key", R.dimen.abc_button_padding_horizontal_material);
                W1F.A02(w1f);
                W1F w1f2 = merchantShoppingCartFragment.A07;
                C16508Uw5 uw5 = merchantShoppingCartFragment.A0A;
                C18622VvF vvF2 = merchantShoppingCartFragment.A0E;
                C17456VWj vWj = merchantShoppingCartFragment.A0D;
                MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
                String str = merchantShoppingCartFragment.A0W;
                IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
                Set set = merchantShoppingCartFragment.A0a;
                AnonymousClass2tB r0 = merchantShoppingCartFragment.A0h;
                0qQ.A0B(uw5, 0);
                w1f2.A05 = vvF2;
                w1f2.A04 = vWj;
                w1f2.A03 = multiProductComponent;
                w1f2.A06 = str;
                w1f2.A02 = igFundedIncentive;
                w1f2.A01 = r0;
                w1f2.A07 = set;
                W1F.A02(w1f2);
            }
            if (!(merchantShoppingCartFragment.A0W == null || merchantShoppingCartFragment.A0E == null)) {
                merchantShoppingCartFragment.A0L = new C20072WkW(merchantShoppingCartFragment);
                merchantShoppingCartFragment.requireView().postDelayed(merchantShoppingCartFragment.A0L, 500);
            }
            C18748Vzj.A00(VGZ.A00(merchantShoppingCartFragment.A02), 37362470, false);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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
        return this.A0N;
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

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        String A012;
        C20999X8w wcV;
        int A022 = AnonymousClass0fD.A02(-1791154648);
        MerchantShoppingCartFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = DbX.A0U(this);
        this.A0X = C228022kf.A00(requireArguments);
        this.A0U = DbU.A0l(requireArguments, "merchant_id");
        this.A0O = DbU.A0l(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A0S = requireArguments.getString("logging_token");
        this.A0Y = requireArguments.getString("tracking_token");
        this.A0V = DbU.A0l(requireArguments, "prior_module_name");
        C18748Vzj A002 = VGZ.A00(this.A02);
        String str = this.A0V;
        0qQ.A0B(str, 0);
        C18748Vzj.A01(A002, str, "instagram_shopping_merchant_bag", 37362470);
        this.A0g = requireArguments.getBoolean("is_modal");
        this.A0d = requireArguments.getString("tooltip_text");
        this.A0Z = (HashMap) requireArguments.getSerializable(AnonymousClass000.A00(3866));
        if (requireArguments.containsKey("checkout_session_id")) {
            A012 = DbU.A0l(requireArguments, "checkout_session_id");
        } else {
            A012 = C2818159r.A01();
        }
        this.A0N = A012;
        this.A0W = requireArguments.getString(AnonymousClass000.A00(1707));
        this.A0P = requireArguments.getString("global_bag_entry_point");
        this.A0R = requireArguments.getString("global_bag_prior_module");
        this.A0e = requireArguments.getString("media_id");
        this.A0M = requireArguments.getString(TraceFieldType.BroadcastId);
        FragmentActivity activity = getActivity();
        this.A0C = C231132qv.A01(getContext(), activity, this.A02, this, this.A0V, this.A0X);
        this.A0J = new W27(requireActivity(), this.A02);
        2el A003 = C2362432z.A00(this);
        UserSession userSession = this.A02;
        C16675UzB uzB = C16675UzB.CART;
        String str2 = this.A0X;
        String str3 = this.A0V;
        String obj = uzB.toString();
        AnonymousClass7TG.A1P(userSession, A003);
        this.A0I = new C18617VvA(userSession, A003, this, new C231112qt(this, userSession, str2, (String) null, obj, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1), str2, str3, (String) null, (String) null, (List) null);
        BottomSheetFragment bottomSheetFragment = this.mParentFragment;
        if (bottomSheetFragment instanceof BottomSheetFragment) {
            bottomSheetFragment.getClass();
            wcV = new C19605WcU(this, this.A02, this, bottomSheetFragment);
        } else {
            wcV = new C19606WcV(this, this.A02, this, new ERK(this, 5), new T8M(this, 1));
        }
        this.A0B = wcV;
        C18785W1l w1l = new C18785W1l(this, this.A02, false, this.A0O, this.A0V, this.A0P, this.A0R, this.A0X, this.A0e);
        this.A09 = w1l;
        this.A0G = new C17871VhO(this.A02, A003, w1l, this.A0U, this.A0N);
        C323486xZ A0V2 = C13990Tnq.A0V(this);
        this.A0Q = A0V2.A01;
        String A092 = A0V2.A09(this.A0U);
        this.A0T = A092;
        String str4 = this.A0N;
        String str5 = this.A0Q;
        String str6 = this.A0P;
        String str7 = this.A0R;
        String str8 = this.A0O;
        String str9 = this.A0V;
        C15047ULa uLa = new C15047ULa(str4, str5, str6, str7, A092, str8, str9);
        this.A01 = uLa;
        this.A0H = new C17468VWv(uLa, this, this.A02, A003, new ShoppingNavigationInfo((String) null, str9, str8, this.A0X), this.A0U);
        this.A09.A05(this.A0U, this.A0N, this.A0Q, this.A0T, this.A0d);
        AnonymousClass0fD.A09(385100697, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1946111738);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_merchant_cart_fragment);
        AnonymousClass0fD.A09(624506287, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-464738874);
        super.onDestroy();
        AnonymousClass1Nd.A00(this.A02).A02(this.A0j, C323526xd.class);
        AnonymousClass0fD.A09(262415708, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1246199941);
        super.onDestroyView();
        this.mRecyclerView = null;
        1Ng A002 = AnonymousClass1Nd.A00(this.A02);
        A002.A02(this.A0i, C323966yO.class);
        A002.A02(this.A0l, T70.class);
        A002.A02(this.A0k, WQI.class);
        AnonymousClass0fD.A09(-1680295611, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-526713672);
        MerchantShoppingCartFragment.super.onPause();
        C13990Tnq.A0V(this).A0B();
        C14819UAy uAy = this.A0m;
        Map map = uAy.A00;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            ((RecyclerView) A16.next()).A16(uAy);
        }
        map.clear();
        Dc2 dc2 = this.A03;
        if (dc2 != null) {
            DbX.A1R(dc2);
            this.A03 = null;
        }
        AnonymousClass0fD.A09(-801154724, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1949225126);
        super.onResume();
        if (this.A0c) {
            this.A0c = false;
            if (this.A0g) {
                DbT.A1K(this);
            } else if (this.mParentFragment instanceof BottomSheetFragment) {
                C331157Pu r0 = requireParentFragment().A02;
                r0.getClass();
                r0.A08();
            } else {
                DbT.A1I(this);
            }
        }
        AnonymousClass0fD.A09(-1554473589, A022);
    }
}
