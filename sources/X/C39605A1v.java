package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import java.util.Set;

/* renamed from: X.A1v  reason: case insensitive filesystem */
public abstract class C39605A1v {
    public static void A00(AnonymousClass84B r2, CameraConfiguration cameraConfiguration, AnonymousClass80D r4, C62622Kit kit, String str, String str2, String str3, String str4) {
        if (!(kit == null || kit == C62622Kit.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) {
            int i = 1;
            if (kit == C62622Kit.BACK) {
                i = 0;
            }
            r4.A26 = Integer.valueOf(i);
        }
        r4.A0V = cameraConfiguration;
        if (cameraConfiguration != null) {
            if (cameraConfiguration.A03 != AnonymousClass80L.A00) {
                Set set = cameraConfiguration.A04;
                if (!set.contains(C358088aL.A0w) && !set.contains(C358088aL.A0T)) {
                    if (set.contains(C358088aL.A0B) && str == null) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r4.A2G = str;
        r4.A2N = str2;
        r4.A2f = str3;
        r4.A2R = str4;
        r4.A0L = r2;
    }
}
