package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.KsK  reason: case insensitive filesystem */
public abstract class C63151KsK {
    public static final void A00(C60697Jpi jpi, C361728gh r5, C361698ge r6) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) jpi.A0A.getDrawable();
        if (bitmapDrawable != null) {
            boolean z = r5.A08;
            if (z) {
                jpi.A01 = true;
            }
            GalleryItem galleryItem = r5.A03;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            0qQ.A07(bitmap);
            r6.DMR(galleryItem, new C59787JYg(bitmap), jpi.getAbsoluteAdapterPosition(), z);
            return;
        }
        r6.DMR(r5.A03, C65122Lnk.A00, jpi.getAbsoluteAdapterPosition(), r5.A08);
    }
}
