package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.4lr  reason: invalid class name and case insensitive filesystem */
public abstract class C273044lr {
    public void A0A(View view, TextView textView, boolean z) {
        0qQ.A0B(textView, 1);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
    }

    public void A0B(View view, TextView textView, boolean z) {
        float f;
        0qQ.A0B(textView, 1);
        0qQ.A0B(view, 2);
        if (z) {
            f = 0.7f;
        } else {
            f = 0.3f;
            if (view.isEnabled()) {
                f = 1.0f;
            }
        }
        textView.setAlpha(f);
    }

    public void A01() {
        String str;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        if (this instanceof C273064lu) {
            C273064lu r2 = (C273064lu) this;
            str = "resources";
            if (!r2.A08.A00 || r2.A04 != C273024lp.LARGE) {
                resources2 = r2.A03;
                if (resources2 != null) {
                    i2 = R.dimen.abc_button_padding_horizontal_material;
                }
            } else {
                resources2 = r2.A03;
                if (resources2 != null) {
                    i2 = R.dimen.account_discovery_bottom_gap;
                }
            }
            r2.A00 = resources2.getDimensionPixelSize(i2);
            return;
        } else if (this instanceof C273054lt) {
            C273054lt r22 = (C273054lt) this;
            str = "resources";
            if (!r22.A0C.A00 || r22.A06 != C273024lp.LARGE) {
                resources = r22.A05;
                if (resources != null) {
                    i = R.dimen.abc_button_padding_horizontal_material;
                }
            } else {
                resources = r22.A05;
                if (resources != null) {
                    i = R.dimen.account_discovery_bottom_gap;
                }
            }
            r22.A01 = resources.getDimensionPixelSize(i);
            return;
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void A02(int i, int i2) {
        if (this instanceof C273054lt) {
            C273054lt r3 = (C273054lt) this;
            RectF rectF = r3.A0B;
            rectF.set(0.0f, 0.0f, (float) i, (float) i2);
            if (r3.A0C.A00) {
                RectF rectF2 = r3.A0A;
                float f = rectF.left;
                float f2 = r3.A00 / 2.0f;
                rectF2.set(new RectF(f + f2, rectF.top + f2, rectF.right - f2, rectF.bottom - f2));
            }
        } else if (this instanceof C273064lu) {
            ((C273064lu) this).A07.set(0.0f, 0.0f, (float) i, (float) i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.4lt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.4lu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.4lt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.4lt} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.content.res.Resources r5, android.widget.TextView r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C273064lu
            if (r0 == 0) goto L_0x004b
            r2 = r4
            X.4lu r2 = (X.C273064lu) r2
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            android.content.Context r3 = r6.getContext()
            X.0qQ.A07(r3)
            X.1QG r0 = r2.A05
            android.content.res.ColorStateList r0 = X.1QE.A0B(r3, r0)
            r2.A01 = r0
            android.graphics.Paint r1 = r2.A06
            int r0 = r0.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            X.1QG r0 = r2.A05
            android.content.res.ColorStateList r0 = X.1QE.A0C(r3, r0)
            r2.A02 = r0
            java.lang.String r1 = "textViewColorStateList"
            r6.setTextColor(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
            android.content.res.ColorStateList r0 = r2.A02
            if (r0 == 0) goto L_0x00dc
            r6.setCompoundDrawableTintList(r0)
            r2.A03 = r5
        L_0x0047:
            r2.A01()
            return
        L_0x004b:
            boolean r0 = r4 instanceof X.C273054lt
            if (r0 == 0) goto L_0x00e4
            r2 = r4
            X.4lt r2 = (X.C273054lt) r2
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            android.content.Context r3 = r6.getContext()
            X.0qQ.A07(r3)
            android.content.res.ColorStateList r0 = X.1QE.A09(r3)
            r2.A03 = r0
            android.graphics.Paint r1 = r2.A09
            int r0 = r0.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            X.1QG r0 = X.1QE.A0E()
            int r0 = X.1QE.A07(r3, r0)
            android.content.res.ColorStateList r0 = X.02K.A02(r3, r0)
            if (r0 != 0) goto L_0x0095
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r3, r0)
            int r0 = r3.getColor(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            X.0qQ.A07(r0)
        L_0x0095:
            r2.A04 = r0
            java.lang.String r1 = "textViewColorStateList"
            r6.setTextColor(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
            android.content.res.ColorStateList r0 = r2.A04
            if (r0 == 0) goto L_0x00dc
            r6.setCompoundDrawableTintList(r0)
            X.1QG r1 = r2.A0C
            X.1QG r0 = X.1QG.A04
            if (r1 != r0) goto L_0x00d8
            r0 = 2131165257(0x7f070049, float:1.7944726E38)
            int r0 = r5.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r2.A00 = r0
            r0 = 2131100458(0x7f06032a, float:1.7813298E38)
            android.content.res.ColorStateList r0 = X.02K.A02(r3, r0)
            r2.A02 = r0
            if (r0 == 0) goto L_0x00cc
            android.graphics.Paint r1 = r2.A08
            int r0 = r0.getDefaultColor()
            r1.setColor(r0)
        L_0x00cc:
            android.graphics.Paint r1 = r2.A08
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r0)
            float r0 = r2.A00
            r1.setStrokeWidth(r0)
        L_0x00d8:
            r2.A05 = r5
            goto L_0x0047
        L_0x00dc:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e4:
            r3 = r4
            X.4lq r3 = (X.C273034lq) r3
            r0 = 0
            X.0qQ.A0B(r6, r0)
            android.content.Context r2 = r6.getContext()
            X.1QG r0 = r3.A01
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x010a
            r0 = 2131100450(0x7f060322, float:1.7813282E38)
        L_0x00fb:
            android.content.res.ColorStateList r0 = X.02K.A02(r2, r0)
            r3.A00 = r0
            r6.setTextColor(r0)
            android.content.res.ColorStateList r0 = r3.A00
            r6.setCompoundDrawableTintList(r0)
            return
        L_0x010a:
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r2, r0)
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273044lr.A03(android.content.res.Resources, android.widget.TextView):void");
    }

    public void A04(Canvas canvas) {
        RectF rectF;
        float f;
        Paint paint;
        if (this instanceof C273054lt) {
            C273054lt r4 = (C273054lt) this;
            0qQ.A0B(canvas, 0);
            RectF rectF2 = r4.A0B;
            float f2 = (float) r4.A01;
            canvas.drawRoundRect(rectF2, f2, f2, r4.A09);
            if (r4.A0C == 1QG.A04) {
                rectF = r4.A0A;
                f = (float) r4.A01;
                paint = r4.A08;
            } else {
                return;
            }
        } else if (this instanceof C273064lu) {
            C273064lu r1 = (C273064lu) this;
            0qQ.A0B(canvas, 0);
            rectF = r1.A07;
            f = (float) r1.A00;
            paint = r1.A06;
        } else {
            return;
        }
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    public void A05(View view, View view2, TextView textView, boolean z) {
        if (this instanceof C273054lt) {
            C273054lt r2 = (C273054lt) this;
            0qQ.A0B(textView, 1);
            0qQ.A0B(view, 2);
            0qQ.A0B(view2, 3);
            int i = 8;
            int i2 = 0;
            if (z) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (z) {
                i = 0;
            }
            view2.setVisibility(i);
            C273054lt.A00(textView, r2, view.isPressed(), view.isEnabled());
        } else if (this instanceof C273064lu) {
            C273064lu r22 = (C273064lu) this;
            0qQ.A0B(textView, 1);
            0qQ.A0B(view, 2);
            0qQ.A0B(view2, 3);
            int i3 = 8;
            int i4 = 0;
            if (z) {
                i4 = 8;
            }
            textView.setVisibility(i4);
            if (z) {
                i3 = 0;
            }
            view2.setVisibility(i3);
            C273064lu.A00(r22, view.isEnabled(), view.isPressed());
        } else {
            0qQ.A0B(textView, 1);
            0qQ.A0B(view2, 3);
            int i5 = 0;
            int i6 = 0;
            if (z) {
                i6 = 4;
            }
            textView.setVisibility(i6);
            if (!z) {
                i5 = 8;
            }
            view2.setVisibility(i5);
        }
    }

    public final void A06(TextView textView, boolean z) {
        if (this instanceof C273054lt) {
            C273054lt r1 = (C273054lt) this;
            0qQ.A0B(textView, 1);
            if (z != r1.A07) {
                r1.A07 = z;
                Paint paint = r1.A09;
                Context context = textView.getContext();
                int i = R.attr.igds_color_secondary_button_panavision;
                if (z) {
                    i = R.attr.igds_color_secondary_button_elevated_panavision;
                }
                paint.setColor(context.getColor(2Yu.A0H(context, i)));
            }
        }
    }

    public void A07(TextView textView, int[] iArr) {
        ColorStateList colorStateList;
        if (this instanceof C273064lu) {
            C273064lu r3 = (C273064lu) this;
            0qQ.A0B(textView, 1);
            ColorStateList colorStateList2 = r3.A01;
            if (colorStateList2 != null) {
                r3.A06.setColor(colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor()));
            }
            1QG r0 = r3.A05;
            if (r0 == null) {
                r0 = r3.A08;
            }
            if (r0.A00) {
                colorStateList = r3.A02;
            } else {
                return;
            }
        } else if (this instanceof C273054lt) {
            C273054lt r32 = (C273054lt) this;
            0qQ.A0B(textView, 1);
            if (r32.A0C.A00) {
                ColorStateList colorStateList3 = r32.A03;
                if (colorStateList3 != null) {
                    r32.A09.setColor(colorStateList3.getColorForState(iArr, colorStateList3.getDefaultColor()));
                }
                ColorStateList colorStateList4 = r32.A02;
                if (colorStateList4 != null) {
                    r32.A08.setColor(colorStateList4.getColorForState(iArr, colorStateList4.getDefaultColor()));
                }
                colorStateList = r32.A04;
            } else {
                return;
            }
        } else if (this instanceof C273034lq) {
            C273034lq r1 = (C273034lq) this;
            0qQ.A0B(textView, 1);
            if (r1.A01.A00) {
                colorStateList = r1.A00;
            } else {
                return;
            }
        } else {
            return;
        }
        if (colorStateList != null) {
            textView.setTextColor(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()));
        }
    }

    public void A08(C273024lp r3) {
        if (this instanceof C273034lq) {
            0qQ.A0B(r3, 0);
        } else if (this instanceof C273054lt) {
            0qQ.A0B(r3, 0);
            ((C273054lt) this).A06 = r3;
        } else {
            0qQ.A0B(r3, 0);
            ((C273064lu) this).A04 = r3;
        }
    }

    public void A09(SpinnerImageView spinnerImageView) {
        Context context;
        int i;
        int i2;
        if (this instanceof C273064lu) {
            0qQ.A0B(spinnerImageView, 0);
            context = spinnerImageView.getContext();
            0qQ.A0A(context);
            i = R.drawable.nav_spinner;
            i2 = R.attr.igds_color_text_on_color;
        } else {
            boolean z = this instanceof C273054lt;
            0qQ.A0B(spinnerImageView, 0);
            context = spinnerImageView.getContext();
            if (z) {
                0qQ.A07(context);
                i = R.drawable.nav_spinner;
                i2 = R.attr.igds_color_primary_icon;
            } else {
                0qQ.A0A(context);
                i = R.drawable.nav_spinner;
                i2 = R.attr.igds_color_secondary_icon;
            }
        }
        spinnerImageView.setImageDrawable(AnonymousClass4Ed.A01(context, i, 2Yu.A0H(context, i2)));
    }
}
