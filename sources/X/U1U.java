package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.Choreographer;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class U1U extends Drawable implements Choreographer.FrameCallback {
    public float A00;
    public float A01;
    public float A02;
    public C17592Vak A03;
    public String A04 = "😍";
    public long A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final List A09 = new ArrayList();
    public final int A0A;
    public final Rect A0B = new Rect();
    public final TextPaint A0C = new TextPaint(1);
    public final List A0D = new ArrayList();

    public U1U(Context context) {
        0qQ.A0B(context, 1);
        Resources resources = context.getResources();
        this.A0A = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A08 = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A07 = resources.getDimensionPixelSize(R.dimen.action_button_min_width);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C17592Vak vak = this.A03;
        if (vak != null) {
            A00(canvas, vak);
        }
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            0qQ.A0A(obj);
            A00(canvas, (C17592Vak) obj);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    private final void A00(Canvas canvas, C17592Vak vak) {
        TextPaint textPaint = this.A0C;
        textPaint.setTextSize(vak.A01);
        String str = vak.A05;
        int length = str.length();
        Rect rect = this.A0B;
        textPaint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, vak.A03 - (((float) rect.width()) / 2.0f), (vak.A04 + vak.A00) - (((float) rect.height()) / 2.0f), textPaint);
    }

    public final void A01() {
        C17592Vak vak = new C17592Vak(this.A04);
        this.A03 = vak;
        vak.A03 = this.A01;
        vak.A04 = this.A02;
        0qQ.A0A(vak);
        vak.A01 = this.A00;
        if (!this.A06) {
            this.A06 = true;
            doFrame(System.currentTimeMillis());
        }
    }

    public final void doFrame(long j) {
        C17592Vak vak = this.A03;
        if (vak != null) {
            vak.A00 = (float) ((Math.sin(Math.toRadians((double) (System.currentTimeMillis() / 8))) * 16.0d) - ((double) this.A0A));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.A05;
        if (j2 != 0) {
            float f = ((float) (currentTimeMillis - j2)) / 1000.0f;
            List list = this.A09;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C17592Vak vak2 = (C17592Vak) list.get(i);
                0qQ.A0A(vak2);
                float f2 = vak2.A02 + (-1000.0f * f);
                vak2.A02 = f2;
                float f3 = vak2.A04 + (f2 * f);
                vak2.A04 = f3;
                if (f3 < ((float) getBounds().top) - (2.0f * vak2.A01)) {
                    this.A0D.add(vak2);
                }
            }
            List list2 = this.A0D;
            if (!list2.isEmpty()) {
                list.removeAll(list2);
                list2.clear();
            }
        }
        this.A05 = currentTimeMillis;
        if (this.A03 != null || !this.A09.isEmpty()) {
            Choreographer.getInstance().postFrameCallback(this);
        } else {
            this.A06 = false;
        }
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A0C.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0C.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
