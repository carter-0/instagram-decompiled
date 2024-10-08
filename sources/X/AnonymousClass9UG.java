package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.9UG  reason: invalid class name */
public final class AnonymousClass9UG implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass3LX A01;

    public AnonymousClass9UG(C226952iF r1, AnonymousClass3LX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        Bitmap bitmap;
        Object C3s = this.A00.C3s();
        if (C3s != null) {
            C379439Tx r1 = (C379439Tx) C3s;
            C348257y9 r4 = (C348257y9) r1.A01.get();
            Medium medium = r1.A00;
            if (r4 != null && r4.CWP(medium) && (bitmap = this.A01.A01) != null) {
                r4.DrQ(bitmap, medium, false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
