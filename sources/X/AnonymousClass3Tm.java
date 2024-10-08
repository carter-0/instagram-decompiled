package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: X.3Tm  reason: invalid class name */
public final class AnonymousClass3Tm {
    public final C242303Tn A00;
    public final TextView A01;

    /* JADX INFO: finally extract failed */
    public final void A00(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A01.getContext().obtainStyledAttributes(attributeSet, AnonymousClass2Z3.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            A02(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A01(boolean z) {
        this.A00.A00.A01(z);
    }

    public final void A02(boolean z) {
        this.A00.A00.A02(z);
    }

    public AnonymousClass3Tm(TextView textView) {
        this.A01 = textView;
        this.A00 = new C242303Tn(textView);
    }
}
