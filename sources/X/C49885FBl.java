package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.FBl  reason: case insensitive filesystem */
public final class C49885FBl {
    public final synchronized C47938ENp A01(Context context, 0lg r10, FRM frm, G6A g6a) {
        C47938ENp A02;
        synchronized (this) {
            0lg r3 = r10;
            FRM frm2 = frm;
            AnonymousClass7TG.A1O(r10, frm);
            Context context2 = context;
            G6A g6a2 = g6a;
            A02 = A02(context2, r3, frm2, g6a2, EXD.A05, AnonymousClass05K.A00);
        }
        return A02;
    }

    public final synchronized C47938ENp A02(Context context, 0lg r11, FRM frm, G6A g6a, EXD exd, Integer num) {
        String str;
        C47938ENp A00;
        synchronized (this) {
            FRM frm2 = frm;
            UserSession userSession = frm.A00;
            if (userSession != null) {
                str = userSession.A06;
            } else {
                str = null;
            }
            A00 = A00(context, r11, frm2, exd, num, str);
            if (g6a != null) {
                A00.A02.add(g6a);
            }
        }
        return A00;
    }

    public final synchronized C47938ENp A03(Context context, 0lg r10, FRM frm, EXD exd) {
        C47938ENp A02;
        synchronized (this) {
            FRM frm2 = frm;
            0qQ.A0B(frm, 2);
            A02 = A02(context, r10, frm2, (G6A) null, exd, AnonymousClass05K.A00);
        }
        return A02;
    }

    public final synchronized C47938ENp A04(String str) {
        return (C47938ENp) C47938ENp.A04.get(str);
    }

    private final C47938ENp A00(Context context, 0lg r6, FRM frm, EXD exd, Integer num, String str) {
        String str2;
        HashMap hashMap = C47938ENp.A04;
        C47938ENp eNp = (C47938ENp) hashMap.get(str);
        if (eNp == null) {
            if (str != null) {
                eNp = A00(context, r6, frm, exd, num, (String) null);
                Object obj = eNp.A03;
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.nux.impl.dynamicflow.onboarding.PendingSessionDelegate");
                ((FRM) obj).A00 = frm.A00;
                hashMap.remove((Object) null);
            } else {
                eNp = new C47938ENp(context, r6, frm, new C47946ENx(frm, exd));
            }
        }
        UserSession userSession = frm.A00;
        if (userSession != null) {
            str2 = userSession.A06;
        } else {
            str2 = null;
        }
        hashMap.put(str2, eNp);
        return eNp;
    }
}
