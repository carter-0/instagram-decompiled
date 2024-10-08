package X;

import android.view.View;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;

/* renamed from: X.Ok7  reason: case insensitive filesystem */
public final class C71408Ok7 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71408Ok7(ReactionViewModel reactionViewModel, C68589NOl nOl, int i) {
        this.A00 = i;
        if (51 - i != 0) {
            this.A01 = reactionViewModel;
            this.A02 = nOl;
        } else {
            this.A02 = nOl;
            this.A01 = reactionViewModel;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new C71408Ok7(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0a7c, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0a83, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0cd2, code lost:
        if (r3 == null) goto L_0x0cd4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0ec2, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0ec5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r33) {
        /*
            r32 = this;
            r1 = r32
            int r0 = r1.A00
            r7 = r33
            switch(r0) {
                case 0: goto L_0x0c1b;
                case 1: goto L_0x0e82;
                case 2: goto L_0x0be6;
                case 3: goto L_0x0bb5;
                case 4: goto L_0x0b80;
                case 5: goto L_0x0b40;
                case 6: goto L_0x0b09;
                case 7: goto L_0x0aee;
                case 8: goto L_0x0ad3;
                case 9: goto L_0x0ab1;
                case 10: goto L_0x0a61;
                case 11: goto L_0x0a39;
                case 12: goto L_0x0deb;
                case 13: goto L_0x09da;
                case 14: goto L_0x09c3;
                case 15: goto L_0x09ac;
                case 16: goto L_0x0957;
                case 17: goto L_0x093c;
                case 18: goto L_0x0921;
                case 19: goto L_0x0906;
                case 20: goto L_0x08de;
                case 21: goto L_0x08bf;
                case 22: goto L_0x089d;
                case 23: goto L_0x003f;
                case 24: goto L_0x087b;
                case 25: goto L_0x0860;
                case 26: goto L_0x0841;
                case 27: goto L_0x0828;
                case 28: goto L_0x080f;
                case 29: goto L_0x07f0;
                case 30: goto L_0x07ce;
                case 31: goto L_0x07af;
                case 32: goto L_0x0794;
                case 33: goto L_0x0777;
                case 34: goto L_0x073c;
                case 35: goto L_0x070e;
                case 36: goto L_0x06f1;
                case 37: goto L_0x06d4;
                case 38: goto L_0x06ad;
                case 39: goto L_0x0690;
                case 40: goto L_0x0c3e;
                case 41: goto L_0x066d;
                case 42: goto L_0x064a;
                case 43: goto L_0x059d;
                case 44: goto L_0x0510;
                case 45: goto L_0x04f0;
                case 46: goto L_0x04d0;
                case 47: goto L_0x04ae;
                case 48: goto L_0x0489;
                case 49: goto L_0x043b;
                case 50: goto L_0x0416;
                case 51: goto L_0x03f9;
                case 52: goto L_0x03da;
                case 53: goto L_0x0397;
                case 54: goto L_0x037c;
                case 55: goto L_0x0361;
                case 56: goto L_0x0d5b;
                case 57: goto L_0x0c32;
                case 58: goto L_0x030f;
                case 59: goto L_0x02f8;
                case 60: goto L_0x02e1;
                case 61: goto L_0x02ca;
                case 62: goto L_0x02b3;
                case 63: goto L_0x029c;
                case 64: goto L_0x0285;
                case 65: goto L_0x025e;
                case 66: goto L_0x0206;
                case 67: goto L_0x01af;
                case 68: goto L_0x009a;
                case 69: goto L_0x0080;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -721106598(0xffffffffd504c95a, float:-9.1250208E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Ok8 r4 = (X.C71409Ok8) r4
            java.lang.Object r2 = r4.A01
            X.NOF r2 = (X.NOF) r2
            X.O8v r3 = r2.A00
            java.lang.Object r2 = r1.A02
            X.NkF r2 = (X.C69375NkF) r2
            X.OeR r1 = r3.A00
            X.C71153OeR.A0D(r2, r1)
            X.NkF r1 = X.C69375NkF.A07
            if (r2 != r1) goto L_0x0038
            java.lang.Object r1 = r4.A02
            X.Otr r1 = (X.C71966Otr) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            r1 = 0
            X.GPq r2 = new X.GPq
            r2.<init>(r3, r1)
            X.HOt r1 = X.C54688HOt.A0N
            X.C52369GPq.A01(r1, r2)
        L_0x0038:
            r1 = 2436009(0x252ba9, float:3.413576E-39)
        L_0x003b:
            X.AnonymousClass0fD.A0C(r1, r0)
        L_0x003e:
            return
        L_0x003f:
            r0 = -1966502390(0xffffffff8ac98e0a, float:-1.9409025E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r1.A02
            X.OdL r9 = (X.C71126OdL) r9
            java.lang.Object r8 = r1.A01
            X.NWf r8 = (X.C68770NWf) r8
            java.lang.String r3 = r8.A08
            X.17i r2 = r9.A0Y
            com.instagram.user.model.User r0 = r2.A02(r3)
            if (r0 == 0) goto L_0x007d
            java.util.List r1 = X.DbW.A0n(r0)
            X.0qQ.A07(r1)
        L_0x005f:
            com.instagram.user.model.User r0 = r2.A02(r3)
            if (r0 == 0) goto L_0x007b
            com.instagram.model.direct.DirectShareTarget r6 = new com.instagram.model.direct.DirectShareTarget
            r6.<init>((com.instagram.user.model.User) r0)
        L_0x006a:
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0d50
            if (r6 == 0) goto L_0x0d50
            com.instagram.common.ui.base.IgEditText r0 = r9.A04
            r1 = 0
            if (r0 != 0) goto L_0x0c78
            java.lang.String r0 = "replyMessage"
            goto L_0x0a7c
        L_0x007b:
            r6 = 0
            goto L_0x006a
        L_0x007d:
            X.0sn r1 = X.0sn.A00
            goto L_0x005f
        L_0x0080:
            r0 = 262783563(0xfa9c24b, float:1.6739526E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NO9 r2 = (X.NO9) r2
            X.OJt r2 = r2.A00
            java.lang.Object r1 = r1.A01
            X.N5d r1 = (X.C68188N5d) r1
            java.lang.String r1 = r1.A01
            r2.A00(r1)
            r1 = 56562715(0x35f141b, float:6.555689E-37)
            goto L_0x003b
        L_0x009a:
            r0 = 2115585853(0x7e19473d, float:5.0935443E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            com.instagram.direct.visual.DirectVisualMessageViewerController r5 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r5
            X.O8k r2 = r5.A0u
            com.instagram.common.session.UserSession r2 = r2.A00
            X.0xa r6 = X.AnonymousClass7TE.A0q(r2)
            java.lang.String r3 = "camera_reply_tooltip_impression_count"
            r4 = 0
            int r2 = r6.getInt(r3, r4)
            int r2 = r2 + 3
            X.AnonymousClass7TG.A1M(r6, r3, r2)
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            android.graphics.RectF r12 = X.0nA.A0F(r1)
            X.28D r14 = X.28D.A2H
            com.instagram.common.session.UserSession r6 = r5.A0m
            X.JVm r1 = X.AnonymousClass9PJ.A00(r6)
            r7 = 1
            r1.A07(r14, r7)
            r5.A0U = r7
            X.3tI r16 = com.instagram.direct.visual.DirectVisualMessageViewerController.A01(r5)
            X.3sy r3 = r5.A0x
            boolean r1 = r3 instanceof com.instagram.model.direct.DirectThreadKey
            java.lang.String r9 = "Required value was null."
            r15 = 0
            if (r1 == 0) goto L_0x0186
            androidx.fragment.app.FragmentActivity r8 = r5.A0e
            X.2Ep r2 = r5.A0n
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A04(r3)
            if (r1 == 0) goto L_0x0183
            java.lang.String r1 = r1.A00
        L_0x00e8:
            r22 = 7
            if (r16 != 0) goto L_0x00ee
            r22 = 0
        L_0x00ee:
            r17 = r8
            r18 = r6
            r19 = r16
            r20 = r2
            r21 = r1
            com.instagram.model.direct.camera.DirectCameraViewModel r17 = X.C71046OaO.A01(r17, r18, r19, r20, r21, r22)
        L_0x00fc:
            X.N3h r1 = com.instagram.direct.visual.DirectVisualMessageViewerController.A02(r5)
            if (r1 == 0) goto L_0x0165
            boolean r1 = r1.A0Y
            r1 = r1 ^ 1
            if (r1 != r7) goto L_0x0165
            X.OW6 r8 = r5.A0G
            if (r8 == 0) goto L_0x0ec8
            X.1as r1 = X.1as.A04
            X.1aq r11 = r1.A01
            X.N3h r1 = r8.A00()
            java.lang.String r10 = r1.A0K
            X.N3h r1 = r8.A00()
            java.lang.String r7 = r1.A0G
            X.N3h r1 = r8.A00()
            boolean r2 = r1.A0X
            X.N3h r1 = r8.A00()
            java.lang.String r1 = r1.A0N
            X.1at r9 = X.C327657Br.A00()
            X.2FW r8 = X.2FW.A0q
            X.7Bu r8 = r9.A01(r8)
            java.lang.String r22 = r8.CFp()
            r23 = 0
            r13 = r12
            r21 = r1
            r24 = r2
            r25 = r4
            r26 = r4
            r19 = r10
            r20 = r7
            r18 = r3
            android.os.Bundle r2 = r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r7 = "direct_visual_reply_fragment"
        L_0x014d:
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r5.A0e
            X.6W8 r2 = X.AnonymousClass6W8.A02(r3, r2, r6, r1, r7)
            X.4mZ r1 = r5.A0w
            r2.A0E(r1)
            r2.A0C(r3)
            r3.overridePendingTransition(r4, r4)
            r1 = -117533762(0xfffffffff8fe93be, float:-4.13075E34)
            goto L_0x003b
        L_0x0165:
            android.os.Bundle r2 = X.C66582MXn.A0B(r17)
            X.0qQ.A0B(r12, r4)
            r1 = 24
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putParcelable(r1, r12)
            X.0qQ.A0B(r14, r4)
            X.C360908fL.A00(r14)
            java.lang.String r1 = "DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT"
            r2.putSerializable(r1, r14)
            java.lang.String r7 = "direct_quick_reply_camera_fragment"
            goto L_0x014d
        L_0x0183:
            r1 = 0
            goto L_0x00e8
        L_0x0186:
            X.OW6 r1 = r5.A0G
            if (r1 == 0) goto L_0x0ecd
            java.util.List r1 = r1.A04
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r1)
            com.instagram.user.model.User r1 = X.DbT.A0j(r6)
            r8.add(r1)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = X.C66647MaG.A06(r3)
            java.lang.String r1 = r5.A15
            com.instagram.model.direct.DirectShareTarget r1 = X.C70118NxY.A00(r6, r2, r1, r8)
            com.instagram.model.direct.camera.DirectCameraViewModel r17 = X.C71046OaO.A03(r6, r1)
            X.N3h r1 = com.instagram.direct.visual.DirectVisualMessageViewerController.A02(r5)
            if (r1 == 0) goto L_0x00fc
            com.instagram.common.typedurl.ImageUrl r15 = r1.A04
            goto L_0x00fc
        L_0x01af:
            r0 = 666014393(0x27b292b9, float:4.9564E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.OW6 r6 = (X.OW6) r6
            X.N3h r2 = r6.A00()
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r2 = r2.A00
            if (r2 == 0) goto L_0x01f7
            int r3 = r2.A00
            r2 = 2
            if (r3 != r2) goto L_0x01f7
            java.lang.Object r4 = r1.A02
            com.instagram.direct.visual.DirectVisualMessageViewerController r4 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r4
            X.N3h r2 = r6.A00()
            r4.A0F = r2
            java.util.HashSet r3 = r4.A17
            X.N3h r2 = r6.A00()
            java.lang.String r2 = r2.A0I
            r3.add(r2)
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r5 = r4.A0q
            X.N3h r2 = r6.A00()
            boolean r2 = r2.A0V
            if (r2 == 0) goto L_0x01f7
            if (r5 == 0) goto L_0x01f7
            com.instagram.common.session.UserSession r4 = r4.A0m
            X.N3h r2 = r6.A00()
            boolean r3 = r2.A02(r4)
            X.NmR r2 = X.C69483NmR.PHOTO_VIEWER
            X.C71137Odf.A05(r2, r4, r5, r3)
        L_0x01f7:
            java.lang.Object r2 = r1.A02
            com.instagram.direct.visual.DirectVisualMessageViewerController r2 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r2
            r1 = 2
            r2.A02 = r1
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0E(r2)
            r1 = -256862176(0xfffffffff0b09820, float:-4.3722616E29)
            goto L_0x003b
        L_0x0206:
            r0 = -649118520(0xffffffffd94f3cc8, float:-3.64575937E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.OIB r4 = new X.OIB
            r4.<init>()
            java.lang.Object r3 = r1.A02
            com.instagram.direct.visual.DirectVisualMessageViewerController r3 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r3
            androidx.fragment.app.FragmentActivity r2 = r3.A0e
            r4.A00 = r2
            com.instagram.common.session.UserSession r5 = r3.A0m
            r4.A03 = r5
            X.4mZ r2 = r3.A0w
            r4.A05 = r2
            X.4DH r2 = r3.A0f
            r4.A01 = r2
            X.28D r2 = X.28D.A4u
            r4.A02 = r2
            java.lang.Object r2 = r1.A01
            X.N3h r2 = (X.C68167N3h) r2
            java.lang.String r1 = r2.A0K
            r4.A09 = r1
            java.lang.String r1 = r2.A0M
            r4.A0B = r1
            java.lang.String r1 = r2.A0H
            r4.A08 = r1
            X.1iA r2 = r2.A0B
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r4.A06 = r2
            X.OV1 r1 = new X.OV1
            r1.<init>(r4)
            r1.A01()
            X.0iw r4 = r3.A0g
            java.lang.String r3 = "reaction_viewer_add_to_story"
            java.lang.String r2 = "tap"
            r1 = 977(0x3d1, float:1.369E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.C67000MgY.A01(r4, r5, r3, r2, r1)
            r1 = -584745827(0xffffffffdd257c9d, float:-7.4528616E17)
            goto L_0x003b
        L_0x025e:
            r0 = 672651480(0x2817d8d8, float:8.429204E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.O7E r2 = (X.O7E) r2
            java.lang.Object r5 = r1.A01
            com.instagram.save.model.SavedCollection r5 = (com.instagram.save.model.SavedCollection) r5
            X.1Y8 r4 = X.C55115HcO.A00()
            X.NId r3 = r2.A00
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r1 = r3.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            r4.A02(r2, r3, r1, r5)
            r1 = -1078020248(0xffffffffbfbeb768, float:-1.4899721)
            goto L_0x003b
        L_0x0285:
            r0 = 200401997(0xbf1e44d, float:9.317333E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pvm r2 = (X.C74492Pvm) r2
            java.lang.Object r1 = r1.A02
            X.N9q r1 = (X.C68303N9q) r1
            r2.Cvz(r1)
            r1 = -1427513930(0xffffffffaae9ddb6, float:-4.1542957E-13)
            goto L_0x003b
        L_0x029c:
            r0 = -1387952199(0xffffffffad4587b9, float:-1.122829E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pvm r2 = (X.C74492Pvm) r2
            java.lang.Object r1 = r1.A02
            X.N9q r1 = (X.C68303N9q) r1
            r2.DwP(r1)
            r1 = 2142836954(0x7fb918da, float:NaN)
            goto L_0x003b
        L_0x02b3:
            r0 = -1323123052(0xffffffffb122be94, float:-2.3682434E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pvm r2 = (X.C74492Pvm) r2
            java.lang.Object r1 = r1.A02
            X.N9q r1 = (X.C68303N9q) r1
            r2.DiG(r1)
            r1 = 1158738085(0x4510f0a5, float:2319.0403)
            goto L_0x003b
        L_0x02ca:
            r0 = -2083080981(0xffffffff83d6b4eb, float:-1.2619326E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pvm r2 = (X.C74492Pvm) r2
            java.lang.Object r1 = r1.A02
            X.N9q r1 = (X.C68303N9q) r1
            r2.DdO(r1)
            r1 = 275421781(0x106a9a55, float:4.6267256E-29)
            goto L_0x003b
        L_0x02e1:
            r0 = -1480749063(0xffffffffa7bd8ff9, float:-5.2614133E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pvm r2 = (X.C74492Pvm) r2
            java.lang.Object r1 = r1.A02
            X.N9q r1 = (X.C68303N9q) r1
            r2.DRW(r1)
            r1 = -515864386(0xffffffffe14088be, float:-2.2197676E20)
            goto L_0x003b
        L_0x02f8:
            r0 = -1888443014(0xffffffff8f70a57a, float:-1.1864783E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pvm r2 = (X.C74492Pvm) r2
            java.lang.Object r1 = r1.A02
            X.N9q r1 = (X.C68303N9q) r1
            r2.DwU(r1)
            r1 = 1113765618(0x4262b6f2, float:56.678658)
            goto L_0x003b
        L_0x030f:
            r0 = 390030014(0x173f62be, float:6.184006E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.MxZ r3 = (X.C67949MxZ) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.NKk r6 = r3.A01
            java.lang.Object r5 = r1.A01
            X.N5q r5 = (X.C68201N5q) r5
            X.8ab r4 = X.DbW.A0U(r6)
            r1 = 2131975281(0x7f135c71, float:1.958765E38)
            r4.A09(r1)
            java.lang.String r1 = r5.A02
            r4.A0q(r1)
            r3 = 2131975279(0x7f135c6f, float:1.9587646E38)
            r2 = 17
            X.Of1 r1 = new X.Of1
            r1.<init>(r2, r5, r6)
            r4.A0I(r1, r3)
            r3 = 2131975278(0x7f135c6e, float:1.9587644E38)
            r2 = 18
            X.Of1 r1 = new X.Of1
            r1.<init>(r2, r5, r6)
            r4.A0H(r1, r3)
            r3 = 2131975280(0x7f135c70, float:1.9587648E38)
            r2 = 19
            X.Of1 r1 = new X.Of1
            r1.<init>(r2, r5, r6)
            r4.A0G(r1, r3)
            r1 = 1
            X.AnonymousClass7TH.A0a(r4, r1)
            r1 = 957098398(0x390c299e, float:1.3366944E-4)
            goto L_0x003b
        L_0x0361:
            r0 = -1351603680(0xffffffffaf702a20, float:-2.1842839E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NON r2 = (X.NON) r2
            X.75e r2 = r2.A01
            java.lang.Object r1 = r1.A01
            X.N5U r1 = (X.N5U) r1
            X.77I r1 = r1.A00
            r2.D23(r1)
            r1 = 121278031(0x73a8e4f, float:1.4034905E-34)
            goto L_0x003b
        L_0x037c:
            r0 = -2138961345(0xffffffff80820a3f, float:-1.194229E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NO6 r2 = (X.NO6) r2
            X.75e r2 = r2.A00
            java.lang.Object r1 = r1.A01
            X.N5S r1 = (X.N5S) r1
            X.75i r1 = r1.A00
            r2.D23(r1)
            r1 = 1751803523(0x686a6683, float:4.427699E24)
            goto L_0x003b
        L_0x0397:
            r0 = 950413400(0x38a62858, float:7.9230114E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.PBO r2 = (X.PBO) r2
            X.P15 r5 = r2.A05
            java.lang.Object r1 = r1.A01
            X.PBm r1 = (X.C72581PBm) r1
            java.lang.String r6 = r1.A02
            java.lang.String r4 = r1.A03
            if (r6 == 0) goto L_0x03d5
            com.instagram.common.session.UserSession r7 = r5.A03
            int r13 = r5.A01
            r15 = 1
            java.lang.String r8 = r5.A06
            r9 = 0
            java.util.List r10 = r5.A07
            r11 = -2
            r12 = 0
            r14 = r12
            r16 = r12
            X.NKM r3 = X.C70139Nxt.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.7Pr r1 = X.DbX.A0e(r7, r15)
            X.7Pu r2 = r1.A00()
            X.PDj r1 = new X.PDj
            r1.<init>(r5, r2, r4, r6)
            r3.A01 = r1
            android.app.Activity r1 = r5.A02
            r2.A02(r1, r3)
        L_0x03d5:
            r1 = -866234763(0xffffffffcc5e4e75, float:-5.8276308E7)
            goto L_0x003b
        L_0x03da:
            r0 = 376255977(0x166d35e9, float:1.9161719E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r2 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r2
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r2.A03
            if (r2 == 0) goto L_0x03f4
            java.lang.Object r1 = r1.A02
            X.NOl r1 = (X.C68589NOl) r1
            X.PuS r1 = r1.A02
            if (r1 == 0) goto L_0x03f4
            r1.CqL(r2)
        L_0x03f4:
            r1 = 124552616(0x76c85a8, float:1.7793945E-34)
            goto L_0x003b
        L_0x03f9:
            r0 = 1944999518(0x73ee565e, float:3.7766064E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NOl r2 = (X.C68589NOl) r2
            X.PuS r2 = r2.A02
            if (r2 == 0) goto L_0x0411
            java.lang.Object r1 = r1.A01
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r1 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r1
            java.lang.String r1 = r1.A04
            r2.D38(r1)
        L_0x0411:
            r1 = -1016822325(0xffffffffc36485cb, float:-228.52263)
            goto L_0x003b
        L_0x0416:
            r0 = 1858995716(0x6ece0604, float:3.1880592E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r2 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r2
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r2.A03
            if (r2 == 0) goto L_0x0436
            java.lang.Object r1 = r1.A02
            X.NOM r1 = (X.NOM) r1
            X.O87 r1 = r1.A01
            if (r1 == 0) goto L_0x0436
            X.NK7 r1 = r1.A00
            X.PvE r1 = r1.A01
            if (r1 == 0) goto L_0x0436
            r1.CqL(r2)
        L_0x0436:
            r1 = 1387336808(0x52b11468, float:3.80275786E11)
            goto L_0x003b
        L_0x043b:
            r0 = -1743996984(0xffffffff980cb7c8, float:-1.8187362E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.OcD r6 = (X.C71091OcD) r6
            X.LNx r5 = r6.A0G
            if (r5 == 0) goto L_0x045c
            X.OEv r2 = r5.A00
            if (r2 == 0) goto L_0x0457
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r2.A01
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r2.A02
            boolean r2 = r2.A03
            X.C71081Ob0.A00(r4, r3, r2)
        L_0x0457:
            java.util.Queue r2 = r5.A02
            r2.clear()
        L_0x045c:
            java.lang.Object r1 = r1.A01
            X.Pvc r1 = (X.C74482Pvc) r1
            r1.D7W()
            X.OHy r1 = r6.A0J
            boolean r1 = r1.A07
            if (r1 == 0) goto L_0x0484
            com.instagram.common.session.UserSession r4 = r6.A0F
            r2 = 0
            X.0xa r1 = X.AnonymousClass7TE.A0q(r4)
            java.lang.String r3 = "direct_reactions_customize_nux_count"
            int r2 = r1.getInt(r3, r2)
            r1 = 3
            if (r2 >= r1) goto L_0x0484
            X.1Av r1 = X.1Au.A00(r4)
            int r2 = r2 + 1
            X.0xa r1 = r1.A01
            X.AnonymousClass7TG.A1M(r1, r3, r2)
        L_0x0484:
            r1 = 662304804(0x2779f824, float:3.469021E-15)
            goto L_0x003b
        L_0x0489:
            r0 = -767513133(0xffffffffd240add3, float:-2.06887502E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.OuB r4 = (X.C71979OuB) r4
            boolean r2 = r4.A09
            if (r2 == 0) goto L_0x04a9
            r2 = 3
            r7.performHapticFeedback(r2)
            java.lang.Object r3 = r1.A01
            X.Mtw r3 = (X.C67743Mtw) r3
            if (r3 == 0) goto L_0x04a9
            java.lang.String r2 = r4.A06
            boolean r1 = r4.A0D
            r3.A00(r2, r1)
        L_0x04a9:
            r1 = -455798461(0xffffffffe4d51143, float:-3.1443203E22)
            goto L_0x003b
        L_0x04ae:
            r0 = 261739464(0xf99d3c8, float:1.516854E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Mtw r2 = (X.C67743Mtw) r2
            if (r2 == 0) goto L_0x04cb
            java.lang.Object r1 = r1.A02
            X.OuB r1 = (X.C71979OuB) r1
            java.lang.String r3 = r1.A06
            X.05G r2 = r2.A07
            X.N8b r1 = new X.N8b
            r1.<init>(r3)
            r2.Epw(r1)
        L_0x04cb:
            r1 = -1904589486(0xffffffff8e7a4552, float:-3.0848256E-30)
            goto L_0x003b
        L_0x04d0:
            r0 = 2082058227(0x7c19aff3, float:3.1919604E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Mtw r2 = (X.C67743Mtw) r2
            if (r2 == 0) goto L_0x04eb
            java.lang.Object r3 = r1.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.05G r2 = r2.A07
            X.N8a r1 = new X.N8a
            r1.<init>(r3)
            r2.Epw(r1)
        L_0x04eb:
            r1 = 1711121460(0x65fda434, float:1.4972347E23)
            goto L_0x003b
        L_0x04f0:
            r0 = 1518791894(0x5a86ecd6, float:1.89890254E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Mtw r2 = (X.C67743Mtw) r2
            if (r2 == 0) goto L_0x050b
            java.lang.Object r3 = r1.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.05G r2 = r2.A07
            X.N8a r1 = new X.N8a
            r1.<init>(r3)
            r2.Epw(r1)
        L_0x050b:
            r1 = -1836390435(0xffffffff928ae7dd, float:-8.766183E-28)
            goto L_0x003b
        L_0x0510:
            r0 = 1578294074(0x5e12db3a, float:2.64552888E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.Object r5 = r1.A02
            X.NKp r5 = (X.C68496NKp) r5
            java.lang.String r3 = r5.A0A
            if (r3 != 0) goto L_0x052d
            java.lang.String r0 = "collectionId"
        L_0x0525:
            X.0qQ.A0F(r0)
        L_0x0528:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x052d:
            java.lang.String r2 = "collection_id"
            r6.putString(r2, r3)
            java.lang.String r3 = r5.A0C
            if (r3 != 0) goto L_0x0539
            java.lang.String r0 = "threadId"
            goto L_0x0525
        L_0x0539:
            java.lang.String r2 = "thread_id"
            r6.putString(r2, r3)
            java.lang.Object r1 = r1.A01
            X.N8g r1 = (X.C68269N8g) r1
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "card_gallery_collection_title"
            r6.putString(r1, r2)
            int r2 = r5.A00
            java.lang.String r1 = "direct_channel_audience_type"
            r6.putInt(r1, r2)
            com.instagram.model.direct.DirectThreadKey r1 = r5.A08
            java.lang.String r3 = "threadKey"
            if (r1 == 0) goto L_0x0599
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_V2_ID"
            r6.putString(r1, r2)
            java.lang.String r2 = r5.A0D
            if (r2 != 0) goto L_0x0564
            java.lang.String r0 = "userType"
            goto L_0x0525
        L_0x0564:
            java.lang.String r1 = "channel_user_type"
            r6.putString(r1, r2)
            java.lang.String r2 = "card_gallery_entry_point"
            java.lang.String r1 = "channel_daily_prompt_responses"
            r6.putString(r2, r1)
            com.instagram.model.direct.DirectThreadKey r2 = r5.A08
            if (r2 == 0) goto L_0x0599
            java.lang.String r1 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            X.C67002Mga.A01(r6, r2, r1)
            X.0eM r1 = r5.A0I
            X.0lg r4 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            java.lang.String r1 = "direct_daily_prompts_add_response"
            X.6W8 r2 = X.Dba.A0K(r2, r6, r4, r3, r1)
            r1 = 1
            r2.A00 = r1
            r1 = 0
            r2.A0H = r1
            X.DbT.A1M(r5, r2)
            r1 = -1425631641(0xffffffffab069667, float:-4.781509E-13)
            goto L_0x003b
        L_0x0599:
            X.0qQ.A0F(r3)
            goto L_0x0528
        L_0x059d:
            r0 = -1570721550(0xffffffffa260b0f2, float:-3.0451335E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NJL r2 = (X.NJL) r2
            java.lang.Object r4 = r1.A01
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            X.7H6 r1 = r2.A0A
            if (r1 != 0) goto L_0x05c9
            X.0eM r1 = r2.A0N
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r6 = r2.requireActivity()
            r10 = 0
            r8 = 0
            r9 = 120(0x78, float:1.68E-43)
            X.7H6 r5 = new X.7H6
            r11 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.A0A = r5
            r2.registerLifecycleListener(r5)
        L_0x05c9:
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r2.A09
            if (r8 == 0) goto L_0x0ed2
            r3 = 2
            X.P19 r1 = new X.P19
            r1.<init>(r8, r3)
            X.L4N r6 = new X.L4N
            r6.<init>(r1)
            X.7H6 r9 = r2.A0A
            if (r9 == 0) goto L_0x0645
            android.content.Context r3 = r2.requireContext()
            X.0eM r7 = r2.A0N
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            X.76d r1 = X.C3262776c.A00(r3, r1)
            r5 = 0
            X.77B r1 = r1.A02(r4, r5)
            java.util.List r20 = X.AnonymousClass7TE.A1I(r1)
            com.instagram.model.direct.DirectThreadKey r4 = r2.A0C
            if (r4 != 0) goto L_0x0601
            java.lang.String r0 = "threadKey"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0601:
            r11 = 0
            X.N3i r14 = X.C68168N3i.A00(r8)
            java.lang.String r3 = r6.A01
            android.content.res.Resources r6 = X.DbV.A05(r2)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            boolean r2 = X.AnonymousClass7K4.A01(r1)
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r2 == 0) goto L_0x061c
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x061c:
            float r24 = X.AnonymousClass7TE.A01(r6, r1)
            java.lang.Integer r17 = X.AnonymousClass05K.A0C
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl r10 = new com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl
            r10.<init>(r5, r5, r5)
            r28 = 1
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            r12 = r11
            r13 = r11
            r15 = r11
            r19 = r3
            r21 = r11
            r22 = r11
            r23 = r11
            r25 = r5
            r26 = r5
            r27 = r5
            r29 = r5
            r30 = r5
            r16 = r4
            r9.A0g(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0645:
            r1 = 1361450410(0x512615aa, float:4.4583002E10)
            goto L_0x003b
        L_0x064a:
            r0 = 929641386(0x376933aa, float:1.3899911E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r1.A02
            X.0lg r1 = (X.0lg) r1
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            X.NgW r1 = new X.NgW
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = 1678935887(0x6412874f, float:1.0811899E22)
            goto L_0x003b
        L_0x066d:
            r0 = -797014536(0xffffffffd07e85f8, float:-1.70807706E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r1.A02
            X.0lg r1 = (X.0lg) r1
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            X.NKf r1 = new X.NKf
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = -1114042254(0xffffffffbd991072, float:-0.0747384)
            goto L_0x003b
        L_0x0690:
            r0 = -1870998889(0xffffffff907ad297, float:-4.946604E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Mec r2 = (X.C66894Mec) r2
            X.7VW r3 = r2.A03
            java.lang.Object r1 = r1.A01
            X.7Oi r1 = (X.C330807Oi) r1
            com.instagram.direct.model.messaginguser.MessagingUser r2 = r1.A03
            java.lang.String r1 = "direct_thread_typing_indicator"
            r3.CqM(r2, r1)
            r1 = 1453980091(0x56a9f9bb, float:9.3445025E13)
            goto L_0x003b
        L_0x06ad:
            java.lang.Object r2 = r1.A01
            X.NQK r2 = (X.NQK) r2
            java.lang.Object r0 = r1.A02
            X.NYG r0 = (X.NYG) r0
            X.O6m r4 = r2.A00
            X.79c r1 = r0.A00
            java.lang.CharSequence r0 = r1.A04
            java.lang.String r3 = r0.toString()
            X.5FV r0 = r1.A00
            int r2 = r0.A00
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.OVb r0 = r4.A00
            X.7M7 r0 = r0.A0B
            X.7Hx r1 = r0.A01
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1.A00(r3, r0, r0, r2)
            return
        L_0x06d4:
            r0 = -713013401(0xffffffffd5804767, float:-1.76305199E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.NWu r4 = (X.C68784NWu) r4
            X.ONw r3 = r4.A02
            java.lang.String r2 = r4.A06
            r1 = 31
            X.PgO r1 = X.C66580MXl.A15(r4, r1)
            r3.A03(r2, r1)
            r1 = 136272562(0x81f5ab2, float:4.7953934E-34)
            goto L_0x003b
        L_0x06f1:
            r0 = 2114496142(0x7e08a68e, float:4.540995E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.NWu r4 = (X.C68784NWu) r4
            X.ONw r3 = r4.A02
            java.lang.String r2 = r4.A05
            r1 = 30
            X.PgO r1 = X.C66580MXl.A15(r4, r1)
            r3.A03(r2, r1)
            r1 = 1353301034(0x50a9bc2a, float:2.27814482E10)
            goto L_0x003b
        L_0x070e:
            r0 = 1544402938(0x5c0db7fa, float:1.59561024E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r2 = "☠️"
            r5.setText(r2)
            r2 = 0
            r5.setRotation(r2)
            java.lang.Object r1 = r1.A02
            android.animation.Animator r1 = (android.animation.Animator) r1
            r1.cancel()
            android.os.Handler r4 = X.AnonymousClass7TF.A0D()
            X.PW3 r3 = new X.PW3
            r3.<init>(r5)
            r1 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r3, r1)
            r1 = 1604008750(0x5f9b3b2e, float:2.237117E19)
            goto L_0x003b
        L_0x073c:
            java.lang.Object r5 = r1.A01
            X.OsD r5 = (X.C71870OsD) r5
            java.lang.Object r4 = r1.A02
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r4 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r4
            java.lang.Integer r3 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            if (r3 != r0) goto L_0x0773
            X.O7d r0 = r5.A0R
            X.NIE r0 = r0.A00
            r0.A08()
            X.Pvv r1 = r5.A0E
            if (r1 == 0) goto L_0x075f
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x075c
            r1.D9I()
        L_0x075c:
            r1.D9d()
        L_0x075f:
            r0 = 1
            r5.A0G = r0
        L_0x0762:
            X.Pvv r2 = r5.A0E
            if (r2 == 0) goto L_0x003e
            java.lang.String r0 = "bottom_bar"
            X.C71870OsD.A02(r4, r5, r0)
            boolean r1 = r5.A0a
            java.lang.String r0 = r4.A05
            r2.CI7(r3, r0, r1)
            return
        L_0x0773:
            X.C71870OsD.A03(r5)
            goto L_0x0762
        L_0x0777:
            r0 = -1116793638(0xffffffffbd6f14da, float:-0.058369495)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NO3 r2 = (X.NO3) r2
            X.7XQ r3 = r2.A00
            java.lang.Object r1 = r1.A01
            X.N88 r1 = (X.N88) r1
            X.MbG r2 = r1.A03
            boolean r1 = r1.A07
            r3.ATf(r2, r1)
            r1 = -1501774304(0xffffffffa67cbe20, float:-8.768773E-16)
            goto L_0x003b
        L_0x0794:
            r0 = -813437016(0xffffffffcf83efa8, float:-4.4270428E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NO3 r2 = (X.NO3) r2
            X.7XQ r2 = r2.A00
            java.lang.Object r1 = r1.A01
            X.N88 r1 = (X.N88) r1
            X.MbG r1 = r1.A03
            r2.AIF(r1)
            r1 = -1910060985(0xffffffff8e26c847, float:-2.055751E-30)
            goto L_0x003b
        L_0x07af:
            r0 = -688311163(0xffffffffd6f93485, float:-1.37001982E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NYK r4 = (X.NYK) r4
            java.lang.Object r1 = r1.A02
            X.PAo r1 = (X.C72557PAo) r1
            com.instagram.common.session.UserSession r3 = r1.A01
            X.0iw r2 = r1.A00
            X.7XR r1 = r1.A02
            X.7Wz r1 = (X.C332927Wz) r1
            X.C70015Nvt.A00(r2, r3, r4, r1)
            r1 = 1192033385(0x470cfc69, float:36092.41)
            goto L_0x003b
        L_0x07ce:
            r0 = -773257659(0xffffffffd1e90645, float:-1.25104071E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Pw7 r4 = (X.C74512Pw7) r4
            java.lang.Object r1 = r1.A02
            X.NWq r1 = (X.NWq) r1
            com.instagram.model.direct.DirectThreadKey r3 = r1.A01
            com.instagram.model.direct.DirectShareTarget r2 = r1.A00
            X.0qQ.A0A(r7)
            android.graphics.RectF r1 = X.0nA.A0F(r7)
            r4.Dg6(r1, r2, r3)
            r1 = 149043542(0x8e23956, float:1.361536E-33)
            goto L_0x003b
        L_0x07f0:
            r0 = -370377222(0xffffffffe9ec7dfa, float:-3.5737675E25)
            int r0 = X.DbX.A03(r7, r0)
            java.lang.Object r4 = r1.A01
            X.Pw7 r4 = (X.C74512Pw7) r4
            java.lang.Object r1 = r1.A02
            X.NWr r1 = (X.C68781NWr) r1
            X.3sy r3 = r1.A03
            com.instagram.model.direct.DirectShareTarget r2 = r1.A02
            android.graphics.RectF r1 = X.0nA.A0F(r7)
            r4.DgJ(r1, r2, r3)
            r1 = -918395780(0xffffffffc942647c, float:-796231.75)
            goto L_0x003b
        L_0x080f:
            r0 = 1500859570(0x59754cb2, float:4.31535604E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pw7 r2 = (X.C74512Pw7) r2
            java.lang.Object r1 = r1.A02
            X.NWp r1 = (X.C68780NWp) r1
            X.3sy r1 = r1.A00
            r2.Dg2(r1)
            r1 = -1781104071(0xffffffff95d68239, float:-8.6639367E-26)
            goto L_0x003b
        L_0x0828:
            r0 = 338621829(0x142ef585, float:8.833175E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Pw7 r2 = (X.C74512Pw7) r2
            java.lang.Object r1 = r1.A02
            X.NWp r1 = (X.C68780NWp) r1
            X.3sy r1 = r1.A00
            r2.DgL(r1)
            r1 = 1673729427(0x63c31593, float:7.1973394E21)
            goto L_0x003b
        L_0x0841:
            r0 = -404020324(0xffffffffe7eb239c, float:-2.220826E24)
            int r0 = X.DbX.A03(r7, r0)
            java.lang.Object r4 = r1.A01
            X.Pw7 r4 = (X.C74512Pw7) r4
            java.lang.Object r1 = r1.A02
            X.MbC r1 = (X.C66705MbC) r1
            X.3sy r3 = r1.A03
            com.instagram.model.direct.DirectShareTarget r2 = r1.A02
            android.graphics.RectF r1 = X.0nA.A0F(r7)
            r4.Dg6(r1, r2, r3)
            r1 = 2135887213(0x7f4f0d6d, float:2.752199E38)
            goto L_0x003b
        L_0x0860:
            r0 = -96624549(0xfffffffffa3da05b, float:-2.4614913E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Pw7 r3 = (X.C74512Pw7) r3
            java.lang.Object r1 = r1.A02
            X.MgB r1 = (X.C66977MgB) r1
            com.instagram.model.direct.DirectThreadKey r2 = r1.A00
            boolean r1 = r1.A01
            r3.Dg5(r2, r1)
            r1 = 1024427589(0x3d0f8645, float:0.03504016)
            goto L_0x003b
        L_0x087b:
            r0 = -1806009868(0xffffffff945a79f4, float:-1.1030238E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3
            boolean r2 = r3.isChecked()
            r2 = r2 ^ 1
            r3.setChecked(r2)
            java.lang.Object r1 = r1.A02
            X.Nph r1 = (X.C69659Nph) r1
            android.view.View$OnClickListener r1 = r1.A00
            r1.onClick(r7)
            r1 = 223221320(0xd4e1648, float:6.350547E-31)
            goto L_0x003b
        L_0x089d:
            r0 = 246828627(0xeb64e53, float:4.4941887E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NJf r2 = (X.C68467NJf) r2
            X.0eM r2 = r2.A0j
            X.60k r3 = X.C66582MXn.A0S(r2)
            X.Nmo r2 = X.C69506Nmo.A0c
            r3.A0B(r2)
            java.lang.Object r1 = r1.A01
            X.OLa r1 = (X.C70780OLa) r1
            r1.A00()
            r1 = 1605600594(0x5fb38552, float:2.5871671E19)
            goto L_0x003b
        L_0x08bf:
            r0 = 1506598737(0x59ccdf51, float:7.2083043E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NJf r2 = (X.C68467NJf) r2
            X.Pvt r2 = r2.A0P
            if (r2 == 0) goto L_0x08d9
            java.lang.Object r1 = r1.A01
            com.instagram.api.schemas.LocationNoteResponseInfo r1 = (com.instagram.api.schemas.LocationNoteResponseInfo) r1
            java.lang.String r1 = r1.BNk()
            r2.Cgc(r1)
        L_0x08d9:
            r1 = 2090453608(0x7c99ca68, float:6.3882136E36)
            goto L_0x003b
        L_0x08de:
            r0 = -1815054180(0xffffffff93d0789c, float:-5.262551E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.NJf r5 = (X.C68467NJf) r5
            X.37D r4 = X.DbX.A0i(r5)
            r5.A0W = r4
            if (r4 == 0) goto L_0x0901
            java.lang.Object r3 = r1.A01
            r1 = 2
            X.PQt r2 = new X.PQt
            r2.<init>(r1, r5, r3)
            r1 = r4
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0H = r2
            r4.A0B()
        L_0x0901:
            r1 = -839982069(0xffffffffcdeee40b, float:-5.00990304E8)
            goto L_0x003b
        L_0x0906:
            r0 = 102626557(0x61df4fd, float:2.9708407E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NJf r2 = (X.C68467NJf) r2
            X.OZy r2 = r2.A0O
            if (r2 == 0) goto L_0x091c
            java.lang.Object r1 = r1.A01
            com.instagram.api.schemas.TrackData r1 = (com.instagram.api.schemas.TrackData) r1
            r2.A02(r1)
        L_0x091c:
            r1 = -1848463828(0xffffffff91d2ae2c, float:-3.32395E-28)
            goto L_0x003b
        L_0x0921:
            r0 = 3524741(0x35c885, float:4.939214E-39)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NJf r2 = (X.C68467NJf) r2
            X.OZy r2 = r2.A0O
            if (r2 == 0) goto L_0x0937
            java.lang.Object r1 = r1.A01
            com.instagram.api.schemas.TrackData r1 = (com.instagram.api.schemas.TrackData) r1
            r2.A02(r1)
        L_0x0937:
            r1 = -1150837772(0xffffffffbb679bf4, float:-0.0035340758)
            goto L_0x003b
        L_0x093c:
            r0 = -110696332(0xfffffffff966e874, float:-7.4933937E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NJf r2 = (X.C68467NJf) r2
            X.OZy r2 = r2.A0O
            if (r2 == 0) goto L_0x0952
            java.lang.Object r1 = r1.A01
            X.N3C r1 = (X.N3C) r1
            r2.A04(r1)
        L_0x0952:
            r1 = -586443766(0xffffffffdd0b940a, float:-6.2860468E17)
            goto L_0x003b
        L_0x0957:
            r0 = 746570489(0x2c7fc2f9, float:3.6345911E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A02
            X.NJf r8 = (X.C68467NJf) r8
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r2 = r8.A0V
            if (r2 != 0) goto L_0x096a
            java.lang.String r0 = "avatarView"
            goto L_0x0a7c
        L_0x096a:
            X.0nA.A0N(r2)
            X.0eM r7 = r8.A0j
            X.0lg r6 = X.DbT.A0X(r7)
            r5 = 0
            X.0Tu r4 = X.DbS.A0J(r6, r5)
            r2 = 36320305039286491(0x810920000020db, double:3.0324453847497625E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x0995
            X.Pvt r2 = r8.A0P
            if (r2 == 0) goto L_0x0990
            java.lang.Object r1 = r1.A01
            X.NWf r1 = (X.C68770NWf) r1
            java.lang.String r1 = r1.A08
            r2.Cqj(r1)
        L_0x0990:
            r1 = -1326540463(0xffffffffb0ee9951, float:-1.7360354E-9)
            goto L_0x003b
        L_0x0995:
            X.0lg r3 = X.AnonymousClass7TF.A0L(r7, r5)
            r1 = 36324587121684652(0x810d05000030ac, double:3.0351533909009213E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x0990
            X.Pvt r1 = r8.A0P
            if (r1 == 0) goto L_0x0990
            r1.CpZ()
            goto L_0x0990
        L_0x09ac:
            r0 = 670093452(0x27f0d08c, float:6.683949E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.OZy r2 = (X.C71036OZy) r2
            java.lang.Object r1 = r1.A01
            X.N3C r1 = (X.N3C) r1
            r2.A04(r1)
            r1 = 2013361631(0x780175df, float:1.0503078E34)
            goto L_0x003b
        L_0x09c3:
            r0 = 1346747942(0x5045be26, float:1.32702925E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.OZy r2 = (X.C71036OZy) r2
            java.lang.Object r1 = r1.A01
            com.instagram.api.schemas.TrackData r1 = (com.instagram.api.schemas.TrackData) r1
            r2.A02(r1)
            r1 = -1211669767(0xffffffffb7c762f9, float:-2.3768736E-5)
            goto L_0x003b
        L_0x09da:
            r0 = -1503822897(0xffffffffa65d7bcf, float:-7.684257E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.NKL r4 = (X.NKL) r4
            X.4AD r6 = r4.A0J
            if (r6 == 0) goto L_0x0a2b
            java.lang.Object r3 = r1.A01
            X.NWb r3 = (X.C68766NWb) r3
            X.0eM r1 = r4.A0T
            java.lang.Object r2 = r1.getValue()
            X.MuG r2 = (X.C67760MuG) r2
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            X.0eM r1 = r4.A0S
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r3 = r3.A0D
            X.AnonymousClass7TG.A1O(r4, r3)
            X.05G r2 = r2.A05
            X.NWc r1 = X.C68767NWc.A00
            r2.Epw(r1)
            java.lang.String r1 = "0"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0a30
            java.lang.String r1 = "2"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0a30
            long r1 = java.lang.Long.parseLong(r3)
            r6.AOX(r1)
            X.60k r2 = X.C3018660j.A01(r4)
            X.Nmo r1 = X.C69506Nmo.A07
            r2.A0B(r1)
        L_0x0a2b:
            r1 = 648065333(0x26a0b135, float:1.1150262E-15)
            goto L_0x003b
        L_0x0a30:
            java.lang.String r2 = "note_not_uploaded"
            r1 = 2131957577(0x7f131749, float:1.9551742E38)
            X.C59689JTv.A0F(r5, r2, r1)
            goto L_0x0a2b
        L_0x0a39:
            r0 = 1703458820(0x6588b804, float:8.070454E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.NKL r3 = (X.NKL) r3
            X.0eM r2 = r3.A0S
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            java.lang.String r6 = "note_self_note_bottom_sheet"
            java.lang.Object r1 = r1.A01
            java.lang.String r7 = X.DbS.A0q(r1)
            r3 = 0
            r8 = 0
            r5 = r3
            X.C71110Ocp.A01(r2, r3, r4, r5, r6, r7, r8)
            r1 = 1357109776(0x50e3da10, float:3.05817518E10)
            goto L_0x003b
        L_0x0a61:
            r0 = -95060718(0xfffffffffa557d12, float:-2.7712399E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r14 = r1.A02
            X.NKE r14 = (X.NKE) r14
            X.0eM r2 = r14.A0R
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r13 = r14.requireActivity()
            X.4AD r2 = r14.A0D
            if (r2 != 0) goto L_0x0a84
            java.lang.String r0 = "notesViewModelListener"
        L_0x0a7c:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0a84:
            r3 = 0
            X.P3f r12 = new X.P3f
            r16 = r3
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            boolean r8 = r14.isAdded()
            java.lang.Object r5 = r1.A01
            X.4zZ r5 = (X.C279864zZ) r5
            X.Oe5 r2 = X.C71147Oe5.A00
            android.content.Context r1 = r14.requireContext()
            X.N5y r7 = r2.A08(r1, r5)
            r9 = 1
            r10 = 0
            r4 = r3
            r6 = r3
            r11 = r10
            X.OIR r1 = X.C71047OaP.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.DUW(r1)
            r1 = 1639415376(0x61b77e50, float:4.23107E20)
            goto L_0x003b
        L_0x0ab1:
            r0 = 613896972(0x2497530c, float:6.56265E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NKE r2 = (X.NKE) r2
            X.0eM r2 = r2.A0R
            X.60k r3 = X.C66582MXn.A0S(r2)
            X.Nmo r2 = X.C69506Nmo.A0c
            r3.A0B(r2)
            java.lang.Object r1 = r1.A01
            X.OLa r1 = (X.C70780OLa) r1
            r1.A00()
            r1 = 907143196(0x3611e81c, float:2.174179E-6)
            goto L_0x003b
        L_0x0ad3:
            r0 = -1983503217(0xffffffff89c6248f, float:-4.7701146E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NPr r2 = (X.C68621NPr) r2
            X.PuG r2 = r2.A01
            java.lang.Object r1 = r1.A01
            X.N5n r1 = (X.C68198N5n) r1
            com.instagram.user.model.User r1 = r1.A00
            r2.CoD(r1)
            r1 = -303781691(0xffffffffede4a8c5, float:-8.8458265E27)
            goto L_0x003b
        L_0x0aee:
            r0 = -792239153(0xffffffffd0c763cf, float:-2.67616563E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NPr r2 = (X.C68621NPr) r2
            X.PuG r2 = r2.A01
            java.lang.Object r1 = r1.A01
            X.N5n r1 = (X.C68198N5n) r1
            com.instagram.user.model.User r1 = r1.A00
            r2.FMo(r1)
            r1 = -166068785(0xfffffffff619fdcf, float:-7.808294E32)
            goto L_0x003b
        L_0x0b09:
            r0 = -1531869768(0xffffffffa4b185b8, float:-7.698804E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.P3i r2 = (X.C72369P3i) r2
            java.lang.Object r1 = r1.A01
            X.N5y r1 = (X.C68209N5y) r1
            com.instagram.user.model.User r1 = r1.A02
            java.lang.String r6 = r1.getId()
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            com.instagram.common.session.UserSession r5 = r2.A04
            X.6Yo r4 = X.DbS.A0M(r1, r5)
            X.1a0 r1 = X.C46447Df9.A03()
            X.1a1 r3 = r1.A01
            X.0iw r1 = r2.A03
            java.lang.String r2 = r1.getModuleName()
            java.lang.String r1 = "friend_map"
            X.Dfc r1 = X.C46548Dgp.A01(r5, r6, r1, r2)
            X.C46474Dfc.A03(r4, r5, r3, r1)
            r1 = 113573687(0x6c4ff37, float:7.410201E-35)
            goto L_0x003b
        L_0x0b40:
            r0 = 1216123392(0x487c9200, float:258632.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.P3i r6 = (X.C72369P3i) r6
            java.lang.Object r1 = r1.A01
            X.N5y r1 = (X.C68209N5y) r1
            com.instagram.user.model.User r5 = r1.A02
            androidx.fragment.app.FragmentActivity r2 = r6.A00
            X.8ab r4 = X.DbS.A0X(r2)
            r1 = 2131962731(0x7f132b6b, float:1.9562195E38)
            java.lang.String r1 = X.DbY.A0b(r2, r5, r1)
            r4.A05 = r1
            r1 = 2131962730(0x7f132b6a, float:1.9562193E38)
            r4.A08(r1)
            r3 = 2131962729(0x7f132b69, float:1.9562191E38)
            r1 = 11
            X.Of1 r2 = new X.Of1
            r2.<init>(r1, r5, r6)
            X.8ae r1 = X.C358278ae.RED
            r4.A0O(r2, r1, r3)
            r4.A05()
            X.DbT.A1V(r4)
            r1 = 1178199670(0x4639e676, float:11897.615)
            goto L_0x003b
        L_0x0b80:
            r0 = -1889692632(0xffffffff8f5d9428, float:-1.0924675E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.P3i r2 = (X.C72369P3i) r2
            java.lang.Object r1 = r1.A01
            X.N5y r1 = (X.C68209N5y) r1
            com.instagram.common.session.UserSession r5 = r2.A04
            androidx.fragment.app.FragmentActivity r3 = r2.A00
            X.0iw r4 = r2.A03
            long r1 = r1.A00
            java.lang.String r8 = java.lang.String.valueOf(r1)
            X.TpH r6 = X.C14068TpH.IG_FRIEND_MAP
            X.UzD r7 = X.C16677UzD.NOTE
            X.OcF r2 = X.ORV.A01(r3, r4, r5, r6, r7, r8)
            r1 = 0
            X.C71093OcF.A00(r1, r2)
            X.60k r2 = X.C3018660j.A01(r5)
            X.Nmo r1 = X.C69506Nmo.A0W
            r2.A0B(r1)
            r1 = 1119174915(0x42b54103, float:90.626976)
            goto L_0x003b
        L_0x0bb5:
            r0 = -1804393087(0xffffffff94732581, float:-1.2275761E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.P3i r2 = (X.C72369P3i) r2
            java.lang.Object r1 = r1.A01
            X.N5y r1 = (X.C68209N5y) r1
            com.instagram.user.model.User r7 = r1.A02
            X.1Z4 r3 = X.1Z4.A00
            androidx.fragment.app.FragmentActivity r4 = r2.A00
            com.instagram.common.session.UserSession r6 = r2.A04
            X.0iw r1 = r2.A03
            java.lang.String r9 = r1.getModuleName()
            r1 = 1
            X.Fnh r8 = new X.Fnh
            r8.<init>(r2, r1)
            java.lang.String r11 = r7.getUsername()
            r5 = 0
            r10 = r5
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -13576181(0xffffffffff30d80b, float:-2.3506589E38)
            goto L_0x003b
        L_0x0be6:
            r0 = 698763562(0x29a6492a, float:7.384573E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.P3i r3 = (X.C72369P3i) r3
            java.lang.Object r1 = r1.A01
            X.N5y r1 = (X.C68209N5y) r1
            com.instagram.user.model.User r1 = r1.A02
            java.lang.String r2 = r1.getId()
            com.instagram.common.session.UserSession r1 = r3.A04
            com.instagram.user.model.User r9 = X.DbV.A0j(r1, r2)
            if (r9 == 0) goto L_0x0c16
            androidx.fragment.app.FragmentActivity r4 = r3.A00
            X.0iw r7 = r3.A03
            r1 = 12
            X.Of1 r5 = new X.Of1
            r5.<init>(r1, r9, r3)
            r6 = 0
            r8 = r6
            X.FH6.A06(r4, r5, r6, r7, r8, r9)
            X.C72369P3i.A00(r3)
        L_0x0c16:
            r1 = 638540020(0x260f58f4, float:4.9733645E-16)
            goto L_0x003b
        L_0x0c1b:
            r0 = 45556372(0x2b72294, float:2.690928E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.NIn r2 = (X.C68449NIn) r2
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            X.C68449NIn.A0S(r2, r1)
            r1 = 1448527627(0x5656c70b, float:5.9037593E13)
            goto L_0x003b
        L_0x0c32:
            r0 = -903457784(0xffffffffca265408, float:-2725122.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r1 = 797189202(0x2f842452, float:2.4036467E-10)
            goto L_0x003b
        L_0x0c3e:
            r0 = -1069132790(0xffffffffc046540a, float:-3.0988793)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            com.instagram.direct.messagethread.voice.VoiceMessageControlsView r3 = (com.instagram.direct.messagethread.voice.VoiceMessageControlsView) r3
            X.OBm r2 = r3.A01
            boolean r0 = r2 instanceof X.C68889NaR
            if (r0 == 0) goto L_0x0c62
            X.NaS r0 = X.C68890NaS.A00
        L_0x0c51:
            r3.setTranscriptionState(r0)
            java.lang.Object r0 = r1.A01
            X.N3p r0 = (X.C68174N3p) r0
            java.lang.Object r0 = r0.A04
            X.DbS.A1U(r0)
        L_0x0c5d:
            r0 = -135233051(0xfffffffff7f081e5, float:-9.756139E33)
            goto L_0x0ec2
        L_0x0c62:
            boolean r0 = r2 instanceof X.C68888NaQ
            if (r0 == 0) goto L_0x0c69
            X.NaR r0 = X.C68889NaR.A00
            goto L_0x0c51
        L_0x0c69:
            boolean r0 = r2 instanceof X.C68890NaS
            if (r0 != 0) goto L_0x0c5d
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            r0 = -1273109100(0xffffffffb41de594, float:-1.4705284E-7)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0c78:
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r15 = X.DbV.A12(r0)
            int r0 = r15.length()
            if (r0 <= 0) goto L_0x0d50
            X.1as r17 = X.1as.A04
            com.instagram.common.session.UserSession r14 = r9.A0Q
            long r2 = r9.A00
            java.lang.Long r24 = java.lang.Long.valueOf(r2)
            java.lang.String r11 = r8.A0B
            java.lang.String r10 = r8.A09
            X.N3C r0 = r8.A07
            r5 = 0
            if (r0 == 0) goto L_0x0cd4
            java.lang.String r13 = ""
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r13)
            android.content.Context r3 = r9.A0N
            r2 = 2131967781(0x7f133f25, float:1.9572438E38)
            com.instagram.api.schemas.TrackData r0 = r0.A03
            r16 = r0
            java.lang.String r0 = r16.getTitle()
            if (r0 != 0) goto L_0x0cb0
            r0 = r13
        L_0x0cb0:
            java.lang.String r16 = r16.getDisplayArtist()
            if (r16 == 0) goto L_0x0cb8
            r13 = r16
        L_0x0cb8:
            java.lang.String r0 = X.DbV.A0u(r3, r0, r13, r2)
            r12.append(r0)
            int r0 = r11.length()
            if (r0 <= 0) goto L_0x0cce
            r0 = 10
            java.lang.String r0 = X.002.A0D(r11, r0)
            r12.append(r0)
        L_0x0cce:
            java.lang.String r3 = r12.toString()
            if (r3 != 0) goto L_0x0cd5
        L_0x0cd4:
            r3 = 0
        L_0x0cd5:
            android.content.Context r2 = r9.A0N
            r0 = 2131968544(0x7f134220, float:1.9573986E38)
            if (r3 != 0) goto L_0x0cdd
            r3 = r11
        L_0x0cdd:
            java.lang.String r2 = X.DbV.A0u(r2, r10, r3, r0)
            java.lang.String r0 = "\n"
            java.lang.String r28 = X.002.A0g(r2, r0, r15)
            X.0qQ.A07(r28)
            com.instagram.common.typedurl.ImageUrl r2 = r8.A04
            if (r2 == 0) goto L_0x0d59
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r2)
        L_0x0cf3:
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r2 = r8.A05
            if (r2 == 0) goto L_0x0d55
            java.lang.String r13 = r2.A08
            com.instagram.user.model.User r12 = r2.A01
            java.lang.String r3 = r2.A07
            com.instagram.common.typedurl.ImageUrl r1 = r2.A00
        L_0x0cff:
            X.1as r2 = X.1as.A04
            boolean r2 = r2.A0I(r14, r6)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r2)
            java.lang.String r2 = r8.A0E
            r25 = r15
            r26 = r11
            r27 = r10
            r29 = r13
            r30 = r3
            r31 = r2
            r19 = r1
            r20 = r6
            r21 = r0
            r22 = r12
            r18 = r14
            r17.A08(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.3t2 r0 = X.DbS.A0c(r6)
            boolean r0 = r0 instanceof X.C254773t1
            if (r0 == 0) goto L_0x0d4d
            X.7VU r10 = X.AnonymousClass7VT.A00(r14)
            X.3t2 r3 = X.DbS.A0c(r6)
            r0 = 30
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            X.3t1 r3 = (X.C254773t1) r3
            java.util.List r2 = X.DbW.A0m(r6)
            r1 = 21
            X.PqR r0 = new X.PqR
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r9)
            r10.A02(r3, r2, r0, r5)
        L_0x0d4d:
            X.C71126OdL.A01(r7, r9, r8)
        L_0x0d50:
            r0 = -1399698551(0xffffffffac924b89, float:-4.1579557E-12)
            goto L_0x0ec2
        L_0x0d55:
            r13 = r1
            r12 = r1
            r3 = r1
            goto L_0x0cff
        L_0x0d59:
            r0 = r1
            goto L_0x0cf3
        L_0x0d5b:
            r0 = 938212353(0x37ebfc01, float:2.8131532E-5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Otp r0 = (X.C71964Otp) r0
            X.47o r3 = r0.A00
            java.lang.Object r5 = r1.A02
            X.NOR r5 = (X.NOR) r5
            java.lang.Integer r0 = r3.BXU()
            int r9 = X.DbX.A01(r0)
            java.lang.Integer r0 = r3.C6b()
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x0dd8
            int r0 = r0.intValue()
            boolean r0 = X.AnonymousClass48O.A01(r0)
            if (r0 == 0) goto L_0x0d96
            r1 = 250(0xfa, float:3.5E-43)
            if (r9 < r1) goto L_0x0d96
            X.PvG r0 = r5.A01
            r0.DH9(r1)
        L_0x0d8f:
            r0 = -921102742(0xffffffffc919166a, float:-627046.6)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0d96:
            java.lang.Integer r0 = r3.C6b()
            r1 = 29
            if (r0 == 0) goto L_0x0dce
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0dce
            X.47m r0 = r3.AsV()
            if (r0 == 0) goto L_0x0dd0
            int r11 = r0.AdN()
        L_0x0dae:
            X.PvG r5 = r5.A01
            java.lang.String r7 = r3.C6E()
            java.lang.String r8 = r3.getTitle()
            java.lang.String r0 = r3.B9z()
            com.instagram.common.typedurl.SimpleImageUrl r6 = X.DbS.A0V(r0)
            java.lang.Integer r0 = r3.C6b()
            if (r0 == 0) goto L_0x0de0
            int r10 = r0.intValue()
            r5.DrG(r6, r7, r8, r9, r10, r11)
            goto L_0x0d8f
        L_0x0dce:
            r11 = 0
            goto L_0x0dae
        L_0x0dd0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r4)
            r0 = 1036202252(0x3dc3310c, float:0.09530839)
            goto L_0x0de7
        L_0x0dd8:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r4)
            r0 = 1306711903(0x4de2d75f, float:4.75720672E8)
            goto L_0x0de7
        L_0x0de0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r4)
            r0 = 1642064704(0x61dfeb40, float:5.1632193E20)
        L_0x0de7:
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x0deb:
            r0 = 1803073753(0x6b78b8d9, float:3.0068652E26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.NWb r8 = (X.C68766NWb) r8
            java.lang.Boolean r0 = r8.A0B
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            java.lang.Object r5 = r1.A02
            X.NKL r5 = (X.NKL) r5
            if (r0 == 0) goto L_0x0e38
            X.OBe r2 = r5.A0K
            if (r2 == 0) goto L_0x0e2d
            X.OIR r0 = r2.A00
            X.4zZ r6 = r0.A03
            if (r6 == 0) goto L_0x0e2d
            java.lang.String r1 = r6.A0H
            java.lang.String r0 = "2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0e2d
            X.P3h r0 = r2.A01
            X.0iw r3 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A02
            X.OYl r1 = new X.OYl
            r1.<init>(r2, r6, r3, r0)
            X.0eM r0 = r1.A04
            X.G9w.A1Y(r0)
            r0 = 0
            X.C71013OYl.A01(r1, r0)
        L_0x0e2d:
            X.DbX.A1J(r5)
        L_0x0e30:
            X.DbX.A1J(r5)
            r0 = -946410449(0xffffffffc796ec2f, float:-77272.37)
            goto L_0x0ec2
        L_0x0e38:
            X.OIR r7 = r5.A0I
            if (r7 == 0) goto L_0x0e30
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            X.0eM r0 = r5.A0S
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r8.A0D
            X.AnonymousClass7TF.A1C(r6, r2, r1)
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0e5c
            java.lang.String r1 = "note_not_uploaded"
            r0 = 2131972160(0x7f135040, float:1.958132E38)
            X.C59689JTv.A0F(r3, r1, r0)
            goto L_0x0e30
        L_0x0e5c:
            X.N5y r9 = r7.A05
            boolean r2 = r7.A0D
            r14 = r2 ^ 1
            java.lang.String r10 = r7.A09
            java.lang.String r11 = r7.A0A
            boolean r1 = r7.A0F
            java.lang.String r12 = r7.A07
            java.lang.String r13 = r7.A08
            boolean r0 = r7.A0B
            r7 = 0
            r8 = r7
            r15 = r1
            r16 = r2
            r17 = r0
            X.OIR r1 = X.C71047OaP.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.P3c r0 = new X.P3c
            r0.<init>(r6, r3)
            r0.DUZ(r1)
            goto L_0x0e30
        L_0x0e82:
            r0 = 1579343240(0x5e22dd88, float:2.93392143E18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.61R r0 = (X.AnonymousClass61R) r0
            if (r0 == 0) goto L_0x0e92
            r0.E2p()
        L_0x0e92:
            java.lang.Object r6 = r1.A02
            X.NIn r6 = (X.C68449NIn) r6
            X.MuH r5 = X.C68449NIn.A02(r6)
            X.05G r3 = r5.A0B
            java.util.List r2 = r5.A08
            if (r2 == 0) goto L_0x0ec6
            int r1 = r5.A00
            int r0 = r1 + 1
            r5.A00 = r0
            int r0 = r5.A0L
            int r1 = r1 % r0
            java.lang.Object r0 = r2.get(r1)
        L_0x0ead:
            r3.Epw(r0)
            X.0eM r0 = r6.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.60k r1 = X.C3018660j.A01(r0)
            X.Nmo r0 = X.C69506Nmo.A0N
            r1.A0C(r0)
            r0 = -99087727(0xfffffffffa180a91, float:-1.9736086E35)
        L_0x0ec2:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0ec6:
            r0 = 0
            goto L_0x0ead
        L_0x0ec8:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r9)
            throw r1
        L_0x0ecd:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r9)
            throw r1
        L_0x0ed2:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71408Ok7.onClick(android.view.View):void");
    }

    public C71408Ok7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public C71408Ok7(C71979OuB ouB, C67743Mtw mtw, int i) {
        this.A00 = i;
        if (47 - i != 0) {
            this.A02 = ouB;
            this.A01 = mtw;
        } else {
            this.A01 = mtw;
            this.A02 = ouB;
        }
    }

    public C71408Ok7(NKL nkl, C68766NWb nWb, int i) {
        this.A00 = i;
        if (12 - i != 0) {
            this.A02 = nkl;
            this.A01 = nWb;
        } else {
            this.A01 = nWb;
            this.A02 = nkl;
        }
    }
}
