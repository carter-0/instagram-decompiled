package X;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;

/* renamed from: X.LjA  reason: case insensitive filesystem */
public final class C64848LjA implements C247993hF {
    public static final C64848LjA A00 = new Object();

    public final void Dgy(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT >= 34 && !bitmap.hasGainmap() && AnonymousClass7TF.A1Z(C247933h9.A03)) {
            double random = Math.random();
            AnonymousClass0eM r3 = C247933h9.A00;
            boolean A1T = C51970G9q.A1T((random > ((double) AnonymousClass7TE.A04(r3.getValue())) ? 1 : (random == ((double) AnonymousClass7TE.A04(r3.getValue())) ? 0 : -1)));
            ((Number) r3.getValue()).floatValue();
            if (A1T) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / 4, bitmap.getHeight() / 4, Bitmap.Config.ALPHA_8);
                0qQ.A07(createBitmap);
                bitmap.setGainmap(new Gainmap(createBitmap));
            }
        }
    }
}
