package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* renamed from: X.8kn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C364058kn implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass8GD A01;

    public /* synthetic */ C364058kn(Bitmap bitmap, AnonymousClass8GD r2) {
        this.A00 = bitmap;
        this.A01 = r2;
    }

    public final void onPixelCopyFinished(int i) {
        Bitmap bitmap = this.A00;
        AnonymousClass8GD r1 = this.A01;
        if (i != 0) {
            bitmap.eraseColor(-12303292);
        }
        r1.A02(bitmap);
    }
}
