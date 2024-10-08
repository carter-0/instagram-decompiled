package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import java.util.List;

public abstract class V5B {
    public static final Object A00(AnonymousClass6Tm r4) {
        List list = r4.A00;
        Object obj = list.get(0);
        0qQ.A0C(obj, C66579MXk.A00(0));
        C307786Rm r2 = (C307786Rm) obj;
        Object obj2 = list.get(1);
        if (obj2 != null) {
            AnonymousClass6RZ A04 = C307476Qg.A04(r2, "gql");
            if (A04 == null || !(A04 instanceof AnonymousClass6RY)) {
                throw new RuntimeException("Pando GraphQL Module not found");
            }
            List A1I = AnonymousClass7TE.A1I(obj2);
            PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI = ((IPandoGraphQLService) ((AnonymousClass6RY) A04).A00.A00()).mGraphqlConsistency;
            if (pandoGraphQLConsistencyJNI == null) {
                return null;
            }
            pandoGraphQLConsistencyJNI.publishTreeUpdaters(A1I, false);
            return null;
        }
        throw new RuntimeException("Tried to publish null TreeUpdater");
    }
}
