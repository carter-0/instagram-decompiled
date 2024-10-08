package X;

import java.util.function.Supplier;

/* renamed from: X.Pcx  reason: case insensitive filesystem */
public final class C73455Pcx implements Supplier {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;

    public C73455Pcx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, int i, long j) {
        this.A00 = i;
        this.A06 = obj3;
        this.A03 = obj4;
        this.A09 = str;
        this.A08 = obj2;
        this.A01 = j;
        this.A07 = obj6;
        this.A05 = obj7;
        this.A04 = obj5;
        this.A02 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0192 A[LOOP:3: B:39:0x018c->B:41:0x0192, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.A00
            if (r0 == 0) goto L_0x01a7
            java.lang.String r5 = "_FAILED"
            java.lang.Object r15 = r2.A02
            X.OMO r15 = (X.OMO) r15
            java.lang.Object r10 = r2.A06
            X.29o r10 = (X.29o) r10
            java.lang.String r13 = r10.getTag()
            java.lang.String r8 = r2.A09
            java.lang.String r7 = "tag"
            r0 = 0
            X.0qQ.A0B(r13, r0)
            r14 = 1
            int r0 = r15.A00
            int r6 = X.C41845B3m.A01(r13, r0)
            com.facebook.quicklog.QuickPerformanceLogger r4 = r15.A01
            r3 = 396363750(0x17a007e6, float:1.03417515E-24)
            r4.markerStart(r3, r6)
            java.lang.String r1 = "file_name"
            java.lang.String r0 = "FILE_MAP"
            r4.markerAnnotate(r3, r6, r1, r0)
            r4.markerAnnotate(r3, r6, r7, r13)
            java.lang.String r0 = "client_server_join_key"
            r4.markerAnnotate(r3, r6, r0, r8)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Object r4 = r2.A08
            com.facebook.quicklog.reliability.UserFlowLogger r4 = (com.facebook.quicklog.reliability.UserFlowLogger) r4
            long r0 = r2.A01
            java.lang.String r3 = "_START"
            X.C66583MXo.A1E(r4, r13, r3, r0)
            r10.Epo(r0)
            java.lang.Object r9 = r2.A07
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.Object r3 = r2.A03
            com.instagram.bugreporter.model.BugReport r3 = (com.instagram.bugreporter.model.BugReport) r3
            com.instagram.bugreporter.source.BugReportSource r3 = r3.A00
            java.lang.String r3 = r3.toString()
            boolean r3 = r10.CK5(r9, r3)
            if (r3 == 0) goto L_0x015b
            java.lang.Object r3 = r2.A04     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            X.OKE r3 = (X.OKE) r3     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            X.OV8 r3 = r3.A00     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.io.File r8 = r3.A00()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.Object r7 = r2.A05     // Catch:{ TimeoutException -> 0x0105 }
            java.util.concurrent.ExecutorService r7 = (java.util.concurrent.ExecutorService) r7     // Catch:{ TimeoutException -> 0x0105 }
            r3 = 47
            X.Iw5 r2 = new X.Iw5     // Catch:{ TimeoutException -> 0x0105 }
            r2.<init>(r3, r8, r10, r9)     // Catch:{ TimeoutException -> 0x0105 }
            java.lang.Object r2 = X.C71055OaX.A00(r9, r7, r2)     // Catch:{ TimeoutException -> 0x0105 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ TimeoutException -> 0x0105 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r12 = 0
            java.util.Iterator r11 = X.AnonymousClass7TF.A0u(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r19 = 0
        L_0x0086:
            boolean r2 = r11.hasNext()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            if (r2 == 0) goto L_0x00df
            java.lang.Object r3 = X.C51971G9r.A0p(r11)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            X.C71055OaX.A01(r3, r9, r14)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = r3.getPath()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            if (r2 == 0) goto L_0x00a9
            java.io.File r2 = X.AnonymousClass7TE.A0t(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = r2.getName()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            X.0qQ.A07(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r7.add(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
        L_0x00a9:
            java.util.List r2 = X.C70855OOk.A00(r3, r9)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
        L_0x00b5:
            boolean r2 = r3.hasNext()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            if (r2 == 0) goto L_0x00bf
            X.C66584MXp.A17(r8, r3)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            goto L_0x00b5
        L_0x00bf:
            java.util.Iterator r10 = r8.iterator()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
        L_0x00c3:
            boolean r2 = r10.hasNext()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            if (r2 == 0) goto L_0x0086
            java.lang.String r8 = X.AnonymousClass7TE.A18(r10)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            if (r8 == 0) goto L_0x00dd
            java.io.File r2 = X.AnonymousClass7TE.A0t(r8)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            long r2 = r2.length()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            long r19 = r19 + r2
            r6.add(r8)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            goto L_0x00c3
        L_0x00dd:
            r12 = 1
            goto L_0x00c3
        L_0x00df:
            if (r12 != 0) goto L_0x00f1
            java.lang.Integer r16 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r17 = r13
            r18 = r7
            r15.A00(r16, r17, r18, r19)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = "_SUCCEEDED"
            X.C66583MXo.A1E(r4, r13, r2, r0)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            goto L_0x0184
        L_0x00f1:
            java.lang.Integer r16 = X.AnonymousClass05K.A0C     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r17 = r13
            r18 = r7
            r15.A00(r16, r17, r18, r19)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r3 = X.002.A0R(r13, r5)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = "URI_IS_NULL"
            r4.flowMarkError(r0, r3, r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            goto L_0x0184
        L_0x0105:
            r8 = move-exception
            java.lang.String r7 = "BugReporterFileUtil"
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = "Cancelling "
            r10.append(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r10.append(r13)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = " after "
            r10.append(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            X.0Tu r11 = X.0Tu.A05     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r2 = 36605834465908036(0x820cd0000c1544, double:3.213015343879944E-306)
            long r2 = X.182.A01(r11, r9, r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            r10.append(r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = "ms"
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r2, r10)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            X.0KC.A0H(r7, r2, r8)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = "_TIMEOUT"
            X.C66583MXo.A1E(r4, r13, r2, r0)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            java.lang.String r2 = "timeout"
            r15.A01(r13, r2)     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            X.0sn r2 = X.0sn.A00     // Catch:{ IOException -> 0x016c, ExecutionException -> 0x013d }
            return r2
        L_0x013d:
            r7 = move-exception
            java.lang.String r3 = "BugReportComposerFragment"
            java.lang.String r2 = "Failed to generate attachment for "
            java.lang.String r2 = X.002.A0R(r2, r13)
            X.0KC.A0F(r3, r2, r7)
            java.lang.String r2 = r7.toString()
            r15.A01(r13, r2)
            java.lang.String r3 = X.002.A0R(r13, r5)
            r2 = 477(0x1dd, float:6.68E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            goto L_0x0181
        L_0x015b:
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            r19 = 0
            X.0sn r18 = X.0sn.A00
            r17 = r13
            r15.A00(r16, r17, r18, r19)
            java.lang.String r2 = "_FINISHED_NO_LOGS"
            X.C66583MXo.A1E(r4, r13, r2, r0)
            goto L_0x0184
        L_0x016c:
            r7 = move-exception
            java.lang.String r3 = "BugReportComposerFragment"
            java.lang.String r2 = "Could not create log file for file attachment."
            X.0KC.A0F(r3, r2, r7)
            java.lang.String r2 = r7.toString()
            r15.A01(r13, r2)
            java.lang.String r3 = X.002.A0R(r13, r5)
            java.lang.String r2 = "IO_EXCEPTION"
        L_0x0181:
            r4.flowMarkError(r0, r3, r2)
        L_0x0184:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x018c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r12 = r1.next()
            java.lang.String r12 = (java.lang.String) r12
            X.3uA[] r0 = com.meta.flytrap.attachment.model.BugReportAttachment.A05
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r11 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.NON_MEDIA
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r10 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource.NON_MEDIA
            com.meta.flytrap.attachment.model.BugReportAttachment r9 = new com.meta.flytrap.attachment.model.BugReportAttachment
            r9.<init>(r10, r11, r12, r13, r14)
            r2.add(r9)
            goto L_0x018c
        L_0x01a7:
            java.lang.Object r8 = r2.A06
            X.28l r8 = (X.AnonymousClass28l) r8
            java.lang.String r7 = r8.getFilenamePrefix()
            java.lang.String r0 = r8.getFilenameSuffix()
            if (r0 == 0) goto L_0x01b9
            java.lang.String r7 = X.002.A0R(r7, r0)
        L_0x01b9:
            java.lang.Object r6 = r2.A03
            X.ONP r6 = (X.ONP) r6
            java.lang.String r1 = r8.getTag()
            java.lang.String r0 = r2.A09
            r6.A02(r7, r1, r0)
            java.lang.Object r5 = r2.A08
            com.facebook.quicklog.reliability.UserFlowLogger r5 = (com.facebook.quicklog.reliability.UserFlowLogger) r5
            long r0 = r2.A01
            java.lang.String r4 = r8.getTag()
            java.lang.String r3 = "_START"
            X.C66583MXo.A1E(r5, r4, r3, r0)
            java.lang.Object r12 = r2.A07     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            X.0lg r12 = (X.0lg) r12     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.Object r10 = r2.A05     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.util.concurrent.ExecutorService r10 = (java.util.concurrent.ExecutorService) r10     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.Object r9 = r2.A02     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            r4 = 49
            X.IwP r3 = new X.IwP     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            r3.<init>((int) r4, (java.lang.Object) r9, (java.lang.Object) r8)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.Object r11 = X.C71055OaX.A00(r12, r10, r3)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            if (r11 == 0) goto L_0x026f
            java.lang.Object r9 = r2.A04     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            X.OKE r9 = (X.OKE) r9     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r4 = r8.getFilenamePrefix()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r3 = r8.getFilenameSuffix()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.io.File r10 = r9.A00(r4, r3)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            android.net.Uri r4 = X.LRG.A00(r10, r11)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            if (r4 == 0) goto L_0x02e9
            r3 = 1
            X.C71055OaX.A01(r4, r12, r3)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.util.List r3 = X.C70855OOk.A00(r4, r12)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            if (r3 == 0) goto L_0x02e9
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r3)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
        L_0x0216:
            boolean r3 = r4.hasNext()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            if (r3 == 0) goto L_0x0220
            X.C66584MXp.A17(r9, r4)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            goto L_0x0216
        L_0x0220:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
        L_0x0224:
            boolean r3 = r9.hasNext()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            if (r3 == 0) goto L_0x02e9
            java.lang.Object r12 = r9.next()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            if (r12 == 0) goto L_0x0260
            java.lang.String r4 = r8.getTag()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r3 = "_SUCCEEDED"
            X.C66583MXo.A1E(r5, r4, r3, r0)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.Integer r9 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            long r3 = r10.length()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            r6.A00(r9, r7, r3)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            X.3uA[] r3 = com.meta.flytrap.attachment.model.BugReportAttachment.A05     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r13 = r8.getTag()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r11 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.NON_MEDIA     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r10 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource.NON_MEDIA     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            boolean r3 = r8.getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            boolean r14 = X.AnonymousClass7TF.A1Q(r3)
            com.meta.flytrap.attachment.model.BugReportAttachment r9 = new com.meta.flytrap.attachment.model.BugReportAttachment     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.util.List r2 = X.AnonymousClass7TE.A1I(r9)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            return r2
        L_0x0260:
            java.lang.String r4 = r8.getTag()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r3 = "_FAILED_URI_IS_NULL"
            X.C66583MXo.A1E(r5, r4, r3, r0)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r3 = "URI is null"
            r6.A01(r7, r3)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            goto L_0x0224
        L_0x026f:
            java.lang.String r4 = r8.getTag()     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.String r3 = "_FINISHED_NO_LOGS"
            X.C66583MXo.A1E(r5, r4, r3, r0)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            java.lang.Integer r9 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            r3 = 0
            r6.A00(r9, r7, r3)     // Catch:{ IOException -> 0x02b0, TimeoutException -> 0x0280, ExecutionException -> 0x02c6 }
            goto L_0x02e9
        L_0x0280:
            r11 = move-exception
            java.lang.String r10 = "BugReportComposerFragment"
            java.lang.String r12 = "Could not create log file for attachment within timeout of "
            java.lang.Object r9 = r2.A07
            X.0lg r9 = (X.0lg) r9
            X.0Tu r4 = X.0Tu.A05
            r2 = 36605834465908036(0x820cd0000c1544, double:3.213015343879944E-306)
            long r2 = X.182.A01(r4, r9, r2)
            java.lang.String r9 = "ms for "
            java.lang.String r4 = r8.getTag()
            java.lang.String r2 = X.002.A0r(r12, r9, r4, r2)
            X.0KC.A0F(r10, r2, r11)
            java.lang.String r3 = r8.getTag()
            java.lang.String r2 = "_TIMEOUT"
            X.C66583MXo.A1E(r5, r3, r2, r0)
            java.lang.String r0 = "timeout"
            r6.A01(r7, r0)
            goto L_0x02e9
        L_0x02b0:
            r4 = move-exception
            java.lang.String r3 = "BugReportComposerFragment"
            java.lang.String r2 = "Could not create log file for attachment."
            X.0KC.A0F(r3, r2, r4)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = r8.getTag()
            r3.append(r2)
            java.lang.String r2 = "_FAILED_IO_EXCEPTION"
            goto L_0x02db
        L_0x02c6:
            r4 = move-exception
            java.lang.String r3 = "BugReportComposerFragment"
            java.lang.String r2 = "Failed generating attachment"
            X.0KC.A0F(r3, r2, r4)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = r8.getTag()
            r3.append(r2)
            java.lang.String r2 = "_FAILED_EXECUTION_EXCEPTION"
        L_0x02db:
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r2, r3)
            r5.flowMarkPoint(r0, r2)
            java.lang.String r0 = r4.toString()
            r6.A01(r7, r0)
        L_0x02e9:
            X.0sn r2 = X.0sn.A00
        L_0x02eb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73455Pcx.get():java.lang.Object");
    }
}
