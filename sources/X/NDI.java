package X;

import com.facebook.rsys.mediasync.gen.InitialMediaSyncInfo;
import com.facebook.rsys.mediasync.gen.MediaSyncApi;
import com.facebook.rsys.mediasync.gen.MediaSyncProxy;

public final class NDI extends MediaSyncProxy {
    public MediaSyncApi A00;

    public final InitialMediaSyncInfo getInitialMediaSyncInfo() {
        return null;
    }

    public final void setApi(MediaSyncApi mediaSyncApi) {
        0qQ.A0B(mediaSyncApi, 0);
        this.A00 = mediaSyncApi;
    }
}
