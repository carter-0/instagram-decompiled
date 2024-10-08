package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7dT  reason: invalid class name and case insensitive filesystem */
public abstract class C335747dT {
    public static final Integer A00(C335737dS r1) {
        0qQ.A0B(r1, 0);
        int ordinal = r1.ordinal();
        if (ordinal == 10) {
            return AnonymousClass05K.A0C;
        }
        if (ordinal == 11) {
            return AnonymousClass05K.A0N;
        }
        if (ordinal == 3) {
            return AnonymousClass05K.A00;
        }
        if (ordinal != 4) {
            return null;
        }
        return AnonymousClass05K.A01;
    }

    public static final void A01(Activity activity, AnonymousClass07V r6, C61083JwL jwL, 0wc r8, UserSession userSession, C342997pV r10) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(jwL, 1);
        0qQ.A0B(r8, 3);
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        A02(activity2, r6, r8, userSession2, (1Xj) jwL.A00, r10, (Integer) jwL.A01, 0sn.A00);
    }

    public static final void A02(Activity activity, AnonymousClass07V r16, 0wc r17, UserSession userSession, 1Xj r19, C342997pV r20, Integer num, List list) {
        Integer num2 = num;
        0qQ.A0B(num2, 1);
        List list2 = list;
        0qQ.A0B(list2, 3);
        1Xj r8 = r19;
        0qQ.A0B(r8, 4);
        C342997pV r9 = r20;
        C40698AhI ahI = new C40698AhI(r9);
        boolean z = false;
        Activity activity2 = activity;
        AnonymousClass37D A01 = AnonymousClass37D.A00.A01(activity);
        if (A01 != null && ((AnonymousClass37F) A01).A0g) {
            z = true;
        }
        AnonymousClass0xx A00 = C71772f0.A00(r16);
        AnonymousClass9KV r3 = new AnonymousClass9KV(activity2, r17, userSession, (C247733gp) null, r8, r9, ahI, num2, list2, (AnonymousClass4D7) null, z);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A00);
    }

    public static final boolean A03(C335737dS r8) {
        0qQ.A0B(r8, 0);
        return 0sr.A1P(new C335737dS[]{C335737dS.LWN_WELCOME, C335737dS.LWN_WARNING, C335737dS.PERSISTENT_WELCOME_LIGHTWEIGHT, C335737dS.PERSISTENT_WARNING_LIGHTWEIGHT, C335737dS.LWN_SET_TONE, C335737dS.LWN_STORY_REPLY_RESPECTFUL, C335737dS.PERSISTENT_SET_TONE_LIGHTWEIGHT, C335737dS.DIRECT_CHANNEL_REPLY_NUDGE}).contains(r8);
    }
}
