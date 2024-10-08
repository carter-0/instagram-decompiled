package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLConsistencyJNI;

public abstract class V5A {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        C307786Rm r1 = r3.A03;
        if (r1 != null) {
            String A0t = DbU.A0t(r4.A00, 1);
            if (A0t != null) {
                AnonymousClass6RZ A04 = C307476Qg.A04(r1, "gql");
                if (A04 == null || !(A04 instanceof AnonymousClass6RY)) {
                    throw new RuntimeException("Pando GraphQL Module not found");
                }
                PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI = ((IPandoGraphQLService) ((AnonymousClass6RY) A04).A00.A00()).mGraphqlConsistency;
                if (pandoGraphQLConsistencyJNI == null) {
                    return null;
                }
                pandoGraphQLConsistencyJNI.publish(A0t);
                return null;
            }
            throw new RuntimeException("Tried to publish a null GraphQL payload to Pando.");
        }
        throw AnonymousClass7TE.A0y();
    }
}
