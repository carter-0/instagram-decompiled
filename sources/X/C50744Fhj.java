package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.Fhj  reason: case insensitive filesystem */
public final class C50744Fhj implements G6H {
    public final Context A00;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("package_name");
        if (queryParameter == null) {
            queryParameter = DbT.A0v(uri);
        }
        0oI.A07(this.A00, queryParameter, uri.getQueryParameter("referrer"));
    }

    public C50744Fhj(Context context) {
        this.A00 = context;
    }
}
