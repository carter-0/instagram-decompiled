package X;

import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;

public final class NDE extends MediaStatsProxy {
    public MediaStatsApi A00;
    public final MediaStatsListener A01 = new NDD(this);
    public final O9Y A02;

    public final void setApi(MediaStatsApi mediaStatsApi) {
        0qQ.A0B(mediaStatsApi, 0);
        this.A00 = mediaStatsApi;
        mediaStatsApi.registerListener(this.A01);
    }

    public NDE(O9Y o9y) {
        this.A02 = o9y;
    }
}
