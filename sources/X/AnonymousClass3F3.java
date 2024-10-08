package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.3F3  reason: invalid class name */
public final class AnonymousClass3F3 implements 2MI {
    public static final AnonymousClass6BJ A00(OU0 ou0) {
        Long l;
        OU0 ou02 = ou0;
        String str = ou02.A0E;
        String str2 = ou02.A0I;
        if (str2 != null) {
            l = 00y.A0n(10, str2);
        } else {
            l = null;
        }
        return new AnonymousClass6BJ(ou02.A03, AnonymousClass05K.A01, (Long) null, (Long) null, l, (Long) null, (String) null, (String) null, (String) null, (String) null, str, ou02.A0H, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, -1, !TextUtils.isEmpty(ou02.A0F), false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (r10 == com.instagram.common.notifications.push.intf.PushChannelType.A0B) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3O(X.OU0 r15, java.util.List r16) {
        /*
            r14 = this;
            r2 = 1
            X.MYV r1 = X.MYV.A01
            X.6BJ r0 = A00(r15)
            r3 = r16
            r1.A09(r0, r3)
            X.N3K r4 = r15.A07
            if (r4 == 0) goto L_0x00eb
            java.lang.ref.WeakReference r0 = r4.A0A
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r5 = r0.get()
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            if (r5 == 0) goto L_0x00eb
            java.lang.String r3 = r4.A04
            java.lang.String r13 = r4.A07
            java.lang.String r0 = r4.A09
            java.util.List r6 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r6)
            java.lang.String r1 = r4.A08
            boolean r9 = r4.A0C
            boolean r8 = r4.A0B
            com.instagram.common.notifications.push.intf.PushChannelType r10 = r4.A00
            java.lang.Long r12 = r4.A01
            java.lang.String r11 = r4.A05
            java.lang.String r7 = r4.A06
            r4 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.String r2 = "reason"
            r0 = 2
            X.0qQ.A0B(r13, r0)
            r0 = 7
            X.0qQ.A0B(r10, r0)
            X.ORO.A01(r5, r3, r13, r1, r6)
            r0 = 988(0x3dc, float:1.384E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0xI r3 = X.MYX.A02(r0)
            r3.A0C(r2, r13)
            r0 = 1886(0x75e, float:2.643E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0D(r0, r6)
            java.lang.String r0 = "target_id"
            if (r1 == 0) goto L_0x0065
            r3.A0C(r0, r1)
        L_0x0065:
            java.lang.String r1 = r5.A06
            r0 = 361(0x169, float:5.06E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x0072
            r3.A0C(r0, r1)
        L_0x0072:
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.MEM
            if (r10 == r0) goto L_0x007b
            com.instagram.common.notifications.push.intf.PushChannelType r1 = com.instagram.common.notifications.push.intf.PushChannelType.MSYS
            r0 = 0
            if (r10 != r1) goto L_0x007c
        L_0x007b:
            r0 = 1
        L_0x007c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_e2ee"
            r3.A09(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.A09(r0, r1)
            java.lang.String r2 = "thread_id"
            if (r12 == 0) goto L_0x0099
            r3.A0B(r2, r12)
        L_0x0099:
            java.lang.String r0 = "pi"
            r3.A0C(r0, r11)
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1760(0x6e0, float:2.466E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A08(r1, r0)
            java.lang.String r1 = r10.name()
            r0 = 1731(0x6c3, float:2.426E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0C(r0, r1)
            X.0xE r1 = X.ORO.A00(r9, r8)
            java.lang.String r0 = "feature_tags"
            r3.A06(r1, r0)
            boolean r0 = X.C282435Db.A02(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 1494(0x5d6, float:2.094E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A09(r0, r1)
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r6.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r3.A0C(r2, r0)
        L_0x00e4:
            X.0xN r0 = X.C60510iO.A00(r5)
            r0.EFq(r3)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3F3.D3O(X.OU0, java.util.List):void");
    }

    public final void Dbg(OU0 ou0) {
        MYV.A01.A0B(A00(ou0));
        String str = ou0.A0I;
        if (str == null) {
            str = null;
        }
        MZZ.A01(ou0.A03, str, (String) null, "InAppNotificationLoggingDelegateImpl", true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a6, code lost:
        if (r4 == com.instagram.common.notifications.push.intf.PushChannelType.A0B) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0O(X.OU0 r25, java.util.List r26) {
        /*
            r24 = this;
            r5 = 1
            X.MYV r1 = X.MYV.A01
            r3 = r25
            X.6BJ r0 = A00(r3)
            r2 = r26
            r1.A0A(r0, r2)
            X.N3K r1 = r3.A07
            if (r1 == 0) goto L_0x0158
            java.lang.ref.WeakReference r0 = r1.A0A
            if (r0 == 0) goto L_0x0158
            java.lang.Object r7 = r0.get()
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            if (r7 == 0) goto L_0x0158
            java.lang.String r10 = r1.A04
            java.lang.String r6 = r1.A07
            java.lang.String r8 = r1.A09
            java.lang.String r14 = r1.A08
            boolean r13 = r1.A0C
            boolean r9 = r1.A0B
            com.instagram.common.notifications.push.intf.PushChannelType r4 = r1.A00
            java.lang.Long r12 = r1.A01
            java.lang.String r11 = r1.A05
            java.lang.String r3 = r1.A02
            java.lang.String r2 = r1.A06
            java.lang.String r1 = r1.A03
            X.0qQ.A0B(r10, r5)
            r0 = 2
            X.0qQ.A0B(r6, r0)
            r0 = 3
            X.0qQ.A0B(r8, r0)
            r0 = 7
            X.0qQ.A0B(r4, r0)
            r0 = 9
            X.0qQ.A0B(r11, r0)
            X.0kM r0 = new X.0kM
            r0.<init>(r7)
            r0.A01 = r10
            X.0wc r15 = r0.A00()
            java.lang.String r10 = "direct_inapp_notification_impression"
            X.0kJ r0 = r15.A00
            X.0Aj r10 = r15.A00(r0, r10)
            java.lang.String r0 = "reason"
            r10.AAJ(r0, r6)
            java.lang.String r6 = "thread_id"
            r10.AAJ(r6, r8)
            if (r14 == 0) goto L_0x006e
            java.lang.String r0 = "target_id"
            r10.AAJ(r0, r14)
        L_0x006e:
            r10.Cgf()
            java.lang.String r0 = "notification_displayed"
            X.0xI r10 = X.MYX.A02(r0)
            r10.A0C(r6, r8)
            java.lang.String r6 = r4.name()
            r0 = 1731(0x6c3, float:2.426E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A0C(r0, r6)
            java.lang.String r6 = r7.A06
            r0 = 361(0x169, float:5.06E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A0C(r0, r6)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r10.A09(r0, r15)
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.MEM
            if (r4 == r0) goto L_0x00a8
            com.instagram.common.notifications.push.intf.PushChannelType r14 = com.instagram.common.notifications.push.intf.PushChannelType.MSYS
            r6 = 0
            if (r4 != r14) goto L_0x00a9
        L_0x00a8:
            r6 = 1
        L_0x00a9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            java.lang.String r6 = "is_e2ee"
            r10.A09(r6, r14)
            r6 = 340(0x154, float:4.76E-43)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            if (r12 == 0) goto L_0x00bd
            r10.A0B(r6, r12)
        L_0x00bd:
            java.lang.String r6 = "pi"
            r10.A0C(r6, r11)
            r6 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r6 = 1760(0x6e0, float:2.466E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r6)
            r10.A08(r11, r12)
            X.0xE r11 = X.ORO.A00(r13, r9)
            java.lang.String r6 = "feature_tags"
            r10.A06(r11, r6)
            boolean r6 = X.C282435Db.A02(r2)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            r6 = 1494(0x5d6, float:2.094E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r6)
            r10.A09(r11, r14)
            X.0xN r6 = X.C60510iO.A00(r7)
            r6.EFq(r10)
            if (r4 == r0) goto L_0x00f7
            com.instagram.common.notifications.push.intf.PushChannelType r6 = com.instagram.common.notifications.push.intf.PushChannelType.MSYS
            if (r4 != r6) goto L_0x013f
        L_0x00f7:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            r6 = 1533(0x5fd, float:2.148E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r10.put(r6, r13)
            r6 = 2132(0x854, float:2.988E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r10.put(r12, r6)
            boolean r6 = X.C282435Db.A02(r2)
            r10.put(r11, r6)
            X.6EB r12 = new X.6EB
            r12.<init>(r7)
            java.lang.String r20 = r10.toString()
            r6 = 0
            if (r4 != r0) goto L_0x0122
            r6 = 1
        L_0x0122:
            r16 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)
            r6 = 2097(0x831, float:2.939E-42)
            java.lang.String r17 = X.AnonymousClass000.A00(r6)
            r18 = r16
            r19 = r16
            r21 = r16
            r22 = r3
            r23 = r8
            X.AnonymousClass6EB.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x013f:
            if (r4 == r0) goto L_0x0145
            com.instagram.common.notifications.push.intf.PushChannelType r6 = com.instagram.common.notifications.push.intf.PushChannelType.MSYS
            if (r4 != r6) goto L_0x0158
        L_0x0145:
            X.65S r6 = X.AnonymousClass6ED.A00(r7)
            r7 = 0
            r12 = 0
            if (r4 != r0) goto L_0x014e
            r12 = 1
        L_0x014e:
            X.C282435Db.A02(r2)
            r9 = r7
            r10 = r3
            r11 = r5
            r8 = r1
            r6.A06(r7, r8, r9, r10, r11, r12)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3F3.E0O(X.OU0, java.util.List):void");
    }

    public final void DpT(OU0 ou0, String str) {
        MYV.A01.A08(A00(ou0), "no foreground activity to render in-app notification");
    }
}
