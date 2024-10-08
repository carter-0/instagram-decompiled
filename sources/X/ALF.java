package X;

import android.media.Image;
import android.media.ImageReader;

public final class ALF implements ImageReader.OnImageAvailableListener {
    public final int A00;
    public final Object A01;

    public ALF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C40183AUx aUx = (C40183AUx) obj;
            Image image = aUx.A00;
            if (image != null) {
                image.close();
            }
            try {
                aUx.A00 = imageReader.acquireNextImage();
                C40183AUx.A01(aUx);
            } catch (Throwable unused) {
            }
        } else {
            C40182AUw aUw = (C40182AUw) obj;
            Image image2 = aUw.A00;
            if (image2 != null) {
                image2.close();
            }
            aUw.A00 = imageReader.acquireNextImage();
            C40182AUw.A00(aUw);
        }
    }
}
