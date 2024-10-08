package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Aw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327457Aw implements C327387Ao {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ C327457Aw(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r6, AnonymousClass7LQ r7, AnonymousClass7L2 r8) {
        C254703su r2 = r7.A0e;
        if (r2.A10 != 2FW.A0p || r2.A0i != null) {
            return C327367Am.A02(context, userSession, r6, r7, r8);
        }
        0wb.A03("avatar_sticker", "Got an avatar sticker reply type without avatar sticker information");
        throw new IllegalStateException("Got an avatar sticker reply type without avatar sticker information");
    }
}
