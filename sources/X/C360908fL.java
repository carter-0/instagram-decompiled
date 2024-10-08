package X;

import android.os.Looper;
import android.util.Log;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8fL  reason: invalid class name and case insensitive filesystem */
public abstract class C360908fL {
    public static boolean A00 = true;
    public static boolean A01;
    public static final 04u A02 = new 04u(0);

    public static final void A00(28D r4) {
        0qQ.A0B(r4, 0);
        if (!A01) {
            A01 = true;
            02m r3 = 02m.A0p;
            r3.markerStart(17629194);
            r3.markerAnnotate(17629194, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r4.name());
        }
    }

    public static final void A02(UserSession userSession, C279284yO r3, String str, String str2, int i) {
        0qQ.A0B(userSession, 1);
        02m r2 = 02m.A0p;
        r2.markerStart(i);
        if (str != null) {
            r2.markerAnnotate(i, "camera_session_id", str);
        }
        if (r3 != null) {
            r2.markerAnnotate(i, "camera_destination", r3.A02);
        }
        if (str2 != null) {
            r2.markerAnnotate(i, TraceFieldType.TransportType, str2);
        }
    }

    public static final void A03(UserSession userSession, String str, boolean z) {
        0qQ.A0B(userSession, 0);
        if (!0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            0kD.A07("igcam", "markerTtiAddPoint() is not called from the UI thread", (Throwable) null);
        }
        04u r4 = A02;
        if (r4.size() >= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't add new point, limit reached: points=");
            sb.append(r4);
            sb.append(" new point=");
            sb.append(str);
            0kD.A07("igcam", sb.toString(), (Throwable) null);
        } else if (r4.contains(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Duplicated point: points=");
            sb2.append(r4);
            sb2.append(" new point=");
            sb2.append(str);
            0kD.A07("igcam", sb2.toString(), (Throwable) null);
        } else {
            if (r4.isEmpty() || !z) {
                A00 = z;
            }
            r4.add(str);
            02m.A0p.markerPoint(17629194, str);
            if (r4.size() >= 3) {
                02m r2 = 02m.A0p;
                short s = 3;
                if (A00) {
                    s = 2;
                }
                r2.markerEnd(17629194, s);
                r4.clear();
                A01 = false;
            }
        }
    }

    public static final void A01(UserSession userSession, C279284yO r7, String str) {
        02m r3 = 02m.A0p;
        if (str != null) {
            r3.markerAnnotate(17629194, "camera_session_id", str);
        }
        if (r7 != null) {
            r3.markerAnnotate(17629194, "camera_destination", r7.A02);
        }
        A03(userSession, "on_fully_visible", true);
    }

    public static final void A04(String str, String str2, Throwable th, boolean z) {
        02m r3 = 02m.A0p;
        r3.markerAnnotate(17629195, "capture_source", str);
        r3.markerAnnotate(17629195, "camera_position", str2);
        if (th != null) {
            String stackTraceString = Log.getStackTraceString(th);
            0qQ.A07(stackTraceString);
            r3.markerAnnotate(17629195, "stack_trace", 00R.A03(stackTraceString, IgNetworkConsentStorage.MAX_ENTRIES));
        }
        short s = 3;
        if (z) {
            s = 2;
        }
        r3.markerEnd(17629195, s);
    }
}
