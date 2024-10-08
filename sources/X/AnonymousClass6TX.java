package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.6TX  reason: invalid class name */
public final class AnonymousClass6TX extends AnonymousClass6TY {
    public final C307786Rm A00;
    public final C276544tV A01;
    public final C276544tV A02;
    public final C277014uI A03;
    public final boolean A04;

    public final void onClick(View view) {
        Object obj;
        0qQ.A0B(view, 0);
        C308276Tl r9 = new C308276Tl();
        r9.A03(this.A02, 0);
        if (!this.A04 || !(view instanceof RCTextView)) {
            obj = this.A00;
        } else {
            RCTextView rCTextView = (RCTextView) view;
            CharSequence charSequence = rCTextView.A03;
            0qQ.A0C(charSequence, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) charSequence;
            Layout layout = rCTextView.A02;
            0qQ.A07(layout);
            int spanStart = (int) ((double) spanned.getSpanStart(this));
            double primaryHorizontal = (double) layout.getPrimaryHorizontal(spanStart);
            double primaryHorizontal2 = (double) layout.getPrimaryHorizontal((int) ((double) spanned.getSpanEnd(this)));
            int lineForOffset = layout.getLineForOffset(spanStart);
            Rect rect = new Rect();
            layout.getLineBounds(lineForOffset, rect);
            RectF rectF = new RectF(rect);
            float paddingBottom = rectF.left + ((float) (((((double) rCTextView.getPaddingBottom()) + primaryHorizontal) - ((double) rCTextView.getScrollX())) + ((double) rCTextView.A00)));
            rectF.left = paddingBottom;
            rectF.right = (float) ((((double) paddingBottom) + primaryHorizontal2) - primaryHorizontal);
            float scrollY = (float) ((double) (((float) (rCTextView.getScrollY() + rCTextView.getPaddingTop())) + rCTextView.A01));
            rectF.top += scrollY;
            rectF.bottom += scrollY;
            rCTextView.getMatrix().mapRect(rectF);
            rectF.offset((float) rCTextView.getLeft(), (float) rCTextView.getTop());
            obj = new C45375CvH(rectF.left + (rectF.width() / 2.0f), rectF.top + (rectF.height() / 2.0f), rectF.width(), rectF.height());
        }
        r9.A03(obj, 1);
        C307886Rw.A03(this.A00, this.A01, new AnonymousClass6Tm(r9.A00), this.A03);
    }

    public final void updateDrawState(TextPaint textPaint) {
    }

    public AnonymousClass6TX(C307786Rm r1, C276544tV r2, C276544tV r3, C277014uI r4, String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A04 = z;
    }
}
