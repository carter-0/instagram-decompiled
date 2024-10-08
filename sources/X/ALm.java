package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

public final class ALm implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;

    public ALm(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            this.A00.eraseColor(-16777216);
            0kD.A07("ConstrainedViewHolder", "Failed to get Bitmap from Surface.", (Throwable) null);
        }
    }
}
