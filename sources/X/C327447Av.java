package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Av  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327447Av implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12) {
        AnonymousClass7LQ r5 = r11;
        C254703su r0 = r11.A0e;
        1Xj r1 = r0.A0s;
        C300925yB r02 = r0.A0v;
        if (r1 != null || r02 != null) {
            return Md8.A05.A00(context, (AnonymousClass0iw) null, userSession, r10, r5, r12);
        }
        0wb.A03("media_reply", "Got a media reply type without media information");
        throw new IllegalStateException("Got a media reply type without media information");
    }
}
