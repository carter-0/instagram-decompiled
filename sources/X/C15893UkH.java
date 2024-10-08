package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.util.List;

/* renamed from: X.UkH  reason: case insensitive filesystem */
public final class C15893UkH extends C230372pW {
    public final C17999Vjb A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C263944Ny r1;
        List list;
        String AaC;
        C17601Vat vat = (C17601Vat) obj;
        0qQ.A0B(vat, 0);
        C17999Vjb vjb = this.A00;
        String str = vat.A02;
        C61062Jw0 jw0 = vat.A00;
        String str2 = vat.A03;
        String str3 = vat.A04;
        ProductAffiliateInformationDict productAffiliateInformationDict = vat.A01;
        String str4 = vat.A05;
        ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = vjb.A02;
        0Aj A05 = C13992Tns.A05((0wc) vjb.A03.getValue(), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_item_impression");
        A05.AAJ("submodule", "");
        A05.AAJ("prior_submodule", (String) null);
        C13992Tns.A0g(A05, jw0);
        String str5 = jw0.A02;
        if (str5 != null) {
            r1 = new C263944Ny(Long.valueOf(DbZ.A07(str5)));
        } else {
            r1 = null;
        }
        A05.AAE(r1, "merchant_id");
        A05.AAJ("target_type", (String) null);
        A05.AAJ("target_id", str4);
        A05.AAJ("position", str2);
        if (productAffiliateInformationDict == null || (AaC = productAffiliateInformationDict.AaC()) == null) {
            list = null;
        } else {
            0bb r7 = new 0bb();
            r7.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(JTR.A0M(AaC)));
            r7.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "affiliate");
            list = AnonymousClass7TE.A1I(r7);
        }
        A05.AAe("campaign_info", list);
        A05.AAJ("sort_and_filters", (String) null);
        A05.AAJ("ranking_id", (String) null);
        A05.AAJ("search_text", str3);
        A05.AAJ(C66579MXk.A00(113), str);
        C13991Tnr.A13(A05, shoppingTaggingFeedArguments);
    }

    public C15893UkH(UserSession userSession, C17999Vjb vjb) {
        super(C13988Tno.A0K(userSession));
        this.A01 = userSession;
        this.A00 = vjb;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
