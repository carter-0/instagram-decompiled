package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Uan  reason: case insensitive filesystem */
public final class C15338Uan extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ProductPickerFragment";
    public FrameLayout A00;
    public C273694n2 A01;
    public C229382nI A02;
    public AnonymousClass6NS A03;
    public IgdsInlineSearchBox A04;
    public W02 A05;
    public C17961Viu A06;
    public C19743Wek A07;
    public ProductPickerArguments A08;
    public ProductSourceOverrideState A09;
    public RefreshableNestedScrollingParent A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public View A0E;
    public View A0F;
    public RecyclerView A0G;
    public C231002qi A0H;
    public C15676Ugh A0I;
    public C15685Ugq A0J;
    public C17870VhN A0K;
    public String A0L;
    public final UAC A0M;
    public final AnonymousClass0eM A0N;
    public final C249403jg A0O;
    public final G77 A0P;
    public final X6y A0Q = new C19596WcL(this, 0);
    public final C20933X4y A0R;
    public final C20934X4z A0S;
    public final C17783Vfu A0T;
    public final X51 A0U;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Etr(false);
    }

    public final String getModuleName() {
        return "product_search";
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
        this.A0E = view.requireViewById(R.id.product_source);
        this.A0F = view.requireViewById(R.id.product_source_divider);
        this.A00 = (FrameLayout) view.requireViewById(R.id.null_state_container);
        if (getContext() != null) {
            C273694n2 r1 = new C273694n2(requireContext());
            this.A01 = r1;
            FrameLayout frameLayout = this.A00;
            if (frameLayout != null) {
                frameLayout.addView(r1);
            }
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.requireViewById(R.id.refreshable_recycler_view_container);
            this.A0A = refreshableNestedScrollingParent;
            if (refreshableNestedScrollingParent != null) {
                refreshableNestedScrollingParent.A07 = new C19764Wf5(this, 4);
                this.A0G = DbX.A0K(refreshableNestedScrollingParent);
            }
            RecyclerView recyclerView = this.A0G;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.A0M);
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            RecyclerView recyclerView2 = this.A0G;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView3 = this.A0G;
            if (recyclerView3 != null) {
                recyclerView3.A15(this.A0O);
            }
            C19743Wek wek = this.A07;
            String str = "networkHelper";
            if (wek != null) {
                C3251871j r3 = new C3251871j(linearLayoutManager, wek, C3251771i.A0B, false, false);
                RecyclerView recyclerView4 = this.A0G;
                if (recyclerView4 != null) {
                    recyclerView4.A15(r3);
                }
                IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
                this.A04 = igdsInlineSearchBox;
                if (igdsInlineSearchBox != null) {
                    igdsInlineSearchBox.A02 = this.A0P;
                    igdsInlineSearchBox.setImeOptions(6);
                }
                this.A0K = new C17870VhN(view, this.A0U);
                if (DbX.A0l(AnonymousClass0t1.A01, this.A0N).A1b()) {
                    C15685Ugq ugq = this.A0J;
                    if (ugq == null) {
                        str = "shopVisibilityController";
                    } else {
                        ugq.A00();
                        int A022 = JTQ.A02(this.A0A);
                        View view2 = this.A0E;
                        if (view2 != null) {
                            view2.setVisibility(A022);
                        }
                        View view3 = this.A0F;
                        if (view3 != null) {
                            view3.setVisibility(A022);
                        }
                        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A04;
                        if (igdsInlineSearchBox2 != null) {
                            igdsInlineSearchBox2.setEditTextAndCustomActionEnabled(false);
                            return;
                        }
                        return;
                    }
                } else {
                    C19743Wek wek2 = this.A07;
                    if (wek2 != null) {
                        wek2.A03(true);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    private final String A00() {
        User user;
        ProductPickerArguments productPickerArguments = this.A08;
        if (productPickerArguments == null) {
            0qQ.A0F("arguments");
            throw AnonymousClass00P.createAndThrow();
        }
        List list = productPickerArguments.A07;
        if ((list == null && (list = productPickerArguments.A08) == null) || list.isEmpty() || (user = C14502TxO.A00(((ProductTag) AnonymousClass7TE.A13(list)).A02).A0B) == null) {
            return null;
        }
        return AnonymousClass3ZA.A00(user);
    }

    public static final void A01(ProductSource productSource, C15338Uan uan) {
        String str;
        C17870VhN vhN;
        if (productSource != null) {
            C19743Wek wek = uan.A07;
            if (wek == null) {
                str = "networkHelper";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            wek.A02(productSource);
        }
        C17870VhN vhN2 = uan.A0K;
        if (vhN2 != null) {
            vhN2.A00(productSource);
            ProductSourceOverrideState productSourceOverrideState = uan.A09;
            str = "productSourceOverrideState";
            if (productSourceOverrideState != null) {
                ProductSourceOverrideStatus productSourceOverrideStatus = productSourceOverrideState.A01;
                if (!(productSourceOverrideStatus == ProductSourceOverrideStatus.A05 || productSourceOverrideStatus == ProductSourceOverrideStatus.ALREADY_TAGGED || (vhN = uan.A0K) == null)) {
                    vhN.A00.setAlpha(0.5f);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        W02 w02 = uan.A05;
        if (w02 == null) {
            str = "logger";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        w02.A01 = productSource;
    }

    public static final boolean A02(C15338Uan uan) {
        User user;
        ProductPickerArguments productPickerArguments = uan.A08;
        String str = null;
        if (productPickerArguments == null) {
            0qQ.A0F("arguments");
            throw AnonymousClass00P.createAndThrow();
        }
        List list = productPickerArguments.A07;
        if (list == null) {
            list = productPickerArguments.A08;
        }
        if (list == null || list.isEmpty() || (user = C14502TxO.A00(((ProductTag) list.get(0)).A02).A0B) == null || AnonymousClass3ZA.A00(user) == null) {
            return false;
        }
        User user2 = C14502TxO.A00(((ProductTag) list.get(0)).A02).A0B;
        if (user2 != null) {
            str = AnonymousClass3ZA.A00(user2);
        }
        return C51971G9r.A1Z(str, DbU.A0u(uan.A0N), false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            ProductSource A002 = W3U.A00(AnonymousClass7TE.A0l(this.A0N));
            if (A002 != null) {
                String str = "productSourceOverrideState";
                if (A002.A00 != C16659Uyv.CATALOG) {
                    ProductSourceOverrideState productSourceOverrideState = this.A09;
                    if (productSourceOverrideState != null) {
                        if (A002.equals(productSourceOverrideState.A00)) {
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                A01(A002, this);
                ProductSourceOverrideState productSourceOverrideState2 = this.A09;
                if (productSourceOverrideState2 != null) {
                    ProductSourceOverrideStatus productSourceOverrideStatus = productSourceOverrideState2.A01;
                    String str2 = productSourceOverrideState2.A02;
                    0qQ.A0B(productSourceOverrideStatus, 0);
                    this.A09 = new ProductSourceOverrideState(A002, productSourceOverrideStatus, str2);
                    C19743Wek wek = this.A07;
                    str = "networkHelper";
                    if (wek != null) {
                        wek.A01();
                        UAC uac = this.A0M;
                        uac.A00 = AnonymousClass05K.A00;
                        uac.A03.clear();
                        uac.notifyDataSetChanged();
                        C19743Wek wek2 = this.A07;
                        if (wek2 != null) {
                            wek2.A03(true);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        if (!this.A0D) {
            return false;
        }
        1Ng A0R2 = DbX.A0R(this.A0N);
        ProductPickerArguments productPickerArguments = this.A08;
        if (productPickerArguments == null) {
            0qQ.A0F("arguments");
            throw AnonymousClass00P.createAndThrow();
        }
        Integer num = productPickerArguments.A01;
        String str = productPickerArguments.A05;
        0qQ.A0B(num, 1);
        A0R2.A00(new C64673Lfz(num, str));
        return false;
    }

    public C15338Uan() {
        C17783Vfu vfu = new C17783Vfu(this);
        this.A0T = vfu;
        this.A0P = new WY1(this, 4);
        this.A0O = new UB1(this, 17);
        this.A0U = new C19626Wcp(this);
        this.A0R = new C19620Wcj(this);
        this.A0S = new C19622Wcl(this);
        this.A0M = new UAC(this, vfu);
        this.A0D = true;
        this.A0C = true;
        this.A0N = C227642jf.A02(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.4DU} */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020b, code lost:
        if (X.0qQ.A0K(r6, r4.A04) == false) goto L_0x020d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = -1264610852(0xffffffffb49f91dc, float:-2.9722185E-7)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = r21
            r1 = r22
            X.C15338Uan.super.onCreate(r1)
            X.Viu r1 = new X.Viu
            r1.<init>()
            r0.A06 = r1
            java.util.Set r4 = r1.A00
            r3 = 37369682(0x23a3752, float:1.3680998E-37)
            java.lang.Integer r1 = X.C13990Tnq.A0Z(r4, r3)
            r4.add(r1)
            X.02m r1 = X.02m.A0p
            r1.markerStart(r3)
            android.os.Bundle r4 = r0.requireArguments()
            java.lang.Class<com.instagram.shopping.intf.productpicker.ProductPickerArguments> r3 = com.instagram.shopping.intf.productpicker.ProductPickerArguments.class
            r1 = 3788(0xecc, float:5.308E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            android.os.Parcelable r3 = X.C320236s2.A00(r4, r3, r1)
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r3 = (com.instagram.shopping.intf.productpicker.ProductPickerArguments) r3
            r0.A08 = r3
            java.lang.String r11 = "arguments"
            r1 = 0
            if (r3 == 0) goto L_0x0249
            boolean r3 = r3.A0D
            if (r3 == 0) goto L_0x0054
            androidx.fragment.app.FragmentActivity r5 = r0.getActivity()
            if (r5 == 0) goto L_0x0054
            X.0eM r3 = r0.A0N
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r3 = "product_search"
            X.C324476zN.A0R(r4, r5, r3)
        L_0x0054:
            X.1YN r12 = X.AnonymousClass2bO.A00()
            X.0eM r3 = r0.A0N
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r17 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A12
            X.AnonymousClass2bO.A00()
            r5 = 5
            X.FhY r4 = new X.FhY
            r4.<init>(r0, r5)
            X.2bW r16 = X.2bV.A03(r4)
            r13 = r0
            r14 = r0
            X.2qi r4 = r12.A01(r13, r14, r15, r16, r17)
            r0.A0H = r4
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r3)
            X.X6y r6 = r0.A0Q
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            X.Uxb r5 = r4.A00
            X.Uqt r4 = new X.Uqt
            r4.<init>(r7, r6, r5)
            r0.A07 = r4
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r6 = r4.A06
            if (r6 != 0) goto L_0x0094
            java.lang.String r6 = X.AnonymousClass7TG.A0j()
        L_0x0094:
            r0.A0L = r6
            X.Wek r5 = r0.A07
            java.lang.String r7 = "networkHelper"
            if (r5 == 0) goto L_0x0245
            java.lang.String r10 = "waterfallId"
            boolean r4 = r5 instanceof X.C16230Uqt
            if (r4 == 0) goto L_0x00a6
            X.Uqt r5 = (X.C16230Uqt) r5
            r5.A01 = r6
        L_0x00a6:
            X.3kF r12 = X.C249713kF.A00
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r6 = r0.A0L
            if (r6 == 0) goto L_0x0241
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r5 = r4.A02
            java.lang.Integer r4 = r4.A01
            java.lang.String r17 = X.C18267Voh.A00(r4)
            r15 = r6
            r16 = r5
            X.W02 r4 = r12.A05(r13, r14, r15, r16, r17)
            r0.A05 = r4
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.util.List r6 = r4.A09
            if (r6 == 0) goto L_0x00df
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x00df
            X.Wek r5 = r0.A07
            if (r5 == 0) goto L_0x0245
            boolean r4 = r5 instanceof X.C16230Uqt
            if (r4 == 0) goto L_0x00df
            X.Uqt r5 = (X.C16230Uqt) r5
            r5.A02 = r6
        L_0x00df:
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r4 = r4.A05
            java.lang.String r9 = "logger"
            if (r4 == 0) goto L_0x010b
            X.W02 r7 = r0.A05
            if (r7 == 0) goto L_0x024d
            X.LBk r5 = X.C64832Lit.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            X.Lit r6 = r5.A00(r4)
            java.lang.String r5 = r0.A0L
            if (r5 == 0) goto L_0x0241
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r4 = r4.A05
            if (r4 != 0) goto L_0x0105
            java.lang.String r4 = ""
        L_0x0105:
            X.Jqt r4 = r6.A00(r5, r4)
            r7.A00 = r4
        L_0x010b:
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r5 = r0.A08
            if (r5 == 0) goto L_0x0249
            boolean r4 = r5.A0D
            if (r4 != 0) goto L_0x012a
            X.Uxb r5 = r5.A00
            X.Uxb r4 = X.C16581Uxb.FEATURED_PRODUCT_MEDIA
            if (r5 != r4) goto L_0x012a
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            android.content.Context r5 = r0.requireContext()
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r4 = r4.A02
            X.C17075VGx.A00(r5, r0, r6, r4)
        L_0x012a:
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            r5 = 0
            if (r4 == 0) goto L_0x0249
            java.lang.String r8 = r4.A03
            if (r8 == 0) goto L_0x019e
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r6 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.BUSINESS_PARTNER
            X.Uyv r5 = X.C16659Uyv.BRAND
            com.instagram.model.shopping.ProductSource r4 = new com.instagram.model.shopping.ProductSource
            r4.<init>(r5, r8)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r7 = new com.instagram.shopping.model.productsource.ProductSourceOverrideState
            r7.<init>(r4, r6, r8)
        L_0x0141:
            r0.A09 = r7
            com.instagram.model.shopping.ProductSource r4 = r7.A00
            A01(r4, r0)
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r3)
            android.content.Context r12 = r0.requireContext()
            X.0gy r13 = X.AnonymousClass07i.A00(r0)
            java.lang.String r16 = "product_tagging_flow"
            java.lang.String r4 = r0.A0L
            if (r4 == 0) goto L_0x0241
            java.lang.String r18 = "product_search"
            X.X4y r15 = r0.A0R
            X.Ugh r11 = new X.Ugh
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r0.A0I = r11
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r3)
            android.content.Context r14 = r0.requireContext()
            X.0gy r15 = X.AnonymousClass07i.A00(r0)
            java.lang.String r5 = r0.A0L
            if (r5 == 0) goto L_0x0241
            X.X4z r4 = r0.A0S
            X.Ugq r13 = new X.Ugq
            r17 = r4
            r19 = r5
            r20 = r18
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r0.A0J = r13
            X.0lg r3 = X.DbT.A0X(r3)
            X.2nI r1 = X.C229382nI.A03(r0, r3, r1)
            r0.A02 = r1
            X.W02 r0 = r0.A05
            if (r0 == 0) goto L_0x024d
            r0.A02()
            r0 = -578630301(0xffffffffdd82cd63, float:-1.17816231E18)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x019e:
            java.lang.String r4 = r4.A04
            if (r4 == 0) goto L_0x01c9
            java.lang.String r6 = X.DbU.A0u(r3)
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r4 = r4.A04
            boolean r4 = X.0qQ.A0K(r6, r4)
            if (r4 != 0) goto L_0x01c9
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r6 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r5 = r4.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.model.shopping.ProductSource r4 = X.W3U.A00(r4)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r7 = new com.instagram.shopping.model.productsource.ProductSourceOverrideState
            r7.<init>(r4, r6, r5)
            goto L_0x0141
        L_0x01c9:
            java.lang.String r4 = r0.A00()
            if (r4 == 0) goto L_0x01f5
            java.lang.String r6 = X.DbU.A0u(r3)
            java.lang.String r4 = r0.A00()
            boolean r4 = X.0qQ.A0K(r6, r4)
            if (r4 != 0) goto L_0x01f5
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r8 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
            java.lang.String r5 = r0.A00()
            java.lang.String r4 = r0.A00()
            X.Uyv r7 = X.C16659Uyv.BRAND
        L_0x01e9:
            com.instagram.model.shopping.ProductSource r6 = new com.instagram.model.shopping.ProductSource
            r6.<init>(r7, r4)
        L_0x01ee:
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r7 = new com.instagram.shopping.model.productsource.ProductSourceOverrideState
            r7.<init>(r6, r8, r5)
            goto L_0x0141
        L_0x01f5:
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r4 = r4.A04
            if (r4 == 0) goto L_0x020d
            java.lang.String r6 = X.DbU.A0u(r3)
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            java.lang.String r4 = r4.A04
            boolean r4 = X.0qQ.A0K(r6, r4)
            if (r4 != 0) goto L_0x0221
        L_0x020d:
            java.lang.String r4 = r0.A00()
            if (r4 == 0) goto L_0x022e
            java.lang.String r6 = X.DbU.A0u(r3)
            java.lang.String r4 = r0.A00()
            boolean r4 = X.0qQ.A0K(r6, r4)
            if (r4 == 0) goto L_0x022e
        L_0x0221:
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r8 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.A05
            java.lang.String r5 = X.DbU.A0u(r3)
            java.lang.String r4 = X.DbU.A0u(r3)
            X.Uyv r7 = X.C16659Uyv.CATALOG
            goto L_0x01e9
        L_0x022e:
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r4 = r0.A08
            if (r4 == 0) goto L_0x0249
            boolean r4 = r4.A0A
            if (r4 == 0) goto L_0x0221
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r8 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.A05
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.model.shopping.ProductSource r6 = X.W3U.A00(r4)
            goto L_0x01ee
        L_0x0241:
            X.0qQ.A0F(r10)
            goto L_0x0250
        L_0x0245:
            X.0qQ.A0F(r7)
            goto L_0x0250
        L_0x0249:
            X.0qQ.A0F(r11)
            goto L_0x0250
        L_0x024d:
            X.0qQ.A0F(r9)
        L_0x0250:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15338Uan.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(454473633);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.product_picker, viewGroup, false);
        AnonymousClass0fD.A09(-1238109883, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-280017539);
        super.onDestroy();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A04;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        AnonymousClass6NS r0 = this.A03;
        if (r0 != null) {
            r0.A04();
        }
        AnonymousClass0fD.A09(-102199492, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(375761699);
        this.A0G = null;
        this.A0A = null;
        this.A04 = null;
        this.A0E = null;
        this.A0F = null;
        this.A00 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(1064489772, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2046850778);
        C15338Uan.super.onPause();
        C17961Viu viu = this.A06;
        if (viu == null) {
            0qQ.A0F("perfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        viu.A00();
        AnonymousClass0fD.A09(-1257730128, A022);
    }
}
