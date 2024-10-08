package X;

import android.content.DialogInterface;
import com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures;

public final class LUR implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ LPH A01;
    public final /* synthetic */ NonSupportedContentSchedulingFeatures A02;

    public LUR(DialogInterface.OnClickListener onClickListener, LPH lph, NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures) {
        this.A01 = lph;
        this.A02 = nonSupportedContentSchedulingFeatures;
        this.A00 = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        NonSupportedContentSchedulingFeatures nonSupportedContentSchedulingFeatures;
        LPH lph = this.A01;
        if (!(lph == null || (nonSupportedContentSchedulingFeatures = this.A02) == null)) {
            C319116q4.A05(lph, nonSupportedContentSchedulingFeatures);
        }
        this.A00.onClick(dialogInterface, i);
    }
}
