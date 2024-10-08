package X;

import android.content.Context;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.AAh  reason: case insensitive filesystem */
public abstract class C39810AAh {
    public static final Callable A00(Context context, Medium medium, UserSession userSession, CameraSpec cameraSpec, 2Nn r12, String str, boolean z) {
        0wj r1;
        String str2;
        Medium medium2 = medium;
        UserSession userSession2 = userSession;
        if (medium.CeS()) {
            return new JZ5(context, medium, userSession, false);
        }
        if (!medium.A05()) {
            return null;
        }
        if (r12 == null) {
            r1 = 0wj.A01;
            str2 = "ClipsVideoImportUtil clipsDirectoryProvider is null when importing photo media";
        } else if (str == null) {
            r1 = 0wj.A01;
            str2 = "ClipsVideoImportUtil sessionId is null when importing photo media";
        } else {
            CameraSpec cameraSpec2 = cameraSpec;
            if (cameraSpec == null) {
                r1 = 0wj.A01;
                str2 = "ClipsVideoImportUtil cameraSpec is null when importing photo media";
            } else {
                try {
                    String canonicalPath = C39907AIy.A03(r12, str, ".mp4", AnonymousClass000.A00(1681)).getCanonicalPath();
                    0qQ.A07(canonicalPath);
                    return new C13156TNo(medium2, userSession2, cameraSpec2, canonicalPath, 2, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, false, z);
                } catch (IOException unused) {
                    r1 = 0wj.A01;
                    str2 = "ClipsVideoImportUtil IOException -- source video file creation failed for photo media";
                } catch (IllegalStateException unused2) {
                    r1 = 0wj.A01;
                    str2 = "ClipsVideoImportUtil IllegalStateException -- source video file creation failed for photo media";
                }
            }
        }
        r1.AEf(str2, 817897258).report();
        return null;
    }

    public static final void A01(Context context, Medium medium, UserSession userSession, 2Cn r7, CameraSpec cameraSpec, 2Nn r9, String str, boolean z) {
        0qQ.A0B(medium, 0);
        Callable A00 = A00(context, medium, userSession, cameraSpec, r9, str, z);
        if (A00 == null) {
            r7.onFail(new Exception());
            return;
        }
        C290815g0 r0 = new C290815g0(A00, 459);
        r0.A00 = r7;
        1ES.A03(r0);
    }
}
