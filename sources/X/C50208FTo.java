package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.FTo  reason: case insensitive filesystem */
public final class C50208FTo implements X3L {
    public final /* synthetic */ C18654Vw9 A00;
    public final /* synthetic */ ContextualFeedFragment A01;

    public C50208FTo(C18654Vw9 vw9, ContextualFeedFragment contextualFeedFragment) {
        this.A01 = contextualFeedFragment;
        this.A00 = vw9;
    }

    public final void CtD() {
        C22338Xzn xzn;
        ContextualFeedFragment contextualFeedFragment = this.A01;
        String str = contextualFeedFragment.A0R;
        if (!(str == null || (xzn = contextualFeedFragment.A07) == null)) {
            xzn.A06(AnonymousClass000.A00(745), "call_to_action", str, (String) null);
            int ordinal = C48739EjO.A00(str).ordinal();
            if (ordinal == 1) {
                String str2 = contextualFeedFragment.A0Q;
                if (str2 != null) {
                    C18138VmE.A00().A09(contextualFeedFragment.requireActivity(), ContextualFeedFragment.A00(contextualFeedFragment), str2);
                }
            } else if (ordinal == 0) {
                2Zg r2 = contextualFeedFragment.mParentFragment;
                if (r2 instanceof 2Zg) {
                    0qQ.A0C(r2, AnonymousClass000.A00(51));
                } else {
                    r2 = contextualFeedFragment.getRootActivity();
                }
                2Zg r22 = r2;
                if (r22 != null) {
                    r22.FLD(new PositionConfig((AnonymousClass57C) null, new CameraConfiguration(C363138jC.A00, AnonymousClass7TE.A1F()), (AnonymousClass3QO) null, "inspiration_hub_create_post", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
                }
            }
        }
        this.A00.A05(false);
    }
}
