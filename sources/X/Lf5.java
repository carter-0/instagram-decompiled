package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;

public final class Lf5 implements AnonymousClass1MK {
    public final int A00;
    public final 0sP A01;
    public final /* synthetic */ QuickSnapMediaSaver A02;

    public final void CyF(C226952iF r8, AnonymousClass3LX r9) {
        0qQ.A0B(r9, 1);
        0sP r6 = this.A01;
        Bitmap bitmap = r9.A01;
        int i = this.A00;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            0qQ.A07(createBitmap);
            Bitmap A002 = 0fO.A00(bitmap, i, i, false);
            0qQ.A07(A002);
            Canvas A0B = JTO.A0B(createBitmap);
            A0B.clipPath(I7E.A02(i));
            A0B.drawBitmap(A002, 0.0f, 0.0f, (Paint) null);
            bitmap2 = createBitmap;
        }
        r6.invoke(bitmap2);
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public Lf5(QuickSnapMediaSaver quickSnapMediaSaver, 0sP r2, int i) {
        this.A02 = quickSnapMediaSaver;
        this.A00 = i;
        this.A01 = r2;
    }

    public final void DJx(C226952iF r3, C254673sr r4) {
        this.A01.invoke((Object) null);
    }
}
