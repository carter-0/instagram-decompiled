package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.instagram.android.R;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.9q5  reason: invalid class name and case insensitive filesystem */
public final class C389719q5 extends C369548uw implements B2E {
    public final C380069Wl A00;
    public final ProductCollection A01;
    public final String A02;

    public C389719q5(Context context, ProductCollection productCollection, String str) {
        String str2;
        0qQ.A0B(str, 2);
        this.A02 = str;
        this.A01 = productCollection;
        C380069Wl r2 = new C380069Wl(context, this.A02, 0nA.A09(context), context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size), false);
        this.A00 = r2;
        String title = productCollection.getTitle();
        if (title != null) {
            str2 = AnonymousClass7TG.A0o(title);
        } else {
            str2 = "";
        }
        r2.A05(str2, -1);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00.onBoundsChange(rect);
    }

    public final String C4F() {
        return this.A02;
    }

    public final C358868bb C5B() {
        return this.A00.A0D;
    }

    public final int getAlpha() {
        return this.A00.A01;
    }

    public final int getIntrinsicHeight() {
        return this.A00.A04;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A08;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setTextFormat(C358868bb r2) {
        if (r2 != null) {
            this.A00.A04(r2);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A00.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
