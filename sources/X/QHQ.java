package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

public final class QHQ extends C11994SkD {
    public static final Handler A01 = new Handler(Looper.getMainLooper(), new W69(0));
    public final Sk4 A00;

    public final void DO8(Drawable drawable) {
    }

    public final void Df5(C13540TcC tcC, Object obj) {
        C13837TiC tiC = this.A00;
        if (tiC != null && tiC.isComplete()) {
            Pxe.A1N(A01, this, 1);
        }
    }

    public QHQ(Sk4 sk4) {
        this.A00 = sk4;
    }
}
