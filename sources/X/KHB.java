package X;

import android.net.Uri;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.base.CropInfo;
import java.util.List;
import java.util.Map;

public final class KHB extends 2Cl {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ GalleryItem A01;
    public final /* synthetic */ JX1 A02;
    public final /* synthetic */ C59855JaW A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public final int getRunnableId() {
        return 541;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        JTP.A1U("GalleryPickerView_AlbumImport", exc);
        JX1.A02(this.A02);
    }

    public KHB(Uri uri, GalleryItem galleryItem, JX1 jx1, C59855JaW jaW, AnonymousClass3Q2 r5, List list, boolean z) {
        this.A03 = jaW;
        this.A02 = jx1;
        this.A01 = galleryItem;
        this.A06 = z;
        this.A00 = uri;
        this.A04 = r5;
        this.A05 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.A03.call();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C59861Jad jad = (C59861Jad) obj;
        0qQ.A0B(jad, 0);
        JX1 jx1 = this.A02;
        Map map = jx1.A02;
        GalleryItem galleryItem = this.A01;
        String str = galleryItem.A0A;
        if (!map.containsKey(str) || this.A06) {
            Integer num = null;
            ? obj2 = new Object();
            obj2.A03 = null;
            obj2.A02 = null;
            obj2.A00 = null;
            obj2.A01 = null;
            obj2.A02 = this.A00.getPath();
            obj2.A01 = jad.A01;
            C364808m2 r8 = jad.A02;
            if (r8 != null) {
                num = Integer.valueOf(r8.getWidth());
            }
            if (num != null) {
                int intValue = num.intValue();
                if (r8 != null) {
                    int height = r8.getHeight();
                    if (Integer.valueOf(height) != null) {
                        obj2.A00 = new CropInfo(JW0.A01(r8.getWidth(), r8.getHeight()), intValue, height);
                        jx1.A02.put(str, obj2);
                    }
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        JX1.A01(galleryItem, jx1, this.A04, this.A00.getPath(), this.A05);
    }
}
