package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E0h extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ReelsCarouselEntrypointNuxFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "REEL_CAROUSEL_ENTRYPOINT_NUX";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean(AnonymousClass000.A00(1104))) {
            Dbb.A0t(view, R.id.reels_carousel_entrypoint_public_text, 0);
        }
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A00, 0), 36328233548987491L)) {
            IgdsHeadline A0U = DbZ.A0U(view, R.id.reels_carousel_entrypoint_headline);
            A0U.setHeadline((CharSequence) A0U.getResources().getString(2131971782));
            TextView A0G = DbU.A0G(view, R.id.reels_carousel_entrypoint_text);
            DbU.A1A(A0G.getResources(), A0G, 2131971780);
        }
        FP5.A01(AnonymousClass7TF.A0G(view, R.id.reels_carousel_entrypoint_bottom_button), 51, this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(83059558);
        0qQ.A0B(layoutInflater, 0);
        E0h.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.reels_carousel_entrypoint_nux, viewGroup, false);
        AnonymousClass0fD.A09(571149857, A02);
        return inflate;
    }
}
