package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

/* renamed from: X.AuA  reason: case insensitive filesystem */
public final /* synthetic */ class C41450AuA implements C62320sa {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass8K4 A01;
    public final /* synthetic */ C39892ADt A02;
    public final /* synthetic */ Integer A03;

    public /* synthetic */ C41450AuA(Bitmap bitmap, AnonymousClass8K4 r2, C39892ADt aDt, Integer num) {
        this.A01 = r2;
        this.A02 = aDt;
        this.A03 = num;
        this.A00 = bitmap;
    }

    public final Object invoke() {
        Bitmap bitmap;
        AnonymousClass8K4 r6 = this.A01;
        C39892ADt aDt = this.A02;
        Integer num = this.A03;
        Bitmap bitmap2 = this.A00;
        if (!aDt.A01()) {
            return null;
        }
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0N) {
            try {
                AnonymousClass80G r3 = r6.A0E;
                int A022 = (int) (AnonymousClass7TE.A02(r3.A05()) * 0.25f);
                int A032 = (int) (0.25f * AnonymousClass7TE.A03(r3.A05()));
                MultiListenerTextureView multiListenerTextureView = r3.A0D;
                if (multiListenerTextureView != null) {
                    bitmap = multiListenerTextureView.getBitmap(A022, A032);
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    return AnonymousClass8K4.A00(bitmap, bitmap2, (Bitmap) null, r6);
                }
                0kD.A01("PhotoViewController#getScaledMediaScreenshot_mediaScreen_is_null", "Could not obtain bitmap from TextureView");
                return null;
            } catch (OutOfMemoryError e) {
                0kD.A0H("PhotoViewController#getScaledMediaScreenshot_OOM", e);
                throw e;
            }
        } else {
            ADu aDu = (ADu) ADu.A02.getValue();
            Bitmap bitmap3 = aDu.A00;
            aDu.A00 = null;
            return bitmap3;
        }
    }
}
