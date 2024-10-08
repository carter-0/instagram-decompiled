package X;

import android.os.Bundle;

public final class APU implements 06c {
    public final /* synthetic */ C332567Vn A00;

    public APU(C332567Vn r1) {
        this.A00 = r1;
    }

    public final void DGi(String str, Bundle bundle) {
        String string;
        C332567Vn r3 = this.A00;
        Bundle bundle2 = r3.A02.mArguments;
        if (bundle2 != null && (string = bundle2.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID", (String) null)) != null) {
            C332567Vn.A00(r3, string);
        }
    }
}
