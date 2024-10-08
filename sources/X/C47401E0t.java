package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E0t  reason: case insensitive filesystem */
public final class C47401E0t extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ImmersiveAvatarEntrypointProfileBottomSheetFragment";
    public final AnonymousClass0eM A00 = DbS.A0I(C51799G2i.A00(this, 45), C51799G2i.A00(this, 44), new MMX(26, (Object) null, (Object) this), DbS.A0z(DdZ.class));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "immersive_avatar_entrypoint_profile_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImageView A0J = DbX.A0J(view, R.id.row_icon);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.row_label);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass7TF.A0F(view, R.id.coin_flip_switch);
        DbU.A13(requireContext(), A0J, R.drawable.instagram_eye_pano_outline_24);
        DbU.A1A(DbV.A05(this), A0R, 2131953452);
        compoundButton.setChecked(requireArguments().getBoolean("coin_flip_enabled"));
        FQO.A00(compoundButton, this, 1);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(163469071);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_immersive_home_profile_bottom_sheet_item, viewGroup, false);
        AnonymousClass0fD.A09(138718520, A02);
        return inflate;
    }
}
