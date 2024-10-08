package X;

import android.graphics.Bitmap;

public final class M66 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C61705KIv A01;

    public M66(Bitmap bitmap, C61705KIv kIv) {
        this.A01 = kIv;
        this.A00 = bitmap;
    }

    public final void run() {
        C63695L3f l3f = this.A01.A00;
        C66437MRr mRr = (C66437MRr) l3f.A01.get();
        if (mRr != null) {
            mRr.CyV(l3f.A00, this.A00);
        }
    }
}
