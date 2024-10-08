package com.instagram.bugreporter;

public final class BugReportComposerFragment$onClickScreenshotThumbnail$1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BugReportComposerFragment A01;

    public BugReportComposerFragment$onClickScreenshotThumbnail$1(BugReportComposerFragment bugReportComposerFragment, int i) {
        this.A01 = bugReportComposerFragment;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.net.Uri r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            r3 = 30
            boolean r0 = X.C66146MDy.A02(r3, r13)
            if (r0 == 0) goto L_0x00b6
            r8 = r13
            X.MDy r8 = (X.C66146MDy) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b6
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r8.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r9 = 3
            r2 = 1
            r10 = 2
            r6 = 0
            if (r0 == 0) goto L_0x005f
            if (r0 == r2) goto L_0x0071
            if (r0 == r10) goto L_0x0093
            if (r0 != r9) goto L_0x00c5
            java.lang.Object r6 = r8.A02
            com.meta.flytrap.attachment.model.BugReportAttachment r6 = (com.meta.flytrap.attachment.model.BugReportAttachment) r6
            java.lang.Object r5 = r8.A01
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r5 = (com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1) r5
            X.0eS.A00(r4)
        L_0x0033:
            com.instagram.bugreporter.BugReportComposerFragment r3 = r5.A01
            com.instagram.bugreporter.model.BugReport r0 = r3.A08
            java.lang.String r2 = "bugReport"
            if (r0 == 0) goto L_0x00bd
            java.util.List r0 = r0.A0K
            int r1 = r5.A00
            r0.add(r1, r6)
            com.instagram.bugreporter.model.BugReport r0 = r3.A08
            if (r0 == 0) goto L_0x00bd
            java.util.List r0 = r0.A0L
            r0.add(r1, r4)
            com.instagram.bugreporter.model.BugReport r0 = r3.A08
            if (r0 == 0) goto L_0x00bd
            com.meta.flytrap.attachment.model.AttachmentCounter r2 = r0.A01
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r1 = r6.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.ArrayList r0 = r2.A00
            r0.add(r1)
            X.0gF r7 = X.C60340gF.A00
        L_0x005e:
            return r7
        L_0x005f:
            X.0eS.A00(r4)
            com.instagram.bugreporter.BugReportComposerFragment r1 = r11.A01
            int r0 = r11.A00
            X.C66146MDy.A00(r11, r12, r8, r2)
            java.lang.Object r0 = com.instagram.bugreporter.BugReportComposerFragment.A02(r1, r8, r0)
            if (r0 == r7) goto L_0x005e
            r5 = r11
            goto L_0x007c
        L_0x0071:
            java.lang.Object r12 = r8.A02
            android.net.Uri r12 = (android.net.Uri) r12
            java.lang.Object r5 = r8.A01
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r5 = (com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1) r5
            X.0eS.A00(r4)
        L_0x007c:
            X.0nV r3 = X.JTR.A0j(r9)
            com.instagram.bugreporter.BugReportComposerFragment r2 = r5.A01
            int r1 = r5.A00
            X.MHC r0 = new X.MHC
            r0.<init>((android.net.Uri) r12, (com.instagram.bugreporter.BugReportComposerFragment) r2, (X.AnonymousClass4D7) r6, (int) r1)
            X.C66146MDy.A00(r5, r6, r8, r10)
            java.lang.Object r4 = X.1Eo.A00(r8, r3, r0)
            if (r4 != r7) goto L_0x009a
            return r7
        L_0x0093:
            java.lang.Object r5 = r8.A01
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r5 = (com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1) r5
            X.0eS.A00(r4)
        L_0x009a:
            com.meta.flytrap.attachment.model.BugReportAttachment r4 = (com.meta.flytrap.attachment.model.BugReportAttachment) r4
            X.0nV r3 = X.JTR.A0j(r9)
            com.instagram.bugreporter.BugReportComposerFragment r2 = r5.A01
            r1 = 29
            X.MGZ r0 = new X.MGZ
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r2, (X.AnonymousClass4D7) r6, (int) r1)
            X.C66146MDy.A00(r5, r4, r8, r9)
            java.lang.Object r0 = X.1Eo.A00(r8, r3, r0)
            if (r0 == r7) goto L_0x005e
            r6 = r4
            r4 = r0
            goto L_0x0033
        L_0x00b6:
            X.MDy r8 = new X.MDy
            r8.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x00bd:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1.A00(android.net.Uri, X.4D7):java.lang.Object");
    }
}
