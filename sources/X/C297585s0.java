package X;

import android.graphics.Bitmap;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;

/* renamed from: X.5s0  reason: invalid class name and case insensitive filesystem */
public final class C297585s0 implements C226632hb {
    public final /* synthetic */ AnimatedThumbnailView A00;

    public C297585s0(AnimatedThumbnailView animatedThumbnailView) {
        this.A00 = animatedThumbnailView;
    }

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        AnimatedThumbnailView animatedThumbnailView = this.A00;
        animatedThumbnailView.setUpThumbnailDimensions(bitmap);
        AnimatedThumbnailView.A01(animatedThumbnailView);
        return bitmap;
    }
}
