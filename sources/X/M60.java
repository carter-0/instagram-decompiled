package X;

import android.graphics.Bitmap;

public final /* synthetic */ class M60 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C66432MRm A01;

    public /* synthetic */ M60(Bitmap bitmap, C66432MRm mRm) {
        this.A01 = mRm;
        this.A00 = bitmap;
    }

    public final void run() {
        this.A01.D7x(this.A00);
    }
}
