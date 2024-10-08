package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.7SJ  reason: invalid class name */
public final class AnonymousClass7SJ implements C252243on {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public AnonymousClass7SJ(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033d, code lost:
        X.1zE.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0340, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r0.CVE() != true) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0139, code lost:
        if (r0 == null) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r29, int r30, android.content.Intent r31) {
        /*
            r28 = this;
            r0 = r28
            X.9H7 r7 = r0.A00
            X.37E r1 = X.AnonymousClass37D.A00
            X.4DH r11 = r7.A0u
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            X.37D r13 = r1.A01(r0)
            android.os.Bundle r1 = r7.A0r
            r0 = 60
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r2 = r1.getBoolean(r0)
            r1 = -1
            r0 = 106(0x6a, float:1.49E-43)
            r10 = r29
            r9 = r30
            if (r10 != r0) goto L_0x003e
            if (r9 == r1) goto L_0x003e
            if (r2 == 0) goto L_0x0036
            if (r13 == 0) goto L_0x0036
            r0 = r13
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 == 0) goto L_0x0036
            r13.A0B()
            return
        L_0x0036:
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            r0.finish()
            return
        L_0x003e:
            X.3sy r6 = r7.A0b
            r5 = 1
            r4 = 0
            r8 = r31
            if (r6 == 0) goto L_0x01d8
            com.instagram.common.session.UserSession r15 = r7.A10
            android.content.Context r12 = r7.A02
            if (r12 != 0) goto L_0x0056
            java.lang.String r0 = "context"
        L_0x004e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0056:
            X.2Ep r0 = X.AnonymousClass9H7.A04(r7)
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.CVE()
            r3 = 1
            if (r0 == r5) goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r0 = 18157(0x46ed, float:2.5443E-41)
            if (r10 != r0) goto L_0x01d8
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectThreadKey
            java.lang.String r2 = ""
            r25 = r2
            if (r0 == 0) goto L_0x0079
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r6)
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0079
            r2 = r0
        L_0x0079:
            if (r9 == r1) goto L_0x0082
            X.KkW r0 = X.C62670KkW.DOCUMENT_PICKER_CANCEL
        L_0x007d:
            X.O01.A00(r0, r15, r2)
            goto L_0x01ec
        L_0x0082:
            if (r31 == 0) goto L_0x01ec
            android.net.Uri r11 = r8.getData()
            if (r11 == 0) goto L_0x01ec
            android.content.ContentResolver r0 = r12.getContentResolver()
            X.0qQ.A07(r0)
            java.io.InputStream r13 = r0.openInputStream(r11)
            java.lang.String r14 = "tmp_file_"
            java.lang.String r1 = ".tmp"
            java.io.File r0 = r12.getCacheDir()     // Catch:{ IOException -> 0x00a2 }
            java.io.File r1 = java.io.File.createTempFile(r14, r1, r0)     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00b1
        L_0x00a2:
            r14 = move-exception
            java.lang.String r1 = "FileUtil"
            java.lang.String r0 = "failed to create temp attachment file"
            X.0KC.A0F(r1, r0, r14)
            java.io.File r1 = new java.io.File
            r0 = r25
            r1.<init>(r0)
        L_0x00b1:
            X.0qQ.A07(r1)
            X.0mb.A09(r1, r13)
            if (r13 == 0) goto L_0x00bc
            r13.close()
        L_0x00bc:
            long r16 = r1.length()
            r13 = 1048576(0x100000, double:5.180654E-318)
            long r16 = r16 / r13
            r13 = 25
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            X.8ab r3 = new X.8ab
            r3.<init>((android.content.Context) r12)
            r0 = 2131959510(0x7f131ed6, float:1.9555662E38)
            r3.A09(r0)
            r1 = 2131959509(0x7f131ed5, float:1.955566E38)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r12.getString(r1, r0)
            r3.A0q(r0)
            r3.A06()
            android.app.Dialog r0 = r3.A02()
            X.AnonymousClass0fN.A00(r0)
            X.KkW r0 = X.C62670KkW.FILE_SIZE_EXCEEDS_LIMIT
            goto L_0x007d
        L_0x00f5:
            java.lang.String r23 = r1.getPath()
            X.0qQ.A07(r23)
            java.lang.String r13 = r11.getScheme()
            java.lang.String r0 = "content"
            boolean r13 = X.0qQ.A0K(r13, r0)
            r0 = 0
            if (r13 == 0) goto L_0x013b
            android.content.ContentResolver r16 = r12.getContentResolver()
            r22 = 1145985298(0x444e5912, float:825.3917)
            r17 = r11
            r18 = r0
            r19 = r0
            r20 = r0
            r21 = r0
            android.database.Cursor r14 = X.0fM.A01(r16, r17, r18, r19, r20, r21, r22)
            if (r14 == 0) goto L_0x013b
            boolean r13 = r14.moveToFirst()     // Catch:{ all -> 0x033a }
            if (r13 == 0) goto L_0x0136
            r13 = 256(0x100, float:3.59E-43)
            java.lang.String r13 = X.C66579MXk.A00(r13)     // Catch:{ all -> 0x033a }
            int r13 = r14.getColumnIndex(r13)     // Catch:{ all -> 0x033a }
            if (r13 < 0) goto L_0x0136
            java.lang.String r0 = r14.getString(r13)     // Catch:{ all -> 0x033a }
        L_0x0136:
            r14.close()
            if (r0 != 0) goto L_0x015e
        L_0x013b:
            java.lang.String r0 = r11.getPath()
            if (r0 == 0) goto L_0x015e
            r14 = 47
            int r13 = r0.length()
            int r13 = r13 + -1
            int r14 = X.00l.A05(r0, r14, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            if (r13 == 0) goto L_0x015e
            if (r14 < 0) goto L_0x015e
            int r13 = r14 + 1
            java.lang.String r0 = r0.substring(r13)
            X.0qQ.A07(r0)
        L_0x015e:
            if (r0 != 0) goto L_0x0162
            r0 = r25
        L_0x0162:
            android.content.ContentResolver r13 = r12.getContentResolver()
            java.lang.String r11 = r13.getType(r11)
            if (r11 == 0) goto L_0x016e
            r25 = r11
        L_0x016e:
            long r20 = r1.length()
            r13 = 1024(0x400, double:5.06E-321)
            long r20 = r20 / r13
            long r18 = r20 / r13
            long r16 = r18 / r13
            r13 = 1
            int r1 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c0
            r13 = 2131959511(0x7f131ed7, float:1.9555665E38)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
        L_0x0189:
            r11[r4] = r1
            java.lang.String r26 = r12.getString(r13, r11)
            X.0qQ.A0A(r26)
            r27 = 11
            X.QP5 r1 = new X.QP5
            r22 = r1
            r24 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            X.7Zi r11 = X.C333527Zh.A00(r15)
            X.KkW r0 = X.C62670KkW.DOCUMENT_PICKER_CLICK
            X.O01.A00(r0, r15, r2)
            r12 = 910983245(0x364c804d, float:3.047305E-6)
            r2 = 3
            X.0na r0 = new X.0na
            r0.<init>(r12, r2, r4, r4)
            X.3z9 r2 = com.google.common.util.concurrent.MoreExecutors.listeningDecorator((java.util.concurrent.ExecutorService) r0)
            X.MAz r0 = new X.MAz
            r0.<init>(r1, r11, r6, r3)
            com.google.common.util.concurrent.ListenableFuture r0 = r2.Eyk(r0)
            X.0qQ.A07(r0)
            goto L_0x01ec
        L_0x01c0:
            int r1 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01ce
            r13 = 2131959513(0x7f131ed9, float:1.9555669E38)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            goto L_0x0189
        L_0x01ce:
            r13 = 2131959512(0x7f131ed8, float:1.9555667E38)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            goto L_0x0189
        L_0x01d8:
            r0 = 9587(0x2573, float:1.3434E-41)
            if (r10 != r0) goto L_0x0200
            r0 = 9683(0x25d3, float:1.3569E-41)
            if (r9 != r0) goto L_0x01ec
            if (r13 == 0) goto L_0x01ec
            r0 = r13
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r5) goto L_0x01ec
            r13.A0B()
        L_0x01ec:
            X.7S2 r2 = r7.A1I
            java.lang.Class<X.7Ry> r1 = X.C331687Ry.class
            X.9Ln r0 = new X.9Ln
            r0.<init>(r8, r10, r9, r5)
            r2.A00(r1, r0)
            X.7TI r0 = r7.A0E
            if (r0 != 0) goto L_0x0341
            java.lang.String r0 = "directThreadController"
            goto L_0x004e
        L_0x0200:
            r0 = 104(0x68, float:1.46E-43)
            if (r10 != r0) goto L_0x02f9
            X.7Hl r3 = X.AnonymousClass9H7.A06(r7)
            if (r30 != 0) goto L_0x025c
            X.7IV r11 = r3.A1r
            X.2Er r1 = r3.A0W
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x024f
            com.instagram.common.session.UserSession r0 = r11.A02
            X.OsA r13 = X.C69840Nt4.A00(r0)
            java.lang.String r12 = r11.A00
            if (r1 == 0) goto L_0x0222
            java.lang.String r6 = r1.C6C()
            if (r6 != 0) goto L_0x0224
        L_0x0222:
            java.lang.String r6 = ""
        L_0x0224:
            X.0wc r2 = r13.A00
            java.lang.String r1 = "gen_ai_imagine_create_ig_mobile_event"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            java.lang.String r1 = "nux_cancel"
            java.lang.String r0 = "event_type"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "creation_session_id"
            r2.AAJ(r0, r12)
            long r0 = r13.A00()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ig_user_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "thread_id"
            r2.AAJ(r0, r6)
            r2.Cgf()
        L_0x024f:
            r11.A01 = r4
        L_0x0251:
            X.7JY r0 = X.AnonymousClass7JY.AI
            r3.A1O(r0)
            X.7JY r0 = X.AnonymousClass7JY.IMAGINE
        L_0x0258:
            r3.A1O(r0)
            goto L_0x01ec
        L_0x025c:
            if (r9 != r1) goto L_0x0251
            if (r31 == 0) goto L_0x01ec
            java.lang.String r0 = "command_id_to_invoke"
            java.io.Serializable r1 = r8.getSerializableExtra(r0)
            boolean r0 = r1 instanceof X.AnonymousClass7JY
            if (r0 == 0) goto L_0x0271
            X.7JY r1 = (X.AnonymousClass7JY) r1
            if (r1 == 0) goto L_0x0271
            r3.A1N(r1)
        L_0x0271:
            java.lang.String r0 = "launch_imagine_create"
            boolean r0 = r8.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x02c1
            X.7IV r2 = r3.A1r
            X.2Er r1 = r3.A0W
            com.instagram.common.session.UserSession r0 = r2.A02
            X.OsA r14 = X.C69840Nt4.A00(r0)
            java.lang.String r13 = r2.A00
            if (r1 == 0) goto L_0x028d
            java.lang.String r12 = r1.C6C()
            if (r12 != 0) goto L_0x028f
        L_0x028d:
            java.lang.String r12 = ""
        L_0x028f:
            X.0wc r6 = r14.A00
            java.lang.String r1 = "gen_ai_imagine_create_ig_mobile_event"
            X.0kJ r0 = r6.A00
            X.0Aj r6 = r6.A00(r0, r1)
            java.lang.String r1 = "nux_accept"
            java.lang.String r0 = "event_type"
            r6.AAJ(r0, r1)
            java.lang.String r0 = "creation_session_id"
            r6.AAJ(r0, r13)
            long r0 = r14.A00()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ig_user_id"
            r6.A9F(r0, r1)
            java.lang.String r0 = "thread_id"
            r6.AAJ(r0, r12)
            r6.Cgf()
            android.content.Context r1 = r3.A1R
            X.2Er r0 = r3.A0W
            r2.A00(r1, r0)
        L_0x02c1:
            java.lang.String r0 = "launch_meta_ai_invocation_sheet"
            boolean r0 = r8.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = "launch_meta_ai_invocation_sheet_entrypoint"
            java.lang.String r1 = r8.getStringExtra(r0)
            X.Nml r0 = X.C69503Nml.A05
            java.lang.String r0 = r0.toString()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02f6
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x02dd:
            boolean r0 = r3.A1S()
            if (r0 == 0) goto L_0x02f3
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x02e5:
            X.Hsa r1 = new X.Hsa
            r1.<init>(r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            r3.A14(r0, r1)
            goto L_0x01ec
        L_0x02f3:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x02e5
        L_0x02f6:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x02dd
        L_0x02f9:
            r0 = 105(0x69, float:1.47E-43)
            if (r10 != r0) goto L_0x0305
            X.7Hl r3 = X.AnonymousClass9H7.A06(r7)
            X.7JY r0 = X.AnonymousClass7JY.AI
            goto L_0x0258
        L_0x0305:
            r0 = 1109(0x455, float:1.554E-42)
            if (r10 != r0) goto L_0x031d
            if (r13 == 0) goto L_0x01ec
            r0 = r13
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 == 0) goto L_0x01ec
            androidx.fragment.app.Fragment r0 = r13.A09()
            if (r0 == 0) goto L_0x01ec
            r0.onActivityResult(r10, r9, r8)
            goto L_0x01ec
        L_0x031d:
            r0 = 101(0x65, float:1.42E-43)
            if (r10 != r0) goto L_0x01ec
            if (r9 != r0) goto L_0x01ec
            X.7Hl r2 = r7.A0R
            if (r2 == 0) goto L_0x01ec
            com.instagram.common.session.UserSession r0 = r7.A10
            X.S6X r1 = X.C394279xp.A00(r0)
            java.lang.String r0 = "activity_result"
            java.lang.Object r0 = r1.A00(r0)
            java.util.List r0 = (java.util.List) r0
            r2.A1R(r0)
            goto L_0x01ec
        L_0x033a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x033c }
        L_0x033c:
            r0 = move-exception
            X.1zE.A00(r14, r1)
            throw r0
        L_0x0341:
            r0.A0U(r10, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SJ.onActivityResult(int, int, android.content.Intent):void");
    }
}
