package com.instagram.direct.fragment.channels.activityfeed;

import X.02z;
import X.05F;
import X.05G;
import X.0sn;
import X.106;
import X.10b;
import X.1Eo;
import X.1bJ;
import X.2Dm;
import X.2YL;
import X.AnonymousClass0Ud;
import X.AnonymousClass109;
import X.AnonymousClass10A;
import X.AnonymousClass10H;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C229122ms;
import X.C262204Co;
import X.C318116oQ;
import X.C318136oS;
import X.C51966G9m;
import X.C51970G9q;
import X.C61820pm;
import X.C62509Kgz;
import X.C66164MGb;
import X.C66192MHi;
import X.C66193MHj;
import X.C70651OEy;
import X.DbS;
import X.DbX;
import X.JTZ;
import X.OBO;
import X.OBP;
import X.PRL;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

public final class BroadcastChannelActivityFeedV2ViewModel extends 2YL {
    public C262204Co A00;
    public final int A01;
    public final Resources A02;
    public final C70651OEy A03;
    public final 2Dm A04;
    public final C229122ms A05 = new PRL(this, 2);
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final UserSession A09;
    public final 05G A0A;
    public final 05G A0B = 106.A01((Object) null);
    public final 05G A0C = 106.A01((Object) null);
    public final AnonymousClass0Ud A0D;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        if (r0 != r5) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel r15, X.AnonymousClass4D7 r16, int r17) {
        /*
            r3 = 27
            r4 = r16
            boolean r0 = X.C66129MDh.A01(r3, r4)
            if (r0 == 0) goto L_0x0113
            r6 = r4
            X.MDh r6 = (X.C66129MDh) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0113
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r7 = 1
            if (r1 == 0) goto L_0x009f
            if (r1 != r7) goto L_0x0135
            java.lang.Object r15 = r6.A01
            com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel r15 = (com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel) r15
            X.0eS.A00(r0)
        L_0x002a:
            r5 = r0
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0076
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r1 = r5.A00
            X.NHF r1 = (X.NHF) r1
            java.util.List r0 = r1.A02
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0041:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r2 = r3.next()
            X.OHq r2 = (X.C70721OHq) r2
            java.lang.String r7 = r2.A05
            if (r7 == 0) goto L_0x0123
            java.lang.String r8 = r2.A03
            if (r8 == 0) goto L_0x0120
            java.lang.String r9 = r2.A02
            if (r9 == 0) goto L_0x011d
            java.lang.String r10 = r2.A04
            if (r10 == 0) goto L_0x011a
            java.lang.Integer r0 = r2.A00
            int r12 = X.DbX.A01(r0)
            java.lang.String r11 = r2.A01
            if (r11 == 0) goto L_0x0126
            boolean r13 = r2.A07
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            boolean r14 = r2.A06
            X.N63 r5 = new X.N63
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.add(r5)
            goto L_0x0041
        L_0x0076:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0092
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007f:
            X.05G r3 = r15.A0B
            java.lang.Integer r2 = r1.A00
            java.lang.String r1 = r1.A01
            X.OBO r0 = new X.OBO
            r0.<init>(r2, r1)
            r3.Epw(r0)
            X.3Ih r5 = new X.3Ih
            r5.<init>(r4)
        L_0x0092:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0130
            X.5sO r5 = X.DbU.A0f()
            return r5
        L_0x009f:
            X.0eS.A00(r0)
            r3 = 0
            com.instagram.common.session.UserSession r8 = r15.A09
            if (r17 != 0) goto L_0x00d9
            r2 = 5
            java.lang.String r9 = "following_unjoined"
            X.1NY r8 = X.AnonymousClass7TG.A0b(r8)
            java.lang.String r0 = "direct_v2/threads/broadcast/activity/"
            r8.A0A(r0)
            java.lang.Class<X.NHF> r1 = X.NHF.class
            java.lang.Class<X.OQA> r0 = X.OQA.class
            r8.A0Q(r1, r0)
            java.lang.String r0 = "thread_limit"
        L_0x00bc:
            r8.A0C(r0, r2)
        L_0x00bf:
            java.lang.String r0 = "cursor_thread_id"
            r8.A0G(r0, r3)
            java.lang.String r0 = "list_type"
            r8.A0G(r0, r9)
            X.1OC r1 = r8.A0M()
            r6.A01 = r15
            r6.A00 = r7
            r0 = -5
            java.lang.Object r0 = r1.A00(r0, r6)
            if (r0 != r5) goto L_0x002a
        L_0x00d8:
            return r5
        L_0x00d9:
            X.05G r1 = r15.A0B
            java.lang.Object r0 = r1.getValue()
            X.OBO r0 = (X.OBO) r0
            if (r0 == 0) goto L_0x0111
            java.lang.Integer r4 = r0.A00
        L_0x00e5:
            java.lang.Object r0 = r1.getValue()
            X.OBO r0 = (X.OBO) r0
            if (r0 == 0) goto L_0x00ef
            java.lang.String r3 = r0.A01
        L_0x00ef:
            r2 = 20
            java.lang.String r9 = "following_unjoined"
            X.1NY r8 = X.AnonymousClass7TG.A0b(r8)
            java.lang.String r0 = "direct_v2/threads/broadcast/activity/"
            r8.A0A(r0)
            java.lang.Class<X.NHF> r1 = X.NHF.class
            java.lang.Class<X.OQA> r0 = X.OQA.class
            r8.A0Q(r1, r0)
            java.lang.String r0 = "thread_limit"
            r8.A0C(r0, r2)
            if (r4 == 0) goto L_0x00bf
            int r2 = r4.intValue()
            java.lang.String r0 = "cursor_timestamp_seconds"
            goto L_0x00bc
        L_0x0111:
            r4 = r3
            goto L_0x00e5
        L_0x0113:
            X.MDh r6 = new X.MDh
            r6.<init>(r15, r4, r3)
            goto L_0x0018
        L_0x011a:
            java.lang.String r0 = "threadId"
            goto L_0x0128
        L_0x011d:
            java.lang.String r0 = "imageUrl"
            goto L_0x0128
        L_0x0120:
            java.lang.String r0 = "subtitle"
            goto L_0x0128
        L_0x0123:
            java.lang.String r0 = "title"
            goto L_0x0128
        L_0x0126:
            java.lang.String r0 = "creatorUsername"
        L_0x0128:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0130:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0135:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel.A00(com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel, X.4D7, int):java.lang.Object");
    }

    public final void A01() {
        05G r2 = this.A06;
        if (r2.getValue() != C62509Kgz.SUCCESS) {
            r2.Epw(C62509Kgz.INITIAL_LOAD);
            C51970G9q.A1S(this.A00);
            int i = this.A01;
            if (i == 1) {
                this.A00 = C51966G9m.A1L(new JTZ(this, (AnonymousClass4D7) null, i), C318116oQ.A00(this));
                return;
            }
            throw AnonymousClass7TE.A0w("Invalid fetch mode");
        }
    }

    public final void A02() {
        C62509Kgz kgz;
        05G r2 = this.A06;
        if (r2.getValue() != C62509Kgz.INITIAL_LOAD && r2.getValue() != (kgz = C62509Kgz.PAGINATION_LOAD) && A03()) {
            r2.Epw(kgz);
            C51970G9q.A1S(this.A00);
            int i = this.A01;
            if (i == 1) {
                this.A00 = 1Eo.A04(DbX.A0c(AnonymousClass12T.A00), new C66164MGb(this, (AnonymousClass4D7) null, i, 19), C318116oQ.A00(this));
                return;
            }
            throw AnonymousClass7TE.A0w("Invalid fetch mode");
        }
    }

    public final boolean A03() {
        05G r0;
        Integer num;
        int i = this.A01;
        if (i == 0) {
            r0 = this.A0C;
        } else if (i == 1) {
            r0 = this.A0B;
        } else {
            throw AnonymousClass7TE.A0w("Invalid fetch mode");
        }
        OBO obo = (OBO) r0.getValue();
        if (obo == null || (num = obo.A00) == null || num.intValue() != -1) {
            return true;
        }
        return false;
    }

    public BroadcastChannelActivityFeedV2ViewModel(Resources resources, UserSession userSession, C70651OEy oEy, int i) {
        AnonymousClass7TG.A1Q(userSession, oEy);
        this.A02 = resources;
        this.A09 = userSession;
        this.A03 = oEy;
        this.A01 = i;
        C62509Kgz kgz = C62509Kgz.INITIAL_LOAD;
        02z A10 = DbS.A10(kgz);
        this.A06 = A10;
        0sn r4 = 0sn.A00;
        02z A012 = 106.A01(r4);
        this.A07 = A012;
        02z A013 = 106.A01(r4);
        this.A0A = A013;
        C61820pm A032 = AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 7), A012, A013);
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass109 r3 = AnonymousClass10A.A01;
        05F A022 = 10b.A02(r4, A002, A032, r3);
        this.A0D = A022;
        this.A04 = 1bJ.A00(userSession);
        C61820pm A014 = C66193MHj.A01(A10, A022, 21);
        this.A08 = 10b.A02(new OBP(kgz, r4), C318116oQ.A00(this), A014, r3);
    }
}
