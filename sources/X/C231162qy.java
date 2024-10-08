package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductWithMediaImage;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2qy  reason: invalid class name and case insensitive filesystem */
public final class C231162qy implements C231172qz {
    public boolean A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass2r2 A04;
    public final AnonymousClass2r3 A05;
    public final Integer A06;
    public final String A07;

    public C231162qy(Fragment fragment, UserSession userSession, 2el r25, AnonymousClass4DU r26, AnonymousClass57K r27, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        this.A01 = fragment;
        this.A02 = userSession2;
        AnonymousClass4DU r5 = r26;
        this.A03 = r5;
        String str7 = str6;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str5;
        AnonymousClass2r2 r3 = new AnonymousClass2r2(userSession2, r5, r27, str8, str9, str10, str11, str7, str4);
        this.A04 = r3;
        2el r1 = r25;
        this.A05 = new AnonymousClass2r3(userSession2, r1, r3, new C231062qo(userSession2, r5, str10, (String) null, str8, str9, str11, str7, i));
        this.A07 = str10;
        this.A06 = num;
    }

    public final void A9K(User user, int i) {
        0qQ.A0B(user, 0);
        AnonymousClass2r3 r6 = this.A05;
        C229932oe r5 = r6.A01;
        String A002 = AnonymousClass3ZA.A00(user);
        Integer valueOf = Integer.valueOf(i);
        String A003 = AnonymousClass3ZA.A00(user);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(user, valueOf, A003);
        r1.A00(r6.A02);
        r5.A01(r1.A01(), A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.0Ah] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.INT, X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void APZ(X.C268364dG r9, int r10) {
        /*
            r8 = this;
            r7 = 0
            X.2r2 r4 = r8.A04
            X.4DU r0 = r8.A03
            com.instagram.common.session.UserSession r6 = r8.A02
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r6)
            r0 = 3379(0xd33, float:4.735E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r2.A00
            X.0Aj r3 = r2.A00(r0, r1)
            X.X9B r0 = r9.Aif()
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x0038
            X.X9B r0 = r9.Aif()
            if (r0 == 0) goto L_0x0034
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
        L_0x0034:
            X.4Ny r1 = X.C263944Ny.A00(r1)
        L_0x0038:
            java.lang.String r0 = "merchant_id"
            r3.AAE(r1, r0)
            X.UFu r2 = new X.UFu
            r2.<init>()
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "chaining_session_id"
            r2.A06(r0, r1)
            long r0 = (long) r10
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "chaining_position"
            r2.A05(r0, r1)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "m_pk"
            r2.A06(r0, r1)
            java.lang.String r0 = "parent_m_pk"
            r2.A06(r0, r1)
            java.lang.String r1 = r9.A08
            java.lang.String r0 = "source_media_type"
            r2.A06(r0, r1)
            java.lang.String r0 = "pivots_logging_info"
            r3.AAK(r2, r0)
            X.327 r2 = new X.327
            r2.<init>()
            java.lang.String r1 = r4.A03
            java.lang.String r0 = "shopping_session_id"
            r2.A06(r0, r1)
            X.UxV r0 = r9.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "submodule"
            r2.A06(r0, r1)
            java.lang.String r0 = "navigation_info"
            r3.AAK(r2, r0)
            r3.Cgf()
            X.Vgs r5 = X.C17054VGc.A00(r6)
            long r1 = r5.A00
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            X.1QP r3 = r5.A01
            r0 = 2193(0x891, float:3.073E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.flowMarkPoint(r1, r0)
            r5.A00()
        L_0x00a2:
            r8.A00 = r7
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r6)
            X.INT r0 = new X.INT
            r0.<init>()
            r0.A00 = r9
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231162qy.APZ(X.4dG, int):void");
    }

    public final void EBo(View view, User user) {
        0qQ.A0B(view, 0);
        0qQ.A0B(user, 1);
        AnonymousClass2r3 r2 = this.A05;
        r2.A00.A05(view, r2.A01.A00(AnonymousClass3ZA.A00(user)));
    }

    public final void FJ0(View view) {
        C17054VGc.A00(this.A02).A00();
        this.A00 = false;
        this.A05.A00.A04(view);
    }

    public final void A9L(VPV vpv, Integer num) {
        AnonymousClass2r3 r4 = this.A05;
        C229932oe r3 = r4.A01;
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(vpv, num, "merchant_hscroll_impression");
        r1.A00(r4.A03);
        r3.A01(r1.A01(), "merchant_hscroll_impression");
    }

    public final void DRO(ShoppingBrandWithProducts shoppingBrandWithProducts, String str, int i) {
        String str2;
        String str3 = str;
        AnonymousClass2r2 r3 = this.A04;
        User CCd = shoppingBrandWithProducts.CCd();
        0qQ.A0B(CCd, 0);
        0wc r2 = r3.A00;
        0Aj A002 = r2.A00(r2.A00, "instagram_shopping_merchant_hscroll_tile_tap");
        if (A002.isSampled()) {
            A002.AAE(C263944Ny.A00(AnonymousClass3ZA.A00(CCd)), "merchant_id");
            int i2 = i;
            A002.A9F("position", Long.valueOf((long) i2));
            A002.AAK(AnonymousClass2r2.A01(r3), "navigation_info");
            A002.AAK(AnonymousClass2r2.A00(r3, Integer.valueOf(i2)), "collections_logging_info");
            A002.Cgf();
        }
        UserSession userSession = this.A02;
        C17839Vgs A003 = C17054VGc.A00(userSession);
        long j = A003.A00;
        if (j > 0) {
            1QP r5 = A003.A01;
            r5.flowMarkPoint(j, "VISIT_STOREFRONT");
            r5.flowEndSuccess(A003.A00);
            A003.A00 = 0;
        }
        User CCd2 = shoppingBrandWithProducts.CCd();
        C249713kF r4 = C249713kF.A00;
        FragmentActivity requireActivity = this.A01.requireActivity();
        AnonymousClass4DU r8 = this.A03;
        String str4 = this.A07;
        if (str == null) {
            switch (this.A06.intValue()) {
                case 1:
                    str3 = "profile_pivot";
                    break;
                case 2:
                    str3 = "shopping_bag_merchant_hscroll";
                    break;
                default:
                    str3 = AnonymousClass000.A00(5239);
                    break;
            }
        }
        if (CCd2 != null) {
            str2 = AnonymousClass3ZA.A00(CCd2);
        } else {
            str2 = null;
        }
        0qQ.A0A(str2);
        String username = CCd2.A03.getUsername();
        0qQ.A0A(username);
        W2P A0N = r4.A0N(requireActivity, CCd2.A03.BsB(), userSession, r8, str4, (String) null, str3, str2, username);
        A0N.A06((String) null, (String) null, (String) null, (String) null, (String) null);
        List<ProductWithMediaImage> unmodifiableList = Collections.unmodifiableList(shoppingBrandWithProducts.BgX());
        if (unmodifiableList != null) {
            ArrayList arrayList = new ArrayList();
            for (ProductWithMediaImage BSv : unmodifiableList) {
                arrayList.add(C14502TxO.A00(BSv.BSv()).A0H);
            }
            A0N.A0H = arrayList;
        }
        A0N.A05();
    }

    public final void EBp(View view, String str) {
        if (str != null && !this.A00) {
            this.A00 = true;
            C17839Vgs A002 = C17054VGc.A00(this.A02);
            1QP r3 = A002.A01;
            long flowStartForMarker = r3.flowStartForMarker(37371407, "explore_pivots", false);
            A002.A00 = flowStartForMarker;
            r3.flowAnnotate(flowStartForMarker, "pivot_type", str);
        }
        AnonymousClass2r3 r2 = this.A05;
        r2.A00.A05(view, r2.A01.A00("merchant_hscroll_impression"));
    }
}
