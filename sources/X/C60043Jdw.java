package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Jdw  reason: case insensitive filesystem */
public final class C60043Jdw extends View {
    public String A00 = "";
    public String A01 = "";
    public final float A02;
    public final int A03;
    public final Paint A04;
    public final DynamicLayout A05;
    public final SpannableStringBuilder A06;

    public static void A00(C60043Jdw jdw) {
        String str = jdw.A01;
        boolean isEmpty = str.isEmpty();
        String str2 = jdw.A00;
        if (!isEmpty) {
            if (str2.isEmpty()) {
                str2 = str;
            } else {
                str2 = 002.A0g(str, "\n", str2);
            }
        }
        SpannableStringBuilder spannableStringBuilder = jdw.A06;
        spannableStringBuilder.replace(0, spannableStringBuilder.length(), str2);
    }

    public final void onDraw(Canvas canvas) {
        canvas.translate((float) ((int) (((double) this.A03) * 0.1d)), (float) ((int) (this.A02 * 40.0f)));
        DynamicLayout dynamicLayout = this.A05;
        canvas.drawRect(0.0f, 0.0f, (float) dynamicLayout.getWidth(), (float) dynamicLayout.getHeight(), this.A04);
        dynamicLayout.draw(canvas);
    }

    public C60043Jdw(Context context) {
        super(context);
        DisplayMetrics A0E = AnonymousClass7TF.A0E(context);
        float f = A0E.density;
        this.A02 = f;
        int i = A0E.widthPixels;
        this.A03 = i;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A04 = A0V;
        AnonymousClass7TE.A1N(context, A0V, R.color.clips_overlay_ads_end_background_color);
        AnonymousClass7TE.A1Q(A0V);
        SpannableStringBuilder A0E2 = C51965G9l.A0E();
        this.A06 = A0E2;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f * 14.0f);
        AnonymousClass7TE.A1N(context, textPaint, R.color.igds_icon_on_color);
        this.A05 = new DynamicLayout(A0E2, textPaint, (int) (((double) i) * 0.8d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }
}
