package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;

/* renamed from: X.9X7  reason: invalid class name */
public final class AnonymousClass9X7 extends Drawable implements AnonymousClass5MJ {
    public float A00;
    public int A01;
    public int A02;
    public Integer A03;
    public 0eP A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Rect A08;
    public final Rect A09;
    public final TextPaint A0A;
    public final AnonymousClass61R A0B;
    public final 0eP A0C;
    public final 0eP A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final Resources A0J;
    public final Rect A0K;
    public final TextPaint A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final 0eP A0P;

    public AnonymousClass9X7(Context context, String str, String str2, int i, int i2, int i3) {
        int i4;
        Context context2 = context;
        this.A0I = context2;
        String str3 = str;
        this.A0N = str3;
        int i5 = i;
        this.A0H = i5;
        int i6 = i2;
        this.A0G = i6;
        this.A07 = i3;
        String str4 = str2;
        this.A0M = str4;
        Resources resources = context2.getResources();
        this.A0J = resources;
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        float f = (float) i5;
        int A062 = AnonymousClass7TE.A06(f, 0.85f);
        float f2 = (float) i6;
        int A063 = AnonymousClass7TE.A06(f2, 0.228125f);
        int A064 = AnonymousClass7TE.A06(f, 0.1f);
        int A065 = AnonymousClass7TE.A06(f2, 0.65f);
        int i7 = this.A06;
        Rect rect = new Rect(A062, A063, A062 + i7, i7 + A063);
        this.A08 = rect;
        int i8 = this.A06;
        Rect rect2 = new Rect(A064, A065, A064 + i8, i8 + A065);
        this.A09 = rect2;
        AnonymousClass61R A002 = C303756Aq.A00(context2, R.raw.clips_watermark);
        if (A002 != null) {
            A002.setBounds(rect);
            A002.A01(255);
        } else {
            0wb.A03("ClipsWatermarkDrawableV2", "Failed to render clips watermark when downloading video, because Keyframes drawable was null");
            A002 = null;
        }
        this.A0B = A002;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        this.A0O = 002.A0D(AnonymousClass7TF.A0k(str3), '@');
        int A0D2 = AnonymousClass7TE.A0D(resources);
        int length = str3.length();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAlpha(0);
        textPaint.setColor(-1);
        float f3 = 0.0f;
        textPaint.setShadowLayer(AnonymousClass7TE.A01(resources, R.dimen.audience_lists_text_in_badge_horizontal_margin_right), 0.0f, 0.0f, AnonymousClass7TF.A03(context2, R.attr.igds_color_shadow_on_media));
        Paint.Align align = Paint.Align.RIGHT;
        textPaint.setTextAlign(align);
        if (length <= 14) {
            i4 = R.dimen.action_bar_item_spacing_right;
        } else if (length <= 17) {
            i4 = R.dimen.achievements_only_you_top_margin;
        } else if (length <= 24) {
            i4 = R.dimen.account_discovery_bottom_gap;
        } else {
            i4 = R.dimen.abc_edit_text_inset_top_material;
            if (length <= 27) {
                i4 = R.dimen.album_music_sticker_text_vertical_padding;
            }
        }
        textPaint.setTextSize(AnonymousClass7TE.A01(resources, i4));
        textPaint.setTypeface(AnonymousClass0qo.A00(context2).A02(0qm.A0W));
        this.A0A = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setAlpha(0);
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AnonymousClass7TE.A01(resources, R.dimen.audience_lists_text_in_badge_horizontal_margin_right), 0.0f, 0.0f, AnonymousClass7TF.A03(context2, R.attr.igds_color_shadow_on_media));
        textPaint2.setTextAlign(align);
        textPaint2.setTextSize((float) AnonymousClass7TE.A0F(resources));
        textPaint2.setTypeface(AnonymousClass7TG.A0O(context2));
        this.A0L = textPaint2;
        this.A0F = (float) AnonymousClass7TE.A0E(resources);
        float f4 = f * 0.28155f;
        f3 = str2 != null ? Math.min(0.0f, f4 - textPaint2.measureText(str4)) : f3;
        this.A0E = f3;
        int i9 = rect.right - A0D2;
        this.A0K = new Rect(AnonymousClass1GB.A01(((float) i9) - f4), 0, i9, i6);
        float f5 = (float) (rect.right - A0D2);
        Float valueOf = Float.valueOf(f5);
        int i10 = rect.bottom + dimensionPixelSize;
        0eP A1L = AnonymousClass7TE.A1L(valueOf, Float.valueOf((float) i10));
        this.A0C = A1L;
        this.A0D = AnonymousClass7TE.A1L(Float.valueOf((float) (rect2.left + A0D2)), Float.valueOf((float) (rect2.bottom + dimensionPixelSize)));
        this.A0P = AnonymousClass7TE.A1L(Float.valueOf(f5 - f3), Float.valueOf((float) (i10 + dimensionPixelSize2)));
        this.A04 = A1L;
        this.A03 = AnonymousClass05K.A00;
    }

    public static float A00(AnonymousClass9X7 r0, float f, float f2) {
        return f2 + ((f - f2) * r0.A00);
    }

    public final /* synthetic */ void EqG() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a3, code lost:
        r0 = X.AnonymousClass1GB.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a7, code lost:
        r1.setAlpha(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c0, code lost:
        r5 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        r2.draw(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c8, code lost:
        if (r8.A03 == X.AnonymousClass05K.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ca, code lost:
        r1 = r8.A04;
        r9.drawText(r8.A0O, X.AnonymousClass7TE.A04(r1.A00), X.AnonymousClass7TE.A04(r1.A01) + r4, r8.A0A);
        r3 = r8.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e2, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e6, code lost:
        if (r8.A05 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e8, code lost:
        r1 = r8.A0P;
        r2 = X.AnonymousClass7TE.A04(r1.A00);
        r1 = X.AnonymousClass7TE.A04(r1.A01);
        r9.save();
        r9.clipRect(r8.A0K);
        r9.drawText(r3, r2 + r5, r1 + r4, r8.A0L);
        r9.restore();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.61R r2 = r8.A0B
            if (r2 == 0) goto L_0x0108
            java.lang.Integer r0 = r8.A03
            int r7 = r0.intValue()
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = 1132396544(0x437f0000, float:255.0)
            r3 = 1126170624(0x43200000, float:160.0)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r5 = 1131937792(0x43780000, float:248.0)
            r4 = 0
            switch(r7) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x004f;
                case 2: goto L_0x003f;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0038;
                case 5: goto L_0x0030;
                case 6: goto L_0x0085;
                case 7: goto L_0x0073;
                case 8: goto L_0x0022;
                default: goto L_0x001d;
            }
        L_0x001d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0022:
            int r0 = X.AnonymousClass1GB.A01(r1)
            r2.A01(r0)
            android.text.TextPaint r1 = r8.A0A
            int r0 = X.AnonymousClass1GB.A01(r5)
            goto L_0x00a7
        L_0x0030:
            float r0 = r8.A0E
            float r5 = A00(r8, r4, r0)
            goto L_0x00c1
        L_0x0038:
            r2.EL2(r6)
            float r5 = r8.A0E
            goto L_0x00c1
        L_0x003f:
            android.text.TextPaint r1 = r8.A0A
            int r0 = X.AnonymousClass1GB.A01(r5)
            r1.setAlpha(r0)
            android.text.TextPaint r1 = r8.A0L
            int r0 = X.AnonymousClass1GB.A01(r3)
            goto L_0x00a7
        L_0x004f:
            r2.EL2(r0)
            android.text.TextPaint r1 = r8.A0A
            float r0 = A00(r8, r5, r4)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r1.setAlpha(r0)
            android.text.TextPaint r1 = r8.A0L
            float r0 = A00(r8, r3, r4)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r1.setAlpha(r0)
            float r0 = r8.A0F
            float r4 = A00(r8, r4, r0)
            goto L_0x00c0
        L_0x0073:
            float r0 = A00(r8, r1, r4)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r2.A01(r0)
            android.text.TextPaint r1 = r8.A0A
            float r0 = A00(r8, r5, r4)
            goto L_0x00a3
        L_0x0085:
            float r0 = A00(r8, r4, r1)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r2.A01(r0)
            android.text.TextPaint r1 = r8.A0A
            float r0 = A00(r8, r4, r5)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r1.setAlpha(r0)
            android.text.TextPaint r1 = r8.A0L
            float r0 = A00(r8, r4, r3)
        L_0x00a3:
            int r0 = X.AnonymousClass1GB.A01(r0)
        L_0x00a7:
            r1.setAlpha(r0)
            goto L_0x00c0
        L_0x00ab:
            float r0 = A00(r8, r6, r0)
            r2.EL2(r0)
            float r0 = r8.A0E
            float r5 = A00(r8, r0, r4)
            goto L_0x00c1
        L_0x00b9:
            float r0 = A00(r8, r0, r4)
            r2.EL2(r0)
        L_0x00c0:
            r5 = 0
        L_0x00c1:
            r2.draw(r9)
            java.lang.Integer r1 = r8.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0108
            X.0eP r1 = r8.A04
            java.lang.Object r0 = r1.A00
            float r3 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r0 = r1.A01
            float r2 = X.AnonymousClass7TE.A04(r0)
            java.lang.String r1 = r8.A0O
            float r2 = r2 + r4
            android.text.TextPaint r0 = r8.A0A
            r9.drawText(r1, r3, r2, r0)
            java.lang.String r3 = r8.A0M
            if (r3 == 0) goto L_0x0108
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x0108
            X.0eP r1 = r8.A0P
            java.lang.Object r0 = r1.A00
            float r2 = X.AnonymousClass7TE.A04(r0)
            java.lang.Object r0 = r1.A01
            float r1 = X.AnonymousClass7TE.A04(r0)
            r9.save()
            android.graphics.Rect r0 = r8.A0K
            r9.clipRect(r0)
            float r2 = r2 + r5
            float r1 = r1 + r4
            android.text.TextPaint r0 = r8.A0L
            r9.drawText(r3, r2, r1, r0)
            r9.restore()
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9X7.draw(android.graphics.Canvas):void");
    }

    public final int getDurationInMs() {
        return -1;
    }

    public final C2802350v BzV() {
        String str = this.A0N;
        String str2 = this.A0M;
        int i = this.A0H;
        int i2 = this.A0G;
        int i3 = this.A07;
        0qQ.A0B(str, 1);
        C40600Aeo aeo = new C40600Aeo();
        aeo.A04 = str;
        aeo.A03 = str2;
        aeo.A01 = i;
        aeo.A00 = i2;
        aeo.A02 = i3;
        return aeo;
    }

    public final void EXC(int i, int i2) {
        TextPaint textPaint;
        Paint.Align align;
        int i3 = i - this.A02;
        this.A01 = i3;
        Integer num = this.A03;
        boolean z = false;
        if (i3 >= AAP.A00(num)) {
            z = true;
        }
        boolean z2 = false;
        if (AAP.A00(AAP.A01(num)) + i + C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION >= this.A07) {
            z2 = true;
        }
        if (z && !z2) {
            Integer A012 = AAP.A01(this.A03);
            this.A03 = A012;
            this.A02 = i;
            this.A01 = 0;
            if (A012 == AnonymousClass05K.A15) {
                this.A05 = true;
                0eP r0 = this.A04;
                0eP r2 = this.A0C;
                boolean A0K2 = 0qQ.A0K(r0, r2);
                AnonymousClass61R r1 = this.A0B;
                if (A0K2) {
                    if (r1 != null) {
                        r1.setBounds(this.A09);
                    }
                    this.A04 = this.A0D;
                    textPaint = this.A0A;
                    align = Paint.Align.LEFT;
                } else {
                    if (r1 != null) {
                        r1.setBounds(this.A08);
                    }
                    this.A04 = r2;
                    textPaint = this.A0A;
                    align = Paint.Align.RIGHT;
                }
                textPaint.setTextAlign(align);
            }
        }
        this.A00 = 0mi.A00(((float) this.A01) / ((float) AAP.A00(this.A03)), 0.0f, 1.0f);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A0G;
    }

    public final int getIntrinsicWidth() {
        return this.A0H;
    }

    public final int getOpacity() {
        AnonymousClass61R r0 = this.A0B;
        if (r0 != null) {
            return r0.getOpacity();
        }
        return -2;
    }

    public final void setAlpha(int i) {
        AnonymousClass61R r0 = this.A0B;
        if (r0 != null) {
            r0.A01(i);
        }
        this.A0A.setAlpha(i);
        this.A0L.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        this.A0L.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
