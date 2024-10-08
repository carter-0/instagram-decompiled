package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import java.io.File;

public final class LZP implements SeekBar.OnSeekBarChangeListener, TextureView.SurfaceTextureListener, MXH {
    public STU A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final FrameLayout A05;
    public final SeekBar A06;
    public final UserSession A07;
    public final ConstrainedTextureView A08;
    public final C59986Jcv A09;
    public final AnonymousClass3Q2 A0A;
    public final C66518MUw A0B;
    public final C60250Ji7 A0C;
    public final C60123Jg4 A0D;
    public final C65234Lpe A0E;
    public final AnonymousClass0eM A0F;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (X.1KU.A08(r0) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r32, int r33, int r34) {
        /*
            r31 = this;
            r8 = 0
            r10 = r32
            X.0qQ.A0B(r10, r8)
            r1 = r31
            X.Ji7 r0 = r1.A0C
            X.Ti1 r0 = r0.A0D
            int r29 = r0.Byl()
            X.3Q2 r5 = r1.A0A
            X.8J0 r0 = r5.A12
            if (r0 == 0) goto L_0x00d3
            X.8JI r2 = r0.A03
        L_0x0018:
            X.8JI r0 = X.AnonymousClass8JI.REMIX
            boolean r0 = X.AnonymousClass7TF.A1W(r2, r0)
            r9 = r0 ^ 1
            java.lang.String r6 = r5.A3t
            if (r6 != 0) goto L_0x0028
            java.lang.String r6 = X.AnonymousClass7TG.A0j()
        L_0x0028:
            X.LQr r11 = X.C64152LQr.A00
            com.instagram.common.session.UserSession r0 = r1.A07
            X.0Tu r7 = X.0Tu.A05
            r2 = 36316040137346943(0x81053f00090f7f, double:3.0297482435898106E-306)
            boolean r13 = X.182.A06(r7, r0, r2)
            r3 = 0
            float r2 = r5.A00()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0047
            boolean r2 = X.1KU.A08(r0)
            r14 = 1
            if (r2 != 0) goto L_0x0048
        L_0x0047:
            r14 = 0
        L_0x0048:
            r4 = 0
            r12 = r0
            r15 = r8
            r16 = r8
            X.SJN r12 = r11.A01(r12, r13, r14, r15, r16)
            android.content.Context r14 = r1.A04
            X.KAx r11 = new X.KAx
            r11.<init>(r10)
            if (r9 == 0) goto L_0x00ce
            boolean r10 = X.C59911Jba.A01(r5)
            r2 = 36327559239252483(0x810fb900033a03, double:3.0370329700185745E-306)
            boolean r2 = X.182.A06(r7, r0, r2)
            X.AVr r21 = X.AAK.A01(r14, r0, r10, r8, r2)
        L_0x006b:
            X.Q1Q r15 = new X.Q1Q
            r15.<init>(r0)
            boolean r2 = r12.A0q
            if (r2 == 0) goto L_0x00cb
            X.Rs1 r19 = X.AnonymousClass7TG.A0Z()
        L_0x0078:
            int r3 = X.AnonymousClass8XF.A01(r14)
            r2 = 1080(0x438, float:1.513E-42)
            int r7 = java.lang.Math.min(r2, r3)
            r3 = 1
            X.Sr5 r2 = new X.Sr5
            r2.<init>(r3, r7)
            java.lang.String r7 = "cover_photo_selector"
            java.util.LinkedHashMap r27 = X.C63220KtR.A00(r7, r4)
            X.Lby r18 = X.C64443Lby.A00
            X.Q1d r17 = new X.Q1d
            r17.<init>()
            r28 = 59008(0xe680, float:8.2688E-41)
            X.STU r13 = new X.STU
            r24 = r6
            r25 = r4
            r26 = r4
            r20 = r4
            r22 = r12
            r23 = r11
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.A00 = r13
            com.facebook.videolite.transcoder.base.composition.MediaComposition r24 = X.C64191LSy.A03(r14, r0, r5, r9)
            if (r24 == 0) goto L_0x00ca
            X.STU r4 = r1.A00
            if (r4 == 0) goto L_0x00ca
            int r2 = r1.A03
            int r0 = r1.A02
            r27 = -1
            r28 = r27
            r30 = r3
            r23 = r4
            r25 = r2
            r26 = r0
            r23.A0A(r24, r25, r26, r27, r28, r29, r30)
        L_0x00ca:
            return
        L_0x00cb:
            r19 = r4
            goto L_0x0078
        L_0x00ce:
            X.AVr r21 = X.C392569v1.A00(r14, r4, r4, r8)
            goto L_0x006b
        L_0x00d3:
            r2 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LZP.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public LZP(Context context, FrameLayout frameLayout, SeekBar seekBar, AnonymousClass07Z r7, UserSession userSession, C60123Jg4 jg4, C59986Jcv jcv, AnonymousClass3Q2 r11, C66518MUw mUw, C60250Ji7 ji7, AnonymousClass0eM r14, int i, int i2) {
        AnonymousClass7TF.A1E(userSession, 2, jg4);
        0qQ.A0B(r7, 13);
        this.A04 = context;
        this.A07 = userSession;
        this.A05 = frameLayout;
        this.A06 = seekBar;
        this.A09 = jcv;
        this.A0C = ji7;
        this.A0D = jg4;
        this.A0B = mUw;
        this.A0A = r11;
        this.A03 = i;
        this.A02 = i2;
        this.A0F = r14;
        this.A0E = new C65234Lpe(ji7);
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context);
        this.A08 = constrainedTextureView;
        constrainedTextureView.setVisibility(0);
        constrainedTextureView.setSurfaceTextureListener(this);
        constrainedTextureView.setAspectRatio(0.5625f);
        frameLayout.addView(constrainedTextureView, 0);
        seekBar.setOnSeekBarChangeListener(this);
        DbV.A1F(r7, ji7.A07, new MP8(this, 14), 52);
    }

    public final void EJw(boolean z, float f) {
        this.A01 = z;
        Context context = this.A04;
        UserSession userSession = this.A07;
        int i = this.A03;
        int i2 = this.A02;
        LT1.A01(context, this.A08.getBitmap(), (Bitmap) ((C61084JwM) this.A0D.A01.getValue()).A00, userSession, this.A0E, (File) this.A0F.getValue(), 0.5625f, i, i2);
        this.A0A.A06 = AnonymousClass7TG.A0A((Number) this.A0C.A06.A02());
    }

    public final void onPause() {
        STU stu = this.A00;
        if (stu != null) {
            stu.A05();
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int max = (i * 100) / this.A06.getMax();
            C60250Ji7 ji7 = this.A0C;
            ji7.A00(max, false);
            int A042 = C51967G9n.A04((Number) ji7.A05.A02(), 0);
            STU stu = this.A00;
            if (stu != null) {
                stu.A09(A042);
            }
            this.A05.postDelayed(new C65934M4x(this), 50);
        }
    }

    public final void onResume() {
        STU stu = this.A00;
        if (stu != null) {
            stu.A06();
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A0B.Dmc();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.A0B.DnT();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        STU stu = this.A00;
        if (stu != null) {
            stu.A07();
        }
        this.A00 = null;
        return true;
    }
}
