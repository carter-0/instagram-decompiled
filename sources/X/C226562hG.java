package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.2hG  reason: invalid class name and case insensitive filesystem */
public final class C226562hG implements AnonymousClass1MK {
    public final /* synthetic */ IgImageView A00;

    public final void CyF(C226952iF r10, AnonymousClass3LX r11) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        IgImageView igImageView = this.A00;
        if (igImageView.A09 == r10) {
            AnonymousClass0iw r0 = igImageView.A07;
            if (r0 != null) {
                r0.getModuleName();
            }
            String str = r11.A04;
            igImageView.A0J = str;
            Bitmap bitmap = r11.A01;
            igImageView.A06 = bitmap;
            igImageView.A0a.set(-1);
            if (bitmap != null) {
                ImageUrl BGK = r10.BGK();
                0qQ.A07(BGK);
                IgImageView.A02(bitmap, igImageView.A07, BGK, igImageView, str, r11.A00);
                C240963Ni r1 = igImageView.A0E;
                if (r1 != null) {
                    r1.DO4(new C240983Nk(bitmap, r10.BRH().CCJ(), str, bitmap.getWidth(), bitmap.getHeight()));
                }
            } else {
                throw new IllegalStateException("info.bitmap should not be null in IgImageInfra.CacheCallback::onBitmapLoaded");
            }
        }
        ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
        if (imagePerformanceProvider != null) {
            imagePerformanceProvider.onImageSuccess(r10.AjI());
        }
    }

    public final void DJx(C226952iF r8, C254673sr r9) {
        0qQ.A0B(r8, 0);
        IgImageView igImageView = this.A00;
        if (igImageView.A09 == r8) {
            if (!igImageView.A0L) {
                igImageView.A0B();
            }
            C240963Ni r0 = igImageView.A0E;
            if (r0 != null) {
                r0.DEN();
            }
            if (r9 != null) {
                1z9 r02 = IgImageView.A0d;
                ImageUrl BGK = r8.BGK();
                0qQ.A07(BGK);
                String str = r9.A02;
                int i = r9.A00;
                r02.DK1(igImageView.A07, r9.A01, BGK, str, r9.A03, i);
                ImagePerformanceProvider imagePerformanceProvider = IgImageView.A0e;
                if (imagePerformanceProvider != null) {
                    imagePerformanceProvider.onImageFailure(r8.AjI(), r9);
                }
            }
        }
    }

    public final void DK4(C226952iF r4, int i) {
        C242483Uh r0;
        0qQ.A0B(r4, 0);
        IgImageView igImageView = this.A00;
        if (!igImageView.A0N && igImageView.A09 == r4 && (r0 = igImageView.A0G) != null) {
            IgProgressImageView igProgressImageView = ((C242473Ug) r0).A00;
            if (igProgressImageView.getProgressBar().isIndeterminate()) {
                igProgressImageView.setProgressBarIndeterminate(false);
            }
            igProgressImageView.getProgressBar().setProgress(i);
        }
    }

    public C226562hG(IgImageView igImageView) {
        this.A00 = igImageView;
    }
}
