package X;

import android.graphics.Bitmap;
import java.io.File;

public final class M8T implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ MTS A01;
    public final /* synthetic */ File A02;

    public M8T(Bitmap bitmap, MTS mts, File file) {
        this.A01 = mts;
        this.A02 = file;
        this.A00 = bitmap;
    }

    public final void run() {
        this.A01.onSuccess(this.A02);
        this.A00.recycle();
    }
}
