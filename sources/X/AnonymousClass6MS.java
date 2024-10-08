package X;

import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6MS  reason: invalid class name */
public abstract class AnonymousClass6MS {
    public static final String A00(ReelCTAIntf reelCTAIntf) {
        String str;
        if (reelCTAIntf != null) {
            str = reelCTAIntf.AtU();
        } else {
            str = null;
        }
        if ("ar_effect".equals(str)) {
            return reelCTAIntf.BXk();
        }
        return null;
    }

    public static final String A01(ReelCTAIntf reelCTAIntf) {
        int A04;
        if (reelCTAIntf == null || reelCTAIntf.B5b() == null) {
            return null;
        }
        String B5b = reelCTAIntf.B5b();
        if (B5b == null || (A04 = 00l.A04(B5b, '_', 0)) == -1) {
            return reelCTAIntf.B5b();
        }
        String B5b2 = reelCTAIntf.B5b();
        if (B5b2 == null) {
            return null;
        }
        String substring = B5b2.substring(0, A04);
        0qQ.A07(substring);
        return substring;
    }

    public static final String A02(ReelCTAIntf reelCTAIntf) {
        List BN4;
        AndroidLink androidLink;
        if (reelCTAIntf == null || (BN4 = reelCTAIntf.BN4()) == null || (androidLink = (AndroidLink) 00k.A0J(BN4)) == null) {
            return null;
        }
        return androidLink.CGH();
    }

    public static final void A03(17Z r3, Product product) {
        r3.A0c();
        r3.A0R("product_id", product.A0H);
        User user = product.A0B;
        String str = null;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        }
        r3.A0R("merchant_id", str);
        ProductAffiliateInformationDict productAffiliateInformationDict = product.A04;
        if (!(productAffiliateInformationDict == null || productAffiliateInformationDict.AaC() == null)) {
            r3.A0R("affiliate_campaign_id", productAffiliateInformationDict.AaC());
        }
        TaggingFeedSessionInformation taggingFeedSessionInformation = product.A00;
        if (taggingFeedSessionInformation != null) {
            r3.A0R("waterfall_id", taggingFeedSessionInformation.A01);
            r3.A0R(C66579MXk.A00(26), taggingFeedSessionInformation.A00);
        }
        r3.A0Z();
    }
}
