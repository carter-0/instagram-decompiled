package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.O1v  reason: case insensitive filesystem */
public abstract class C70317O1v {
    public static final void A00(MediaFrameLayout mediaFrameLayout) {
        IgProgressImageView igProgressImageView = (IgProgressImageView) mediaFrameLayout.findViewById(R.id.media_card_image_view);
        if (igProgressImageView != null) {
            igProgressImageView.A06 = true;
            igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
            Context context = mediaFrameLayout.getContext();
            igProgressImageView.setPlaceHolderColor(context.getColor(R.color.grey_9));
            Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
            if (drawable != null) {
                igProgressImageView.setProgressBarDrawable(drawable);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
