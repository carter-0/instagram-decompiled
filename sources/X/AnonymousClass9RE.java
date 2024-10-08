package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9RE  reason: invalid class name */
public final class AnonymousClass9RE implements C41838B2t {
    public boolean A00 = true;
    public final /* synthetic */ A67 A01;
    public final /* synthetic */ C378369Pn A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ Runnable A06;

    public AnonymousClass9RE(A67 a67, C378369Pn r3, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4) {
        this.A02 = r3;
        this.A01 = a67;
        this.A05 = runnable;
        this.A06 = runnable2;
        this.A03 = runnable3;
        this.A04 = runnable4;
    }

    public final void DxO(String str) {
        A67 a67 = this.A01;
        if (a67 != null) {
            AnonymousClass8LU r5 = a67.A00;
            C279284yO r1 = r5.A05;
            if (r1 == AnonymousClass9QA.A00 || r1 == AnonymousClass80M.A00) {
                UserSession userSession = r5.A0c;
                C365918nt.A00(userSession).A04("Error during MediaPlayer prepare", 002.A0R("camera_destination ", r5.A05.A02));
                AnonymousClass82Y r12 = r5.A0k.A02.A01;
                if (r12.A0G != null) {
                    C365918nt.A00(userSession).A01("Error during MediaPlayer prepare");
                } else if (r12.A0D == AnonymousClass05K.A01) {
                    C365918nt.A00(userSession).A03("Error during MediaPlayer prepare", 002.A0R("camera_destination ", r5.A05.A02));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0201, code lost:
        if (r1 < 3) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0241, code lost:
        if (r0.getBackground() != null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0175, code lost:
        if (r10.A0B != null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0195, code lost:
        if (r11.A02 != false) goto L_0x0197;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DxW(int r29) {
        /*
            r28 = this;
            r12 = r28
            X.A67 r11 = r12.A01
            if (r11 == 0) goto L_0x0203
            X.8LU r10 = r11.A00
            boolean r0 = r10.A0O
            if (r0 != 0) goto L_0x016f
            X.9Pn r1 = r10.A0B
            if (r1 == 0) goto L_0x001c
            boolean r0 = r10.A0L
            if (r0 == 0) goto L_0x0115
            r0 = 0
        L_0x0015:
            X.9Pw r1 = r1.A08
            if (r1 == 0) goto L_0x001c
            r1.A0G(r0)
        L_0x001c:
            X.0eK r0 = r10.A13
            java.lang.Object r2 = r0.get()
            X.8Wv r2 = (X.C357178Wv) r2
            if (r2 == 0) goto L_0x0180
            X.7zv r5 = r11.A01
            X.C357178Wv.A00(r2)
            X.85O r0 = r2.A06
            X.05G r1 = r0.A0B
            r4 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.Epw(r0)
            X.82p r0 = r2.A03
            X.82o r0 = r0.A02
            X.82Y r1 = r0.A01
            java.lang.String r0 = r1.A0G
            r6 = 0
            if (r0 == 0) goto L_0x0043
            r6 = 1
        L_0x0043:
            X.8FK r0 = r2.A05
            X.81C r0 = r0.A00
            X.81E r9 = r0.A00()
            X.8FL r9 = (X.AnonymousClass8FL) r9
            boolean r1 = r1.A0L
            r8 = 0
            android.graphics.drawable.Drawable r2 = r9.A04
            if (r2 == 0) goto L_0x010c
            float r14 = r9.A00
        L_0x0056:
            if (r2 == 0) goto L_0x0103
            float r13 = r9.A01
        L_0x005a:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r9.A0N
            r27 = r0
            float r15 = r27.getRotation()
            float r19 = r27.getScaleX()
            android.view.ViewGroup$LayoutParams r7 = r27.getLayoutParams()
            boolean r0 = r7 instanceof android.widget.FrameLayout.LayoutParams
            r18 = 0
            if (r0 == 0) goto L_0x0074
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            if (r7 != 0) goto L_0x007d
        L_0x0074:
            android.view.ViewGroup$LayoutParams r0 = r27.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r0)
        L_0x007d:
            X.8BH r3 = r9.A07
            android.graphics.drawable.Drawable r0 = r9.A04
            if (r0 == 0) goto L_0x0100
            android.graphics.Rect r0 = r0.getBounds()
            if (r0 == 0) goto L_0x0100
            int r0 = r0.width()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
        L_0x0091:
            android.graphics.drawable.Drawable r0 = r9.A04
            if (r0 == 0) goto L_0x00fd
            android.graphics.Rect r0 = r0.getBounds()
            if (r0 == 0) goto L_0x00fd
            int r0 = r0.height()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x00a3:
            X.7zv r2 = r5.A0X
            if (r2 == 0) goto L_0x0180
            if (r17 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x0180
        L_0x00ab:
            int r0 = r2.A0F
            if (r0 != r4) goto L_0x0180
            if (r6 != 0) goto L_0x0180
            java.lang.String r0 = "dual"
            r5.A0g = r0
            if (r17 == 0) goto L_0x00fa
            int r6 = r17.intValue()
        L_0x00bb:
            if (r16 == 0) goto L_0x00f7
            int r5 = r16.intValue()
        L_0x00c1:
            r1 = 1051931443(0x3eb33333, float:0.35)
            if (r17 == 0) goto L_0x00c8
            r1 = r19
        L_0x00c8:
            X.ADo r0 = new X.ADo
            r0.<init>()
            r0.A0H = r4
            X.87i r4 = r9.A0I
            r0.A08 = r4
            r0.A06 = r3
            r0.A01(r14, r13)
            r0.A03 = r15
            r0.A04 = r1
            r1 = 1032805417(0x3d8f5c29, float:0.07)
            r0.A01 = r1
            r1 = 1071644672(0x3fe00000, float:1.75)
            r0.A00 = r1
            X.6b1 r3 = new X.6b1
            r3.<init>(r0)
            java.lang.String r0 = r2.A0k
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r0 = 3
            com.instagram.common.gallery.Medium r21 = X.C282665Eg.A03(r1, r0, r8)
            goto L_0x0119
        L_0x00f7:
            int r5 = r9.A0A
            goto L_0x00c1
        L_0x00fa:
            int r6 = r9.A0B
            goto L_0x00bb
        L_0x00fd:
            r16 = r18
            goto L_0x00a3
        L_0x0100:
            r17 = r18
            goto L_0x0091
        L_0x0103:
            r2 = -1099914282(0xffffffffbe70a3d6, float:-0.23499998)
            int r0 = r9.A0A
            float r13 = (float) r0
            float r13 = r13 * r2
            goto L_0x005a
        L_0x010c:
            r14 = 1049414860(0x3e8ccccc, float:0.27499998)
            int r0 = r9.A0B
            float r0 = (float) r0
            float r14 = r14 * r0
            goto L_0x0056
        L_0x0115:
            float r0 = r10.A00
            goto L_0x0015
        L_0x0119:
            com.instagram.common.session.UserSession r0 = r9.A0G     // Catch:{ IllegalArgumentException -> 0x0178 }
            r2 = 0
            java.lang.String r15 = "dual_video"
            X.9lw r1 = new X.9lw     // Catch:{ IllegalArgumentException -> 0x0178 }
            r22 = r0
            r23 = r14
            r24 = r13
            r25 = r6
            r26 = r5
            r19 = r1
            r20 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IllegalArgumentException -> 0x0178 }
            X.5nL r0 = X.C294975nL.A00(r27)     // Catch:{ IllegalArgumentException -> 0x0178 }
            r0.A0G()     // Catch:{ IllegalArgumentException -> 0x0178 }
            r5 = 4
            r0 = r27
            r0.setVisibility(r5)     // Catch:{ IllegalArgumentException -> 0x0178 }
            X.8BA r5 = r9.A0J     // Catch:{ IllegalArgumentException -> 0x0178 }
            java.util.List r19 = java.util.Collections.singletonList(r15)     // Catch:{ IllegalArgumentException -> 0x0178 }
            X.0qQ.A07(r19)     // Catch:{ IllegalArgumentException -> 0x0178 }
            X.57C r0 = r9.A0E     // Catch:{ IllegalArgumentException -> 0x0178 }
            r14 = r5
            r15 = r1
            r16 = r0
            r17 = r3
            r14.A0f(r15, r16, r17, r18, r19)     // Catch:{ IllegalArgumentException -> 0x0178 }
            X.9X8 r0 = r4.A09     // Catch:{ IllegalArgumentException -> 0x0178 }
            if (r0 == 0) goto L_0x0158
            r0.A00 = r2     // Catch:{ IllegalArgumentException -> 0x0178 }
        L_0x0158:
            X.87n r0 = r4.A0P     // Catch:{ IllegalArgumentException -> 0x0178 }
            X.4M3 r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0178 }
            if (r0 == 0) goto L_0x0161
            r0.Eqr(r2, r8)     // Catch:{ IllegalArgumentException -> 0x0178 }
        L_0x0161:
            r9.A05 = r1     // Catch:{ IllegalArgumentException -> 0x0178 }
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r9.A0L     // Catch:{ IllegalArgumentException -> 0x0178 }
            android.graphics.drawable.Drawable r0 = r9.A04     // Catch:{ IllegalArgumentException -> 0x0178 }
            r1.A0S(r0)     // Catch:{ IllegalArgumentException -> 0x0178 }
            r0 = r18
            r9.A04 = r0     // Catch:{ IllegalArgumentException -> 0x0178 }
            goto L_0x0180
        L_0x016f:
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x019a
            X.9Pn r0 = r10.A0B
            if (r0 == 0) goto L_0x019a
            goto L_0x0197
        L_0x0178:
            r2 = move-exception
            java.lang.String r1 = "DualController"
            java.lang.String r0 = "Error creating video sticker for dual."
            X.0kD.A0E(r1, r0, r2)
        L_0x0180:
            boolean r0 = r10.A0N
            if (r0 == 0) goto L_0x0189
            X.8M8 r0 = r10.A0x
            r0.A00()
        L_0x0189:
            java.lang.Runnable r0 = r10.A0E
            if (r0 == 0) goto L_0x0193
            r0.run()
            r0 = 0
            r10.A0E = r0
        L_0x0193:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x019a
        L_0x0197:
            X.AnonymousClass8LU.A07(r10)
        L_0x019a:
            boolean r0 = r10.A0O
            r2 = r29
            if (r0 == 0) goto L_0x01b9
            if (r29 != 0) goto L_0x01b9
            X.87i r1 = r10.A0e
            X.8Yz r0 = r1.A0O
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x01b9
            X.87n r0 = r1.A0P
            r0.A01()
        L_0x01b9:
            X.3Q2 r0 = r10.A0D
            if (r0 == 0) goto L_0x01dc
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A10
            if (r0 == 0) goto L_0x01dc
            java.util.Map r1 = r0.A0Z
            java.lang.String r0 = "playbackInfo"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x01dc
            X.84f r0 = r10.A0Z
            X.81C r0 = r0.A00
            X.81E r1 = r0.A00()
            X.84i r1 = (X.C3503584i) r1
            int r0 = r10.A0E()
            r1.AVi(r2, r0)
        L_0x01dc:
            r4 = 0
            r10.A0M = r4
            r0 = 1
            r10.A0O = r0
            X.8Lz r3 = r10.A0n
            X.80G r2 = r10.A04
            android.view.ViewGroup r5 = r10.A0X
            X.0qQ.A0B(r2, r4)
            X.0qQ.A0B(r5, r0)
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x021e
            int r1 = r0.intValue()
            if (r1 < 0) goto L_0x0203
            int r0 = r1 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            r0 = 3
            if (r1 >= r0) goto L_0x021e
        L_0x0203:
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x021d
            r0 = 0
            r12.A00 = r0
            X.9Pn r1 = r12.A02
            com.facebook.common.math.matrix.Matrix4 r0 = X.C378369Pn.A0R
            com.instagram.common.session.UserSession r1 = r1.A0L
            r2 = 17639126(0x10d26d6, float:2.5925473E-38)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.02m r1 = X.02m.A0p
            r0 = 2
            r1.markerEnd(r2, r0)
        L_0x021d:
            return
        L_0x021e:
            r0 = 0
            r3.A03 = r0
            X.9Xt r0 = r3.A02
            if (r0 == 0) goto L_0x0203
            android.view.View r0 = r2.A05()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0243
            X.9Xt r0 = r3.A02
            if (r0 != 0) goto L_0x023d
            java.lang.String r0 = "guideView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x023d:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x0203
        L_0x0243:
            android.view.View r0 = r2.A05()
            r0.setVisibility(r4)
            X.C354428Lz.A00(r5, r2, r3)
            goto L_0x0203
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9RE.DxW(int):void");
    }

    public final void Dy0() {
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void Dy2() {
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void DyQ() {
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void DyY() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
    }
}
