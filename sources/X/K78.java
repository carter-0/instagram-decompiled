package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.mediakit.analytics.VisibilitySheetOrigin;
import com.instagram.mediakit.ui.model.MediaKitLink;
import java.util.HashMap;

public final class K78 extends AnonymousClass4DH implements MXF {
    public static final String __redex_internal_original_name = "MediaKitVisibilitySheetFragment";
    public VisibilitySheetOrigin A00;
    public C62320sa A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C64128LPc.A00(this, R.id.mk_visibility_sheet_bottom_layout);
    public final AnonymousClass0eM A04 = C64128LPc.A00(this, R.id.mk_share_action_direct);
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(MML.A00(this, 37));
    public final AnonymousClass0eM A06 = C64128LPc.A00(this, R.id.mk_share_action_link);
    public final AnonymousClass0eM A07 = C64128LPc.A00(this, R.id.mk_visibility_sheet_private_toggle);
    public final AnonymousClass0eM A08 = C64128LPc.A00(this, R.id.mk_visibility_sheet_public_toggle);
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final AnonymousClass0eM A0A = C64128LPc.A00(this, R.id.mk_share_action_share);
    public final AnonymousClass0eM A0B = C64128LPc.A00(this, R.id.mk_visibility_sheet_share_title);
    public final AnonymousClass0eM A0C = C64128LPc.A00(this, R.id.mk_share_actions_view);
    public final AnonymousClass0eM A0D = DbS.A0I(MML.A00(this, 44), MML.A00(this, 45), MMW.A00((Object) null, this, 4), DbS.A0z(C60327JjW.class));
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(MML.A00(this, 38));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Fragment fragment = this.mParentFragment;
        if (fragment != null) {
            07U r5 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 20), AnonymousClass07a.A00(viewLifecycleOwner));
        }
        IgdsListCell igdsListCell = (IgdsListCell) this.A07.getValue();
        C69349Njo njo = C69349Njo.TYPE_RADIO;
        igdsListCell.A0G(njo, true);
        igdsListCell.A0H(DbU.A0m(this, 2131966660));
        IgdsListCell igdsListCell2 = (IgdsListCell) this.A08.getValue();
        igdsListCell2.A0G(njo, true);
        igdsListCell2.A0H(DbU.A0m(this, 2131966662));
        C64128LPc.A01(AnonymousClass7TE.A0c(this.A0A), MML.A00(this, 39));
        C64128LPc.A01(AnonymousClass7TE.A0c(this.A04), MML.A00(this, 40));
        C64128LPc.A01(AnonymousClass7TE.A0c(this.A06), MML.A00(this, 41));
        if (AnonymousClass7TF.A1Z(this.A05)) {
            MediaKitLink mediaKitLink = new MediaKitLink(MML.A00(this, 43), 2131966657);
            Context requireContext = requireContext();
            String A16 = AnonymousClass7TE.A16(requireContext, 2131966657);
            SpannableStringBuilder A082 = DbW.A08(requireContext, 2131966658);
            AnonymousClass7AV.A04(A082, new C62146Kaz(mediaKitLink, DbV.A02(requireContext)), A16);
            ((IgdsBottomButtonLayout) this.A03.getValue()).setFooterText(A082);
        }
        A00(this);
    }

    public static final void A00(K78 k78) {
        AnonymousClass37D A0i;
        AnonymousClass0eM r4 = k78.A07;
        C69349Njo njo = C69349Njo.TYPE_RADIO;
        ((IgdsListCell) r4.getValue()).A0G(njo, true);
        AnonymousClass0eM r2 = k78.A08;
        ((IgdsListCell) r2.getValue()).A0G(njo, true);
        ((IgdsListCell) r4.getValue()).A0D((CompoundButton.OnCheckedChangeListener) null);
        ((IgdsListCell) r2.getValue()).A0D((CompoundButton.OnCheckedChangeListener) null);
        ((IgdsListCell) r4.getValue()).setChecked(!A01(k78));
        ((IgdsListCell) r2.getValue()).setChecked(A01(k78));
        LZJ.A00((IgdsListCell) r4.getValue(), k78, 18);
        LZJ.A00((IgdsListCell) r2.getValue(), k78, 19);
        int i = 0;
        AnonymousClass7TE.A0c(k78.A0C).setVisibility(DbW.A01(A01(k78) ? 1 : 0));
        View A0c = AnonymousClass7TE.A0c(k78.A0B);
        if (!A01(k78)) {
            i = 8;
        }
        A0c.setVisibility(i);
        if (A01(k78) && k78.A02 && (A0i = DbX.A0i(k78)) != null) {
            A0i.A0T(AnonymousClass05K.A04);
        }
        k78.A02 = !A01(k78);
    }

    public static final boolean A01(K78 k78) {
        MediaKitVisibility mediaKitVisibility;
        C61221JzE jzE = (C61221JzE) JTT.A0a(k78.A0D).A0M.getValue();
        if (jzE == null || (mediaKitVisibility = jzE.A00) == null) {
            mediaKitVisibility = MediaKitVisibility.PRIVATE;
        }
        return AnonymousClass7TF.A1W(mediaKitVisibility, MediaKitVisibility.PUBLIC);
    }

    public final LDW BO3() {
        return (LDW) this.A0E.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1201351756);
        K78.super.onCreate(bundle);
        VisibilitySheetOrigin visibilitySheetOrigin = (VisibilitySheetOrigin) requireArguments().getParcelable("origin");
        if (visibilitySheetOrigin == null) {
            visibilitySheetOrigin = VisibilitySheetOrigin.MENU;
        }
        this.A00 = visibilitySheetOrigin;
        Integer num = AnonymousClass05K.A05;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("origin", visibilitySheetOrigin.A00);
        C64127LPb.A02(this, num, A1E);
        AnonymousClass0fD.A09(-1806581020, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-737215948);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_visibility_settings_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-645210854, A022);
        return inflate;
    }
}
