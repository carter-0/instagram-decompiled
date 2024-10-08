package X;

import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;

/* renamed from: X.Szq  reason: case insensitive filesystem */
public final class C12607Szq implements AnonymousClass2hV {
    public static final C12607Szq A00 = new C12607Szq();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(th);
        if (graphQLErrorFromException != null) {
            return C13224TQp.A00(graphQLErrorFromException.debugInfo, th);
        }
        return th;
    }
}
