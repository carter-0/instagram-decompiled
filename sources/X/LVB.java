package X;

import android.graphics.Point;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

public final class LVB implements AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public boolean A00;
    public final 1vq A01;
    public final STU A02;
    public final UserSession A03;
    public final C55570Hjq A04;
    public final Point A05;
    public final AudioManager A06;
    public final SJN A07;
    public final CameraSpec A08;

    public final void A00() {
        this.A00 = false;
        STU stu = this.A02;
        stu.A06 = null;
        stu.A07();
        stu.A08(1.0f);
    }

    public final void onAudioFocusChange(int i) {
        I6Y.A04(new C58711IwK(this, 6), new J6L(this, 3), i);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.Tfu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v0, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0070, code lost:
        if (X.1KU.A0F(r3) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LVB(android.content.Context r27, android.view.TextureView r28, com.instagram.common.session.UserSession r29, X.C55570Hjq r30, java.lang.String r31) {
        /*
            r26 = this;
            java.lang.String r19 = ""
            r0 = r26
            r0.<init>()
            r3 = r29
            r0.A03 = r3
            r1 = r30
            r0.A04 = r1
            java.lang.String r1 = "audio"
            r9 = r27
            java.lang.Object r2 = r9.getSystemService(r1)
            boolean r1 = r2 instanceof android.media.AudioManager
            r15 = 0
            if (r1 == 0) goto L_0x00c5
            android.media.AudioManager r2 = (android.media.AudioManager) r2
        L_0x001e:
            r0.A06 = r2
            X.1vq r1 = new X.1vq
            r1.<init>(r2, r3)
            r0.A01 = r1
            r2 = 1058013184(0x3f100000, float:0.5625)
            r5 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = X.C63472Kxb.A00(r9, r3, r1, r5, r5)
            android.graphics.Point r1 = X.AEW.A01(r9, r3, r2, r1)
            X.0qQ.A07(r1)
            r0.A05 = r1
            int r2 = r1.x
            int r1 = r1.y
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r1 = X.AnonymousClass72R.A01(r3, r2, r1)
            r0.A08 = r1
            X.LQr r20 = X.C64152LQr.A00
            X.0Tu r6 = X.0Tu.A05
            r1 = 36316040137346943(0x81053f00090f7f, double:3.0297482435898106E-306)
            boolean r22 = X.182.A06(r6, r3, r1)
            r1 = 758(0x2f6, float:1.062E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4 = r31
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0072
            r1 = 36316040137478017(0x81053f000b0f81, double:3.0297482436727024E-306)
            boolean r1 = X.182.A06(r6, r3, r1)
            if (r1 == 0) goto L_0x0072
            boolean r1 = X.1KU.A0F(r3)
            r23 = 1
            if (r1 != 0) goto L_0x0074
        L_0x0072:
            r23 = 0
        L_0x0074:
            r24 = r5
            r25 = r5
            r21 = r3
            X.SJN r2 = r20.A01(r21, r22, r23, r24, r25)
            r0.A07 = r2
            boolean r7 = X.C64152LQr.A00(r3)
            boolean r6 = X.C64152LQr.A00(r3)
            X.R9b r1 = new X.R9b
            r8 = r28
            r1.<init>(r8, r7, r6)
            X.AVr r16 = X.C392569v1.A00(r9, r15, r15, r5)
            X.Q1Q r10 = new X.Q1Q
            r10.<init>(r3)
            boolean r3 = r2.A0q
            if (r3 == 0) goto L_0x00c3
            X.Rs1 r14 = X.AnonymousClass7TG.A0Z()
        L_0x00a0:
            X.Sr5 r11 = new X.Sr5
            r11.<init>()
            java.util.LinkedHashMap r22 = X.C63220KtR.A00(r4, r15)
            X.Lby r13 = X.C64443Lby.A00
            X.Q1d r12 = new X.Q1d
            r12.<init>()
            r23 = 59008(0xe680, float:8.2688E-41)
            X.STU r8 = new X.STU
            r20 = r15
            r21 = r15
            r18 = r1
            r17 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A02 = r8
            return
        L_0x00c3:
            r14 = r15
            goto L_0x00a0
        L_0x00c5:
            r2 = r15
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LVB.<init>(android.content.Context, android.view.TextureView, com.instagram.common.session.UserSession, X.Hjq, java.lang.String):void");
    }

    public final void A01(MediaComposition mediaComposition) {
        STU stu = this.A02;
        CameraSpec cameraSpec = this.A08;
        stu.A0A(mediaComposition, cameraSpec.A03, cameraSpec.A02, -1, -1, 0, true);
        this.A00 = true;
        stu.A06();
        Boolean bool = 1GE.A00(this.A03).A01;
        if (bool == null || bool.booleanValue()) {
            this.A01.A04(this);
            stu.A08(1.0f);
            return;
        }
        stu.A08(0.0f);
        this.A01.A03(this);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        if (!this.A00 || (audioManager = this.A06) == null) {
            return false;
        }
        return I6Y.A05(audioManager, keyEvent, new C58711IwK(this, 7), i);
    }
}
