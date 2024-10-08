package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KIt  reason: case insensitive filesystem */
public final class C61703KIt extends 0ng {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ MTS A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61703KIt(ImageUrl imageUrl, MTS mts, String str) {
        super(69, 2, false, true);
        this.A00 = imageUrl;
        this.A02 = str;
        this.A01 = mts;
    }

    public final void run() {
        Bitmap A0H = 1NK.A00().A0H(this.A00, (String) null);
        if (A0H != null) {
            LTL.A07(A0H, this.A01, LTL.A02(this.A02));
            return;
        }
        this.A01.onFailure(new Exception("Error in loading image from URL"));
    }
}
