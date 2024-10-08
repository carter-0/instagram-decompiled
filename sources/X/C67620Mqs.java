package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Mqs  reason: case insensitive filesystem */
public abstract class C67620Mqs {
    public static final C67623Mqv A04 = new Handler(Looper.getMainLooper());
    public static volatile C61480nO A05 = 0nY.A00();
    public final C73438Pcg A00;
    public final 0nc A01;
    public final AtomicBoolean A02 = new AtomicBoolean();
    public volatile Integer A03 = AnonymousClass05K.A00;

    public void A05(Object obj) {
    }

    public final void A02(Object... objArr) {
        C61480nO r2 = A05;
        if (this.A03 != AnonymousClass05K.A00) {
            int intValue = this.A03.intValue();
            if (intValue == 1) {
                throw AnonymousClass7TE.A0z("Cannot execute task: the task is already running.");
            } else if (intValue == 2) {
                throw AnonymousClass7TE.A0z("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.A03 = AnonymousClass05K.A01;
        A04();
        this.A00.A00 = objArr;
        r2.ATD(this.A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(java.lang.Object... r36) {
        /*
            r35 = this;
            r2 = r35
            r1 = r36
            boolean r0 = r2 instanceof X.NMN
            if (r0 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            boolean r0 = r2 instanceof X.NMO
            if (r0 == 0) goto L_0x0075
            r0 = r2
            X.NMO r0 = (X.NMO) r0
            java.lang.String[] r1 = (java.lang.String[]) r1
            r6 = 0
            X.0qQ.A0B(r1, r6)
            r5 = 0
            r3 = r1[r6]     // Catch:{ IOException -> 0x006c }
            if (r3 == 0) goto L_0x006b
            X.2kK r4 = new X.2kK     // Catch:{ IOException -> 0x006c }
            r4.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x006c }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x006c }
            r2.<init>()     // Catch:{ IOException -> 0x006c }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x006c }
            int r1 = X.0nA.A06(r0)     // Catch:{ IOException -> 0x006c }
            int r0 = X.0nA.A05(r0)     // Catch:{ IOException -> 0x006c }
            int r0 = X.1MF.A01(r3, r1, r0)     // Catch:{ IOException -> 0x006c }
            r2.inSampleSize = r0     // Catch:{ IOException -> 0x006c }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r2)     // Catch:{ IOException -> 0x006c }
            if (r3 == 0) goto L_0x006b
            r3.prepareToDraw()     // Catch:{ IOException -> 0x006c }
            r0 = 2394(0x95a, float:3.355E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x006c }
            int r2 = r4.A0M(r0, r6)     // Catch:{ IOException -> 0x006c }
            r0 = 6
            if (r2 == r0) goto L_0x005a
            r0 = 8
            if (r2 == r0) goto L_0x005a
            int r0 = r3.getWidth()     // Catch:{ IOException -> 0x006c }
            float r1 = (float) r0     // Catch:{ IOException -> 0x006c }
            int r0 = r3.getHeight()     // Catch:{ IOException -> 0x006c }
            goto L_0x0063
        L_0x005a:
            int r0 = r3.getHeight()     // Catch:{ IOException -> 0x006c }
            float r1 = (float) r0     // Catch:{ IOException -> 0x006c }
            int r0 = r3.getWidth()     // Catch:{ IOException -> 0x006c }
        L_0x0063:
            float r0 = (float) r0     // Catch:{ IOException -> 0x006c }
            float r1 = r1 / r0
            X.ODa r0 = new X.ODa     // Catch:{ IOException -> 0x006c }
            r0.<init>(r3, r1, r2)     // Catch:{ IOException -> 0x006c }
            return r0
        L_0x006b:
            return r5
        L_0x006c:
            r2 = move-exception
            java.lang.String r1 = "DirectMediaViewerBitmapLoaderTask"
            java.lang.String r0 = "Failed to decode bitmap from disk."
            X.0wb.A06(r1, r0, r2)
            return r5
        L_0x0075:
            boolean r0 = r2 instanceof X.NMP
            if (r0 == 0) goto L_0x02a0
            r5 = r2
            X.NMP r5 = (X.NMP) r5
            X.Pwg r2 = r5.A06
            if (r2 != 0) goto L_0x0086
            X.0lg r0 = r5.A08
            X.Pwg r2 = X.C70853OOi.A01(r0)
        L_0x0086:
            r5.A00 = r2
            com.instagram.bugreporter.model.BugReport r0 = r5.A01
            com.instagram.bugreporter.source.BugReportSource r1 = r0.A00
            java.lang.String r14 = "userFlowLoggerV2"
            r8 = 0
            if (r2 == 0) goto L_0x04b0
            java.lang.String r0 = r0.A0G
            r2.AW2(r1, r0)
            X.0lg r4 = r5.A08
            r3 = 0
            X.ONP r10 = new X.ONP
            r10.<init>(r4)
            com.instagram.bugreporter.model.BugReport r0 = r5.A01
            java.util.Map r0 = r0.A0N
            java.util.LinkedHashMap r2 = X.0Yt.A03(r0)
            com.instagram.bugreporter.model.BugReport r0 = r5.A01
            java.lang.String r1 = r0.A0G
            java.lang.String r9 = "black_box_trace_id"
            java.lang.String r0 = "LaunchBugReporterTask.addBlackBoxTrace"
            r10.A02(r9, r0, r1)
            java.lang.Class<X.0tQ> r0 = X.0tQ.class
            java.lang.Object r12 = r4.A00(r0)
            X.0tQ r12 = (X.0tQ) r12
            if (r12 == 0) goto L_0x0176
            java.lang.String[] r7 = new java.lang.String[r3]
            r0 = 2732(0xaac, float:3.828E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r1 = 30539777(0x1d20001, float:7.714182E-38)
            r0 = 1
            X.0Up r11 = X.0Uo.A00(r6, r7, r1, r0)
            X.0yy r7 = X.AnonymousClass0Wc.A00()
            if (r11 != 0) goto L_0x0172
            java.lang.String r0 = "none"
        L_0x00d3:
            java.lang.String r6 = "IgProfiloSessionManager"
            java.lang.String r1 = "Bugreport Blackbox trace collection requested. Trace Id: "
            r7.A03(r6, r0, r1)
            r12.A01 = r11
            if (r11 == 0) goto L_0x0176
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x0176
            r2.put(r9, r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            int r0 = r0.length()
            long r0 = (long) r0
            r10.A00(r6, r9, r0)
        L_0x00ef:
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0135
            r0 = r4
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.0qQ.A0B(r0, r3)
            X.1Am r6 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A1G
            java.lang.Class<X.O90> r0 = X.O90.class
            X.0xa r7 = r6.A04(r1, r0)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = "dogfooding_assistant_expire_time"
            r0 = 0
            long r9 = r7.getLong(r13, r0)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x016b
            r6 = r8
        L_0x011a:
            long r11 = java.lang.System.currentTimeMillis()
            long r9 = r7.getLong(r13, r0)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0164
            r0 = r8
        L_0x0127:
            if (r6 == 0) goto L_0x012e
            java.lang.String r1 = "dogfooding_assistant_tag"
            r2.put(r1, r6)
        L_0x012e:
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = "dogfooding_assistant_owner"
            r2.put(r1, r0)
        L_0x0135:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C238713Dd.A00
            java.lang.String r1 = "last_user_restriction_sentry_block_event"
            X.0tX r0 = X.0xn.A01(r1)
            java.lang.String r1 = r0.getString(r1, r8)
            if (r1 == 0) goto L_0x0148
            java.lang.String r0 = "sentry_block_event"
            r2.put(r0, r1)
        L_0x0148:
            com.instagram.bugreporter.model.BugReport r0 = r5.A01
            java.util.List r6 = r0.A0K
            java.util.List r1 = r0.A0L
            java.lang.String r0 = "Could not create temporary file for screenshot."
            r13 = 0
            java.lang.String r7 = "This operation can't be run on UI thread."
            X.11Z.A05(r7)
            android.graphics.Bitmap r10 = r5.A04
            if (r10 == 0) goto L_0x0243
            X.Pwg r8 = r5.A00
            if (r8 == 0) goto L_0x04b0
            java.lang.String r7 = "save_and_attach_local_screenshot_start"
            r8.AVy(r7)
            goto L_0x017d
        L_0x0164:
            java.lang.String r0 = "dogfooding_assistant_user"
            java.lang.String r0 = r7.getString(r0, r8)
            goto L_0x0127
        L_0x016b:
            java.lang.String r6 = "dogfooding_assistant_tag"
            java.lang.String r6 = r7.getString(r6, r8)
            goto L_0x011a
        L_0x0172:
            java.lang.String r0 = r11.A01
            goto L_0x00d3
        L_0x0176:
            java.lang.String r0 = "id is null"
            r10.A01(r9, r0)
            goto L_0x00ef
        L_0x017d:
            X.OKE r11 = r5.A07     // Catch:{ IOException -> 0x022d }
            int r12 = r6.size()     // Catch:{ IOException -> 0x022d }
            X.OV8 r7 = r11.A00     // Catch:{ IOException -> 0x022d }
            java.io.File r9 = r7.A00()     // Catch:{ IOException -> 0x022d }
            java.lang.String r8 = "screenshot_"
            java.lang.String r7 = ".png"
            java.lang.String r7 = X.002.A0c(r8, r7, r12)     // Catch:{ IOException -> 0x022d }
            java.io.File r9 = X.JTO.A0s(r9, r7)     // Catch:{ IOException -> 0x022d }
            X.LRG r8 = X.LRG.A00     // Catch:{ IOException -> 0x022d }
            X.0lg r7 = r11.A01     // Catch:{ IOException -> 0x022d }
            java.lang.Object r8 = r8.A02(r10, r7, r9)     // Catch:{ IOException -> 0x022d }
            java.lang.Throwable r9 = X.0eR.A00(r8)     // Catch:{ IOException -> 0x022d }
            if (r9 != 0) goto L_0x0227
            boolean r7 = r8 instanceof X.0eQ     // Catch:{ IOException -> 0x022d }
            if (r7 == 0) goto L_0x01a8
            r8 = r13
        L_0x01a8:
            android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ IOException -> 0x022d }
            if (r8 == 0) goto L_0x0215
            java.lang.String r18 = r8.getPath()     // Catch:{ IOException -> 0x022d }
            if (r18 == 0) goto L_0x01c4
            X.3uA[] r7 = com.meta.flytrap.attachment.model.BugReportAttachment.A05     // Catch:{ IOException -> 0x022d }
            java.lang.String r19 = "LaunchBugReporterTask"
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r17 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.SCREENSHOT     // Catch:{ IOException -> 0x022d }
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r16 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource.BUG_REPORTER     // Catch:{ IOException -> 0x022d }
            r20 = 1
            com.meta.flytrap.attachment.model.BugReportAttachment r15 = new com.meta.flytrap.attachment.model.BugReportAttachment     // Catch:{ IOException -> 0x022d }
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x022d }
            r6.add(r15)     // Catch:{ IOException -> 0x022d }
        L_0x01c4:
            java.util.List r7 = X.C70855OOk.A00(r8, r4)     // Catch:{ IOException -> 0x022d }
            if (r7 == 0) goto L_0x0215
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x022d }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ IOException -> 0x022d }
        L_0x01d2:
            boolean r7 = r8.hasNext()     // Catch:{ IOException -> 0x022d }
            if (r7 == 0) goto L_0x01e8
            java.lang.Object r7 = r8.next()     // Catch:{ IOException -> 0x022d }
            android.net.Uri r7 = (android.net.Uri) r7     // Catch:{ IOException -> 0x022d }
            java.lang.String r7 = r7.getPath()     // Catch:{ IOException -> 0x022d }
            if (r7 == 0) goto L_0x01d2
            r10.add(r7)     // Catch:{ IOException -> 0x022d }
            goto L_0x01d2
        L_0x01e8:
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r10)     // Catch:{ IOException -> 0x022d }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x022d }
        L_0x01f0:
            boolean r7 = r10.hasNext()     // Catch:{ IOException -> 0x022d }
            if (r7 == 0) goto L_0x0212
            java.lang.Object r8 = r10.next()     // Catch:{ IOException -> 0x022d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x022d }
            X.3uA[] r7 = com.meta.flytrap.attachment.model.BugReportAttachment.A05     // Catch:{ IOException -> 0x022d }
            java.lang.String r19 = "LaunchBugReporterTask"
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r17 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.SCREENSHOT     // Catch:{ IOException -> 0x022d }
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r16 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource.BUG_REPORTER     // Catch:{ IOException -> 0x022d }
            r20 = 1
            com.meta.flytrap.attachment.model.BugReportAttachment r7 = new com.meta.flytrap.attachment.model.BugReportAttachment     // Catch:{ IOException -> 0x022d }
            r15 = r7
            r18 = r8
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x022d }
            r9.add(r7)     // Catch:{ IOException -> 0x022d }
            goto L_0x01f0
        L_0x0212:
            r1.add(r9)     // Catch:{ IOException -> 0x022d }
        L_0x0215:
            X.Pwg r8 = r5.A00     // Catch:{ IOException -> 0x022d }
            if (r8 != 0) goto L_0x0221
            X.0qQ.A0F(r14)     // Catch:{ IOException -> 0x022d }
            X.00P r7 = X.AnonymousClass00P.createAndThrow()
            goto L_0x022c
        L_0x0221:
            java.lang.String r7 = "save_and_attach_local_screenshot_success"
            r8.AVy(r7)     // Catch:{ IOException -> 0x022d }
            goto L_0x0243
        L_0x0227:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x022d }
            r7.<init>(r0, r9)     // Catch:{ IOException -> 0x022d }
        L_0x022c:
            throw r7     // Catch:{ IOException -> 0x022d }
        L_0x022d:
            r9 = move-exception
            java.lang.String r7 = "LaunchBugReporterTask"
            X.0KC.A0F(r7, r0, r9)
            X.Pwg r8 = r5.A00
            if (r8 == 0) goto L_0x04b0
            r0 = 29
            X.Iwb r7 = new X.Iwb
            r7.<init>(r9, r0)
            java.lang.String r0 = "save_and_attach_local_screenshot_failure"
            r8.AW0(r0, r7)
        L_0x0243:
            X.OWB r7 = new X.OWB
            r7.<init>()
            com.instagram.bugreporter.model.BugReport r0 = r5.A01
            r7.A02(r0)
            X.0qQ.A0B(r6, r3)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r6)
            r7.A0K = r0
            X.0qQ.A0B(r1, r3)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r1)
            r7.A0L = r0
            X.0qQ.A0B(r2, r3)
            r7.A0N = r2
            java.lang.String r0 = X.C69638NpL.A00
            if (r0 == 0) goto L_0x026a
            r7.A0F = r0
        L_0x026a:
            com.instagram.bugreporter.model.BugReport r0 = r7.A01()
            r5.A01 = r0
            android.app.Activity r1 = r5.A03
            java.lang.Class<com.instagram.bugreporter.BugReporterActivity> r0 = com.instagram.bugreporter.BugReporterActivity.class
            android.content.Intent r2 = X.C66580MXl.A0A(r1, r0)
            X.OVq r1 = X.C70995OVq.A00
            com.instagram.bugreporter.model.BugReport r0 = r5.A01
            r1.A01(r2, r0, r4)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            com.instagram.bugreporter.BugReportComposerViewModel r1 = r5.A05
            java.lang.String r0 = "BugReporterActivity.INTENT_EXTRA_VIEWMODEL"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r4.getToken()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putExtra(r0, r1)
            X.Pwg r0 = r5.A00
            if (r0 == 0) goto L_0x04b0
            android.os.Bundle r0 = r0.E2f()
            r2.putExtras(r0)
            return r2
        L_0x02a0:
            r0 = r2
            X.NMM r0 = (X.NMM) r0
            com.instagram.bugreporter.BugReportComposerFragment r11 = r0.A00
            r10 = 1
            r11.A0A = r10
            r20 = 0
            java.util.List r15 = r0.A01     // Catch:{ Exception -> 0x04a9 }
            java.util.List r9 = r0.A02     // Catch:{ Exception -> 0x04a9 }
            X.Pwg r1 = r11.A07     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r19 = "userFlowLoggerV2"
            if (r1 == 0) goto L_0x0498
            java.lang.String r0 = "processing_logs_start"
            r1.AVy(r0)     // Catch:{ Exception -> 0x04a9 }
            com.facebook.quicklog.reliability.UserFlowLogger r2 = r11.A03     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r18 = "userFlowLogger"
            if (r2 == 0) goto L_0x0494
            r1 = 396366653(0x17a0133d, float:1.0344614E-24)
            java.lang.String r0 = "collect_attachments"
            long r0 = r2.flowStartForMarker(r1, r0, r10)     // Catch:{ Exception -> 0x04a9 }
            r11.A00 = r0     // Catch:{ Exception -> 0x04a9 }
            androidx.fragment.app.FragmentActivity r22 = r11.requireActivity()     // Catch:{ Exception -> 0x04a9 }
            X.0wW r8 = r11.getSession()     // Catch:{ Exception -> 0x04a9 }
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r17 = "bugReport"
            if (r0 == 0) goto L_0x042c
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8     // Catch:{ Exception -> 0x04a9 }
            com.instagram.bugreporter.model.BugReport r7 = r11.A08     // Catch:{ Exception -> 0x04a9 }
            if (r7 == 0) goto L_0x049c
            com.facebook.quicklog.reliability.UserFlowLogger r6 = r11.A03     // Catch:{ Exception -> 0x04a9 }
            if (r6 == 0) goto L_0x0494
            long r0 = r11.A00     // Catch:{ Exception -> 0x04a9 }
            r33 = r0
            java.lang.String r13 = r7.A0G     // Catch:{ Exception -> 0x04a9 }
            r12 = 0
            X.DbW.A1O(r8, r10, r13)     // Catch:{ Exception -> 0x04a9 }
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ Exception -> 0x04a9 }
            X.0qQ.A0A(r5)     // Catch:{ all -> 0x04a4 }
            java.lang.String r0 = "This operation can't be run on UI thread."
            X.11Z.A05(r0)     // Catch:{ all -> 0x04a4 }
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x04a4 }
            X.ONP r14 = new X.ONP     // Catch:{ all -> 0x04a4 }
            r14.<init>(r8)     // Catch:{ all -> 0x04a4 }
            X.28d r3 = X.28c.A00(r8)     // Catch:{ all -> 0x04a4 }
            X.OKE r2 = new X.OKE     // Catch:{ all -> 0x04a4 }
            r2.<init>(r7, r8)     // Catch:{ all -> 0x04a4 }
            java.util.ArrayList r0 = r3.A02     // Catch:{ all -> 0x04a4 }
            java.util.Iterator r16 = X.DbY.A0o(r0)     // Catch:{ all -> 0x04a4 }
        L_0x0310:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x04a4 }
            if (r0 == 0) goto L_0x0340
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x04a4 }
            X.28l r1 = (X.AnonymousClass28l) r1     // Catch:{ all -> 0x04a4 }
            X.Pcx r0 = new X.Pcx     // Catch:{ all -> 0x04a4 }
            r24 = r1
            r25 = r14
            r26 = r2
            r27 = r8
            r28 = r5
            r29 = r13
            r30 = r12
            r31 = r33
            r21 = r0
            r23 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture r0 = java.util.concurrent.CompletableFuture.supplyAsync(r0, r5)     // Catch:{ all -> 0x04a4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x04a4 }
            r4.add(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x0310
        L_0x0340:
            java.util.ArrayList r0 = r3.A01     // Catch:{ all -> 0x04a4 }
            java.util.Iterator r16 = X.DbY.A0o(r0)     // Catch:{ all -> 0x04a4 }
        L_0x0346:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x04a4 }
            if (r0 == 0) goto L_0x0376
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x04a4 }
            X.29P r1 = (X.29P) r1     // Catch:{ all -> 0x04a4 }
            X.Pcw r0 = new X.Pcw     // Catch:{ all -> 0x04a4 }
            r23 = r1
            r24 = r14
            r25 = r2
            r26 = r8
            r27 = r5
            r28 = r13
            r29 = r12
            r30 = r33
            r21 = r0
            r22 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture r0 = java.util.concurrent.CompletableFuture.supplyAsync(r0, r5)     // Catch:{ all -> 0x04a4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x04a4 }
            r4.add(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x0346
        L_0x0376:
            java.util.ArrayList r0 = r3.A03     // Catch:{ all -> 0x04a4 }
            java.util.Iterator r2 = X.DbY.A0o(r0)     // Catch:{ all -> 0x04a4 }
        L_0x037c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x04a4 }
            if (r0 == 0) goto L_0x03ac
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x04a4 }
            X.2BS r1 = (X.AnonymousClass2BS) r1     // Catch:{ all -> 0x04a4 }
            X.Pcw r0 = new X.Pcw     // Catch:{ all -> 0x04a4 }
            r23 = r8
            r24 = r14
            r25 = r7
            r26 = r1
            r27 = r5
            r28 = r13
            r29 = r10
            r30 = r33
            r21 = r0
            r22 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture r0 = java.util.concurrent.CompletableFuture.supplyAsync(r0, r5)     // Catch:{ all -> 0x04a4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x04a4 }
            r4.add(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x037c
        L_0x03ac:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x04a4 }
            X.OMO r22 = new X.OMO     // Catch:{ all -> 0x04a4 }
            r22.<init>()     // Catch:{ all -> 0x04a4 }
            X.OKE r1 = new X.OKE     // Catch:{ all -> 0x04a4 }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x04a4 }
            java.util.ArrayList r0 = r3.A00     // Catch:{ all -> 0x04a4 }
            java.util.Iterator r14 = X.DbY.A0o(r0)     // Catch:{ all -> 0x04a4 }
        L_0x03c0:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x04a4 }
            if (r0 == 0) goto L_0x03f0
            java.lang.Object r3 = r14.next()     // Catch:{ all -> 0x04a4 }
            X.29o r3 = (X.29o) r3     // Catch:{ all -> 0x04a4 }
            X.Pcx r0 = new X.Pcx     // Catch:{ all -> 0x04a4 }
            r24 = r3
            r25 = r7
            r26 = r1
            r27 = r8
            r28 = r5
            r29 = r13
            r30 = r10
            r31 = r33
            r21 = r0
            r23 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture r0 = java.util.concurrent.CompletableFuture.supplyAsync(r0, r5)     // Catch:{ all -> 0x04a4 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x04a4 }
            r2.add(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x03c0
        L_0x03f0:
            r4.addAll(r2)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture[] r0 = new java.util.concurrent.CompletableFuture[r12]     // Catch:{ all -> 0x04a4 }
            java.lang.Object[] r1 = r4.toArray(r0)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture[] r1 = (java.util.concurrent.CompletableFuture[]) r1     // Catch:{ all -> 0x04a4 }
            int r0 = r1.length     // Catch:{ all -> 0x04a4 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture[] r0 = (java.util.concurrent.CompletableFuture[]) r0     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture r0 = java.util.concurrent.CompletableFuture.allOf(r0)     // Catch:{ all -> 0x04a4 }
            r0.join()     // Catch:{ all -> 0x04a4 }
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r4)     // Catch:{ all -> 0x04a4 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x04a4 }
        L_0x0411:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04a4 }
            if (r0 == 0) goto L_0x0427
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x04a4 }
            java.util.concurrent.CompletableFuture r0 = (java.util.concurrent.CompletableFuture) r0     // Catch:{ all -> 0x04a4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x04a4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x04a4 }
            r2.add(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x0411
        L_0x0427:
            java.util.ArrayList r0 = X.0Yv.A1F(r2)     // Catch:{ all -> 0x04a4 }
            goto L_0x042e
        L_0x042c:
            r0 = r15
            goto L_0x0431
        L_0x042e:
            r5.shutdown()     // Catch:{ Exception -> 0x04a9 }
        L_0x0431:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x04a9 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x04a9 }
        L_0x043d:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x04a9 }
            if (r0 == 0) goto L_0x0456
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x04a9 }
            r0 = r1
            com.meta.flytrap.attachment.model.BugReportAttachment r0 = (com.meta.flytrap.attachment.model.BugReportAttachment) r0     // Catch:{ Exception -> 0x04a9 }
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x04a9 }
            if (r0 == 0) goto L_0x0452
            r5.add(r1)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x043d
        L_0x0452:
            r4.add(r1)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x043d
        L_0x0456:
            com.facebook.quicklog.reliability.UserFlowLogger r3 = r11.A03     // Catch:{ Exception -> 0x04a9 }
            if (r3 == 0) goto L_0x0494
            long r1 = r11.A00     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r0 = "ALL_ATTACHMENTS_ATTACHED"
            r3.flowMarkPoint(r1, r0)     // Catch:{ Exception -> 0x04a9 }
            com.instagram.bugreporter.model.BugReport r2 = r11.A08     // Catch:{ Exception -> 0x04a9 }
            if (r2 == 0) goto L_0x049c
            java.util.ArrayList r1 = X.00k.A0S(r5, r15)     // Catch:{ Exception -> 0x04a9 }
            java.util.ArrayList r0 = X.00k.A0S(r4, r9)     // Catch:{ Exception -> 0x04a9 }
            com.instagram.bugreporter.model.BugReport r0 = com.instagram.bugreporter.BugReportComposerFragment.A00(r11, r2, r1, r0)     // Catch:{ Exception -> 0x04a9 }
            r11.A08 = r0     // Catch:{ Exception -> 0x04a9 }
            com.facebook.quicklog.reliability.UserFlowLogger r3 = r11.A03     // Catch:{ Exception -> 0x04a9 }
            if (r3 == 0) goto L_0x0494
            long r1 = r11.A00     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r0 = "BUG_REPORT_BUILT"
            r3.flowMarkPoint(r1, r0)     // Catch:{ Exception -> 0x04a9 }
            com.facebook.quicklog.reliability.UserFlowLogger r2 = r11.A03     // Catch:{ Exception -> 0x04a9 }
            if (r2 == 0) goto L_0x0494
            long r0 = r11.A00     // Catch:{ Exception -> 0x04a9 }
            r2.flowEndSuccess(r0)     // Catch:{ Exception -> 0x04a9 }
            r0 = 0
            r11.A0A = r0     // Catch:{ Exception -> 0x04a9 }
            X.Pwg r1 = r11.A07     // Catch:{ Exception -> 0x04a9 }
            if (r1 == 0) goto L_0x0498
            java.lang.String r0 = "processing_logs_success"
            r1.AVy(r0)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x04d6
        L_0x0494:
            X.0qQ.A0F(r18)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x049f
        L_0x0498:
            X.0qQ.A0F(r19)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x049f
        L_0x049c:
            X.0qQ.A0F(r17)     // Catch:{ Exception -> 0x04a9 }
        L_0x049f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x04a9 }
            goto L_0x04a8
        L_0x04a4:
            r0 = move-exception
            r5.shutdown()     // Catch:{ Exception -> 0x04a9 }
        L_0x04a8:
            throw r0     // Catch:{ Exception -> 0x04a9 }
        L_0x04a9:
            r5 = move-exception
            com.facebook.quicklog.reliability.UserFlowLogger r4 = r11.A03
            if (r4 != 0) goto L_0x04b8
            java.lang.String r14 = "userFlowLogger"
        L_0x04b0:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04b8:
            long r2 = r11.A00
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "process logs exception"
            r4.flowEndFail(r2, r0, r1)
            X.Pwg r2 = r11.A07
            if (r2 != 0) goto L_0x04ca
            java.lang.String r14 = "userFlowLoggerV2"
            goto L_0x04b0
        L_0x04ca:
            r0 = 24
            X.Iwb r1 = new X.Iwb
            r1.<init>(r5, r0)
            java.lang.String r0 = "processing_logs_failure"
            r2.AW0(r0, r1)
        L_0x04d6:
            r0 = 0
            r11.A0A = r0
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67620Mqs.A03(java.lang.Object[]):java.lang.Object");
    }

    public void A04() {
        AnonymousClass37D r0;
        if (this instanceof NMN) {
            C67614Mqm mqm = ((NMN) this).A00;
            if (!mqm.A02 && (r0 = mqm.A07) != null && !((AnonymousClass37F) r0).A0g) {
                mqm.A02 = true;
                C67614Mqm.A02(mqm);
            }
        } else if (this instanceof NMP) {
            NMP nmp = (NMP) this;
            Activity activity = nmp.A03;
            if (!activity.isDestroyed()) {
                AnonymousClass6ST r1 = new AnonymousClass6ST(activity, true);
                nmp.A02 = r1;
                r1.A00(activity.getString(2131954346));
                AnonymousClass6ST r02 = nmp.A02;
                if (r02 != null) {
                    AnonymousClass0fN.A00(r02);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public C67620Mqs() {
        C73438Pcg pcg = new C73438Pcg(this);
        this.A00 = pcg;
        this.A01 = new C67621Mqt(this, pcg);
    }
}
