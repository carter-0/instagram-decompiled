package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.6LK  reason: invalid class name */
public final class AnonymousClass6LK extends BaseMovementMethod {
    public static AnonymousClass6LK A00 = new BaseMovementMethod();

    public final boolean canSelectArbitrarily() {
        return false;
    }

    public final void initialize(TextView textView, Spannable spannable) {
        0qQ.A0B(spannable, 1);
        Selection.removeSelection(spannable);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        0qQ.A0B(textView, 0);
        0qQ.A0B(spannable, 1);
        0qQ.A0B(motionEvent, 2);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(totalPaddingTop + textView.getScrollY());
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length > 0) {
            ClickableSpan clickableSpan = clickableSpanArr[0];
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            if (offsetForHorizontal >= spanStart && offsetForHorizontal < spanEnd && offsetForHorizontal < layout.getLineEnd(lineForVertical)) {
                ClickableSpan clickableSpan2 = clickableSpanArr[0];
                if (actionMasked == 1) {
                    clickableSpan2.onClick(textView);
                    return true;
                }
                Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan2), spannable.getSpanEnd(clickableSpanArr[0]));
                return true;
            }
        }
        Selection.removeSelection(spannable);
        return false;
    }
}
