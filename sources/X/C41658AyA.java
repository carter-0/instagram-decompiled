package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.AyA  reason: case insensitive filesystem */
public final class C41658AyA extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Canvas A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41658AyA(Canvas canvas, float f) {
        super(1);
        this.A01 = canvas;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        0qQ.A0B(bitmap, 0);
        this.A01.drawBitmap(bitmap, -this.A00, 0.0f, (Paint) null);
        return C60340gF.A00;
    }
}
