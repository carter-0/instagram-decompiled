package X;

import android.content.Context;
import android.graphics.Point;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.pendingmedia.model.constants.ShareType;
import kotlin.Deprecated;

/* renamed from: X.72R  reason: invalid class name */
public abstract class AnonymousClass72R {
    @Deprecated(message = "Please use the overloaded method that takes a TargetViewSizeProvider")
    public static final CameraSpec A00(Context context, UserSession userSession) {
        int i;
        int i2;
        UserSession userSession2 = userSession;
        CameraSpec cameraSpec = (CameraSpec) new Gson().A08(1Al.A01(userSession).A03(1An.A0d).getString("KEY_CAMERA_SPEC", (String) null), CameraSpec.class);
        if (cameraSpec != null) {
            return cameraSpec;
        }
        if (C226122ff.A03()) {
            AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) C226132fh.A00(context, userSession)).A0K;
            i = r0.getWidth();
            i2 = r0.getHeight();
        } else {
            0kD.A07(002.A0g("TargetViewSizeProviderFactory", "_getInstanceSafe_", "getCameraSpec"), "WindowInsetsManager.areStableStatusAndNavBarHeightsInitialized() is false. Did we mistakenly call WindowInsetsManager.reset() or forgot to call WindowInsetsManager.startListeningForStableStatusAndNavigationBarHeight()?", (Throwable) null);
            Point A01 = AEW.A01(context, userSession, 0.5625f, C63472Kxb.A00(context, userSession, Integer.MAX_VALUE, new C11387SRa(userSession2, ShareType.CLIPS, false, false, false, false).A06(), false));
            0qQ.A07(A01);
            i = A01.x;
            i2 = A01.y;
        }
        return A01(userSession, i, i2);
    }

    public static final CameraSpec A01(UserSession userSession, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (i < i2) {
            i4 = i;
            i3 = i2;
        }
        return new CameraSpec(i4, i3, C345407tR.A00(C343457qF.A00(userSession).A00, (ADm) null, (Integer) null, (Integer) null, false).A01.A03, C345407tR.A00(C343457qF.A00(userSession).A00, (ADm) null, (Integer) null, (Integer) null, false).A01.A08, C343457qF.A00(userSession).A00.Ar6(1003));
    }

    public static final CameraSpec A02(UserSession userSession, TargetViewSizeProvider targetViewSizeProvider) {
        CameraSpec cameraSpec = (CameraSpec) new Gson().A08(1Al.A01(userSession).A03(1An.A0d).getString("KEY_CAMERA_SPEC", (String) null), CameraSpec.class);
        if (cameraSpec != null) {
            return cameraSpec;
        }
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        return A01(userSession, r0.getWidth(), r0.getHeight());
    }
}
