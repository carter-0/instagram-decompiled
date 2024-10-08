package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.LBd  reason: case insensitive filesystem */
public final class C63899LBd {
    public final void A00(Context context, Bitmap bitmap, UserSession userSession, MW0 mw0) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1P(userSession, mw0);
        Context context2 = context;
        File A04 = 0mb.A04(context);
        if (1MF.A0M(bitmap, A04)) {
            String path = A04.getPath();
            if (path != null) {
                LT1.A03(context2, userSession2, new C65237Lph(mw0, path), (File) null, path, 0.5625f, LQM.A01(context), LQM.A00(context));
                return;
            }
            return;
        }
        0wb.A03("PostLiveUploadFactory", "Failed to save thumbnail bitmap");
    }
}
