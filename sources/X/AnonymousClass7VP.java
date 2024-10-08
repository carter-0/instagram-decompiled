package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7VP  reason: invalid class name */
public final class AnonymousClass7VP {
    public 2cX A00;
    public final AnonymousClass4DH A01;
    public final C227622jd A02 = new C227622jd();
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass7TD A05;
    public final AnonymousClass7SE A06;
    public final C254923tH A07;
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(AnonymousClass7VQ.A00);
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(AnonymousClass7VR.A00);
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C377109Ko(this, 25));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new C377109Ko(this, 26));
    public final C62320sa A0C;
    public final C62320sa A0D;
    public final C62320sa A0E;
    public final String A0F;

    public AnonymousClass7VP(AnonymousClass4DH r3, AnonymousClass0iw r4, UserSession userSession, AnonymousClass7TD r6, AnonymousClass7SE r7, C254923tH r8, String str, C62320sa r10, C62320sa r11, C62320sa r12) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r7, 6);
        0qQ.A0B(r6, 7);
        0qQ.A0B(r10, 8);
        0qQ.A0B(r11, 9);
        this.A01 = r3;
        this.A04 = userSession;
        this.A03 = r4;
        this.A0F = str;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A0D = r10;
        this.A0E = r11;
        this.A0C = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023b, code lost:
        if (r2.A01.getInt("direct_dm_mode_display_count", 0) < 3) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009d, code lost:
        if (r4.A0T() == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r1.CcG() == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.182.A06(X.0Tu.A05, r12.A04, 36317667929429425L) != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
        if (r1 == X.AnonymousClass05K.A0u) goto L_0x01fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r13) {
        /*
            r12 = this;
            java.lang.String r1 = r12.A0F
            java.lang.String r0 = "via_push_notification"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x001a
            com.instagram.common.session.UserSession r3 = r12.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317667929429425(0x8106ba000115b1, double:3.030777665857365E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r0 != r13) goto L_0x0261
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.0sa r4 = r12.A0D
            java.lang.Object r0 = r4.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.9Gx r1 = X.C376179Gx.PSEUDO_UPDATE_QP_TRIGGER_CONTEXT
            boolean r0 = r0.AH1(r1)
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r0 = r4.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r11 = r0.C6l()
            com.instagram.common.session.UserSession r3 = r12.A04
            X.0Tu r5 = X.0Tu.A05
            r0 = 36314189005851109(0x810390000009e5, double:3.028577580577937E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            r10 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00bd
            java.util.List r1 = r11.BRZ()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x029d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x029d
        L_0x005b:
            r0 = 1
        L_0x005c:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3586(0xe02, float:5.025E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.put(r0, r1)
            X.3tH r5 = r12.A07
            X.4DH r0 = r12.A01
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x029a
            java.lang.Object r0 = r4.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            com.instagram.model.direct.DirectShareTarget r4 = r0.C6Z(r1)
        L_0x0081:
            X.0sa r0 = r12.A0E
            java.lang.Object r1 = r0.invoke()
            X.2Es r1 = (X.AnonymousClass2Es) r1
            com.instagram.quickpromotion.model.FilterType r0 = com.instagram.quickpromotion.model.FilterType.INSTAGRAM_DIRECT_THREAD_ELIGIBLE_FOR_ARMADILLO_UPSELL
            java.lang.String r9 = r0.toString()
            X.3tH r0 = X.C254923tH.ACT
            r7 = 1
            r6 = 0
            if (r5 != r0) goto L_0x0096
            r6 = 1
        L_0x0096:
            if (r4 == 0) goto L_0x009f
            boolean r0 = r4.A0T()
            r5 = 1
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            boolean r4 = r11.CZ0()
            if (r1 == 0) goto L_0x00ad
            boolean r1 = r1.CcG()
            r0 = 1
            if (r1 != 0) goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r6 != 0) goto L_0x0297
            if (r5 != 0) goto L_0x0297
            if (r4 != 0) goto L_0x0297
            if (r0 != 0) goto L_0x0297
        L_0x00b6:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r2.put(r9, r0)
        L_0x00bd:
            X.7SD r0 = r11.C6Q()
            int r0 = r0.A08
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 5333(0x14d5, float:7.473E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.put(r0, r1)
            X.3sy r0 = r11.B8S()
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectThreadKey
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1167(0x48f, float:1.635E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.put(r0, r1)
            X.0sa r4 = r12.A0E
            java.lang.Object r0 = r4.invoke()
            X.2Es r0 = (X.AnonymousClass2Es) r0
            if (r0 == 0) goto L_0x0287
            boolean r0 = r0.Axj()
            if (r0 != r8) goto L_0x0287
        L_0x00f3:
            r10 = 1
        L_0x00f4:
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r0 = 1168(0x490, float:1.637E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.put(r0, r1)
            java.lang.Object r7 = r4.invoke()
            X.2Ep r7 = (X.AnonymousClass2Ep) r7
            r5 = 3
            com.google.common.collect.ImmutableMap$Builder r4 = new com.google.common.collect.ImmutableMap$Builder
            r4.<init>()
            r4.putAll(r2)
            X.7SD r0 = r11.C6Q()
            X.3t3 r6 = r0.A0P
            boolean r2 = r0.A1A
            java.util.List r9 = r11.BRZ()
            int r0 = r9.size()
            r1 = 0
            if (r0 != r8) goto L_0x0135
            boolean r0 = r11.CUO()
            if (r0 != 0) goto L_0x0135
            java.lang.Object r0 = X.00k.A0J(r9)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = r0.getId()
        L_0x0135:
            java.lang.String r0 = "target_user_id"
            if (r1 == 0) goto L_0x013c
            r4.put(r0, r1)
        L_0x013c:
            java.util.List r9 = r11.BRZ()
            int r0 = r9.size()
            r1 = 0
            if (r0 != r8) goto L_0x0163
            boolean r0 = r11.CUO()
            if (r0 != 0) goto L_0x0163
            java.lang.Object r8 = X.00k.A0J(r9)
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            if (r8 == 0) goto L_0x0163
            java.lang.String r1 = r8.getFullName()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0163
            java.lang.String r1 = r8.getUsername()
        L_0x0163:
            java.lang.String r0 = "target_user_primary_name"
            if (r1 == 0) goto L_0x016a
            r4.put(r0, r1)
        L_0x016a:
            java.util.List r1 = r11.C6O()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x027f
            r1 = 0
        L_0x0175:
            r0 = 5319(0x14c7, float:7.454E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x0180
            r4.put(r0, r1)
        L_0x0180:
            java.lang.String r1 = r11.C6f()
            r0 = 4086(0xff6, float:5.726E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x018f
            r4.put(r0, r1)
        L_0x018f:
            if (r6 == 0) goto L_0x01a2
            X.3t0 r0 = X.C300965yF.A01(r6)
            java.lang.String r1 = r0.A00
            r0 = 401(0x191, float:5.62E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            if (r1 == 0) goto L_0x01a2
            r4.put(r0, r1)
        L_0x01a2:
            com.instagram.quickpromotion.model.FilterType r0 = com.instagram.quickpromotion.model.FilterType.INSTAGRAM_DIRECT_THREAD_VIEWER_IS_PARTICIPANT
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            if (r0 == 0) goto L_0x01b1
            r4.put(r1, r0)
        L_0x01b1:
            com.instagram.quickpromotion.model.FilterType r0 = com.instagram.quickpromotion.model.FilterType.INSTAGRAM_DIRECT_THREAD_IS_GROUP
            java.lang.String r1 = r0.toString()
            boolean r0 = r11.CUO()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x01c4
            r4.put(r1, r0)
        L_0x01c4:
            com.instagram.quickpromotion.model.FilterType r0 = com.instagram.quickpromotion.model.FilterType.INSTAGRAM_DIRECT_THREAD_MEMBERS_ARMADILLO_GROUP_ELIGIBLE
            java.lang.String r8 = r0.toString()
            java.util.List r1 = r11.BRZ()
            boolean r0 = r1 instanceof java.util.Collection
            r6 = 0
            if (r0 == 0) goto L_0x0266
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0266
        L_0x01d9:
            r6 = 1
        L_0x01da:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            if (r0 == 0) goto L_0x01e3
            r4.put(r8, r0)
        L_0x01e3:
            com.instagram.quickpromotion.model.FilterType r0 = com.instagram.quickpromotion.model.FilterType.INSTAGRAM_DIRECT_THREAD_ELIGIBLE_FOR_ARMADILLO_BIZ_TOOLS_UPSELL
            java.lang.String r6 = r0.toString()
            r2 = 1
            if (r7 == 0) goto L_0x0264
            int r0 = r7.BHS()
            if (r0 != 0) goto L_0x0264
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r0 = r7.Bwx()
            if (r0 == 0) goto L_0x0262
            java.lang.Integer r1 = r0.A03
        L_0x01fa:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x0264
        L_0x01fe:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            if (r0 == 0) goto L_0x0207
            r4.put(r6, r0)
        L_0x0207:
            com.instagram.quickpromotion.model.FilterType r0 = com.instagram.quickpromotion.model.FilterType.INSTAGRAM_DIRECT_THREAD_ELIGIBLE_FOR_DM_UPSELL
            java.lang.String r6 = r0.toString()
            X.1Av r2 = X.1Au.A00(r3)
            X.3t2 r0 = r11.C6c()
            X.0qQ.A07(r0)
            boolean r1 = r0 instanceof X.C254773t1
            X.7SD r0 = r11.C6Q()
            X.0qQ.A07(r0)
            boolean r0 = X.C308556Us.A0C(r3, r0, r1)
            if (r0 == 0) goto L_0x023d
            X.7SD r0 = r11.C6Q()
            boolean r0 = X.C308556Us.A08(r3, r0)
            if (r0 != 0) goto L_0x023d
            X.0xa r2 = r2.A01
            java.lang.String r1 = "direct_dm_mode_display_count"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            r0 = 1
            if (r1 >= r5) goto L_0x023e
        L_0x023d:
            r0 = 0
        L_0x023e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x0247
            r4.put(r6, r0)
        L_0x0247:
            com.google.common.collect.ImmutableMap r1 = r4.build()
            X.2cX r0 = new X.2cX
            r0.<init>(r1)
            r12.A00 = r0
        L_0x0252:
            X.2cX r1 = r12.A00
            if (r1 == 0) goto L_0x02ba
            X.0eM r0 = r12.A0A
            java.lang.Object r0 = r0.getValue()
            X.2bu r0 = (X.2bu) r0
            r0.A02(r1)
        L_0x0261:
            return
        L_0x0262:
            r1 = 0
            goto L_0x01fa
        L_0x0264:
            r2 = 0
            goto L_0x01fe
        L_0x0266:
            java.util.Iterator r2 = r1.iterator()
        L_0x026a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r0 = r2.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            int r1 = r0.A00()
            r0 = 4
            if (r1 == r0) goto L_0x026a
            goto L_0x01da
        L_0x027f:
            java.lang.String r0 = ","
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            goto L_0x0175
        L_0x0287:
            java.lang.Object r0 = r4.invoke()
            X.2Er r0 = (X.2Er) r0
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.CVb()
            if (r0 != r8) goto L_0x00f4
            goto L_0x00f3
        L_0x0297:
            r7 = 0
            goto L_0x00b6
        L_0x029a:
            r4 = 0
            goto L_0x0081
        L_0x029d:
            java.util.Iterator r1 = r1.iterator()
        L_0x02a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A1c()
            if (r0 != 0) goto L_0x02a1
            r0 = 0
            goto L_0x005c
        L_0x02b6:
            X.C69865NtT.A00(r1)
            goto L_0x0252
        L_0x02ba:
            X.0wj r2 = X.0wj.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "DirectThreadFragment megaphoneQPTriggerContext is null, not triggering QP."
            r2.AEf(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VP.A00(boolean):void");
    }
}
