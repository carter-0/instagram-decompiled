package X;

import android.graphics.Bitmap;

public final class IQ8 implements B2Y {
    public final /* synthetic */ C53151GjN A00;

    public IQ8(C53151GjN gjN) {
        this.A00 = gjN;
    }

    public final /* bridge */ /* synthetic */ boolean CWQ(Object obj) {
        return 0qQ.A0K(this.A00.A00, obj);
    }

    public final void DrP(C254673sr r4) {
        String str;
        if (r4 != null) {
            str = r4.A02;
        } else {
            str = null;
        }
        0kD.A06(C53081GiF.__redex_internal_original_name, 002.A0R("Thumbnail load failed in ClipsDraftsSeeAllAdapter#bindThumbnail. Reason: ", str), (Throwable) null);
    }

    public final /* bridge */ /* synthetic */ void DrS(Bitmap bitmap, Object obj) {
        this.A00.A03.setImageBitmap(bitmap);
    }
}
