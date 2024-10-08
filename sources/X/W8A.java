package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

public final class W8A implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ 0r1 A01;

    public W8A(Bitmap bitmap, 0r1 r2) {
        this.A01 = r2;
        this.A00 = bitmap;
    }

    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            this.A01.A00 = true;
            this.A00.recycle();
        }
    }
}
