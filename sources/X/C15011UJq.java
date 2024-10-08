package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* renamed from: X.UJq  reason: case insensitive filesystem */
public final class C15011UJq extends C268764dx {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Paint A03;

    public C15011UJq() {
        this(0, 0, 7);
    }

    public /* synthetic */ C15011UJq(int i, int i2, int i3) {
        float f = 0.0f;
        i = (i3 & 1) != 0 ? 20 : i;
        f = (i3 & 2) != 0 ? 4.0f : f;
        i2 = (i3 & 4) != 0 ? 335544320 : i2;
        this.A01 = i;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = JTP.A0D();
        StringBuilder sb = new StringBuilder();
        sb.append("tintblur:radius=");
        sb.append(i);
        sb.append(":downscale=");
        sb.append(f);
        sb.toString().getClass();
    }

    public final C249903kY A00(Bitmap bitmap, AnonymousClass1TV r10) {
        AnonymousClass7TF.A1H(bitmap, r10);
        float f = this.A00;
        C249903kY A002 = r10.A00(Bitmap.Config.ARGB_8888, (int) (((float) bitmap.getWidth()) / f), (int) (((float) bitmap.getHeight()) / f));
        try {
            Bitmap bitmap2 = (Bitmap) A002.A05();
            Canvas canvas = new Canvas(bitmap2);
            Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
            Paint paint = this.A03;
            paint.setColorFilter(new PorterDuffColorFilter(this.A02, PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            int i = this.A01;
            NativeBlurFilter nativeBlurFilter = NativeBlurFilter.$redex_init_class;
            boolean z = true;
            if (i <= 0) {
                z = false;
            }
            Pxe.A1Z(z);
            NativeBlurFilter.nativeIterativeBoxBlur(bitmap2, 2, i);
            C249903kY A032 = A002.A03();
            A002.close();
            return A032;
        } catch (Throwable th) {
            C249903kY.A01(A002);
            throw th;
        }
    }
}
