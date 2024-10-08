package X;

import android.view.View;

/* renamed from: X.Oja  reason: case insensitive filesystem */
public final class C71376Oja implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C71003OWa A01;
    public final /* synthetic */ C274694ou A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public C71376Oja(C71003OWa oWa, C274694ou r2, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = oWa;
        this.A02 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A09 = z;
        this.A03 = str3;
        this.A06 = z2;
        this.A08 = z3;
        this.A07 = z4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r0 = -1473642749(0xffffffffa829ff03, float:-9.436681E-15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r6 = r19
            X.OWa r4 = r6.A01
            r4.A01()
            X.4ou r3 = r6.A02
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x01e8
            com.instagram.user.model.User r8 = r4.A0C
            if (r8 == 0) goto L_0x01e8
            java.lang.String r0 = "appointment_booking_cta"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x01e8
            com.instagram.common.session.UserSession r7 = r4.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317036569170702(0x8106270000130e, double:3.030378391087465E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x01e8
            X.OZW r9 = X.OZW.A00
            android.app.Activity r2 = r4.A06
            X.DbS.A1X(r2)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.0iw r1 = r4.A09
            java.lang.String r0 = r7.A06
            java.lang.String r15 = r8.getId()
            r16 = 0
            java.lang.String r13 = "com.bloks.www.services.ig.appointment.customer"
            java.lang.String r17 = "composer"
            r10 = r2
            r11 = r1
            r12 = r7
            r14 = r0
            r18 = r16
            r9.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0053:
            int r2 = r6.A00
            r17 = r20
            X.0qQ.A0A(r17)
            boolean r8 = r6.A09
            java.lang.String r0 = r6.A05
            r16 = r0
            java.lang.String r11 = r6.A04
            java.lang.String r10 = r6.A03
            boolean r1 = r6.A06
            boolean r7 = r6.A08
            boolean r0 = r6.A07
            X.OL7 r9 = r4.A0B
            X.Nje r12 = r4.A02
            if (r8 == 0) goto L_0x015e
            if (r12 != 0) goto L_0x0074
            X.Nje r12 = X.C69339Nje.A04
        L_0x0074:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            X.0wc r10 = r9.A01
            java.lang.String r0 = "direct_thread_icebreaker_click"
            X.0kJ r6 = r10.A00
            X.0Aj r8 = r10.A00(r6, r0)
            boolean r0 = r8.isSampled()
            if (r0 == 0) goto L_0x00dc
            X.N0b r15 = new X.N0b
            r15.<init>()
            long r0 = r9.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "author_id"
            r15.A05(r0, r1)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r16)
            java.lang.String r0 = "title"
            r15.A07(r0, r1)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r11)
            java.lang.String r0 = "payload"
            r15.A07(r0, r1)
            X.NmG r1 = r12.A00
            java.lang.String r0 = "entry_point"
            r15.A01(r1, r0)
            java.lang.String r0 = "automated_message"
            r8.AAK(r15, r0)
            X.N0c r11 = new X.N0c
            r11.<init>()
            java.lang.String r1 = r9.A03
            java.lang.String r0 = "id"
            r11.A06(r0, r1)
            java.lang.String r0 = "thread"
            r8.AAK(r11, r0)
            r0 = 769(0x301, float:1.078E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r8.A7p(r0, r14)
            java.lang.String r0 = "is_ctd_ib_override"
            r8.A7p(r0, r13)
            r8.Cgf()
        L_0x00dc:
            android.view.ViewParent r1 = r17.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0157
            r0 = r17
            int r0 = r1.indexOfChild(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x00ee:
            java.lang.Long r8 = (java.lang.Long) r8
            java.lang.String r0 = "igd_default_icebreaker_click"
            X.0Aj r6 = r10.A00(r6, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x013c
            long r0 = r9.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "professional_igid"
            r6.A9F(r0, r1)
            com.instagram.common.session.UserSession r0 = r9.A02
            java.lang.String r0 = r0.A06
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "consumer_igid"
            r6.A9F(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r9 = ""
            if (r1 != 0) goto L_0x011b
            r1 = r9
        L_0x011b:
            java.lang.String r0 = "icebreaker_id"
            r6.AAJ(r0, r1)
            java.lang.String r1 = r3.A06
            if (r1 != 0) goto L_0x0125
            r1 = r9
        L_0x0125:
            java.lang.String r0 = "vertical"
            r6.AAJ(r0, r1)
            java.lang.String r0 = r3.A04
            if (r0 == 0) goto L_0x012f
            r9 = r0
        L_0x012f:
            java.lang.String r0 = "subvertical"
            r6.AAJ(r0, r9)
            java.lang.String r0 = "position"
            r6.A9F(r0, r8)
            r6.Cgf()
        L_0x013c:
            com.instagram.common.session.UserSession r0 = r4.A0A
            X.7TN r3 = X.AnonymousClass7TM.A00(r0)
            r1 = 9
        L_0x0144:
            X.MJ3 r0 = new X.MJ3
            r0.<init>(r2, r1, r3)
            X.AnonymousClass7TN.A00(r3, r0)
            r0 = 1
            r4.A04(r0, r7)
            r0 = -1596463186(0xffffffffa0d7e7ae, float:-3.657573E-19)
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0157:
            r0 = -1
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            goto L_0x00ee
        L_0x015e:
            if (r12 != 0) goto L_0x0162
            X.Nje r12 = X.C69339Nje.A06
        L_0x0162:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            X.0wc r1 = r9.A01
            java.lang.String r0 = "direct_thread_quickreply_click"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x01de
            X.N0f r8 = new X.N0f
            r8.<init>()
            long r0 = r9.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "author_id"
            r8.A05(r0, r1)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r16)
            java.lang.String r0 = "title"
            r8.A07(r0, r1)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r11)
            java.lang.String r0 = "payload"
            r8.A07(r0, r1)
            X.NmG r1 = r12.A00
            java.lang.String r0 = "entry_point"
            r8.A01(r1, r0)
            X.N0g r3 = new X.N0g
            r3.<init>()
            java.lang.String r1 = r9.A03
            java.lang.String r0 = "id"
            r3.A06(r0, r1)
            java.lang.String r0 = "ai_bot_quick_reply_payload"
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 == 0) goto L_0x01d1
            r0 = 38
            java.lang.String r9 = "type"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r0 = r8.A00
            r0.put(r9, r1)
            java.lang.String r0 = "prev_bot_response_id"
            r8.A06(r0, r10)
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "chosen_id"
            r8.A06(r0, r1)
            X.XSV r0 = X.XSV.A02
            r3.A01(r0, r9)
        L_0x01d1:
            java.lang.String r0 = "automated_message"
            r6.AAK(r8, r0)
            java.lang.String r0 = "thread"
            r6.AAK(r3, r0)
            r6.Cgf()
        L_0x01de:
            com.instagram.common.session.UserSession r0 = r4.A0A
            X.7TN r3 = X.AnonymousClass7TM.A00(r0)
            r1 = 10
            goto L_0x0144
        L_0x01e8:
            X.0sK r9 = r4.A0G
            java.lang.String r8 = r6.A05
            java.lang.String r7 = r6.A04
            java.lang.String r0 = "ai_bot_quick_reply_payload"
            boolean r0 = X.0qQ.A0K(r7, r0)
            r2 = 2
            r1 = 0
            if (r0 == 0) goto L_0x0204
            java.lang.String r0 = "suggested_prompt_pills"
        L_0x01fa:
            X.N49 r1 = new X.N49
            r1.<init>(r0, r2)
        L_0x01ff:
            r9.invoke(r8, r7, r1)
            goto L_0x0053
        L_0x0204:
            r0 = 1444(0x5a4, float:2.023E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x01ff
            java.lang.String r0 = "icebreakers"
            goto L_0x01fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71376Oja.onClick(android.view.View):void");
    }
}
