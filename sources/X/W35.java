package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

public final class W35 {
    public ProductSource A00;
    public C16659Uyv A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final AnonymousClass0eM A07 = C20693WxP.A00(this, 10);
    public final boolean A08;

    public W35(UserSession userSession, AnonymousClass4DU r3, String str, String str2, String str3, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = r3;
        this.A08 = z;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
    }

    public static String A01(0Aj r2, W35 w35, String str) {
        C16659Uyv uyv;
        r2.AAJ("selected_source_id", str);
        ProductSource productSource = w35.A00;
        if (productSource == null || (uyv = productSource.A00) == null) {
            return null;
        }
        return uyv.toString();
    }

    public final void A07(ProductSource productSource, C16659Uyv uyv, String str) {
        0qQ.A0B(uyv, 2);
        this.A00 = productSource;
        boolean z = this.A08;
        if (!z) {
            this.A01 = uyv;
        } else if (str != null) {
            C16659Uyv A002 = C17019VEt.A00(str);
            this.A01 = A002;
            if (A002 != uyv) {
                return;
            }
        } else {
            return;
        }
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A07.getValue(), "instagram_shopping_product_source_selection_opened");
        A0e.A7p("has_multiple_source_types", JTP.A0g(A0e, "currently_viewed_source_type", String.valueOf(this.A01), z));
        A02(A0e, this);
        ProductSource productSource2 = this.A00;
        String str2 = null;
        if (productSource2 != null) {
            str2 = productSource2.A01;
        }
        A04(A0e, this, A01(A0e, this, str2));
        C13988Tno.A1C(A0e, this.A05);
        A0e.Cgf();
    }

    public final void A08(C16659Uyv uyv) {
        0qQ.A0B(uyv, 0);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A07.getValue(), "instagram_shopping_product_source_load_start");
        A0e.AAJ("loaded_source_type", uyv.toString());
        String str = this.A05;
        if (str == null) {
            str = "";
        }
        C13988Tno.A1C(A0e, str);
        A02(A0e, this);
        A03(A0e, this);
        ProductSource productSource = this.A00;
        String str2 = null;
        if (productSource != null) {
            str2 = productSource.A01;
        }
        A04(A0e, this, A01(A0e, this, str2));
        A0e.Cgf();
    }

    public final void A09(C16659Uyv uyv, Throwable th) {
        String str;
        String str2;
        C16659Uyv uyv2;
        0qQ.A0B(uyv, 0);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A07.getValue(), "instagram_shopping_product_source_load_failure");
        A0e.AAJ("loaded_source_type", uyv.toString());
        String str3 = this.A05;
        if (str3 == null) {
            str3 = "";
        }
        C13988Tno.A1C(A0e, str3);
        A02(A0e, this);
        A03(A0e, this);
        ProductSource productSource = this.A00;
        String str4 = null;
        if (productSource != null) {
            str = productSource.A01;
        } else {
            str = null;
        }
        A0e.AAJ("selected_source_id", str);
        ProductSource productSource2 = this.A00;
        if (productSource2 == null || (uyv2 = productSource2.A00) == null) {
            str2 = null;
        } else {
            str2 = uyv2.toString();
        }
        A04(A0e, this, str2);
        if (th != null) {
            str4 = th.getMessage();
        }
        A0e.AAJ("error_message", str4);
        A0e.Cgf();
    }

    public final void A0A(C16659Uyv uyv, List list, int i, boolean z) {
        0qQ.A0B(uyv, 0);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A07.getValue(), "instagram_shopping_product_source_load_success");
        A02(A0e, this);
        A0e.AAJ("loaded_source_type", uyv.toString());
        String str = this.A05;
        if (str == null) {
            str = "";
        }
        C13988Tno.A1C(A0e, str);
        A03(A0e, this);
        ProductSource productSource = this.A00;
        String str2 = null;
        if (productSource != null) {
            str2 = productSource.A01;
        }
        A04(A0e, this, A01(A0e, this, str2));
        A0e.AAe("sources", list);
        A0e.A9F("result_count", Long.valueOf((long) i));
        A0e.A7p("has_more_results", Boolean.valueOf(z));
        A0e.Cgf();
    }

    public static final 0xI A00(W35 w35, String str) {
        C254523sc r1 = new C254523sc(w35.A03, 002.A0g("instagram_shopping", "_", str));
        r1.A6S = w35.A05;
        return r1.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A01 == X.C16659Uyv.BRAND) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.0Aj r3, X.W35 r4) {
        /*
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x000b
            X.Uyv r2 = r4.A01
            X.Uyv r1 = X.C16659Uyv.BRAND
            r0 = 0
            if (r2 != r1) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_influencer"
            r3.A7p(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W35.A02(X.0Aj, X.W35):void");
    }

    public static void A03(0Aj r2, W35 w35) {
        r2.AAJ("currently_viewed_source_type", String.valueOf(w35.A01));
        r2.A7p("has_multiple_source_types", Boolean.valueOf(w35.A08));
    }

    public static void A04(0Aj r2, W35 w35, String str) {
        r2.AAJ("selected_source_type", str);
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, w35.A04);
        r2.AAJ("waterfall_id", w35.A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r4.A01 == X.C16659Uyv.BRAND) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.0xI r3, X.W35 r4) {
        /*
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "waterfall_id"
            if (r1 == 0) goto L_0x0009
            r3.A0C(r0, r1)
        L_0x0009:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "entry_point"
            if (r1 == 0) goto L_0x0012
            r3.A0C(r0, r1)
        L_0x0012:
            boolean r2 = r4.A08
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "has_multiple_source_types"
            r3.A09(r0, r1)
            X.Uyv r0 = r4.A01
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "currently_viewed_source_type"
            r3.A0C(r0, r1)
        L_0x002a:
            com.instagram.model.shopping.ProductSource r0 = r4.A00
            if (r0 == 0) goto L_0x0045
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "selected_source_id"
            r3.A0C(r0, r1)
            com.instagram.model.shopping.ProductSource r0 = r4.A00
            X.0qQ.A0A(r0)
            X.Uyv r0 = r0.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "selected_source_type"
            r3.A0C(r0, r1)
        L_0x0045:
            if (r2 != 0) goto L_0x004e
            X.Uyv r2 = r4.A01
            X.Uyv r1 = X.C16659Uyv.BRAND
            r0 = 0
            if (r2 != r1) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_influencer"
            r3.A09(r0, r1)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.DbU.A1R(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W35.A05(X.0xI, X.W35):void");
    }

    public final void A06(ProductSource productSource) {
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A07.getValue(), "instagram_shopping_product_source_selected");
        String str = productSource.A01;
        0qQ.A0A(str);
        A0e.AAJ("selected_source_id", str);
        String str2 = productSource.A04;
        0qQ.A0A(str2);
        A0e.AAJ("selected_source_name", str2);
        A0e.AAJ("selected_source_type", productSource.A00.toString());
        C13988Tno.A1C(A0e, this.A05);
        A0e.AAJ("waterfall_id", this.A06);
        A0e.Cgf();
    }
}
