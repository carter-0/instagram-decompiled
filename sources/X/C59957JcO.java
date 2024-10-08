package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.JcO  reason: case insensitive filesystem */
public final class C59957JcO extends LruCache {
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        C51965G9l.A1U(obj);
        Bitmap bitmap = (Bitmap) obj2;
        0qQ.A0B(bitmap, 1);
        return bitmap.getByteCount();
    }

    public C59957JcO(int i) {
        super(i);
    }
}
