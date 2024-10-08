package X;

import android.net.Uri;
import java.util.Collection;

public final class NEY extends AnonymousClass0cm {
    public final Collection A00;

    public final boolean A00() {
        return this.A00.isEmpty();
    }

    public final boolean A01(Uri uri) {
        if (uri == null || !this.A00.contains(uri.getPath())) {
            return false;
        }
        return true;
    }

    public NEY(Collection collection) {
        if (!collection.isEmpty()) {
            this.A00 = collection;
            return;
        }
        throw AnonymousClass7TE.A0w("You need to pass at least one path");
    }
}
