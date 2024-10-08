package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.IHp  reason: case insensitive filesystem */
public final class C56920IHp implements AnonymousClass579 {
    public final 0sP A00;

    public final void DEi(Drawable drawable, Throwable th, long j) {
    }

    public final void DLP(long j, Throwable th) {
    }

    public final void DLR(C240493Lc r1, long j) {
    }

    public final void DXM(Drawable drawable, long j) {
    }

    public final void Dd0(long j) {
    }

    public final void Dny(long j, Object obj) {
    }

    public final void DFY(Drawable drawable, C240493Lc r4, int i, long j) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap = null;
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        this.A00.invoke(bitmap);
    }

    public C56920IHp(0sP r1) {
        this.A00 = r1;
    }
}
