package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.RadioButton;
import com.instagram.android.R;

/* renamed from: X.Jez  reason: case insensitive filesystem */
public final class C60070Jez extends RadioButton implements C66437MRr {
    public int A00;
    public C66568MWw A01;
    public C59974Jcj A02;
    public C62592KiP A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public Context A0F;
    public Paint A0G;
    public Drawable A0H;
    public String A0I;
    public final Rect A0J = AnonymousClass7TE.A0W();
    public final LWV A0K;
    public final Runnable A0L = new M2E(this);
    public final int[] A0M = new int[2];
    public final int A0N;
    public final Paint A0O;
    public final Rect A0P = AnonymousClass7TE.A0W();
    public final boolean A0Q;
    public final boolean A0R;

    public static void A01(C60070Jez jez) {
        boolean z = jez.A09;
        String str = jez.A04;
        if (z) {
            str = TextUtils.ellipsize(str, new TextPaint(jez.A0O), (float) jez.A00, TextUtils.TruncateAt.END).toString();
        }
        jez.A0I = str;
    }

    public final void setChecked(boolean z) {
        if (z && this.A0H == null && this.A06) {
            Context context = getContext();
            Drawable drawable = context.getDrawable(R.drawable.instagram_sliders_pano_outline_24);
            this.A0H = drawable;
            DbX.A11(context, drawable, 2Yu.A0E(this.A0F));
            A00(this);
        }
        super.setChecked(z);
    }

    public final void toggle() {
        if (this.A0Q) {
            super.toggle();
        }
    }

    public C60070Jez(Context context, C62592KiP kiP, boolean z) {
        super(context);
        this.A03 = kiP;
        this.A0F = context;
        this.A0N = JTP.A03(getResources());
        this.A0Q = z;
        setBackground((Drawable) null);
        setClickable(true);
        setFocusable(true);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A0O = A0V;
        A0V.setTextAlign(Paint.Align.CENTER);
        A0V.setTypeface(Typeface.DEFAULT);
        A0V.setFakeBoldText(true);
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A0G = A0V2;
        Context context2 = getContext();
        AnonymousClass7TE.A1N(context2, A0V2, 2Yu.A0H(this.A0F, R.attr.igds_color_secondary_button_on_media));
        this.A0K = new LWV(this);
        this.A0R = AnonymousClass7TF.A1W(JWN.A02(context2), AnonymousClass05K.A0N);
        setImportantForAccessibility(2);
    }

    public static void A00(C60070Jez jez) {
        Resources resources;
        int dimensionPixelOffset;
        float f;
        C62592KiP kiP;
        if (jez.getMeasuredWidth() != 0) {
            int i = jez.A00;
            int i2 = jez.A0N;
            int i3 = i2 * 2;
            int i4 = i - i3;
            int i5 = jez.A03.A02;
            if (i5 > 0) {
                resources = jez.getResources();
                dimensionPixelOffset = Math.max(i4 / i5, resources.getDimensionPixelOffset(R.dimen.autocomplete_dropdown_header_text_size));
            } else {
                resources = jez.getResources();
                boolean z = jez.A0R;
                int i6 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
                if (z) {
                    i6 = R.dimen.autocomplete_dropdown_header_text_size;
                }
                dimensionPixelOffset = resources.getDimensionPixelOffset(i6);
            }
            if (dimensionPixelOffset != jez.A0E) {
                jez.A0E = dimensionPixelOffset;
                A01(jez);
            }
            Paint paint = jez.A0O;
            paint.setTextSize((float) jez.A0E);
            float f2 = paint.getFontMetrics().ascent;
            float f3 = ((float) dimensionPixelOffset) - f2;
            int i7 = i3 * 3;
            int i8 = 0;
            if (jez.A0R && ((kiP = jez.A03) == C62592KiP.TOOL || kiP == C62592KiP.TOOL_DARK)) {
                i8 = AnonymousClass7TE.A0H(resources) * 2;
            }
            int measuredHeight = (int) ((((float) ((jez.getMeasuredHeight() - i7) - i4)) + f2) - ((float) i8));
            float f4 = (float) measuredHeight;
            if (measuredHeight <= 0) {
                f = f4 / 3.0f;
            } else {
                f = f4 / 2.0f;
            }
            int round = Math.round(f);
            int measuredHeight2 = ((jez.getMeasuredHeight() - i3) - round) - i8;
            int measuredHeight3 = (((jez.getMeasuredHeight() - i3) - round) - i4) - i8;
            float f5 = ((float) (i3 + round)) - f2;
            jez.A0D = f5;
            if (jez.A08) {
                measuredHeight2 = (int) (((float) measuredHeight2) - f3);
                measuredHeight3 = (int) (((float) measuredHeight3) - f3);
                jez.A0D = f5 + ((float) (AnonymousClass7TE.A0C(resources) + i4));
            }
            jez.A02.setBounds(i2, measuredHeight3, i2 + i4, measuredHeight2);
            jez.A0C = ((float) i2) + (((float) i4) / 2.0f);
            Drawable drawable = jez.A0H;
            if (drawable != null) {
                int A0B2 = AnonymousClass7TE.A0B(resources);
                int A0D2 = AnonymousClass7TE.A0D(resources);
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                int A0D3 = AnonymousClass7TE.A0D(resources);
                int measuredHeight4 = (((jez.getMeasuredHeight() - i3) - round) - i8) - A0D3;
                if (jez.A08) {
                    measuredHeight4 = (int) (((float) measuredHeight4) - f3);
                }
                int i9 = i2 + A0D3;
                int i10 = dimensionPixelSize / 2;
                jez.A0A = (float) (i9 + i10);
                jez.A0B = (float) (measuredHeight4 - i10);
                int i11 = measuredHeight4 - A0D2;
                int i12 = i9 + A0D2;
                drawable.setBounds(i12, i11 - A0B2, A0B2 + i12, i11);
            }
        }
    }

    public final void CyV(int i, Bitmap bitmap) {
        AnonymousClass8DV r3 = new AnonymousClass8DV(getResources(), bitmap);
        r3.A02(JTR.A02(this.A0F));
        this.A02 = this.A01.AWf(getContext(), r3, this.A03);
        A00(this);
        postInvalidate();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int A0H2;
        int A0H3;
        C61719KJk kJk;
        int A082;
        if (getVisibility() == 0) {
            Rect bounds = this.A02.getBounds();
            Paint paint = this.A0O;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            LWV lwv = this.A0K;
            float f = 1.0f - ((1.0f - lwv.A00) * 0.050000012f);
            Context context = getContext();
            if (isChecked() || isPressed()) {
                C62592KiP kiP = this.A03;
                AnonymousClass7TG.A1N(context, kiP);
                i = kiP.A01;
                A0H2 = 2Yu.A0H(context, i);
            } else {
                C62592KiP kiP2 = this.A03;
                0qQ.A0B(context, 0);
                int A022 = DbU.A02(kiP2, 1);
                if (A022 == 3 || A022 == 0 || A022 == 2) {
                    i = kiP2.A03;
                    A0H2 = 2Yu.A0H(context, i);
                } else if (A022 == 1) {
                    A0H2 = kiP2.A03;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            AnonymousClass7TE.A1N(context, paint, A0H2);
            paint.setTextSize(((float) this.A0E) * f);
            canvas.drawText(this.A0I, this.A0C, this.A0D, paint);
            C62592KiP kiP3 = this.A03;
            if ((kiP3 == C62592KiP.TOOL || kiP3 == C62592KiP.TOOL_DARK) && isChecked()) {
                paint.setStyle(style);
                if (this.A03 == C62592KiP.TOOL_DARK) {
                    A082 = R.color.grey_4;
                } else {
                    A082 = 2Yu.A08(this.A0F);
                }
                AnonymousClass7TE.A1N(context, paint, A082);
                canvas.drawCircle((float) bounds.centerX(), (float) ((bounds.bottom + getHeight()) / 2), (float) AnonymousClass7TE.A0H(getResources()), paint);
            }
            C59974Jcj jcj = this.A02;
            C62592KiP kiP4 = this.A03;
            0qQ.A0B(context, 0);
            int A023 = DbU.A02(kiP4, 1);
            if (A023 == 3 || A023 == 0 || A023 == 2) {
                A0H3 = 2Yu.A0H(context, kiP4.A03);
            } else if (A023 == 1) {
                A0H3 = kiP4.A03;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            int color = context.getColor(A0H3);
            if (jcj instanceof C61719KJk) {
                C61719KJk kJk2 = (C61719KJk) jcj;
                kJk2.A00 = color;
                kJk = kJk2;
            } else {
                boolean z = jcj instanceof C61718KJj;
                AnonymousClass7TE.A1R(jcj.mutate(), color);
                kJk = jcj;
                if (z) {
                }
            }
            kJk.invalidateSelf();
            canvas.save();
            float f2 = 1.0f - ((1.0f - lwv.A00) * 0.07999998f);
            canvas.scale(f2, f2, (float) bounds.centerX(), (float) bounds.centerY());
            this.A02.draw(canvas);
            if (this.A07 && bounds.centerX() > 0) {
                int i2 = -1;
                if (this.A01.BEU() == 0) {
                    i2 = 0;
                }
                paint.setColor(i2);
                paint.setFakeBoldText(false);
                paint.setTextSize((float) getResources().getDimensionPixelOffset(R.dimen.avatar_search_sticker_tray_text_size));
                String str = this.A04;
                Rect rect = this.A0P;
                paint.getTextBounds(str, 0, 1, rect);
                canvas.drawText(String.valueOf(this.A04.charAt(0)), (float) bounds.centerX(), (float) (bounds.centerY() + (rect.height() / 2)), paint);
                paint.setFakeBoldText(true);
            }
            Drawable drawable = this.A0H;
            if (isChecked() && drawable != null && this.A01.BEU() != 0 && this.A06) {
                canvas.drawCircle(this.A0A, this.A0B, (float) (getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) / 2), this.A0G);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0fD.A06(175091133);
        setMeasuredDimension(this.A00, View.MeasureSpec.getSize(i2));
        A00(this);
        AnonymousClass0fD.A0D(-1410889874, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r1 != 3) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = 618321778(0x24dad772, float:9.490741E-17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            int[] r0 = r9.A0M
            r9.getLocationOnScreen(r0)
            android.graphics.Rect r8 = r9.A0J
            r5 = 0
            r7 = r0[r5]
            r6 = 1
            r4 = r0[r6]
            int r2 = r9.getWidth()
            int r2 = r2 + r7
            r1 = r0[r6]
            int r0 = r9.getHeight()
            int r1 = r1 + r0
            r8.set(r7, r4, r2, r1)
            float r0 = r10.getRawX()
            int r1 = (int) r0
            float r0 = r10.getRawY()
            int r0 = (int) r0
            boolean r4 = r8.contains(r1, r0)
            int r1 = r10.getAction()
            if (r1 == 0) goto L_0x0074
            if (r1 == r6) goto L_0x0046
            r0 = 2
            if (r1 == r0) goto L_0x007f
            r0 = 3
            if (r1 == r0) goto L_0x0054
        L_0x003f:
            r0 = 1387886027(0x52b975cb, float:3.98272594E11)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r6
        L_0x0046:
            if (r4 == 0) goto L_0x0054
            android.view.ViewParent r0 = r9.getParent()
            r0.getClass()
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
        L_0x0054:
            java.lang.Runnable r0 = r9.A0L
            r9.removeCallbacks(r0)
            X.LWV r2 = r9.A0K
            float r0 = r2.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            r2.A01 = r1
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            android.view.Choreographer r0 = r2.A03
            r0.postFrameCallback(r2)
        L_0x0070:
            r9.setPressed(r5)
            goto L_0x003f
        L_0x0074:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x007f
            java.lang.Runnable r2 = r9.A0L
            r0 = 500(0x1f4, double:2.47E-321)
            r9.postDelayed(r2, r0)
        L_0x007f:
            if (r4 == 0) goto L_0x009b
            X.LWV r2 = r9.A0K
            float r0 = r2.A01
            r1 = 0
        L_0x0086:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0097
            r2.A01 = r1
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0097
            android.view.Choreographer r0 = r2.A03
            r0.postFrameCallback(r2)
        L_0x0097:
            r9.setPressed(r4)
            goto L_0x003f
        L_0x009b:
            java.lang.Runnable r0 = r9.A0L
            r9.removeCallbacks(r0)
            X.LWV r2 = r9.A0K
            float r0 = r2.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60070Jez.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
