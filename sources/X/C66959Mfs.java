package X;

import android.content.Context;
import android.os.Looper;
import java.util.Set;

/* renamed from: X.Mfs  reason: case insensitive filesystem */
public final class C66959Mfs {
    public static 0ng A00;
    public static final C66959Mfs A01 = new Object();
    public static final Set A02 = DbS.A0y();
    public static final Set A03 = 0sc.A07(new String[]{"com.instagram.direct.share.handler.category.interop.text.SHARE_TARGET", "com.instagram.direct.share.handler.category.interop.image.SHARE_TARGET"});
    public static final Set A04 = 0sc.A07(new String[]{"com.instagram.direct.share.handler.category.text.SHARE_TARGET", "com.instagram.direct.share.handler.category.image.SHARE_TARGET"});

    public final void A00(Context context, String str) {
        AnonymousClass7TG.A1N(context, str);
        if (A02.contains(str)) {
            Looper.getMainLooper().getQueue().addIdleHandler(new C71268Oga(context, str));
        }
    }
}
