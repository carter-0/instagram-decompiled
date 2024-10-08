package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.2hF  reason: invalid class name */
public final class AnonymousClass2hF implements AnonymousClass1MK {
    public final /* synthetic */ IgImageView A00;

    public final void CyF(C226952iF r9, AnonymousClass3LX r10) {
        int i;
        int i2;
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        IgImageView igImageView = this.A00;
        if (igImageView.A08 == r9 && !igImageView.A0N) {
            igImageView.A0L = true;
            Bitmap bitmap = r10.A01;
            igImageView.setImageBitmap(bitmap);
            C240963Ni r1 = igImageView.A0D;
            if (r1 != null) {
                String CCJ = r9.BRH().CCJ();
                String str = r10.A04;
                if (bitmap != null) {
                    i = bitmap.getWidth();
                    i2 = bitmap.getHeight();
                } else {
                    i = 0;
                    i2 = 0;
                }
                r1.DO4(new C240983Nk(bitmap, CCJ, str, i, i2));
                1z9 r12 = IgImageView.A0d;
                ImageUrl BGK = r9.BGK();
                0qQ.A07(BGK);
                r12.DJz(BGK);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public AnonymousClass2hF(IgImageView igImageView) {
        this.A00 = igImageView;
    }
}
