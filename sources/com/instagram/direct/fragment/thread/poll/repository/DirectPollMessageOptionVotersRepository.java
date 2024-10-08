package com.instagram.direct.fragment.thread.poll.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.AnonymousClass0Ud;
import X.AnonymousClass0lh;
import X.C51967G9n;
import X.C61905KQy;
import X.JTO;
import com.instagram.common.session.UserSession;

public final class DirectPollMessageOptionVotersRepository implements AnonymousClass0lh {
    public final AnonymousClass0Ud A00;
    public final AnonymousClass0Ud A01;
    public final AnonymousClass0Ud A02;
    public final UserSession A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;

    public DirectPollMessageOptionVotersRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        02z A1J = JTO.A1J();
        this.A06 = A1J;
        02z A012 = 106.A01(C61905KQy.A00);
        this.A05 = A012;
        02z A0u = C51967G9n.A0u();
        this.A04 = A0u;
        this.A02 = 10b.A03(A1J);
        this.A01 = 10b.A03(A012);
        this.A00 = 10b.A03(A0u);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository r13, java.lang.String r14, java.lang.String r15, X.AnonymousClass4D7 r16) {
        /*
            r4 = 4
            r5 = r16
            boolean r0 = X.ME7.A02(r4, r5)
            if (r0 == 0) goto L_0x008b
            r2 = r5
            X.ME7 r2 = (X.ME7) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x008b
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0017:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r4) goto L_0x0098
            X.0eS.A00(r0)
        L_0x0025:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0032
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0093
            X.5sO r3 = X.DbU.A0f()
        L_0x0032:
            return r3
        L_0x0033:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r13.A03
            X.0Ud r0 = r13.A00
            java.lang.Object r6 = r0.getValue()
            java.lang.String r6 = (java.lang.String) r6
            X.AnonymousClass7TF.A1B(r14, r4, r15)
            X.1NY r5 = X.DbU.A0M(r1)
            java.lang.String r7 = "api/"
            java.lang.String r8 = "v1/"
            java.lang.String r9 = "direct_v2/"
            java.lang.String r10 = "group_poll/"
            java.lang.String r11 = "%s/"
            java.lang.String r12 = "options/"
            r5.A05()
            r5.A02()
            r13 = r11
            java.lang.String r1 = X.002.A15(r7, r8, r9, r10, r11, r12, r13)
            X.0qQ.A07(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r15}
            X.DbU.A1P(r5, r1, r0)
            java.lang.Class<X.CDt> r1 = X.C43801CDt.class
            java.lang.Class<X.Cyj> r0 = X.C45571Cyj.class
            r5.A0Q(r1, r0)
            if (r6 == 0) goto L_0x0076
            java.lang.String r0 = "cursor"
            r5.A9m(r0, r6)
        L_0x0076:
            X.1OC r1 = r5.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetGroupPollOptionDetailsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetGroupPollOptionDetailsResponse>>"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r4
            r0 = 507883296(0x1e45af20, float:1.0465308E-20)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0025
            return r3
        L_0x008b:
            r0 = 42
            X.ME7 r2 = new X.ME7
            r2.<init>(r13, r5, r4, r0)
            goto L_0x0017
        L_0x0093:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository.A00(com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r12, java.lang.String r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r11 = this;
            r3 = 30
            boolean r0 = X.C66129MDh.A01(r3, r14)
            if (r0 == 0) goto L_0x008c
            r4 = r14
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x006d
            if (r0 != r2) goto L_0x009b
            java.lang.Object r5 = r4.A01
            com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository r5 = (com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository) r5
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0092
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r8 = r1.A00
            X.371 r8 = (X.AnonymousClass371) r8
            X.05G r9 = r5.A06
            java.util.Collection r10 = X.JTO.A13(r9)
            java.lang.Object r0 = r8.FH3()
            X.JtS r0 = (X.C60908JtS) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x004a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a0
            com.instagram.user.model.User r0 = X.DbT.A0k(r6)
            java.lang.String r4 = r0.getId()
            java.lang.String r3 = r0.getFullName()
            java.lang.String r2 = r0.getUsername()
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel r0 = new com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel
            r0.<init>(r1, r4, r3, r2)
            r7.add(r0)
            goto L_0x004a
        L_0x006d:
            X.0eS.A00(r1)
            if (r15 == 0) goto L_0x0079
            X.05G r1 = r11.A06
            X.0sn r0 = X.0sn.A00
            r1.Epw(r0)
        L_0x0079:
            X.05G r1 = r11.A05
            X.KQz r0 = X.C61906KQz.A00
            r1.Epw(r0)
            r4.A01 = r11
            r4.A00 = r2
            java.lang.Object r1 = A00(r11, r12, r13, r4)
            if (r1 == r3) goto L_0x00cd
            r5 = r11
            goto L_0x0028
        L_0x008c:
            X.MDh r4 = new X.MDh
            r4.<init>(r11, r14, r3)
            goto L_0x0016
        L_0x0092:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00bc
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a0:
            java.util.ArrayList r0 = X.00k.A0S(r7, r10)
            r9.Epw(r0)
            X.05G r1 = r5.A04
            java.lang.Object r0 = r8.FH3()
            X.JtS r0 = (X.C60908JtS) r0
            java.lang.String r0 = r0.A00
            r1.Epw(r0)
            X.05G r1 = r5.A05
            X.KQw r0 = X.C61903KQw.A00
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x00bc:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ce
            X.05G r1 = r5.A05
            X.KQx r0 = X.C61904KQx.A00
            r1.Epw(r0)
        L_0x00cb:
            X.0gF r3 = X.C60340gF.A00
        L_0x00cd:
            return r3
        L_0x00ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.thread.poll.repository.DirectPollMessageOptionVotersRepository.A01(java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        this.A06.Epw(0sn.A00);
        this.A05.Epw(C61905KQy.A00);
        this.A04.Epw((Object) null);
    }
}
