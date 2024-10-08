package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.EMw  reason: case insensitive filesystem */
public final class C47919EMw extends E4Z {
    public static final String __redex_internal_original_name = "UserPayBadgesMilestonesIntroFragment";

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2113250597);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.onboarding_intro_info_needed_layout, viewGroup, false);
        A04("impression", "what_you_need", __redex_internal_original_name, (String) null);
        0qQ.A0B(inflate, 0);
        ImageView A0G = DbS.A0G(inflate, R.id.header_icon);
        if (A0G != null) {
            A0G.setImageResource(R.drawable.instagram_creator_experience_assets_badges_onboarding_qp_illustration_android);
        }
        View findViewById = inflate.findViewById(R.id.header_icon);
        if (findViewById != null) {
            findViewById.getLayoutParams().height = 200;
            findViewById.getLayoutParams().width = 200;
        }
        AnonymousClass7TE.A0d(inflate, R.id.title).setText(DbU.A0m(this, 2131976260));
        inflate.findViewById(R.id.description).setVisibility(8);
        E4Z.A01(inflate.findViewById(R.id.item1), DbU.A0m(this, 2131976255), getString(2131976254), R.drawable.instagram_badge_pano_outline_24);
        E4Z.A01(inflate.findViewById(R.id.item2), DbU.A0m(this, 2131976257), getString(2131976256), R.drawable.instagram_money_pano_outline_24);
        E4Z.A01(inflate.findViewById(R.id.item3), DbU.A0m(this, 2131976259), getString(2131976258), R.drawable.instagram_app_instagram_pano_outline_24);
        String A0m = DbU.A0m(this, 2131969157);
        ((C3021461u) inflate.requireViewById(R.id.bottom_button_layout)).setPrimaryAction(A0m, new C50101FOr(A0m, (Object) this, 21));
        AnonymousClass0fD.A09(2049057113, A02);
        return inflate;
    }
}
