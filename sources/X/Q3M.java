package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.meta.foa.cds.CdsBottomSheetTopSpan;

public final class Q3M implements C70652Tj {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ CdsBottomSheetTopSpan A02;

    public Q3M(Context context, CdsBottomSheetTopSpan cdsBottomSheetTopSpan, float f) {
        this.A02 = cdsBottomSheetTopSpan;
        this.A00 = f;
        this.A01 = context;
    }

    public final int Bdk(View view, int i) {
        float f;
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = this.A02;
        if (cdsBottomSheetTopSpan != null) {
            if (cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.Dp) {
                CdsBottomSheetTopSpan.Dp dp = (CdsBottomSheetTopSpan.Dp) cdsBottomSheetTopSpan;
                Context context = this.A01;
                0qQ.A0B(dp, 0);
                i -= (int) TypedValue.applyDimension(1, (float) dp.A00, context.getResources().getDisplayMetrics());
            } else if (cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.ScreenPercent) {
                f = this.A00 - (((CdsBottomSheetTopSpan.ScreenPercent) cdsBottomSheetTopSpan).A00 / 100.0f);
                return (int) (f * ((float) i));
            } else {
                throw new RuntimeException();
            }
        }
        f = this.A00;
        return (int) (f * ((float) i));
    }
}
