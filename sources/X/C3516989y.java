package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.89y  reason: invalid class name and case insensitive filesystem */
public final class C3516989y extends LruCache {
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        0qQ.A0B(bitmap, 1);
        return bitmap.getByteCount();
    }
}
