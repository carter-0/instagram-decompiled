package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.7As  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327417As implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r9, AnonymousClass7LQ r10, AnonymousClass7L2 r11) {
        AnonymousClass7LQ r3 = r10;
        DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) r10.A0e.A1T;
        if (directAnimatedMedia != null) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return C70006Nvk.A00(context, userSession, r9, r3, r11, directAnimatedMedia);
        }
        0wb.A03("gif_reply", "Got a animated sticker reply type without gif media information");
        throw new IllegalStateException("Got a animated sticker reply type without media information");
    }
}
