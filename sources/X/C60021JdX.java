package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.JdX  reason: case insensitive filesystem */
public final class C60021JdX extends LruCache {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60021JdX(LP1 lp1, int i, int i2) {
        super(i);
        this.A00 = i2;
        this.A01 = lp1;
    }

    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount();
    }
}
