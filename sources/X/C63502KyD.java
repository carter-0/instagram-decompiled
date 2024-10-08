package X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.KyD  reason: case insensitive filesystem */
public abstract class C63502KyD {
    public static final Bundle A00(UserSession userSession, 1Xj r7, String str, String str2, int i, boolean z) {
        DbW.A1N(r7, 0, userSession);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("args_media_id", r7.getId());
        A0a.putInt("args_media_index", i);
        A0a.putBoolean("args_is_feed_preview_entrypoint", z);
        A0a.putString("args_viewer_session_id", str);
        A0a.putString("args_viewer_init_media_id", str2);
        C272034jz A00 = AnonymousClass3YY.A00(r7);
        if (A00 != null) {
            C272024jy FGK = A00.FGK(1E4.A00(userSession));
            String str3 = null;
            try {
                StringWriter A0v = JTO.A0v();
                17W A0Q = JTO.A0Q(A0v);
                C271984ju.A00(A0Q, FGK, true);
                str3 = JTP.A0n(A0Q, A0v);
            } catch (IOException e) {
                AnonymousClass7TF.A19(0wj.A01.AEf(C61402K5w.__redex_internal_original_name, 817902720), DialogModule.KEY_MESSAGE, "Failed to serialize Poll from ClipsEditMetadata", e);
            }
            A0a.putString("args_comment_poll", str3);
        }
        return A0a;
    }
}
