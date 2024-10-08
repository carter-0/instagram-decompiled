package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.instagram.android.R;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.9q4  reason: invalid class name and case insensitive filesystem */
public final class C389709q4 extends C369538uv implements B2E {
    public final C380069Wl A00;
    public final String A01;
    public final List A02;
    public final Context A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00.onBoundsChange(rect);
    }

    public static final String A00(C389709q4 r4) {
        String string;
        List list = r4.A02;
        if (list.size() == 1) {
            string = ((Product) list.get(0)).A0J;
        } else {
            string = r4.A03.getString(2131973779, AnonymousClass7TF.A1b(list.size()));
        }
        if (string != null) {
            return AnonymousClass7TG.A0o(string);
        }
        return "";
    }

    public final String C4F() {
        return this.A01;
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

    public C389709q4(Context context, String str, List list, int i, boolean z) {
        AnonymousClass7TG.A1Q(str, list);
        this.A03 = context;
        this.A01 = str;
        this.A02 = list;
        C380069Wl r2 = new C380069Wl(context, this.A01, i, context.getResources().getDimensionPixelSize(R.dimen.direct_emoji_quick_reply_emoji_item_size), false);
        this.A00 = r2;
        r2.A0G = z;
        r2.A05(A00(this), -1);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A00.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
