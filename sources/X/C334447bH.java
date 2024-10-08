package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.ArrayList;

/* renamed from: X.7bH  reason: invalid class name and case insensitive filesystem */
public final class C334447bH implements TextWatcher {
    public ForegroundColorSpan[] A00 = new ForegroundColorSpan[0];
    public final C334437bG A01;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        Editable text;
        ComposerAutoCompleteTextView Ae1 = this.A01.Ae1();
        if (Ae1 != null && (text = Ae1.getText()) != null) {
            for (ForegroundColorSpan foregroundColorSpan : this.A00) {
                int spanStart = text.getSpanStart(foregroundColorSpan);
                int spanEnd = text.getSpanEnd(foregroundColorSpan);
                if (!(spanStart == -1 || spanEnd == -1)) {
                    text.removeSpan(foregroundColorSpan);
                    text.delete(spanStart, spanEnd);
                }
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ForegroundColorSpan[] foregroundColorSpanArr;
        ComposerAutoCompleteTextView Ae1 = this.A01.Ae1();
        if (charSequence != null && Ae1 != null) {
            if (i3 >= i2 || !Character.isWhitespace(charSequence.charAt(i))) {
                foregroundColorSpanArr = new ForegroundColorSpan[0];
            } else {
                int selectionEnd = Ae1.getSelectionEnd();
                Editable text = Ae1.getText();
                0qQ.A07(text);
                ForegroundColorSpan[] foregroundColorSpanArr2 = (ForegroundColorSpan[]) text.getSpans(selectionEnd, selectionEnd, ForegroundColorSpan.class);
                int i4 = -1;
                0qQ.A0A(foregroundColorSpanArr2);
                ArrayList arrayList = new ArrayList();
                int length = foregroundColorSpanArr2.length;
                int i5 = 0;
                while (i5 < length) {
                    ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr2[i5];
                    int spanStart = text.getSpanStart(foregroundColorSpan);
                    int spanEnd = text.getSpanEnd(foregroundColorSpan);
                    if (spanStart <= i4) {
                        spanEnd = i4;
                    } else {
                        arrayList.add(foregroundColorSpan);
                    }
                    i5++;
                    i4 = spanEnd;
                }
                foregroundColorSpanArr = (ForegroundColorSpan[]) arrayList.toArray(new ForegroundColorSpan[0]);
            }
            this.A00 = foregroundColorSpanArr;
        }
    }

    public C334447bH(C334437bG r2) {
        this.A01 = r2;
    }
}
