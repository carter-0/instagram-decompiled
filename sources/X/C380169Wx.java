package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.9Wx  reason: invalid class name and case insensitive filesystem */
public final class C380169Wx extends Drawable implements C369888vU {
    public String A00 = "";
    public String A01;
    public String A02;
    public final boolean A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09;

    public final void EZP(String str) {
        0qQ.A0B(str, 0);
        this.A00 = str;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        Paint paint = this.A09;
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize(this.A05);
        String str = this.A02;
        0qQ.A0A(str);
        0qQ.A0A(str);
        canvas2.drawText(str, 0, str.length(), (float) AnonymousClass7TE.A0J(this), (float) (AnonymousClass7TF.A05(this) + (this.A08 / 2)), paint);
        String str2 = this.A01;
        if (str2 != null) {
            paint.setTextAlign(Paint.Align.RIGHT);
            paint.setTextSize(this.A04);
            canvas2.drawText(str2, 0, str2.length(), (float) getBounds().right, (float) getBounds().bottom, paint);
        }
    }

    public final int getOpacity() {
        return -2;
    }

    public C380169Wx(Context context, Resources resources, long j) {
        int i;
        String valueOf;
        0qQ.A0B(resources, 3);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A09 = A0V;
        int A012 = (int) (((float) AnonymousClass8XF.A01(context)) * 0.5f);
        this.A07 = A012;
        A0V.setColor(-1);
        A0V.setTextAlign(Paint.Align.LEFT);
        A0V.setTypeface(AnonymousClass7TG.A0O(context));
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        A0V.setTextSize(TypedValue.applyDimension(1, 100.0f, displayMetrics));
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Rect A0W = AnonymousClass7TE.A0W();
        ArrayList arrayList = C378999Sa.A00;
        boolean z = j < System.currentTimeMillis() - 86400000;
        this.A03 = z;
        String str = null;
        if (z) {
            String format = DateFormat.getDateInstance().format(instance.getTime());
            0qQ.A07(format);
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            String upperCase = format.toUpperCase(locale);
            0qQ.A07(upperCase);
            this.A02 = upperCase;
        } else {
            boolean is24HourFormat = android.text.format.DateFormat.is24HourFormat(context);
            if (is24HourFormat) {
                i = instance.get(11);
                if (i < 10) {
                    valueOf = 002.A00('0', i);
                }
                valueOf = String.valueOf(i);
            } else {
                i = instance.get(10);
                if (i == 0) {
                    valueOf = "12";
                }
                valueOf = String.valueOf(i);
            }
            A1A.append(valueOf);
            A1A.append(":");
            int i2 = instance.get(12);
            if (i2 < 10) {
                A1A.append("0");
            }
            A1A.append(i2);
            this.A02 = A1A.toString();
            if (!is24HourFormat) {
                str = instance.get(9) == 0 ? "AM" : "PM";
            }
        }
        this.A01 = str;
        String str2 = this.A02;
        0qQ.A0A(str2);
        A0V.getTextBounds(str2, 0, str2.length(), A0W);
        float width = (float) (A0W.width() + A0W.left);
        float height = (float) A0W.height();
        String str3 = this.A01;
        if (str3 != null) {
            float A042 = width + 0nA.A04(context, 10);
            A0V.setTextSize(TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
            A0V.getTextBounds(str3, 0, str3.length(), A0W);
            width = A042 + ((float) A0W.width());
        }
        float f = ((float) A012) / width;
        float applyDimension = TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()) * f;
        this.A05 = applyDimension;
        this.A04 = TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()) * f;
        this.A06 = (int) (height * f);
        A0V.setTextSize(applyDimension);
        String str4 = this.A02;
        if (str4 != null) {
            A0V.getTextBounds(str4, 0, str4.length(), A0W);
        }
        this.A08 = A0W.height();
    }

    public final String getId() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
    }
}
