package X;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.Lgq  reason: case insensitive filesystem */
public final class C64717Lgq implements C348257y9 {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C59996Jd5 A01;

    public final boolean CWP(Medium medium) {
        return true;
    }

    public final void DLY(Medium medium, String str) {
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        0qQ.A0B(bitmap, 2);
        C59996Jd5 jd5 = this.A01;
        int i = jd5.A02;
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, i, i);
        0qQ.A07(extractThumbnail);
        AnonymousClass8DV r2 = new AnonymousClass8DV(jd5.A05.getResources(), extractThumbnail);
        r2.A02(0.0f);
        r2.A08.setAntiAlias(true);
        r2.invalidateSelf();
        int i2 = (int) this.A00;
        int i3 = i + i2;
        r2.setBounds(i2, i2, i3, i3);
        List list = jd5.A08;
        list.add(r2);
        if (list.size() >= 2) {
            jd5.invalidateSelf();
        }
    }

    public C64717Lgq(C59996Jd5 jd5, float f) {
        this.A01 = jd5;
        this.A00 = f;
    }
}
