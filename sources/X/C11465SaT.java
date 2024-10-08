package X;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SaT  reason: case insensitive filesystem */
public final class C11465SaT implements TextWatcher, SpanWatcher {
    public final Object A00;
    public final AtomicInteger A01 = Pxf.A10();

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.A00).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.A00).beforeTextChanged(charSequence, i, i2, i3);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.A01.get() <= 0 || !(obj instanceof C299975wK)) {
            ((SpanWatcher) this.A00).onSpanAdded(spannable, obj, i, i2);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        Object obj2 = obj;
        if (this.A01.get() <= 0 || !(obj instanceof C299975wK)) {
            ((SpanWatcher) this.A00).onSpanChanged(spannable, obj2, i, i2, i3, i4);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.A01.get() <= 0 || !(obj instanceof C299975wK)) {
            ((SpanWatcher) this.A00).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.A00).onTextChanged(charSequence, i, i2, i3);
    }

    public C11465SaT(Object obj) {
        this.A00 = obj;
    }
}
