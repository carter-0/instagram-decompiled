package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Az  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327487Az implements C327387Ao {
    public final AnonymousClass7FW AXU(Context context, UserSession userSession, AnonymousClass9HC r5, AnonymousClass7LQ r6, AnonymousClass7L2 r7) {
        C254703su r0 = r6.A0e;
        C271374ik r1 = r0.A0e;
        C331377Qt r02 = r0.A0w;
        if (r1 == null && r02 == null) {
            0wb.A03("visual_reply", "Got a visual thumbnail reply type without visual media information");
            throw new IllegalStateException("Got a  visual thumbnail reply type without media information");
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return C70010Nvo.A00(context, userSession, r5, r6, r7);
    }
}
