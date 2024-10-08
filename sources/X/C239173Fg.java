package X;

import android.content.Context;
import com.facebook.graphql.query.JSONPersistedQueryProvider;

/* renamed from: X.3Fg  reason: invalid class name and case insensitive filesystem */
public abstract class C239173Fg {
    public static final C239183Fh A00() {
        if (C239183Fh.A00 == null) {
            synchronized (C239183Fh.class) {
                Context context = C60960kU.A00;
                0qQ.A07(context);
                C239183Fh.A00 = new JSONPersistedQueryProvider(context, "ig4a-instagram-schema");
            }
        }
        C239183Fh r0 = C239183Fh.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("persistedQueryProvider");
        throw AnonymousClass00P.createAndThrow();
    }
}
