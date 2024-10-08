package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import com.instagram.android.R;

public final class KJB extends 0ng {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ MTS A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ int[] A04;
    public final /* synthetic */ int[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJB(Context context, MTS mts, String str, int[] iArr, int[] iArr2, float f) {
        super(69, 2, false, true);
        this.A01 = context;
        this.A04 = iArr;
        this.A05 = iArr2;
        this.A00 = f;
        this.A03 = str;
        this.A02 = mts;
    }

    public final void run() {
        Context context = this.A01;
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        int i = A0E.widthPixels;
        int i2 = A0E.heightPixels;
        int A0A = AnonymousClass7TE.A0A(context);
        int[] iArr = this.A04;
        int length = iArr.length;
        if (length == 2 && iArr[0] == A0A) {
            int i3 = length - 1;
            if (iArr[i3] == A0A) {
                int color = context.getColor(R.color.black);
                iArr[0] = color;
                iArr[i3] = color;
            }
        }
        float f = (float) i;
        int[] iArr2 = this.A05;
        float f2 = (float) i2;
        LinearGradient linearGradient = new LinearGradient(f * ((float) iArr2[0]), f2 * ((float) iArr2[1]), f * ((float) iArr2[2]), f2 * ((float) iArr2[3]), iArr, (float[]) null, Shader.TileMode.CLAMP);
        float f3 = this.A00;
        Bitmap A0B = AnonymousClass7TF.A0B(i, i2);
        Canvas A0B2 = JTO.A0B(A0B);
        Paint A0V = AnonymousClass7TE.A0V(5);
        A0V.setShader(linearGradient);
        Paint A0C = JTO.A0C();
        AnonymousClass7TE.A1N(context, A0C, R.color.sticker_background);
        A0C.setAlpha((int) (f3 * 255.0f));
        A0B2.drawPaint(A0V);
        A0B2.drawPaint(A0C);
        LTL.A07(A0B, this.A02, LTL.A02(this.A03));
    }
}
