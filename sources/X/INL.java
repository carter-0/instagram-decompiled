package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public final class INL implements AnonymousClass1MK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 0sP A01;

    public final void CyF(C226952iF r10, AnonymousClass3LX r11) {
        0qQ.A0B(r11, 1);
        Bitmap bitmap = r11.A01;
        if (bitmap != null) {
            int i = this.A00;
            0sP r7 = this.A01;
            Bitmap A002 = 0fO.A00(bitmap, i, i, false);
            0qQ.A07(A002);
            Bitmap A0B = AnonymousClass7TF.A0B(A002.getWidth(), A002.getHeight());
            Paint A0V = AnonymousClass7TE.A0V(3);
            Rect rect = new Rect(0, 0, A002.getWidth(), A002.getHeight());
            Canvas canvas = new Canvas(A0B);
            A0V.setAntiAlias(true);
            A0V.getColor();
            C51976G9y.A0O(A002, canvas, A0V, rect);
            r7.invoke(A0B);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public INL(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        0wj.A01.AEf("Exception getting bitmap from user profile image url", 817896325);
    }
}
