package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* renamed from: X.2ky  reason: invalid class name and case insensitive filesystem */
public final class C228212ky extends AnonymousClass2i7 {
    public final /* synthetic */ 1Nl A00;
    public final /* synthetic */ WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C228212ky(Bitmap bitmap, C376649Iu r11, 1Nl r12, String str, WeakReference weakReference, int i, int i2, int i3, int i4) {
        super(bitmap, r11, str, -1.0f, i, i2, i3, i4);
        this.A00 = r12;
        this.A01 = weakReference;
    }

    public final Bitmap A00() {
        if (1Mn.A08) {
            return this.A00;
        }
        return (Bitmap) this.A01.get();
    }
}
