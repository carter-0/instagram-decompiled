package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ks4  reason: case insensitive filesystem */
public abstract class C63136Ks4 {
    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    public static final void A00(Context context, UserSession userSession, C3499682q r20, ArrayList arrayList) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        if (arrayList.size() != 1) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator A1G = AnonymousClass7TE.A1G(arrayList);
            while (A1G.hasNext()) {
                A1C.add(JTR.A0f((Medium) AnonymousClass7TF.A0a(A1G)));
            }
            Map map = JWX.A00(userSession2).A04;
            HashMap A1E = AnonymousClass7TE.A1E();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Iterator A1G2 = AnonymousClass7TE.A1G(arrayList);
            while (A1G2.hasNext()) {
                Medium medium = (Medium) AnonymousClass7TF.A0a(A1G2);
                GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) map.get(String.valueOf(medium.A05));
                GalleryPreviewInfo galleryPreviewInfo2 = galleryPreviewInfo;
                if (galleryPreviewInfo == null) {
                    ? obj = new Object();
                    obj.A03 = null;
                    obj.A02 = null;
                    obj.A00 = null;
                    obj.A01 = null;
                    obj.A02 = 0mb.A04(context).getAbsolutePath();
                    galleryPreviewInfo2 = obj;
                }
                ExifImageData exifImageData = new ExifImageData();
                double[] A07 = medium.A07(JTP.A0B(context));
                if (A07 != null) {
                    exifImageData.A02 = Double.valueOf(A07[0]);
                    exifImageData.A01 = Double.valueOf(A07[1]);
                }
                exifImageData.A00 = medium.A07;
                galleryPreviewInfo2.A01 = exifImageData;
                float AAx = r20.AAx();
                int i = medium.A0B;
                int i2 = medium.A04;
                if (medium.A05() && (i == 0 || i2 == 0)) {
                    BitmapFactory.decodeFile(medium.A0X, options);
                    i = options.outWidth;
                    i2 = options.outHeight;
                }
                galleryPreviewInfo2.A00 = C364818m3.A00((Rect) null, AAx, i, i2, exifImageData.A00, false);
                A1E.put(String.valueOf(medium.A05), galleryPreviewInfo2);
            }
            map.clear();
            map.putAll(A1E);
        }
    }
}
