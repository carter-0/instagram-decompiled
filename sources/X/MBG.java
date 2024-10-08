package X;

import com.instagram.api.schemas.GiphyRequestSurface;

public final class MBG implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8ME A00;

    public MBG(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00.A05 instanceof AnonymousClass80O) {
            return GiphyRequestSurface.CLIPS_V2;
        }
        return GiphyRequestSurface.STORIES_ASSET_SEARCH_TRAY;
    }
}
