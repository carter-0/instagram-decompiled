package X;

import android.graphics.Bitmap;
import com.facebook.common.stringformat.StringFormatUtil;

public final class AZQ implements C226632hb {
    public final /* synthetic */ DUI A00;

    public AZQ(DUI dui) {
        this.A00 = dui;
    }

    public final Bitmap renderImage(Bitmap bitmap) {
        IllegalStateException illegalStateException;
        0qQ.A0B(bitmap, 0);
        try {
            DUI dui = this.A00;
            Integer Byw = dui.Byw();
            if (Byw != null) {
                int intValue = Byw.intValue();
                Integer Byy = dui.Byy();
                if (Byy != null) {
                    int intValue2 = Byy.intValue();
                    Integer CGY = dui.CGY();
                    if (CGY != null) {
                        int intValue3 = CGY.intValue();
                        Integer BCu = dui.BCu();
                        if (BCu != null) {
                            int intValue4 = BCu.intValue();
                            0fO.A03(bitmap);
                            return Bitmap.createBitmap(bitmap, intValue, intValue2, intValue3, intValue4);
                        }
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            }
            throw illegalStateException;
        } catch (IllegalArgumentException unused) {
            DUI dui2 = this.A00;
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Passed Arguments: %d, %d, %d, %d, %d, %d.", new Object[]{dui2.Byw(), dui2.Byy(), dui2.CGY(), dui2.BCu(), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())});
            0qQ.A07(formatStrLocaleSafe);
            0wb.A03("StoryImageCropOptimization#createBitmapWithCroppingValues", formatStrLocaleSafe);
            return bitmap;
        }
    }
}
