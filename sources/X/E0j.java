package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E0j extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SeparateSequenceIntroductionNuxBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "SEPARATE_SEQUENCE_INTRODUCTION_NUX_BOTTOM_SHEET_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.new_remix_introduction_headline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_sequence_refresh);
        igdsHeadline.setHeadline(2131964465);
        igdsHeadline.setBody(2131964464);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        Resources resources = A0S.getResources();
        FGX A02 = FGX.A02(A0S, true);
        A02.A05(resources.getString(2131964461), resources.getString(2131964460), R.drawable.instagram_remix_sequential_pano_outline_24);
        A02.A05(resources.getString(2131964459), resources.getString(2131964458), R.drawable.instagram_camera_pano_outline_24);
        FGX.A03(A02, igdsHeadline, resources.getString(2131964463), resources.getString(2131964462), R.drawable.instagram_remix_pano_outline_24);
        C3021461u r2 = (C3021461u) AnonymousClass7TE.A0b(view, R.id.new_remix_introduction_bottom_buttons);
        r2.setDividerVisible(true);
        r2.setPrimaryActionText(requireContext().getString(2131964466));
        r2.setPrimaryActionOnClickListener(FP5.A00(this, 55));
        r2.setSecondaryButtonEnabled(false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1828162663);
        0qQ.A0B(layoutInflater, 0);
        E0j.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_new_remix_introduction_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(144287494, A02);
        return inflate;
    }
}
