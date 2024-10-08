package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

public final class K04 extends AnonymousClass8GD {
    public final int A00;
    public final Object A01;

    public K04(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A01(Exception exc) {
        0f9 r2;
        String str;
        String str2;
        0wj r22;
        int i;
        String str3;
        switch (this.A00) {
            case 1:
                1X9 A002 = AnonymousClass38W.A00();
                C59867Jal jal = (C59867Jal) this.A01;
                UserSession userSession = jal.A0a;
                Context context = jal.getContext();
                if (A002.A02(context, userSession)) {
                    JW1.A00(userSession).A0C(false, context.getString(2131976417));
                    C358248ab A0Y = DbS.A0Y(context);
                    A0Y.A09(2131976418);
                    A0Y.A08(2131976417);
                    A0Y.A0E(new LU1(1));
                    DbT.A1V(A0Y);
                    return;
                }
                return;
            case 2:
                0KC.A0F(C59867Jal.__redex_internal_original_name, "stop video encountered error", exc);
                C59867Jal jal2 = (C59867Jal) this.A01;
                JW1.A00(jal2.A0a).A0C(false, exc.getMessage());
                C59870Jat jat = jal2.A0e;
                SystemClock.elapsedRealtime();
                jat.A01 = AnonymousClass05K.A0N;
                jal2.A0H = false;
                C59872Jav jav = jat.A06;
                if (jal2.A00 < jav.A01.A01.size()) {
                    jav.A00();
                }
                if (jal2.A0D) {
                    jal2.setFlashMode(jal2.A01);
                    jal2.A0D = false;
                    jal2.A01 = -1;
                    return;
                }
                return;
            case 4:
                AnonymousClass7TF.A19(0wj.A01.AEf(C59867Jal.__redex_internal_original_name, 817904119), DialogModule.KEY_MESSAGE, "setFlashMode()", exc);
                C59867Jal.A04((C59867Jal) this.A01);
                return;
            case 5:
                r2 = 0wj.A01.AEf("InAppCaptureView.CameraFocusError", 817904119);
                str = DialogModule.KEY_MESSAGE;
                str2 = "Assign to @nilesh. Failed to get number of cameras.";
                break;
            case 6:
                if (((C59867Jal) this.A01).A04 != null) {
                    r22 = 0wj.A01;
                    i = 817904119;
                    str3 = "MediaCaptureFragment.PictureTakenError";
                    break;
                } else {
                    return;
                }
            case 8:
                ((JYD) this.A01).A0A.setVisibility(8);
                return;
            case 9:
                0qQ.A0B(exc, 0);
                C60282Jid.A00(JTR.A0l(this.A01), 0);
                r2 = 0wj.A01.AEf("PotatoPreCaptureFragment.CameraCountFailure", 817904119);
                str = DialogModule.KEY_MESSAGE;
                str2 = "An exception happened while attempting to get number of cameras";
                break;
            case 11:
                0qQ.A0B(exc, 0);
                r22 = 0wj.A01;
                i = 817904119;
                str3 = "PotatoPreCaptureFragment.PictureTakenError";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C59938Jc2 jc2 = (C59938Jc2) this.A01;
                jc2.A01 = false;
                jc2.A02 = false;
                C62320sa r0 = jc2.A00;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            default:
                return;
        }
        r2 = r22.AEf(str3, i);
        str = DialogModule.KEY_MESSAGE;
        str2 = "An exception happened while attempting to take a photo";
        AnonymousClass7TF.A19(r2, str, str2, exc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e8, code lost:
        if (((java.lang.Number) r13).intValue() > 1) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ea, code lost:
        r0 = 0;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00eb, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ee, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        r0 = 8;
        r2 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A02(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0211;
                case 1: goto L_0x01aa;
                case 2: goto L_0x0146;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00db;
                case 6: goto L_0x0088;
                case 7: goto L_0x002c;
                case 8: goto L_0x00c9;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00ad;
                case 11: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            java.lang.Object r2 = r12.A01
            X.Jc2 r2 = (X.C59938Jc2) r2
            r0 = 0
            r2.A01 = r0
            if (r13 == 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            r2.A02 = r0
            if (r13 == 0) goto L_0x0018
            X.C59938Jc2.A00(r13, r2)
        L_0x0018:
            X.0eM r0 = r2.A09
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = 8
            r1.setVisibility(r0)
            X.0sa r0 = r2.A00
            if (r0 == 0) goto L_0x002c
            r0.invoke()
        L_0x002c:
            return
        L_0x002d:
            X.8kS r13 = (X.C363858kS) r13
            if (r13 == 0) goto L_0x002c
            X.8kz r0 = X.C363858kS.A0X
            java.lang.Object r9 = r13.A04(r0)
            byte[] r9 = (byte[]) r9
            if (r9 == 0) goto L_0x002c
            X.8ky r0 = X.C363858kS.A0K
            java.lang.Object r0 = r13.A03(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r11 = 1
            if (r0 == 0) goto L_0x0086
            int r0 = r0.intValue()
            if (r0 != r11) goto L_0x0086
        L_0x004c:
            int r10 = X.C364138kv.A00(r9)
            java.lang.Object r0 = r12.A01
            X.Jid r7 = X.JTR.A0l(r0)
            X.05G r6 = r7.A05
        L_0x0058:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.Jw5 r0 = (X.C61067Jw5) r0
            r8 = 0
            boolean r4 = r0.A03
            java.lang.Object r3 = r0.A02
            X.MQL r3 = (X.MQL) r3
            java.lang.Object r2 = r0.A01
            X.L0M r2 = (X.L0M) r2
            r1 = 1
            X.AnonymousClass7TG.A1Q(r3, r2)
            X.Jw5 r0 = new X.Jw5
            r0.<init>((X.L0M) r2, (X.MQL) r3, (boolean) r1, (boolean) r4)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x0058
            X.6oS r0 = X.C318116oQ.A00(r7)
            X.GVU r6 = new X.GVU
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r6, r0)
            return
        L_0x0086:
            r11 = 0
            goto L_0x004c
        L_0x0088:
            X.8kS r13 = (X.C363858kS) r13
            java.lang.Object r0 = r12.A01
            X.Jal r0 = (X.C59867Jal) r0
            X.MQE r4 = r0.A04
            if (r4 == 0) goto L_0x002c
            X.8kz r0 = X.C363858kS.A0X
            java.lang.Object r3 = r13.A04(r0)
            byte[] r3 = (byte[]) r3
            com.instagram.creation.capture.MediaCaptureFragment r4 = (com.instagram.creation.capture.MediaCaptureFragment) r4
            android.content.Context r2 = r4.requireContext()
            X.0nO r1 = X.0nY.A00()
            X.KJ4 r0 = new X.KJ4
            r0.<init>(r2, r13, r4, r3)
            r1.ATE(r0)
            return
        L_0x00ad:
            java.lang.Object r0 = r12.A01
            X.Jid r1 = X.JTR.A0l(r0)
            X.LmF r0 = X.C65036LmF.A00
            r1.A01(r0)
            return
        L_0x00b9:
            java.lang.Number r13 = (java.lang.Number) r13
            int r1 = X.AnonymousClass7TG.A0A(r13)
            java.lang.Object r0 = r12.A01
            X.Jid r0 = X.JTR.A0l(r0)
            X.C60282Jid.A00(r0, r1)
            return
        L_0x00c9:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            java.lang.Object r1 = r12.A01
            X.JYD r1 = (X.JYD) r1
            if (r13 == 0) goto L_0x00ef
            r0 = 6
            com.instagram.common.ui.blur.BlurUtil.blurInPlace(r13, r0)
            android.widget.ImageView r2 = r1.A0A
            r2.setImageBitmap(r13)
            goto L_0x00ea
        L_0x00db:
            java.lang.Number r13 = (java.lang.Number) r13
            java.lang.Object r0 = r12.A01
            X.Jal r0 = (X.C59867Jal) r0
            android.view.View r2 = r0.A0P
            int r1 = r13.intValue()
            r0 = 1
            if (r1 <= r0) goto L_0x00f1
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            r2.setVisibility(r0)
            return
        L_0x00ef:
            android.widget.ImageView r2 = r1.A0A
        L_0x00f1:
            r0 = 8
            goto L_0x00eb
        L_0x00f4:
            java.lang.Object r0 = r12.A01
            X.Jal r0 = (X.C59867Jal) r0
            X.C59867Jal.A04(r0)
            return
        L_0x00fc:
            X.7q6 r13 = (X.C343367q6) r13
            java.lang.Object r4 = r12.A01
            X.Jal r4 = (X.C59867Jal) r4
            int r0 = r13.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0A = r0
            android.view.View r3 = r4.A0P
            android.view.ViewPropertyAnimator r1 = r3.animate()
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            android.view.ViewPropertyAnimator r0 = r1.rotationBy(r0)
            r0.start()
            java.lang.Integer r0 = r4.A0A
            r2 = 1
            if (r0 == 0) goto L_0x0144
            int r0 = r0.intValue()
            if (r2 != r0) goto L_0x0144
        L_0x0124:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131974863(0x7f135acf, float:1.9586802E38)
            if (r2 == 0) goto L_0x0130
            r0 = 2131974847(0x7f135abf, float:1.958677E38)
        L_0x0130:
            X.DbT.A1A(r1, r3, r0)
            X.MQE r0 = r4.A04
            if (r0 == 0) goto L_0x013c
            X.7l2 r0 = r4.A0Y
            r0.A07()
        L_0x013c:
            com.instagram.common.session.UserSession r1 = r4.A0a
            java.lang.Integer r0 = r4.A0A
            X.C59895JbK.A0H(r1, r0)
            return
        L_0x0144:
            r2 = 0
            goto L_0x0124
        L_0x0146:
            java.lang.Object r4 = r12.A01
            X.Jal r4 = (X.C59867Jal) r4
            X.Jat r1 = r4.A0e
            android.os.SystemClock.elapsedRealtime()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A01 = r0
            boolean r0 = r4.A0G
            r5 = 0
            if (r0 == 0) goto L_0x0187
            X.MQE r2 = r4.A04
            if (r2 == 0) goto L_0x0187
            r4.A0G = r5
            com.instagram.creation.capture.MediaCaptureFragment r2 = (com.instagram.creation.capture.MediaCaptureFragment) r2
            X.MXN r0 = r2.mCaptureProvider
            r0.getClass()
            X.Jal r0 = (X.C59867Jal) r0
            X.JbI r1 = r0.A06
            X.JbI r0 = X.C59893JbI.CAMCORDER
            if (r1 != r0) goto L_0x0187
            X.MXN r0 = r2.mCaptureProvider
            r0.E4X()
            X.Jb4 r3 = r2.A02
            r3.getClass()
            X.82p r0 = r3.A04
            X.82q r2 = r0.A00()
            android.app.Activity r1 = r3.A02
            X.0qQ.A0A(r1)
            com.instagram.common.session.UserSession r0 = r3.A03
            X.C63137Ks5.A00(r1, r0, r2)
        L_0x0187:
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0190
            r4.A0F = r5
            r4.E4X()
        L_0x0190:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x019e
            int r0 = r4.A01
            r4.setFlashMode(r0)
            r4.A0D = r5
            r0 = -1
            r4.A01 = r0
        L_0x019e:
            com.instagram.common.session.UserSession r0 = r4.A0a
            X.JaN r2 = X.JW1.A00(r0)
            r1 = 1
            r0 = 0
            r2.A0C(r1, r0)
            return
        L_0x01aa:
            X.Xoh r13 = (X.C21986Xoh) r13
            java.lang.Object r2 = r12.A01
            X.Jal r2 = (X.C59867Jal) r2
            X.Jat r4 = r2.A0e
            java.lang.ref.WeakReference r0 = r4.A09
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x020c
            java.lang.Integer r0 = r4.A01
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r0 != r7) goto L_0x020c
            android.os.SystemClock.elapsedRealtime()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4.A01 = r0
            X.Jav r6 = r4.A06
            r5 = 0
            X.JYp r0 = new X.JYp
            r0.<init>()
            r6.A00 = r0
            java.util.List r0 = r0.A08
            r0.add(r6)
            X.JYp r3 = r6.A00
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A04 = r0
            r3.A04(r7)
            X.JYp r1 = r6.A00
            r1.A01 = r5
            X.Jaw r0 = r6.A01
            r0.A02(r1)
            X.JYp r1 = r6.A00
            if (r1 == 0) goto L_0x0206
            X.9dw r0 = X.C21986Xoh.A0L
            java.lang.Integer r0 = r13.A00(r0)
            int r0 = r0.intValue()
            r1.A02 = r0
            X.9dw r0 = X.C21986Xoh.A0K
            java.lang.Integer r0 = r13.A00(r0)
            int r0 = r0.intValue()
            r1.A00 = r0
        L_0x0206:
            android.os.Handler r1 = r4.A03
            r0 = 1
            r1.sendEmptyMessage(r0)
        L_0x020c:
            X.JbI r0 = X.C59893JbI.CAMCORDER
            r2.A06 = r0
            return
        L_0x0211:
            java.lang.Object r2 = r12.A01
            X.LWg r2 = (X.LWg) r2
            X.7l3 r1 = r2.A0H
            r0 = 1041865114(0x3e19999a, float:0.15)
            r1.Er8(r0)
            com.instagram.common.session.UserSession r0 = r2.A0I
            X.LCx r0 = X.C63058Kqn.A00(r0)
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K04.A02(java.lang.Object):void");
    }
}
