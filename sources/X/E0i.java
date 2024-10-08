package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E0i extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "NewRemixIntroductionNuxBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "SEPARATE_SEQUENCE_INTRODUCTION_NUX_BOTTOM_SHEET_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean(AnonymousClass000.A00(973), false);
        }
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(view, R.id.new_remix_introduction_headline);
        Context A0S = AnonymousClass7TE.A0S(igdsHeadline);
        Resources resources = A0S.getResources();
        FGX A02 = FGX.A02(A0S, true);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_remix_refresh);
        igdsHeadline.setHeadline(2131968308);
        if (z) {
            0qQ.A0A(resources);
            A02.A05(resources.getString(2131968307), resources.getString(2131968306), R.drawable.instagram_collage_pano_outline_24);
            string = resources.getString(2131968299);
            string2 = resources.getString(2131968298);
            i = R.drawable.instagram_camera_pano_outline_24;
        } else {
            0qQ.A0A(resources);
            igdsHeadline.setBody(2131968303);
            string = resources.getString(2131968301);
            string2 = resources.getString(2131968300);
            i = R.drawable.instagram_remix_pano_outline_24;
        }
        A02.A05(string, string2, i);
        FGX.A03(A02, igdsHeadline, resources.getString(2131968305), resources.getString(2131968304), R.drawable.instagram_remix_sequential_pano_outline_24);
        C3021461u r2 = (C3021461u) AnonymousClass7TE.A0b(view, R.id.new_remix_introduction_bottom_buttons);
        r2.setDividerVisible(true);
        r2.setPrimaryActionText(requireContext().getString(2131968302));
        r2.setPrimaryActionOnClickListener(FP5.A00(this, 54));
        r2.setSecondaryButtonEnabled(false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(469906305);
        0qQ.A0B(layoutInflater, 0);
        E0i.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_new_remix_introduction_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(-682347823, A02);
        return inflate;
    }
}
