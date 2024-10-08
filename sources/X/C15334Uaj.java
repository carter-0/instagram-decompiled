package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Uaj  reason: case insensitive filesystem */
public final class C15334Uaj extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ShoppingShopManagementAddProductFragment";
    public View A00;
    public View A01;
    public FrameLayout A02;
    public RecyclerView A03;
    public C273694n2 A04;
    public C229382nI A05;
    public AnonymousClass6NS A06;
    public IgdsInlineSearchBox A07;
    public C17271VOy A08;
    public C15676Ugh A09;
    public C15685Ugq A0A;
    public C17870VhN A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass0eM A0G;
    public final C249403jg A0H = new UB1(this, 20);
    public final C19576Wc0 A0I = new C19576Wc0(this, 2);
    public final 1wn A0J;
    public final 1wn A0K;
    public final 1wn A0L;
    public final G77 A0M = new WY1(this, 5);
    public final X1Z A0N = new C19570Wbu(this, 2);
    public final C20924X4p A0O = new C19572Wbw(this);
    public final C20933X4y A0P = new C19621Wck(this);
    public final VPB A0Q = new VPB(this);
    public final C19623Wcm A0R = new C19623Wcm(this);
    public final X51 A0S = new C19627Wcq(this);
    public final AnonymousClass0eM A0T;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r3.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.util.List r0 = r0.A0T()
            if (r0 == 0) goto L_0x001f
            boolean r1 = r0.isEmpty()
            r0 = 2131973738(0x7f13566a, float:1.958452E38)
            if (r1 == 0) goto L_0x0022
        L_0x001f:
            r0 = 2131952350(0x7f1302de, float:1.954114E38)
        L_0x0022:
            r4.Eom(r0)
            X.3JR r2 = new X.3JR
            r2.<init>()
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A0K = r0
            r1 = 69
            X.WBC r0 = new X.WBC
            r0.<init>(r3, r1)
            X.DbX.A19(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15334Uaj.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "shop_manager_add_products";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A08 = new C17271VOy(requireContext(), this, this.A0N, this.A0O, this.A0I, this.A0Q);
        RecyclerView A0G2 = C13990Tnq.A0G(view);
        this.A03 = A0G2;
        String str = "recyclerView";
        if (A0G2 != null) {
            A0G2.A15(this.A0H);
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                C17271VOy vOy = this.A08;
                if (vOy == null) {
                    str = "adapterWrapper";
                } else {
                    recyclerView.setAdapter(vOy.A00.A00);
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
                        r0.A00 = false;
                        recyclerView2.setItemAnimator(r0);
                        this.A00 = view.findViewById(R.id.product_source);
                        this.A01 = view.findViewById(R.id.product_source_divider);
                        this.A02 = (FrameLayout) view.findViewById(R.id.null_state_container);
                        C273694n2 r1 = new C273694n2(requireContext());
                        this.A04 = r1;
                        FrameLayout frameLayout = this.A02;
                        if (frameLayout == null) {
                            str = "nullStateContainer";
                        } else {
                            frameLayout.addView(r1);
                            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.findViewById(R.id.search_box);
                            this.A07 = igdsInlineSearchBox;
                            if (igdsInlineSearchBox == null) {
                                str = "inlineSearchBox";
                            } else {
                                igdsInlineSearchBox.A02 = this.A0M;
                                WWL wwl = new WWL(this, 11);
                                C3251771i r8 = C3251771i.A0B;
                                RecyclerView recyclerView3 = this.A03;
                                if (recyclerView3 != null) {
                                    C3251871j r5 = new C3251871j(recyclerView3.A0D, wwl, r8, false, false);
                                    RecyclerView recyclerView4 = this.A03;
                                    if (recyclerView4 != null) {
                                        recyclerView4.A15(r5);
                                        this.A0B = new C17870VhN(view, this.A0S);
                                        DbV.A0J(this).A00(new MG4(this, (AnonymousClass4D7) null, 39));
                                        A00(this).A01.A06(getViewLifecycleOwner(), new WEB(this, 3));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C14770U8g A00(C15334Uaj uaj) {
        return (C14770U8g) uaj.A0T.getValue();
    }

    public final UserSession A01() {
        return AnonymousClass7TE.A0l(this.A0G);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0G);
    }

    public C15334Uaj() {
        C20689WxL wxL = new C20689WxL(this, 20);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20689WxL(new C20689WxL(this, 17), 18));
        this.A0T = new C227862kA(new C20689WxL(A002, 19), wxL, new C20613Wvu(35, A002, (Object) null), new 0Yh(C14770U8g.class));
        this.A0J = new C19221WQb(this, 70);
        this.A0L = new C19222WQc(this, 1);
        this.A0K = new C19222WQc(this, 0);
        this.A0G = C227642jf.A02(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            A00(this).A05.A01();
            IgdsInlineSearchBox igdsInlineSearchBox = this.A07;
            if (igdsInlineSearchBox == null) {
                0qQ.A0F("inlineSearchBox");
                throw AnonymousClass00P.createAndThrow();
            } else {
                igdsInlineSearchBox.A01();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, X.Uaj, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1597211169);
        C15334Uaj.super.onCreate(bundle);
        this.A0D = C320236s2.A01(requireArguments(), "waterfall_id");
        this.A0C = C320236s2.A01(requireArguments(), "prior_module");
        A00(this).A01("");
        AnonymousClass0eM r2 = this.A0G;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        String str = this.A0D;
        if (str != null) {
            this.A09 = new C15676Ugh(requireContext, A002, A0l, this.A0P, "add_to_shop", str, "shop_manager_add_products");
            UserSession A0l2 = AnonymousClass7TE.A0l(r2);
            Context requireContext2 = requireContext();
            0gy A003 = AnonymousClass07i.A00(this);
            String str2 = this.A0D;
            if (str2 != null) {
                this.A0A = new C15685Ugq(requireContext2, A003, A0l2, this.A0R, "shop_manager_add_products", str2, "shop_manager_add_products");
                this.A05 = C229382nI.A03(this, AnonymousClass7TE.A0l(r2), (2el) null);
                1Ng A004 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r2));
                A004.A01(this.A0J, WQ5.class);
                A004.A01(this.A0L, WQ7.class);
                A004.A01(this.A0K, WQ6.class);
                AnonymousClass0fD.A09(1756438167, A022);
                return;
            }
        }
        0qQ.A0F("waterfallId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1496999179);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.shop_management_add_fragment, false);
        AnonymousClass0fD.A09(-474610390, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1794369738);
        super.onDestroy();
        AnonymousClass6NS r0 = this.A06;
        if (r0 != null) {
            r0.A04();
        }
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0G));
        A002.A02(this.A0J, WQ5.class);
        A002.A02(this.A0L, WQ7.class);
        A002.A02(this.A0K, WQ6.class);
        AnonymousClass0fD.A09(1537060625, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-587556638);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A07;
        if (igdsInlineSearchBox == null) {
            0qQ.A0F("inlineSearchBox");
            throw AnonymousClass00P.createAndThrow();
        }
        igdsInlineSearchBox.A03();
        C15334Uaj.super.onPause();
        AnonymousClass0fD.A09(-88708303, A022);
    }
}
