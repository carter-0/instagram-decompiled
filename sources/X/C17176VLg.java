package X;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VLg  reason: case insensitive filesystem */
public final class C17176VLg {
    public final List A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.VXb, java.lang.Object] */
    public C17176VLg(Spannable spannable, ClickableSpan[] clickableSpanArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = clickableSpanArr.length;
            if (i < length) {
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    ? obj = new Object();
                    obj.A03 = spannable.subSequence(spanStart, spanEnd).toString();
                    obj.A02 = spanStart;
                    obj.A00 = spanEnd;
                    obj.A01 = (length - 1) - i;
                    arrayList.add(obj);
                }
                i++;
            } else {
                this.A00 = arrayList;
                return;
            }
        }
    }
}
