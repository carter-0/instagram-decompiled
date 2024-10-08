package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.UYi  reason: case insensitive filesystem */
public final class C15268UYi extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MentionPrivacySettingBottomSheetFragment";
    public C17340VRt A00;
    public IgdsSwitch A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "mention_privacy_setting_bottomsheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(158215349);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_mentions_privacy_setting_bottomsheet, viewGroup, false);
        TextView A0G = DbU.A0G(inflate, R.id.row_simple_text_textview);
        DbT.A18(A0G.getContext(), A0G, 2131952911);
        TextView A0G2 = DbU.A0G(inflate, R.id.row_simple_text_detail);
        A0G2.setVisibility(0);
        DbT.A18(A0G2.getContext(), A0G2, 2131966125);
        this.A01 = (IgdsSwitch) inflate.requireViewById(R.id.row_menu_item_switch);
        C3021461u r2 = (C3021461u) inflate.requireViewById(R.id.mention_privacy_setting_button_group);
        r2.setPrimaryActionOnClickListener(new WB8((Object) this, 28));
        r2.setSecondaryActionOnClickListener(new WB8((Object) this, 29));
        AnonymousClass0fD.A09(-1658454602, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1515315208);
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass0fD.A09(276774641, A022);
    }
}
