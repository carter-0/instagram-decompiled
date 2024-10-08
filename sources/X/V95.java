package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

public abstract class V95 {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        try {
            UserSession A0R = DbW.A0R(r10);
            FragmentActivity A04 = C308206Td.A04(r10);
            Object A01 = r11.A01();
            0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.String");
            String str = (String) A01;
            String A0t = DbU.A0t(r11.A00, 1);
            if (A0t != null) {
                xIGIGBoostCallToAction = (XIGIGBoostCallToAction) XIGIGBoostCallToAction.A02.get(AnonymousClass7TF.A0k(A0t));
                if (xIGIGBoostCallToAction == null) {
                    xIGIGBoostCallToAction = XIGIGBoostCallToAction.UNRECOGNIZED;
                }
            } else {
                xIGIGBoostCallToAction = XIGIGBoostCallToAction.NO_BUTTON;
            }
            Object A03 = r11.A03(2);
            0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
            AdsAPIInstagramPosition A00 = V70.A00(AnonymousClass7TF.A0k((String) A03));
            int ordinal = A00.ordinal();
            if (ordinal == 13 || ordinal == 7 || ordinal == 2) {
                C305936Kd.A01(A04, A00, xIGIGBoostCallToAction, A0R, str);
                return null;
            } else if (ordinal == 9) {
                C305796Jo.A04(A04, xIGIGBoostCallToAction, A0R, (AudioOverlayTrack) null, str, (String) null);
                return null;
            } else {
                throw new IllegalStateException("Native preview is not supported for this ad placement");
            }
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }
}
