package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType;
import java.io.IOException;

public abstract class LJL {
    public static IgFundedIncentiveBannerButton parseFromJson(16F r10) {
        String str;
        String str2;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType = null;
            IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("destination".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                    igFundedIncentiveButtonDestinationType = (IgFundedIncentiveButtonDestinationType) IgFundedIncentiveButtonDestinationType.A01.get(str2);
                    if (igFundedIncentiveButtonDestinationType == null) {
                        igFundedIncentiveButtonDestinationType = IgFundedIncentiveButtonDestinationType.UNRECOGNIZED;
                    }
                } else if ("style".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    igFundedIncentiveBannerButtonStyleType = (IgFundedIncentiveBannerButtonStyleType) IgFundedIncentiveBannerButtonStyleType.A01.get(str);
                    if (igFundedIncentiveBannerButtonStyleType == null) {
                        igFundedIncentiveBannerButtonStyleType = IgFundedIncentiveBannerButtonStyleType.UNRECOGNIZED;
                    }
                } else if ("text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (igFundedIncentiveButtonDestinationType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("destination", r10, "IgFundedIncentiveBannerButton");
            } else if (igFundedIncentiveBannerButtonStyleType == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("style", r10, "IgFundedIncentiveBannerButton");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new IgFundedIncentiveBannerButton(igFundedIncentiveBannerButtonStyleType, igFundedIncentiveButtonDestinationType, str3);
            } else {
                AnonymousClass7TF.A1L("text", r10, "IgFundedIncentiveBannerButton");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, IgFundedIncentiveBannerButton igFundedIncentiveBannerButton) {
        r2.A0c();
        IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType = igFundedIncentiveBannerButton.A01;
        if (igFundedIncentiveButtonDestinationType != null) {
            r2.A0R("destination", igFundedIncentiveButtonDestinationType.A00);
        }
        IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType = igFundedIncentiveBannerButton.A00;
        if (igFundedIncentiveBannerButtonStyleType != null) {
            r2.A0R("style", igFundedIncentiveBannerButtonStyleType.A00);
        }
        String str = igFundedIncentiveBannerButton.A02;
        if (str != null) {
            r2.A0R("text", str);
        }
        r2.A0Z();
    }
}
