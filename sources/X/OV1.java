package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.modal.TransparentModalActivity;

public final class OV1 {
    public final OIB A00;

    public final void A01() {
        OIB oib = this.A00;
        Activity activity = oib.A00;
        if (activity != null) {
            boolean equals = oib.A06.equals(1iA.A0a);
            BackgroundGradientColors A002 = C39581A0x.A00(oib.A03, AnonymousClass7TE.A0t(oib.A08), equals);
            LTL.A05(activity, new FZB(this, 3), 2RR.A02(activity, false), 0.2f, A002.A01, A002.A00, false);
        }
    }

    public OV1(OIB oib) {
        this.A00 = oib;
    }

    public static final void A00(OV1 ov1) {
        boolean equals;
        Bundle A0a = AnonymousClass7TE.A0a();
        OIB oib = ov1.A00;
        A0a.putSerializable("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_ENTRY_POINT", oib.A02);
        A0a.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_MESSAGE_ID", oib.A09);
        A0a.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_SENDER_ID", oib.A0B);
        A0a.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_MEDIA_FILE_PATH", oib.A08);
        A0a.putInt("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_MEDIA_FILE_TYPE", oib.A06.A00);
        String str = oib.A07;
        if (str == null) {
            str = oib.A08;
        }
        A0a.putString("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_PRESET_MEDIUM_FILE_PATH", str);
        if (oib.A07 != null) {
            equals = false;
        } else {
            equals = oib.A06.equals(1iA.A0a);
        }
        A0a.putBoolean("ReelDirectVisualMessageShareCameraFragment.ARGUMENTS_KEY_PRESET_MEDIUM_IS_VIDEO", equals);
        OMU omu = oib.A04;
        if (omu != null) {
            omu.A00();
        }
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(oib.A00, A0a, oib.A03, TransparentModalActivity.class, C273654mx.A00(3216));
        A02.A0E(oib.A05);
        A02.A0C(oib.A00);
    }
}
