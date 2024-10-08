package com.instagram.remindme.common.data;

import X.1vm;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class MediaReminderApi {
    public final 1vn A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.remindme.common.data.MediaReminderApi r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r5 = 11
            r6 = r17
            boolean r0 = X.MEA.A03(r5, r6)
            r3 = r14
            if (r0 == 0) goto L_0x0097
            r2 = r6
            X.MEA r2 = (X.MEA) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0097
            int r4 = r4 - r1
            r2.A00 = r4
        L_0x0019:
            java.lang.Object r4 = r2.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r12) goto L_0x00a8
            X.0eS.A00(r4)
        L_0x0027:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a0
            X.3lr r3 = X.C41846B3n.A0R(r4)
            if (r3 == 0) goto L_0x00a5
            java.lang.Class<X.C3j> r2 = X.C43635C3j.class
            java.lang.String r1 = "xdt_remind_me_set_reminder(ad_id:$ad_id,media_id:$media_id)"
            r0 = -64885548(0xfffffffffc21ecd4, float:-3.363053E36)
            X.3lr r1 = r3.A05(r2, r1, r0)
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = "is_reminder_set"
            boolean r2 = r1.getRequiredBooleanField(r12, r0)
            java.lang.String r0 = "expected_send_time"
            int r1 = r1.A00(r0)
            X.DHW r0 = new X.DHW
            r0.<init>(r2, r1)
            return r0
        L_0x0056:
            X.0eS.A00(r4)
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "media_id"
            boolean r4 = X.C41848B3p.A1Z(r6, r0, r15)
            java.lang.String r0 = "ad_id"
            r7 = r16
            r6.A04(r0, r7)
            X.1vR r7 = X.C41845B3m.A06(r4)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.C3k> r11 = X.C43636C3k.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "RemindMeSetReminderMutation"
            r14 = 0
            java.lang.String r16 = "xdt_remind_me_set_reminder"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r3.A00
            r2.A00 = r12
            java.lang.Object r4 = r0.A04(r6, r2)
            if (r4 != r1) goto L_0x0027
            return r1
        L_0x0097:
            r0 = 42
            X.MEA r2 = new X.MEA
            r2.<init>(r14, r6, r5, r0)
            goto L_0x0019
        L_0x00a0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a5:
            X.DHX r0 = X.DHX.A00
            return r0
        L_0x00a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.remindme.common.data.MediaReminderApi.A00(com.instagram.remindme.common.data.MediaReminderApi, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.remindme.common.data.MediaReminderApi r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17) {
        /*
            r5 = 12
            r6 = r17
            boolean r0 = X.MEA.A03(r5, r6)
            r3 = r14
            if (r0 == 0) goto L_0x0097
            r2 = r6
            X.MEA r2 = (X.MEA) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0097
            int r4 = r4 - r1
            r2.A00 = r4
        L_0x0019:
            java.lang.Object r4 = r2.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r12) goto L_0x00a8
            X.0eS.A00(r4)
        L_0x0027:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a0
            X.3lr r3 = X.C41846B3n.A0R(r4)
            if (r3 == 0) goto L_0x00a5
            java.lang.Class<X.C3l> r2 = X.C43637C3l.class
            java.lang.String r1 = "xdt_remind_me_unset_reminder(ad_id:$ad_id,media_id:$media_id)"
            r0 = -67325602(0xfffffffffbfcb15e, float:-2.6241125E36)
            X.3lr r1 = r3.A05(r2, r1, r0)
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = "is_reminder_set"
            boolean r2 = r1.getRequiredBooleanField(r12, r0)
            java.lang.String r0 = "expected_send_time"
            int r1 = r1.A00(r0)
            X.DHW r0 = new X.DHW
            r0.<init>(r2, r1)
            return r0
        L_0x0056:
            X.0eS.A00(r4)
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "media_id"
            boolean r4 = X.C41848B3p.A1Z(r6, r0, r15)
            java.lang.String r0 = "ad_id"
            r7 = r16
            r6.A04(r0, r7)
            X.1vR r7 = X.C41845B3m.A06(r4)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.C3m> r11 = X.C43638C3m.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "RemindMeUnsetReminderMutation"
            r14 = 0
            java.lang.String r16 = "xdt_remind_me_unset_reminder"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r3.A00
            r2.A00 = r12
            java.lang.Object r4 = r0.A04(r6, r2)
            if (r4 != r1) goto L_0x0027
            return r1
        L_0x0097:
            r0 = 42
            X.MEA r2 = new X.MEA
            r2.<init>(r14, r6, r5, r0)
            goto L_0x0019
        L_0x00a0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a5:
            X.DHX r0 = X.DHX.A00
            return r0
        L_0x00a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.remindme.common.data.MediaReminderApi.A01(com.instagram.remindme.common.data.MediaReminderApi, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public MediaReminderApi(UserSession userSession) {
        this.A00 = 1vm.A01(userSession);
    }
}
