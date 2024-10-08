package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;

public abstract class I3M {
    public static final void A00(Activity activity, Bundle bundle, Fragment fragment, 28D r9, UserSession userSession) {
        A01(activity, bundle, fragment, r9, userSession, false, false);
    }

    public static final void A01(Activity activity, Bundle bundle, Fragment fragment, 28D r7, UserSession userSession, boolean z, boolean z2) {
        AnonymousClass6W8 A02;
        boolean A1Z = DbW.A1Z(userSession);
        if (bundle == null) {
            C56044Hrt A0C = C250563lf.A0C(r7);
            A0C.A0q = false;
            A0C.A0l = z2;
            bundle = A0C.A00();
        }
        if (fragment.getContext() == null) {
            0kD.A07("ClipsCameraLauncherHelper", C66579MXk.A00(568), (Throwable) null);
            return;
        }
        if (z) {
            A02 = AnonymousClass6W8.A02(activity, bundle, userSession, TransparentModalActivity.class, "clips_camera");
            A02.A0D = A1Z;
        } else {
            A02 = AnonymousClass6W8.A02(activity, bundle, userSession, ModalActivity.class, "clips_camera");
        }
        Dbc.A0y(A02);
        A02.A0D(fragment, 9587);
    }

    public static final void A02(Activity activity, Fragment fragment, 28D r6, UserSession userSession, 1Xj r8, PromptStickerModel promptStickerModel) {
        AnonymousClass7TG.A1T(fragment, activity, userSession);
        C56044Hrt A0C = C250563lf.A0C(r6);
        PromptStickerModel A04 = promptStickerModel.A04();
        A04.A08(AnonymousClass7TF.A0Q(userSession));
        A04.A09((String) null);
        A0C.A0C = A04;
        if (promptStickerModel.A0H() && 0qQ.A0K(promptStickerModel.A04, C273654mx.A00(252))) {
            A0C.A08 = I7J.A03(r8);
            EffectPreviewIntf A02 = I7J.A02(r8);
            if (A02 != null && !DDx.A04(A02)) {
                String effectId = A02.getEffectId();
                if (effectId == null) {
                    effectId = A02.getId();
                }
                A0C.A0Q = effectId;
                A0C.A0R = A02.getName();
                A0C.A02 = DDx.A00(A02);
            }
        }
        AnonymousClass6W8.A02(activity, A0C.A00(), userSession, TransparentModalActivity.class, "clips_camera").A0D(fragment, 9587);
    }
}
