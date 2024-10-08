package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import java.io.File;

public final class KJ5 extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ MTX A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ int[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJ5(Context context, MTX mtx, Integer num, int[] iArr) {
        super(89, 3, false, false);
        this.A00 = context;
        this.A02 = num;
        this.A03 = iArr;
        this.A01 = mtx;
    }

    public final void run() {
        Context context = this.A00;
        int A012 = AnonymousClass8XF.A01(context);
        int A002 = AnonymousClass8XF.A00(context);
        String A0e = 002.A0e("share_sticker_", ".jpg", System.currentTimeMillis());
        String A022 = 2RR.A02(context, false);
        AnonymousClass7TE.A0t(A022).mkdirs();
        File file = new File(A022, A0e);
        Bitmap A0B = AnonymousClass7TF.A0B(A012, A002);
        Canvas A0B2 = JTO.A0B(A0B);
        Paint A0V = AnonymousClass7TE.A0V(4);
        Integer num = this.A02;
        int[] iArr = this.A03;
        float f = (float) A002;
        float f2 = 0.0f;
        if (num.intValue() != 0) {
            f2 = (float) A012;
        }
        A0V.setShader(new LinearGradient(0.0f, 0.0f, f2, f, iArr, (float[]) null, Shader.TileMode.CLAMP));
        A0B2.drawPaint(A0V);
        try {
            JZK.A00(Bitmap.CompressFormat.JPEG, A0B, JTO.A0t(file));
            this.A01.Dob(file);
        } catch (Exception e) {
            JTP.A1U("unable to create sticker background input file", e);
            11Z.A02(new C65968M6f(this.A01, e));
        }
    }
}
