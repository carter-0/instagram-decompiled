package X;

import android.os.SystemClock;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Mfc  reason: case insensitive filesystem */
public final class C66943Mfc {
    public final long A00 = (SystemClock.elapsedRealtime() + 20000);
    public final ImageUrl A01;
    public final AnonymousClass0eM A02;

    public C66943Mfc(ImageUrl imageUrl, String str) {
        this.A01 = imageUrl;
        this.A02 = AnonymousClass0eN.A00(0eO.A03, new C73669Phi(str, this, 44));
    }
}
