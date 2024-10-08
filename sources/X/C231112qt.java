package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.2qt  reason: invalid class name and case insensitive filesystem */
public final class C231112qt {
    public final int A00;
    public final 0wc A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public static final AndroidLink A00(ProductFeedItem productFeedItem) {
        AndroidLink androidLink;
        1Xj A1c;
        AndroidLink androidLink2;
        1Xj r0 = productFeedItem.A00;
        if (r0 == null || !r0.A5D()) {
            1Xj r02 = productFeedItem.A00;
            if (r02 != null && (androidLink = (AndroidLink) 00k.A0O(r02.A3P(), 0)) != null) {
                return androidLink;
            }
            throw new IllegalStateException(AnonymousClass000.A00(3548));
        }
        1Xj r03 = productFeedItem.A00;
        if (r03 != null && (A1c = r03.A1c(0)) != null && (androidLink2 = (AndroidLink) 00k.A0O(A1c.A3P(), 0)) != null) {
            return androidLink2;
        }
        throw new IllegalStateException(AnonymousClass000.A00(2773));
    }

    public final /* bridge */ /* synthetic */ C18061Vkn A02(ProductFeedItem productFeedItem, int i, int i2) {
        0qQ.A0B(productFeedItem, 0);
        return new C18061Vkn(productFeedItem, productFeedItem.A02, this, i, i2);
    }

    public final void A03(Product product, String str) {
        String str2;
        boolean z;
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "instagram_shopping_product_action");
        A002.A9F("product_id", Long.valueOf(Long.parseLong(product.A0H)));
        User user = product.A0B;
        if (user != null) {
            str2 = AnonymousClass3ZA.A00(user);
        } else {
            str2 = null;
        }
        A002.AAE(C263944Ny.A00(str2), "merchant_id");
        A002.AAJ("action", str);
        A002.A7p("is_checkout_enabled", Boolean.valueOf(product.A04()));
        ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
        if (productCheckoutProperties != null) {
            z = 0qQ.A0K(productCheckoutProperties.A02, true);
        } else {
            z = false;
        }
        A002.A7p("can_add_to_bag", Boolean.valueOf(z));
        A002.AAJ("shopping_session_id", this.A0D);
        A002.AAJ("prior_submodule", this.A08);
        A002.AAJ("prior_module", this.A07);
        A002.Cgf();
    }

    public final void A04(Product product, String str, int i, int i2) {
        String str2;
        0qQ.A0B(str, 3);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "instagram_shopping_product_card_dismiss");
        if (A002.isSampled()) {
            User user = product.A0B;
            if (user != null) {
                str2 = AnonymousClass3ZA.A00(user);
            } else {
                str2 = null;
            }
            A002.AAE(C263944Ny.A00(str2), "merchant_id");
            A002.A9F("product_id", Long.valueOf(Long.parseLong(product.A0H)));
            A002.A7p("is_checkout_enabled", Boolean.valueOf(product.A04()));
            A002.AAJ("position", C320166rs.A01(i, i2));
            A002.AAJ("prior_module", this.A07);
            A002.AAJ("prior_submodule", this.A08);
            A002.AAJ("submodule", str);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.AAJ("shopping_session_id", this.A0D);
            A002.Cgf();
        }
    }

    public /* synthetic */ C231112qt(AnonymousClass0iw r4, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        0wc A012 = AnonymousClass0kN.A01(r4, userSession);
        String A0I = C231122qu.A0I(userSession, str2);
        0qQ.A0B(A012, 25);
        this.A02 = userSession;
        this.A0D = str;
        this.A05 = str2;
        this.A0A = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A04 = str6;
        this.A06 = str7;
        this.A00 = i;
        this.A09 = str8;
        this.A0B = str9;
        this.A0C = str10;
        this.A03 = str11;
        this.A01 = A012;
        this.A0E = A0I;
    }

    public static final boolean A01(ProductFeedItem productFeedItem) {
        1Xj r0;
        if (productFeedItem.A02() == null && (r0 = productFeedItem.A00) != null && r0.CcK()) {
            return true;
        }
        return false;
    }
}
