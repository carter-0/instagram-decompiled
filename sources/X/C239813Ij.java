package X;

/* renamed from: X.3Ij  reason: invalid class name and case insensitive filesystem */
public abstract class C239813Ij {
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, X.F0A] */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        r5 = r4.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass1XT r19, X.0lg r20, java.lang.String r21) {
        /*
            r2 = 0
            r3 = 1
            r0 = r19
            X.0qQ.A0B(r0, r3)
            java.util.List r1 = r0.getSystemMessages()
            r15 = r20
            if (r1 == 0) goto L_0x007b
            java.util.Iterator r11 = r1.iterator()
        L_0x0013:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r10 = r11.next()
            X.CU2 r10 = (X.CU2) r10
            if (r10 == 0) goto L_0x0073
            java.lang.Class<X.2Qf> r4 = X.AnonymousClass2Qf.class
            monitor-enter(r4)
            java.lang.String r9 = r10.A01     // Catch:{ all -> 0x0231 }
            java.util.Map r1 = X.AnonymousClass2Qf.A00     // Catch:{ all -> 0x0231 }
            java.lang.Object r8 = r1.get(r9)     // Catch:{ all -> 0x0231 }
            X.1aV r8 = (X.1aV) r8     // Catch:{ all -> 0x0231 }
            if (r8 == 0) goto L_0x0071
            X.0wX r1 = X.C61170le.A00     // Catch:{ all -> 0x0231 }
            X.0xm r1 = X.AnonymousClass0xl.A00(r1)     // Catch:{ all -> 0x0231 }
            X.0qQ.A0B(r9, r2)     // Catch:{ all -> 0x0231 }
            java.lang.String r7 = "system_message_"
            java.lang.String r6 = X.002.A0R(r7, r9)     // Catch:{ all -> 0x0231 }
            X.0xa r5 = r1.A00     // Catch:{ all -> 0x0231 }
            boolean r1 = r5.contains(r6)     // Catch:{ all -> 0x0231 }
            if (r1 == 0) goto L_0x006f
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r5.getFloat(r6, r1)     // Catch:{ all -> 0x0231 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x0231 }
        L_0x0051:
            float r6 = r10.A00     // Catch:{ all -> 0x0231 }
            if (r1 == 0) goto L_0x005d
            float r1 = r1.floatValue()     // Catch:{ all -> 0x0231 }
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0071
        L_0x005d:
            X.0xY r5 = r5.AR4()     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = X.002.A0R(r7, r9)     // Catch:{ all -> 0x0231 }
            r5.E5W(r1, r6)     // Catch:{ all -> 0x0231 }
            r5.apply()     // Catch:{ all -> 0x0231 }
            r8.accept(r15)     // Catch:{ all -> 0x0231 }
            goto L_0x0071
        L_0x006f:
            r1 = 0
            goto L_0x0051
        L_0x0071:
            monitor-exit(r4)
            goto L_0x0013
        L_0x0073:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x007b:
            boolean r1 = r0.isOk()
            if (r1 != 0) goto L_0x00f5
            boolean r1 = r15.hasEnded()
            if (r1 != 0) goto L_0x00f5
            boolean r1 = r15 instanceof com.instagram.common.session.UserSession
            if (r1 == 0) goto L_0x0092
            r1 = r15
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x00f5
        L_0x0092:
            boolean r1 = r0.isFeedbackRequired()
            if (r1 == 0) goto L_0x00f6
            X.1YU r1 = X.AnonymousClass1YU.A00
            if (r1 == 0) goto L_0x00f6
            boolean r13 = r0.getSpam()
            boolean r14 = r0.getSentryBlockRestrictionDialogueUnificationEnabled()
            java.lang.String r2 = r0.getFeedbackTitle()
            java.lang.String r3 = r0.getFeedbackMessage()
            java.lang.String r4 = r0.getFeedbackAppealLabel()
            java.lang.String r5 = r0.getFeedbackAction()
            java.lang.String r6 = r0.getFeedbackIgnoreLabel()
            java.lang.String r7 = r0.getFeedbackUrl()
            java.lang.String r8 = r0.getEnrollmentTime()
            java.lang.String r9 = r0.getExpirationTime()
            java.lang.String r10 = r0.getDialogueType()
            java.lang.String r11 = r0.getErrorCode()
            java.lang.String r12 = r0.getReasonsThrown()
            X.FBd r1 = new X.FBd
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r17 = r0.getRestrictionDetailUseCase()
            java.lang.String r18 = r0.getRestrictionType()
            java.lang.String r19 = r0.getResponsiblePolicy()
            java.lang.String r20 = r0.getCategory()
            java.lang.String r21 = r0.getRestrictionExtraData()
            X.3EI r14 = new X.3EI
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
        L_0x00f0:
            X.1xC r0 = X.1xC.A01
            r0.A00(r14)
        L_0x00f5:
            return
        L_0x00f6:
            boolean r1 = r0.isLoginRequired()
            if (r1 == 0) goto L_0x0118
            X.1Wi r14 = X.1Wi.A00
            if (r14 == 0) goto L_0x019a
            java.lang.String r17 = r0.getErrorTitle()
            java.lang.String r18 = r0.getErrorBody()
            java.lang.String r19 = r0.getLogoutReason()
            r0 = 3530(0xdca, float:4.947E-42)
            java.lang.String r16 = X.AnonymousClass000.A00(r0)
            r20 = r21
            r14.A00(r15, r16, r17, r18, r19, r20)
            return
        L_0x0118:
            boolean r1 = r0.isCheckpointRequired()
            if (r1 == 0) goto L_0x0150
            X.F0A r2 = r0.getCheckpoint()
            if (r2 != 0) goto L_0x013d
            java.lang.String r3 = r0.getCheckpointUrl()
            if (r3 == 0) goto L_0x0239
            int r1 = r3.length()
            if (r1 == 0) goto L_0x0239
            boolean r0 = r0.getShouldShowWebviewCancelButton()
            X.F0A r2 = new X.F0A
            r2.<init>()
            r2.A02 = r3
            r2.A05 = r0
        L_0x013d:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x01a0
            X.1YU r0 = X.AnonymousClass1YU.A00
            if (r0 == 0) goto L_0x01a0
            X.FBd r0 = new X.FBd
            r0.<init>()
            X.3EI r14 = new X.3EI
            r14.<init>(r15, r0)
            goto L_0x00f0
        L_0x0150:
            boolean r1 = r0.isConsentRequired()
            if (r1 == 0) goto L_0x016d
            X.Cue r8 = r0.getConsentData()
            if (r8 == 0) goto L_0x0234
            X.FZ1 r4 = X.F5E.A00(r15)
            X.0qQ.A07(r4)
            X.0wX r0 = r15.getDeviceSession()
            android.content.Context r7 = r0.A06()
            monitor-enter(r4)
            goto L_0x01b3
        L_0x016d:
            boolean r1 = r0.isDelegateAccessBlocked()
            if (r1 == 0) goto L_0x00f5
            java.lang.String r2 = r0.getErrorBody()
            java.lang.String r1 = r0.getErrorMessage()
            if (r2 == 0) goto L_0x00f5
            if (r1 != 0) goto L_0x0181
            java.lang.String r1 = "unknown"
        L_0x0181:
            X.6ap r0 = new X.6ap
            r0.<init>()
            r0.A0D = r2
            r0.A05()
            r0.A0H = r1
            X.Dc2 r1 = r0.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            X.FFO.A03(r0)
            return
        L_0x019a:
            java.lang.String r1 = "IG_API_UTIL"
            java.lang.String r0 = "IgApiLoginRequiredErrorHandler.getInstance() hasn't been initialized yet."
            goto L_0x023d
        L_0x01a0:
            X.FZ1 r1 = X.F5E.A00(r15)
            X.0qQ.A07(r1)
            X.0wX r0 = r15.getDeviceSession()
            android.content.Context r0 = r0.A06()
            r1.A02(r0, r2)
            return
        L_0x01b3:
            boolean r0 = r4.A03     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x022f
            boolean r0 = r4.A02     // Catch:{ all -> 0x0231 }
            if (r0 != 0) goto L_0x022f
            boolean r0 = r4.A05     // Catch:{ all -> 0x0231 }
            if (r0 != 0) goto L_0x022f
            X.0lg r5 = r4.A06     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = X.0Gl.A02(r5)     // Catch:{ all -> 0x0231 }
            if (r1 == 0) goto L_0x022f
            X.0BQ r0 = X.AnonymousClass0BO.A00(r5)     // Catch:{ all -> 0x0231 }
            boolean r0 = r0.CO7(r1)     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x022f
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x0231 }
            r6.<init>()     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = "ConsentFragment.param.headline"
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0231 }
            r6.putString(r1, r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = "ConsentFragment.param.content"
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0231 }
            r6.putString(r1, r0)     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = "ConsentFragment.param.button.text"
            java.lang.String r0 = r8.A00     // Catch:{ all -> 0x0231 }
            r6.putString(r1, r0)     // Catch:{ all -> 0x0231 }
            r4.A05 = r3     // Catch:{ all -> 0x0231 }
            java.lang.String r5 = r5.getToken()     // Catch:{ all -> 0x0231 }
            X.0qQ.A0B(r5, r2)     // Catch:{ all -> 0x0231 }
            java.lang.Class<com.instagram.challenge.activity.ChallengeActivity> r0 = com.instagram.challenge.activity.ChallengeActivity.class
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0231 }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x0231 }
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r3.addFlags(r0)     // Catch:{ all -> 0x0231 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0231 }
            r2.<init>()     // Catch:{ all -> 0x0231 }
            java.lang.String r1 = "consent"
            r0 = 4319(0x10df, float:6.052E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0231 }
            r2.putString(r0, r1)     // Catch:{ all -> 0x0231 }
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putString(r0, r5)     // Catch:{ all -> 0x0231 }
            r0 = 4318(0x10de, float:6.051E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0231 }
            r2.putBundle(r0, r6)     // Catch:{ all -> 0x0231 }
            r3.putExtras(r2)     // Catch:{ all -> 0x0231 }
            X.0kR.A0B(r7, r3)     // Catch:{ IllegalStateException -> 0x0225 }
            goto L_0x022f
        L_0x0225:
            r1 = move-exception
            r0 = 422(0x1a6, float:5.91E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0231 }
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x0231 }
        L_0x022f:
            monitor-exit(r4)
            return
        L_0x0231:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0234:
            java.lang.String r1 = "consent"
            java.lang.String r0 = "consent data is required but none was provided."
            goto L_0x023d
        L_0x0239:
            java.lang.String r1 = "checkpoint"
            java.lang.String r0 = "Checkpoint is required but none was provided."
        L_0x023d:
            X.0wb.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239813Ij.A00(X.1XT, X.0lg, java.lang.String):void");
    }
}
