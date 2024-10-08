package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E5a  reason: case insensitive filesystem */
public final class C47495E5a extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "GalleryGridFormatAttributionSheetFragment";
    public String A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Resources resources = requireContext.getResources();
        ImageView A0J = DbX.A0J(view, R.id.action_sheet_header_picture);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.action_sheet_header_text_view);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.action_sheet_subheader_text_view);
        View A0G = AnonymousClass7TF.A0G(view, R.id.action_sheet_row_text_view);
        DbU.A13(requireContext, A0J, R.drawable.ig_illustrations_illo_supersync_attribution);
        A0R.setText(new SpannableString(resources.getString(2131962927)));
        A0R.setTypeface((Typeface) null, 1);
        A0R2.setText(0mp.A06(AnonymousClass7TF.A0d(resources, 2131953212), new Object[]{resources.getString(R.string.f0nameremoved)}));
        2eS.A01(A0G);
        FP2.A00(A0G, 20, this);
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A1I;
    }

    public final String getModuleName() {
        String str = this.A01;
        if (str != null) {
            return C49092EpH.A00(this, str);
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(623313842);
        C47495E5a.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = C320236s2.A01(requireArguments, "args_previous_module_name");
        this.A00 = C320236s2.A01(requireArguments, AnonymousClass000.A00(4023));
        AnonymousClass0fD.A09(-1074644332, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-992491445);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.capture_format_attribution_sheet_fragment, false);
        AnonymousClass0fD.A09(146872188, A022);
        return A0D;
    }
}
