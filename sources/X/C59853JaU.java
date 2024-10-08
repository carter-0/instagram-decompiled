package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JaU  reason: case insensitive filesystem */
public final class C59853JaU {
    public static boolean A00;
    public static final C59853JaU A01 = new Object();

    public static final void A00(C59898JbN jbN, GalleryPickerMediaOverlayView galleryPickerMediaOverlayView) {
        Integer num;
        galleryPickerMediaOverlayView.setMediaIconType(jbN);
        if (jbN.ordinal() == 3) {
            num = Integer.valueOf(R.drawable.instagram_glasses_pano_outline_24);
        } else {
            num = null;
        }
        if (num == null) {
            galleryPickerMediaOverlayView.A01 = null;
            return;
        }
        Drawable drawable = galleryPickerMediaOverlayView.getContext().getDrawable(num.intValue());
        if (drawable != null) {
            drawable.setColorFilter(C9162RRn.A00(AnonymousClass05K.A0j, galleryPickerMediaOverlayView.getResources().getColor(R.color.canvas_bottom_sheet_description_text_color, (Resources.Theme) null)));
        }
        galleryPickerMediaOverlayView.A01 = drawable;
        if (jbN == C59898JbN.GLASSES_CAPTURE) {
            galleryPickerMediaOverlayView.A08 = true;
        }
    }
}
