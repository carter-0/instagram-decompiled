package X;

import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LiG  reason: case insensitive filesystem */
public final class C64796LiG implements C232262tL {
    public final GalleryGridFormat A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public C64796LiG(GalleryGridFormat galleryGridFormat, Integer num, List list) {
        0qQ.A0B(num, 3);
        this.A03 = list;
        this.A00 = galleryGridFormat;
        this.A01 = num;
        StringBuilder sb = new StringBuilder("ids:");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(JTO.A0W(it).A05);
            sb.append(",");
        }
        String A0l = AnonymousClass7TF.A0l(this.A00.name(), sb);
        0qQ.A07(A0l);
        this.A02 = A0l;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64796LiG liG = (C64796LiG) obj;
        0qQ.A0B(liG, 0);
        if (0qQ.A0K(this.A03, liG.A03) && this.A00 == liG.A00 && this.A01 == liG.A01) {
            return true;
        }
        return false;
    }
}
