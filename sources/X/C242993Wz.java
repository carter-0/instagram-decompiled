package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3Wz  reason: invalid class name and case insensitive filesystem */
public final class C242993Wz {
    public final UserSession A00;
    public final C242983Wy A01;
    public final C242923Ws A02;
    public final C242943Wu A03;
    public final 0rQ A04;
    public final boolean A05;

    public C242993Wz(UserSession userSession, C242983Wy r3, C242923Ws r4, C242943Wu r5, 0rQ r6) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r3, 3);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = userSession;
        this.A04 = r6;
        this.A05 = C231492rl.A00(userSession).A0G;
    }

    public final int A00(UserSession userSession, 1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(userSession, 2);
        if (this.A05) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(r5.A2v ? 1 : 0), Integer.valueOf(this.A02.A02(userSession, r4, r5))});
        }
        return this.A02.A02(userSession, r4, r5);
    }

    public final C376459Ib A01(Context context, 0xF r21, AnonymousClass57L r22, 1Xj r23, AnonymousClass4DU r24, AnonymousClass3YB r25, AnonymousClass3W1 r26, Integer num, String str) {
        C243513Zb A042;
        1Xj r10 = r23;
        0qQ.A0B(r10, 0);
        AnonymousClass3W1 r11 = r26;
        0qQ.A0B(r11, 1);
        AnonymousClass3YB r2 = r25;
        0qQ.A0B(r2, 2);
        0rQ r1 = this.A04;
        AnonymousClass4DU r3 = r24;
        r3.getModuleName();
        C243523Zc r5 = null;
        Context context2 = context;
        if (!r1.A05(r10) || r1.A04()) {
            A042 = this.A02.A04(context2, r10, r3, r2, r11, str);
        } else {
            A042 = null;
        }
        AnonymousClass9IZ A002 = C242943Wu.A00(context2, r10, r3, this.A03, r11);
        if (this.A05) {
            C242983Wy r52 = this.A01;
            if (r11.A2v) {
                C57092IOg iOg = (C57092IOg) r52.A02.getValue();
                User A2A = r10.A2A(r52.A00);
                if (A2A != null) {
                    C14029ToV toV = new C14029ToV((List) iOg.A00.get(A2A.getId()));
                    IV2 iv2 = new IV2(r11);
                    C242963Ww r13 = r52.A01;
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) toV.A00);
                    0qQ.A07(copyOf);
                    r5 = new C243523Zc(r11.A0d, copyOf, r21, r22, r10, r11, iv2, r13, num, toV.A01());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                r5 = null;
            }
        }
        return new C376459Ib(6, (Object) A042, (Object) A002, (Object) r5);
    }
}
