package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.6hh  reason: invalid class name and case insensitive filesystem */
public final class C314126hh {
    public ImageView A00;
    public C226492gu A01;
    public final Context A02;

    public final void A00() {
        C226492gu r0;
        if (this.A00 != null && (r0 = this.A01) != null) {
            r0.pause();
            C226492gu r1 = this.A01;
            if (r1 != null) {
                r1.EL2(0.0f);
            }
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    public final void A01(Animator.AnimatorListener animatorListener) {
        C226492gu r0;
        C226492gu r02;
        ImageView imageView = this.A00;
        if (imageView != null && (r0 = this.A01) != null && !r0.isPlaying()) {
            imageView.setVisibility(0);
            if (!(animatorListener == null || (r02 = this.A01) == null)) {
                r02.A8s(animatorListener);
            }
            C226492gu r1 = this.A01;
            if (r1 != null) {
                r1.EL2(0.0f);
            }
            C226492gu r03 = this.A01;
            if (r03 != null) {
                r03.E2p();
            }
        }
    }

    public final void A02(ImageView imageView, Integer num) {
        C226492gu A002;
        Context context;
        int i;
        this.A00 = imageView;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 2) {
                context = this.A02;
                i = R.drawable.ig_notes_vday_vday_final_full;
            } else if (intValue == 1) {
                context = this.A02;
                i = R.drawable.ig_notes_vday_vday_final_half;
            } else if (intValue == 3) {
                context = this.A02;
                i = R.drawable.notes_birthdays_confetti_phase1_animation;
            } else {
                throw new RuntimeException();
            }
            A002 = (C226462gr) context.getDrawable(i);
        } else {
            A002 = C303756Aq.A00(this.A02, R.raw.countdown_sticker_confetti);
        }
        this.A01 = A002;
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            imageView2.setImageDrawable((Drawable) A002);
        }
        C226492gu r1 = this.A01;
        if (r1 != null) {
            r1.A8s(new C71154OeT(this));
        }
    }

    public C314126hh(Context context) {
        this.A02 = context;
    }
}
