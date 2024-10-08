package X;

import java.util.concurrent.Callable;

public final class TNH implements Callable {
    public final int A00;
    public final Object A01;

    public TNH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, X.RnS] */
    /* JADX WARNING: type inference failed for: r3v10, types: [com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0130, code lost:
        r2.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        r2.A00 = r1;
        r3 = r2.A00();
        r2 = X.JTQ.A0E();
        r2.A03 = X.1Fe.A02;
        r0 = "FetchPaymentToken";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        r2.A0A = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x020a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x020b, code lost:
        r6.A04.qplMarkerEnd(33888866, false);
        r6.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0213, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return X.Pxf.A0R(r3, r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0134;
                case 2: goto L_0x0140;
                case 3: goto L_0x005f;
                case 4: goto L_0x0088;
                case 5: goto L_0x009d;
                case 6: goto L_0x0156;
                case 7: goto L_0x00b7;
                case 8: goto L_0x01bf;
                case 9: goto L_0x0005;
                case 10: goto L_0x00f2;
                case 11: goto L_0x0005;
                case 12: goto L_0x010b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A01
            X.1Fc r1 = (X.1Fc) r1
            r0 = 1
            X.1Px r1 = r1.A00(r0)
            r1.getClass()
            X.1Pq r2 = X.Pxf.A0S()
            java.lang.String r0 = "https://secure.facebook.com/payments/generate_token"
            r2.A02(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A01(r0)
        L_0x001f:
            r2.A00 = r1
            X.1QS r3 = r2.A00()
            X.1QT r2 = X.JTQ.A0E()
            X.1Fe r0 = X.1Fe.A02
            r2.A03 = r0
            java.lang.String r0 = "FetchPaymentToken"
        L_0x002f:
            r2.A0A = r0
        L_0x0031:
            X.1QX r4 = X.Pxf.A0R(r3, r2)
        L_0x0035:
            return r4
        L_0x0036:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r11.A01
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r0
            java.util.Map r0 = r0.A04
            java.util.Iterator r2 = X.AnonymousClass7TF.A0v(r0)
        L_0x0044:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r2.next()
            X.PzC r0 = (X.PzC) r0
            X.PzA r1 = r0.A00
            X.PzB r0 = new X.PzB
            r0.<init>(r1)
            X.PzA r0 = r0.A00()
            r4.add(r0)
            goto L_0x0044
        L_0x005f:
            java.lang.Object r2 = r11.A01
            X.S1a r2 = (X.C10922S1a) r2
            X.1Pq r1 = X.Pxf.A0S()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A01(r0)
            java.net.URI r0 = r2.A02
            java.lang.String r0 = X.DbT.A10(r0)
            r1.A02 = r0
            X.1QS r3 = r1.A00()
            X.1QT r2 = new X.1QT
            r2.<init>()
            X.1CE r0 = X.1CE.A0A
            r2.A04 = r0
            X.1Fe r0 = X.1Fe.A03
            r2.A03 = r0
            java.lang.String r0 = "FetchOilWebpReques"
            goto L_0x002f
        L_0x0088:
            java.lang.Object r0 = r11.A01
            X.1Pq r0 = (X.1Pq) r0
            X.1QS r3 = r0.A00()
            X.1QT r2 = new X.1QT
            r2.<init>()
            X.1CE r0 = X.1CE.A09
            r2.A04 = r0
            X.1Fe r0 = X.1Fe.A03
            goto L_0x0130
        L_0x009d:
            java.lang.String r10 = "tracker"
            java.lang.String r9 = "event"
            java.lang.Object r6 = r11.A01
            X.SHr r6 = (X.C11257SHr) r6
            java.lang.ref.WeakReference r0 = r6.A06
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            r4 = 0
            if (r1 == 0) goto L_0x0035
            r5 = 0
            r3 = 33888866(0x2051a62, float:9.778868E-38)
            goto L_0x01c8
        L_0x00b7:
            java.lang.Object r1 = r11.A01
            X.Qcw r1 = (X.C7925Qcw) r1
            java.lang.String r0 = r1.A0U
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
            r1.A06 = r2
            if (r2 != 0) goto L_0x0214
            java.lang.ref.WeakReference r0 = r1.A00
            r4 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.Object r3 = r0.get()
            X.TaX r3 = (X.C13444TaX) r3
            if (r3 == 0) goto L_0x0035
            r2 = r3
            android.content.Context r2 = (android.content.Context) r2
            r0 = 2131972728(0x7f135278, float:1.9582472E38)
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            com.facebook.smartcapture.view.IdCaptureBaseActivity r3 = (com.facebook.smartcapture.view.IdCaptureBaseActivity) r3
            r3.setResult(r1)
            r3.finish()
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = r3.A02()
            com.facebook.smartcapture.logging.IdCaptureButton r0 = com.facebook.smartcapture.logging.IdCaptureButton.RETAKE_PHOTO
            r1.logButtonClick(r0)
            return r4
        L_0x00f2:
            X.1Pq r2 = X.Pxf.A0S()
            java.lang.String r0 = "https://secure.facebook.com/payments/generate_token"
            r2.A02(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A01(r0)
            java.lang.Object r1 = r11.A01
            X.1Fc r1 = (X.1Fc) r1
            r0 = 1
            X.1Px r1 = r1.A00(r0)
            goto L_0x001f
        L_0x010b:
            X.1Pq r2 = X.Pxf.A0S()
            java.lang.Object r1 = r11.A01
            X.RAV r1 = (X.RAV) r1
            android.net.Uri r0 = r1.A00
            java.lang.String r0 = r0.toString()
            r2.A02(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A01(r0)
            X.1QS r3 = r2.A00()
            X.1QT r2 = new X.1QT
            r2.<init>()
            X.1CE r0 = r1.A02
            r2.A04 = r0
            X.1Fe r0 = r1.A01
        L_0x0130:
            r2.A03 = r0
            goto L_0x0031
        L_0x0134:
            java.lang.Object r0 = r11.A01
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r0 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r0
            X.RnS r4 = new X.RnS
            r4.<init>()
            r4.A00 = r0
            return r4
        L_0x0140:
            java.lang.Object r1 = r11.A01
            X.3tz r1 = (X.C255353tz) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            androidx.work.impl.WorkDatabase r1 = r1.A00
            java.lang.String r0 = "next_alarm_manager_id"
            int r0 = X.AnonymousClass5G5.A00(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0156:
            java.lang.Object r3 = r11.A01
            X.QCA r3 = (X.QCA) r3
            androidx.fragment.app.FragmentActivity r9 = r3.getActivity()
            if (r9 != 0) goto L_0x0165
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            return r4
        L_0x0165:
            android.os.Bundle r2 = r3.mArguments
            r1 = 1
            r8 = 0
            if (r2 == 0) goto L_0x01bd
            java.lang.String r0 = "no_face_tracker"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r1) goto L_0x01bd
        L_0x0174:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.Tic r7 = r3.A00
            if (r7 != 0) goto L_0x01b4
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>(r8)
        L_0x0181:
            if (r7 != 0) goto L_0x01b2
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r8)
        L_0x0188:
            r3 = 2131951827(0x7f1300d3, float:1.954008E38)
            r2 = 2131972640(0x7f135220, float:1.9582293E38)
            r5 = 0
            X.Qd7 r1 = new X.Qd7
            r1.<init>(r6, r0, r3, r2)
            r4.add(r1)
            if (r7 != 0) goto L_0x01ad
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>(r8)
        L_0x019e:
            r2 = 2131951828(0x7f1300d4, float:1.9540082E38)
            r1 = 2131951822(0x7f1300ce, float:1.954007E38)
            X.Qd7 r0 = new X.Qd7
            r0.<init>(r3, r5, r2, r1)
            r4.add(r0)
            return r4
        L_0x01ad:
            android.graphics.drawable.Drawable r3 = r7.BY5(r9)
            goto L_0x019e
        L_0x01b2:
            r0 = 0
            goto L_0x0188
        L_0x01b4:
            if (r1 == 0) goto L_0x01b8
            r6 = 0
            goto L_0x0181
        L_0x01b8:
            android.graphics.drawable.Drawable r6 = r7.BY4(r9)
            goto L_0x0181
        L_0x01bd:
            r1 = 0
            goto L_0x0174
        L_0x01bf:
            java.lang.Object r0 = r11.A01
            X.SIZ r0 = (X.SIZ) r0
            X.1QX r4 = X.SIZ.A00(r0)
            return r4
        L_0x01c8:
            com.facebook.smartcapture.logging.SmartCaptureLogger r8 = r6.A04     // Catch:{ Exception -> 0x020a }
            r8.qplMarkerStart(r3)     // Catch:{ Exception -> 0x020a }
            java.lang.String r0 = "download"
            r8.qplMarkerAnnotate((int) r3, (java.lang.String) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x020a }
            java.lang.String r7 = "aml"
            r8.qplMarkerAnnotate((int) r3, (java.lang.String) r10, (java.lang.String) r7)     // Catch:{ Exception -> 0x020a }
            com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider r0 = r6.A02     // Catch:{ Exception -> 0x020a }
            java.util.Map r2 = r0.BTj(r1)     // Catch:{ Exception -> 0x020a }
            r1 = 1
            r8.qplMarkerEnd(r3, r1)     // Catch:{ Exception -> 0x020a }
            r8.qplMarkerStart(r3)     // Catch:{ Exception -> 0x020a }
            java.lang.String r0 = "init"
            r8.qplMarkerAnnotate((int) r3, (java.lang.String) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x020a }
            r8.qplMarkerAnnotate((int) r3, (java.lang.String) r10, (java.lang.String) r7)     // Catch:{ Exception -> 0x020a }
            X.SEc r0 = new X.SEc     // Catch:{ Exception -> 0x020a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x020a }
            r8.qplMarkerEnd(r3, r1)     // Catch:{ Exception -> 0x020a }
            monitor-enter(r6)     // Catch:{ Exception -> 0x020a }
            r6.A08 = r2     // Catch:{ all -> 0x0207 }
            r6.A07 = r0     // Catch:{ all -> 0x0207 }
            java.lang.Integer r2 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0207 }
            android.os.Handler r1 = r6.A01     // Catch:{ all -> 0x0207 }
            X.TGP r0 = new X.TGP     // Catch:{ all -> 0x0207 }
            r0.<init>(r6, r2)     // Catch:{ all -> 0x0207 }
            r1.post(r0)     // Catch:{ all -> 0x0207 }
            monitor-exit(r6)     // Catch:{ Exception -> 0x020a }
            return r4
        L_0x0207:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x020a }
            throw r0     // Catch:{ Exception -> 0x020a }
        L_0x020a:
            r1 = move-exception
            com.facebook.smartcapture.logging.SmartCaptureLogger r0 = r6.A04
            r0.qplMarkerEnd(r3, r5)
            r6.A01(r1)
            return r4
        L_0x0214:
            android.content.res.Resources r0 = X.DbV.A05(r1)
            X.8DU r4 = new X.8DU
            r4.<init>(r0, r2)
            r1 = 1
            android.graphics.Paint r0 = r4.A08
            r0.setAntiAlias(r1)
            r4.invalidateSelf()
            float r1 = X.JTO.A02(r2)
            r0 = 1019517862(0x3cc49ba6, float:0.024)
            float r1 = r1 * r0
            r4.A02(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TNH.call():java.lang.Object");
    }
}
