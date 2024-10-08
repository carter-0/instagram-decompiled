package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.74Y  reason: invalid class name */
public final class AnonymousClass74Y extends 1P0 {
    public final UserSession A00;
    public final AnonymousClass7BV A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d8, code lost:
        if (r9.A03(r5) == false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r29) {
        /*
            r28 = this;
            r9 = r29
            r0 = 617654934(0x24d0aa96, float:9.0494605E-17)
            int r13 = X.AnonymousClass0fD.A03(r0)
            X.74W r9 = (X.AnonymousClass74W) r9
            r0 = -1130747864(0xffffffffbc9a2828, float:-0.018817976)
            int r12 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r9, r7)
            r1 = r28
            java.lang.String r10 = r1.A03
            X.1bc r0 = X.C370748x0.A00()
            com.instagram.common.session.UserSession r5 = r1.A00
            X.8x1 r8 = r0.A00(r5)
            java.lang.String r15 = r1.A02
            boolean r14 = r1.A04
            X.7BV r2 = r1.A01
            X.0qQ.A0B(r5, r7)
            r0 = 4
            X.0qQ.A0B(r10, r0)
            X.43S r1 = r8.A02
            if (r2 == 0) goto L_0x0040
            X.02m r6 = r1.A00
            int r4 = r2.A01
            int r3 = r2.A00
            java.lang.String r0 = "network_fetch_end"
            r6.markerPoint(r4, r3, r0)
        L_0x0040:
            X.8wd r0 = r9.A02
            if (r0 != 0) goto L_0x0058
            java.lang.String r3 = "server_response"
            java.lang.String r0 = "server_response_has_no_thread_result"
            r1.A0A(r2, r3, r0)
        L_0x004b:
            r0 = 1798181848(0x6b2e13d8, float:2.104468E26)
            X.AnonymousClass0fD.A0A(r0, r12)
            r0 = -1182410741(0xffffffffb985d80b, float:-2.55287E-4)
            X.AnonymousClass0fD.A0A(r0, r13)
            return
        L_0x0058:
            boolean r3 = r0.A04(r5)
            r4 = 1
            r6 = r3 ^ 1
            java.lang.String r3 = "may_run_after_thread_jid_cache_loaded"
            r1.A0B(r2, r3, r6)
            boolean r6 = r0.A04(r5)
            java.lang.String r3 = "should_query_reverb_for_thread"
            r1.A0B(r2, r3, r6)
            java.util.List r3 = r0.A07
            r6 = 0
            if (r3 == 0) goto L_0x00bc
            java.util.List r16 = X.00k.A0X(r3)
            int r19 = r16.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r11 = r16.iterator()
        L_0x0083:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0097
            java.lang.Object r3 = r11.next()
            X.3su r3 = (X.C254703su) r3
            java.lang.String r3 = r3.A1Y
            if (r3 == 0) goto L_0x0083
            r9.add(r3)
            goto L_0x0083
        L_0x0097:
            int r20 = r9.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r16.iterator()
        L_0x00a4:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto L_0x00c2
            java.lang.Object r9 = r11.next()
            X.3su r9 = (X.C254703su) r9
            java.lang.String r9 = r9.A0g()
            if (r9 != 0) goto L_0x00b8
            java.lang.String r9 = ""
        L_0x00b8:
            r3.add(r9)
            goto L_0x00a4
        L_0x00bc:
            r19 = -1
            r20 = 0
            X.0sn r3 = X.0sn.A00
        L_0x00c2:
            java.lang.Long r9 = r0.A00()
            long r21 = r9.longValue()
            boolean r23 = r0.A03()
            X.3Tu r9 = r0.A0Z
            if (r9 == 0) goto L_0x00da
            boolean r9 = r9.A03(r5)
            r24 = 1
            if (r9 != 0) goto L_0x00dc
        L_0x00da:
            r24 = 0
        L_0x00dc:
            r16 = r1
            r17 = r2
            r18 = r3
            r16.A0G(r17, r18, r19, r20, r21, r23, r24)
            X.8x3 r9 = r8.A01
            if (r9 == 0) goto L_0x00ee
            java.lang.String r3 = "thread_fetch"
            r9.A00(r0, r3, r4)
        L_0x00ee:
            java.lang.String r3 = r0.A1D
            com.instagram.model.direct.DirectThreadKey r11 = new com.instagram.model.direct.DirectThreadKey
            r11.<init>(r3, r6)
            java.util.List r3 = r0.A1c
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            X.0qQ.A07(r3)
            java.lang.Boolean r8 = r0.A0y
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            X.0qQ.A0K(r8, r4)
            X.7Qc r8 = new X.7Qc
            r8.<init>(r11, r3)
            X.C370748x0.A00()
            X.MdY r16 = X.C66843Mdb.A01(r5)
            java.lang.Long r3 = r0.A00()
            long r23 = r3.longValue()
            r22 = 20
            X.0Tu r11 = X.0Tu.A05
            r3 = 36600366978109296(0x8207d700610f70, double:3.209557682580215E-306)
            long r25 = X.182.A01(r11, r5, r3)
            r27 = r14
            r21 = r10
            r20 = r15
            r19 = r0
            r18 = r2
            r17 = r8
            r16.A0B(r17, r18, r19, r20, r21, r22, r23, r25, r27)
            java.util.List r3 = X.C370758x1.A00(r0)
            r0.A07 = r3
            X.8xD r8 = r0.A01
            if (r8 == 0) goto L_0x0169
            boolean r3 = r8.A03
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            java.util.List r3 = r8.A01
            int r3 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.util.List r3 = r8.A02
            if (r3 == 0) goto L_0x015d
            int r3 = r3.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
        L_0x015d:
            r1.A0F(r2, r5, r4, r6)
            if (r9 == 0) goto L_0x004b
            java.lang.String r1 = "thread_fetch"
            r9.A00(r0, r1, r7)
            goto L_0x004b
        L_0x0169:
            r5 = r6
            r4 = r6
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74Y.onSuccessInBackground(java.lang.Object):void");
    }

    public AnonymousClass74Y(UserSession userSession, AnonymousClass7BV r2, String str, String str2, boolean z) {
        this.A00 = userSession;
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A01 = r2;
    }

    public final void onFailInBackground(C268654dm r3) {
        AnonymousClass0fD.A0A(-844195795, AnonymousClass0fD.A03(-1002950445));
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(1370172776, AnonymousClass0fD.A03(81223662));
    }
}
