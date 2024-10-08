package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class H04 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsRemixOptionsFragment";
    public ConstraintLayout A00;
    public ConstraintLayout A01;
    public 28D A02;
    public ImageUrl A03;
    public Boolean A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09 = true;
    public String A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public final String getModuleName() {
        return "clips_remix_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ConstraintLayout) view.requireViewById(R.id.clips_remix_extend);
        this.A01 = (ConstraintLayout) view.requireViewById(R.id.clips_remix_together);
        1E8 A0d = DbX.A0d(this.A0B);
        String str = this.A0A;
        if (str == null) {
            0qQ.A0F("mediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        1Xj A022 = A0d.A02(str);
        View A0G = AnonymousClass7TF.A0G(view, R.id.clips_separate_remix_option);
        View A0F = AnonymousClass7TF.A0F(view, R.id.clips_separate_sequence_option);
        View A0F2 = AnonymousClass7TF.A0F(view, R.id.clips_remix_options_header);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.clips_remix_options_description);
        A0F2.setVisibility(8);
        ConstraintLayout constraintLayout = this.A00;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = this.A01;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
        A0G.setVisibility(0);
        A0F.setVisibility(0);
        DbT.A18(requireContext(), A0R, 2131973122);
        AnonymousClass0fU.A00(new C56761IBk(5, A022, this, false), A0G);
        AnonymousClass0fU.A00(new C56761IBk(5, A022, this, true), A0F);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-196368779);
        H04.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A05 = C320236s2.A01(requireArguments, "ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_CONTAINER_MODULE_NAME");
        this.A0A = C320236s2.A01(requireArguments, "ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_ID");
        requireArguments.getInt("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_INDEX", 0);
        requireArguments.getString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_SOURCE_MEDIA_ID");
        Object obj = requireArguments.get("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_ENTRY_POINT");
        if (obj != null) {
            this.A02 = (28D) obj;
            this.A07 = requireArguments.getString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ID");
            this.A08 = requireArguments.getString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_NAME");
            this.A06 = requireArguments.getString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ATTRIBUTION_USER_ID");
            if (requireArguments.containsKey("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_SUPPORTED")) {
                this.A04 = DbU.A0g(requireArguments, "ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_SUPPORTED");
            }
            this.A03 = (ImageUrl) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_THUMBNAIL_URL");
            this.A09 = requireArguments.getBoolean("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_USE_TRANSPARENT_MODAL_ACTIVITY", true);
            AnonymousClass0fD.A09(-1221770769, A022);
            return;
        }
        IllegalArgumentException A0h = DbU.A0h();
        AnonymousClass0fD.A09(1505895702, A022);
        throw A0h;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1968728194);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_remix_options_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1777777460, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1194747848);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-314969586, A022);
    }
}
