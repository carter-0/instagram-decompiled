package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Opi  reason: case insensitive filesystem */
public final class C71724Opi implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0297, code lost:
        r0 = X.C68314NAb.A00;
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, 1, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x029d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0363, code lost:
        r0 = X.AnonymousClass67N.A00;
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, 0, 0, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x036a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r12) {
        /*
            r11 = this;
            r3 = r12
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0349;
                case 1: goto L_0x032e;
                case 2: goto L_0x0313;
                case 3: goto L_0x02f8;
                case 4: goto L_0x02d6;
                case 5: goto L_0x02ba;
                case 6: goto L_0x029e;
                case 7: goto L_0x027c;
                case 8: goto L_0x0260;
                case 9: goto L_0x0244;
                case 10: goto L_0x0228;
                case 11: goto L_0x020c;
                case 12: goto L_0x01eb;
                case 13: goto L_0x01ca;
                case 14: goto L_0x01ad;
                case 15: goto L_0x0190;
                case 16: goto L_0x0173;
                case 17: goto L_0x0155;
                case 18: goto L_0x0137;
                case 19: goto L_0x0119;
                case 20: goto L_0x00fb;
                case 21: goto L_0x00dd;
                case 22: goto L_0x00bf;
                case 23: goto L_0x00a1;
                case 24: goto L_0x0072;
                default: goto L_0x0006;
            }
        L_0x0006:
            com.facebook.msys.mca.MailboxNullable r3 = (com.facebook.msys.mca.MailboxNullable) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r0 = r3.value
            if (r0 == 0) goto L_0x001b
            X.5z0 r0 = (X.C301345z0) r0
            r5 = 1
            if (r0 == 0) goto L_0x002e
            int r0 = X.C66580MXl.A04(r0)
            if (r0 != 0) goto L_0x002e
        L_0x001b:
            java.lang.Object r3 = r11.A04
            X.NgW r3 = (X.C69183NgW) r3
            java.lang.String r2 = "Failed to retrieve ICDC metadata"
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.PZ4 r0 = new X.PZ4
            r0.<init>(r3, r2)
            r1.runOnUiThread(r0)
            return
        L_0x002e:
            java.lang.Object r4 = r3.value
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.messengercorecryptocqljava.SecureMessageFetchICDCMetadata"
            X.0qQ.A0C(r4, r0)
            X.5z0 r4 = (X.C301345z0) r4
            java.lang.Object r3 = r11.A03
            X.638 r3 = (X.AnonymousClass638) r3
            long r7 = r11.A02
            com.facebook.msys.mci.CQLResultSet r0 = r4.mResultSet
            int r1 = r0.getInteger(r2, r2)
            int r0 = r11.A01
            int r1 = r1 + r0
            int r6 = java.lang.Math.max(r5, r1)
            com.facebook.msys.mci.CQLResultSet r0 = r4.mResultSet
            byte[] r5 = r0.getBlob(r2, r5)
            com.facebook.msys.mci.CQLResultSet r1 = r4.mResultSet
            r0 = 2
            boolean r9 = r1.getBoolean(r2, r0)
            java.lang.Object r1 = r11.A04
            r0 = 47
            X.Opg r1 = X.C71722Opg.A00(r1, r0)
            X.632 r3 = r3.A07
            X.68L r0 = X.C66580MXl.A0F(r3, r2)
            com.facebook.msys.mca.MailboxFutureImpl r4 = X.C66581MXm.A0J(r0, r1)
            X.Ooo r2 = new X.Ooo
            r2.<init>(r3, r4, r5, r6, r7, r9)
            X.C66582MXn.A1E(r0, r2, r4)
            return
        L_0x0072:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "fetchMessageDataForExternalForward"
            X.C3030067a.A04(r1, r0, r2)
            X.681 r1 = X.C68314NAb.A00
            r0 = 17
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            com.facebook.msys.mci.AccountSession r0 = r3.getAccountSession()
            X.5nb r1 = X.C66580MXl.A0H(r0)
            r0 = 53
            com.facebook.msys.util.NotificationScope r6 = X.C71733Opt.A00(r1, r11, r2, r0)
            java.lang.Object r0 = r11.A04
            X.C66580MXl.A1N(r6, r0, r2)
            long r1 = r11.A02
            r4 = 0
            r0 = 5
            r5 = r4
            com.facebook.tam.mca.MailboxTamJNI.dispatchVJOOOO(r0, r1, r3, r4, r5, r6)
            return
        L_0x00a1:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientVisualMessageScreenshotted"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 16
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientVisualMessageScreenshotted"
            goto L_0x0297
        L_0x00bf:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientVisualMessageOpened"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 15
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientVisualMessageOpened"
            goto L_0x0297
        L_0x00dd:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamMarkMessageRequestAccepted"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 14
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamMarkMessageRequestAccepted"
            goto L_0x0297
        L_0x00fb:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamTransportHybridThreadUnmute"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 13
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamTransportHybridThreadUnmute"
            goto L_0x0297
        L_0x0119:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamTransportHybridThreadMuteIndefinitely"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 12
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamTransportHybridThreadMuteIndefinitely"
            goto L_0x0297
        L_0x0137:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadDelete"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 11
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientThreadDelete"
            goto L_0x0297
        L_0x0155:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadMarkUnread"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 9
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientThreadMarkUnread"
            goto L_0x0297
        L_0x0173:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadBannerDismissProactiveWarnings"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 5
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientThreadBannerDismissProactiveWarnings"
            goto L_0x0297
        L_0x0190:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadBannerDismiss"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 4
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientThreadBannerDismiss"
            goto L_0x0297
        L_0x01ad:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadBannerRecordImpression"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 3
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientThreadBannerRecordImpression"
            goto L_0x0297
        L_0x01ca:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientParticipantLeaveThread"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r7 = 1
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r7)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientParticipantLeaveThread"
            X.681 r0 = X.C68314NAb.A00
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x01eb:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientMessageDelete"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r6 = 0
            X.Opj r10 = new X.Opj
            r10.<init>(r11, r6)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientMessageDelete"
            r7 = 1
            X.681 r0 = X.C68314NAb.A00
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x020c:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientMessageResendOptimistic"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 70
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientMessageResendOptimistic"
            goto L_0x0297
        L_0x0228:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientTypingIndicatorStop"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 68
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientTypingIndicatorStop"
            goto L_0x0297
        L_0x0244:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientTypingIndicatorStart"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 67
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientTypingIndicatorStart"
            goto L_0x0297
        L_0x0260:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadMarkRead"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 66
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientThreadMarkRead"
            goto L_0x0297
        L_0x027c:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientMessageUnsend"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r0 = 62
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxTam"
            java.lang.String r9 = "TamClientMessageUnsend"
        L_0x0297:
            r7 = 1
            X.681 r0 = X.C68314NAb.A00
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x029e:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadSHIMThreadInfoByFbId"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 43
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "SHIMThreadInfoByFbId"
            goto L_0x0363
        L_0x02ba:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramVisualMessageActionStatus"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 41
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramVisualMessageActionStatus"
            goto L_0x0363
        L_0x02d6:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureThreadModel"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 38
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramSecureThreadModel"
            r6 = 0
            r7 = 1
            X.681 r0 = X.AnonymousClass67N.A00
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x02f8:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureParticipantList"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 29
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramSecureParticipantList"
            goto L_0x0363
        L_0x0313:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramIgThreadIdFromSecureThreadKey"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 26
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramIgThreadIdFromSecureThreadKey"
            goto L_0x0363
        L_0x032e:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureMessagePollList"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 24
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramSecureMessagePollList"
            goto L_0x0363
        L_0x0349:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureFetchThreadInfoWithFbid"
            com.facebook.msys.mca.MailboxFutureImpl r4 = A00(r11, r1, r0, r2)
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 22
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramSecureFetchThreadInfoWithFbid"
        L_0x0363:
            r6 = 0
            X.681 r0 = X.AnonymousClass67N.A00
            r7 = r6
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71724Opi.onCompletion(java.lang.Object):void");
    }

    public C71724Opi(AnonymousClass638 r2, C69183NgW ngW, int i, long j) {
        this.A00 = 25;
        this.A04 = ngW;
        this.A03 = r2;
        this.A02 = j;
        this.A01 = i;
    }

    public static MailboxFutureImpl A00(C71724Opi opi, String str, String str2, int i) {
        C3030067a.A04(str, str2, i);
        return (MailboxFutureImpl) opi.A04;
    }

    public C71724Opi(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = r1;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
    }

    public C71724Opi(MailboxFutureImpl mailboxFutureImpl, C68314NAb nAb, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = nAb;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
    }
}
