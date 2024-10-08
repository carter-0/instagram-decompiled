package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Ax  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327467Ax implements C327387Ao {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ C327467Ax(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r5, AnonymousClass7LQ r6, AnonymousClass7L2 r7) {
        C254703su r0 = r6.A0e;
        1Xj r1 = r0.A0s;
        C300925yB r02 = r0.A0v;
        if (r1 != null || r02 != null) {
            return C327367Am.A0C(context, userSession, r5, r6, r7);
        }
        0wb.A03("media_reply", "Got a media reply type without media information");
        throw new IllegalStateException("Got a media reply type without media information");
    }
}
