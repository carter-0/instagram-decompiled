package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.7Ap  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Ap implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r5, AnonymousClass7LQ r6, AnonymousClass7L2 r7) {
        Object obj = r6.A0e.A1T;
        obj.getClass();
        AnonymousClass53G r1 = ((AnonymousClass7FN) obj).A03;
        if (r1 == null || r1.A00 == null) {
            0wb.A03("story_animated_sticker_reply", "Got a animated sticker reply type without gif media information");
            throw new IllegalStateException("Got a animated sticker reply type without media information");
        }
        DirectAnimatedMedia A01 = OXE.A01(r1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return C70004Nvi.A00(context, userSession, r5, r6, A01);
    }
}
