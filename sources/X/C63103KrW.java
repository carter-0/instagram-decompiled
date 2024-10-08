package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.KrW  reason: case insensitive filesystem */
public abstract class C63103KrW {
    public static final void A00(Context context, UserSession userSession, AnonymousClass3Q2 r3, String str, String str2, C62320sa r6, boolean z) {
        0qQ.A0B(userSession, 0);
        r3.A2Z = str;
        r3.A0e(ShareType.CLIPS);
        r3.A5P = z;
        r3.A3n = str2;
        AnonymousClass3Q2 A01 = AnonymousClass8YL.A01(userSession, r3);
        1ua A0n = JTO.A0n(context, userSession);
        if (A01.A1G == 1iA.A0A) {
            A0n.A0D(A01);
        } else {
            A0n.A0F(A01);
        }
        A0n.A0B(A01);
        r6.invoke();
    }
}
