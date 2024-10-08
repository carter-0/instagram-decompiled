package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Emg  reason: case insensitive filesystem */
public abstract class C48942Emg {
    public static final E64 A00(EZX ezx, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, userSession);
        A0a.putString(AnonymousClass000.A00(5348), str);
        A0a.putString("hall_pass_id", str2);
        A0a.putString("hall_pass_name", str3);
        A0a.putString("media_id", str4);
        A0a.putString("media_owner_id", str5);
        A0a.putString("view_session_id", str6);
        A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ezx);
        E64 e64 = new E64();
        e64.setArguments(A0a);
        return e64;
    }
}
