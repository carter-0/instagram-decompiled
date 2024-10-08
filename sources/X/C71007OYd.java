package X;

import com.facebook.odin.model.FeatureData;
import com.instagram.igsignals.signals.odin.IgSignalsOdinServerFeaturesProvider$ServerFeaturesData$Companion;
import java.util.HashMap;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.OYd  reason: case insensitive filesystem */
public final class C71007OYd {
    public static final C255463uA[] A02 = {new AnonymousClass40T(C255453u9.A01, new ContextualSerializer(DbS.A0z(FeatureData.class), new C255463uA[0])), null};
    public static final IgSignalsOdinServerFeaturesProvider$ServerFeaturesData$Companion Companion = new Object();
    public final long A00;
    public final HashMap A01;

    public C71007OYd(long j, HashMap hashMap) {
        0qQ.A0B(hashMap, 1);
        this.A01 = hashMap;
        this.A00 = j;
    }

    public /* synthetic */ C71007OYd(HashMap hashMap, int i, long j) {
        if (3 != (i & 3)) {
            VJ6.A00(C73534PeQ.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = hashMap;
        this.A00 = j;
    }
}
