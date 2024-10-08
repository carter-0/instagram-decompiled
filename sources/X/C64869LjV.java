package X;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;

/* renamed from: X.LjV  reason: case insensitive filesystem */
public final class C64869LjV implements C226632hb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C358248ab A01;

    public C64869LjV(C358248ab r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final Bitmap renderImage(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        float A012 = JTO.A01(bitmap) / JTO.A02(bitmap);
        int A002 = (int) C295305nv.A00(this.A01.A0Q, 136);
        int i = this.A00;
        int i2 = (int) (A012 * ((float) i));
        if (i2 <= A002) {
            A002 = i2;
        }
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, A002);
        if (extractThumbnail != null) {
            return extractThumbnail;
        }
        return bitmap;
    }
}
