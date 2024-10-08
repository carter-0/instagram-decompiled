package X;

import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: X.5T9  reason: invalid class name */
public final class AnonymousClass5T9 implements AnonymousClass5TA {
    public final View A00;
    public final AutofillManager A01;
    public final AnonymousClass5T0 A02;

    public AnonymousClass5T9(View view, AnonymousClass5T0 r4) {
        this.A00 = view;
        this.A02 = r4;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.A01 = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
