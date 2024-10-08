package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6P9  reason: invalid class name */
public final class AnonymousClass6P9 implements C2365734g {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass6P8 A01;

    public AnonymousClass6P9(Context context, AnonymousClass6P8 r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void DKS(View view) {
        int i;
        0qQ.A0B(view, 0);
        boolean z = !C316216lI.A0B(this.A00);
        AnonymousClass6P8 r1 = this.A01;
        if (z) {
            View requireViewById = view.requireViewById(R.id.story_delayed_skip_ad_short_device);
            0qQ.A0B(requireViewById, 0);
            r1.A00 = requireViewById;
            View requireViewById2 = view.requireViewById(R.id.story_delayed_skip_ad_short_device_text_container);
            0qQ.A0B(requireViewById2, 0);
            r1.A01 = requireViewById2;
            IgTextView requireViewById3 = view.requireViewById(R.id.story_delayed_skip_ad_short_device_countdown);
            0qQ.A0B(requireViewById3, 0);
            r1.A03 = requireViewById3;
            IgTextView requireViewById4 = view.requireViewById(R.id.story_delayed_skip_ad_short_device_description);
            0qQ.A0B(requireViewById4, 0);
            r1.A04 = requireViewById4;
            GradientSpinner gradientSpinner = (GradientSpinner) view.requireViewById(R.id.countdown_short_device_progress_ring);
            0qQ.A0B(gradientSpinner, 0);
            r1.A06 = gradientSpinner;
            IgImageView requireViewById5 = view.requireViewById(R.id.story_delayed_skip_ad_short_device_control_option_icon);
            0qQ.A0B(requireViewById5, 0);
            r1.A05 = requireViewById5;
            i = R.id.story_delayed_skip_ad_short_device_pause;
        } else {
            View requireViewById6 = view.requireViewById(R.id.story_delayed_skip_ad_timer);
            0qQ.A0B(requireViewById6, 0);
            r1.A00 = requireViewById6;
            IgTextView requireViewById7 = view.requireViewById(R.id.story_delayed_skip_ad_timer_countdown);
            0qQ.A0B(requireViewById7, 0);
            r1.A03 = requireViewById7;
            IgTextView requireViewById8 = view.requireViewById(R.id.story_delayed_skip_ad_timer_description);
            0qQ.A0B(requireViewById8, 0);
            r1.A04 = requireViewById8;
            GradientSpinner gradientSpinner2 = (GradientSpinner) view.requireViewById(R.id.countdown_timer_progress_ring);
            0qQ.A0B(gradientSpinner2, 0);
            r1.A06 = gradientSpinner2;
            IgImageView requireViewById9 = view.requireViewById(R.id.story_delayed_skip_ad_timer_control_option_icon);
            0qQ.A0B(requireViewById9, 0);
            r1.A05 = requireViewById9;
            i = R.id.story_delayed_skip_ad_timer_pause;
        }
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(i);
        0qQ.A0B(igSimpleImageView, 0);
        r1.A02 = igSimpleImageView;
    }
}
