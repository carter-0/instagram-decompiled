package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;
import java.util.List;
import java.util.Locale;

/* renamed from: X.H7d  reason: case insensitive filesystem */
public final class C54308H7d extends C268694dq {
    public final C306386Ly A00;
    public final C306386Ly A01;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        AnonymousClass7TG.A0z(canvas, this);
        this.A00.draw(canvas);
        C306386Ly r5 = this.A01;
        canvas.translate(((float) getBounds().centerX()) - (((float) r5.A0A) / 2.0f), ((float) getBounds().centerY()) - (((float) r5.A06) / 2.0f));
        r5.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A00, this.A01});
    }

    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    public C54308H7d(Context context, String str) {
        int A02 = AnonymousClass7TF.A02(context, R.dimen.abc_list_item_height_material);
        int A022 = AnonymousClass7TF.A02(context, R.dimen.friend_map_city_outline_text_size);
        C306386Ly r1 = new C306386Ly(context, A02);
        AnonymousClass0qq A002 = AnonymousClass0qo.A00(context);
        0qm r6 = 0qm.A0T;
        r1.A0I(A002.A02(r6));
        TextPaint textPaint = r1.A0b;
        float f = (float) A022;
        textPaint.setStrokeWidth(0.65f * f);
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        textPaint.setStyle(Paint.Style.STROKE);
        AnonymousClass7TE.A1N(context, textPaint, 2Yu.A0H(context, R.attr.igds_color_primary_background));
        r1.A0A(f);
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        0qQ.A07(upperCase);
        r1.A0M(upperCase);
        r1.A0G(1, "…");
        this.A00 = r1;
        C306386Ly r12 = new C306386Ly(context, A02);
        r12.A0I(AnonymousClass0qo.A00(context).A02(r6));
        r12.A0A(f);
        r12.A0F(AnonymousClass7TF.A03(context, R.attr.igds_color_primary_text));
        String upperCase2 = str.toUpperCase(locale);
        0qQ.A07(upperCase2);
        r12.A0M(upperCase2);
        r12.A0G(1, "…");
        this.A01 = r12;
        C306386Ly r0 = this.A00;
        setBounds(0, 0, r0.A0A, r0.A06);
    }
}
