package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fhl  reason: case insensitive filesystem */
public final class C50746Fhl implements G6H {
    public final FragmentActivity A00;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        AnonymousClass14B A0e = DbT.A0e();
        FragmentActivity fragmentActivity = this.A00;
        0kR.A0B(fragmentActivity, A0e.A04(fragmentActivity, uri));
    }

    public C50746Fhl(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }
}
