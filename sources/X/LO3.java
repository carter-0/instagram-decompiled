package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public final class LO3 {
    public Boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass07i A03;

    public LO3(Context context, AnonymousClass07i r3, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.R9m, X.11X] */
    public final void A01(C13755TgR tgR, AnonymousClass3Q2 r14, String str, int i, int i2, long j, boolean z) {
        0qQ.A0B(tgR, 6);
        1ES.A00(this.A01, this.A03, new C8785R9m(tgR, this, r14, str, i, i2, j, z));
    }

    public static final String A00(Bitmap bitmap, LO3 lo3, String str, int i) {
        Context context = lo3.A01;
        UserSession userSession = lo3.A02;
        String A002 = C63221KtS.A00(bitmap, userSession, C39907AIy.A02(AnonymousClass830.A00(context, userSession), str), i);
        bitmap.recycle();
        return A002;
    }
}
