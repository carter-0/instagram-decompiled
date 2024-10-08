package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.7Aq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327397Aq implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r5, AnonymousClass7LQ r6, AnonymousClass7L2 r7) {
        DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) r6.A0e.A1T;
        if (directAnimatedMedia != null) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return C70004Nvi.A00(context, userSession, r5, r6, directAnimatedMedia);
        }
        0wb.A03("animated_sticker_reply", "Got a animated sticker reply type without gif media information");
        throw new IllegalStateException("Got a animated sticker reply type without media information");
    }
}
