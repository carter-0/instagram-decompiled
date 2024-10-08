package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;

/* renamed from: X.Uam  reason: case insensitive filesystem */
public final class C15337Uam extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ShoppingTaggingFeedFragment";
    public int A00;
    public 2dZ A01;
    public IgdsInlineSearchBox A02;
    public RecyclerView A03;
    public final VPD A04;
    public final VPE A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C20689WxL.A00(this, 48);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = C13999To1.A00(this, 1);
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = C13999To1.A00(this, 3);
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final UB1 A0G;
    public final AnonymousClass3E6 A0H;
    public final G77 A0I;
    public final AnonymousClass0eM A0J;

    public final String getModuleName() {
        return "instagram_shopping_tagging_feed";
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
        RecyclerView A0K = DbX.A0K(view);
        A0K.setAdapter(((C17781Vfs) this.A06.getValue()).A00);
        DbU.A15(requireContext(), A0K, 1, false);
        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
        r0.A00 = false;
        A0K.setItemAnimator(r0);
        A0K.A15(this.A0G);
        this.A03 = A0K;
        C3251871j r6 = new C3251871j(A0K.A0D, new WWL(this, 13), C3251771i.A0B, false, false);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.A15(r6);
            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
            igdsInlineSearchBox.A02 = this.A0I;
            igdsInlineSearchBox.setImeOptions(6);
            this.A02 = igdsInlineSearchBox;
            this.A01 = 2dY.A01(new WB0(this, 1), DbX.A0I(view, R.id.action_bar_container));
            2el r4 = (2el) this.A0F.getValue();
            AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 != null) {
                r4.A08(recyclerView2, A002, new AnonymousClass2eo[0]);
                DbV.A1F(getViewLifecycleOwner(), A01(this).A00, new C20785Wyw(this, 5), 51);
                DbV.A0J(this).A00(new MG4(this, (AnonymousClass4D7) null, 41));
                DbV.A0J(this).A00(new MG4(this, (AnonymousClass4D7) null, 42));
                C13989Tnp.A1S(this, DbV.A0J(this), 43);
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final C60233Jhq A01(C15337Uam uam) {
        return (C60233Jhq) uam.A0J.getValue();
    }

    public static final void A03(C15337Uam uam, C14784U8u u8u, C60233Jhq jhq) {
        boolean z;
        ShoppingTaggingFeedHeader shoppingTaggingFeedHeader;
        2dZ r3 = uam.A01;
        if (r3 == null) {
            0qQ.A0F("actionBarService");
            throw AnonymousClass00P.createAndThrow();
        }
        ULE ule = (ULE) jhq.A00.A02();
        if (ule == null || (shoppingTaggingFeedHeader = ule.A01) == null) {
            z = false;
        } else {
            z = shoppingTaggingFeedHeader.A05;
        }
        r3.Eiy(A02(uam, u8u, z), new WB0(uam, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (((com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r11.A07.getValue()).A06 == null) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C15337Uam r11, boolean r12) {
        /*
            X.0eM r1 = r11.A0B
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = X.C14784U8u.A00(r1)
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.util.Map r0 = r0.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0031
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = X.C14784U8u.A00(r1)
            X.0qQ.A0B(r0, r2)
            java.util.Map r0 = r0.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0031
            X.0eM r0 = r11.A07
            java.lang.Object r0 = r0.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r0 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r0
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = r0.A06
            if (r0 == 0) goto L_0x00df
        L_0x0031:
            if (r12 != 0) goto L_0x00df
            X.ULE r0 = X.C13991Tnr.A0U(r11)
            r6 = 0
            if (r0 == 0) goto L_0x0065
            X.Jw0 r4 = r0.A00
            if (r4 == 0) goto L_0x0065
            X.0eM r0 = r11.A09
            java.lang.Object r3 = r0.getValue()
            X.Vjb r3 = (X.C17999Vjb) r3
            java.lang.Object r0 = r1.getValue()
            X.U8u r0 = (X.C14784U8u) r0
            com.instagram.user.model.ProductCollection r0 = r0.A01()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r2 = r0.Aoi()
        L_0x0056:
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = X.C14784U8u.A00(r1)
            java.util.List r0 = X.C64032LJw.A00(r0)
            java.util.Map r0 = X.C294165ly.A0D(r0)
            r3.A01(r4, r2, r0)
        L_0x0065:
            X.0eM r0 = r11.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Liw r4 = X.C17053VGb.A00(r0)
            r10 = 1
            X.ULE r0 = X.C13991Tnr.A0U(r11)
            if (r0 == 0) goto L_0x0082
            X.Jw0 r0 = r0.A00
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r0.A01
            com.instagram.shopping.model.taggingfeed.SourceType r0 = (com.instagram.shopping.model.taggingfeed.SourceType) r0
            if (r0 == 0) goto L_0x0082
            java.lang.String r6 = r0.A00
        L_0x0082:
            r5 = 0
            r7 = r5
            r8 = r5
            r9 = r5
            r4.A04(r5, r6, r7, r8, r9, r10)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = X.C14784U8u.A00(r1)
            java.util.List r4 = X.C64032LJw.A00(r0)
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = X.C14784U8u.A00(r1)
            java.util.Map r2 = r0.A03
            java.lang.Object r0 = r1.getValue()
            X.U8u r0 = (X.C14784U8u) r0
            com.instagram.user.model.ProductCollection r0 = r0.A01()
            com.instagram.shopping.intf.productpicker.MultiProductPickerResult r1 = new com.instagram.shopping.intf.productpicker.MultiProductPickerResult
            r1.<init>(r5, r0, r4, r2)
            r0 = 83
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r1)
            X.0eM r2 = r11.A07
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r1 = A00(r2)
            r0 = 3978(0xf8a, float:5.574E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r1)
            java.lang.Object r0 = r2.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r0 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r0
            java.lang.String r1 = r0.A0E
            java.lang.String r0 = "tagging_info_id"
            r3.putExtra(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r11.requireActivity()
            r0 = -1
        L_0x00d5:
            r1.setResult(r0, r3)
            X.DbT.A1K(r11)
            return
        L_0x00dc:
            r2 = r6
            goto L_0x0056
        L_0x00df:
            X.0eM r0 = r11.A09
            java.lang.Object r1 = r0.getValue()
            X.Vjb r1 = (X.C17999Vjb) r1
            X.ULE r0 = X.C13991Tnr.A0U(r11)
            if (r0 == 0) goto L_0x014f
            X.Jw0 r5 = r0.A00
        L_0x00ef:
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r4 = r1.A02
            X.0eM r0 = r1.A03
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "instagram_shopping_product_tagging_feed_cancel"
            X.0Aj r3 = X.C13992Tns.A05(r1, r4, r0)
            r1 = 0
            if (r5 == 0) goto L_0x014d
            java.lang.Object r0 = r5.A01
        L_0x0104:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "source_type"
            r3.AAJ(r0, r2)
            if (r5 == 0) goto L_0x014b
            java.lang.String r2 = r5.A03
        L_0x0111:
            java.lang.String r0 = "source_id"
            r3.AAJ(r0, r2)
            if (r5 == 0) goto L_0x011a
            java.lang.String r1 = r5.A04
        L_0x011a:
            java.lang.String r0 = "source_name"
            r3.AAJ(r0, r1)
            X.C13991Tnr.A13(r3, r4)
            X.0eM r0 = r11.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Liw r1 = X.C17053VGb.A00(r0)
            X.KhR r0 = X.C62535KhR.A03
            r1.A02(r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            X.0eM r0 = r11.A07
            java.lang.Object r0 = r0.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r0 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r0
            java.lang.String r1 = r0.A0E
            java.lang.String r0 = "tagging_info_id"
            r3.putExtra(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r11.requireActivity()
            r0 = 0
            goto L_0x00d5
        L_0x014b:
            r2 = r1
            goto L_0x0111
        L_0x014d:
            r0 = r1
            goto L_0x0104
        L_0x014f:
            r5 = 0
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15337Uam.A05(X.Uam, boolean):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean onBackPressed() {
        C64834Liw A002 = C17053VGb.A00(AnonymousClass7TE.A0l(this.A0C));
        C62535KhR khR = C62535KhR.A03;
        if (A002.A00.containsKey(khR) && A002.A00.containsKey(khR)) {
            A002.A01.flowMarkPoint(C64834Liw.A00(khR, A002), "shopping_creation_navigate_back", (String) null);
        }
        if (!((ShoppingTaggingFeedArguments) this.A07.getValue()).A0I) {
            return false;
        }
        A05(this, true);
        return true;
    }

    public C15337Uam() {
        C13999To1 to1 = new C13999To1(this, 7);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C13999To1(new C13999To1(this, 4), 5));
        this.A0J = new C227862kA(new C13999To1(A002, 6), to1, new C20613Wvu(39, A002, (Object) null), new 0Yh(C60233Jhq.class));
        this.A0F = AnonymousClass0eN.A01(C20666Wwy.A00);
        this.A0E = AnonymousClass1YB.A00(new C13999To1(this, 8));
        this.A0B = C13999To1.A00(this, 2);
        this.A06 = C20689WxL.A00(this, 47);
        this.A0I = new WY1(this, 7);
        this.A0G = new UB1(this, 22);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        A012.A9Y(new WTW(this, 7));
        this.A0H = A012;
        this.A04 = new VPD(this);
        this.A05 = new VPE(this);
        this.A08 = C20689WxL.A00(this, 49);
        this.A09 = C13999To1.A00(this, 0);
        this.A0C = C227642jf.A02(this);
    }

    public static TaggingFeedSessionInformation A00(AnonymousClass0eM r3) {
        return new TaggingFeedSessionInformation(((ShoppingTaggingFeedArguments) r3.getValue()).A0G, ((ShoppingTaggingFeedArguments) r3.getValue()).A0F);
    }

    public static final String A02(C15337Uam uam, C14784U8u u8u, boolean z) {
        int size;
        String A0d = AnonymousClass7TF.A0d(DbV.A05(uam), 2131960992);
        if (u8u.A01() != null) {
            size = 1;
        } else {
            size = C64032LJw.A00((TaggingFeedMultiSelectState) u8u.A04.getValue()).size();
            if (size <= 0) {
                return A0d;
            }
        }
        if (!z) {
            return A0d;
        }
        StringBuilder A0n = AnonymousClass7TF.A0n(A0d);
        A0n.append(" (");
        return C51975G9x.A0j(A0n, size);
    }

    public static final void A04(C15337Uam uam, String str) {
        C310336ap A0X = DbV.A0X();
        A0X.A0H = "shopping_tagging_error";
        A0X.A0D = str;
        A0X.A02 = uam.A00;
        DbY.A1K(1xC.A01, A0X);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1138111856);
        C15337Uam.super.onCreate(bundle);
        A01(this).A00("", true, (String) null);
        if (((ShoppingTaggingFeedArguments) this.A07.getValue()).A0I) {
            C17999Vjb vjb = (C17999Vjb) this.A09.getValue();
            ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = vjb.A02;
            0Aj A052 = C13992Tns.A05((0wc) vjb.A03.getValue(), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_entry");
            A052.AAJ("source_id", shoppingTaggingFeedArguments.A0C);
            A052.AAJ("source_type", shoppingTaggingFeedArguments.A0D);
            A052.AAK((0bb) vjb.A04.getValue(), "suggested_tags_info");
            C13991Tnr.A13(A052, shoppingTaggingFeedArguments);
        }
        AnonymousClass0fD.A09(743940529, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-252295730);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.shopping_tagging_feed_fragment, false);
        AnonymousClass0fD.A09(-1051248092, A022);
        return A0D2;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2036988985);
        C15337Uam.super.onPause();
        this.A0H.onStop();
        AnonymousClass0fD.A09(-222561253, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-819895980);
        super.onResume();
        JTP.A17(this, this.A0H);
        AnonymousClass0fD.A09(504209033, A022);
    }
}
