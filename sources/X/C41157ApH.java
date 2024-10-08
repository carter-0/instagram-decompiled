package X;

/* renamed from: X.ApH  reason: case insensitive filesystem */
public final /* synthetic */ class C41157ApH implements Runnable {
    public final /* synthetic */ C357188Ww A00;
    public final /* synthetic */ C293505kq A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C41157ApH(C357188Ww r1, C293505kq r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x012e, code lost:
        if (r0.isEmpty() != false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0074, code lost:
        if (r0 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0301, code lost:
        if (r1.equals(r0.getId()) == false) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x037a, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 2342154896117072683L) != false) goto L_0x037c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r0 = r30
            X.8Ww r4 = r0.A00
            X.5kq r1 = r0.A01
            boolean r6 = r0.A02
            com.instagram.common.session.UserSession r3 = r4.A02
            X.AE4 r2 = X.AnonymousClass8A1.A00(r3)
            java.lang.String r0 = "open_share_sheet_function_start"
            r2.A04(r0)
            X.0eM r0 = X.ADu.A02
            java.lang.Object r0 = r0.getValue()
            X.ADu r0 = (X.ADu) r0
            android.app.Activity r9 = r4.A00
            r0.A01(r9)
            X.6if r0 = r4.A0H
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r0.get()
            X.8cb r0 = (X.C359318cb) r0
            r0.A0G()
        L_0x002d:
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r4.A0G
            X.0eM r0 = r0.A10
            X.AnonymousClass7TF.A1N(r0)
            java.lang.String r5 = r1.A0T
            r12 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r12, r3, r5)
            java.lang.String r13 = r3.A05
            java.lang.String r11 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r11, r13)
            r0 = 23
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Bundle r2 = X.AnonymousClass7TG.A0P(r0, r5, r2)
            X.80D r7 = r4.A0E
            com.instagram.pendingmedia.model.recipients.PendingRecipient r5 = r7.A1S
            r0 = 57
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r5)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r5 = r4.A0I
            java.lang.Class<X.9pm> r0 = X.C389529pm.class
            java.util.ArrayList r0 = r5.A0V(r0)
            boolean r0 = r0.isEmpty()
            r10 = 0
            if (r0 == 0) goto L_0x0076
            java.lang.Class<X.8v6> r0 = X.C369648v6.class
            java.util.ArrayList r0 = r5.A0V(r0)
            boolean r0 = r0.isEmpty()
            r5 = 0
            if (r0 != 0) goto L_0x0077
        L_0x0076:
            r5 = 1
        L_0x0077:
            r0 = 2147(0x863, float:3.009E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r5)
            android.os.Bundle r16 = X.AnonymousClass7TE.A0a()
            X.8QA r0 = r4.A04
            X.8pU r0 = r0.A04()
            X.8pV r14 = r0.A03
            if (r14 == 0) goto L_0x00ac
            X.8pT r0 = r14.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r5 = X.AEE.A00(r0)
            if (r5 == 0) goto L_0x009f
            r0 = 2156(0x86c, float:3.021E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r5)
        L_0x009f:
            boolean r5 = X.AEE.A02(r14)
            r0 = 2154(0x86a, float:3.018E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r5)
        L_0x00ac:
            if (r9 == 0) goto L_0x00bc
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r4.A0B
            X.0qQ.A0B(r5, r12)
            r0 = 2157(0x86d, float:3.023E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r5)
        L_0x00bc:
            boolean r14 = r7.A3O
            boolean r9 = r7.A3a
            boolean r5 = r7.A3p
            r0 = 2082(0x822, float:2.918E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r14)
            r0 = 2083(0x823, float:2.919E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r9)
            r0 = 2084(0x824, float:2.92E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r5)
            X.50r r5 = r1.A0H
            X.50r r0 = X.C2801950r.CLIPS
            boolean r5 = X.AnonymousClass7TF.A1W(r5, r0)
            r0 = 100
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r5)
            X.82p r5 = r4.A0D
            X.82o r0 = r5.A02
            r29 = r0
            X.82Y r9 = r0.A01
            com.instagram.reels.prompt.model.PromptStickerModel r14 = r9.A09
            r0 = 2148(0x864, float:3.01E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r14)
            java.lang.String r15 = r7.A2V
            java.lang.String r14 = r7.A2T
            r0 = 2162(0x872, float:3.03E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r15)
            r0 = 2161(0x871, float:3.028E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r14)
            java.util.ArrayList r0 = r7.A2s
            if (r0 == 0) goto L_0x0130
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x0130
            java.util.ArrayList r0 = r7.A2s
            if (r0 == 0) goto L_0x03ad
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L_0x0129:
            boolean r0 = r0.isEmpty()
            r14 = 1
            if (r0 == 0) goto L_0x0131
        L_0x0130:
            r14 = 0
        L_0x0131:
            r0 = 2151(0x867, float:3.014E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r14)
            boolean r14 = r7.A3u
            r0 = 88
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.putBoolean(r0, r14)
            java.util.ArrayList r0 = r7.A2r
            if (r0 == 0) goto L_0x0162
            java.util.List r14 = java.util.Collections.unmodifiableList(r0)
            if (r14 == 0) goto L_0x0162
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0162
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1D(r14)
            r0 = 87
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.putParcelableArrayList(r0, r14)
        L_0x0162:
            java.lang.String r14 = r7.A2k
            r0 = 89
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.putString(r0, r14)
            java.lang.Boolean r0 = r7.A24
            if (r0 == 0) goto L_0x017e
            boolean r14 = r0.booleanValue()
            r0 = 2149(0x865, float:3.011E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r14)
        L_0x017e:
            r0 = 2155(0x86b, float:3.02E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r6)
            X.82n r0 = r7.A12
            boolean r6 = X.AnonymousClass7TF.A1V(r0)
            r0 = 2146(0x862, float:3.007E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r6)
            X.C320236s2.A01(r2, r11)
            r0 = r16
            r0.putAll(r2)
            java.lang.Integer r0 = r9.A0B
            X.0qQ.A07(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r0 != r6) goto L_0x01a8
            r10 = 1
        L_0x01a8:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            X.1A6 r2 = new X.1A6
            r2.<init>(r14)
            X.1A6 r0 = new X.1A6
            r0.<init>(r14)
            X.8QN r14 = r4.A05
            r28 = r14
            X.8K4 r14 = r4.A06
            r19 = r14
            X.8MC r14 = r4.A0A
            r18 = r14
            X.8L1 r14 = r4.A08
            r17 = r14
            X.8BA r15 = r4.A07
            java.lang.String r24 = r15.A0T()
            X.B1O r14 = r7.A0h
            boolean r27 = r15.A0p()
            r20 = r17
            r21 = r18
            r22 = r14
            r23 = r5
            r25 = r2
            r26 = r0
            r17 = r3
            r18 = r28
            X.34S r0 = X.C394559yJ.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r14 = r0.A00
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r14 = (com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim) r14
            boolean r5 = r7.A3g
            X.1as r0 = X.1as.A04
            if (r0 == 0) goto L_0x031a
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = r1.A0B
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r7.A0V
            if (r0 != 0) goto L_0x03a9
            r0 = 0
        L_0x01ff:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r2.putString(r11, r13)
            r11 = 917(0x395, float:1.285E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r11)
            r2.putBoolean(r11, r5)
            r11 = 6
            r13 = 915(0x393, float:1.282E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r13)
            r2.putBoolean(r13, r8)
            r13 = 435(0x1b3, float:6.1E-43)
            java.lang.String r13 = X.AnonymousClass000.A00(r13)
            r2.putBoolean(r13, r5)
            boolean r5 = X.AnonymousClass8BA.A0L(r15)
            r13 = r5 ^ 1
            r5 = 222(0xde, float:3.11E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putBoolean(r5, r13)
            X.8it r5 = r15.A1q
            boolean r13 = r5.A06()
            r5 = 25
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putBoolean(r5, r13)
            r5 = 436(0x1b4, float:6.11E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putBoolean(r5, r10)
            r5 = 59
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putParcelable(r5, r14)
            java.lang.String r10 = r15.A0T()
            r5 = 916(0x394, float:1.284E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putString(r5, r10)
            java.lang.String r10 = r7.A2q
            r5 = 911(0x38f, float:1.277E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putString(r5, r10)
            X.8nd r5 = r29.A01()
            int r5 = r5.ordinal()
            if (r5 == r12) goto L_0x0383
            if (r5 != r8) goto L_0x03b0
            X.7zv r5 = r9.A04()
            r5.getClass()
            java.lang.String r15 = r5.A0k
            int r13 = r5.A0K
            int r12 = r5.A08
            int r10 = r5.A09
            boolean r5 = r5.A1D
            com.instagram.archive.intf.ArchivePendingUpload r14 = new com.instagram.archive.intf.ArchivePendingUpload
            r18 = r15
            r19 = r13
            r20 = r12
            r21 = r10
            r22 = r8
            r23 = r5
            r17 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23)
        L_0x029a:
            r5 = 135(0x87, float:1.89E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putParcelable(r5, r14)
            r5 = 1147(0x47b, float:1.607E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r2.putParcelableArrayList(r5, r1)
            if (r0 != 0) goto L_0x037f
            r0 = 0
        L_0x02af:
            r1 = 910(0x38e, float:1.275E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putString(r1, r0)
            java.lang.Integer r9 = r9.A0D
            if (r9 == 0) goto L_0x0368
            int r1 = r9.intValue()
            if (r1 == r11) goto L_0x035f
            r0 = 3
            if (r1 == r0) goto L_0x0356
            r0 = 8
            if (r1 == r0) goto L_0x034d
            r0 = 7
            if (r1 != r0) goto L_0x0368
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342154909001974574(0x2081017b0000032e, double:4.058717587821027E-152)
        L_0x02d3:
            boolean r0 = X.182.A06(r5, r3, r0)
            r1 = r0 ^ 1
        L_0x02d9:
            r0 = 912(0x390, float:1.278E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r9 == r0) goto L_0x0303
            if (r9 == r6) goto L_0x0303
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r9 != r0) goto L_0x030c
            X.1Xj r0 = r7.A1C
            if (r0 == 0) goto L_0x030c
            java.lang.String r1 = r3.A06
            com.instagram.user.model.User r0 = r0.A2A(r3)
            r0.getClass()
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x030c
        L_0x0303:
            r0 = 914(0x392, float:1.281E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r8)
        L_0x030c:
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r8)
            r0 = r16
            r0.putAll(r2)
        L_0x031a:
            X.AE4 r1 = X.AnonymousClass8A1.A00(r3)
            java.lang.String r0 = "launch_clips_share_sheet_start"
            r1.A04(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r9 = com.instagram.modal.ModalActivity.class
            X.4DH r1 = r4.A01
            androidx.fragment.app.FragmentActivity r6 = r1.requireActivity()
            java.lang.String r10 = "clips_share_sheet"
            X.6W8 r5 = new X.6W8
            r7 = r16
            r8 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 9583(0x256f, float:1.3429E-41)
            r5.A0D(r1, r0)
            X.8Vl r0 = r4.A0F
            X.8Vm r1 = r0.A00()
            r0 = 3
            r1.A00 = r0
            X.AE4 r1 = X.AnonymousClass8A1.A00(r3)
            java.lang.String r0 = "open_share_sheet_function_end"
            r1.A04(r0)
            return
        L_0x034d:
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342154904707007277(0x2081017a0000032d, double:4.058713946053091E-152)
            goto L_0x02d3
        L_0x0356:
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342154891822105386(0x208101770000032a, double:4.058703020749283E-152)
            goto L_0x02d3
        L_0x035f:
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342154887527138089(0x2081017600000329, double:4.058699378981347E-152)
            goto L_0x02d3
        L_0x0368:
            X.85o r0 = r4.A0C
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x037c
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342154896117072683(0x208101780000032b, double:4.058706662517219E-152)
            boolean r0 = X.182.A06(r5, r3, r0)
            r1 = 1
            if (r0 == 0) goto L_0x02d9
        L_0x037c:
            r1 = 0
            goto L_0x02d9
        L_0x037f:
            java.lang.String r0 = r0.A02
            goto L_0x02af
        L_0x0383:
            X.8Cl r5 = r9.A03()
            r5.getClass()
            java.lang.String r18 = r5.A06()
            int r15 = r5.A09
            int r13 = r5.A06
            int r10 = r5.A07
            boolean r5 = r5.A13
            com.instagram.archive.intf.ArchivePendingUpload r14 = new com.instagram.archive.intf.ArchivePendingUpload
            r19 = r15
            r20 = r13
            r21 = r10
            r22 = r12
            r23 = r5
            r17 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x029a
        L_0x03a9:
            X.4yO r0 = r0.A03
            goto L_0x01ff
        L_0x03ad:
            r0 = 0
            goto L_0x0129
        L_0x03b0:
            java.lang.String r0 = "Unknown media type"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41157ApH.run():void");
    }
}
