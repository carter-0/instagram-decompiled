package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;

public final class Lf0 implements AnonymousClass1MK {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C59990Jcz A01;

    public final void DK4(C226952iF r1, int i) {
    }

    public Lf0(C59990Jcz jcz, long j) {
        this.A01 = jcz;
        this.A00 = j;
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        C59990Jcz jcz = this.A01;
        Bitmap bitmap = r6.A01;
        AnonymousClass4D6 r0 = C59990Jcz.A0A;
        jcz.A00 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        jcz.A01 = bitmapShader;
        jcz.A06.setShader(bitmapShader);
        jcz.A03 = false;
        jcz.A02 = false;
        System.currentTimeMillis();
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getByteCount();
        jcz.invalidateSelf();
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        C59990Jcz jcz = this.A01;
        AnonymousClass4D6 r0 = C59990Jcz.A0A;
        jcz.A03 = false;
        jcz.A02 = true;
        0wb.A03("StaticAnimationDrawableTextureLoadFailed", "failed fetching from IgImageInfra");
        jcz.invalidateSelf();
    }
}
