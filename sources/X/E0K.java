package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class E0K extends C240383Kr {
    public final Dialog A0F(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        Object value = C227642jf.A01(this).getValue();
        String string = requireArguments.getString(AnonymousClass000.A00(606));
        String string2 = requireArguments.getString(AnonymousClass000.A00(1359));
        String string3 = requireArguments.getString(AnonymousClass000.A00(1360));
        String string4 = requireArguments.getString(AnonymousClass000.A00(1356));
        String string5 = requireArguments.getString(AnonymousClass000.A00(1355));
        String string6 = requireArguments.getString(AnonymousClass000.A00(1357));
        C358248ab A0V = DbW.A0V(this);
        A0V.A0q(string);
        if (string2 != null) {
            A0V.A05 = string2;
        }
        if (!(string3 == null || string3.length() == 0 || string4 == null || string4.length() == 0)) {
            A0V.A0c(new C50000FIl(value, this, string5, string4, string3, 2), string4);
        }
        if (string6 == null || string6.length() == 0) {
            string6 = getString(2131960862);
        }
        0qQ.A0A(string6);
        A0V.A0b((DialogInterface.OnClickListener) null, string6);
        return A0V.A02();
    }
}
