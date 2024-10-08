package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.6K2  reason: invalid class name */
public final class AnonymousClass6K2 extends FrameLayout {
    public final IgProgressImageView A00;
    public final MediaFrameLayout A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6K2(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.showreel_video_view, this, true);
        View requireViewById = requireViewById(R.id.showreel_video_media_frame_layout);
        0qQ.A07(requireViewById);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById;
        this.A01 = mediaFrameLayout;
        View requireViewById2 = mediaFrameLayout.requireViewById(R.id.showreel_ig_progress_image_view);
        0qQ.A07(requireViewById2);
        this.A00 = (IgProgressImageView) requireViewById2;
    }

    public final IgProgressImageView getIgProgressImageView() {
        return this.A00;
    }

    public final MediaFrameLayout getMediaFrameLayout() {
        return this.A01;
    }

    public final ScalingTextureView getScalingTextureView() {
        View requireViewById = this.A01.requireViewById(R.id.showreel_video_scaling_texture_view);
        0qQ.A07(requireViewById);
        return (ScalingTextureView) requireViewById;
    }

    public final SimpleVideoLayout getSimpleVideoLayout() {
        View requireViewById = this.A01.requireViewById(R.id.showreel_video_simple_video_view);
        0qQ.A07(requireViewById);
        return (SimpleVideoLayout) requireViewById;
    }
}
