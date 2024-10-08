package X;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.WBq  reason: case insensitive filesystem */
public final class C18898WBq implements View.OnTouchListener {
    public boolean A00;
    public final /* synthetic */ View.OnTouchListener A01;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) motionEvent.getY()), motionEvent.getX());
        if (textView.getText() instanceof Spanned) {
            CharSequence text = textView.getText();
            0qQ.A0C(text, C273654mx.A00(17));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (motionEvent.getAction() == 0) {
                if (clickableSpanArr.length > 0) {
                    this.A00 = A1U;
                    return false;
                }
                this.A00 = false;
            } else if (this.A00) {
                return false;
            }
        }
        return this.A01.onTouch(view, motionEvent);
    }

    public C18898WBq(View.OnTouchListener onTouchListener) {
        this.A01 = onTouchListener;
    }
}
