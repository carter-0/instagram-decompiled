package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Set;

/* renamed from: X.JcJ  reason: case insensitive filesystem */
public final class C59953JcJ {
    public static final C64168LRo A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C64168LRo) userSession.A01(C64168LRo.class, new MJ0(userSession, 25));
    }

    public static final void A01(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 0);
        Class<C64168LRo> cls = C64168LRo.class;
        C64168LRo lRo = (C64168LRo) userSession.A00(cls);
        if (lRo != null) {
            synchronized (lRo) {
                C64168LRo.A0A.A03(context);
                File file = lRo.A02;
                if (file != null) {
                    file.delete();
                }
                lRo.A06.removeCallbacksAndMessages((Object) null);
                lRo.A03 = null;
                lRo.A01 = null;
                lRo.A07.evictAll();
                LE9 le9 = lRo.A00;
                if (le9 != null) {
                    le9.A08 = true;
                    le9.A04.post(new C59959JcQ(le9));
                    lRo.A00 = null;
                }
            }
        }
        userSession.A03(cls);
    }

    public final File A02(Context context, int i) {
        String absolutePath = JTO.A0s(context.getCacheDir(), "blur_icons/").getAbsolutePath();
        0qQ.A07(absolutePath);
        File A0t = AnonymousClass7TE.A0t(absolutePath);
        if (A0t.exists() || A0t.mkdir()) {
            return JTO.A0s(A0t, 002.A0c("icon_", ".jpg", i));
        }
        return null;
    }

    public final void A03(Context context) {
        String absolutePath = JTO.A0s(context.getCacheDir(), "blur_icons/").getAbsolutePath();
        0qQ.A07(absolutePath);
        0mb.A01(new 0mZ(), absolutePath, (Set) null);
    }
}
