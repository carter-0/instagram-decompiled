package X;

import android.app.Dialog;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;

public final class E0L extends C240383Kr {
    public final Dialog A0F(Bundle bundle) {
        C358248ab A0V = DbW.A0V(this);
        A0V.A05 = requireArguments().getString(DialogModule.KEY_TITLE);
        A0V.A0q(requireArguments().getString("body"));
        A0V.A0E(new C49969FHc(14));
        return A0V.A02();
    }
}
