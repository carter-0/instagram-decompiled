package X;

public final class I0X {
    public static final I0X A00 = new Object();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e2, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f3, code lost:
        return X.AnonymousClass7TE.A16(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        if (r2 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e0, code lost:
        return r6;
     */
    @kotlin.Deprecated(message = "To be replaced by SecondaryAttributionUseCase as part of the MVVM migration")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(android.content.Context r10, com.instagram.common.session.UserSession r11, X.GK4 r12) {
        /*
            r9 = this;
            r3 = 0
            r4 = 1
            r5 = 2
            X.1Xj r7 = r12.A00
            X.GJ2 r0 = r12.A02
            int r0 = r0.ordinal()
            java.lang.String r8 = "Required value was null."
            java.lang.String r6 = ""
            switch(r0) {
                case 0: goto L_0x0182;
                case 1: goto L_0x0153;
                case 2: goto L_0x0017;
                case 3: goto L_0x0114;
                case 4: goto L_0x0109;
                case 5: goto L_0x002a;
                case 6: goto L_0x002a;
                case 7: goto L_0x002a;
                case 8: goto L_0x00d4;
                case 9: goto L_0x0104;
                case 10: goto L_0x00c1;
                case 11: goto L_0x00a5;
                case 12: goto L_0x003c;
                case 13: goto L_0x00ff;
                case 14: goto L_0x00fa;
                case 15: goto L_0x0091;
                case 16: goto L_0x00f5;
                case 17: goto L_0x01e3;
                case 18: goto L_0x002a;
                case 19: goto L_0x00f0;
                case 20: goto L_0x00eb;
                case 21: goto L_0x002a;
                case 22: goto L_0x002a;
                case 23: goto L_0x00e6;
                case 24: goto L_0x00e1;
                default: goto L_0x0012;
            }
        L_0x0012:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0017:
            X.1Xy r0 = r7.A0C
            com.instagram.model.venue.LocationDictIntf r0 = r0.BNh()
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = r0.getName()
            goto L_0x0167
        L_0x0025:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x002a:
            X.JSO r0 = X.C51966G9m.A0l(r7)
            if (r0 == 0) goto L_0x0037
            java.lang.String r6 = r0.getAttributionTitle()
            if (r6 == 0) goto L_0x0037
            return r6
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x003c:
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            r0.A03()
            X.1s2 r0 = r7.A1M()
            if (r0 == 0) goto L_0x0071
            X.3cs r0 = r0.B21()
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = "appreciation"
            X.3cq r0 = r0.BcP()
            if (r0 == 0) goto L_0x0071
            com.instagram.api.schemas.OnboardingEntryActionType r0 = r0.AYX()
            if (r0 == 0) goto L_0x0071
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x0076
            if (r1 == r5) goto L_0x007a
            if (r1 == r4) goto L_0x007a
            if (r1 != r3) goto L_0x008c
            X.0kg r1 = X.0kg.A03
            java.lang.String r0 = "UNRECOGNIZED action type doesn't have pill title"
            X.0wb.A01(r1, r2, r0)
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0076:
            r0 = 2131963080(0x7f132cc8, float:1.9562903E38)
            goto L_0x007d
        L_0x007a:
            r0 = 2131963079(0x7f132cc7, float:1.9562901E38)
        L_0x007d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0071
            int r0 = r0.intValue()
            java.lang.String r6 = X.C51967G9n.A0p(r10, r0)
            return r6
        L_0x008c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0091:
            X.1Xy r0 = r7.A0C
            java.lang.String r1 = r0.BVF()
            if (r1 == 0) goto L_0x0169
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0169
            java.lang.String r2 = X.GJK.A00(r1)
            goto L_0x0167
        L_0x00a5:
            X.1Xy r0 = r7.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x0169
            java.util.List r0 = r0.AZX()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = X.00k.A0J(r0)
            X.50j r0 = (X.C2801550j) r0
            if (r0 == 0) goto L_0x0169
            java.lang.String r2 = r0.getTitle()
            goto L_0x0167
        L_0x00c1:
            com.instagram.user.model.UpcomingEvent r1 = r7.A27(r11)
            if (r1 == 0) goto L_0x00e0
            X.0nE r0 = X.C61410nE.A00
            X.Vkq r1 = X.C17116VIm.A00(r11, r0, r1)
            X.Uy1 r0 = X.Uy1.A0D
            java.lang.String r2 = r1.A00(r10, r0)
            goto L_0x00de
        L_0x00d4:
            X.DUF r0 = X.C51965G9l.A0j(r7)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r2 = r0.getAttributionAppName()
        L_0x00de:
            if (r2 != 0) goto L_0x01e2
        L_0x00e0:
            return r6
        L_0x00e1:
            r1 = 2131956136(0x7f1311a8, float:1.954882E38)
            goto L_0x01ef
        L_0x00e6:
            r1 = 2131969496(0x7f1345d8, float:1.9575916E38)
            goto L_0x01ef
        L_0x00eb:
            r1 = 2131956126(0x7f13119e, float:1.9548799E38)
            goto L_0x01ef
        L_0x00f0:
            r1 = 2131956109(0x7f13118d, float:1.9548764E38)
            goto L_0x01ef
        L_0x00f5:
            r1 = 2131964555(0x7f13328b, float:1.9565895E38)
            goto L_0x01ef
        L_0x00fa:
            r1 = 2131957290(0x7f13162a, float:1.955116E38)
            goto L_0x01ef
        L_0x00ff:
            r1 = 2131975272(0x7f135c68, float:1.9587632E38)
            goto L_0x01ef
        L_0x0104:
            r1 = 2131972365(0x7f13510d, float:1.9581736E38)
            goto L_0x01ef
        L_0x0109:
            X.I0Y r0 = X.I0Y.A00
            X.0eP r0 = r0.A00(r10, r11, r7)
            java.lang.Object r6 = r0.A01
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0114:
            boolean r1 = r7.A59()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0138
            if (r1 == 0) goto L_0x0138
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319433160924568(0x81085500001d98, double:3.03189400536291E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0138
            r0 = 2131953200(0x7f130630, float:1.9542864E38)
            java.lang.String r6 = r10.getString(r0)
        L_0x0134:
            X.0qQ.A0A(r6)
            return r6
        L_0x0138:
            r1 = 2131975063(0x7f135b97, float:1.9587208E38)
            X.4gw r0 = r7.A1P()
            if (r0 == 0) goto L_0x014e
            X.4yi r0 = r0.Ad4()
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = r0.getOwnerUsername()
            if (r0 == 0) goto L_0x014e
            r6 = r0
        L_0x014e:
            java.lang.String r6 = X.DbW.A0h(r10, r6, r1)
            goto L_0x0134
        L_0x0153:
            java.util.List r5 = X.C243233Xy.A01(r7)
            if (r5 == 0) goto L_0x0169
            int r0 = r5.size()
            if (r0 != r4) goto L_0x016a
            java.lang.Object r0 = r5.get(r3)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r2 = r0.A0J
        L_0x0167:
            if (r2 != 0) goto L_0x01e2
        L_0x0169:
            return r6
        L_0x016a:
            android.content.res.Resources r3 = r10.getResources()
            r2 = 2131820863(0x7f11013f, float:1.9274453E38)
            int r1 = r5.size()
            int r0 = r5.size()
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r2 = r3.getQuantityString(r2, r1, r0)
            goto L_0x0167
        L_0x0182:
            java.util.ArrayList r3 = X.C51973G9u.A0l(r7)
            java.util.ArrayList r5 = r7.A3I()
            if (r5 == 0) goto L_0x01a5
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01a5
            X.LOQ r2 = X.LOQ.A00
            java.lang.String r1 = X.C51973G9u.A0j(r11, r7)
            boolean r0 = r7.A5G()
            boolean r0 = r2.A01(r11, r1, r0)
            if (r0 == 0) goto L_0x01a5
            r3.addAll(r5)
        L_0x01a5:
            boolean r0 = r3.isEmpty()
            r2 = r6
            if (r0 != 0) goto L_0x01e2
            java.lang.Object r1 = X.00k.A0J(r3)
            com.instagram.tagging.model.Tag r1 = (com.instagram.tagging.model.Tag) r1
            if (r1 == 0) goto L_0x01be
            boolean r0 = r1 instanceof com.instagram.model.people.PeopleTag
            if (r0 == 0) goto L_0x01d7
            com.instagram.model.people.PeopleTag r1 = (com.instagram.model.people.PeopleTag) r1
            com.instagram.model.people.PeopleTag$UserInfo r0 = r1.A00
            java.lang.String r2 = r0.A04
        L_0x01be:
            int r0 = r3.size()
            if (r0 == r4) goto L_0x01d3
            r1 = 2131969342(0x7f13453e, float:1.9575604E38)
            int r0 = r3.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = X.DbW.A0h(r10, r0, r1)
        L_0x01d3:
            X.0qQ.A0A(r2)
            return r2
        L_0x01d7:
            boolean r0 = r1 instanceof com.instagram.model.fbusertag.FBUserTag
            if (r0 == 0) goto L_0x01be
            com.instagram.model.fbusertag.FBUserTag r1 = (com.instagram.model.fbusertag.FBUserTag) r1
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r1.A02
            java.lang.String r2 = r0.A01
            goto L_0x01be
        L_0x01e2:
            return r2
        L_0x01e3:
            boolean r0 = X.JUL.A01(r11)
            r1 = 2131963013(0x7f132c85, float:1.9562767E38)
            if (r0 == 0) goto L_0x01ef
            r1 = 2131963014(0x7f132c86, float:1.956277E38)
        L_0x01ef:
            java.lang.String r6 = X.AnonymousClass7TE.A16(r10, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I0X.A00(android.content.Context, com.instagram.common.session.UserSession, X.GK4):java.lang.String");
    }
}
