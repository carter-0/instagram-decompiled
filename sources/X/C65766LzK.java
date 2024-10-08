package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.LzK  reason: case insensitive filesystem */
public final class C65766LzK implements MUK {
    public final /* synthetic */ L7B A00;
    public final /* synthetic */ C18014Vjq A01;
    public final /* synthetic */ C62423KfY A02;

    public final void EzA(Surface surface, int i, int i2) {
        Message obtainMessage;
        int i3;
        Bitmap bitmap;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        C62423KfY kfY = this.A02;
        ConstraintLayout constraintLayout = this.A01.A03;
        kfY.A01 = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        kfY.A00 = height;
        LSQ lsq = kfY.A0G;
        if (lsq != null) {
            lsq.A01 = kfY.A01;
            lsq.A00 = height;
        }
        if (kfY.A03 == 0 || kfY.A02 == 0) {
            kfY.A03 = i;
            kfY.A02 = i2;
            LKG.A00(kfY.A07).A01((Pair) null, new Pair(Integer.valueOf(kfY.A03), Integer.valueOf(kfY.A02)), (Integer) null);
            obtainMessage = kfY.A09.A09.obtainMessage(6, i, i2, (Object) null);
        } else {
            obtainMessage = kfY.A09.A09.obtainMessage(6, i, i2, (Object) null);
        }
        obtainMessage.sendToTarget();
        LSQ lsq2 = kfY.A0G;
        if (lsq2 != null) {
            Surface surface2 = kfY.A09;
            lsq2.A03 = i;
            lsq2.A02 = i2;
            if (lsq2.A0E) {
                lsq2.A04();
                lsq2.A05(surface2);
            }
        }
        kfY.A01 = i;
        kfY.A00 = i2;
        int i4 = kfY.A03;
        if (i == i4 && i2 == (i3 = kfY.A02) && kfY.A0K == AnonymousClass05K.A0N && (bitmap = kfY.A06) != null) {
            Bitmap A002 = 0fO.A00(bitmap, i4, i3, false);
            0qQ.A07(A002);
            Canvas lockCanvas = surface.lockCanvas((Rect) null);
            BlurUtil.blur(A002, 1.0f, AnonymousClass7TE.A05((float) kfY.A03, 0.074074075f));
            lockCanvas.drawBitmap(A002, 0.0f, 0.0f, (Paint) null);
            surface.unlockCanvasAndPost(lockCanvas);
        }
        kfY.A0g.invoke(this.A00.A01, surface, valueOf, valueOf2);
        if (kfY.A09 != surface) {
            kfY.A09 = surface;
            if (!kfY.A0O) {
                C62423KfY.A07(kfY);
            }
        }
    }

    public C65766LzK(L7B l7b, C18014Vjq vjq, C62423KfY kfY) {
        this.A02 = kfY;
        this.A01 = vjq;
        this.A00 = l7b;
    }

    public final void EzC() {
        this.A02.A09 = null;
    }
}
