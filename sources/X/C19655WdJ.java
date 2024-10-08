package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.WdJ  reason: case insensitive filesystem */
public final class C19655WdJ implements XC9 {
    public final UserSession A00;
    public final C231012qj A01;
    public final int A02;
    public final Fragment A03;
    public final AnonymousClass4DU A04;
    public final C231112qt A05;
    public final C231142qw A06;
    public final C231022qk A07;
    public final C231052qn A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final void A9t(ProductFeedItem productFeedItem, C268374dH r4, C17524VZd vZd) {
        String A002;
        0qQ.A0B(productFeedItem, 1);
        C231052qn r1 = this.A08;
        if (r4 instanceof MultiProductComponent) {
            A002 = ((MultiProductComponent) r4).A00();
            0qQ.A0A(A002);
        } else {
            A002 = VH1.A00(this.A01.A00);
        }
        r1.A02(productFeedItem, vZd, A002);
    }

    public final void APY(C268374dH r15, int i) {
        String str;
        String str2 = this.A09;
        C268374dH r9 = r15;
        if (!(str2 == null || (str = this.A0A) == null)) {
            W3r.A0E(this.A00, this.A04, r9, str2, this.A0B, str, i);
        }
        UserSession userSession = this.A00;
        C17839Vgs A002 = C17054VGc.A00(userSession);
        long j = A002.A00;
        if (j > 0) {
            A002.A01.flowMarkPoint(j, AnonymousClass000.A00(2193));
            A002.A00();
        }
        this.A07.A00 = false;
        AnonymousClass1Nd.A00(userSession).A00(new C57065INf(r15));
    }

    public final void DZh(C268374dH r1, X52 x52, Product product, int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XC8, java.lang.Object] */
    public final XC8 Bg8() {
        return new Object();
    }

    public final void DZb(0xF r16, ProductFeedItem productFeedItem, C268374dH r18, String str, String str2, int i, int i2, int i3) {
        String A002;
        FBProductItemDetailsDict A012;
        C268374dH r8 = r18;
        FragmentActivity activity = this.A03.getActivity();
        if (activity != null) {
            ProductFeedItem productFeedItem2 = productFeedItem;
            C18061Vkn A022 = this.A05.A02(productFeedItem2, i, i2);
            A022.A01(r8);
            A022.A02(Integer.valueOf(i3), str2);
            A022.A03(r8.C2K());
            A022.A00();
            UserSession userSession = this.A00;
            C17839Vgs A003 = C17054VGc.A00(userSession);
            long j = A003.A00;
            if (j > 0) {
                1QP r6 = A003.A01;
                r6.flowMarkPoint(j, "VISIT_PDP");
                r6.flowEndSuccess(A003.A00);
                A003.A00 = 0;
            }
            if (r8 instanceof C268364dG) {
                A002 = ((C268364dG) r8).A00();
            } else {
                A002 = AnonymousClass000.A00(782);
            }
            0qQ.A0A(A002);
            ProductTile productTile = productFeedItem2.A02;
            if (productTile == null || (A012 = C18768W0o.A01(productTile)) == null) {
                Product A023 = productFeedItem2.A02();
                if (A023 != null) {
                    C249713kF r82 = C249713kF.A00;
                    AnonymousClass4DU r11 = this.A04;
                    WNN A0L = r82.A0L(activity, userSession, r11, A023, A002, this.A0B);
                    A0L.A0N = r11.getModuleName();
                    WNN.A01(A0L);
                    return;
                }
                return;
            }
            C249713kF.A00.A10(activity, userSession, this.A04, C45683D1i.A00(A012));
        }
    }

    public final void DZj(C268374dH r11, X53 x53, Product product, Integer num, String str, int i, int i2) {
        String A002;
        String A003;
        C19632Wcv wcv = new C19632Wcv(this);
        User user = product.A0B;
        if (user != null && (A002 = AnonymousClass3ZA.A00(user)) != null) {
            C18591Vui vui = new C18591Vui((1Xj) null, this.A06, product, A002);
            if (r11 instanceof MultiProductComponent) {
                A003 = ((MultiProductComponent) r11).A00();
                0qQ.A0A(A003);
            } else {
                A003 = VH1.A00(this.A01.A00);
            }
            vui.A06 = A003;
            vui.A08 = r11.C2K();
            Integer num2 = num;
            vui.A01 = new AnonymousClass9JL(Integer.valueOf(this.A02), num2, this.A0A, r11.Bxn(), str, this.A09);
            vui.A05 = wcv;
            vui.A00();
        }
    }

    public final void EBy(View view, ProductFeedItem productFeedItem, String str) {
        this.A08.A00(view, productFeedItem, str);
    }

    public C19655WdJ(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, C231112qt r5, C231142qw r6, C231012qj r7, C231022qk r8, C231052qn r9, String str, String str2, String str3, int i) {
        AnonymousClass7TG.A1S(r9, r7);
        C13988Tno.A1O(r5, 10, r6);
        this.A07 = r8;
        this.A00 = userSession;
        this.A04 = r4;
        this.A03 = fragment;
        this.A08 = r9;
        this.A01 = r7;
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = i;
    }
}
