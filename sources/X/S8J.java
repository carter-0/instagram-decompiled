package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class S8J {
    public static final String A00(SGp sGp) {
        List list = null;
        AutofillData autofillData = sGp.A00;
        if (autofillData != null) {
            list = AnonymousClass7TE.A1I(autofillData);
        }
        Set A01 = A01(list);
        if (sGp.A01 == null) {
            return RUN.A00(A01);
        }
        Set set = SDK.A0B;
        0qQ.A08(set);
        return RUN.A00(094.A00(set, A01));
    }

    public static final Set A01(List list) {
        if (list == null) {
            return 0sl.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object A10 : list) {
            018.A16(Pxj.A10(A10), A1C);
        }
        return 00k.A0k(A1C);
    }
}
