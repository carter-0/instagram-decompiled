package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class R8F extends C240383Kr {
    public final DialogInterface.OnKeyListener A00 = new SVJ(this, 3);

    public final Dialog A0F(Bundle bundle) {
        Context requireContext;
        if (this instanceof RBT) {
            requireContext = new C251383n1(requireContext(), 2132018368);
        } else {
            requireContext = requireContext();
        }
        AnonymousClass6ST r3 = new AnonymousClass6ST(requireContext);
        r3.A00(A0M());
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null && bundle2.getBoolean("extra_is_cancelable", false)) {
            z = true;
        }
        r3.setCancelable(z);
        if (!z) {
            r3.setOnKeyListener(this.A00);
        }
        return r3;
    }

    public String A0M() {
        return getString(2131965491);
    }
}
