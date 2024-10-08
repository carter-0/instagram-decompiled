package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

public final class ALo implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ 0sP A01;

    public ALo(Bitmap bitmap, 0sP r2) {
        this.A00 = bitmap;
        this.A01 = r2;
    }

    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            this.A00.eraseColor(-16777216);
            0kD.A07("ConstrainedViewHolder", "Failed to get Bitmap from Surface.", (Throwable) null);
        }
        this.A01.invoke(this.A00);
    }
}
