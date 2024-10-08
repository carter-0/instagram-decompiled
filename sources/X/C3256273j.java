package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.73j  reason: invalid class name and case insensitive filesystem */
public final class C3256273j extends 0ng {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C3256173i A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3256273j(Activity activity, C3256173i r3, String str) {
        super(693);
        this.A02 = str;
        this.A00 = activity;
        this.A01 = r3;
    }

    public final void run() {
        1NK A002 = 1NK.A00();
        int i = 0;
        do {
            String str = this.A02;
            Bitmap A0H = A002.A0H(new SimpleImageUrl(str), C66579MXk.A00(756));
            if (A0H == null || A0H.getByteCount() <= 0) {
                i++;
            } else {
                this.A00.runOnUiThread(new C66035M8u(A0H, this.A01, str));
                return;
            }
        } while (i < 3);
    }
}
