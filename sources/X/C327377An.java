package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.7An  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327377An implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12) {
        AnonymousClass53G r1;
        DirectAnimatedMedia directAnimatedMedia;
        C48846El8 el8 = C48846El8.$redex_init_class;
        AnonymousClass7LQ r4 = r11;
        C254703su r3 = r11.A0e;
        2FW r2 = r3.A10;
        int ordinal = r2.ordinal();
        if (ordinal == 22) {
            Object obj = r3.A1T;
            obj.getClass();
            r1 = ((AnonymousClass7FN) obj).A03;
        } else if (ordinal == 23 || ordinal == 57 || ordinal == 1) {
            r1 = r3.A12;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected REEL_SHARE, XMA_REEL_SHARE or EXPIRED_PLACEHOLDER but found: ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
        }
        if (r1 == null || r1.A00 == null) {
            0wb.A03("story_gif_reply", "Got a gif reply type without gif media information");
            directAnimatedMedia = null;
        } else {
            directAnimatedMedia = OXE.A01(r1);
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return C70006Nvk.A00(context, userSession, r10, r4, r12, directAnimatedMedia);
    }
}
