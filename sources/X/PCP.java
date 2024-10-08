package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class PCP implements AnonymousClass7ZA {
    public final 1a8 A00 = C66581MXm.A0P();
    public final UserSession A01;

    public PCP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r2 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r2 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r2.hasNext() == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r1 = X.DbT.A0k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r1.Bjj() == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        r0 = r1.Bjj();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r0 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r0.intValue() == 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = 2131958585;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if (X.182.A05(X.0Tu.A05, r8.A01) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r0 = 2131958583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        r1 = new X.C47124Dr1((java.lang.String) null, (java.lang.String) null, "ADULT_MINOR_GROUP_RESTRICTION", r9.getString(r0), r9.getString(2131958584), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r13.isEmpty() != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r5 = A00(r8);
        r2 = X.C66580MXl.A07(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        return X.C66582MXn.A0N(r5.A00.A0M(new X.C72032Ov7(r5, X.OXK.A02(r13), r2)), "instagram_secure_participants_add").A0L(X.C72109OwT.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1aU A9n(android.content.Context r9, X.C254793t3 r10, X.C67350MmR r11, java.util.List r12, java.util.List r13, int r14) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x004f
            boolean r2 = r13 instanceof java.util.Collection
            if (r2 == 0) goto L_0x003b
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x003b
        L_0x0011:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0068
        L_0x0017:
            X.6Ea r5 = A00(r8)
            long r2 = X.C66580MXl.A07(r10)
            java.util.List r4 = X.OXK.A02(r13)
            X.1aU r1 = r5.A00
            X.Ov7 r0 = new X.Ov7
            r0.<init>(r5, r4, r2)
            X.1aU r1 = r1.A0M(r0)
            java.lang.String r0 = "instagram_secure_participants_add"
            X.1aU r1 = X.C66582MXn.A0N(r1, r0)
            X.OwT r0 = X.C72109OwT.A00
            X.1aU r0 = r1.A0L(r0)
            return r0
        L_0x003b:
            java.util.Iterator r1 = r13.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0065
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            java.lang.Long r0 = r0.BST()
            if (r0 != 0) goto L_0x003f
        L_0x004f:
            r2 = 0
            java.lang.String r5 = "Error"
            java.lang.String r6 = "Some participant's fbid are null"
            X.Dr1 r1 = new X.Dr1
            r3 = r2
            r4 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x005b:
            X.Oxl r0 = new X.Oxl
            r0.<init>(r1)
            X.1aU r0 = X.1aU.A09(r0)
            return r0
        L_0x0065:
            if (r2 == 0) goto L_0x0068
            goto L_0x0011
        L_0x0068:
            java.util.Iterator r2 = r13.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            java.lang.Integer r0 = r1.Bjj()
            if (r0 == 0) goto L_0x006c
            java.lang.Integer r0 = r1.Bjj()
            if (r0 == 0) goto L_0x0088
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x006c
        L_0x0088:
            r2 = 0
            com.instagram.common.session.UserSession r1 = r8.A01
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.182.A05(r0, r1)
            r0 = 2131958585(0x7f131b39, float:1.9553786E38)
            if (r1 == 0) goto L_0x0099
            r0 = 2131958583(0x7f131b37, float:1.9553782E38)
        L_0x0099:
            java.lang.String r5 = r9.getString(r0)
            r0 = 2131958584(0x7f131b38, float:1.9553784E38)
            java.lang.String r6 = r9.getString(r0)
            java.lang.String r4 = "ADULT_MINOR_GROUP_RESTRICTION"
            X.Dr1 r1 = new X.Dr1
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PCP.A9n(android.content.Context, X.3t3, X.MmR, java.util.List, java.util.List, int):X.1aU");
    }

    public final 1aU AGo(C254743sy r6, String str) {
        0qQ.A0B(str, 1);
        return C66582MXn.A0N(A00(this).A01.A0M(new C72028Ov2(C66647MaG.A00(r6), str, 2)), "tam_client_thread_update_thread_image").A0L(C72110OwU.A00);
    }

    public final void AGp(Context context, C254793t3 r17, String str, boolean z) {
        String str2 = str;
        0qQ.A0B(str2, 1);
        if (!00l.A0W(str2)) {
            C254793t3 r4 = r17;
            long A07 = C66580MXl.A07(r4);
            UserSession userSession = this.A01;
            1Ng A002 = AnonymousClass1Nd.A00(userSession);
            A002.A00(new C330937Ov(r4, AnonymousClass05K.A00));
            C68314NAb A012 = C71031OZi.A01(userSession);
            AnonymousClass68L A0F = C66580MXl.A0F(A012, 0);
            MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
            int A003 = C3030067a.A00(A0G);
            TraceInfo A013 = C3030067a.A01(A0G, "MailboxTam", "runTamClientThreadUpdateName");
            if (!A0F.EJd(new C71720Ope(A0G, A012, str2, A003, 5, A07))) {
                A0G.cancel(false);
                C3030067a.A02(A003);
                C3030067a.A03(A013, "MailboxTam", "runTamClientThreadUpdateName");
            }
            PlatformLogger.platformEventLog(5);
            A0G.addResultCallback(new C71723Oph(56, (Object) A002, (Object) r4));
        }
    }

    public final 1aU Cfq(Context context, C254743sy r6) {
        0qQ.A0B(r6, 0);
        return C66582MXn.A0N(A00(this).A02.A0M(new C72010Ouk(C66647MaG.A00(r6))), "tam_client_participant_leave_thread");
    }

    public final void Clk(C254793t3 r1, String str, String str2, int i) {
    }

    public final void Cll(C254793t3 r1) {
    }

    public final void Cm7(C254793t3 r1, String str, boolean z) {
    }

    public final void CmB(DirectMessageIdentifier directMessageIdentifier) {
    }

    public final void Cmn(C254793t3 r1) {
    }

    public final 1aU Cow(AnonymousClass0iw r5, C254793t3 r6, boolean z) {
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A01;
        C70129Nxj.A00(userSession).A04(r5, r6, C66581MXm.A0l(r6), true);
        1aU A0N = C66582MXn.A0N(AnonymousClass6EY.A00(userSession, "MsysThreadActionsManager").A00.A01.A0M(new C72009Ouj(C66580MXl.A07(r6))), "tam_mute_thread_mentions");
        this.A00.A02(A0N, C73042PTz.A00);
        return A0N;
    }

    public final void Cp3(AnonymousClass0iw r11, C254793t3 r12, int i) {
        0qQ.A0B(r12, 0);
        UserSession userSession = this.A01;
        AnonymousClass0iw r5 = r11;
        C70129Nxj.A00(userSession).A01(r5, r12, C66581MXm.A0l(r12), (long) i);
        C70948OSv.A01.A02(userSession, i, C66580MXl.A07(r12));
    }

    public final void Cp4(AnonymousClass0iw r5, C254793t3 r6) {
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A01;
        C70129Nxj.A00(userSession).A03(r5, r6, C66581MXm.A0l(r6), true);
        C71031OZi.A01(userSession).A02(C66580MXl.A07(r6));
    }

    public final 1aU E4f(C254793t3 r6, User user) {
        return C304566Ea.A00(A00(this), OXK.A00(user), 1, C66580MXl.A07(r6)).A0L(OwW.A00);
    }

    public final 1aU EEQ(C254793t3 r8, List list) {
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((MessagingUser) it.next()).A02 == null) {
                    }
                }
            }
            C304566Ea A002 = A00(this);
            long A07 = C66580MXl.A07(r8);
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0r.add(((MessagingUser) it2.next()).A02);
            }
            return C66582MXn.A0N(A002.A00.A0M(new C72025Ouz(A07, A0r, 0)), "tam_client_request_participants_remove");
        }
        return 1aU.A09(false);
    }

    public final void EGT(C254743sy r1) {
    }

    public final 1aU EJz(C254743sy r4, String str, String str2, boolean z) {
        0qQ.A0B(r4, 1);
        return C66581MXm.A0O(C66581MXm.A0M(new Ov3(str, r4, 5), A00(this).A02), "rxmailbox_save_draft_message");
    }

    public final void FHH(UserSession userSession, C242373Tu r15, C254793t3 r16, int i, boolean z, boolean z2) {
        int i2;
        0qQ.A0B(userSession, 0);
        C254793t3 r1 = r16;
        if (r1 instanceof MsysThreadId) {
            MsysThreadId A03 = C300965yF.A03(r1);
            AnonymousClass67N A002 = OUC.A00(userSession);
            long j = A03.A00;
            if (z) {
                i2 = DbS.A04(0Tu.A05, userSession, 36601114296127597L);
            } else {
                i2 = 0;
            }
            AnonymousClass68L A0F = C66580MXl.A0F(A002, 0);
            MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
            int A003 = C3030067a.A00(A0G);
            TraceInfo A012 = C3030067a.A01(A0G, "MailboxInstagramSecureMessage", "runUpdateThreadEphemeralSettings");
            if (!A0F.EJd(new C71676Oov(A003, i2, 1, j, A002, A0G))) {
                A0G.cancel(false);
                C3030067a.A02(A003);
                C3030067a.A03(A012, "MailboxInstagramSecureMessage", "runUpdateThreadEphemeralSettings");
            }
            PlatformLogger.platformEventLog(5);
        }
    }

    public final void FHN(C254793t3 r5, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r5, 0);
        C66671Mae.A0B(this.A01, C300965yF.A01(r5), 002.A1D("MsysThreadActionsManager ", false), z);
    }

    public final void FIg(AnonymousClass0iw r5, C254743sy r6) {
        C254793t3 A08 = C66647MaG.A08(r6);
        if (A08 != null) {
            C70129Nxj.A00(this.A01).A05(r5, A08, Boolean.valueOf(C66647MaG.A0E(r6)), false);
        }
        C66647MaG.A0D(this.A01, r6);
    }

    public final 1aU FIi(AnonymousClass0iw r5, C254793t3 r6, boolean z) {
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A01;
        C70129Nxj.A00(userSession).A04(r5, r6, C66581MXm.A0l(r6), false);
        1aU A0N = C66582MXn.A0N(AnonymousClass6EY.A00(userSession, "MsysThreadActionsManager").A00.A01.A0M(new C72008Oui(C66580MXl.A07(r6))), "tam_unmute_thread_mentions");
        this.A00.A02(A0N, PU0.A00);
        return A0N;
    }

    public final 1aU FIn(AnonymousClass0iw r5, C254793t3 r6) {
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A01;
        C70129Nxj.A00(userSession).A03(r5, r6, C66581MXm.A0l(r6), false);
        1aU A05 = AnonymousClass6EY.A00(userSession, "MsysThreadActionsManager").A00.A05(C66580MXl.A07(r6));
        this.A00.A02(A05, PU1.A00);
        return A05;
    }

    public final void FKs(String str, String str2, String str3) {
    }

    public final void FKt(String str, String str2, String str3) {
    }

    public static C304566Ea A00(PCP pcp) {
        return AnonymousClass6EY.A00(pcp.A01, "MsysThreadActionsManager").A00;
    }

    public final void Cm3(C254793t3 r5) {
        C295615oa.A01.A02(new C74185PqR(44, (Object) r5, (Object) this), this.A01);
    }

    public final void D8Q(C254783t2 r2) {
        this.A00.A01();
    }

    public final void FHI(UserSession userSession, C254793t3 r3, Integer num, int i, int i2) {
        throw AnonymousClass7TE.A0z("Disappearing Mode isn't supported for msys threads.");
    }

    public final 1aU AGN(C254793t3 r2, List list) {
        throw C66583MXo.A0Z();
    }

    public final 1aU AOf(C254793t3 r6, User user) {
        return C304566Ea.A00(A00(this), OXK.A00(user), 0, C66580MXl.A07(r6)).A0L(C72111OwV.A00);
    }

    public final 1aU APP(C254793t3 r2) {
        throw C66583MXo.A0Z();
    }

    public final 1aU ARj(C254793t3 r2) {
        throw C66583MXo.A0Z();
    }

    public final void Clg(C45376CvI cvI) {
        throw C66583MXo.A0Z();
    }

    public final void Cou(AnonymousClass0iw r9, C254743sy r10, int i) {
        long currentTimeMillis;
        C254793t3 A08 = C66647MaG.A08(r10);
        if (A08 != null) {
            AnonymousClass0iw r3 = r9;
            C71005OWe A002 = C70129Nxj.A00(this.A01);
            if (i <= 0) {
                A002.A05(r9, A08, Boolean.valueOf(C66647MaG.A0E(r10)), true);
            } else {
                A002.A02(r3, A08, Boolean.valueOf(C66647MaG.A0E(r10)), (long) i);
            }
        }
        C68313NAa A003 = C70113NxT.A00(this.A01);
        long A004 = C66647MaG.A00(r10);
        if (i < 0) {
            currentTimeMillis = -1;
        } else {
            currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis((long) i);
        }
        A003.A00(A004, currentTimeMillis);
    }

    public final 1aU EDT(C254793t3 r2, List list) {
        throw C66583MXo.A0Z();
    }

    public final 1aU EE7(C254793t3 r2, List list) {
        throw C66583MXo.A0Z();
    }

    public final 1aU EEm(C254743sy r6) {
        return C66582MXn.A0N(A00(this).A01.A0M(new C72017Our(C66647MaG.A00(r6), 3)), "tam_client_thread_remove_thread_image").A0L(C72112OwX.A00);
    }

    public final void Eyu(String str, String str2) {
        throw C66583MXo.A0Z();
    }

    public final void Cm2(C376509Ig r1, C254793t3 r2, boolean z) {
        Cm3(r2);
    }
}
