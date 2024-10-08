package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.NKb  reason: case insensitive filesystem */
public final class C68484NKb extends C273374mT {
    public static final String __redex_internal_original_name = "DirectIceBreakerNullStateFragment";
    public C70761OKh A00;
    public C69257NiJ A01;
    public C70932OSf A02;
    public String A03;
    public boolean A04;
    public Context A05;
    public View A06;

    public final String getModuleName() {
        return "direct_icebreaker_null_state_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1090830933);
        C68484NKb.super.onCreate(bundle);
        this.A05 = requireContext();
        this.A03 = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_settings");
        this.A04 = DbT.A1X(requireArguments(), "show_set_up_preference");
        this.A02 = new C70932OSf(this, getSession());
        this.A00 = new C70761OKh(getSession(), requireActivity());
        AnonymousClass0fD.A09(-1784011814, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1685968590);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_icebreaker_null_state, viewGroup, false);
        this.A06 = inflate;
        String str = this.A03;
        IgdsHeadline igdsHeadline = (IgdsHeadline) inflate.requireViewById(R.id.null_state_headline);
        int i = 2131959272;
        if (this.A04) {
            i = 2131959273;
        }
        igdsHeadline.setBody(i);
        int i2 = 2131959276;
        if (str.equals("inbox_qp_creation_flow")) {
            i2 = 2131959277;
        }
        igdsHeadline.setHeadline(i2);
        View view = this.A06;
        Context context = this.A05;
        String str2 = this.A03;
        C3021461u r2 = (C3021461u) view.requireViewById(R.id.null_state_bottom_button);
        int i3 = 2131959269;
        if (str2.equals("inbox_qp_creation_flow")) {
            i3 = 2131959270;
        }
        r2.setPrimaryActionText(context.getString(i3));
        C71407Ok6.A02(r2, this, 63);
        View view2 = this.A06;
        Context context2 = this.A05;
        if (this.A04) {
            IgRadioGroup igRadioGroup = (IgRadioGroup) view2.requireViewById(R.id.null_state_set_up_preference_group);
            igRadioGroup.removeAllViews();
            C69257NiJ niJ = C69257NiJ.IMPORT_FROM_PAGE;
            0qQ.A0B(context2, 1);
            U5O u5o = new U5O(context2);
            u5o.setTag(niJ);
            u5o.setPrimaryText(2131959275);
            u5o.setSecondaryText(2131959274);
            u5o.A04(true);
            igRadioGroup.addView(u5o);
            C69257NiJ niJ2 = C69257NiJ.CREATE_NEW;
            U5O u5o2 = new U5O(context2);
            u5o2.setTag(niJ2);
            u5o2.setPrimaryText(2131959271);
            igRadioGroup.addView(u5o2);
            igRadioGroup.A02 = new C19752Wet(this, 3);
            if (igRadioGroup.A00 == -1) {
                igRadioGroup.findViewWithTag(niJ).getClass();
                igRadioGroup.A02(igRadioGroup.findViewWithTag(niJ).getId());
                this.A01 = niJ;
            }
            igRadioGroup.setVisibility(0);
        }
        View view3 = this.A06;
        AnonymousClass0fD.A09(654435203, A022);
        return view3;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1039694283);
        super.onDestroy();
        AnonymousClass0fD.A09(851717662, A022);
    }
}
