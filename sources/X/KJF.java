package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;

public final class KJF extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ DisplayMetrics A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ MTS A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJF(DisplayMetrics displayMetrics, ImageUrl imageUrl, MTS mts, String str, int i, int i2, int i3) {
        super(659747612, 1, false, true);
        this.A03 = displayMetrics;
        this.A04 = imageUrl;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = str;
        this.A05 = mts;
        this.A02 = i3;
    }

    public final void run() {
        Bitmap A0B;
        DisplayMetrics displayMetrics = this.A03;
        int i = displayMetrics.widthPixels / 4;
        int i2 = displayMetrics.heightPixels / 4;
        Bitmap A0H = 1NK.A00().A0H(this.A04, "MediaBackgroundGenerator");
        if (A0H != null) {
            A0B = 1MF.A09(A0H, i, i2, 0, false);
            BlurUtil.blurInPlace(A0B, this.A00);
            Canvas A0B2 = JTO.A0B(A0B);
            Paint A0C = JTO.A0C();
            A0C.setColor(this.A02);
            A0C.setAlpha(51);
            A0B2.drawPaint(A0C);
        } else {
            int i3 = this.A01;
            A0B = AnonymousClass7TF.A0B(i, i2);
            JTO.A0B(A0B).drawColor(i3);
        }
        LTL.A07(A0B, this.A05, LTL.A02(this.A06));
    }
}
