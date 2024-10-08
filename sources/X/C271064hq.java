package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.4hq  reason: invalid class name and case insensitive filesystem */
public final class C271064hq extends C271074hr implements Runnable {
    public final Reference A00;
    public final Reference A01;

    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.A00.get();
        Object obj = this.A01.get();
        if (obj != null && textView != null && (filters = textView.getFilters()) != null) {
            int i = 0;
            while (i < filters.length) {
                if (filters[i] != obj) {
                    i++;
                } else if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C13993Tnu A002 = C13993Tnu.A00();
                    if (text == null) {
                        length = 0;
                    } else {
                        length = text.length();
                    }
                    CharSequence A02 = A002.A02(text, 0, length);
                    if (text != A02) {
                        int selectionStart = Selection.getSelectionStart(A02);
                        int selectionEnd = Selection.getSelectionEnd(A02);
                        textView.setText(A02);
                        if (A02 instanceof Spannable) {
                            Spannable spannable = (Spannable) A02;
                            if (selectionStart >= 0) {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                }
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C271064hq(TextView textView, C242343Tr r3) {
        this.A00 = new WeakReference(textView);
        this.A01 = new WeakReference(r3);
    }
}
