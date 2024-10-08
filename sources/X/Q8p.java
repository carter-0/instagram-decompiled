package X;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.facebookpay.form.view.BaseAutoCompleteTextView;

public final class Q8p extends AutofillManager.AutofillCallback {
    public final void onAutofillEvent(View view, int i, int i2) {
        0qQ.A0B(view, 0);
        onAutofillEvent(view, i2);
    }

    public final void onAutofillEvent(View view, int i) {
        C62320sa r0;
        0qQ.A0B(view, 0);
        if (i == 1 && (view instanceof BaseAutoCompleteTextView) && (r0 = ((BaseAutoCompleteTextView) view).A03) != null) {
            r0.invoke();
        }
    }
}
