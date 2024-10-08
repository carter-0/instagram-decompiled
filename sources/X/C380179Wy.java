package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.instagram.android.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Calendar;

/* renamed from: X.9Wy  reason: invalid class name and case insensitive filesystem */
public final class C380179Wy extends Drawable implements C369888vU {
    public static final String[] A0E = {"12", RealtimeSubscription.GRAPHQL_MQTT_VERSION, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public int A00;
    public int A01;
    public String A02;
    public final Matrix A03 = AnonymousClass7TE.A0U();
    public final Paint A04;
    public final float[] A05 = new float[2];
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;

    public final void EZP(String str) {
        0qQ.A0B(str, 0);
        this.A02 = str;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        canvas2.save();
        canvas2.translate((float) this.A00, (float) this.A01);
        float f = ((float) this.A0A) / 2.0f;
        Paint paint = this.A04;
        paint.setColor(this.A0B);
        AnonymousClass7TE.A1Q(paint);
        canvas2.drawCircle(f, f, f, paint);
        paint.setColor(-1);
        float f2 = this.A08;
        float f3 = (0.16f * f) + f2;
        String[] strArr = A0E;
        canvas2.drawText(strArr[0], f, f3, paint);
        float[] fArr = this.A05;
        fArr[0] = f;
        fArr[1] = f3;
        Matrix matrix = this.A03;
        matrix.reset();
        matrix.preRotate(30.0f, f, (f2 / 2.0f) + f);
        int i = 1;
        do {
            matrix.mapPoints(fArr);
            canvas2.drawText(strArr[i], fArr[0], fArr[1], paint);
            i++;
        } while (i < 12);
        canvas2.drawCircle(f, f, this.A07 / 2.0f, paint);
        paint.setStrokeWidth(this.A06);
        float f4 = ((float) this.A0D) / 60.0f;
        fArr[0] = f;
        fArr[1] = 0.73f * f;
        matrix.reset();
        matrix.preRotate(((((float) this.A0C) + f4) / 12.0f) * 360.0f, f, f);
        matrix.mapPoints(fArr);
        float f5 = f;
        Paint paint2 = paint;
        canvas2.drawLine(f, f5, fArr[0], fArr[1], paint2);
        fArr[0] = f;
        fArr[1] = 0.55f * f;
        matrix.reset();
        matrix.preRotate(f4 * 360.0f, f, f);
        matrix.mapPoints(fArr);
        canvas2.drawLine(f, f5, fArr[0], fArr[1], paint2);
        canvas2.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A00 = rect.left;
        this.A01 = rect.top;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C380179Wy(Context context, Resources resources, long j) {
        0qQ.A0B(resources, 3);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        int A012 = (int) (((float) AnonymousClass8XF.A01(context)) * 0.5f);
        this.A0A = A012;
        this.A09 = A012;
        this.A02 = "";
        float f = (float) A012;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        float applyDimension = f / TypedValue.applyDimension(1, 150.0f, displayMetrics);
        A0V.setTextAlign(Paint.Align.CENTER);
        A0V.setTypeface(AnonymousClass7TG.A0O(context));
        A0V.setStrokeCap(Paint.Cap.ROUND);
        A0V.setTextSize(TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()) * applyDimension);
        this.A07 = TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()) * applyDimension;
        this.A06 = TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()) * applyDimension;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        this.A0C = instance.get(10);
        this.A0D = instance.get(12);
        this.A0B = resources.getColor(R.color.sticker_subtle_light_background);
        Rect A0W = AnonymousClass7TE.A0W();
        A0V.getTextBounds(RealtimeSubscription.GRAPHQL_MQTT_VERSION, 0, 1, A0W);
        this.A08 = (float) A0W.height();
    }

    public final String getId() {
        return this.A02;
    }

    public final int getIntrinsicHeight() {
        return this.A09;
    }

    public final int getIntrinsicWidth() {
        return this.A0A;
    }
}
