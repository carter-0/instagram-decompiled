package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessages;
import com.instagram.api.schemas.PrivacyDisclosureInfoImpl;
import com.instagram.api.schemas.SocialProofInfoImpl;
import com.instagram.api.schemas.WhatsAppAttributionInfoImpl;
import java.io.IOException;

/* renamed from: X.548  reason: invalid class name */
public abstract class AnonymousClass548 {
    public static IGCTMessagingAdsInfoDict parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            OnFeedMessages onFeedMessages = null;
            String str2 = null;
            PrivacyDisclosureInfoImpl privacyDisclosureInfoImpl = null;
            String str3 = null;
            String str4 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            SocialProofInfoImpl socialProofInfoImpl = null;
            WhatsAppAttributionInfoImpl whatsAppAttributionInfoImpl = null;
            while (r15.A1J() != 16L.A09) {
                String A0q = r15.A0q();
                r15.A1J();
                if ("igAdvertiserId".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("isActive".equals(A0q)) {
                    bool = Boolean.valueOf(r15.A0d());
                } else if ("isEligibleForOnFeedMessages".equals(A0q)) {
                    bool2 = Boolean.valueOf(r15.A0d());
                } else if ("model".equals(A0q)) {
                    onFeedMessages = AnonymousClass549.parseFromJson(r15);
                } else if ("pageID".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("privacyDisclosureInfo".equals(A0q)) {
                    privacyDisclosureInfoImpl = AnonymousClass54D.parseFromJson(r15);
                } else if ("responsivenessText".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("secondaryCTASubtitle".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("shouldNavigateToThread".equals(A0q)) {
                    bool3 = Boolean.valueOf(r15.A0d());
                } else if ("shouldTreatLinkStickerAsCTA".equals(A0q)) {
                    bool4 = Boolean.valueOf(r15.A0d());
                } else if ("socialProofInfo".equals(A0q)) {
                    socialProofInfoImpl = AnonymousClass54E.parseFromJson(r15);
                } else if ("whatsaAppAttributionInfo".equals(A0q)) {
                    whatsAppAttributionInfoImpl = AnonymousClass54F.parseFromJson(r15);
                }
                r15.A0z();
            }
            return new IGCTMessagingAdsInfoDict(onFeedMessages, privacyDisclosureInfoImpl, socialProofInfoImpl, whatsAppAttributionInfoImpl, bool, bool2, bool3, bool4, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
