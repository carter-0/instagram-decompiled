package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Obj  reason: case insensitive filesystem */
public final class C71088Obj {
    public final 0sP A00;
    public final 0sP A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sP A04;
    public final 0sK A05;

    public C71088Obj(0sP r2, 0sP r3, 0sP r4, 0sP r5, 0sP r6, 0sK r7) {
        0qQ.A0B(r2, 1);
        C51974G9v.A1S(r3, r7, r4, r5, r6);
        this.A00 = r2;
        this.A02 = r3;
        this.A05 = r7;
        this.A01 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }

    public static final void A01(UserSession userSession, C71088Obj obj, C66880MeH meH, String str, String str2) {
        C71088Obj obj2 = obj;
        obj.A05.invoke(userSession, String.valueOf(meH.A01.A03), new C59146J8c(obj2, meH.A02, meH, str2, str, 0));
    }

    public final void A03(UserSession userSession, C66880MeH meH, String str) {
        0qQ.A0B(str, 1);
        AnonymousClass6BJ r4 = meH.A01;
        AnonymousClass69E.A00(String.valueOf(r4.A03)).DUa(meH.A00, -1, str);
        if (r4.A0Q) {
            A01(userSession, this, meH, str, C273654mx.A00(103));
            A02(userSession, meH, str);
        }
    }

    public final void A04(UserSession userSession, C66880MeH meH, String str) {
        0qQ.A0B(str, 1);
        AnonymousClass6BJ r4 = meH.A01;
        AnonymousClass69E.A00(String.valueOf(r4.A03)).DUd(meH.A00, -1, str);
        if (r4.A0Q) {
            A01(userSession, this, meH, str, C273654mx.A00(462));
            A02(userSession, meH, str);
            return;
        }
        A00(userSession, this, meH, str, 7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bd A[LOOP:0: B:22:0x00b7->B:24:0x00bd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.instagram.common.session.UserSession r20, X.C66880MeH r21, java.lang.String r22, int r23) {
        /*
            r19 = this;
            r6 = 1
            r15 = r22
            X.0qQ.A0B(r15, r6)
            java.lang.String r11 = "DirectNotificationLogger"
            r3 = r21
            X.6BJ r2 = r3.A01
            long r0 = r2.A03
            java.lang.String r9 = java.lang.String.valueOf(r0)
            X.69F r13 = X.AnonymousClass69E.A00(r9)
            long r0 = r3.A00
            java.lang.Integer r14 = r2.A07
            r16 = r23
            r17 = r0
            boolean r13 = r13.DUg(r14, r15, r16, r17)
            java.lang.String r0 = "notification_suppressed"
            X.0xI r5 = X.MYX.A02(r0)
            java.lang.String r1 = r2.A0F
            java.lang.String r0 = "pi"
            r5.A0C(r0, r1)
            java.lang.String r0 = "recipient_id"
            r5.A0C(r0, r9)
            com.instagram.common.notifications.push.intf.PushChannelType r8 = r2.A06
            java.lang.String r1 = r8.name()
            java.lang.String r0 = "push_channel_type"
            r5.A0C(r0, r1)
            java.lang.String r0 = "reason"
            r5.A0C(r0, r15)
            boolean r4 = r2.A0Q
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_e2ee"
            r5.A09(r0, r1)
            boolean r0 = X.C282435Db.A02(r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_bg_account"
            r5.A09(r0, r1)
            X.0xF r7 = new X.0xF
            r7.<init>()
            java.lang.Long r0 = r2.A0A
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "sender_id"
            if (r1 == 0) goto L_0x006e
            X.0xF.A00(r7, r1, r0)
        L_0x006e:
            java.lang.String r0 = "extra_data"
            r5.A05(r7, r0)
            int r7 = r14.intValue()
            r1 = 0
            r0 = 2
            if (r7 == r1) goto L_0x007e
            if (r7 != r6) goto L_0x0087
            r0 = 4
        L_0x007e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "render_target"
            r5.A08(r1, r0)
        L_0x0087:
            X.MeF r6 = r3.A02
            java.lang.Boolean r1 = r6.A01
            java.lang.String r0 = "is_vm_active"
            if (r1 == 0) goto L_0x0092
            r5.A09(r0, r1)
        L_0x0092:
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "message_id"
            if (r1 == 0) goto L_0x009b
            r5.A0C(r0, r1)
        L_0x009b:
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "thread_id"
            if (r1 == 0) goto L_0x00a4
            r5.A0C(r0, r1)
        L_0x00a4:
            java.util.List r1 = r2.A0N
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ce
            X.0xE r7 = new X.0xE
            r7.<init>()
            java.util.Iterator r6 = r1.iterator()
        L_0x00b7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r6.next()
            X.Nmi r0 = (X.C69500Nmi) r0
            long r0 = r0.A00
            r7.A02(r0)
            goto L_0x00b7
        L_0x00c9:
            java.lang.String r0 = "feature_tags"
            r5.A06(r7, r0)
        L_0x00ce:
            r6 = r19
            X.0sP r0 = r6.A00
            r1 = r20
            java.lang.Object r0 = r0.invoke(r1)
            X.0iu r0 = (X.C60640iu) r0
            r0.EFq(r5)
            X.0sP r5 = r6.A02
            java.lang.Object r0 = r5.invoke(r1)
            X.MYV r0 = (X.MYV) r0
            boolean r12 = r0.A0B(r2)
            java.lang.Long r0 = r2.A09
            java.lang.String r10 = X.DbX.A0t(r0)
            X.MZZ.A01(r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r5.invoke(r1)
            X.MYV r0 = (X.MYV) r0
            r0.A08(r2, r15)
            if (r4 == 0) goto L_0x010a
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            A01(r1, r6, r3, r15, r0)
            r6.A02(r1, r3, r15)
            return
        L_0x010a:
            r0 = 3
            A00(r1, r6, r3, r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71088Obj.A05(com.instagram.common.session.UserSession, X.MeH, java.lang.String, int):void");
    }

    public static final void A00(UserSession userSession, C71088Obj obj, C66880MeH meH, String str, int i) {
        C66879MeF meF = meH.A02;
        AnonymousClass6BJ r0 = meH.A01;
        ((C304016Bt) obj.A04.invoke(userSession)).A00(r0.A0F, meF.A04, r0.A0G, r0.A06.A01, str, i);
    }

    private final void A02(UserSession userSession, C66880MeH meH, String str) {
        C66879MeF meF = meH.A02;
        String str2 = meF.A05;
        String str3 = meF.A04;
        0qQ.A0K(String.valueOf(meH.A01.A03), userSession.A06);
        ((AnonymousClass65S) this.A03.invoke(userSession)).A06((String) null, str2, str, str3, false, true);
    }
}
