package X;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import org.webrtc.CameraCapturer;

/* renamed from: X.Ups  reason: case insensitive filesystem */
public final class C16167Ups extends AnonymousClass9XK implements C300645xY {
    public StaticLayout[] A00;
    public int A01;
    public final TextPaint A02;
    public final int A03;
    public final Camera A04;
    public final C18614Vv7 A05;
    public final WCY A06 = new WCY();

    public C16167Ups(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C19498Wak wak, int i) {
        super(context, musicOverlayStickerModel, wak, AnonymousClass6KJ.LYRICS_CUBE_REVEAL, 0.8f);
        this.A05 = new C18614Vv7(wak, CameraCapturer.OPEN_CAMERA_DELAY_MS, 0, CameraCapturer.OPEN_CAMERA_DELAY_MS);
        TextPaint textPaint = new TextPaint(1);
        this.A02 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize((((float) (0nA.A09(context) * 62)) / 1080.0f) * 1.2f);
        textPaint.setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A10));
        this.A01 = Color.alpha(i);
        Camera camera = new Camera();
        this.A04 = camera;
        camera.setLocation(0.0f, 0.0f, 50.0f);
        this.A03 = C17039VFn.A00(textPaint) * 4;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        int A062 = AnonymousClass7TF.A06(this);
        C19498Wak wak = this.A08;
        this.A00 = new StaticLayout[wak.BcH()];
        int BcH = wak.BcH();
        for (int i = 0; i < BcH; i++) {
            String BcG = wak.BcG(i);
            StaticLayout[] staticLayoutArr = this.A00;
            if (staticLayoutArr != null) {
                TextPaint textPaint = this.A02;
                AnonymousClass7TG.A1O(textPaint, BcG);
                staticLayoutArr[i] = C18381Vqh.A00(C18381Vqh.A00, textPaint, BcG, 4, A062);
            }
        }
    }

    private final void A00(Canvas canvas, float f, int i) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout[] staticLayoutArr = this.A00;
        if (staticLayoutArr == null) {
            throw new IllegalStateException("runLayout() has not run yet");
        } else if (i >= 0 && i < staticLayoutArr.length) {
            canvas.save();
            Camera camera = this.A04;
            camera.save();
            int i2 = this.A03;
            camera.translate(0.0f, 0.0f, ((float) (-i2)) / 2.0f);
            camera.rotateX(f);
            camera.translate(0.0f, 0.0f, ((float) i2) / 2.0f);
            camera.applyToCanvas(canvas);
            camera.restore();
            StaticLayout[] staticLayoutArr2 = this.A00;
            if (staticLayoutArr2 != null) {
                staticLayout = staticLayoutArr2[i];
            } else {
                staticLayout = null;
            }
            int i3 = 0;
            if (staticLayout != null) {
                i3 = staticLayout.getHeight();
            }
            canvas.translate(0.0f, ((float) (-i3)) / 2.0f);
            StaticLayout[] staticLayoutArr3 = this.A00;
            if (!(staticLayoutArr3 == null || (staticLayout2 = staticLayoutArr3[i]) == null)) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r3 > 1.0f) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.graphics.Canvas r12, int r13) {
        /*
            r11 = this;
            android.text.StaticLayout[] r0 = r11.A00
            if (r0 == 0) goto L_0x00a2
            float r10 = X.C13990Tnq.A01(r12, r11)
            X.Vv7 r2 = r11.A05
            r2.A02(r13)
            int r6 = r2.A01
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x00e1
            float r7 = r2.A00
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x00a3
            r0 = 2
            if (r1 != r0) goto L_0x00d9
            X.WCY r5 = r11.A06
            float r3 = r2.A01(r6)
            int r4 = r6 + 1
            float r2 = r2.A01(r4)
            r9 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            java.lang.String r1 = " in setStartEndVelocities()"
            if (r0 == 0) goto L_0x00cd
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
            r5.A02 = r3
            r5.A00 = r2
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 - r3
            float r0 = r0 - r2
            float r0 = r0 / r10
            r5.A01 = r0
            float r7 = r5.getInterpolation(r7)
            android.text.TextPaint r5 = r11.A02
            int r0 = r11.A01
            float r3 = (float) r0
            float r9 = r9 - r8
            float r2 = r8 - r3
            r1 = 0
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            float r1 = r7 - r8
            float r1 = r1 / r9
        L_0x0063:
            float r1 = r1 * r2
            float r1 = r1 + r3
            int r0 = (int) r1
            r5.setAlpha(r0)
            r3 = -1053818880(0xffffffffc1300000, float:-11.0)
            r2 = -1029832704(0xffffffffc29e0000, float:-79.0)
            float r2 = r2 - r3
            r1 = 0
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            float r1 = r7 - r8
            float r1 = r1 / r9
        L_0x0076:
            float r1 = r1 * r2
            float r1 = r1 + r3
            r11.A00(r12, r1, r6)
            int r0 = r11.A01
            float r2 = (float) r0
            float r2 = r2 - r8
            r1 = 0
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0087
            float r1 = r7 - r8
            float r1 = r1 / r9
        L_0x0087:
            float r1 = r1 * r2
            float r1 = r1 + r8
            int r0 = (int) r1
            r5.setAlpha(r0)
            r3 = 1117650944(0x429e0000, float:79.0)
            r2 = 1093664768(0x41300000, float:11.0)
            float r2 = r2 - r3
            r1 = 0
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            float r7 = r7 - r8
            float r1 = r7 / r9
        L_0x009a:
            float r1 = r1 * r2
            float r1 = r1 + r3
            r11.A00(r12, r1, r4)
        L_0x009f:
            r12.restore()
        L_0x00a2:
            return
        L_0x00a3:
            android.text.TextPaint r1 = r11.A02
            int r0 = r11.A01
            r1.setAlpha(r0)
            r5 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 1093664768(0x41300000, float:11.0)
            r2 = -1053818880(0xffffffffc1300000, float:-11.0)
            float r4 = r4 - r5
            float r2 = r2 - r3
            r1 = 0
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00bb
            float r7 = r7 - r5
            float r1 = r7 / r4
        L_0x00bb:
            float r1 = r1 * r2
            float r1 = r1 + r3
            r11.A00(r12, r1, r6)
            goto L_0x009f
        L_0x00c1:
            java.lang.String r0 = "StartEndVelocityAccelerateDecelerateInterpolator: invalid end velocity "
            java.lang.String r1 = X.002.A0Z(r0, r1, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00cd:
            java.lang.String r0 = "StartEndVelocityAccelerateDecelerateInterpolator: invalid start velocity "
            java.lang.String r1 = X.002.A0Z(r0, r1, r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d9:
            java.lang.String r1 = "invalid stage for this animation"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16167Ups.A01(android.graphics.Canvas, int):void");
    }

    public final int Aox() {
        return C13989Tnp.A0D(this.A02, this.A01);
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        AnonymousClass6KJ r4 = this.A09;
        return new Af1(this.A08.A00, this.A01, (C40599Aen) null, r4, Aox());
    }

    public final String C4F() {
        return C273654mx.A00(824);
    }

    public final void ESC(int i) {
        this.A02.setColor(i);
        this.A01 = Color.alpha(i);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return (int) (((float) this.A03) * 1.35f);
    }

    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
