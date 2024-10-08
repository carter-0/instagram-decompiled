package X;

import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;

public final class Szr implements AnonymousClass2hV {
    public static final Szr A00 = new Szr();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(th);
        if (graphQLErrorFromException != null) {
            return C13224TQp.A00(graphQLErrorFromException.debugInfo, th);
        }
        return th;
    }
}
