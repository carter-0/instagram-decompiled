package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

public final /* synthetic */ class P56 implements AnonymousClass7B5 {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ P56(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXV(Context context, UserSession userSession, AnonymousClass9HC r52, AnonymousClass7LQ r53, AnonymousClass7L2 r54, 17i r55) {
        AnonymousClass77B r4;
        1Xj r3;
        AnonymousClass7LQ r7 = r53;
        C254703su r6 = r7.A0e;
        C254933tI A0P = r6.A0P();
        A0P.getClass();
        UserSession userSession2 = userSession;
        C3262876d A002 = C3262776c.A00(context, userSession2);
        C254933tI A0P2 = r6.A0P();
        boolean A1T = r6.A1T();
        boolean z = r6.A2P;
        boolean z2 = r7.A0G.A0x;
        boolean z3 = r6.A2G;
        Long l = r6.A1L;
        boolean A1S = r6.A1S();
        0qQ.A0B(A0P2, 0);
        C271374ik r0 = A0P2.A06;
        if (r0 == null || (r3 = r0.A05) == null) {
            r4 = null;
        } else {
            String str = A0P2.A0U;
            String str2 = A0P2.A0T;
            2FW r1 = A0P2.A0F;
            0qQ.A07(r1);
            1iA BR7 = r3.BR7();
            String str3 = A0P2.A0R;
            1Xj r20 = r3;
            2FW r21 = r1;
            r4 = C3262876d.A01(A002, (PrivacyMediaOverlayViewModel) null, r20, r21, (C254793t3) null, BR7, Boolean.valueOf(A1S), Long.valueOf(DbY.A04(A0P2.A0P)), l, str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, z2, z, A1T, z3, false, true, false, true, false, false, false, false, false);
        }
        return new NYS(r4, AnonymousClass7FG.A02(userSession2, r7, A0P), r6.A0V(), true);
    }
}
