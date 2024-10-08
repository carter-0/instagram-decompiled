package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class K4O extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteEditCaptionGuidanceBottomSheet";
    public boolean A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "promote_edit_caption_guidance_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.promote_edit_caption_guidance_bottom_sheet);
        DbU.A1G(AnonymousClass7TG.A0R(A0G, R.id.bottom_sheet_title), this, 2131970663);
        boolean z = this.A00;
        int i = 2131970662;
        int i2 = 2131970661;
        int i3 = R.drawable.instagram_users_pano_outline_24;
        if (z) {
            i = 2131970660;
            i2 = 2131970659;
            i3 = R.drawable.instagram_app_imessage_pano_outline_24;
        }
        A00(A0G, R.id.ask_to_take_action_tip, i, i2, i3);
        A00(A0G, R.id.include_key_info_tip, 2131970668, 2131970667, R.drawable.instagram_key_pano_outline_24);
        A00(A0G, R.id.keep_it_simple_tip, 2131970670, 2131970669, R.drawable.instagram_circle_check_pano_outline_24);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public static final void A00(View view, int i, int i2, int i3, int i4) {
        View A0G = AnonymousClass7TF.A0G(view, i);
        AnonymousClass7TE.A0d(A0G, R.id.primary_text).setText(i2);
        AnonymousClass7TE.A0d(A0G, R.id.secondary_text).setText(i3);
        DbS.A0G(A0G, R.id.row_icon).setImageResource(i4);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1984459809);
        K4O.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 == null || !bundle2.getBoolean("ARGUMENT_IS_MESSAGING_ADS_SELECTED", false)) {
            z = false;
        }
        this.A00 = z;
        AnonymousClass0fD.A09(-536325345, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2006960844);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_edit_caption_guidance_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(923442750, A02);
        return inflate;
    }
}
