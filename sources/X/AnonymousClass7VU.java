package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7VU  reason: invalid class name */
public final class AnonymousClass7VU {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C254773t1 r6, java.util.List r7, X.0sP r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 0
            X.1a8 r4 = new X.1a8
            r4.<init>(r0)
            boolean r0 = r6 instanceof X.C254763t0
            if (r0 == 0) goto L_0x001b
            r3 = r6
            X.3t0 r3 = (X.C254763t0) r3
            if (r3 != 0) goto L_0x003a
        L_0x0017:
            A00(r5, r6, r7, r8, r9)
            return
        L_0x001b:
            boolean r0 = r6 instanceof X.C291175gg
            if (r0 == 0) goto L_0x0075
            com.instagram.common.session.UserSession r0 = r5.A00
            X.2Dm r1 = X.1bJ.A00(r0)
            com.instagram.model.direct.DirectThreadKey r0 = X.AnonymousClass6W4.A01(r6)
            X.3U9 r0 = r1.C5z(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.C6C()
            if (r0 == 0) goto L_0x0017
            X.3t0 r3 = new X.3t0
            r3.<init>(r0)
        L_0x003a:
            com.instagram.common.session.UserSession r1 = r5.A00
            java.lang.String r0 = "IGDThreadCutoverHelper"
            X.6EZ r0 = X.AnonymousClass6EY.A00(r1, r0)
            X.6Ea r0 = r0.A00
            X.1aU r1 = r0.A00
            r0 = 857(0x359, float:1.201E-42)
            java.lang.String r2 = X.C66579MXk.A00(r0)
            X.Ouw r0 = new X.Ouw
            r0.<init>(r3, r7)
            X.1aU r1 = r1.A0M(r0)
            X.4fh r0 = X.AnonymousClass6F9.A00(r2)
            X.1aU r0 = r1.A0P(r0)
            X.1aU r1 = r0.A0H()
            if (r9 == 0) goto L_0x0072
            X.4fh r0 = X.C318146oT.A01
        L_0x0065:
            X.1aU r0 = r1.A0P(r0)
            X.PSf r3 = new X.PSf
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r4.A02(r0, r3)
            return
        L_0x0072:
            X.4fh r0 = X.C318146oT.A00
            goto L_0x0065
        L_0x0075:
            r0 = 1050(0x41a, float:1.471E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VU.A02(X.3t1, java.util.List, X.0sP, boolean):void");
    }

    public final void A03(MsysThreadId msysThreadId, 0sP r7) {
        0qQ.A0B(msysThreadId, 0);
        UserSession userSession = this.A00;
        C74181PqN pqN = new C74181PqN(r7, 44);
        0qQ.A0B(userSession, 0);
        C295615oa.A01.A02(new C74185PqR(32, (Object) pqN, (Object) msysThreadId), userSession);
    }

    public static final void A00(AnonymousClass7VU r5, C254773t1 r6, List list, 0sP r8, boolean z) {
        C269794fh r0;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingRecipient) it.next()).getId());
        }
        UserSession userSession = r5.A00;
        boolean A06 = 182.A06(0Tu.A06, userSession, 36313055134811762L);
        C304566Ea r02 = AnonymousClass6EY.A00(userSession, "IGDThreadCutoverHelper").A00;
        1aU A0H = 1aU.A01(new AYV(), r02.A00, r02.A01).A0M(new C72023Oux(arrayList, A06)).A0P(AnonymousClass6F9.A00(C66579MXk.A00(858))).A0H();
        if (z) {
            r0 = C318146oT.A01;
        } else {
            r0 = C318146oT.A00;
        }
        1aU A0P = A0H.A0P(r0);
        1a8 r1 = new 1a8((C269794fh) null);
        r1.A02(A0P, new Aht(r1, r6, list, r8));
    }

    public final void A01(Activity activity, AnonymousClass4DH r15, AnonymousClass0iw r16, UserSession userSession, C254773t1 r18, List list) {
        AnonymousClass4DH r8 = r15;
        0qQ.A0B(r15, 1);
        AnonymousClass0iw r9 = r16;
        0qQ.A0B(r9, 4);
        Activity activity2 = activity;
        if (activity != null) {
            List<User> list2 = list;
            if (list != null) {
                ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
                for (User pendingRecipient : list2) {
                    arrayList.add(new PendingRecipient(pendingRecipient));
                }
                A02(r18, arrayList, new C58802Ixn(this, activity2, r8, r9, userSession, "cutover_auto_redirect", 3), true);
            }
        }
    }

    public AnonymousClass7VU(UserSession userSession) {
        this.A00 = userSession;
    }
}
