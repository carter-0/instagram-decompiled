package X;

public final class OIw {
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x029f, code lost:
        r1 = new java.lang.Object[1];
        r0 = r7.A01;
        X.0qQ.A0C(r0, "null cannot be cast to non-null type com.instagram.direct.notifications.core.api.DirectNotification.MessageDirectNotificationTypeData.TextMessageTypeData");
        r2 = ((X.N8W) r0).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (X.N8Y.A00(1, r1) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(android.content.Context r9, X.AnonymousClass2Ep r10, X.C68161N3b r11, boolean r12) {
        /*
            r8 = this;
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0139
            int r1 = r10.BWe()
        L_0x0008:
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x0028
            X.Prd r1 = r11.A02
            boolean r0 = X.N8Y.A00(r3, r1)
            if (r0 != 0) goto L_0x001d
            boolean r1 = X.N8Y.A00(r4, r1)
            r0 = 2131959859(0x7f132033, float:1.955637E38)
            if (r1 == 0) goto L_0x0020
        L_0x001d:
            r0 = 2131959860(0x7f132034, float:1.9556372E38)
        L_0x0020:
            java.lang.String r0 = r9.getString(r0)
        L_0x0024:
            X.0qQ.A07(r0)
            return r0
        L_0x0028:
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0030
            r0 = 2131959893(0x7f132055, float:1.955644E38)
            goto L_0x0020
        L_0x0030:
            boolean r0 = r11.A00()
            if (r0 == 0) goto L_0x0052
            X.Prd r1 = r11.A02
            boolean r0 = X.N8Y.A00(r3, r1)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.N8Y.A00(r4, r1)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.N8Z.A00(r4, r1)
            if (r0 != 0) goto L_0x0062
            r0 = 2131959852(0x7f13202c, float:1.9556356E38)
            goto L_0x0020
        L_0x004e:
            r0 = 2131959851(0x7f13202b, float:1.9556354E38)
            goto L_0x0020
        L_0x0052:
            if (r12 != 0) goto L_0x0062
            r0 = r1 & 1
            if (r0 != r4) goto L_0x0062
            X.Prd r0 = r11.A02
            boolean r0 = r0 instanceof X.N8W
            if (r0 == 0) goto L_0x0062
            r0 = 2131959865(0x7f132039, float:1.9556382E38)
            goto L_0x0020
        L_0x0062:
            X.Prd r7 = r11.A02
            boolean r0 = r7 instanceof X.N8W
            if (r0 == 0) goto L_0x007d
            X.N8W r7 = (X.N8W) r7
            java.lang.Integer r0 = r7.A00
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x012a
            r0 = 3
            if (r1 == r0) goto L_0x0079
            java.lang.String r0 = r7.A01
            return r0
        L_0x0079:
            r0 = 2131959855(0x7f13202f, float:1.9556362E38)
            goto L_0x0020
        L_0x007d:
            boolean r0 = X.N8Z.A00(r3, r7)
            if (r0 == 0) goto L_0x00a1
            X.N8Z r7 = (X.N8Z) r7
            java.lang.Object r7 = r7.A01
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            if (r0 != r4) goto L_0x02c3
            java.lang.Object r0 = r7.get(r3)
            X.NjB r0 = (X.C69310NjB) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0141;
                case 1: goto L_0x013c;
                case 2: goto L_0x0146;
                case 3: goto L_0x014b;
                case 4: goto L_0x0150;
                case 5: goto L_0x0155;
                case 6: goto L_0x0347;
                default: goto L_0x009c;
            }
        L_0x009c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a1:
            boolean r0 = r7 instanceof X.N8X
            if (r0 == 0) goto L_0x00b9
            X.N8X r7 = (X.N8X) r7
            X.Njn r0 = r7.A03
            int r0 = r0.ordinal()
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.direct.notifications.core.api.DirectNotification.MessageDirectNotificationTypeData.TextMessageTypeData"
            r5 = 2
            r1 = 3
            switch(r0) {
                case 0: goto L_0x015a;
                case 1: goto L_0x01b9;
                case 2: goto L_0x01f1;
                case 3: goto L_0x0223;
                case 4: goto L_0x024e;
                case 5: goto L_0x0278;
                case 6: goto L_0x0294;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b9:
            boolean r0 = X.N8Z.A00(r4, r7)
            if (r0 == 0) goto L_0x00ff
            X.N8Z r7 = (X.N8Z) r7
            java.lang.Object r6 = r7.A01
            X.4k3 r6 = (X.C272074k3) r6
            int r5 = r6.ordinal()
            java.lang.String r2 = "Raven media type not supported: "
            r1 = 9
            r0 = 8
            if (r5 == r0) goto L_0x00e9
            if (r5 != r1) goto L_0x036e
            java.lang.Object r1 = r7.A02
            X.1iA r1 = (X.1iA) r1
            int r0 = r1.ordinal()
            if (r0 == r3) goto L_0x00e4
            if (r0 != r4) goto L_0x0361
            r0 = 2131959874(0x7f132042, float:1.95564E38)
            goto L_0x0020
        L_0x00e4:
            r0 = 2131959873(0x7f132041, float:1.9556399E38)
            goto L_0x0020
        L_0x00e9:
            java.lang.Object r1 = r7.A02
            X.1iA r1 = (X.1iA) r1
            int r0 = r1.ordinal()
            if (r0 == r3) goto L_0x00fa
            if (r0 != r4) goto L_0x037d
            r0 = 2131959876(0x7f132044, float:1.9556405E38)
            goto L_0x0020
        L_0x00fa:
            r0 = 2131959875(0x7f132043, float:1.9556403E38)
            goto L_0x0020
        L_0x00ff:
            boolean r0 = X.N8Y.A00(r3, r7)
            if (r0 != 0) goto L_0x0120
            boolean r0 = r7 instanceof X.PDI
            if (r0 == 0) goto L_0x010e
            r0 = 2131959856(0x7f132030, float:1.9556364E38)
            goto L_0x0020
        L_0x010e:
            boolean r0 = X.N8Y.A00(r4, r7)
            if (r0 != 0) goto L_0x0120
            r0 = 2
            boolean r0 = X.N8Y.A00(r0, r7)
            if (r0 == 0) goto L_0x038a
            r0 = 2131959850(0x7f13202a, float:1.9556352E38)
            goto L_0x0020
        L_0x0120:
            X.N8Y r7 = (X.N8Y) r7
            r2 = 2131959853(0x7f13202d, float:1.9556358E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r7.A01
            goto L_0x0131
        L_0x012a:
            r2 = 2131959861(0x7f132035, float:1.9556374E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r7.A01
        L_0x0131:
            r1[r3] = r0
            java.lang.String r0 = r9.getString(r2, r1)
            goto L_0x0024
        L_0x0139:
            r1 = 0
            goto L_0x0008
        L_0x013c:
            r0 = 2131959894(0x7f132056, float:1.9556441E38)
            goto L_0x034a
        L_0x0141:
            r0 = 2131959866(0x7f13203a, float:1.9556385E38)
            goto L_0x034a
        L_0x0146:
            r0 = 2131959872(0x7f132040, float:1.9556397E38)
            goto L_0x034a
        L_0x014b:
            r0 = 2131959877(0x7f132045, float:1.9556407E38)
            goto L_0x034a
        L_0x0150:
            r0 = 2131959854(0x7f13202e, float:1.955636E38)
            goto L_0x034a
        L_0x0155:
            r0 = 2131959885(0x7f13204d, float:1.9556423E38)
            goto L_0x034a
        L_0x015a:
            X.Niq r2 = r7.A02
            int r0 = r2.ordinal()
            if (r0 == r1) goto L_0x01b4
            if (r0 == r3) goto L_0x0197
            if (r0 == r5) goto L_0x017c
            if (r0 != r4) goto L_0x016d
            r0 = 2131959889(0x7f132051, float:1.9556431E38)
            goto L_0x034a
        L_0x016d:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Story message content action not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x017c:
            X.Prd r1 = r7.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.notifications.core.api.DirectNotification.MessageDirectNotificationTypeData.EmojiReactionMessageTypeData"
            X.0qQ.A0C(r1, r0)
            X.N8Y r1 = (X.N8Y) r1
            java.lang.String r2 = r1.A01
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0192
            r0 = 2131959890(0x7f132052, float:1.9556433E38)
            goto L_0x034a
        L_0x0192:
            r5 = 2131959891(0x7f132053, float:1.9556435E38)
            goto L_0x02be
        L_0x0197:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x01a0
            r0 = 2131959887(0x7f13204f, float:1.9556427E38)
            goto L_0x034a
        L_0x01a0:
            java.lang.String r2 = r7.A04
            if (r2 == 0) goto L_0x01af
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01af
            r5 = 2131959888(0x7f132050, float:1.955643E38)
            goto L_0x02be
        L_0x01af:
            r0 = 2131959886(0x7f13204e, float:1.9556425E38)
            goto L_0x034a
        L_0x01b4:
            r5 = 2131959892(0x7f132054, float:1.9556437E38)
            goto L_0x029f
        L_0x01b9:
            X.Niq r0 = r7.A02
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x01ea
            if (r0 == r3) goto L_0x01d6
            if (r0 == r5) goto L_0x01d1
            if (r0 != r4) goto L_0x01cc
            r0 = 2131959881(0x7f132049, float:1.9556415E38)
            goto L_0x034a
        L_0x01cc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01d1:
            r0 = 2131959880(0x7f132048, float:1.9556413E38)
            goto L_0x034a
        L_0x01d6:
            java.lang.String r2 = r7.A04
            if (r2 == 0) goto L_0x01e5
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01e5
            r5 = 2131959879(0x7f132047, float:1.955641E38)
            goto L_0x02be
        L_0x01e5:
            r0 = 2131959878(0x7f132046, float:1.9556409E38)
            goto L_0x034a
        L_0x01ea:
            java.lang.String r0 = "Reel reply is not a supported notification type."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x01f1:
            X.Niq r2 = r7.A02
            int r0 = r2.ordinal()
            if (r0 == r3) goto L_0x020f
            if (r0 != r4) goto L_0x0200
            r0 = 2131959869(0x7f13203d, float:1.955639E38)
            goto L_0x034a
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Post message content action not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x020f:
            java.lang.String r2 = r7.A04
            if (r2 == 0) goto L_0x021e
            int r0 = r2.length()
            if (r0 == 0) goto L_0x021e
            r5 = 2131959868(0x7f13203c, float:1.9556389E38)
            goto L_0x02be
        L_0x021e:
            r0 = 2131959867(0x7f13203b, float:1.9556387E38)
            goto L_0x034a
        L_0x0223:
            X.Niq r2 = r7.A02
            int r0 = r2.ordinal()
            if (r0 != r3) goto L_0x023f
            java.lang.String r2 = r7.A04
            if (r2 == 0) goto L_0x023a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x023a
            r5 = 2131959871(0x7f13203f, float:1.9556395E38)
            goto L_0x02be
        L_0x023a:
            r0 = 2131959870(0x7f13203e, float:1.9556393E38)
            goto L_0x034a
        L_0x023f:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Profile message content action not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x024e:
            X.Niq r2 = r7.A02
            int r0 = r2.ordinal()
            if (r0 != r3) goto L_0x0269
            java.lang.String r2 = r7.A04
            if (r2 == 0) goto L_0x0264
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0264
            r5 = 2131959858(0x7f132032, float:1.9556368E38)
            goto L_0x02be
        L_0x0264:
            r0 = 2131959857(0x7f132031, float:1.9556366E38)
            goto L_0x034a
        L_0x0269:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Location message content action not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0278:
            X.Niq r2 = r7.A02
            int r0 = r2.ordinal()
            if (r0 != r3) goto L_0x0285
            r0 = 2131959848(0x7f132028, float:1.9556348E38)
            goto L_0x034a
        L_0x0285:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "AR effect message content action not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0294:
            X.Niq r2 = r7.A02
            int r0 = r2.ordinal()
            if (r0 != r1) goto L_0x0352
            r5 = 2131959864(0x7f132038, float:1.955638E38)
        L_0x029f:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.Prd r0 = r7.A01
            X.0qQ.A0C(r0, r6)
            X.N8W r0 = (X.N8W) r0
            java.lang.String r2 = r0.A01
            goto L_0x02c0
        L_0x02ab:
            if (r6 <= 0) goto L_0x033a
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131820667(0x7f11007b, float:1.9274055E38)
            java.lang.String r2 = X.DbY.A0d(r1, r6, r0)
        L_0x02b8:
            X.0qQ.A07(r2)
            r5 = 2131959883(0x7f13204b, float:1.955642E38)
        L_0x02be:
            java.lang.Object[] r1 = new java.lang.Object[r4]
        L_0x02c0:
            r1[r3] = r2
            goto L_0x02fe
        L_0x02c3:
            boolean r6 = r7 instanceof java.util.Collection
            if (r6 == 0) goto L_0x031b
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x031b
            r5 = 0
        L_0x02ce:
            if (r6 == 0) goto L_0x0303
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0303
            r6 = 0
        L_0x02d7:
            if (r5 <= 0) goto L_0x02ab
            if (r6 <= 0) goto L_0x033a
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131820667(0x7f11007b, float:1.9274055E38)
            java.lang.String r2 = X.DbY.A0d(r1, r6, r0)
            X.0qQ.A07(r2)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131820666(0x7f11007a, float:1.9274053E38)
            java.lang.String r0 = X.DbY.A0d(r1, r5, r0)
            X.0qQ.A07(r0)
            r5 = 2131959884(0x7f13204c, float:1.9556421E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r2}
        L_0x02fe:
            java.lang.String r0 = r9.getString(r5, r1)
            goto L_0x034e
        L_0x0303:
            java.util.Iterator r2 = r7.iterator()
            r6 = 0
        L_0x0308:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02d7
            java.lang.Object r1 = r2.next()
            X.NjB r0 = X.C69310NjB.VIDEO
            if (r1 != r0) goto L_0x0308
            int r6 = r6 + 1
            if (r6 >= 0) goto L_0x0308
            goto L_0x0332
        L_0x031b:
            java.util.Iterator r2 = r7.iterator()
            r5 = 0
        L_0x0320:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ce
            java.lang.Object r1 = r2.next()
            X.NjB r0 = X.C69310NjB.PHOTO
            if (r1 != r0) goto L_0x0320
            int r5 = r5 + 1
            if (r5 >= 0) goto L_0x0320
        L_0x0332:
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x033a:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131820666(0x7f11007a, float:1.9274053E38)
            java.lang.String r2 = X.DbY.A0d(r1, r5, r0)
            goto L_0x02b8
        L_0x0347:
            r0 = 2131959895(0x7f132057, float:1.9556443E38)
        L_0x034a:
            java.lang.String r0 = r9.getString(r0)
        L_0x034e:
            X.0qQ.A0A(r0)
            return r0
        L_0x0352:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Note message content action not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0361:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r1, r2, r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x036e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Raven action type not supported: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r6, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x037d:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r1, r2, r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x038a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OIw.A00(android.content.Context, X.2Ep, X.N3b, boolean):java.lang.String");
    }
}
