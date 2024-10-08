package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Jf5  reason: case insensitive filesystem */
public final class C60072Jf5 extends ConstraintLayout {
    public View A00;
    public IgTextView A01;
    public CircularImageView A02;

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void setWithAvatarImage(AnonymousClass0iw r4, ImageUrl imageUrl, String str) {
        AnonymousClass7TF.A1H(r4, imageUrl);
        CircularImageView circularImageView = this.A02;
        String str2 = "avatarImageView";
        if (circularImageView != null) {
            circularImageView.setUrl(imageUrl, r4);
            ? r0 = this.A02;
            if (r0 != 0) {
                r0.setVisibility(0);
                IgTextView igTextView = this.A01;
                if (igTextView == null) {
                    str2 = "metricText";
                } else {
                    igTextView.setText(str);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setMetricOnly(String str) {
        IgTextView igTextView = this.A01;
        if (igTextView == null) {
            0qQ.A0F("metricText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igTextView.setText(str);
        }
    }

    public final void setWithEyeIcon(String str) {
        Drawable drawable = getContext().getDrawable(R.drawable.instagram_eye_outline_18);
        if (drawable != null) {
            AnonymousClass7TE.A1R(drawable, -1);
        }
        IgTextView igTextView = this.A01;
        if (igTextView != null) {
            igTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            IgTextView igTextView2 = this.A01;
            if (igTextView2 != null) {
                igTextView2.setCompoundDrawablePadding(JTP.A03(getResources()));
                IgTextView igTextView3 = this.A01;
                if (igTextView3 != null) {
                    igTextView3.setText(str);
                    return;
                }
            }
        }
        0qQ.A0F("metricText");
        throw AnonymousClass00P.createAndThrow();
    }
}
