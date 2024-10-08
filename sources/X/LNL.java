package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

public final class LNL {
    public static final LNL A00 = new Object();

    public final boolean A00(Bitmap bitmap, ConstraintLayout constraintLayout, AnonymousClass9I9 r18, C376529Ii r19, GalleryItem galleryItem, C59851JaS jaS, C59738JVw jVw, String str, boolean z, boolean z2) {
        ColorFilter colorFilter;
        C59851JaS jaS2 = jaS;
        C59738JVw jVw2 = jVw;
        AnonymousClass7TF.A1B(jVw2, 1, jaS2);
        AnonymousClass9I9 r0 = r18;
        0qQ.A0B(r0, 6);
        ConstraintLayout constraintLayout2 = constraintLayout;
        constraintLayout2.setEnabled(true);
        GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = jaS2.A00;
        galleryPickerMediaOverlayView.A09 = z2;
        galleryPickerMediaOverlayView.A0A = false;
        galleryPickerMediaOverlayView.A05 = false;
        C321486uG r7 = galleryPickerMediaOverlayView.A0C.A00;
        r7.A00(r0.A00 + 1);
        r7.A04 = r0.A02;
        r7.invalidateSelf();
        galleryPickerMediaOverlayView.A06 = r0.A02;
        boolean z3 = r0.A04;
        galleryPickerMediaOverlayView.A07 = z3;
        galleryPickerMediaOverlayView.A00 = bitmap;
        galleryPickerMediaOverlayView.A04 = str;
        galleryPickerMediaOverlayView.invalidate();
        boolean A1U = C51970G9q.A1U(z3 ? 1 : 0);
        IgImageView igImageView = jVw2.A07;
        if (A1U) {
            colorFilter = jVw2.A00;
        } else {
            colorFilter = null;
        }
        igImageView.setColorFilter(colorFilter);
        GalleryItem galleryItem2 = galleryItem;
        constraintLayout2.setContentDescription(C59848JaO.A00(AnonymousClass7TE.A0S(constraintLayout2), galleryItem2.A00, r0.A00, r0.A01, galleryItem2.A01(), galleryItem2.A06(), galleryPickerMediaOverlayView.A09));
        if (!z && galleryPickerMediaOverlayView.A06 == r0.A02 && galleryPickerMediaOverlayView.A07 == z3) {
            return false;
        }
        galleryPickerMediaOverlayView.A0B = false;
        galleryPickerMediaOverlayView.invalidate();
        JXQ.A02(r19, jVw2);
        constraintLayout2.invalidate();
        return true;
    }
}
