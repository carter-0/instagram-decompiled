package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.iabadscontext.DisclaimerText;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class S29 {
    public final /* synthetic */ C340027ka A00;
    public final /* synthetic */ IABAdsContext A01;
    public final /* synthetic */ UserSession A02;

    public S29(C340027ka r1, IABAdsContext iABAdsContext, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = r1;
        this.A01 = iABAdsContext;
    }

    public final C13864Til A00(String str) {
        C13864Til suJ;
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension;
        if (0qQ.A0K(str, "1302814060304063")) {
            UserSession userSession = this.A02;
            C340027ka r5 = this.A00;
            FragmentActivity activity = r5.getActivity();
            IABAdsContext iABAdsContext = this.A01;
            DisclaimerText disclaimerText = null;
            if (iABAdsContext != null) {
                iABAdsMetaCheckoutPaymentsSDKDataExtension = iABAdsContext.A02;
                Map map = iABAdsContext.A0C;
                if (map != null) {
                    disclaimerText = (DisclaimerText) map.get(RFY.IAB_META_CHECKOUT_METAPAYMENTS_SDK);
                }
            } else {
                iABAdsMetaCheckoutPaymentsSDKDataExtension = null;
            }
            suJ = new C8123QhF(activity, r5, disclaimerText, iABAdsMetaCheckoutPaymentsSDKDataExtension, userSession);
        } else {
            UserSession userSession2 = this.A02;
            C340027ka r1 = this.A00;
            suJ = new C12432SuJ(r1.getActivity(), r1, userSession2);
        }
        return suJ;
    }
}
