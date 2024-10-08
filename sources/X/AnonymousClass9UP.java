package X;

import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.style.UnderlineSpan;
import com.instagram.ui.text.CustomUnderlineSpan;

/* renamed from: X.9UP  reason: invalid class name */
public final class AnonymousClass9UP implements SpanWatcher {
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (obj instanceof AnonymousClass91P) {
            spannable.setSpan(new UnderlineSpan(), i + 1, i2, 33);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (obj instanceof AnonymousClass91P) {
            for (CustomUnderlineSpan removeSpan : (CustomUnderlineSpan[]) spannable.getSpans(i, i2, CustomUnderlineSpan.class)) {
                spannable.removeSpan(removeSpan);
            }
        }
    }
}
