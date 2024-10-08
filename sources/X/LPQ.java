package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;

public abstract class LPQ {
    public static K79 A00(C59725JVj jVj, UserSession userSession, C279284yO r6, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, C312266e6 r8, boolean z) {
        K79 k79 = new K79();
        Bundle A09 = DbY.A09(userSession);
        A09.putParcelable("ar_effect_bottom_sheet_info", effectInfoBottomSheetConfiguration);
        A09.putSerializable("ar_effect_surface", jVj);
        A09.putBoolean("ar_effect_is_e2ee_mandated", z);
        if (r6 != null) {
            A09.putString("camera_destination", r6.A02);
        }
        k79.setArguments(A09);
        k79.A02 = r8;
        return k79;
    }

    public static void A01(Context context) {
        AnonymousClass37D A02 = AnonymousClass37D.A00.A02(context);
        if (A02 != null && (A02.A09() instanceof K79)) {
            A02.A0B();
        }
    }

    public static void A02(Context context, C59725JVj jVj, UserSession userSession, C279284yO r12, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, C312266e6 r14, C273414mX r15) {
        if (context != null) {
            EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration2 = effectInfoBottomSheetConfiguration;
            effectInfoBottomSheetConfiguration.A02.get(0);
            UserSession userSession2 = userSession;
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A05(context, R.dimen.clips_audio_browser_audiomixing_height);
            A0W.A1G = true;
            if (r15 != null) {
                A0W.A0U = r15;
            }
            A0W.A00().A03(context, A00(jVj, userSession2, r12, effectInfoBottomSheetConfiguration2, r14, false));
        }
    }
}
