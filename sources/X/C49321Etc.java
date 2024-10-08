package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.Etc  reason: case insensitive filesystem */
public final class C49321Etc {
    public final Bundle A00;

    public C49321Etc(Context context) {
        Bundle A0a = AnonymousClass7TE.A0a();
        this.A00 = A0a;
        A0a.putBoolean("isCrop", true);
        A0a.putParcelable("output", Uri.fromFile(0mb.A04(context)));
    }
}
