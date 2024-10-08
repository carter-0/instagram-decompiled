package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.Sjl  reason: case insensitive filesystem */
public final class C11970Sjl implements C13799ThI {
    public final C11899SiY A00;
    public final ST0 A01;
    public final List A02;

    public final Bitmap ANg(BitmapFactory.Options options) {
        RC9 rc9 = this.A00.A00;
        rc9.reset();
        return BitmapFactory.decodeStream(rc9, (Rect) null, options);
    }

    public final int BGB() {
        List list = this.A02;
        RC9 rc9 = this.A00.A00;
        rc9.reset();
        return SKE.A00(this.A01, rc9, list);
    }

    public final ImageHeaderParser$ImageType BGI() {
        List list = this.A02;
        RC9 rc9 = this.A00.A00;
        rc9.reset();
        return SKE.A01(this.A01, rc9, list);
    }

    public final void EyD() {
        RC9 rc9 = this.A00.A00;
        synchronized (rc9) {
            rc9.A00 = rc9.A05.length;
        }
    }

    public C11970Sjl(ST0 st0, InputStream inputStream, List list) {
        C9217RTu.A00(st0);
        this.A01 = st0;
        C9217RTu.A00(list);
        this.A02 = list;
        this.A00 = new C11899SiY(st0, inputStream);
    }
}
