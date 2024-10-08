package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;

public final class OUB {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r3 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (X.C371178xk.A01(r7, r10) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.session.UserSession r7, X.AnonymousClass2Ep r8, X.2Dm r9, com.instagram.model.direct.DirectThreadKey r10, java.lang.String r11) {
        /*
            r1 = 1
            r0 = 4
            X.0qQ.A0B(r9, r0)
            r5 = 0
            java.lang.String r0 = "direct_broadcast_channel_conversation_starters"
            boolean r6 = X.0qQ.A0K(r11, r0)
            if (r8 == 0) goto L_0x003a
            X.3Te r0 = X.C66580MXl.A0b(r8)
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.A0H
            if (r0 != r1) goto L_0x003a
        L_0x0018:
            boolean r1 = X.C371178xk.A01(r7, r10)
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r6 != 0) goto L_0x0024
            if (r0 == 0) goto L_0x0039
        L_0x0024:
            X.9HW r2 = X.AnonymousClass9HV.A00(r7)
            java.lang.String r0 = r10.A00
            if (r0 == 0) goto L_0x0060
            X.3t0 r1 = X.C66580MXl.A0g(r0)
            r0 = 49
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x0039
            r5 = 1
        L_0x0039:
            return r5
        L_0x003a:
            java.util.ArrayList r0 = r9.Aax(r10, r5)
            java.util.Iterator r4 = r0.iterator()
        L_0x0042:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3su r2 = (X.C254703su) r2
            X.2FW r1 = r2.A10
            X.2FW r0 = X.2FW.A0G
            if (r1 == r0) goto L_0x0042
            java.lang.String r0 = r2.A1u
            boolean r0 = X.C51966G9m.A1W(r7, r0)
            if (r0 == 0) goto L_0x0042
            if (r3 == 0) goto L_0x001f
            goto L_0x0018
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OUB.A00(com.instagram.common.session.UserSession, X.2Ep, X.2Dm, com.instagram.model.direct.DirectThreadKey, java.lang.String):boolean");
    }

    public final boolean A01(FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, C74310Psm psm, AnonymousClass2Ep r10, DirectThreadKey directThreadKey, String str) {
        Fragment njk;
        DbW.A1N(userSession, 1, capabilities);
        if (!A00(userSession, r10, 2L2.A00(userSession), directThreadKey, str)) {
            return false;
        }
        AnonymousClass4k9.A00(userSession).A07(true);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A16 = false;
        A0W.A0t = true;
        A0W.A0y = false;
        A0W.A0k = false;
        A0W.A1S = true;
        C331157Pu A00 = A0W.A00();
        if (182.A06(0Tu.A06, userSession, 36320266384580745L)) {
            njk = new NJI();
            Bundle A09 = C66581MXm.A09(userSession);
            A09.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
            A09.putParcelable("channel_thread_key", directThreadKey);
            A09.putString("DirectFragment.ENTRY_POINT", str);
            njk.setArguments(A09);
            njk.A02 = psm;
        } else {
            njk = new NJK();
            Bundle A092 = C66581MXm.A09(userSession);
            A092.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
            A092.putParcelable("channel_thread_key", directThreadKey);
            A092.putString("DirectFragment.ENTRY_POINT", str);
            njk.setArguments(A092);
            njk.A02 = psm;
        }
        A00.A02(fragmentActivity, njk);
        return true;
    }
}
