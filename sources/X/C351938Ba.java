package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;

/* renamed from: X.8Ba  reason: invalid class name and case insensitive filesystem */
public final class C351938Ba extends C255963v0 {
    public final boolean FHR(ReboundViewPager reboundViewPager, float f, float f2) {
        View view = reboundViewPager.A0F;
        0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette");
        ColorPalette colorPalette = (ColorPalette) view;
        if (f2 < colorPalette.A01 || f2 > colorPalette.A00) {
            return false;
        }
        return true;
    }
}
