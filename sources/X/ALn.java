package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

public final /* synthetic */ class ALn implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C40091AQw A01;

    public /* synthetic */ ALn(Bitmap bitmap, C40091AQw aQw) {
        this.A00 = bitmap;
        this.A01 = aQw;
    }

    public final void onPixelCopyFinished(int i) {
        Bitmap bitmap = this.A00;
        C40091AQw aQw = this.A01;
        if (i != 0) {
            bitmap.eraseColor(-12303292);
        }
        aQw.A00(bitmap, (C39669A4j) null);
    }
}
