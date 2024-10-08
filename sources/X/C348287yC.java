package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.CancellationSignal;
import com.instagram.common.gallery.Medium;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.7yC  reason: invalid class name and case insensitive filesystem */
public final class C348287yC implements Runnable {
    public final /* synthetic */ C348297yD A00;
    public final /* synthetic */ C348267yA A01;
    public final /* synthetic */ C355608Qq A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ boolean A05;

    public C348287yC(C348297yD r1, C348267yA r2, C355608Qq r3, Medium medium, WeakReference weakReference, boolean z) {
        this.A05 = z;
        this.A02 = r3;
        this.A03 = medium;
        this.A01 = r2;
        this.A04 = weakReference;
        this.A00 = r1;
    }

    public final void run() {
        C355608Qq r7;
        Medium medium;
        CancellationSignal cancellationSignal;
        WeakReference weakReference;
        if (this.A05) {
            try {
                r7 = this.A02;
                medium = this.A03;
                cancellationSignal = this.A01.A01;
                weakReference = this.A04;
                C348257y9 r0 = (C348257y9) weakReference.get();
                if (r0 != null && r0.CWP(medium)) {
                    File A042 = 0mb.A04(r7.A03);
                    medium.A0a = A042.getPath();
                    C39901AIj.A04(C39901AIj.A00(Bitmap.Config.RGB_565, new Point(r7.A02, r7.A01), new File(medium.A0X), 0), new FileOutputStream(A042));
                    C355608Qq.A09.put(C355608Qq.A01(r7, medium), new C348277yB(medium.A0a, medium.A06));
                    C355608Qq.A03(r7, medium, weakReference);
                    return;
                }
                return;
            } catch (Exception e) {
                if ((e instanceof IOException) || (e instanceof IllegalArgumentException)) {
                    0wb.A07("GalleryThumbnailLoader_loadFirstFrameThumbnail", e);
                    C355608Qq.A02(cancellationSignal, (C348297yD) null, r7, medium, weakReference);
                    return;
                }
                throw e;
            } catch (RuntimeException e2) {
                0wb.A06("GalleryThumbnailLoader", 002.A0R("loadFirstFrameThumbnail failed. file path: ", this.A03.A0X), e2);
            }
        }
        C355608Qq r4 = this.A02;
        Medium medium2 = this.A03;
        C355608Qq.A02(this.A01.A01, this.A00, r4, medium2, this.A04);
    }
}
