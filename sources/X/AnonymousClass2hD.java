package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.2hD  reason: invalid class name */
public final class AnonymousClass2hD implements AnonymousClass2hE {
    public final /* synthetic */ IgImageView A00;

    public AnonymousClass2hD(IgImageView igImageView) {
        this.A00 = igImageView;
    }

    public final boolean Ca4(C226952iF r3) {
        IgImageView igImageView = this.A00;
        if (igImageView.A09 != r3) {
            return false;
        }
        if (IgImageView.A0h || !igImageView.A0L) {
            return true;
        }
        return false;
    }

    public final void DaX(C226952iF r4, AnonymousClass3LX r5, int i) {
        Bitmap bitmap = r5.A01;
        IgImageView igImageView = this.A00;
        if (igImageView.A09 == r4 && bitmap != null) {
            if (!igImageView.A0L) {
                igImageView.A0a.set(i);
                IgImageView.A03(bitmap, igImageView);
                C242513Uk r0 = igImageView.A0H;
                if (r0 != null) {
                    r0.DaN(i);
                }
            }
            if (i == 4) {
                1z9 r1 = IgImageView.A0d;
                ImageUrl BRH = r4.BRH();
                0qQ.A07(BRH);
                r1.DJr(BRH);
            }
            if (igImageView.A0L && IgImageView.A0c != null) {
                igImageView.invalidate();
            }
        }
    }
}
