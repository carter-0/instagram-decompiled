package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Ay  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327477Ay implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12) {
        AnonymousClass7LQ r4 = r11;
        C254703su r0 = r11.A0e;
        C271374ik r1 = r0.A0e;
        C331377Qt r02 = r0.A0w;
        if (r1 != null || r02 != null) {
            return AnonymousClass90T.A05.A00(context, userSession, r10, r4, r12, "");
        }
        0wb.A03("visual_reply", "Got a visual reply type without visual media information");
        throw new IllegalStateException("Got a  visual reply type without media information");
    }
}
