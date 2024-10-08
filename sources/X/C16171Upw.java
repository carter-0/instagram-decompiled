package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.WordOffset;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.Upw  reason: case insensitive filesystem */
public final class C16171Upw extends AnonymousClass9XK implements C300645xY {
    public int A00;
    public final TextPaint A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Rect A05 = new Rect();
    public final SparseArray A06 = new SparseArray();
    public final SparseIntArray A07 = new SparseIntArray();
    public final C18614Vv7 A08;

    public C16171Upw(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C19498Wak wak, int i) {
        super(context, musicOverlayStickerModel, wak, AnonymousClass6KJ.LYRICS_TYPEWRITER, 0.7f);
        this.A08 = new C18614Vv7(wak, 0, 0, CameraCapturer.OPEN_CAMERA_DELAY_MS);
        float A09 = (((float) (0nA.A09(context) * 44)) / 1080.0f) * 1.2f;
        TextPaint textPaint = new TextPaint(1);
        this.A01 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A14));
        textPaint.setTextSize(A09);
        this.A03 = A09 / 2.1818182f;
        this.A02 = textPaint.measureText(" ") * 0.2f;
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setColor(i);
        this.A00 = Color.alpha(i);
    }

    public final void A01(Canvas canvas, int i) {
        int i2;
        float f;
        WordOffset wordOffset;
        Rect A0X = AnonymousClass7TE.A0X(this);
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.translate((float) A0X.left, (float) A0X.top);
        C18614Vv7 vv7 = this.A08;
        int i3 = i;
        vv7.A02(i3);
        int i4 = vv7.A01;
        for (int i5 = this.A07.get(i4); i5 < i4; i5++) {
            Layout layout = (Layout) this.A06.get(i5);
            if (layout != null) {
                layout.draw(canvas2);
                canvas2.translate(0.0f, (float) layout.getHeight());
            }
        }
        C19498Wak wak = this.A08;
        String BcG = wak.BcG(i4);
        List A002 = wak.A00(i4);
        if (A002 == null || A002.isEmpty()) {
            Integer num = vv7.A02;
            if (num != null) {
                if (num == AnonymousClass05K.A01) {
                    f = vv7.A00;
                    if (0.0f > f || f > 1.0f) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("TypewriterLyricsStickerDrawable: invalid progress ");
                        sb.append(f);
                        sb.append(" for frame time ");
                        sb.append(i3);
                        throw new IllegalStateException(AnonymousClass7TF.A0l(" in drawFrame()", sb));
                    }
                } else {
                    f = 1.0f;
                }
                i2 = (int) (((float) Math.max(BcG.length() - 1, 0)) * f);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            int Byp = i - wak.Byp(i4);
            int A062 = C51966G9m.A06(A002);
            while (true) {
                int i6 = A062 - 1;
                wordOffset = (WordOffset) A002.get(A062);
                if (i6 < 0 || Byp >= wordOffset.A03) {
                    int i7 = wordOffset.A03;
                } else {
                    A062 = i6;
                }
            }
            int i72 = wordOffset.A03;
            if (Byp < i72) {
                i2 = 0;
            } else {
                int i8 = wordOffset.A01;
                if (Byp > i8) {
                    i2 = wordOffset.A00 - (wordOffset.A04 ^ true ? 1 : 0);
                } else {
                    int i9 = Byp - i72;
                    int i10 = i8 - i72;
                    if (i9 == i10) {
                        i2 = wordOffset.A00 - 1;
                    } else {
                        float f2 = ((float) i9) / ((float) i10);
                        int i11 = wordOffset.A00;
                        int i12 = wordOffset.A02;
                        i2 = ((int) (f2 * ((float) (i11 - i12)))) + i12;
                    }
                }
            }
        }
        Layout layout2 = (Layout) this.A06.get(i4);
        if (layout2 != null) {
            int lineForOffset = layout2.getLineForOffset(i2);
            for (int i13 = 0; i13 < lineForOffset; i13++) {
                String A0q = C51967G9n.A0q(BcG, layout2.getLineStart(i13), layout2.getLineEnd(i13));
                Rect rect = this.A05;
                canvas2.drawText(A0q, (float) rect.left, (float) layout2.getLineBounds(i13, rect), this.A01);
            }
            Rect rect2 = this.A05;
            int lineBounds = layout2.getLineBounds(lineForOffset, rect2);
            String A0q2 = C51967G9n.A0q(BcG, layout2.getLineStart(lineForOffset), Math.min(i2 + 1, BcG.length()));
            float f3 = (float) lineBounds;
            TextPaint textPaint = this.A01;
            canvas2.drawText(A0q2, (float) rect2.left, f3, textPaint);
            Paint paint = this.A04;
            float f4 = (float) this.A00;
            int i14 = i3 % IgNetworkConsentStorage.MAX_ENTRIES;
            float f5 = (float) i14;
            if (f5 >= 500.0f) {
                f5 = (float) (1000 - i14);
            }
            C13988Tno.A0o(f4, f5 / 500.0f, paint);
            float measureText = ((float) rect2.left) + textPaint.measureText(A0q2) + this.A02;
            canvas2.drawRect(measureText, (float) rect2.top, measureText + this.A03, f3 + C13988Tno.A01(rect2.bottom - lineBounds), paint);
            canvas2.restore();
        }
    }

    public final void DT8(MusicOverlayStickerModel musicOverlayStickerModel) {
        0qQ.A0B(musicOverlayStickerModel, 0);
        this.A01 = musicOverlayStickerModel;
        A00();
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00();
    }

    private final void A00() {
        SparseIntArray sparseIntArray = this.A07;
        sparseIntArray.clear();
        SparseArray sparseArray = this.A06;
        sparseArray.clear();
        C19498Wak wak = this.A08;
        int BcH = wak.BcH();
        MusicOverlayStickerModel musicOverlayStickerModel = this.A01;
        int i = 0;
        int A0A = AnonymousClass7TG.A0A(musicOverlayStickerModel.A0K);
        Integer num = musicOverlayStickerModel.A0O;
        if (num != null) {
            i = num.intValue();
        }
        int i2 = i + A0A;
        int AYh = wak.AYh(A0A);
        int i3 = this.A06;
        int i4 = (int) ((((float) i3) - this.A02) - this.A03);
        int i5 = AYh;
        int i6 = i3;
        while (AYh < BcH && wak.Byp(AYh) <= i2) {
            String BcG = wak.BcG(AYh);
            TextPaint textPaint = this.A01;
            AnonymousClass7TG.A1O(textPaint, BcG);
            StaticLayout A002 = C18381Vqh.A00(C18381Vqh.A00, textPaint, BcG, -1, i4);
            sparseArray.put(AYh, A002);
            int height = A002.getHeight();
            if (height <= i6) {
                sparseIntArray.put(AYh, i5);
                i6 -= height;
            } else if (AYh == i5) {
                sparseIntArray.put(AYh, i5);
                i5++;
                i6 = i3;
            } else {
                sparseIntArray.put(AYh, AYh);
                i6 = i3 - height;
                i5 = AYh;
            }
            AYh++;
        }
    }

    public final int Aox() {
        return this.A01.getColor();
    }

    public final C2802350v BzV() {
        AnonymousClass6KJ r4 = this.A09;
        return new Af1(this.A08.A00, this.A01, (C40599Aen) null, r4, this.A01.getColor());
    }

    public final String C4F() {
        return C273654mx.A00(828);
    }

    public final void ESC(int i) {
        this.A01.setColor(i);
        this.A04.setColor(i);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A00 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
