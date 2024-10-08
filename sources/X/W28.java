package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewOverlay;

public final class W28 {
    public static final int A0A;
    public static final int A0B = Color.parseColor("#33FF0000");
    public static final int A0C = Color.parseColor("#3300FF00");
    public static final int A0D;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public int A03 = -1;
    public final int A04;
    public final ColorDrawable A05;
    public final View A06;
    public final Runnable A07 = new Wj6(this);
    public final Runnable A08 = new Wj7(this);
    public final String A09;

    static {
        int parseColor = Color.parseColor("#330000FF");
        A0A = parseColor;
        A0D = parseColor;
    }

    public static void A01(View view, AnonymousClass2u9 r4, int i, boolean z) {
        if (z) {
            int A002 = r4.A00(i);
            W28 w28 = new W28(view, r4.A02(A002), A0A);
            if (view.getTag(947501445) != null) {
                w28.A01 = true;
            }
            view.setTag(-4848503, w28);
        }
        A00(view, i);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.U0X, android.graphics.drawable.Drawable] */
    public static void A02(W28 w28) {
        String str;
        String str2 = w28.A09;
        int i = w28.A03;
        if (i != -1) {
            str = 002.A0O(" ", i);
        } else {
            str = "";
        }
        SpannableString spannableString = new SpannableString(002.A0R(str2, str));
        spannableString.setSpan(new BackgroundColorSpan(-1140850689), 0, spannableString.length(), 17);
        View view = w28.A06;
        Context context = view.getContext();
        int A062 = 0nA.A06(context);
        view.getOverlay().clear();
        ViewOverlay overlay = view.getOverlay();
        ? drawable = new Drawable();
        TextPaint textPaint = new TextPaint();
        textPaint.density = C13989Tnp.A03(context);
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setColor(-65536);
        textPaint.setTextSize(48.0f);
        drawable.A00 = new StaticLayout(spannableString, textPaint, A062, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        overlay.add(drawable);
    }

    public W28(View view, String str, int i) {
        this.A06 = view;
        this.A05 = new ColorDrawable(A0C);
        this.A04 = i;
        this.A09 = str;
        if (C231482rk.A00()) {
            view.post(new Wj5(this));
        }
    }

    public static void A00(View view, int i) {
        int i2;
        View view2;
        W28 w28 = (W28) view.getTag(-4848503);
        if (w28 != null) {
            if (C231482rk.A00()) {
                w28.A03 = i;
                A02(w28);
            }
            if (C231482rk.A01() || 2Ru.sDebugHeadViewBinds) {
                if (w28.A02) {
                    ColorDrawable colorDrawable = w28.A05;
                    int color = colorDrawable.getColor();
                    int A012 = C51973G9u.A01(color, Math.min(Color.alpha(color) * 2, C11152SCh.MAX_FACTORIAL));
                    view2 = w28.A06;
                    view2.removeCallbacks(w28.A07);
                    colorDrawable.setColor(A012);
                } else {
                    if (w28.A00) {
                        i2 = w28.A04;
                    } else if (w28.A01) {
                        w28.A01 = false;
                        i2 = A0D;
                    } else {
                        i2 = A0C;
                    }
                    w28.A05.setColor(i2);
                    view2 = w28.A06;
                }
                view2.post(w28.A08);
            }
        }
    }
}
