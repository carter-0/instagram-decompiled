package X;

import android.content.Context;
import com.facebook.graphql.query.JSONPersistedQueryProvider;

/* renamed from: X.4LU  reason: invalid class name */
public final class AnonymousClass4LU {
    public final synchronized AnonymousClass4LT A00() {
        JSONPersistedQueryProvider jSONPersistedQueryProvider;
        jSONPersistedQueryProvider = AnonymousClass4LT.A00;
        if (jSONPersistedQueryProvider == null) {
            Context context = C60960kU.A00;
            0qQ.A07(context);
            jSONPersistedQueryProvider = new JSONPersistedQueryProvider(context, "ig4a-facebook-schema");
            AnonymousClass4LT.A00 = jSONPersistedQueryProvider;
        }
        0qQ.A0C(jSONPersistedQueryProvider, "null cannot be cast to non-null type com.instagram.graphql.facebookschema.FacebookSchemaPersistedQueryProvider");
        return jSONPersistedQueryProvider;
    }
}
