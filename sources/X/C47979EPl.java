package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.EPl  reason: case insensitive filesystem */
public final class C47979EPl extends E4R {
    public static final String __redex_internal_original_name = "QuickPromotionIIGCelebrationFullscreen";
    public IgSimpleImageView A00;
    public CircularImageView A01;
    public CircularImageView A02;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(473362156);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_celebration_fullscreen_fragment, viewGroup, false);
        CircularImageView circularImageView = (CircularImageView) E4R.A00(inflate, this);
        this.A02 = circularImageView;
        this.A05 = circularImageView;
        this.A01 = (CircularImageView) inflate.findViewById(R.id.animation_over_image);
        this.A00 = (IgSimpleImageView) inflate.findViewById(R.id.background_simple_imageview);
        AnonymousClass0fD.A09(-113262650, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1367089087);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-214635048, A022);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void onResume() {
        CircularImageView circularImageView;
        int A022 = AnonymousClass0fD.A02(439250282);
        super.onResume();
        AnonymousClass4UC r1 = this.A07;
        if (r1 == null || this.A0A) {
            A01();
            this.A09 = true;
        } else {
            A02(r1);
            UserSession A0l = AnonymousClass7TE.A0l(this.A0E);
            if (!(A0l == null || (circularImageView = this.A02) == null)) {
                circularImageView.setUrl(AnonymousClass7TF.A0Q(A0l).A0D(), this);
            }
            IgSimpleImageView igSimpleImageView = this.A00;
            if (igSimpleImageView != null) {
                C17669Vc0 vc0 = new C17669Vc0(igSimpleImageView, getModuleName(), igSimpleImageView.getRootView());
                vc0.A03 = requireContext().getColor(2Yu.A0H(getContext(), R.attr.igds_color_dimmer));
                vc0.A00 = 5;
                igSimpleImageView.setBackground(new U1A(vc0));
            }
            ? r12 = this.A01;
            if (r12 != 0) {
                C240943Ng.A00(requireContext(), r12);
                C240943Ng.A01(r12.getDrawable());
            }
        }
        AnonymousClass0fD.A09(-510503725, A022);
    }
}
