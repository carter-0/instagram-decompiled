package X;

import android.graphics.Bitmap;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.PRc  reason: case insensitive filesystem */
public final class C72969PRc implements C13761TgX {
    public final /* synthetic */ AnonymousClass8K4 A00;
    public final /* synthetic */ DirectShareTarget A01;
    public final /* synthetic */ String A02;

    public C72969PRc(AnonymousClass8K4 r1, DirectShareTarget directShareTarget, String str) {
        this.A00 = r1;
        this.A01 = directShareTarget;
        this.A02 = str;
    }

    public final void DJG(Exception exc) {
        String str;
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "Unable to decode image";
        }
        0kD.A01(AnonymousClass8K4.__redex_internal_original_name, str);
    }

    public final void DJH(Bitmap bitmap, C376649Iu r9, int i, boolean z) {
        0nY.A00().ATE(new NST(bitmap, r9, this, i, z));
    }
}
