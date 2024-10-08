package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.2hB  reason: invalid class name and case insensitive filesystem */
public final class C226552hB implements AnonymousClass2hC {
    public final /* synthetic */ IgImageView A00;

    public C226552hB(IgImageView igImageView) {
        this.A00 = igImageView;
    }

    public final void DS7(C226952iF r5, AnonymousClass3LX r6) {
        Bitmap bitmap = r6.A01;
        IgImageView igImageView = this.A00;
        if (igImageView.A09 == r5 && bitmap != null && !igImageView.A0L) {
            igImageView.setImageBitmap(bitmap);
            C242533Um r1 = igImageView.A0F;
            if (r1 != null) {
                r5.BRH().CCJ();
                bitmap.getWidth();
                bitmap.getHeight();
                IgProgressImageView.A02(((C242523Ul) r1).A00, AnonymousClass05K.A01);
            }
            igImageView.A0O = true;
        }
    }
}
