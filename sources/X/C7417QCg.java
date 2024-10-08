package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.QCg  reason: case insensitive filesystem */
public final class C7417QCg extends 06N {
    public final int A00;
    public final Object A01;

    public C7417QCg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00(Context context, Fragment fragment, 0hq r4) {
        if (this.A00 != 0) {
            C7417QCg.super.A00(context, fragment, r4);
            return;
        }
        0qQ.A0B(context, 2);
        if (fragment instanceof C8134QhS) {
            ((C8134QhS) fragment).A0J(((S3F) this.A01).A00);
        }
    }

    public final void A02(Bundle bundle, Fragment fragment, 0hq r6) {
        if (1 - this.A00 != 0) {
            C7417QCg.super.A02(bundle, fragment, r6);
            return;
        }
        Fragment fragment2 = (Fragment) this.A01;
        06F.A00(fragment2, "key_result_funding", new C59111J6t(fragment2, 13));
    }

    public final void A04(Fragment fragment, 0hq r4) {
        if (this.A00 != 0) {
            AnonymousClass7TG.A1N(r4, fragment);
            ((Fragment) this.A01).getParentFragmentManager().A0x("key_result_funding");
            return;
        }
        AnonymousClass7TG.A1N(r4, fragment);
        if (fragment instanceof C8134QhS) {
            ((S3F) this.A01).A03.A0q(this);
        }
    }
}
