package X;

public final class J7N extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7N(int i, Object obj, Object obj2, boolean z) {
        super(2);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x032d, code lost:
        X.C56630I5j.A04(X.C288035bG.A00(r0, r1), r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0338, code lost:
        if (X.C51970G9q.A1a(r0, false) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x033a, code lost:
        r0 = 1909485562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x08dc, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x08e1, code lost:
        r0.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020e, code lost:
        X.C56630I5j.A01(r0, r2, r5, r4, 384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x029e, code lost:
        X.C56630I5j.A02(r0, r7, r8, r9, r10, r5, 24576);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31, java.lang.Object r32) {
        /*
            r30 = this;
            r1 = r30
            r3 = r32
            r0 = r31
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x016a;
                case 1: goto L_0x033f;
                case 2: goto L_0x04a6;
                case 3: goto L_0x012e;
                case 4: goto L_0x0752;
                case 5: goto L_0x07a3;
                case 6: goto L_0x07eb;
                default: goto L_0x000b;
            }
        L_0x000b:
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.0sa r3 = (X.C62320sa) r3
            boolean r7 = X.AnonymousClass7TG.A1Z(r0, r3)
            java.lang.Object r2 = r1.A01
            com.instagram.rtc.signaling.models.RtcConnectionEntity r2 = (com.instagram.rtc.signaling.models.RtcConnectionEntity) r2
            com.instagram.model.rtc.RtcIgNotification r6 = r2.Bot()
            if (r6 == 0) goto L_0x00dd
            java.lang.Object r5 = r1.A02
            com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService r5 = (com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService) r5
            java.lang.String r11 = r2.C6C()
            r9 = 0
            com.instagram.model.rtc.RtcCallKey r4 = r2.AjW()
            java.lang.String r10 = r4.A00
            X.1X9 r4 = r5.A00
            X.1X8 r4 = (X.1X8) r4
            X.1XB r7 = r4.A01
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            r12 = r9
            r13 = r9
            X.0xI r6 = X.1XB.A02(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x0046
            java.lang.String r5 = "dismissed"
            java.lang.String r4 = "reason"
            r6.A0C(r4, r5)
            X.DbU.A1R(r6, r0)
        L_0x0046:
            boolean r4 = r1.A03
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r6 = r1.A02
            com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService r6 = (com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService) r6
            r1 = 10
            X.Ivu r4 = new X.Ivu
            r4.<init>(r3, r1)
            X.1X9 r5 = r6.A00
            android.content.Context r1 = X.DbT.A05(r6)
            X.38Y r1 = r5.A00(r1, r0)
            com.instagram.common.session.UserSession r1 = r1.A06
            X.OyC r1 = X.C66953Mfm.A01(r1)
            if (r1 == 0) goto L_0x007d
            X.OVd r1 = r1.A09
            if (r1 == 0) goto L_0x007d
            com.instagram.rtc.rsys.models.IgCallModel r1 = r1.A01()
            if (r1 == 0) goto L_0x007d
            java.lang.String r3 = r1.localCallId
            if (r3 == 0) goto L_0x007d
            X.C70320O1y.A00(r0)
            r1 = 15
            X.OWf.A00(r3, r1)
        L_0x007d:
            android.content.Context r1 = X.DbT.A05(r6)
            X.38Y r3 = r5.A00(r1, r0)
            X.NjG r1 = r2.Bz4()
            X.NjG r0 = X.C69315NjG.Incoming
            if (r1 != r0) goto L_0x00d5
            boolean r0 = r2 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            if (r0 == 0) goto L_0x00b8
            r1 = r2
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r1 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r1
            java.lang.String r0 = "handleDeclineCall"
            r3.A07(r1, r0, r4)
        L_0x0099:
            java.lang.String r0 = X.C70907OQz.A00(r2)
            X.NjG r4 = X.C69315NjG.Ended
            X.I4H r3 = X.I4H.A00
            com.instagram.rtc.signaling.models.RtcConnectionEntity r2 = X.I4H.A00(r0)
            if (r2 == 0) goto L_0x00b5
            r1 = 0
            java.lang.String r0 = r2.BWc()
            com.instagram.rtc.signaling.models.RtcConnectionEntity r0 = X.ABG.A00(r4, r2, r0)
            if (r0 == 0) goto L_0x00b5
            r3.A01(r1, r0)
        L_0x00b5:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00b8:
            boolean r0 = r2 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.EndCallConnectionEntity
            if (r0 == 0) goto L_0x00c0
            r4.invoke()
            goto L_0x0099
        L_0x00c0:
            X.0wj r0 = X.0wj.A01
            X.ON9 r3 = new X.ON9
            r3.<init>(r0)
            java.lang.String r1 = "Unsuccessfully casting connectionEntity as RtcCallConnectionEntity, the type is: "
            java.lang.String r0 = r2.getTag()
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.A01(r0)
            goto L_0x0099
        L_0x00d5:
            r3.A0A(r4)
            goto L_0x0099
        L_0x00d9:
            r3.invoke()
            goto L_0x00b5
        L_0x00dd:
            boolean r4 = r2 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            if (r4 == 0) goto L_0x0046
            r9 = r2
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r9 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r9
            X.Nid r5 = r9.A01
            X.Nid r4 = X.C69277Nid.NO_E2EE
            boolean r5 = X.C51969G9p.A1a(r5, r4)
            r4 = 0
            if (r5 != 0) goto L_0x012a
            java.lang.String r6 = r9.A0J
        L_0x00f1:
            java.lang.Object r8 = r1.A02
            com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService r8 = (com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService) r8
            X.7Rj r10 = X.C331537Rj.MQTT_RING_NOTIFICATION
            java.lang.String r13 = r9.A0G
            com.instagram.model.rtc.RtcCallKey r5 = r9.A03
            java.lang.String r16 = r9.A00()
            r14 = 0
            java.lang.String r15 = r5.A00
            X.1X9 r5 = r8.A00
            X.1X8 r5 = (X.1X8) r5
            X.1XB r11 = r5.A01
            X.0qQ.A0B(r13, r7)
            java.lang.Integer r12 = X.AnonymousClass05K.A0N
            r19 = r14
            r18 = r4
            r17 = r6
            X.0xI r6 = X.1XB.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r5 = "mqtt"
            java.lang.String r4 = "push_type"
            r6.A0C(r4, r5)
            java.lang.String r5 = "dismissed"
            java.lang.String r4 = "reason"
            r6.A0C(r4, r5)
            X.1XC.A00(r6, r13)
            goto L_0x0046
        L_0x012a:
            r6 = r4
            java.lang.String r4 = r9.A0E
            goto L_0x00f1
        L_0x012e:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0B(r3)
            r2 = 2
            if (r3 != r2) goto L_0x013d
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x08e1
        L_0x013d:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x014b
            r3 = -1091864016(0xffffffffbeeb7a30, float:-0.4599166)
            java.lang.String r2 = "com.instagram.direct.inbox.ui.conversationstartersmenu.ConversationStarterMenuHelper.createFloatingActionButton.<anonymous> (ConversationStarterMenuHelper.kt:95)"
            X.0fL.A01(r3, r2)
        L_0x014b:
            X.I0S r6 = X.I0S.A00
            java.lang.Object r5 = r1.A01
            java.lang.Object r4 = r1.A02
            r2 = 25
            X.Plr r3 = new X.Plr
            r3.<init>(r2, r5, r4)
            boolean r2 = r1.A03
            r1 = 384(0x180, float:5.38E-43)
            r6.A00(r0, r3, r1, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b5
            r0 = 786964284(0x2ee81f3c, float:1.0555687E-10)
            goto L_0x08dc
        L_0x016a:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0B(r3)
            r2 = 2
            if (r3 != r2) goto L_0x0179
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x08e1
        L_0x0179:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0187
            r3 = 1622935251(0x60bc06d3, float:1.0838999E20)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostTombstone.<anonymous>.<anonymous> (PostTombstone.kt:83)"
            X.0fL.A01(r3, r2)
        L_0x0187:
            java.lang.Object r4 = r1.A02
            X.HML r4 = (X.HML) r4
            int r2 = r4.ordinal()
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0324;
                case 1: goto L_0x031a;
                case 2: goto L_0x02a7;
                case 3: goto L_0x025a;
                case 4: goto L_0x01f2;
                case 5: goto L_0x0215;
                case 6: goto L_0x01d5;
                case 7: goto L_0x019b;
                default: goto L_0x0193;
            }
        L_0x0193:
            r1 = -1249096497(0xffffffffb58c4ccf, float:-1.0453167E-6)
            X.Wub r0 = X.C51973G9u.A0n(r0, r1)
            throw r0
        L_0x019b:
            r2 = -64783545(0xfffffffffc237b47, float:-3.395379E36)
            r0.ExS(r2)
            r2 = -1249013670(0xffffffffb58d905a, float:-1.054733E-6)
            r0.ExS(r2)
            java.lang.Object r2 = r1.A01
            boolean r1 = X.C51971G9r.A1U(r0, r2, r4)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x01b7
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x01bd
        L_0x01b7:
            r1 = 23
            X.IwP r5 = X.C58716IwP.A00(r0, r2, r4, r1)
        L_0x01bd:
            X.0sa r5 = (X.C62320sa) r5
            X.C51965G9l.A1X(r0, r3)
            r1 = 2131953710(0x7f13082e, float:1.9543899E38)
            java.lang.String r2 = X.C288035bG.A00(r0, r1)
            r1 = 2131953709(0x7f13082d, float:1.9543897E38)
            java.lang.String r1 = X.C288035bG.A00(r0, r1)
            X.C56630I5j.A03(r0, r2, r1, r5, r3)
            goto L_0x0334
        L_0x01d5:
            r1 = -65114501(0xfffffffffc1e6e7b, float:-3.290495E36)
            r0.ExS(r1)
            r1 = 2131953721(0x7f130839, float:1.954392E38)
            java.lang.String r5 = X.C288035bG.A00(r0, r1)
            r1 = 2131953722(0x7f13083a, float:1.9543923E38)
            java.lang.String r4 = X.C288035bG.A00(r0, r1)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r1 = 1115684864(0x42800000, float:64.0)
            androidx.compose.ui.Modifier r2 = X.C51967G9n.A0F(r2, r1)
            goto L_0x020e
        L_0x01f2:
            r1 = -65444155(0xfffffffffc1966c5, float:-3.1860233E36)
            r0.ExS(r1)
            r1 = 2131953721(0x7f130839, float:1.954392E38)
            java.lang.String r5 = X.C288035bG.A00(r0, r1)
            r1 = 2131953722(0x7f13083a, float:1.9543923E38)
            java.lang.String r4 = X.C288035bG.A00(r0, r1)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            androidx.compose.foundation.layout.FillElement r1 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r2 = r2.Ezh(r1)
        L_0x020e:
            r1 = 384(0x180, float:5.38E-43)
            X.C56630I5j.A01(r0, r2, r5, r4, r1)
            goto L_0x0334
        L_0x0215:
            r2 = -65914673(0xfffffffffc1238cf, float:-3.0369102E36)
            r0.ExS(r2)
            r2 = -1249050022(0xffffffffb58d025a, float:-1.0506003E-6)
            r0.ExS(r2)
            java.lang.Object r2 = r1.A01
            boolean r1 = X.C51971G9r.A1U(r0, r2, r4)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x0231
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x0237
        L_0x0231:
            r1 = 22
            X.IwP r5 = X.C58716IwP.A00(r0, r2, r4, r1)
        L_0x0237:
            X.0sa r5 = (X.C62320sa) r5
            X.C51965G9l.A1X(r0, r3)
            r1 = 2131953721(0x7f130839, float:1.954392E38)
            java.lang.String r8 = X.C288035bG.A00(r0, r1)
            r1 = 2131953720(0x7f130838, float:1.9543919E38)
            java.lang.String r9 = X.C288035bG.A00(r0, r1)
            r1 = 2131953700(0x7f130824, float:1.9543878E38)
            java.lang.String r10 = X.C288035bG.A00(r0, r1)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r1 = 1109917696(0x42280000, float:42.0)
            androidx.compose.ui.Modifier r7 = X.C51967G9n.A0F(r2, r1)
            goto L_0x029e
        L_0x025a:
            r2 = -66381223(0xfffffffffc0b1a59, float:-2.8890546E36)
            r0.ExS(r2)
            r2 = -1249065062(0xffffffffb58cc79a, float:-1.0488905E-6)
            r0.ExS(r2)
            java.lang.Object r2 = r1.A01
            boolean r1 = X.C51971G9r.A1U(r0, r2, r4)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x0276
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x027c
        L_0x0276:
            r1 = 21
            X.IwP r5 = X.C58716IwP.A00(r0, r2, r4, r1)
        L_0x027c:
            X.0sa r5 = (X.C62320sa) r5
            X.C51965G9l.A1X(r0, r3)
            r1 = 2131953721(0x7f130839, float:1.954392E38)
            java.lang.String r8 = X.C288035bG.A00(r0, r1)
            r1 = 2131953720(0x7f130838, float:1.9543919E38)
            java.lang.String r9 = X.C288035bG.A00(r0, r1)
            r1 = 2131953700(0x7f130824, float:1.9543878E38)
            java.lang.String r10 = X.C288035bG.A00(r0, r1)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            androidx.compose.foundation.layout.FillElement r1 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r7 = r2.Ezh(r1)
        L_0x029e:
            r12 = 24576(0x6000, float:3.4438E-41)
            r6 = r0
            r11 = r5
            X.C56630I5j.A02(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0334
        L_0x02a7:
            r2 = -67011701(0xfffffffffc017b8b, float:-2.6892482E36)
            r0.ExS(r2)
            boolean r2 = r1.A03
            if (r2 == 0) goto L_0x02ee
            r2 = -66999735(0xfffffffffc01aa49, float:-2.6930404E36)
            r0.ExS(r2)
            r2 = -1249085030(0xffffffffb58c799a, float:-1.0466204E-6)
            r0.ExS(r2)
            java.lang.Object r2 = r1.A01
            boolean r1 = X.C51971G9r.A1U(r0, r2, r4)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x02cd
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x02d3
        L_0x02cd:
            r1 = 19
            X.IwP r5 = X.C58716IwP.A00(r0, r2, r4, r1)
        L_0x02d3:
            X.0sa r5 = (X.C62320sa) r5
            X.5Wx r4 = X.C51965G9l.A0H(r0, r3)
            r1 = 2131953612(0x7f1307cc, float:1.95437E38)
        L_0x02dc:
            java.lang.String r2 = X.C288035bG.A00(r0, r1)
            r1 = 2131953700(0x7f130824, float:1.9543878E38)
            java.lang.String r1 = X.C288035bG.A00(r0, r1)
            X.C56630I5j.A03(r0, r2, r1, r5, r3)
            X.C286565Wx.A0L(r4, r3)
            goto L_0x0334
        L_0x02ee:
            r2 = -66717945(0xfffffffffc05f707, float:-2.7823432E36)
            r0.ExS(r2)
            r2 = -1249075942(0xffffffffb58c9d1a, float:-1.0476535E-6)
            r0.ExS(r2)
            java.lang.Object r2 = r1.A01
            boolean r1 = X.C51971G9r.A1U(r0, r2, r4)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x030a
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x0310
        L_0x030a:
            r1 = 20
            X.IwP r5 = X.C58716IwP.A00(r0, r2, r4, r1)
        L_0x0310:
            X.0sa r5 = (X.C62320sa) r5
            X.5Wx r4 = X.C51965G9l.A0H(r0, r3)
            r1 = 2131953688(0x7f130818, float:1.9543854E38)
            goto L_0x02dc
        L_0x031a:
            r1 = -67166949(0xfffffffffbff1d1b, float:-2.649252E36)
            r0.ExS(r1)
            r1 = 2131953711(0x7f13082f, float:1.95439E38)
            goto L_0x032d
        L_0x0324:
            r1 = -67312804(0xfffffffffbfce35c, float:-2.6261404E36)
            r0.ExS(r1)
            r1 = 2131953693(0x7f13081d, float:1.9543864E38)
        L_0x032d:
            java.lang.String r1 = X.C288035bG.A00(r0, r1)
            X.C56630I5j.A04(r1, r0, r3)
        L_0x0334:
            boolean r0 = X.C51970G9q.A1a(r0, r3)
            if (r0 == 0) goto L_0x00b5
            r0 = 1909485562(0x71d06ffa, float:2.0642641E30)
            goto L_0x08dc
        L_0x033f:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r3)
            r4 = 2
            if (r2 != r4) goto L_0x034e
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x08e1
        L_0x034e:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x035c
            r3 = -1768896744(0xffffffff9690c718, float:-2.33901E-25)
            java.lang.String r2 = "com.instagram.creation.genai.contextualbackground.ui.ContextualBackgroundFragment.onCreateView.<anonymous>.<anonymous> (ContextualBackgroundFragment.kt:71)"
            X.0fL.A01(r3, r2)
        L_0x035c:
            androidx.compose.ui.Modifier r3 = X.C51968G9o.A0O()
            X.0sP r2 = X.C287655aY.A00
            androidx.compose.ui.Modifier r3 = X.JJP.A00(r3, r2, r4)
            java.lang.Object r11 = r1.A02
            X.H0n r11 = (X.C54143H0n) r11
            java.lang.Object r13 = r1.A01
            X.4gU r13 = (X.C270284gU) r13
            boolean r10 = r1.A03
            androidx.compose.ui.Alignment r1 = X.C287215Zl.A0E
            r9 = 0
            X.5RD r2 = X.C287675aa.A00(r1, r9)
            int r4 = X.C287425a7.A00(r0)
            r12 = r0
            X.5Wx r12 = (X.C286565Wx) r12
            X.5RM r1 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r0, r3)
            X.C51973G9u.A0y(r0, r12)
            X.C51971G9r.A12(r0, r2, r1)
            X.0sL r2 = X.C287485aD.A02
            boolean r1 = r12.A0K
            if (r1 != 0) goto L_0x0398
            boolean r1 = X.C51972G9s.A1Q(r0, r4)
            if (r1 != 0) goto L_0x039b
        L_0x0398:
            X.C51971G9r.A13(r0, r2, r4)
        L_0x039b:
            X.C51965G9l.A18(r0, r3)
            java.lang.Object r8 = r13.getValue()
            X.Jvo r8 = (X.C61050Jvo) r8
            X.0eM r3 = r11.A02
            java.lang.Object r4 = r3.getValue()
            r1 = -208777585(0xfffffffff38e4e8f, float:-2.2549424E31)
            boolean r1 = X.C51967G9n.A1Z(r0, r4, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x03bb
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x03c1
        L_0x03bb:
            r1 = 50
            X.MId r2 = X.C51975G9x.A0v(r0, r4, r1)
        L_0x03c1:
            X.0Ya r7 = X.C51965G9l.A12(r12, r2)
            java.lang.Object r4 = r3.getValue()
            r1 = -208775705(0xfffffffff38e55e7, float:-2.255397E31)
            boolean r2 = X.C51967G9n.A1Z(r0, r4, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x03da
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x03e3
        L_0x03da:
            r2 = 3
            X.MIX r1 = new X.MIX
            r1.<init>(r4, r2)
            r0.FLL(r1)
        L_0x03e3:
            X.0Ya r6 = X.C51965G9l.A12(r12, r1)
            r1 = -208774042(0xfffffffff38e5c66, float:-2.255799E31)
            boolean r1 = X.C51967G9n.A1Z(r0, r11, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x03f8
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x03fe
        L_0x03f8:
            r1 = 30
            X.In8 r2 = X.C51970G9q.A0s(r0, r11, r1)
        L_0x03fe:
            X.0Ya r5 = X.C51965G9l.A12(r12, r2)
            java.lang.Object r4 = r3.getValue()
            r1 = -208770681(0xfffffffff38e6987, float:-2.2566116E31)
            boolean r2 = X.C51967G9n.A1Z(r0, r4, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0417
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0420
        L_0x0417:
            r2 = 4
            X.MIX r1 = new X.MIX
            r1.<init>(r4, r2)
            r0.FLL(r1)
        L_0x0420:
            X.0Ya r4 = X.C51965G9l.A12(r12, r1)
            java.lang.Object r3 = r3.getValue()
            r1 = -208768646(0xfffffffff38e717a, float:-2.2571037E31)
            boolean r1 = X.C51967G9n.A1Z(r0, r3, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0439
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x043f
        L_0x0439:
            r1 = 31
            X.In8 r2 = X.C51970G9q.A0s(r0, r3, r1)
        L_0x043f:
            X.0Ya r3 = X.C51965G9l.A12(r12, r2)
            r1 = -208780001(0xfffffffff38e451f, float:-2.2543582E31)
            boolean r2 = X.G9t.A1X(r0, r11, r13, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0454
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x045e
        L_0x0454:
            r2 = 48
            X.MMa r1 = new X.MMa
            r1.<init>(r2, r13, r11)
            r0.FLL(r1)
        L_0x045e:
            X.0sa r13 = X.C51965G9l.A0y(r12, r1, r9)
            r1 = -208784756(0xfffffffff38e328c, float:-2.2532085E31)
            boolean r1 = X.C51967G9n.A1Z(r0, r11, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0473
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0479
        L_0x0473:
            r1 = 43
            X.MIz r2 = X.C51975G9x.A0x(r0, r11, r1)
        L_0x0479:
            X.0sa r14 = X.C51965G9l.A0y(r12, r2, r9)
            X.0sa r6 = (X.C62320sa) r6
            X.0sa r4 = (X.C62320sa) r4
            X.0sP r5 = (X.0sP) r5
            X.0sP r7 = (X.0sP) r7
            X.0sP r3 = (X.0sP) r3
            r11 = r0
            r12 = r8
            r15 = r6
            r16 = r4
            r17 = r5
            r18 = r7
            r19 = r3
            r20 = r9
            r21 = r9
            r22 = r10
            X.I7I.A03(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.C51967G9n.A1R(r0)
            if (r0 == 0) goto L_0x00b5
            r0 = 226993943(0xd87a717, float:8.360243E-31)
            goto L_0x08dc
        L_0x04a6:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0C(r3)
            r2 = 2
            if (r3 != r2) goto L_0x04b5
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x08e1
        L_0x04b5:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x04c3
            r3 = -1602394733(0xffffffffa07d6593, float:-2.1463542E-19)
            java.lang.String r2 = "com.instagram.creation.genai.magicmod.nux.MagicModDisclosureNux.<anonymous> (MagicModDisclosureNux.kt:54)"
            X.0fL.A01(r3, r2)
        L_0x04c3:
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            r21 = 1
            r20 = 0
            androidx.compose.ui.Modifier r5 = X.C51966G9m.A0U(r3)
            boolean r2 = r1.A03
            r19 = r2
            java.lang.Object r2 = r1.A01
            r29 = r2
            java.lang.Object r1 = r1.A02
            r28 = r1
            X.5Zx r10 = X.C287275Zs.A07
            X.5Zr r16 = X.C287215Zl.A02
            r7 = 0
            r1 = r16
            X.5RD r4 = X.C291495hO.A02(r10, r0, r1, r7)
            int r11 = X.C287425a7.A00(r0)
            r2 = r0
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r1 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r0, r5)
            X.0sa r6 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r2, r6)
            X.0sL r5 = X.C287485aD.A03
            X.0sL r9 = X.C51969G9p.A0w(r0, r4, r1, r5)
            X.0sL r4 = X.C287485aD.A02
            boolean r1 = r2.A0K
            if (r1 != 0) goto L_0x050a
            boolean r1 = X.C51972G9s.A1Q(r0, r11)
            if (r1 != 0) goto L_0x050d
        L_0x050a:
            X.C51971G9r.A13(r0, r4, r11)
        L_0x050d:
            X.0sL r8 = X.C51966G9m.A1K(r0, r8)
            X.6Et r11 = X.C304676Et.A00
            X.5Zr r12 = X.C287215Zl.A00
            r1 = r21
            androidx.compose.ui.Modifier r1 = r11.A00(r3, r1)
            androidx.compose.ui.Modifier r11 = X.I28.A02(r0, r1)
            r13 = 48
            X.5RD r15 = X.C291495hO.A02(r10, r0, r12, r13)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r1 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r11)
            X.C51973G9u.A0z(r0, r2, r6)
            X.C287595aO.A00(r0, r15, r5)
            boolean r1 = X.C51965G9l.A1Y(r0, r2, r1, r9)
            if (r1 != 0) goto L_0x0543
            boolean r1 = X.C51972G9s.A1Q(r0, r14)
            if (r1 != 0) goto L_0x0546
        L_0x0543:
            X.C51971G9r.A13(r0, r4, r14)
        L_0x0546:
            X.C287595aO.A00(r0, r11, r8)
            r1 = 1107296256(0x42000000, float:32.0)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A07(r3, r1)
            X.5RD r13 = X.C291495hO.A02(r10, r0, r12, r13)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r1 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r11)
            X.C51973G9u.A0z(r0, r2, r6)
            X.C287595aO.A00(r0, r13, r5)
            boolean r1 = X.C51965G9l.A1Y(r0, r2, r1, r9)
            if (r1 != 0) goto L_0x0571
            boolean r1 = X.C51972G9s.A1Q(r0, r12)
            if (r1 != 0) goto L_0x0574
        L_0x0571:
            X.C51971G9r.A13(r0, r4, r12)
        L_0x0574:
            X.C287595aO.A00(r0, r11, r8)
            r1 = 2131237680(0x7f081b30, float:1.8091617E38)
            X.2DO r14 = X.C287975bA.A00(r0, r1, r7)
            r11 = 1119879168(0x42c00000, float:96.0)
            androidx.compose.ui.Modifier r1 = X.C287205Zk.A0D(r3, r11)
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A08(r1, r11)
            java.lang.String r12 = ""
            r1 = 0
            r11 = 440(0x1b8, float:6.17E-43)
            X.AnonymousClass6G3.A0B(r0, r13, r14, r12, r11)
            r11 = 2131965753(0x7f133739, float:1.9568325E38)
            java.lang.String r25 = X.C304346Dc.A00(r0, r11)
            long r26 = X.G9w.A05(r0)
            r11 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r23 = X.C287195Zj.A0B(r3, r1, r11, r1, r11)
            X.5Z4 r24 = X.C51966G9m.A0e(r0)
            r22 = r0
            X.AnonymousClass5ZZ.A0W(r22, r23, r24, r25, r26)
            r11 = 2131965752(0x7f133738, float:1.9568323E38)
            java.lang.String r14 = X.C304346Dc.A00(r0, r11)
            X.5Yw r11 = X.AnonymousClass5aQ.A00(r0)
            long r11 = r11.A0u
            X.5Z4 r13 = X.C51966G9m.A0g(r0)
            X.AnonymousClass5ZZ.A0u(r0, r13, r14, r11)
            r0.ASN()
            if (r19 == 0) goto L_0x0744
            r11 = 590910122(0x233892aa, float:1.0005717E-17)
            r0.ExS(r11)
            X.I6O.A02(r0, r7)
            X.I6O.A00(r0, r7)
            X.I6O.A04(r0, r7)
        L_0x05d2:
            X.C286565Wx.A0L(r2, r7)
            r0.ASN()
            if (r19 == 0) goto L_0x0739
            r11 = -26848156(0xfffffffffe665464, float:-7.6540155E37)
            r0.ExS(r11)
            X.I6O.A03(r0, r7)
        L_0x05e3:
            X.C286565Wx.A0L(r2, r7)
            r11 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r14 = X.C287195Zj.A0B(r3, r1, r11, r1, r11)
            r12 = r16
            X.5RD r15 = X.C291495hO.A02(r10, r0, r12, r7)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r10 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r14)
            X.C51973G9u.A0z(r0, r2, r6)
            X.C287595aO.A00(r0, r15, r5)
            boolean r10 = X.C51965G9l.A1Y(r0, r2, r10, r9)
            if (r10 != 0) goto L_0x0610
            boolean r10 = X.C51972G9s.A1Q(r0, r13)
            if (r10 != 0) goto L_0x0613
        L_0x0610:
            X.C51971G9r.A13(r0, r4, r13)
        L_0x0613:
            X.C287595aO.A00(r0, r12, r8)
            androidx.compose.ui.Alignment r18 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A09(r3, r11, r1)
            X.5ZQ r10 = X.HYI.A00(r0)
            androidx.compose.ui.Modifier r10 = X.AnonymousClass6FZ.A01(r12, r10)
            long r12 = X.C51965G9l.A09(r0)
            androidx.compose.ui.Modifier r12 = X.C51966G9m.A0X(r10, r12)
            androidx.compose.foundation.layout.FillElement r17 = X.C287205Zk.A02
            r10 = r17
            androidx.compose.ui.Modifier r16 = r12.Ezh(r10)
            r12 = -812199296(0xffffffffcf96d280, float:-5.0607555E9)
            r10 = r29
            boolean r10 = X.C51967G9n.A1Y(r0, r10, r12)
            java.lang.Object r12 = r0.ECw()
            if (r10 != 0) goto L_0x0647
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r12 != r10) goto L_0x064f
        L_0x0647:
            r12 = 38
            r10 = r29
            X.Ivn r12 = X.C58678Ivn.A00(r0, r10, r12)
        L_0x064f:
            X.0sa r10 = X.C51965G9l.A0y(r2, r12, r7)
            r15 = r20
            r13 = r21
            r12 = r16
            androidx.compose.ui.Modifier r12 = X.C287635aW.A05(r12, r15, r15, r10, r13)
            r10 = r18
            X.5RD r14 = X.C287675aa.A00(r10, r7)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r10 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r12)
            X.C51973G9u.A0z(r0, r2, r6)
            X.C287595aO.A00(r0, r14, r5)
            boolean r10 = X.C51965G9l.A1Y(r0, r2, r10, r9)
            if (r10 != 0) goto L_0x0681
            boolean r10 = X.C51972G9s.A1Q(r0, r13)
            if (r10 != 0) goto L_0x0684
        L_0x0681:
            X.C51971G9r.A13(r0, r4, r13)
        L_0x0684:
            X.C287595aO.A00(r0, r12, r8)
            r10 = 2131965760(0x7f133740, float:1.9568339E38)
            if (r19 == 0) goto L_0x068f
            r10 = 2131965775(0x7f13374f, float:1.956837E38)
        L_0x068f:
            java.lang.String r25 = X.C304346Dc.A00(r0, r10)
            X.5Yw r10 = X.AnonymousClass5aQ.A00(r0)
            long r12 = r10.A14
            r10 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r23 = X.C287195Zj.A0B(r3, r1, r10, r1, r10)
            X.5Z4 r24 = X.C51966G9m.A0f(r0)
            r26 = r12
            X.AnonymousClass5ZZ.A0W(r22, r23, r24, r25, r26)
            r0.ASN()
            r10 = -812182428(0xffffffffcf971464, float:-5.0693919E9)
            r0.ExS(r10)
            if (r19 == 0) goto L_0x072e
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A09(r3, r11, r1)
            r10 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r11, r1, r10, r1, r1)
            r10 = r17
            androidx.compose.ui.Modifier r13 = r11.Ezh(r10)
            r11 = -812173855(0xffffffffcf9735e1, float:-5.0737812E9)
            r10 = r28
            boolean r10 = X.C51967G9n.A1Y(r0, r10, r11)
            java.lang.Object r11 = r0.ECw()
            if (r10 != 0) goto L_0x06d6
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r11 != r10) goto L_0x06de
        L_0x06d6:
            r11 = 39
            r10 = r28
            X.Ivn r11 = X.C58678Ivn.A00(r0, r10, r11)
        L_0x06de:
            X.0sa r14 = X.C51965G9l.A0y(r2, r11, r7)
            r10 = r21
            androidx.compose.ui.Modifier r13 = X.C287635aW.A05(r13, r15, r15, r14, r10)
            r10 = r18
            X.5RD r12 = X.C287675aa.A00(r10, r7)
            int r11 = X.C287425a7.A00(r0)
            X.5RM r10 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r0, r13)
            X.C51973G9u.A0z(r0, r2, r6)
            X.C287595aO.A00(r0, r12, r5)
            boolean r5 = X.C51965G9l.A1Y(r0, r2, r10, r9)
            if (r5 != 0) goto L_0x070c
            boolean r5 = X.C51972G9s.A1Q(r0, r11)
            if (r5 != 0) goto L_0x070f
        L_0x070c:
            X.C51971G9r.A13(r0, r4, r11)
        L_0x070f:
            X.C287595aO.A00(r0, r7, r8)
            r4 = 2131965776(0x7f133750, float:1.9568371E38)
            java.lang.String r6 = X.C304346Dc.A00(r0, r4)
            long r7 = X.C51966G9m.A0I(r0)
            r4 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r3, r1, r4, r1, r4)
            X.5Z4 r5 = X.C51966G9m.A0f(r0)
            r3 = r0
            X.AnonymousClass5ZZ.A0W(r3, r4, r5, r6, r7)
            r0.ASN()
        L_0x072e:
            boolean r0 = X.C51973G9u.A1R(r0, r2)
            if (r0 == 0) goto L_0x00b5
            r0 = -1923416667(0xffffffff8d5afda5, float:-6.748175E-31)
            goto L_0x08dc
        L_0x0739:
            r11 = -26799641(0xfffffffffe6711e7, float:-7.6786155E37)
            r0.ExS(r11)
            X.I6O.A01(r0, r7)
            goto L_0x05e3
        L_0x0744:
            r11 = 591016452(0x233a3204, float:1.00936714E-17)
            r0.ExS(r11)
            X.I6O.A04(r0, r7)
            X.I6O.A00(r0, r7)
            goto L_0x05d2
        L_0x0752:
            X.NAF r0 = (X.NAF) r0
            X.AnonymousClass7TG.A1N(r0, r3)
            java.lang.Object r4 = r1.A02
            X.OTU r4 = (X.OTU) r4
            java.lang.Object r7 = r4.A02
            boolean r8 = r1.A03
            java.lang.Object r2 = r1.A01
            monitor-enter(r7)
            X.45x r1 = X.C2605045x.A00()     // Catch:{ all -> 0x08e6 }
            r6 = 0
            if (r8 == 0) goto L_0x079b
            java.lang.Long r1 = r1.A02(r6)     // Catch:{ all -> 0x08e6 }
        L_0x076d:
            java.lang.String r13 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x08e6 }
            com.facebook.msys.mci.PrivacyContext r5 = r4.A00     // Catch:{ all -> 0x08e6 }
            r1 = 49
            X.Oph r4 = new X.Oph     // Catch:{ all -> 0x08e6 }
            r4.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r2)     // Catch:{ all -> 0x08e6 }
            X.68J r1 = r0.mMailboxApiHandleMetaProvider     // Catch:{ all -> 0x08e6 }
            X.68L r2 = r1.ASa(r6)     // Catch:{ all -> 0x08e6 }
            com.facebook.msys.mca.MailboxFutureImpl r1 = new com.facebook.msys.mca.MailboxFutureImpl     // Catch:{ all -> 0x08e6 }
            r1.<init>(r2)     // Catch:{ all -> 0x08e6 }
            r1.Eiu(r4)     // Catch:{ all -> 0x08e6 }
            X.Ooe r9 = new X.Ooe     // Catch:{ all -> 0x08e6 }
            r10 = r0
            r11 = r1
            r12 = r5
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x08e6 }
            boolean r0 = r2.EJd(r9)     // Catch:{ all -> 0x08e6 }
            if (r0 != 0) goto L_0x07a0
            r1.cancel(r6)     // Catch:{ all -> 0x08e6 }
            goto L_0x07a0
        L_0x079b:
            java.lang.Long r1 = r1.A01(r6)     // Catch:{ all -> 0x08e6 }
            goto L_0x076d
        L_0x07a0:
            monitor-exit(r7)
            goto L_0x00b5
        L_0x07a3:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0B(r3)
            r2 = 2
            if (r3 != r2) goto L_0x07b2
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x08e1
        L_0x07b2:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x07c0
            r3 = 520599175(0x1f07b687, float:2.8738345E-20)
            java.lang.String r2 = "com.instagram.newsfeed.compose.ui.StartAvatar.<anonymous>.<anonymous> (NewsfeedStoryRow.kt:208)"
            X.0fL.A01(r3, r2)
        L_0x07c0:
            java.lang.Object r2 = r1.A01
            X.JRl r2 = (X.C59643JRl) r2
            X.GQz r2 = (X.C52400GQz) r2
            X.BBV r5 = r2.A01
            X.0qQ.A0A(r5)
            java.lang.Object r4 = r1.A02
            X.5dk r4 = (X.C289525dk) r4
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Alignment r2 = X.C287215Zl.A07
            androidx.compose.ui.Modifier r4 = r4.AAz(r2, r3)
            boolean r1 = r1.A03
            r6 = 0
            r3 = r0
            r7 = r6
            r8 = r1
            X.GQY.A05(r3, r4, r5, r6, r7, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b5
            r0 = 520743298(0x1f09e982, float:2.920403E-20)
            goto L_0x08dc
        L_0x07eb:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0B(r3)
            r2 = 2
            if (r3 != r2) goto L_0x07fa
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x08e1
        L_0x07fa:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0808
            r3 = 1734440278(0x67617556, float:1.0646969E24)
            java.lang.String r2 = "com.instagram.opal.impl.ui.OpalFragment.getCustomTitleView.<anonymous>.<anonymous> (OpalFragment.kt:564)"
            X.0fL.A01(r3, r2)
        L_0x0808:
            java.lang.Object r3 = r1.A02
            X.EO2 r3 = (X.EO2) r3
            r2 = 2106838655(0x7d93ce7f, float:2.4558588E37)
            boolean r2 = X.C51967G9n.A1Z(r0, r3, r2)
            java.lang.Object r8 = r0.ECw()
            if (r2 != 0) goto L_0x081d
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r8 != r2) goto L_0x0823
        L_0x081d:
            r2 = 19
            X.FyD r8 = X.C51969G9p.A0y(r0, r3, r2)
        L_0x0823:
            X.0Ya r8 = (X.C59520Ya) r8
            r5 = r0
            X.5Wx r5 = (X.C286565Wx) r5
            r7 = 0
            X.C286565Wx.A0L(r5, r7)
            X.0sa r8 = (X.C62320sa) r8
            r2 = 2106840626(0x7d93d632, float:2.4563585E37)
            boolean r2 = X.C51967G9n.A1Z(r0, r3, r2)
            java.lang.Object r4 = r0.ECw()
            if (r2 != 0) goto L_0x083f
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x0845
        L_0x083f:
            r2 = 20
            X.FyD r4 = X.C51969G9p.A0y(r0, r3, r2)
        L_0x0845:
            X.0sa r14 = X.C51968G9o.A19(r5, r4)
            r2 = 2106842062(0x7d93dbce, float:2.4567226E37)
            boolean r4 = X.C51967G9n.A1Z(r0, r3, r2)
            java.lang.Object r2 = r0.ECw()
            if (r4 != 0) goto L_0x085a
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r2 != r4) goto L_0x0863
        L_0x085a:
            r4 = 3
            X.FyG r2 = new X.FyG
            r2.<init>(r3, r4)
            r0.FLL(r2)
        L_0x0863:
            X.0sP r17 = X.C51968G9o.A1A(r5, r2)
            r2 = 2106843473(0x7d93e151, float:2.4570803E37)
            boolean r2 = X.C51967G9n.A1Z(r0, r3, r2)
            java.lang.Object r4 = r0.ECw()
            if (r2 != 0) goto L_0x0878
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x087e
        L_0x0878:
            r2 = 21
            X.FyD r4 = X.C51969G9p.A0y(r0, r3, r2)
        L_0x087e:
            X.0sa r15 = X.C51968G9o.A19(r5, r4)
            r2 = 2106845142(0x7d93e7d6, float:2.4575035E37)
            boolean r2 = X.C51967G9n.A1Z(r0, r3, r2)
            java.lang.Object r4 = r0.ECw()
            if (r2 != 0) goto L_0x0893
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x0899
        L_0x0893:
            r2 = 21
            X.Imz r4 = X.C51975G9x.A0u(r0, r3, r2)
        L_0x0899:
            X.0sa r16 = X.C51968G9o.A19(r5, r4)
            boolean r6 = r1.A03
            java.lang.Object r9 = r1.A01
            X.4gU r9 = (X.C270284gU) r9
            java.lang.Object r1 = r9.getValue()
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r1 = r1.A05
            boolean r5 = r1.A09
            boolean r4 = r3.A08
            java.lang.String r3 = r3.A05
            java.lang.Object r1 = r9.getValue()
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r2 = r1.A04
            java.lang.Object r1 = r9.getValue()
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r1 = r1.A05
            r9 = r0
            r10 = r2
            r11 = r1
            r12 = r3
            r13 = r8
            r18 = r7
            r19 = r7
            r20 = r6
            r21 = r5
            r22 = r4
            X.C55075Hbk.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b5
            r0 = -606407249(0xffffffffdbdaf5af, float:-1.23263354E17)
        L_0x08dc:
            X.0fL.A00(r0)
            goto L_0x00b5
        L_0x08e1:
            r0.Evl()
            goto L_0x00b5
        L_0x08e6:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7N.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
