package X;

import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import java.util.ArrayList;

public final class TSO extends ArrayList {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public TSO(BrowserExtensionsAutofillData browserExtensionsAutofillData, C12752T5m t5m, int i) {
        this.A00 = i;
        this.A01 = t5m;
        this.A02 = browserExtensionsAutofillData;
        add(browserExtensionsAutofillData);
    }
}
