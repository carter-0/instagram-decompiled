package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class UZ5 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteMessagingAppsMultiDestinationBottomSheet";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "promote_messaging_apps_multi_destination_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.ctx_multi_destination_bottom_sheet_layout);
        DbT.A18(requireActivity(), AnonymousClass7TG.A0R(A0G, R.id.ctx_multi_destination_bottom_sheet_title), 2131957210);
        A00(A0G, R.id.engage_row, 2131957212, 2131957211, R.drawable.instagram_direct_pano_outline_24);
        A00(A0G, R.id.maximize_performance_row, 2131957214, 2131957213, R.drawable.instagram_promote_pano_outline_24);
        A00(A0G, R.id.simplify_ad_setup_row, 2131957216, 2131957215, R.drawable.instagram_app_imessage_pano_outline_24);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public static final void A00(View view, int i, int i2, int i3, int i4) {
        View A0G = AnonymousClass7TF.A0G(view, i);
        AnonymousClass7TE.A0d(A0G, R.id.primary_text).setText(i2);
        AnonymousClass7TE.A0d(A0G, R.id.secondary_text).setText(i3);
        DbS.A0G(A0G, R.id.row_icon).setImageResource(i4);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1566218730);
        UZ5.super.onCreate(bundle);
        AnonymousClass0fD.A09(-112224291, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-864264729);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_messaging_apps_multi_destination_bottom_sheet_view, viewGroup, false);
        AnonymousClass0fD.A09(-1317047243, A02);
        return inflate;
    }
}
