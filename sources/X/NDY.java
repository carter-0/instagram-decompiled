package X;

import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.facebook.rsys.reactions.gen.ReactionsProxy;

public final class NDY extends ReactionsProxy {
    public ReactionsApi A00;

    public final void setApi(ReactionsApi reactionsApi) {
        0qQ.A0B(reactionsApi, 0);
        this.A00 = reactionsApi;
    }

    public final ReactionsApi getApi() {
        ReactionsApi reactionsApi = this.A00;
        if (reactionsApi != null) {
            return reactionsApi;
        }
        0qQ.A0F("reactionsApi");
        throw AnonymousClass00P.createAndThrow();
    }
}
