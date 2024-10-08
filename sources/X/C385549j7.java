package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* renamed from: X.9j7  reason: invalid class name and case insensitive filesystem */
public final class C385549j7 extends AnonymousClass2i7 {
    public final /* synthetic */ 1Mn A00;
    public final /* synthetic */ WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C385549j7(Bitmap bitmap, C376649Iu r11, 1Mn r12, String str, WeakReference weakReference, float f, int i, int i2, int i3, int i4) {
        super(bitmap, r11, str, f, i, i2, i3, i4);
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
