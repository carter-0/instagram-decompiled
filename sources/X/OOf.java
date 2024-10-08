package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

public abstract class OOf {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        String A0h = DbY.A0h(r9, 0);
        UserSession A0B = C308206Td.A0B(r8);
        FragmentActivity A04 = C308206Td.A04(r8);
        FragmentActivity A042 = C308206Td.A04(r8);
        if (Build.VERSION.SDK_INT < 33) {
            String A00 = AnonymousClass000.A00(10);
            if (!1DL.A07(A04, A00)) {
                JTP.A11(A04, new C64729Lh6(1, A04, new C58210IoE(A042, A0B, A04, A0h, 6)), A00);
                return null;
            }
        }
        A01(A04, A042, A0B, A0h);
        return null;
    }

    public static final void A01(Activity activity, Context context, UserSession userSession, String str) {
        String str2 = str;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        if (mimeTypeFromExtension != null) {
            C290815g0 A04 = C59730JVo.A04(context, userSession, new C11211SFl(str2, "imagined_for_you_media", C66580MXl.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, mimeTypeFromExtension), false, false), -1, true);
            A04.A00 = new NQT(activity, 0);
            1ES.A06(A04, -5, false);
        }
    }
}
