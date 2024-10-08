package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class V9F {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        UserSession A0Z = DbT.A0Z(r8);
        AnonymousClass4DH A02 = C308206Td.A02(r8);
        if (A02 != null && (A02 instanceof AnonymousClass4DH)) {
            AnonymousClass4DH r4 = A02;
            WK8 wk8 = new WK8(r8, DbW.A0P(r9, 0));
            0qQ.A0B(r4, 0);
            0qQ.A0B(A0Z, 1);
            C17249VOb vOb = new C17249VOb(wk8);
            if (C16715V2y.A00 == null) {
                HandlerThread A0I = Pxf.A0I(AnonymousClass000.A00(2284));
                A0I.start();
                Looper looper = A0I.getLooper();
                if (looper != null) {
                    FragmentActivity requireActivity = r4.requireActivity();
                    0qQ.A0C(requireActivity, "null cannot be cast to non-null type android.app.Activity");
                    C16715V2y.A00 = new C14695U1u(requireActivity, looper, r4, A0Z);
                    Handler handler = C16715V2y.A00;
                    0qQ.A0C(handler, "null cannot be cast to non-null type com.instagram.privacy.devicepermissionkit.location.InstagramGPSLibraryHelper.GPSLocationLibraryHandler");
                    handler.sendEmptyMessage(1);
                    C16715V2y.A02 = new WXX(vOb);
                    r4.registerLifecycleListener(new C19230WQl(r4));
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            Handler handler2 = C16715V2y.A00;
            0qQ.A0C(handler2, "null cannot be cast to non-null type com.instagram.privacy.devicepermissionkit.location.InstagramGPSLibraryHelper.GPSLocationLibraryHandler");
            handler2.sendEmptyMessage(2);
        }
        return null;
    }
}
