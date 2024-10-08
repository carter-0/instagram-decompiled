package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

public final class GIC extends C67961ye {
    public SimpleVideoLayout A00;
    public final IgImageView A01;
    public final IgImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GIC(Context context, UserSession userSession) {
        super(context);
        0qQ.A0B(userSession, 2);
        IgImageView igImageView = new IgImageView(context);
        this.A01 = igImageView;
        this.A00 = new SimpleVideoLayout(context, (AttributeSet) null, 0);
        IgImageView igImageView2 = new IgImageView(context);
        this.A02 = igImageView2;
        igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GIB.A00(igImageView2, 1KU.A07(userSession));
        this.A00.setId(R.id.clips_video_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        igImageView.setLayoutParams(layoutParams);
        this.A00.setLayoutParams(layoutParams);
        setId(R.id.clips_viewer_video_layout);
        addView(igImageView);
        addView(this.A00);
        addView(igImageView2);
    }

    public final IgImageView getImagePlaceHolder() {
        return this.A01;
    }

    public final IgImageView getMuteOrPauseIconImageView() {
        return this.A02;
    }

    public final SimpleVideoLayout getVideoPlaceHolder() {
        return this.A00;
    }
}
