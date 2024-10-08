package X;

import android.app.Activity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.88A  reason: invalid class name */
public final class AnonymousClass88A {
    public Medium A00;
    public C378299Pg A01;
    public final Activity A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C378249Pb A05;
    public final DirectCameraViewModel A06;
    public final C3499582p A07;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass88A(android.app.Activity r12, X.AnonymousClass4DH r13, X.AnonymousClass0iw r14, com.instagram.common.session.UserSession r15, X.C3499582p r16, X.C378249Pb r17, com.instagram.model.direct.camera.DirectCameraViewModel r18, java.lang.String r19) {
        /*
            r11 = this;
            r3 = r19
            r0 = 1
            X.0qQ.A0B(r15, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            r8 = 3
            X.0qQ.A0B(r13, r8)
            r0 = 8
            X.0qQ.A0B(r14, r0)
            r11.<init>()
            r11.A04 = r15
            r11.A02 = r12
            r11.A03 = r13
            r0 = r16
            r11.A07 = r0
            r4 = r18
            r11.A06 = r4
            r5 = r17
            r11.A05 = r5
            java.lang.String r6 = r4.A00()
            android.view.View r2 = r5.A05
            if (r6 == 0) goto L_0x0049
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0049
            int r0 = r4.A00
            if (r0 == r8) goto L_0x0049
            if (r2 == 0) goto L_0x0049
            X.3NG r1 = new X.3NG
            r1.<init>(r2)
            X.9kQ r0 = new X.9kQ
            r0.<init>(r11, r6)
            r1.A04 = r0
            r1.A00()
        L_0x0049:
            X.3oV r0 = r5.A0H
            android.view.View r0 = r0.getView()
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.9Pc r0 = new X.9Pc
            r0.<init>(r11)
            r1.A04 = r0
            r1.A00()
            android.view.View r0 = r5.A0G
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.9Pe r0 = new X.9Pe
            r0.<init>(r11)
            r1.A04 = r0
            r1.A00()
            android.view.View r0 = r5.A0E
            X.3NG r1 = new X.3NG
            r1.<init>(r0)
            X.9Pd r0 = new X.9Pd
            r0.<init>(r11)
            r1.A04 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A05 = r0
            r1.A00()
            android.widget.TextView r6 = r5.A08
            java.lang.String r1 = "Required value was null."
            if (r6 == 0) goto L_0x00fd
            android.content.res.Resources r10 = r6.getResources()
            java.lang.String r0 = r4.A06
            java.lang.String r9 = ""
            if (r0 != 0) goto L_0x0095
            r0 = r9
        L_0x0095:
            int r7 = r4.A00
            r2 = 0
            switch(r7) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00a7;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a3;
                case 8: goto L_0x00ab;
                case 9: goto L_0x00b6;
                default: goto L_0x009b;
            }
        L_0x009b:
            java.lang.String r1 = "Illegal direct camera state"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r1 = 2131960714(0x7f13238a, float:1.9558104E38)
            goto L_0x00ae
        L_0x00a7:
            r1 = 2131960118(0x7f132136, float:1.9556896E38)
            goto L_0x00ae
        L_0x00ab:
            r1 = 2131959731(0x7f131fb3, float:1.955611E38)
        L_0x00ae:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r10.getString(r1, r0)
        L_0x00b6:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r2)
            X.0qQ.A0A(r0)
            r6.setText(r0)
            if (r7 == r8) goto L_0x00c6
            r0 = 9
            if (r7 != r0) goto L_0x00f9
        L_0x00c6:
            r0 = 2132018632(0x7f1405c8, float:1.9675576E38)
            r6.setTextAppearance(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r0 = X.2Yu.A0H(r12, r0)
            int r0 = r1.getColor(r0)
            r6.setTextColor(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r6.setPadding(r2, r0, r2, r2)
            android.widget.TextView r0 = r5.A07
            if (r0 == 0) goto L_0x00f9
            r0.setVisibility(r2)
            if (r19 != 0) goto L_0x00f6
            r3 = r9
        L_0x00f6:
            r0.setText(r3)
        L_0x00f9:
            r5.A00(r14, r4)
            return
        L_0x00fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88A.<init>(android.app.Activity, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.82p, X.9Pb, com.instagram.model.direct.camera.DirectCameraViewModel, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0483, code lost:
        r0 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r2.A08 == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (r4 != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass88A r33) {
        /*
            r3 = r33
            X.82p r0 = r3.A07
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Yz r1 = r0.A0X
            java.lang.String r7 = "Required value was null."
            if (r1 == 0) goto L_0x057e
            r4 = 1
            X.8aL r0 = X.C358088aL.A0o
            r6 = 0
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            com.instagram.model.direct.camera.DirectCameraViewModel r5 = r3.A06
            if (r0 == 0) goto L_0x0028
            com.instagram.model.direct.DirectShareTarget r1 = r5.A03
            if (r1 != 0) goto L_0x04d6
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0028:
            int r2 = r5.A00
            switch(r2) {
                case 0: goto L_0x0036;
                case 1: goto L_0x037c;
                case 2: goto L_0x04f8;
                case 3: goto L_0x03ac;
                case 4: goto L_0x0036;
                case 5: goto L_0x0036;
                case 6: goto L_0x03b6;
                case 7: goto L_0x0036;
                case 8: goto L_0x0036;
                case 9: goto L_0x04f8;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.String r2 = "DirectCameraControlsViewHolder"
            java.lang.String r1 = "Invalid direct camera type"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            return
        L_0x0036:
            X.9Pg r1 = r3.A01
            if (r1 == 0) goto L_0x04f7
            com.instagram.model.direct.DirectShareTarget r0 = r5.A03
            r9 = 8
            if (r2 == r9) goto L_0x0041
            r4 = 0
        L_0x0041:
            X.8QA r7 = r1.A01
            r7.A0D(r6)
            X.80D r5 = r1.A06
            com.instagram.model.direct.camera.DirectCameraViewModel r2 = r5.A1I
            if (r2 == 0) goto L_0x0052
            boolean r2 = r2.A08
            r25 = 1
            if (r2 != 0) goto L_0x0054
        L_0x0052:
            r25 = 0
        L_0x0054:
            r0.getClass()
            boolean r2 = r0.A0S()
            if (r2 == 0) goto L_0x0084
            if (r25 == 0) goto L_0x0084
            X.3t2 r2 = r0.A09
            r2.getClass()
            boolean r2 = r2 instanceof X.AnonymousClass9HR
            if (r2 == 0) goto L_0x0084
            java.util.List r2 = r0.A0Q
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.Object r3 = r2.get(r6)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r3 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r3
            java.util.List r0 = r0.A0Q
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.5gg r2 = new X.5gg
            r2.<init>(r0)
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>((X.C254783t2) r2, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r3)
        L_0x0084:
            X.82p r2 = r1.A05
            X.82o r2 = r2.A02
            X.8nd r2 = r2.A01()
            X.8pU r13 = r7.A04()
            int r3 = r2.ordinal()
            if (r3 == r6) goto L_0x023b
            r2 = 1
            if (r3 != r2) goto L_0x0374
            java.lang.String r8 = r5.A2q
            java.lang.String r2 = "story_selfie_reply"
            boolean r3 = r2.equals(r8)
            if (r3 != 0) goto L_0x00ab
            X.8LU r2 = r1.A04
            X.88F r2 = r2.A0z
            if (r2 == 0) goto L_0x0238
            java.lang.String r8 = r2.A0P
        L_0x00ab:
            if (r3 == 0) goto L_0x022b
            java.lang.String r7 = r5.A2l
        L_0x00af:
            com.instagram.model.direct.camera.DirectCameraViewModel r2 = r5.A1I
            r15 = 0
            if (r2 == 0) goto L_0x0228
            java.lang.String r3 = r2.A05
        L_0x00b6:
            java.lang.String r2 = r5.A2P
            X.8BA r10 = r1.A03
            java.lang.String r19 = r10.A0T()
            java.lang.String r22 = r10.A0S()
            java.lang.String r26 = X.HZX.A00()
            X.9cJ r18 = new X.9cJ
            r21 = r7
            r23 = r3
            r24 = r2
            r20 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            com.instagram.model.direct.camera.DirectCameraViewModel r2 = r5.A1I
            r2.getClass()
            int r2 = r2.A00
            if (r2 != r9) goto L_0x021f
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            X.LD4 r2 = new X.LD4
            r2.<init>(r0, r15, r3)
        L_0x00e3:
            X.3t2 r3 = r0.A09
            r3.getClass()
            boolean r3 = r3 instanceof X.AnonymousClass9HR
            if (r3 != 0) goto L_0x01eb
            boolean r3 = r5.A48
            if (r3 != 0) goto L_0x01eb
            X.8LU r3 = r1.A04
            java.lang.Integer r19 = X.AnonymousClass05K.A0C
            r16 = r3
            r17 = r2
            r20 = r15
            r21 = r15
            r22 = r4
            r16.A0P(r17, r18, r19, r20, r21, r22)
        L_0x0101:
            if (r4 == 0) goto L_0x011a
        L_0x0103:
            com.instagram.common.session.UserSession r2 = r5.A0S
            X.OYk r7 = X.C63234Ktf.A00(r2)
            java.util.List r4 = java.util.Collections.singletonList(r13)
            X.0qQ.A0B(r4, r6)
            r3 = 31
            X.Plq r2 = new X.Plq
            r2.<init>(r3, r7, r4)
            X.C71012OYk.A01(r7, r2)
        L_0x011a:
            X.8BA r2 = r1.A03
            X.8CT r8 = r2.A1A
            if (r8 == 0) goto L_0x015b
            boolean r3 = r2.A21
            if (r3 == 0) goto L_0x015b
            X.80D r3 = r2.A18
            boolean r3 = r3.A3x
            if (r3 != 0) goto L_0x015b
            com.instagram.common.session.UserSession r4 = r2.A0v
            java.lang.String r7 = r0.A08()
            X.8ph r0 = r8.A04
            if (r0 == 0) goto L_0x0138
            X.8Bf r0 = r0.A00
            r8.A02 = r0
        L_0x0138:
            X.8Bf r3 = r8.A02
            r0 = 2
            X.0qQ.A0B(r3, r0)
            if (r7 == 0) goto L_0x015b
            X.0qQ.A0A(r4)
            X.1Av r0 = X.1Au.A00(r4)
            java.lang.String r4 = r3.A00
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "direct_thread_saved_view_mode_"
            java.lang.String r0 = X.002.A0R(r0, r7)
            r3.E5g(r0, r4)
            r3.apply()
        L_0x015b:
            X.82o r4 = r2.A14
            boolean r0 = r4.A0H()
            java.lang.String r3 = "media_type"
            if (r0 == 0) goto L_0x019f
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.lang.String r0 = r2.A0S()
            if (r0 == 0) goto L_0x017d
            java.lang.String r7 = r2.A0S()
            r0 = 1769(0x6e9, float:2.479E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r14.put(r0, r7)
        L_0x017d:
            X.8nd r0 = r4.A01()
            java.lang.String r0 = r0.A01
            r14.put(r3, r0)
            com.instagram.common.session.UserSession r8 = r2.A0v
            X.0iw r7 = r2.A0u
            X.80D r0 = r2.A18
            java.lang.String r13 = r0.A2l
            java.lang.String r10 = "remix_reply_send"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "remix_reply_post_capture"
            X.0qQ.A0B(r8, r6)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r9 = 0
            X.C67000MgY.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x019f:
            X.82Y r0 = r4.A01
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x01e1
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            X.8nd r0 = r4.A01()
            java.lang.String r0 = r0.A01
            r14.put(r3, r0)
            X.85o r0 = r2.A11
            java.lang.Integer r4 = r0.A01()
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r0 = 0
            if (r4 == r3) goto L_0x01bf
            r0 = 1
        L_0x01bf:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "video_audio_muted"
            r14.put(r0, r3)
            com.instagram.common.session.UserSession r8 = r2.A0v
            X.0iw r7 = r2.A0u
            X.80D r0 = r2.A18
            java.lang.String r13 = r0.A2l
            java.lang.String r10 = "selfie_reply_send"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "selfie_reply_post_capture"
            X.0qQ.A0B(r8, r6)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r9 = 0
            X.C67000MgY.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x01e1:
            boolean r0 = r5.A48
            if (r0 == 0) goto L_0x036e
            android.view.View r0 = r1.A00
            r0.setVisibility(r6)
            return
        L_0x01eb:
            X.8LU r14 = r1.A04
            boolean r24 = r10.A0q()
            X.3Q2 r7 = r14.A0D
            r7.getClass()
            X.82p r3 = r14.A0k
            X.82o r3 = r3.A02
            X.82Y r3 = r3.A01
            X.7zv r21 = r3.A04()
            X.8BA r3 = r14.A0f
            X.6if r3 = r3.A1g
            java.lang.Object r3 = r3.get()
            X.8ME r3 = (X.AnonymousClass8ME) r3
            java.util.LinkedHashMap r22 = r3.A1B()
            X.1GK r16 = X.AnonymousClass8LU.A00(r14)
            r19 = r15
            r23 = r4
            r20 = r7
            r17 = r2
            r14.A0M(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0101
        L_0x021f:
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            X.LD4 r2 = new X.LD4
            r2.<init>(r0, r15, r3)
            goto L_0x00e3
        L_0x0228:
            r3 = r15
            goto L_0x00b6
        L_0x022b:
            X.8LU r2 = r1.A04
            X.88F r2 = r2.A0z
            if (r2 == 0) goto L_0x0235
            java.lang.String r7 = r2.A0Q
            goto L_0x00af
        L_0x0235:
            r7 = 0
            goto L_0x00af
        L_0x0238:
            r8 = 0
            goto L_0x00ab
        L_0x023b:
            X.8K4 r14 = r1.A02
            boolean r10 = r5.A48
            X.8BA r9 = r14.A0G
            java.lang.String r16 = r9.A0T()
            X.88F r3 = r14.A0Y
            if (r3 == 0) goto L_0x02be
            java.lang.String r11 = r3.A0P
        L_0x024b:
            if (r3 == 0) goto L_0x02b5
            java.lang.String r7 = r3.A0Q
        L_0x024f:
            boolean r12 = r14.A0m
            java.lang.String r19 = r9.A0S()
            java.lang.String r3 = r14.A0f
            java.lang.String r2 = r14.A0e
            java.lang.String r23 = X.HZX.A00()
            X.9cJ r8 = new X.9cJ
            r20 = r3
            r21 = r2
            r22 = r12
            r17 = r11
            r18 = r7
            r15 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            r15 = 0
            X.LD4 r7 = new X.LD4
            r7.<init>(r0, r15, r2)
            if (r4 == 0) goto L_0x02c7
            boolean r2 = r9.A0q()
            if (r2 != 0) goto L_0x02c7
            com.instagram.common.session.UserSession r11 = r14.A0D
            X.0qQ.A0B(r11, r6)
            X.0Tu r12 = X.0Tu.A05
            r2 = 36323625049533764(0x810c2500082d44, double:3.034544972598746E-306)
            boolean r2 = X.182.A06(r12, r11, r2)
            if (r2 == 0) goto L_0x02c7
            X.1pL r16 = X.C66551pM.A00()
            X.82p r2 = r14.A0I
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            X.8Cl r23 = r2.A03()
            r23.getClass()
            X.8K7 r2 = r14.A0P
            r17 = r15
            r18 = r11
            r19 = r2
            r20 = r7
            r21 = r8
            r22 = r15
            r24 = r6
            r16.EMF(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0103
        L_0x02b5:
            boolean r2 = r14.A0o
            if (r2 == 0) goto L_0x02bc
            java.lang.String r7 = r14.A0g
            goto L_0x024f
        L_0x02bc:
            r7 = 0
            goto L_0x024f
        L_0x02be:
            boolean r2 = r14.A0o
            if (r2 == 0) goto L_0x02c5
            java.lang.String r11 = r14.A0h
            goto L_0x024b
        L_0x02c5:
            r11 = 0
            goto L_0x024b
        L_0x02c7:
            X.3t2 r2 = r0.A09
            r2.getClass()
            boolean r2 = r2 instanceof X.AnonymousClass9HR
            if (r2 != 0) goto L_0x02d4
            if (r10 == 0) goto L_0x034c
            if (r4 == 0) goto L_0x034c
        L_0x02d4:
            X.AnonymousClass8K4.A06(r14)
            X.87h r3 = r14.A0T
            X.8Kj r2 = r14.A0Z
            X.8PW r20 = X.AnonymousClass8MD.A00(r9, r2, r3, r6)
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r2 = "[lrpgd] renderAndSend"
            r3.println(r2)
            X.8lx r26 = r14.A0G()
            X.82p r2 = r14.A0I
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            X.8Cl r9 = r2.A03()
            r9.getClass()
            X.Aax r28 = new X.Aax
            r16 = r28
            r17 = r14
            r18 = r26
            r19 = r7
            r21 = r8
            r22 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.Aaz r2 = new X.Aaz
            r2.<init>(r14, r7, r8, r9)
            X.8Ji r3 = r14.A0F
            X.81C r3 = r3.A00
            X.81E r3 = r3.A00()
            X.8Jj r3 = (X.C353838Jj) r3
            r22 = 1
            r21 = -1
            r19 = 1065353216(0x3f800000, float:1.0)
            r16 = r15
            r17 = r15
            r18 = r15
            r20 = r19
            r23 = r22
            r24 = r6
            r25 = r22
            r15 = r3
            android.graphics.Bitmap r24 = r15.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.Aar r3 = new X.Aar
            r3.<init>(r14, r7, r8)
            android.app.Activity r7 = r14.A0A
            boolean r32 = X.C305756Jk.A00(r7)
            r25 = r14
            r27 = r3
            r29 = r2
            r30 = r9
            r31 = r6
            r33 = r22
            X.AnonymousClass8K4.A04(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0101
        L_0x034c:
            X.82p r2 = r14.A0I
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            r2.A03()
            java.lang.Integer r20 = X.AnonymousClass05K.A0C
            r18 = r15
            r19 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r4
            r25 = r6
            r17 = r8
            r16 = r7
            r14.A0J(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0101
        L_0x036e:
            boolean r0 = r5.A3K
            if (r0 != 0) goto L_0x04f7
            goto L_0x0483
        L_0x0374:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x037c:
            X.9Pg r3 = r3.A01
            if (r3 == 0) goto L_0x04f7
            com.instagram.model.direct.DirectShareTarget r2 = r5.A03
            X.82p r0 = r3.A05
            X.82o r0 = r0.A02
            X.8nd r1 = r0.A01()
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x03a4
            X.8LU r7 = r3.A04
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            r2.getClass()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r9 = 0
            X.LD4 r8 = new X.LD4
            r8.<init>(r2, r9, r0)
            r11 = r9
            r12 = r9
            r13 = r6
            r7.A0P(r8, r9, r10, r11, r12, r13)
            return
        L_0x03a4:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x03ac:
            com.instagram.model.direct.DirectShareTarget r1 = r5.A03
            if (r1 != 0) goto L_0x04d6
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x03b6:
            X.9Pg r1 = r3.A01
            if (r1 == 0) goto L_0x04f7
            com.instagram.model.direct.DirectShareTarget r7 = r5.A03
            X.8QA r0 = r1.A01
            r0.A0D(r6)
            r7.getClass()
            X.3t2 r0 = r7.A09
            r0.getClass()
            boolean r0 = r0 instanceof X.AnonymousClass9HR
            if (r0 != 0) goto L_0x04f7
            X.80D r0 = r1.A06
            java.lang.String r13 = r0.A2h
            com.instagram.common.session.UserSession r0 = r0.A0S
            X.2Dm r0 = X.1bJ.A00(r0)
            r0.BYf(r7)
            X.82p r0 = r1.A05
            X.82o r0 = r0.A02
            X.8nd r0 = r0.A01()
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0491
            if (r0 != r4) goto L_0x056e
            X.8LU r0 = r1.A04
            com.instagram.pendingmedia.model.constants.ShareType r5 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r3 = 0
            X.LD4 r2 = new X.LD4
            r2.<init>(r7, r3, r5)
            com.instagram.model.direct.DirectShareTarget r5 = r2.A00
            r5.getClass()
            X.8L1 r3 = r0.A0g
            boolean r2 = r3.A00
            if (r2 != 0) goto L_0x0483
            r3.A00 = r4
            r0.A0I()
            if (r13 != 0) goto L_0x040e
            X.82p r2 = r0.A0k
            X.28D r2 = r2.A01
            java.lang.String r13 = r2.toString()
        L_0x040e:
            X.82p r2 = r0.A0k
            X.82o r2 = r2.A02
            X.82Y r2 = r2.A01
            X.7zv r7 = r2.A04()
            r7.getClass()
            java.lang.String r15 = r7.A0k
            int r2 = r7.A07
            long r2 = (long) r2
            r18 = 60000(0xea60, double:2.9644E-319)
            com.instagram.common.session.UserSession r14 = r0.A0c
            r16 = r2
            com.instagram.pendingmedia.model.ClipInfo r10 = X.Q0X.A03(r14, r15, r16, r18)
            java.lang.String r9 = r7.A0h
            android.app.Activity r8 = r0.A0W
            android.content.Context r7 = r8.getApplicationContext()
            int r3 = r10.A09
            int r2 = r10.A06
            java.io.File r3 = X.C64188LSv.A00(r7, r10, r9, r3, r2)
            if (r3 == 0) goto L_0x0483
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r12 = r3.getPath()
            X.0qQ.A0B(r14, r6)
            X.0qQ.A0B(r2, r4)
            r2 = 3
            X.0qQ.A0B(r12, r2)
            r2 = 5
            X.0qQ.A0B(r13, r2)
            X.3t2 r2 = r5.A09
            r2.getClass()
            X.3t1 r2 = X.AnonymousClass6W3.A01(r2)
            com.instagram.model.direct.DirectThreadKey r2 = X.AnonymousClass6W4.A01(r2)
            X.7Zi r8 = X.C333527Zh.A00(r14)
            com.instagram.model.direct.DirectThreadKey r9 = X.C66647MaG.A03(r2)
            java.lang.String r3 = r9.A00
            X.2FW r2 = X.2FW.A1A
            java.lang.Boolean r11 = X.C333537Zi.A00(r8, r2, r3, r6)
            X.AYa r7 = new X.AYa
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.1aU r4 = X.1aU.A06(r7)
            X.1a8 r3 = r0.A0b
            X.Ahn r2 = new X.Ahn
            r2.<init>(r0)
            r3.A02(r4, r2)
        L_0x0483:
            X.0eK r0 = r1.A09
        L_0x0485:
            java.lang.Object r0 = r0.get()
            X.8WK r0 = (X.AnonymousClass8WK) r0
            if (r0 == 0) goto L_0x04f7
            r0.APW()
            return
        L_0x0491:
            X.8K4 r6 = r1.A02
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r2 = 0
            X.LD4 r0 = new X.LD4
            r0.<init>(r7, r2, r3)
            com.instagram.model.direct.DirectShareTarget r5 = r0.A00
            r5.getClass()
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x0483
            r6.A09 = r4
            X.AnonymousClass8K4.A06(r6)
            X.82p r0 = r6.A0I
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            X.8Cl r0 = r0.A03()
            r0.getClass()
            java.lang.String r4 = r0.A06()
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r6.A0H
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r3 = r0.getWidth()
            int r0 = r0.getHeight()
            X.RBZ r2 = new X.RBZ
            r2.<init>(r4, r3, r0)
            X.PRc r0 = new X.PRc
            r0.<init>(r6, r5, r13)
            X.C11156SCl.A00(r0, r2)
            goto L_0x0483
        L_0x04d6:
            java.lang.String r0 = r1.A0G
            if (r0 != 0) goto L_0x04f8
            X.3t2 r0 = r1.A09
            r0.getClass()
            X.3t1 r0 = X.AnonymousClass6W3.A01(r0)
            com.instagram.model.direct.DirectThreadKey r12 = X.AnonymousClass6W4.A01(r0)
            X.1as r7 = X.1as.A04
            com.instagram.common.session.UserSession r1 = r3.A04
            android.app.Activity r0 = r3.A02
            com.instagram.direct.prompts.DirectPromptTypes r11 = com.instagram.direct.prompts.DirectPromptTypes.UNKNOWN
            r10 = 0
            r8 = r0
            r9 = r1
            r13 = r6
            r14 = r6
            r7.A02(r8, r9, r10, r11, r12, r13, r14)
        L_0x04f7:
            return
        L_0x04f8:
            X.9Pg r2 = r3.A01
            if (r2 == 0) goto L_0x04f7
            android.app.Activity r8 = r3.A02
            com.instagram.model.direct.DirectShareTarget r3 = r5.A03
            X.82p r0 = r2.A05
            X.82o r0 = r0.A02
            X.8nd r7 = r0.A01()
            X.80D r1 = r2.A06
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r1.A1I
            if (r0 == 0) goto L_0x0525
            int r5 = r0.A00
            r0 = 9
            if (r5 != r0) goto L_0x0525
            X.8nd r0 = X.C365758nd.A04
            if (r7 == r0) goto L_0x0525
            r1 = 2131954957(0x7f130d0d, float:1.9546428E38)
            r0 = 1909(0x775, float:2.675E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A01(r8, r0, r1, r6)
            return
        L_0x0525:
            X.8QA r0 = r2.A01
            r0.A0D(r6)
            r3.getClass()
            java.lang.String r0 = r1.A2O
            r3.A0M = r0
            r8 = 0
            int r0 = r7.ordinal()
            if (r0 == r6) goto L_0x0554
            if (r0 != r4) goto L_0x0576
            X.8LU r9 = r2.A04
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.PROMPTS
            X.LD4 r10 = new X.LD4
            r10.<init>(r3, r8, r0)
            r11 = r8
            r13 = r8
            r14 = r8
            r15 = r6
            r9.A0P(r10, r11, r12, r13, r14, r15)
        L_0x054c:
            boolean r0 = r1.A3K
            if (r0 != 0) goto L_0x04f7
            X.0eK r0 = r2.A09
            goto L_0x0485
        L_0x0554:
            X.8K4 r7 = r2.A02
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.PROMPTS
            X.LD4 r9 = new X.LD4
            r9.<init>(r3, r8, r0)
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r6
            r18 = r6
            r7.A0J(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x054c
        L_0x056e:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0576:
            java.lang.String r1 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x057e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass88A.A00(X.88A):void");
    }
}
