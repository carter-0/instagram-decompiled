package X;

import android.widget.SeekBar;

/* renamed from: X.M4w  reason: case insensitive filesystem */
public final class C65933M4w implements Runnable {
    public final /* synthetic */ LZQ A00;

    public C65933M4w(LZQ lzq) {
        this.A00 = lzq;
    }

    public final void run() {
        LZQ lzq = this.A00;
        C59986Jcv jcv = lzq.A08;
        if (jcv != null) {
            float f = lzq.A0A.A01;
            SeekBar seekBar = lzq.A06;
            jcv.A07 = lzq.A07.getBitmap((int) ((f * AnonymousClass7TE.A03(seekBar)) + 0.5f), seekBar.getHeight());
            jcv.invalidateSelf();
            seekBar.invalidate();
        }
    }
}
