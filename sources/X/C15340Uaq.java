package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import java.util.List;

/* renamed from: X.Uaq  reason: case insensitive filesystem */
public final class C15340Uaq extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C337237fw, AnonymousClass4DS, C21048XBp, G77 {
    public static final C16659Uyv A0D = C16659Uyv.BRAND;
    public static final String __redex_internal_original_name = "BrandSelectionFragment";
    public IgdsInlineSearchBox A00;
    public C337257fy A01;
    public C15473UdO A02;
    public W35 A03;
    public C19741Wei A04;
    public C20988X8e A05;
    public ProductSourceOverrideState A06;
    public String A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final C249403jg A09 = new UB1(this, 18);
    public final C19694Wdw A0A = new C19694Wdw(this, 3);
    public final C17784Vfv A0B = new C17784Vfv(this);
    public final VP8 A0C = new VP8(this);

    public final void DVy() {
    }

    public final void Dam(C337257fy r3) {
        0qQ.A0B(r3, 0);
        Object Bo1 = r3.Bo1();
        0qQ.A0C(Bo1, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.shopping.model.productsource.BrandInfo>");
        A00(this, (List) Bo1);
    }

    public final void EKl() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1.equals("entry_point_creator_swipe_up_to_shop") == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = "entry_point_creator_swipe_up_to_shop"
            boolean r1 = r1.equals(r0)
            r0 = 2131970071(0x7f134817, float:1.9577083E38)
            if (r1 != 0) goto L_0x0016
        L_0x0013:
            r0 = 2131969839(0x7f13472f, float:1.9576612E38)
        L_0x0016:
            X.DbW.A1B(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15340Uaq.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "product_source_selection";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onSearchTextChanged(String str) {
        0qQ.A0B(str, 0);
        C337257fy r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("brandSearchResultProvider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.EhX(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A00 = igdsInlineSearchBox;
        if (igdsInlineSearchBox == null) {
            str = "inlineSearchBox";
        } else {
            igdsInlineSearchBox.A02 = this;
            RecyclerView A0c = JTR.A0c(view, R.id.recycler_view);
            A0c.A15(this.A09);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
            linearLayoutManager.A0v(true);
            A0c.setLayoutManager(linearLayoutManager);
            C15473UdO udO = this.A02;
            if (udO == null) {
                str = "adapter";
            } else {
                A0c.setAdapter(udO);
                C19741Wei wei = this.A04;
                if (wei == null) {
                    str = "networkHelper";
                } else {
                    JTQ.A0y(linearLayoutManager, A0c, wei, C3251771i.A0A);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C15340Uaq uaq, List list) {
        String str;
        C15473UdO udO = uaq.A02;
        if (udO == null) {
            str = "adapter";
        } else {
            0qQ.A0B(list, 0);
            List list2 = udO.A00;
            list2.clear();
            list2.addAll(list);
            udO.A00();
            C20988X8e x8e = uaq.A05;
            if (x8e == null) {
                str = "emptyStateController";
            } else {
                x8e.FKG();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DW7() {
        String str;
        C15473UdO udO = this.A02;
        if (udO == null) {
            str = "adapter";
        } else {
            if (udO.isEmpty()) {
                C19741Wei wei = this.A04;
                if (wei == null) {
                    str = "networkHelper";
                } else if (!wei.isLoading()) {
                    C19741Wei.A00(wei, true);
                    C20988X8e x8e = this.A05;
                    if (x8e == null) {
                        str = "emptyStateController";
                    } else {
                        x8e.FKG();
                    }
                }
            }
            W35 w35 = this.A03;
            if (w35 == null) {
                str = "logger";
            } else {
                w35.A01 = A0D;
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final boolean onBackPressed() {
        if (this.A03 != null) {
            return false;
        }
        DbS.A12();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onSearchCleared(String str) {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        if (igdsInlineSearchBox == null) {
            0qQ.A0F("inlineSearchBox");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igdsInlineSearchBox.A03();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = 2042816333(0x79c2e74d, float:1.2649962E35)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r14 = r19
            r0 = r20
            X.C15340Uaq.super.onCreate(r0)
            android.os.Bundle r0 = r14.requireArguments()
            java.lang.String r4 = "entry_point"
            java.lang.String r3 = r0.getString(r4)
            java.lang.String r2 = "feed_tag_entrypoint"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x002f
            androidx.fragment.app.FragmentActivity r5 = r14.requireActivity()
            X.0eM r2 = r14.A08
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r2 = "product_source_selection"
            X.C324476zN.A0R(r3, r5, r2)
        L_0x002f:
            java.lang.String r2 = "brand_selection_entry_point"
            java.lang.String r2 = r0.getString(r2)
            r14.A07 = r2
            java.lang.String r2 = "surface"
            java.lang.String r2 = r0.getString(r2)
            r6 = 0
            if (r2 == 0) goto L_0x010d
            X.Uxb r12 = X.C16581Uxb.valueOf(r2)
        L_0x0044:
            X.VP8 r11 = r14.A0C
            X.0eM r2 = r14.A08
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r2)
            android.content.Context r8 = r14.requireContext()
            X.0gy r9 = X.AnonymousClass07i.A00(r14)
            java.lang.String r13 = r14.A07
            X.Wei r7 = new X.Wei
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.A04 = r7
            java.lang.Object r9 = r2.getValue()
            android.content.Context r5 = r14.requireContext()
            X.0gy r3 = X.AnonymousClass07i.A00(r14)
            X.2lw r7 = new X.2lw
            r7.<init>(r5, r3, r6)
            r8 = 0
            X.0qQ.A0B(r9, r8)
            r3 = 6
            X.Lwt r6 = new X.Lwt
            r6.<init>(r9, r3)
            X.7g1 r5 = new X.7g1
            r5.<init>()
            X.7eJ r3 = new X.7eJ
            r3.<init>((X.AnonymousClass4D6) r7, (X.C336227eH) r6, (X.C337287g2) r5)
            r14.A01 = r3
            android.content.Context r6 = r14.requireContext()
            X.Wdw r5 = r14.A0A
            X.WcX r3 = new X.WcX
            r3.<init>(r6, r5)
            r14.A05 = r3
            android.content.Context r7 = r14.requireContext()
            X.Vfv r6 = r14.A0B
            X.X8e r5 = r14.A05
            if (r5 == 0) goto L_0x010a
            X.UdO r3 = new X.UdO
            r3.<init>(r7, r14, r5, r6)
            r14.A02 = r3
            java.lang.String r3 = "product_source_override_state"
            android.os.Parcelable r3 = r0.getParcelable(r3)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r3 = (com.instagram.shopping.model.productsource.ProductSourceOverrideState) r3
            r14.A06 = r3
            java.lang.String r3 = "is_tabbed"
            boolean r18 = r0.getBoolean(r3, r8)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r3 = "prior_module_name"
            java.lang.String r15 = r0.getString(r3)
            java.lang.String r16 = r0.getString(r4)
            java.lang.String r3 = "waterfall_id"
            java.lang.String r17 = r0.getString(r3)
            X.W35 r12 = new X.W35
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r14.A03 = r12
            java.lang.String r3 = "initial_tab"
            java.lang.String r3 = r0.getString(r3)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.model.shopping.ProductSource r2 = X.W3U.A00(r0)
            X.Uyv r0 = A0D
            r12.A07(r2, r0, r3)
            X.7fy r0 = r14.A01
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "brandSearchResultProvider"
        L_0x00e6:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ee:
            r0.EcJ(r14)
            X.Wei r2 = r14.A04
            if (r2 != 0) goto L_0x00f8
            java.lang.String r0 = "networkHelper"
            goto L_0x00e6
        L_0x00f8:
            r0 = 1
            X.C19741Wei.A00(r2, r0)
            X.X8e r0 = r14.A05
            if (r0 == 0) goto L_0x010a
            r0.FKG()
            r0 = 373691881(0x164615e9, float:1.6001226E-25)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x010a:
            java.lang.String r0 = "emptyStateController"
            goto L_0x00e6
        L_0x010d:
            r12 = r6
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15340Uaq.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1524531152);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_brand_selection_fragment, viewGroup, false);
        AnonymousClass0fD.A09(558158450, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(82703615);
        super.onDestroy();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        if (igdsInlineSearchBox == null) {
            0qQ.A0F("inlineSearchBox");
            throw AnonymousClass00P.createAndThrow();
        }
        igdsInlineSearchBox.A03();
        AnonymousClass0fD.A09(1353846949, A022);
    }
}
