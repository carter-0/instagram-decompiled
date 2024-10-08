package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KvG  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63333KvG {
    public static Map A00(IgFundedIncentiveBannerButtonIntf igFundedIncentiveBannerButtonIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (igFundedIncentiveBannerButtonIntf.AwZ() != null) {
            IgFundedIncentiveButtonDestinationType AwZ = igFundedIncentiveBannerButtonIntf.AwZ();
            0qQ.A0B(AwZ, 0);
            A1H.put("destination", AwZ.A00);
        }
        if (igFundedIncentiveBannerButtonIntf.C26() != null) {
            IgFundedIncentiveBannerButtonStyleType C26 = igFundedIncentiveBannerButtonIntf.C26();
            0qQ.A0B(C26, 0);
            A1H.put("style", C26.A00);
        }
        if (igFundedIncentiveBannerButtonIntf.getText() != null) {
            A1H.put("text", igFundedIncentiveBannerButtonIntf.getText());
        }
        return 0Yt.A0B(A1H);
    }
}
