package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8Fs  reason: invalid class name and case insensitive filesystem */
public final class C352958Fs implements Runnable {
    public final /* synthetic */ C352888Fl A00;

    public C352958Fs(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void run() {
        View view;
        View view2;
        Bitmap bitmap;
        C352888Fl r4 = this.A00;
        AtomicBoolean atomicBoolean = r4.A1L;
        atomicBoolean.set(false);
        C41839B2u A002 = r4.A1B.A00();
        C357638Yz r7 = r4.A0g;
        Handler handler = r4.A0Q;
        ShutterButton shutterButton = r4.A1I;
        C340297l2 r0 = r4.A06;
        if (r0 != null) {
            view = r0.A0H.A00();
        } else {
            view = r4.A0T;
        }
        int width = view.getWidth();
        C340297l2 r02 = r4.A06;
        if (r02 != null) {
            view2 = r02.A0H.A00();
        } else {
            view2 = r4.A0T;
        }
        A002.ErW(handler, r7, r4.A16, shutterButton, width, view2.getHeight());
        if (182.A06(0Tu.A05, r4.A0f, 36318578462431538L) || !r4.A0Y()) {
            C340297l2 r2 = r4.A06;
            if (r2 == null) {
                bitmap = null;
            } else if (r2.A0H.A00 != null) {
                r2.A0L(new C364458lS(this), 448, 448);
            } else {
                bitmap = r2.A0A(448, 448);
            }
            0nY.A00().ATE(new C386689l0(bitmap, this));
        }
        if (!atomicBoolean.get()) {
            handler.postDelayed(r4.A1J, 1000);
            atomicBoolean.set(true);
        }
    }
}
