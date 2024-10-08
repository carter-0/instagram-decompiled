package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.LjQ  reason: case insensitive filesystem */
public final class C64864LjQ implements C262424Dq {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C64864LjQ(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void CyE(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (this.A00 != 0) {
            OHY ohy = (OHY) this.A01;
            C262224Cq r0 = ohy.A01;
            if (r0 != null) {
                AnonymousClass7TE.A1Z(new C66173MGk(bitmap2, ohy, this.A02, (AnonymousClass4D7) null, 15), r0);
                return;
            }
            return;
        }
        C59973Jci jci = (C59973Jci) this.A01;
        String str = this.A02;
        0qQ.A0A(bitmap);
        jci.A00 = str;
        Paint paint = jci.A02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        jci.invalidateSelf();
    }
}
