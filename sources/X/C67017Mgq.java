package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mgq  reason: case insensitive filesystem */
public final class C67017Mgq extends AnonymousClass9HT {
    public 2EM A00;
    public Long A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final C2366634p A05;
    public final C2366634p A06;
    public final C2366634p A07;
    public final C2366634p A08;
    public final C2366634p A09;
    public final C2366634p A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final void A0M() {
        C2366634p r0;
        if (182.A06(0Tu.A05, this.A07, 36324033071754952L) && !this.A03 && !this.A04 && (r0 = this.A08) != null) {
            r0.A03();
        }
        super.A0M();
    }

    public final boolean A0S() {
        return !this.A0B;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67017Mgq(UserSession userSession, 2EM r14, Boolean bool, boolean z, boolean z2, boolean z3) {
        super(userSession, "threads", 31784971, z, false);
        C2366634p r1;
        C2366634p r0;
        C2366634p r02;
        0qQ.A0B(userSession, 1);
        this.A0B = z2;
        this.A0C = z3;
        this.A00 = r14;
        C2366634p r5 = null;
        if (!z3 || bool == null || bool.booleanValue()) {
            r1 = null;
        } else {
            r1 = new C2366634p(this, "msys_db_access");
            this.A06.add(r1);
        }
        this.A09 = r1;
        if (bool == null || bool.booleanValue()) {
            r0 = null;
        } else {
            r0 = A02("first_threads_snapshot");
        }
        this.A06 = r0;
        this.A05 = A02("awaiting_iris_deltas");
        C2366634p r12 = new C2366634p(this, "on_view_created");
        this.A06.add(r12);
        this.A0A = r12;
        UserSession userSession2 = this.A07;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession2, 36324033071754952L)) {
            r02 = A02("mem_offline_sync");
        } else {
            r02 = null;
        }
        this.A08 = r02;
        this.A07 = 182.A06(r3, userSession2, 36324033071754952L) ? A02("iris_sub_message_sync") : r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (r1 == null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r8 = this;
            super.A05()
            boolean r1 = r8.A0C
            java.lang.String r0 = "is_e2ee_ui_enabled"
            r8.A0K(r0, r1)
            boolean r0 = r8.A03
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "has_tlc_threads"
            r8.A0K(r0, r1)
        L_0x0015:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "has_ttlc_threads"
            r8.A0K(r0, r1)
        L_0x001e:
            X.2EM r1 = r8.A00
            if (r1 == 0) goto L_0x0031
            java.lang.Integer r0 = r1.A02
            int r0 = r0.intValue()
            java.lang.String r1 = r1.A04
            if (r0 == r6) goto L_0x0061
            java.lang.String r0 = "selected_row"
        L_0x002e:
            r8.A0J(r0, r1)
        L_0x0031:
            java.util.List r0 = r8.A02
            r7 = 0
            if (r0 == 0) goto L_0x0084
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2Eq r0 = (X.2Eq) r0
            int r0 = r0.C6a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.add(r0)
            if (r0 == 0) goto L_0x0042
            r3.add(r1)
            goto L_0x0042
        L_0x0061:
            java.lang.String r0 = "selected_tab"
            goto L_0x002e
        L_0x0064:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r1.next()
            X.2Eq r0 = (X.2Eq) r0
            int r0 = r0.C6a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.add(r0)
            goto L_0x006c
        L_0x0084:
            X.02m r5 = r8.A05
            int r4 = r8.A01
            int r2 = r8.A00
            if (r7 == 0) goto L_0x00b9
            int[] r1 = X.00k.A0x(r7)
        L_0x0090:
            java.lang.String r0 = "thread_type_list"
            r5.markerAnnotate(r4, r2, r0, r1)
            int r3 = r8.A00
            if (r7 == 0) goto L_0x00c4
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x00a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r0 = X.AnonymousClass48O.A00(r0)
            r2.add(r0)
            goto L_0x00a1
        L_0x00b9:
            int[] r1 = new int[]{r6}
            goto L_0x0090
        L_0x00be:
            java.lang.String[] r1 = X.DbU.A1b(r2, r6)
            if (r1 != 0) goto L_0x00ce
        L_0x00c4:
            java.lang.String r0 = "THREAD_LIST_EMPTY"
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String[] r1 = X.DbU.A1b(r0, r6)
        L_0x00ce:
            java.lang.String r0 = "thread_type_str_list"
            r5.markerAnnotate(r4, r3, r0, r1)
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L_0x0125
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x00df:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.2Eq r0 = (X.2Eq) r0
            int r1 = r0.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x00df
            r7.add(r2)
            goto L_0x00df
        L_0x00f8:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0125
            int r3 = r8.A00
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x0108:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r1.next()
            X.2Eq r0 = (X.2Eq) r0
            java.lang.String r0 = r0.C6k()
            r2.add(r0)
            goto L_0x0108
        L_0x011c:
            java.lang.String[] r1 = X.DbU.A1b(r2, r6)
            java.lang.String r0 = "thread_id_list"
            r5.markerAnnotate(r4, r3, r0, r1)
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67017Mgq.A05():void");
    }

    public final void A0T(long j) {
        C2366634p r0;
        A0I("total_delta_count", Long.valueOf(j));
        if (j == 0 && (r0 = this.A07) != null) {
            r0.A05();
        }
    }
}
