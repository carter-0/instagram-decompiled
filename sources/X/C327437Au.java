package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Au  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327437Au implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r6, AnonymousClass7LQ r7, AnonymousClass7L2 r8) {
        Object obj;
        C254703su r2 = r7.A0e;
        2FW r1 = r2.A10;
        if (r1 == 2FW.A0p || r1 == 2FW.A0y) {
            obj = r2.A0g;
        } else {
            obj = r2.A1T;
        }
        if (obj != null) {
            AnonymousClass7FE A00 = AnonymousClass7FD.A00(userSession, r6, r7, r8);
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return Md5.A00(context, userSession, A00, r6, r7);
        }
        0wb.A03("voice_reply", "Got a voice reply type without voice media information");
        throw new IllegalStateException("Got a voice reply type without voice media information");
    }
}
