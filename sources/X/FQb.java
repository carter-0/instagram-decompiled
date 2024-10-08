package X;

import android.app.Dialog;
import android.widget.RatingBar;

public final class FQb implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ RatingBar.OnRatingBarChangeListener A00;
    public final /* synthetic */ C49446Evn A01;

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        0qQ.A0B(ratingBar, 0);
        this.A00.onRatingChanged(ratingBar, f, z);
        Dialog dialog = this.A01.A00;
        if (dialog != null) {
            dialog.dismiss();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public FQb(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, C49446Evn evn) {
        this.A00 = onRatingBarChangeListener;
        this.A01 = evn;
    }
}
