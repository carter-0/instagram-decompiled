package X;

import android.widget.SeekBar;

/* renamed from: X.M4x  reason: case insensitive filesystem */
public final class C65934M4x implements Runnable {
    public final /* synthetic */ LZP A00;

    public C65934M4x(LZP lzp) {
        this.A00 = lzp;
    }

    public final void run() {
        LZP lzp = this.A00;
        float f = lzp.A0C.A01;
        SeekBar seekBar = lzp.A06;
        int A03 = (int) ((f * AnonymousClass7TE.A03(seekBar)) + 0.5f);
        C59986Jcv jcv = lzp.A09;
        jcv.A07 = lzp.A08.getBitmap(A03, seekBar.getHeight());
        jcv.invalidateSelf();
        seekBar.invalidate();
    }
}
