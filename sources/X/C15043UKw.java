package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.UKw  reason: case insensitive filesystem */
public final class C15043UKw extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final ProductCardSubtitleType A02;
    public final 0xF A03;
    public final ProductFeedItem A04;
    public final C16675UzB A05;
    public final Uw7 A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15043UKw) {
                C15043UKw uKw = (C15043UKw) obj;
                if (!(0qQ.A0K(this.A04, uKw.A04) && this.A05 == uKw.A05 && this.A07 == uKw.A07 && 0qQ.A0K(this.A0A, uKw.A0A) && 0qQ.A0K(this.A09, uKw.A09) && this.A01 == uKw.A01 && this.A00 == uKw.A00 && 0qQ.A0K(this.A03, uKw.A03) && this.A02 == uKw.A02 && this.A0C == uKw.A0C && 0qQ.A0K(this.A08, uKw.A08) && this.A0F == uKw.A0F && this.A0D == uKw.A0D && this.A0E == uKw.A0E && this.A0B == uKw.A0B && this.A06 == uKw.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String A002;
        int hashCode;
        int A003 = C54732HQn.A00();
        int A0C2 = ((((AnonymousClass7TG.A0C(this.A04) * 31) + A003) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
        Integer num = this.A07;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    A002 = "AT_SHOP_COLLECTION";
                    break;
                case 2:
                    A002 = "CART";
                    break;
                case 3:
                    A002 = "DROP_COLLECTION";
                    break;
                case 4:
                    A002 = "INSTANT_COLLECTION";
                    break;
                case 5:
                    A002 = "SALE_COLLECTION";
                    break;
                case 6:
                    A002 = "SELLER_CURATED_COLLECTION";
                    break;
                case 7:
                    A002 = "WISH_LIST";
                    break;
                case 8:
                    A002 = "RECONSIDERATION_DESTINATION";
                    break;
                case 9:
                    A002 = "DISCOVERY_CHAINING_FEED";
                    break;
                case 10:
                    A002 = "POST_LIVE";
                    break;
                case 11:
                    A002 = "PRODUCT_DETAILS_PAGE";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    A002 = "LIVE_VIEWER";
                    break;
                case 13:
                    A002 = "IGTV_VIEWER";
                    break;
                case 14:
                    A002 = "MORE_PRODUCTS";
                    break;
                case 15:
                    A002 = "PROFILE_SHOP";
                    break;
                case 16:
                    A002 = "BLOKS";
                    break;
                case 17:
                    A002 = "UPCOMING_EVENT_BOTTOM_SHEET";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                    A002 = "UPCOMING_EVENT_POST_LIVE";
                    break;
                case 19:
                    A002 = "FEATURED_PRODUCTS";
                    break;
                case 20:
                    A002 = "VISUAL_SEARCH";
                    break;
                case 21:
                    A002 = "UPCOMING_EVENT_PAGE";
                    break;
                case 22:
                    A002 = AnonymousClass000.A00(2355);
                    break;
                default:
                    A002 = "SHOPPING_HOME";
                    break;
            }
            hashCode = A002.hashCode() + intValue;
        }
        boolean z = this.A0C;
        return (((((((((AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0F, (AnonymousClass7TF.A09(z, (((((((((((((A0C2 + hashCode) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31)) * 31)) + A003) * 31) + A003) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + A003) * 31) + A003) * 31;
    }

    public C15043UKw(ProductCardSubtitleType productCardSubtitleType, 0xF r3, ProductFeedItem productFeedItem, C16675UzB uzB, Uw7 uw7, Integer num, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = productFeedItem;
        this.A05 = uzB;
        this.A07 = num;
        this.A0A = str;
        this.A09 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r3;
        this.A02 = productCardSubtitleType;
        this.A0C = z;
        this.A08 = str3;
        this.A0F = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A0B = z5;
        this.A06 = uw7;
    }
}
