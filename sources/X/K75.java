package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class K75 extends AnonymousClass4DH implements MXF {
    public static final String __redex_internal_original_name = "MediaKitMenuSheetFragment";
    public C331157Pu A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(MML.A00(this, 35), MML.A00(this, 36), MMW.A00((Object) null, this, 3), DbS.A0z(C60327JjW.class));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(MML.A00(this, 34));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64127LPb.A01(this, AnonymousClass05K.A02);
        C61221JzE jzE = (C61221JzE) JTT.A0a(this.A02).A0M.getValue();
        int i = 1;
        int i2 = 0;
        if (jzE == null || jzE.A00 != MediaKitVisibility.PUBLIC) {
            i = 0;
        }
        AnonymousClass7TF.A0G(view, R.id.mk_option_private_visibility_message).setVisibility(DbW.A01(i ^ 1));
        View A0G = AnonymousClass7TF.A0G(view, R.id.mk_share_actions_view);
        if (i == 0) {
            i2 = 8;
        }
        A0G.setVisibility(i2);
        C64128LPc.A01(AnonymousClass7TF.A0G(view, R.id.mk_share_action_direct), MML.A00(this, 31));
        C64128LPc.A01(AnonymousClass7TF.A0G(view, R.id.mk_share_action_share), MML.A00(this, 32));
        C64128LPc.A01(AnonymousClass7TF.A0G(view, R.id.mk_share_action_link), MML.A00(this, 33));
        LY6.A01(view.requireViewById(R.id.mk_option_edit_media_kit), 45, this);
        LY6.A01(view.requireViewById(R.id.mk_option_visibility_media_kit), 46, this);
        int color = requireContext().getColor(2Yu.A03(view.getContext()));
        IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.mk_option_delete_media_kit);
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_delete_pano_outline_24);
        if (drawable != null) {
            igdsListCell.A0A(drawable, Integer.valueOf(color));
        }
        DbU.A0G(igdsListCell.getTextCellView(), R.id.igds_textcell_title).setTextColor(color);
        LY6.A01(igdsListCell, 47, this);
    }

    public final LDW BO3() {
        return (LDW) this.A03.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(501383888);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_menu_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(4547202, A022);
        return inflate;
    }
}
