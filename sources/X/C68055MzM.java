package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import java.util.List;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.MzM  reason: case insensitive filesystem */
public final class C68055MzM extends C249703kE {
    public C61030JvU A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final ConstrainedImageView A04;
    public final ConstrainedImageView A05;
    public final List A06;
    public final List A07 = AnonymousClass7TE.A1C();

    public static ObjectAnimator A00(ObjectAnimator objectAnimator, Random random) {
        ObjectAnimator duration = objectAnimator.setDuration((long) (random.nextInt(IgNetworkConsentStorage.MAX_ENTRIES) + CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
        0qQ.A07(duration);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(2);
        return duration;
    }

    public final void A01(boolean z) {
        List<C252063oV> list = this.A06;
        for (C252063oV visibility : list) {
            visibility.setVisibility(DbW.A01(z ? 1 : 0));
        }
        if (z) {
            List list2 = this.A07;
            if (list2.isEmpty()) {
                Random random = new Random();
                for (C252063oV r4 : list) {
                    View view = r4.getView();
                    0qQ.A0B(view, 0);
                    Random random2 = new Random();
                    int dimensionPixelOffset = DbU.A05(view).getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                    ObjectAnimator A002 = A00(ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) (-random2.nextInt(dimensionPixelOffset)), (float) random2.nextInt(dimensionPixelOffset)}), random2);
                    ObjectAnimator A003 = A00(ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) (-random2.nextInt(dimensionPixelOffset)), (float) random2.nextInt(dimensionPixelOffset)}), random2);
                    ObjectAnimator A004 = A00(ObjectAnimator.ofFloat(view, "rotation", new float[]{(float) (-random2.nextInt(20)), (float) random2.nextInt(20)}), random2);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{A002, A003, A004});
                    list2.add(animatorSet);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.4f;
                    r4.getView().setScaleX(nextFloat);
                    r4.getView().setScaleY(nextFloat);
                }
            }
        }
        for (Animator animator : this.A07) {
            if (z) {
                animator.start();
            } else {
                animator.cancel();
            }
        }
    }

    public C68055MzM(View view) {
        super(view);
        this.A03 = DbX.A0a(view, R.id.row_avatar);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.primary_name);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        this.A04 = (ConstrainedImageView) AnonymousClass7TF.A0F(view, R.id.main_emoji);
        this.A05 = (ConstrainedImageView) AnonymousClass7TF.A0F(view, R.id.overlay);
        this.A06 = 0sr.A1M(new C252063oV[]{2b1.A01(view.requireViewById(R.id.super_react_emoji_1), false, false), DbV.A0T(view, R.id.super_react_emoji_2, false), DbV.A0T(view, R.id.super_react_emoji_3, false), DbV.A0T(view, R.id.super_react_emoji_4, false), DbV.A0T(view, R.id.super_react_emoji_5, false), DbV.A0T(view, R.id.super_react_emoji_6, false), DbV.A0T(view, R.id.super_react_emoji_7, false), DbV.A0T(view, R.id.super_react_emoji_8, false)});
    }
}
