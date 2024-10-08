package X;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: X.TCn  reason: case insensitive filesystem */
public final class C12899TCn implements Runnable {
    public final /* synthetic */ C7925Qcw A00;

    public C12899TCn(C7925Qcw qcw) {
        this.A00 = qcw;
    }

    public final void run() {
        C7925Qcw qcw = this.A00;
        Bitmap bitmap = qcw.A06;
        if (bitmap != null) {
            FrameLayout frameLayout = qcw.A0B;
            0qQ.A0A(frameLayout);
            float width = (float) frameLayout.getWidth();
            qcw.A01 = width;
            qcw.A00 = (width / JTO.A02(bitmap)) * JTO.A01(bitmap);
            ImageView imageView = qcw.A0G;
            0qQ.A0A(imageView);
            imageView.setImageBitmap(bitmap);
        }
    }
}
