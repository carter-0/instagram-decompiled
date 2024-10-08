package X;

/* renamed from: X.74p  reason: invalid class name and case insensitive filesystem */
public final class C3258974p implements AnonymousClass7DS {
    public final /* synthetic */ C3258874o A00;

    public C3258974p(C3258874o r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r1.hashCode() == r15.hashCode()) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (r1.isTouchExplorationEnabled() == false) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean DRa(android.view.MotionEvent r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r24 = this;
            r11 = r27
            r0 = r26
            X.7Fq r0 = (X.C328657Fq) r0
            X.Man r11 = (X.C66680Man) r11
            r1 = 0
            X.0qQ.A0B(r0, r1)
            r4 = 1
            X.0qQ.A0B(r11, r4)
            r1 = r24
            X.74o r13 = r1.A00
            X.0qQ.A0A(r25)
            X.7FU r1 = r0.A00
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r1.Ar2()
            boolean r1 = r13.A08
            if (r1 == 0) goto L_0x002f
            if (r3 == 0) goto L_0x002f
            X.7XR r2 = r13.A02
            X.7Wv r2 = (X.C332887Wv) r2
            java.lang.String r1 = r3.A01
            r0 = 0
            r2.AUo(r0, r1, r4)
        L_0x002d:
            r0 = 1
            return r0
        L_0x002f:
            X.7FE r1 = r0.A04
            boolean r1 = r1.A06
            if (r1 != 0) goto L_0x01dd
            X.7XR r8 = r13.A02
            r1 = r8
            X.7XL r1 = (X.AnonymousClass7XL) r1
            boolean r1 = r1.CnR()
            if (r1 == 0) goto L_0x01dd
            X.7Pg r10 = r13.A04
            if (r10 == 0) goto L_0x01dd
            com.instagram.common.session.UserSession r1 = r13.A01
            X.5ju r1 = X.C293015jt.A00(r1)
            r1.A02(r4)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r15 = r0.A07
            X.OFQ r1 = r10.A02
            if (r1 == 0) goto L_0x0062
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = r1.A01
            if (r1 == 0) goto L_0x0062
            int r3 = r1.hashCode()
            int r1 = r15.hashCode()
            r2 = 0
            if (r3 != r1) goto L_0x0063
        L_0x0062:
            r2 = 1
        L_0x0063:
            X.Tol r1 = r10.A06
            if (r1 == 0) goto L_0x00c4
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x00c4
            X.OFQ r1 = r10.A02
            if (r1 == 0) goto L_0x00c4
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = r1.A01
            boolean r1 = r15.A02(r1)
            if (r1 == 0) goto L_0x00c4
            if (r2 == 0) goto L_0x00c4
            X.7Ql r2 = r13.A07
            java.lang.String r1 = "resumePlayback"
            X.0eM r0 = r2.A00
            java.lang.Object r0 = r0.getValue()
            X.TiH r0 = (X.C13842TiH) r0
            r0.A6n(r1)
            java.lang.String r0 = "vmplayback_start"
            r2.A00(r0)
            java.lang.String r0 = "resume_playback"
            r2.A00(r0)
            X.4kA r0 = r13.A06
            float r0 = r0.A01()
            X.Mco r2 = X.C66803Mcp.A00(r0)
            X.C3258874o.A03(r13, r2)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A0A
            android.graphics.drawable.Drawable r0 = r11.A02
            r1.setImageDrawable(r0)
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r0 = r11.A09
            r0.A09 = r4
            com.instagram.direct.messagethread.voice.VoiceMessageControlsView r0 = r11.A0C
            r0.A0E(r2, r4)
            r10.A03()
        L_0x00b2:
            X.Tol r0 = r10.A06
            if (r0 == 0) goto L_0x002d
            X.OFQ r0 = r10.A02
            if (r0 == 0) goto L_0x01d0
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r0.A01
            boolean r0 = r15.A02(r0)
            if (r0 == 0) goto L_0x01d0
            goto L_0x002d
        L_0x00c4:
            boolean r1 = r10.A0E(r15)
            if (r1 == 0) goto L_0x0121
            if (r2 == 0) goto L_0x0121
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r0 = r11.A09
            android.graphics.RectF r2 = X.0nA.A0F(r0)
            android.view.accessibility.AccessibilityManager r0 = r13.A00
            if (r0 == 0) goto L_0x00f9
            boolean r0 = X.2eO.A02(r0, r4)
            if (r0 == 0) goto L_0x00f9
            android.view.accessibility.AccessibilityManager r1 = r13.A00
            r0 = 3410(0xd52, float:4.778E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = java.lang.Boolean.getBoolean(r0)
            if (r0 != 0) goto L_0x00f2
            if (r1 == 0) goto L_0x00f9
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x00f9
        L_0x00f2:
            X.C3258874o.A01(r13)
            r10.A0C(r4)
            goto L_0x00b2
        L_0x00f9:
            float r1 = r25.getRawX()
            float r0 = r25.getRawY()
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L_0x00f2
            float r1 = r25.getRawX()
            float r0 = r2.left
            float r1 = r1 - r0
            float r0 = r2.width()
            float r1 = r1 / r0
            int r0 = r10.A02()
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = X.AnonymousClass1GB.A01(r1)
            r10.A04(r0)
            goto L_0x00b2
        L_0x0121:
            X.7Ql r7 = r13.A07
            java.lang.String r2 = "startPlayback"
            X.0eM r9 = r7.A00
            java.lang.Object r1 = r9.getValue()
            X.TiH r1 = (X.C13842TiH) r1
            r1.A6n(r2)
            java.lang.String r1 = "vmplayback_start"
            r7.A00(r1)
            java.lang.Long r1 = r0.A0A
            if (r1 == 0) goto L_0x0156
            java.lang.String r1 = "Required value was null."
            java.lang.String r2 = r0.A0C
            if (r2 == 0) goto L_0x01d7
            java.lang.String r1 = "content://com.instagram.android.tam-attachment"
            X.0qQ.A0B(r1, r4)
            boolean r1 = r2.startsWith(r1)
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0156
            java.lang.String r0 = "startPlayback_TamVoice_error"
            r7.A00(r0)
            X.C3258874o.A00(r13)
            goto L_0x00b2
        L_0x0156:
            X.4kA r1 = r13.A06
            float r1 = r1.A01()
            X.Mco r3 = X.C66803Mcp.A00(r1)
            X.C3258874o.A03(r13, r3)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r11.A0A
            android.graphics.drawable.Drawable r1 = r11.A02
            r2.setImageDrawable(r1)
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r1 = r11.A09
            r1.A09 = r4
            com.instagram.direct.messagethread.voice.VoiceMessageControlsView r1 = r11.A0C
            r1.A0E(r3, r4)
            X.1Xj r14 = r0.A06     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            java.lang.String r6 = r0.A0C     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            java.lang.Integer r16 = X.AnonymousClass05K.A01     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            X.3tH r12 = r0.A05     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            boolean r5 = r0.A0G     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            java.lang.Long r4 = r0.A0B     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            boolean r3 = r0.A0I     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            java.lang.Integer r2 = r0.A08     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            java.lang.Integer r1 = r0.A09     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            java.lang.String r0 = r0.A0E     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            r19 = r4
            r20 = r6
            r21 = r0
            r22 = r5
            r23 = r3
            r18 = r1
            r17 = r2
            r10.A07(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            java.lang.String r0 = "startPlayback_ok"
            r7.A00(r0)     // Catch:{ IllegalStateException -> 0x01b1, IOException -> 0x019e }
            goto L_0x01c9
        L_0x019e:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r1 = "dap_prepare_io_error"
            java.lang.Object r0 = r9.getValue()
            X.TiH r0 = (X.C13842TiH) r0
            r0.A6k(r1, r2)
            java.lang.String r0 = "startPlayback_io_error"
            goto L_0x01c3
        L_0x01b1:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r1 = "dap_prepare_state_error"
            java.lang.Object r0 = r9.getValue()
            X.TiH r0 = (X.C13842TiH) r0
            r0.A6k(r1, r2)
            java.lang.String r0 = "startPlayback_state_error"
        L_0x01c3:
            r7.A00(r0)
            X.C3258874o.A00(r13)
        L_0x01c9:
            X.7VB r8 = (X.AnonymousClass7VB) r8
            r8.CmA(r15)
            goto L_0x00b2
        L_0x01d0:
            java.lang.String r0 = "media_mismatch"
            r10.A0B(r0)
            goto L_0x002d
        L_0x01d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01dd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3258974p.DRa(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }
}
