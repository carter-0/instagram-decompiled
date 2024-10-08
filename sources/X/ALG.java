package X;

import android.media.Image;
import android.media.ImageReader;

public final /* synthetic */ class ALG implements ImageReader.OnImageAvailableListener {
    public static final /* synthetic */ ALG A00 = new ALG();

    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }
}
