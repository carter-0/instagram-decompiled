package X;

import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Upu  reason: case insensitive filesystem */
public abstract class C16169Upu extends AnonymousClass9XK {
    public List A00 = Collections.emptyList();
    public int A01 = -1;
    public int A02 = 255;
    public int A03 = -1;
    public final TextPaint A04;
    public final VTG A05;
    public final C18614Vv7 A06;
    public final C17529VZi A07;

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        0qQ.A0B(rect2, 0);
        super.onBoundsChange(rect2);
        if (this.A03 != rect2.width() || this.A01 != rect2.height()) {
            this.A03 = rect2.width();
            this.A01 = rect2.height();
            Rect A0X = AnonymousClass7TE.A0X(this);
            int width = A0X.width();
            int height = A0X.height();
            C19498Wak wak = this.A08;
            this.A00 = new ArrayList(wak.BcH());
            int BcH = wak.BcH();
            for (int i = 0; i < BcH; i++) {
                List list = this.A00;
                VTG vtg = this.A05;
                String BcG = wak.BcG(i);
                0qQ.A0B(BcG, 0);
                if (vtg.A00) {
                    BcG = AnonymousClass7TF.A0k(BcG);
                }
                TextPaint textPaint = vtg.A01;
                0qQ.A0B(textPaint, 1);
                StaticLayout A002 = C18381Vqh.A00(Layout.Alignment.ALIGN_CENTER, textPaint, BcG, height / C17039VFn.A00(textPaint), width);
                int height2 = (height - A002.getHeight()) / 2;
                String substring = BcG.substring(0, A002.getText().length());
                ArrayList A15 = DbV.A15(substring);
                int lineCount = A002.getLineCount();
                for (int i2 = 0; i2 < lineCount; i2++) {
                    int lineStart = A002.getLineStart(i2);
                    String A0q = C51967G9n.A0q(substring, lineStart, (A002.getLineEnd(i2) - 1) + 1);
                    float primaryHorizontal = A002.getPrimaryHorizontal(lineStart);
                    A15.add(new C17862VhF(A0q, (float) A002.getLineBaseline(i2), primaryHorizontal, textPaint.measureText(A0q) + primaryHorizontal));
                }
                list.add(new C17835Vgo(A002, A15, height2));
            }
        }
    }

    public final void A01(Canvas canvas, int i) {
        Integer num;
        float interpolation;
        float f;
        float f2;
        float A022;
        float f3;
        float f4;
        Rect A0X = AnonymousClass7TE.A0X(this);
        if (!this.A00.isEmpty()) {
            C18614Vv7 vv7 = this.A06;
            vv7.A02(i);
            C17835Vgo vgo = (C17835Vgo) this.A00.get(vv7.A01);
            Canvas canvas2 = canvas;
            canvas2.save();
            canvas2.translate((float) A0X.left, (float) (A0X.top + vgo.A00));
            C17529VZi vZi = this.A07;
            Integer num2 = vv7.A02;
            if (num2 != null) {
                float f5 = vv7.A00;
                List list = vgo.A02;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C17862VhF vhF = (C17862VhF) list.get(i2);
                    C17257VOk vOk = vZi.A03;
                    Integer num3 = AnonymousClass05K.A01;
                    if (num2 == num3) {
                        num = AnonymousClass05K.A00;
                        vOk.A00 = num;
                        num3 = num;
                        A022 = 1.0f;
                    } else {
                        float f6 = 1.0f / ((((float) (size - 1)) * (1.0f - vZi.A00)) + 1.0f);
                        num = AnonymousClass05K.A00;
                        if (num2 == num) {
                            interpolation = vZi.A01.getInterpolation(f5);
                            f2 = ((float) i2) * (1.0f - vZi.A00) * f6;
                            if (interpolation >= f2) {
                                vOk.A00 = num;
                                num3 = num;
                                f = f2 + f6;
                            }
                        } else {
                            interpolation = vZi.A02.getInterpolation(f5);
                            f = 1.0f - (((float) ((size - i2) - 1)) * ((1.0f - vZi.A00) * f6));
                            if (interpolation <= f) {
                                vOk.A00 = num3;
                                f2 = f - f6;
                            }
                        }
                        A022 = 0mi.A02(interpolation, f2, f, 0.0f, 1.0f);
                    }
                    VWI vwi = vZi.A04;
                    0qQ.A0B(vhF, 1);
                    if (num3 == num) {
                        f3 = A022;
                        f4 = 1.0f - A022;
                    } else {
                        f3 = 1.0f - A022;
                        f4 = -A022;
                    }
                    TextPaint textPaint = vwi.A02;
                    C13988Tno.A0o(255.0f, f3, textPaint);
                    canvas2.save();
                    Camera camera = vwi.A00;
                    camera.save();
                    float abs = Math.abs(vwi.A01.ascent);
                    float f7 = vhF.A02;
                    float f8 = vhF.A01 - f7;
                    float f9 = abs / 2.0f;
                    canvas2.translate(f7 + (f8 / 2.0f), vhF.A00 - f9);
                    camera.translate(0.0f, 0.0f, (-abs) / 2.0f);
                    camera.rotateX(f4 * 90.0f);
                    camera.translate(0.0f, 0.0f, f9);
                    camera.applyToCanvas(canvas2);
                    camera.restore();
                    canvas2.drawText(vhF.A03, (-f8) / 2.0f, f9, textPaint);
                    canvas2.restore();
                }
                canvas2.restore();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final int Aox() {
        return C13989Tnp.A0D(this.A04, this.A02);
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        AnonymousClass6KJ r4 = this.A09;
        return new Af1(this.A08.A00, this.A01, (C40599Aen) null, r4, this.A04.getColor());
    }

    public final void ESC(int i) {
        this.A04.setColor(i);
        this.A02 = Color.alpha(i);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A02 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16169Upu(android.content.Context r13, android.graphics.Typeface r14, com.instagram.music.common.model.MusicOverlayStickerModel r15, X.C19498Wak r16, X.AnonymousClass6KJ r17, float r18, int r19) {
        /*
            r12 = this;
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            r5 = 1
            r6 = r12
            r7 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r6.<init>(r7, r8, r9, r10, r11)
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r5)
            r12.A04 = r4
            java.util.List r0 = java.util.Collections.emptyList()
            r12.A00 = r0
            r0 = -1
            r12.A03 = r0
            r12.A01 = r0
            r0 = 255(0xff, float:3.57E-43)
            r12.A02 = r0
            r0 = r19
            r4.setColor(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
            r4.setTextAlign(r0)
            r0 = r18
            r4.setTextSize(r0)
            r4.setTypeface(r14)
            r3 = 0
            r2 = 900(0x384, float:1.261E-42)
            r1 = 450(0x1c2, float:6.3E-43)
            X.Vv7 r0 = new X.Vv7
            r0.<init>(r9, r3, r2, r1)
            r12.A06 = r0
            X.VTG r0 = new X.VTG
            r0.<init>(r4)
            r0.A00 = r5
            r12.A05 = r0
            X.VWI r0 = new X.VWI
            r0.<init>(r4)
            X.VZi r2 = new X.VZi
            r2.<init>(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.A00 = r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>(r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r2.A01 = r1
            r2.A02 = r0
            r12.A07 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16169Upu.<init>(android.content.Context, android.graphics.Typeface, com.instagram.music.common.model.MusicOverlayStickerModel, X.Wak, X.6KJ, float, int):void");
    }
}
