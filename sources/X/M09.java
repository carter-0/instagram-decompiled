package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public final class M09 implements C13761TgX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MUR A01;

    public M09(UserSession userSession, MUR mur) {
        this.A00 = userSession;
        this.A01 = mur;
    }

    public final void DJG(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "decoding high quality bitmap can be null in HighQualityBitmapManager";
        }
        0wb.A04("MediaCaptureUtil", message, 1);
        this.A01.DX1(exc);
    }

    public final void DJH(Bitmap bitmap, C376649Iu r10, int i, boolean z) {
        0nY.A00().ATE(new KJE(bitmap, r10, this.A00, this.A01, i, z));
    }
}
