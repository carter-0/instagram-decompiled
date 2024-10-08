package com.instagram.ui.widget.textview;

import X.0qQ;
import X.0wb;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C66579MXk;
import X.DbS;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.accessibility.AccessibleTextView;

public final class CommentTextView extends AccessibleTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.ui.widget.textview.CommentTextView, android.widget.TextView, android.view.View] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = AnonymousClass0fD.A05(-1953878172);
        boolean z = false;
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = totalPaddingLeft + getScrollX();
            int scrollY = totalPaddingTop + getScrollY();
            Layout layout = getLayout();
            if (layout == null) {
                i = 2089807832;
            } else {
                int lineForVertical = layout.getLineForVertical(scrollY);
                if (getTag() != null && (getTag() instanceof String)) {
                    DbS.A1Y(getTag());
                }
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) scrollX);
                    if (offsetForHorizontal != -1) {
                        if (getText() != null && (getText() instanceof Spannable)) {
                            CharSequence text = getText();
                            0qQ.A0C(text, C66579MXk.A00(66));
                            if (((ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)).length != 0) {
                                z = CommentTextView.super.onTouchEvent(motionEvent);
                                i = -184921541;
                            }
                        }
                        i = -23519700;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    0wb.A03("IgSpannableTouchHelper HorizontalMeasurementProvider crash....", message);
                }
                i = -192586435;
            }
        } else {
            z = CommentTextView.super.onTouchEvent(motionEvent);
            i = -1597525606;
        }
        AnonymousClass0fD.A0C(i, A05);
        return z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
