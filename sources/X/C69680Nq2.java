package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.Nq2  reason: case insensitive filesystem */
public abstract class C69680Nq2 {
    public static final File A00(Uri uri) {
        if (0qQ.A0K(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return AnonymousClass7TE.A0t(path);
            }
            throw C51973G9u.A0g(uri, "Uri path is null: ", AnonymousClass7TE.A1A());
        }
        throw C51973G9u.A0g(uri, "Uri lacks 'file' scheme: ", AnonymousClass7TE.A1A());
    }
}
