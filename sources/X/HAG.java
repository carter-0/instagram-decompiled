package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

public final class HAG extends AnonymousClass7PL implements AnonymousClass7PN {
    public final ComposeView A00;
    public final AnonymousClass7LG A01;
    public final AnonymousClass7LG A02;
    public final IR5 A03;
    public final 17i A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HAG(X.AnonymousClass7LG r5) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r3 = 0
            android.content.Context r2 = r5.A00
            r0 = 0
            androidx.compose.ui.platform.ComposeView r1 = new androidx.compose.ui.platform.ComposeView
            r1.<init>(r2, r3, r0)
            X.IR5 r0 = new X.IR5
            r0.<init>(r1)
            r4.<init>(r1)
            r4.A02 = r5
            r4.A00 = r1
            r4.A03 = r0
            r4.A01 = r5
            com.instagram.common.session.UserSession r0 = r5.A04
            X.17i r0 = X.17h.A00(r0)
            r4.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HAG.<init>(X.7LG):void");
    }

    public final void A04(C286575Wy r4, AnonymousClass748 r5, int i) {
        int i2;
        0qQ.A0B(r5, 0);
        r4.ExV(-1230022368);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, r5) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1343464054, "com.instagram.direct.messagethread.TextMessageComposableHolder.Item (TextMessageComposableHolder.kt:40)");
            }
            C54958HZo.A00(r4, r5.A00, 0);
            if (0fL.A02()) {
                0fL.A00(-302141960);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, this, r5, i, 9);
        }
    }

    public final void APf(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
    }

    public final void DAV(float f, float f2) {
        this.A03.DAV(f, f2);
    }

    public final boolean EsS(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return false;
    }

    public final /* bridge */ /* synthetic */ void A03(C331837So r18) {
        AnonymousClass7LQ r10 = (AnonymousClass7LQ) r18;
        0qQ.A0B(r10, 0);
        String A0i = r10.A0e.A0i();
        AnonymousClass7LG r0 = this.A01;
        Context context = r0.A00;
        UserSession userSession = r0.A04;
        C284945Oz r2 = r0.A01;
        AnonymousClass9HC r9 = r0.A07;
        boolean z = r10.A0U;
        boolean z2 = r10.A0V;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r13 = r9;
        AnonymousClass7LQ r14 = r10;
        this.A00.setContent(AnonymousClass5PI.A03(new JG2(17, new AnonymousClass748(AnonymousClass7FX.A03(context2, userSession2, r13, r14, (AnonymousClass7L2) r2.getValue(), this.A04), AnonymousClass79S.A06(context, userSession, r0.A05, r9, r10, (AnonymousClass7L2) r2.getValue(), z, z2), A0i), this), 682204883));
    }

    public static final void A00(C286575Wy r3, HAG hag, Object obj, int i) {
        int i2;
        r3.ExV(1543573240);
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r3, obj, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r3, hag);
        }
        if ((i2 & 19) != 18 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1219958489, "com.instagram.direct.messagethread.MessageComposableHolder.DecoratedItem (MessageComposableHolder.kt:66)");
            }
            if (obj instanceof C328627Fn) {
                r3.ExS(-881007968);
                C56295Hw8.A00(r3, ((C328627Fn) obj).ApX(), JG2.A00(r3, obj, hag, 14, 2006915295), 48);
            } else if (obj instanceof AnonymousClass79P) {
                r3.ExS(-880843916);
                hag.A04(r3, (AnonymousClass748) obj, i2 & 112);
            } else {
                r3.ExS(-880771841);
            }
            if (C51970G9q.A1Z(r3)) {
                0fL.A00(849673220);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, hag, obj, i, 8);
        }
    }
}
