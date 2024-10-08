package X;

import android.os.Bundle;
import android.view.View;

public final class FV2 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "RecommendToFacebookOptimizedUpsellFragment$Companion";

    public final String getModuleName() {
        return "recommend_to_facebook_optimization_upsell";
    }

    public static final C47425E1t A00(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, FBQ fbq, C62320sa r6) {
        Bundle A00 = FBQ.A00(fbq);
        A00.putString("ARG_DESIGN_VARIANT", fbq.A04);
        A00.putInt("ARG_NUX_ATTEMPT_QPL_INSTANCE_KEY", fbq.A00);
        C47425E1t e1t = new C47425E1t();
        e1t.A00 = onClickListener;
        e1t.A01 = onClickListener2;
        e1t.A04 = r6;
        e1t.setArguments(A00);
        return e1t;
    }
}
