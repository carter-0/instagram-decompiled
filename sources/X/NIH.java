package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NIH extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DiscoverTrendingPromptsInfoBottomSheet";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "discover_trending_prompts_info_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1731828896);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.discover_trending_prompts_bottom_sheet, false);
        AnonymousClass0fD.A09(-1423743453, A02);
        return A0D;
    }
}
