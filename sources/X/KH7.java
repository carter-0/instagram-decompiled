package X;

import android.app.Dialog;
import android.content.Context;

public final class KH7 extends 2Cl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public KH7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:55|56|57|58) */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r3 = ((X.E6v) r9.A02).getContext();
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Failure to read raw JSON from ");
        X.C59689JTv.A03(r3, X.AnonymousClass7TF.A0i(r5.A00, r1), (java.lang.String) null, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015c, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0160, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0161, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0162, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0165, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ad, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ae, code lost:
        X.0wb.A06("ConfidenceFrameworkHelper", "confidence_framework_client_start_query_failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b5, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0140 */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ad A[ExcHandler: 6GV | RemoteException | IllegalStateException | SecurityException (r2v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:37:0x00ee] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x00ec;
                case 2: goto L_0x0111;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r9.A02
            X.5Ji r2 = (X.C283795Ji) r2
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.C283785Jh.A00(r0, r2)
            java.lang.String r5 = X.JTR.A12(r0, r1)
        L_0x0018:
            return r5
        L_0x0019:
            java.lang.Object r3 = r9.A02
            X.K4v r3 = (X.C61377K4v) r3
            X.Q8d r0 = r3.A03
            if (r0 == 0) goto L_0x003d
            android.graphics.Bitmap r4 = r0.getOverlayBitmap()
        L_0x0025:
            if (r4 == 0) goto L_0x018b
            X.LRG r7 = X.LRG.A00
            X.0eM r0 = r3.A05
            X.0lg r6 = X.DbT.A0X(r0)
            java.lang.String r5 = r3.A04
            java.lang.String r0 = "imagePath"
            if (r5 != 0) goto L_0x00b8
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            com.instagram.bugreporter.BugReporterDrawingView r6 = r3.A01
            if (r6 == 0) goto L_0x018b
            android.graphics.Bitmap r1 = r6.A03
            r2 = 1
            if (r1 != 0) goto L_0x0051
            android.graphics.Bitmap r0 = r6.A02
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "The drawing view has a size of zero, so creating a final bitmap does not make sense."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0051:
            java.lang.String r8 = "Required value was null."
            if (r1 != 0) goto L_0x0068
            android.graphics.Bitmap r1 = r6.A02
            if (r1 == 0) goto L_0x0177
            android.graphics.Bitmap$Config r0 = r1.getConfig()
            X.0qQ.A0A(r0)
            android.graphics.Bitmap r4 = r1.copy(r0, r2)
            X.0qQ.A0A(r4)
            goto L_0x0025
        L_0x0068:
            android.graphics.Bitmap$Config r0 = r1.getConfig()
            X.0qQ.A0A(r0)
            android.graphics.Bitmap r4 = r1.copy(r0, r2)
            X.0qQ.A07(r4)
            android.graphics.Canvas r5 = X.JTO.A0B(r4)
            android.graphics.Matrix r7 = X.AnonymousClass7TE.A0U()
            android.graphics.Rect r2 = r6.A05
            if (r2 == 0) goto L_0x0186
            int r0 = r2.left
            float r0 = (float) r0
            float r1 = -r0
            int r0 = r2.top
            float r0 = (float) r0
            float r0 = -r0
            r7.postTranslate(r1, r0)
            float r2 = X.JTO.A02(r4)
            android.graphics.Rect r0 = r6.A05
            if (r0 == 0) goto L_0x0181
            int r0 = r0.width()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r1 = X.JTO.A01(r4)
            android.graphics.Rect r0 = r6.A05
            if (r0 == 0) goto L_0x017c
            int r0 = r0.height()
            float r0 = (float) r0
            float r1 = r1 / r0
            r7.postScale(r2, r1)
            r5.setMatrix(r7)
            android.graphics.Path r1 = r6.A08
            android.graphics.Paint r0 = r6.A07
            r5.drawPath(r1, r0)
            goto L_0x0025
        L_0x00b8:
            r2 = 0
            r1 = 46
            int r0 = r5.length()
            int r0 = r0 + -1
            int r0 = X.00l.A05(r5, r1, r0)
            java.lang.String r1 = X.C51967G9n.A0q(r5, r2, r0)
            java.lang.String r0 = "_annotated.png"
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            java.lang.Object r5 = r7.A02(r4, r6, r0)
            X.0eS.A00(r5)
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r3 = r3.A00     // Catch:{ RuntimeException -> 0x0167 }
            if (r3 == 0) goto L_0x0018
            r2 = 0
            r0 = 45
            X.MHC r1 = new X.MHC     // Catch:{ RuntimeException -> 0x0167 }
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r0)     // Catch:{ RuntimeException -> 0x0167 }
            X.19B r0 = X.19B.A00     // Catch:{ RuntimeException -> 0x0167 }
            X.C67351tA.A00(r0, r1)     // Catch:{ RuntimeException -> 0x0167 }
            goto L_0x0166
        L_0x00ec:
            r3 = 0
            r5 = 0
            java.lang.Object r1 = r9.A01     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            X.LAY r1 = (X.LAY) r1     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            X.S6k r0 = X.LAY.A07     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            X.LQW r1 = r1.A06     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            X.LSS.A01(r0)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            android.os.Bundle r0 = X.LQW.A01(r0, r1)     // Catch:{ Exception -> 0x01a5, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            if (r0 != 0) goto L_0x0105
            r0 = 0
            goto L_0x010d
        L_0x0105:
            android.os.Bundle r3 = r0.deepCopy()     // Catch:{ Exception -> 0x01a5, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            X.C62990Kpg.A00(r3)     // Catch:{ Exception -> 0x01a5, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad, 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            r0 = 1
        L_0x010d:
            if (r0 == 0) goto L_0x0018
            goto L_0x0192
        L_0x0111:
            java.lang.Object r5 = r9.A01
            X.F3N r5 = (X.F3N) r5
            java.io.File r1 = r5.A01
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            r4.<init>(r0)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0140 }
        L_0x012a:
            int r1 = r4.read(r2)     // Catch:{ Exception -> 0x0140 }
            r0 = -1
            if (r1 == r0) goto L_0x0136
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ Exception -> 0x0140 }
            goto L_0x012a
        L_0x0136:
            java.lang.String r0 = "UTF-8"
            java.lang.String r5 = r3.toString(r0)     // Catch:{ Exception -> 0x0140 }
            r4.close()
            return r5
        L_0x0140:
            java.lang.Object r0 = r9.A02     // Catch:{ all -> 0x0161 }
            X.E6v r0 = (X.E6v) r0     // Catch:{ all -> 0x0161 }
            android.content.Context r3 = r0.getContext()     // Catch:{ all -> 0x0161 }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = "Failure to read raw JSON from "
            r1.append(r0)     // Catch:{ all -> 0x0161 }
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = r5.A00     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ all -> 0x0161 }
            r1 = 0
            r0 = 1
            X.C59689JTv.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x0161 }
            r4.close()
            r5 = 0
            return r5
        L_0x0161:
            r0 = move-exception
            r4.close()
            throw r0
        L_0x0166:
            return r5
        L_0x0167:
            r2 = move-exception
            java.lang.Class<X.K4v> r1 = X.C61377K4v.class
            java.lang.String r0 = "Failed to save annotated screenshot."
            X.0KC.A05(r1, r0, r2)
            java.lang.String r1 = "Failed to save annotated screenshot"
            X.Kke r0 = new X.Kke
            r0.<init>(r1, r2)
            throw r0
        L_0x0177:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x017c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0181:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0186:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x018b:
            java.lang.String r0 = "Failed to create overlay bitmap"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0192:
            X.S6k r2 = X.LAY.A07     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            java.lang.String r1 = "startMessage"
            boolean r0 = r3.containsKey(r1)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            if (r0 == 0) goto L_0x01a7
            byte[] r0 = r3.getByteArray(r1)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            java.lang.String r5 = r2.A02(r0)     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            return r5
        L_0x01a5:
            r0 = move-exception
            goto L_0x01ac
        L_0x01a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
            r0.<init>()     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
        L_0x01ac:
            throw r0     // Catch:{ 6GV | RemoteException | IllegalStateException | SecurityException -> 0x01ad }
        L_0x01ad:
            r2 = move-exception
            java.lang.String r1 = "ConfidenceFrameworkHelper"
            java.lang.String r0 = "confidence_framework_client_start_query_failed"
            X.0wb.A06(r1, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KH7.call():java.lang.Object");
    }

    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 255;
            case 1:
                return 316234685;
            case 2:
                return 247;
            default:
                return 1656887534;
        }
    }

    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(exc, 0);
                C74547Pwg pwg = ((C61377K4v) this.A02).A02;
                if (pwg == null) {
                    0qQ.A0F("userFlowLoggerV2");
                    throw AnonymousClass00P.createAndThrow();
                }
                pwg.AW0("image_annotation_failure", new C58728Iwb(exc, 27));
                0KC.A05(C61377K4v.class, "Failed to save annotated screenshot.", exc);
                ((Dialog) this.A01).dismiss();
                C59689JTv.A07(C60960kU.A00, 2131954338);
                return;
            case 3:
                C59689JTv.A06((Context) this.A01, 2131958414);
                return;
            default:
                KH7.super.onFail(exc);
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x003a;
                case 2: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = X.C41847B3o.A1E(r9)
            java.lang.Object r1 = r8.A01
            android.content.Context r1 = (android.content.Context) r1
            X.0nC.A00(r1, r0)
            r0 = 2131958413(0x7f131a8d, float:1.9553437E38)
            X.C59689JTv.A06(r1, r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.String r9 = (java.lang.String) r9
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002d }
            r1.<init>(r9)     // Catch:{ JSONException -> 0x002d }
            r0 = 2
            java.lang.String r1 = r1.toString(r0)     // Catch:{ JSONException -> 0x002d }
            if (r1 == 0) goto L_0x002d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002d
            r9 = r1
            goto L_0x002f
        L_0x002d:
            if (r9 == 0) goto L_0x0016
        L_0x002f:
            java.lang.Object r0 = r8.A02
            X.E6v r0 = (X.E6v) r0
            X.DmF r1 = r0.A01
            if (r1 != 0) goto L_0x0098
            java.lang.String r0 = "adapter"
            goto L_0x007c
        L_0x003a:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0016
            java.lang.Object r7 = r8.A01
            X.LAY r7 = (X.LAY) r7
            X.S6k r0 = X.LAY.A07
            android.content.Context r1 = r7.A01
            java.lang.Object r6 = r8.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r5 = 1
            X.1NY r4 = X.AnonymousClass7TG.A0a(r6)
            java.lang.String r0 = "accounts/init_confidence_flow/"
            r4.A0A(r0)
            java.lang.String r0 = "client_start_message"
            boolean r3 = X.JTT.A1Y(r1, r4, r6, r0, r9)
            java.lang.Class<X.K0i> r2 = X.C61273K0i.class
            java.lang.Class<X.LH3> r1 = X.LH3.class
            X.0aS r0 = X.0aS.A00
            r4.A0O(r0, r2, r1, r3)
            X.1OC r1 = X.DbT.A0U(r4, r5)
            X.KA6 r0 = new X.KA6
            r0.<init>(r6, r7)
            r1.A00 = r0
            X.1ES.A03(r1)
            return
        L_0x0072:
            java.lang.Object r2 = r8.A02
            X.K4v r2 = (X.C61377K4v) r2
            X.Pwg r1 = r2.A02
            if (r1 != 0) goto L_0x0084
            java.lang.String r0 = "userFlowLoggerV2"
        L_0x007c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0084:
            java.lang.String r0 = "image_annotation_success"
            r1.AVy(r0)
            java.lang.Object r0 = r8.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            X.0hq r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x0016
            r0.A0c()
            return
        L_0x0098:
            r1.A00 = r9
            r0 = 0
            r1.notifyItemChanged(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KH7.onSuccess(java.lang.Object):void");
    }
}
