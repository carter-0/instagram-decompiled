package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.4Je  reason: invalid class name */
public abstract class AnonymousClass4Je {
    public static ColorDrawable A00;

    public static final void A00(AnonymousClass9IB r5, AnonymousClass3W1 r6, IgProgressImageView igProgressImageView, AnonymousClass3TN r8, AnonymousClass3TO r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r6, 4);
        boolean A0E = Systrace.A0E(1);
        if (A0E) {
            0fS.A01("FeedVideoBinder#bindView", -585765627);
        }
        if (r5.A04) {
            if ((r9 == AnonymousClass3TO.TIMER && !r6.A0l.A00()) || r9 == AnonymousClass3TO.AUTOPLAY_USING_TIMER) {
                if (r5.A01 || r5.A03) {
                    r8.setShouldShowCountdownTimer(false);
                } else {
                    r8.EiM(r6.A0Y, true);
                }
                igProgressImageView.setVisibility(8);
            } else if (r9 == AnonymousClass3TO.GONE || r9 == AnonymousClass3TO.HIDDEN) {
                igProgressImageView.setVisibility(8);
                r6.A30 = false;
            } else {
                igProgressImageView.setVisibility(0);
            }
            igProgressImageView.setEnableProgressBar(false);
            if (!r5.A02) {
                if (r9 == AnonymousClass3TO.LOADING) {
                    r8.EIB();
                }
                r8.setVideoIconState(r9);
            }
            Context context = igProgressImageView.getContext();
            0qQ.A07(context);
            ColorDrawable colorDrawable = A00;
            if (colorDrawable == null) {
                colorDrawable = new ColorDrawable(context.getColor(R.color.design_dark_default_color_on_background));
                A00 = colorDrawable;
            }
            igProgressImageView.setBackground(colorDrawable);
        } else {
            igProgressImageView.setEnableProgressBar(true);
            igProgressImageView.setVisibility(0);
            igProgressImageView.A06(R.id.listener_id_for_media_video_binder);
            igProgressImageView.setBackground((Drawable) null);
            r8.setVideoIconState(AnonymousClass3TO.GONE);
        }
        if (A0E) {
            0fS.A00(-2098327494);
        }
    }
}
