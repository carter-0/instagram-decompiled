package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.3N9  reason: invalid class name */
public final class AnonymousClass3N9 {
    public View.OnClickListener A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public CircularImageView A06;
    public CircularImageView A07;
    public CircularImageView A08;
    public AnonymousClass3NU A09;
    public PulseEmitter A0A;
    public PulsingMultiImageView A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final ViewStub A0E;
    public final ViewStub A0F;
    public final ViewStub A0G;
    public final ViewStub A0H;
    public final ViewStub A0I;
    public final ViewStub A0J;
    public final FrameLayout A0K;
    public final CircularImageView A0L;
    public final C252063oV A0M;
    public final C252063oV A0N;
    public final GradientSpinner A0O;

    public final void A00() {
        if (this.A0A == null) {
            this.A0A = (PulseEmitter) this.A0H.inflate();
            this.A0B = (PulsingMultiImageView) this.A0I.inflate();
        }
    }

    public AnonymousClass3N9(View view) {
        this.A0H = (ViewStub) view.requireViewById(R.id.pulse_emitter_stub);
        this.A0I = (ViewStub) view.requireViewById(R.id.pulsing_image_view_stub);
        this.A0E = (ViewStub) view.requireViewById(R.id.failed_stub);
        this.A0G = (ViewStub) view.requireViewById(R.id.live_badge_stub);
        GradientSpinner gradientSpinner = (GradientSpinner) view.requireViewById(R.id.seen_state);
        this.A0O = gradientSpinner;
        if (C61670oa.A02()) {
            Context context = view.getContext();
            int A0G2 = 2Yu.A0G(context, R.attr.reelsTrayAvatarInnerSize);
            float A052 = (float) AnonymousClass0od.A05(context, A0G2, context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large));
            float A002 = AnonymousClass0od.A00(context, gradientSpinner.A00, A0G2);
            float A012 = AnonymousClass0od.A01(context, gradientSpinner.A02, A0G2);
            ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
            if (layoutParams != null) {
                int i = (int) A052;
                layoutParams.width = i;
                layoutParams.height = i;
            }
            gradientSpinner.A02 = A002;
            gradientSpinner.A00 = A012;
            gradientSpinner.invalidate();
        }
        this.A0L = (CircularImageView) view.requireViewById(R.id.avatar_image_view);
        this.A0K = (FrameLayout) view.requireViewById(R.id.avatar_container);
        this.A0D = (ViewStub) view.requireViewById(R.id.double_avatar_stub);
        this.A0C = (ViewStub) view.requireViewById(R.id.birthday_confetti_animation_stub);
        this.A0F = (ViewStub) view.requireViewById(R.id.likes_emitter_animation_stub);
        this.A0J = (ViewStub) view.requireViewById(R.id.self_avatar_camera_overlay);
        this.A0M = 2b1.A01(view.requireViewById(R.id.comment_container_stub), false, false);
        this.A0N = 2b1.A01(view.requireViewById(R.id.tray_follow_button_stub), false, false);
    }
}
