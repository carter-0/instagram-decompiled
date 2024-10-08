package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mb  reason: invalid class name and case insensitive filesystem */
public final class C317026mb {
    public final ValueAnimator A00;
    public final View A01;
    public final UserSession A02;

    public C317026mb(UserSession userSession, C71662eb r5) {
        this.A02 = userSession;
        View requireViewById = r5.A01().requireViewById(R.id.polaroid_sticker_overlay_container);
        0qQ.A07(requireViewById);
        this.A01 = requireViewById;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(1400);
        duration.setStartDelay(300);
        this.A00 = duration;
    }

    public final void A00(1Xj r3, AnonymousClass4DU r4, JOR jor, boolean z) {
        if (this.A01.getVisibility() == 0) {
            ValueAnimator valueAnimator = this.A00;
            if (!valueAnimator.isStarted()) {
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new C56685I7q(valueAnimator, this));
                valueAnimator.addListener(new C56675I7e(r3, r4, this, z));
                valueAnimator.addListener(new I7Z(this, jor));
                valueAnimator.start();
            }
        }
    }
}
