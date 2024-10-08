package com.instagram.ui.widget.edittext;

import X.0mk;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C51970G9q;
import X.C71382cm;
import X.C73148PXj;
import X.JTO;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.instagram.android.R;

public class ConfirmationCodeEditText extends EditText {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public BroadcastReceiver A05 = null;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public Paint A0C;
    public Paint A0D;
    public Paint A0E;
    public Paint A0F;
    public final Runnable A0G = new C73148PXj(this);

    private void A00() {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A03)});
        setBackground((Drawable) null);
        setCursorVisible(false);
        setInputType(2);
        if (0mk.A02(getContext())) {
            setLayoutDirection(1);
            setTextDirection(2);
        }
    }

    private void A02(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0K);
            this.A01 = obtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size));
            this.A03 = obtainStyledAttributes.getInt(1, 6);
            this.A09 = obtainStyledAttributes.getBoolean(3, false);
            this.A06 = obtainStyledAttributes.getBoolean(0, false);
            this.A02 = 0;
        }
        A00();
        A01();
    }

    public final void A04(int i, boolean z) {
        float f;
        this.A03 = i;
        this.A09 = z;
        int i2 = this.A04;
        if (z) {
            f = ((float) i2) / (((float) i) + 0.5f);
        } else {
            f = (float) (i2 / i);
        }
        this.A00 = f;
        A00();
        invalidate();
    }

    public final void A05(Integer num, Integer num2, boolean z, boolean z2) {
        float dimension;
        int i;
        if (num != null) {
            dimension = (float) num.intValue();
        } else {
            dimension = getResources().getDimension(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size);
        }
        this.A01 = dimension;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 6;
        }
        this.A03 = i;
        this.A09 = z;
        this.A06 = z2;
        this.A02 = 0;
        A00();
        A01();
    }

    public int getAutofillType() {
        if (this.A07) {
            return 0;
        }
        return super.getAutofillType();
    }

    public int getMaximumSize() {
        return this.A03;
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        boolean A022 = 0mk.A02(getContext());
        if (A022) {
            f = ((float) this.A04) - (this.A00 / 2.0f);
        } else {
            f = this.A00 / 2.0f;
        }
        int i2 = this.A0A;
        float f4 = (float) (i2 - 8);
        float descent = ((float) (i2 / 2)) - ((this.A0F.descent() + this.A0F.ascent()) / 2.0f);
        Editable text = getText();
        int length = text.length();
        boolean A1W = C51970G9q.A1W(this.A0B, length);
        if (this.A08 || A1W) {
            i = length;
        } else {
            i = length - 1;
        }
        this.A0B = length;
        int i3 = 0;
        Canvas canvas2 = canvas;
        if (this.A02 != 1) {
            while (true) {
                int i4 = this.A03;
                if (i3 >= i4) {
                    break;
                }
                if (this.A09 && i3 == i4 / 2) {
                    float f5 = this.A00 / 2.0f;
                    if (A022) {
                        f2 -= f5;
                    } else {
                        f2 += f5;
                    }
                }
                if (this.A06 && i3 < i) {
                    canvas2.drawCircle(f2, f4 - ((float) (this.A0A / 4)), 8.0f, this.A0D);
                } else if (i3 < length) {
                    canvas2.drawText(Character.toString(text.charAt(i3)), f2, f4, this.A0F);
                    if (this.A06) {
                        postDelayed(this.A0G, 750);
                    }
                } else {
                    float f6 = this.A00 / 4.0f;
                    canvas2.drawLine(f2 - f6, f4, f2 + f6, f4, this.A0E);
                }
                float f7 = this.A00;
                if (A022) {
                    f3 = f2 - f7;
                } else {
                    f3 = f2 + f7;
                }
                i3++;
            }
        } else {
            while (true) {
                int i5 = this.A03;
                if (i3 >= i5) {
                    break;
                }
                if (this.A09 && i3 == i5 / 2) {
                    float f8 = this.A00 / 2.0f;
                    if (A022) {
                        f2 -= f8;
                    } else {
                        f2 += f8;
                    }
                }
                if (this.A06 && i3 < i) {
                    canvas2.drawCircle(f2, (f4 - ((float) (this.A0A / 2))) + 8.0f, 8.0f, this.A0D);
                } else if (i3 < length) {
                    canvas2.drawText(Character.toString(text.charAt(i3)), f2, descent, this.A0F);
                    if (this.A06) {
                        postDelayed(this.A0G, 750);
                    }
                }
                float f9 = this.A00 / 2.5f;
                canvas2.drawRoundRect(new RectF(f2 - f9, (f4 - ((float) this.A0A)) + 16.0f, f9 + f2, f4), 12.0f, 12.0f, this.A0C);
                float f10 = this.A00;
                if (A022) {
                    f2 -= f10;
                } else {
                    f2 += f10;
                }
                i3++;
            }
        }
        this.A08 = false;
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(attributeSet);
    }

    private void A01() {
        Paint A0C2 = JTO.A0C();
        this.A0F = A0C2;
        A0C2.setTextSize(this.A01);
        this.A0F.setAntiAlias(true);
        this.A0F.setTextAlign(Paint.Align.CENTER);
        Paint paint = this.A0F;
        Context context = getContext();
        AnonymousClass7TE.A1N(context, paint, 2Yu.A07(context));
        Paint A0C3 = JTO.A0C();
        this.A0E = A0C3;
        Paint.Style style = Paint.Style.STROKE;
        A0C3.setStyle(style);
        this.A0E.setStrokeWidth(8.0f);
        AnonymousClass7TE.A1N(context, this.A0E, 2Yu.A07(context));
        Paint A0C4 = JTO.A0C();
        this.A0C = A0C4;
        A0C4.setStyle(style);
        this.A0C.setStrokeWidth(8.0f);
        AnonymousClass7TE.A1N(context, this.A0C, 2Yu.A08(context));
        Paint A0C5 = JTO.A0C();
        this.A0D = A0C5;
        A0C5.setStyle(Paint.Style.FILL);
        AnonymousClass7TE.A1N(context, this.A0D, 2Yu.A07(context));
    }

    public static int[] A03(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i3 = (int) (Resources.getSystem().getDisplayMetrics().density * 252.0f);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i3, size);
            } else {
                size = i3;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int i4 = (int) (Resources.getSystem().getDisplayMetrics().density * 40.0f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i4, size2);
            } else {
                size2 = i4;
            }
        }
        return new int[]{size, size2};
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(75124302);
        super.onDetachedFromWindow();
        this.A08 = true;
        removeCallbacks(this.A0G);
        AnonymousClass0fD.A0D(-1045458131, A062);
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0fD.A06(1159419816);
        int[] A032 = A03(i, i2);
        setMeasuredDimension(A032[0], A032[1]);
        AnonymousClass0fD.A0D(-1191683879, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        int A062 = AnonymousClass0fD.A06(874948578);
        super.onSizeChanged(i, i2, i3, i4);
        this.A04 = i;
        this.A0A = i2;
        if (this.A09) {
            f = ((float) i) / (((float) this.A03) + 0.5f);
        } else {
            f = (float) (i / this.A03);
        }
        this.A00 = f;
        AnonymousClass0fD.A0D(-285740953, A062);
    }

    public void setDisableAutofill(boolean z) {
        this.A07 = z;
    }

    public void setFrameStyle(int i) {
        this.A02 = i;
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(attributeSet);
    }

    public ConfirmationCodeEditText(Context context) {
        super(context);
        A00();
        A01();
    }
}
