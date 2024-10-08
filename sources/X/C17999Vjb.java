package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vjb  reason: case insensitive filesystem */
public final class C17999Vjb {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final ShoppingTaggingFeedArguments A02;
    public final AnonymousClass0eM A03 = C20693WxP.A00(this, 11);
    public final AnonymousClass0eM A04 = C20693WxP.A00(this, 12);

    public final void A01(C61062Jw0 jw0, String str, Map map) {
        ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = this.A02;
        0Aj A05 = C13992Tns.A05((0wc) this.A03.getValue(), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_complete");
        C13992Tns.A0g(A05, jw0);
        A05.A9H("selected_product_merchant_ids", map);
        A05.AAJ("selected_collection_id", str);
        C13991Tnr.A13(A05, shoppingTaggingFeedArguments);
    }

    public C17999Vjb(AnonymousClass0iw r2, UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments) {
        AnonymousClass7TG.A1P(userSession, shoppingTaggingFeedArguments);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = shoppingTaggingFeedArguments;
    }

    public final void A00(C61062Jw0 jw0, ProductAffiliateInformationDict productAffiliateInformationDict, C15035UKo uKo, String str, String str2, String str3, String str4, String str5) {
        C263944Ny r4;
        String str6;
        String str7;
        String AaC;
        TextWithEntities textWithEntities;
        C16573UxQ uxQ;
        AnonymousClass7TG.A1N(str, jw0);
        ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = this.A02;
        0Aj A05 = C13992Tns.A05((0wc) this.A03.getValue(), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_component_interaction");
        C13992Tns.A0g(A05, jw0);
        A05.AAJ(C66579MXk.A00(113), str);
        String str8 = jw0.A02;
        List list = null;
        if (str8 != null) {
            r4 = new C263944Ny(Long.valueOf(DbZ.A07(str8)));
        } else {
            r4 = null;
        }
        A05.AAE(r4, "merchant_id");
        if (uKo == null || (uxQ = uKo.A06) == null) {
            str6 = null;
        } else {
            str6 = uxQ.A00;
        }
        A05.AAJ("behavior", str6);
        if (uKo == null || (textWithEntities = uKo.A03) == null) {
            str7 = null;
        } else {
            str7 = textWithEntities.A02;
        }
        A05.AAJ("component_primary_text", str7);
        A05.AAJ("target_type", str2);
        A05.AAJ("target_id", str3);
        if (!(productAffiliateInformationDict == null || (AaC = productAffiliateInformationDict.AaC()) == null)) {
            0bb r42 = new 0bb();
            r42.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(JTR.A0M(AaC)));
            r42.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "affiliate");
            list = AnonymousClass7TE.A1I(r42);
        }
        A05.AAe("campaign_info", list);
        A05.AAJ("multi_selection_type", str4);
        A05.AAJ("search_text", str5);
        C13991Tnr.A13(A05, shoppingTaggingFeedArguments);
    }
}
