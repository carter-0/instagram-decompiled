package X;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: X.KHy  reason: case insensitive filesystem */
public final class C61690KHy extends LD1 {
    public final int A00;
    public final int A01;
    public final Bitmap A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61690KHy(Bitmap bitmap, View view, float f, float f2) {
        super(view, f, f2);
        0qQ.A0B(bitmap, 4);
        this.A02 = bitmap;
        this.A01 = view.getWidth();
        this.A00 = view.getHeight();
    }
}
