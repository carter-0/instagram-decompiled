package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import com.instagram.android.R;

/* renamed from: X.Uo4  reason: case insensitive filesystem */
public final class C16077Uo4 extends U0Z {
    public static Bitmap A02;
    public final int A00 = AnonymousClass1GB.A01(this.A02);
    public final C14659U0f A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16077Uo4(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        C14659U0f u0f = new C14659U0f(context);
        this.A01 = u0f;
        Bitmap bitmap = A02;
        if (bitmap == null) {
            bitmap = AnonymousClass6MX.A00(AnonymousClass7TF.A0A(context), R.drawable.instagram_save_pano_filled_16);
            A02 = bitmap;
        }
        u0f.A00 = bitmap;
        u0f.invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C14659U0f u0f = this.A01;
        u0f.setBounds(getBounds());
        u0f.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
