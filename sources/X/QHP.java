package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

public final class QHP extends C11994SkD {
    public Bitmap A00;
    public final int A01;
    public final long A02;
    public final Handler A03;

    public final void DO8(Drawable drawable) {
        this.A00 = null;
    }

    public final /* bridge */ /* synthetic */ void Df5(C13540TcC tcC, Object obj) {
        this.A00 = (Bitmap) obj;
        Handler handler = this.A03;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.A02);
    }

    public QHP(Handler handler, int i, long j) {
        this.A03 = handler;
        this.A01 = i;
        this.A02 = j;
    }
}
