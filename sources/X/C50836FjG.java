package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;

/* renamed from: X.FjG  reason: case insensitive filesystem */
public final class C50836FjG implements G6H {
    public final FragmentActivity A00;
    public final 0lg A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        FragmentActivity fragmentActivity = this.A00;
        0lg r4 = this.A01;
        HashMap A1E = AnonymousClass7TE.A1E();
        String queryParameter = uri.getQueryParameter("origin");
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = "deep_link";
        }
        A1E.put("origin", queryParameter);
        FHB.A0E(fragmentActivity, r4, A1E);
    }

    public C50836FjG(FragmentActivity fragmentActivity, 0lg r2) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }
}
