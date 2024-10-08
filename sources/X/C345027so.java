package X;

import android.media.ImageReader;

/* renamed from: X.7so  reason: invalid class name and case insensitive filesystem */
public final class C345027so implements Runnable {
    public final /* synthetic */ C344947sg A00;

    public C345027so(C344947sg r1) {
        this.A00 = r1;
    }

    public final void run() {
        C344947sg r2 = this.A00;
        ImageReader imageReader = r2.A03;
        if (!(imageReader != null && imageReader.getWidth() == r2.A02 && r2.A03.getHeight() == r2.A01)) {
            C344947sg.A01(r2);
            C344947sg.A00(r2);
        }
        if (r2.A06) {
            r2.A07.open();
        }
    }
}
