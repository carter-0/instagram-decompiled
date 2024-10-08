package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7At  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327427At implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r9, AnonymousClass7LQ r10, AnonymousClass7L2 r11) {
        C254703su r5 = r10.A0e;
        if (r5.A0Q() != null) {
            return new NYS(C3262776c.A00(context, userSession).A05(r5, r5.A1L, r10.A0G.A0x), AnonymousClass7FG.A00(context, userSession, r9, r10, r5.A10), r5.A0V(), false);
        }
        0wb.A03("seflie_reaction", "Got a selfie reaction reply type without selfie reaction media information");
        throw new IllegalStateException("Got a selfie reaction reply type without media information");
    }
}
