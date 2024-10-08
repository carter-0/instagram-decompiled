package X;

import android.os.Bundle;
import java.util.List;

public final class EMR extends C47500E5f implements C13676Tel {
    public static final String __redex_internal_original_name = "SharedEmailVerifyFragment";
    public String A00;
    public List A01;

    public final EXD B6Y() {
        return null;
    }

    public final C46634DiE BzS() {
        return C46634DiE.A1R;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-924485725);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        17k.A07(bundle2, "Arguments in SharedEmailVerifyFragment cannot be null.");
        this.A02 = DbX.A0T(this);
        this.A06 = DbU.A0l(bundle2, "key_shared_email");
        this.A00 = bundle2.getString("send_source");
        AnonymousClass0fD.A09(-370028402, A02);
    }

    public final void Ds3(List list) {
        this.A01 = list;
    }
}
