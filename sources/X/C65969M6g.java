package X;

import com.instagram.reels.musicpick.model.MusicPickReelTag;

/* renamed from: X.M6g  reason: case insensitive filesystem */
public final class C65969M6g implements Runnable {
    public final /* synthetic */ C65050LmU A00;
    public final /* synthetic */ MusicPickReelTag A01;

    public C65969M6g(C65050LmU lmU, MusicPickReelTag musicPickReelTag) {
        this.A00 = lmU;
        this.A01 = musicPickReelTag;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0067, code lost:
        if (r3 > 1.0f) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            X.LmU r6 = r1.A00
            X.0eM r0 = r6.A0N
            android.view.View r13 = X.AnonymousClass7TH.A06(r0)
            X.0eM r0 = r6.A0M
            android.view.View r14 = X.AnonymousClass7TH.A06(r0)
            X.0eM r8 = r6.A0L
            android.view.View r2 = X.AnonymousClass7TG.A0Q(r8)
            X.0eM r0 = r6.A0J
            android.widget.TextView r7 = X.JTQ.A0A(r0)
            X.0eM r0 = r6.A0S
            java.lang.Object r0 = r0.getValue()
            float r5 = X.AnonymousClass7TE.A04(r0)
            com.instagram.reels.musicpick.model.MusicPickReelTag r1 = r1.A01
            r4 = 0
            X.0qQ.A0B(r13, r4)
            X.AnonymousClass7TG.A1U(r14, r2, r7)
            android.graphics.Rect r12 = X.AnonymousClass7TE.A0W()
            int r3 = r2.getWidth()
            int r2 = r2.getHeight()
            float r0 = r1.A00
            X.C306746Ni.A01(r12, r1, r0, r3, r2)
            int r11 = r13.getWidth()
            int r10 = r13.getHeight()
            int r0 = r12.width()
            float r9 = (float) r0
            float r0 = (float) r11
            float r9 = r9 / r0
            int r0 = r12.height()
            float r3 = (float) r0
            float r2 = (float) r10
            float r3 = r3 / r2
            r17 = r9
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            r17 = r3
        L_0x005e:
            r16 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0069
            int r15 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            r0 = 0
            if (r15 <= 0) goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            if (r11 <= 0) goto L_0x0116
            if (r10 <= 0) goto L_0x0116
            if (r0 == 0) goto L_0x008d
            android.view.ViewGroup$LayoutParams r11 = r14.getLayoutParams()
            if (r11 == 0) goto L_0x010f
            int r0 = r12.width()
            r11.width = r0
            int r10 = r12.height()
            int r0 = r7.getMeasuredHeight()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            int r10 = r10 + r0
            r11.height = r10
            r14.setLayoutParams(r11)
        L_0x008d:
            int r0 = r12.left
            float r0 = (float) r0
            r14.setX(r0)
            int r0 = r12.top
            float r0 = (float) r0
            r14.setY(r0)
            int r0 = r12.width()
            float r0 = (float) r0
            r10 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r10
            r14.setPivotX(r0)
            int r0 = r12.height()
            float r0 = (float) r0
            float r0 = r0 / r10
            r14.setPivotY(r0)
            float r1 = r1.A01
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 * r0
            r14.setRotation(r1)
            r0 = 0
            r13.setPivotX(r0)
            r13.setPivotY(r0)
            r13.setScaleX(r9)
            r13.setScaleY(r3)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            if (r1 == 0) goto L_0x0108
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r12.width()
            r1.width = r0
            float r3 = r3 - r16
            float r2 = r2 * r3
            int r0 = (int) r2
            r1.topMargin = r0
            r7.setLayoutParams(r1)
            int r0 = r7.getPaddingTop()
            float r0 = (float) r0
            float r0 = r0 * r17
            int r3 = (int) r0
            android.content.res.Resources r0 = r7.getResources()
            int r2 = X.JTP.A03(r0)
            int r1 = X.AnonymousClass7TE.A0D(r0)
            X.2HY r0 = new X.2HY
            r0.<init>(r2, r1)
            int r0 = X.C229632nm.A05(r0, r3)
            X.0nA.A0c(r7, r0)
            float r5 = r5 * r17
            r7.setTextSize(r4, r5)
            android.view.View r1 = X.AnonymousClass7TG.A0Q(r8)
            r0 = 57
            X.LY0.A00(r1, r0, r6)
            return
        L_0x0108:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x010f:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0116:
            r0 = 1290(0x50a, float:1.808E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 1025(0x401, float:1.436E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.002.A02(r11, r10, r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65969M6g.run():void");
    }
}
