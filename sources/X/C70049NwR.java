package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.NwR  reason: case insensitive filesystem */
public abstract class C70049NwR {
    public static final C321016tR A00(Context context, UserSession userSession, GifUrlImpl gifUrlImpl, Integer num, String str) {
        C321076tX A01;
        Context context2 = context;
        boolean A1X = DbW.A1X(context);
        GifUrlImpl gifUrlImpl2 = gifUrlImpl;
        if (num != null) {
            A01 = C321066tW.A00(C69826Nsn.A00(gifUrlImpl), num.intValue(), A1X ? 1 : 0, -1);
        } else {
            A01 = C321066tW.A01(context, 0.711f, C69826Nsn.A00(gifUrlImpl), AnonymousClass7PV.A00(context, A1X));
        }
        int A03 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingStartColor);
        int A032 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingEndColor);
        return new C321016tR(context2, userSession, A01, gifUrlImpl2, AnonymousClass05K.A01, str, (float) JTR.A08(context), A03, A032);
    }
}
