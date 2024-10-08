package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fj6  reason: case insensitive filesystem */
public final class C50826Fj6 implements G6H {
    public final FragmentActivity A00;
    public final 0lg A01;

    public C50826Fj6(FragmentActivity fragmentActivity, 0lg r2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        DbY.A0s();
        DbU.A0R();
        Bundle A0B = DbX.A0B("megaphone");
        A0B.putBoolean("show_public_contacts_toggle", true);
        A0B.putBoolean("extra_is_mv4b_verified", false);
        E7B e7b = new E7B();
        e7b.setArguments(A0B);
        DbY.A14(e7b, this.A00, this.A01);
    }
}
