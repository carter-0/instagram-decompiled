package X;

import android.graphics.RectF;
import android.os.Bundle;

/* renamed from: X.Uv0  reason: case insensitive filesystem */
public final class C16444Uv0 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelDashboardAddToStoryCameraFragment";
    public RectF A00;
    public 28D A01 = 28D.A5J;

    public final String getModuleName() {
        return "reel_dashboard_add_to_story_camera_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-9754885);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AnonymousClass7TH.A07(requireArguments, AnonymousClass000.A00(117));
        this.A00 = (RectF) requireArguments.getParcelable("ReelDashboardAddToStoryCameraFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS");
        AnonymousClass0fD.A09(1779851216, A02);
    }
}
