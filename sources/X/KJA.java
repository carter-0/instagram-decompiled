package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.instagram.common.typedurl.ImageUrl;

public final class KJA extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ MTS A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJA(Context context, ImageUrl imageUrl, MTS mts, String str, int i, boolean z) {
        super(68, 1, false, true);
        this.A01 = context;
        this.A02 = imageUrl;
        this.A00 = i;
        this.A05 = z;
        this.A04 = str;
        this.A03 = mts;
    }

    public final void run() {
        Bitmap bitmap;
        Context context = this.A01;
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        int i = A0E.widthPixels / 2;
        int i2 = A0E.heightPixels / 2;
        ImageUrl imageUrl = this.A02;
        if (imageUrl != null) {
            bitmap = 1NK.A00().A0G(imageUrl);
        } else {
            bitmap = null;
        }
        LTL.A07(LTL.A01(context, bitmap, i, i2, this.A00, this.A05), this.A03, LTL.A02(this.A04));
    }
}
