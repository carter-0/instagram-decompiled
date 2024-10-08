package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.7y8  reason: invalid class name and case insensitive filesystem */
public final class C348247y8 implements C348257y9 {
    public final /* synthetic */ AnonymousClass8XG A00;

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        return 0qQ.A0K(this.A00.A00, medium);
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        0qQ.A0B(medium, 0);
        0qQ.A0B(bitmap, 2);
        AnonymousClass8XG r1 = this.A00;
        r1.galleryButtonMediumThumbnailLoaderListener = null;
        int i = medium.A07;
        C348417yP r2 = new C348417yP(r1.A06, bitmap, (float) r1.A03, (float) r1.A04, r1.A05, i, r1.A0F);
        r1.A02 = new WeakReference(r2);
        r1.A0A.EZd(r2);
        Iterator it = r1.A0E.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onDrawableUpdate");
        }
        String str = medium.A0a;
        if (str != null && str.length() != 0 && !0qQ.A0K(C353238Gu.A00, str)) {
            0xa A002 = C353238Gu.A00();
            0qQ.A0A(A002);
            0xY AR4 = A002.AR4();
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                C353258Gx.A00(A0A, medium);
                A0A.close();
                AR4.E5g("GalleryThumbnailMedium", stringWriter.toString());
                AR4.apply();
                C353238Gu.A00 = str;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to serialize medium: ");
                sb.append(medium);
                0kD.A0A("GalleryThumbnailCacheUtil", sb.toString(), e);
            }
        }
    }

    public C348247y8(AnonymousClass8XG r1) {
        this.A00 = r1;
    }

    public final void DLY(Medium medium, String str) {
        AnonymousClass8XG r2 = this.A00;
        r2.galleryButtonMediumThumbnailLoaderListener = null;
        r2.A0A.EZd(r2.A07);
        Iterator it = r2.A0E.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onDrawableUpdate");
        }
    }
}
