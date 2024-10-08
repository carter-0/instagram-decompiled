package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

public final class U22 extends LinkMovementMethod {
    public static U22 A00;

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            layout.getClass();
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + textView.getScrollY());
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (offsetForHorizontal < spanStart || offsetForHorizontal >= spanEnd || offsetForHorizontal >= layout.getLineEnd(lineForVertical)) {
                    Selection.removeSelection(spannable);
                    return true;
                }
                ClickableSpan clickableSpan2 = clickableSpanArr[0];
                if (action == 1) {
                    clickableSpan2.onClick(textView);
                    return true;
                }
                Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan2), spannable.getSpanEnd(clickableSpanArr[0]));
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
