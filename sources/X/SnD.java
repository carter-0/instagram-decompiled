package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class SnD implements AnonymousClass39G {
    public 2IS A00 = C41845B3m.A04();
    public boolean A01 = false;
    public 2IS A02 = C41845B3m.A04();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C41845B3m.A06(this.A01), "FamilyDeviceIDAppScopedDeviceIDSyncMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), BVK.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fdid_sync_client_ids", AnonymousClass7TE.A1C());
    }
}
