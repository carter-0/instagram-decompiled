package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.HGz  reason: case insensitive filesystem */
public class C54513HGz extends C55174HdQ {
    public final ClipsViewerSource A00;
    public final Integer A01;

    public C54513HGz(AnonymousClass337 r2, Integer num) {
        ClipsViewerSource clipsViewerSource;
        0qQ.A0B(num, 2);
        this.A01 = num;
        switch (r2.ordinal()) {
            case 0:
                clipsViewerSource = ClipsViewerSource.FEED_TIMELINE;
                break;
            case 1:
                clipsViewerSource = ClipsViewerSource.FEED_TIMELINE_POST_TAP;
                break;
            case 2:
            case 3:
                clipsViewerSource = ClipsViewerSource.FEED_ADS_WATCH_AND_BROWSE;
                break;
            case 4:
                clipsViewerSource = ClipsViewerSource.FEED_ADS_WATCH_AND_BROWSE_WITH_CHAINING;
                break;
            case 5:
                clipsViewerSource = ClipsViewerSource.FEED_ADS_TALL_VIDEO_WATCH_AND_BROWSE_WITH_CHAINING;
                break;
            case 9:
                clipsViewerSource = ClipsViewerSource.FEED_CONTEXTUAL_CHAIN_SEED_AD;
                break;
            case 10:
                clipsViewerSource = ClipsViewerSource.CLIPS_MULTI_ADS_WATCH_AND_BROWSE;
                break;
            case 11:
                clipsViewerSource = ClipsViewerSource.CLIPS_OVERLAY_WATCH_MORE_REELS;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                clipsViewerSource = ClipsViewerSource.FEED_TIMELINE_FEED_OF_ADS;
                break;
            case 13:
                clipsViewerSource = ClipsViewerSource.FEED_TIMELINE_SEED_AD;
                break;
            case 14:
                clipsViewerSource = ClipsViewerSource.FEED_PAE_MULTI_ADS_WATCH_AND_BROWSE;
                break;
            case 15:
                clipsViewerSource = ClipsViewerSource.FEED_SA_MULTI_ADS_WATCH_AND_BROWSE;
                break;
            default:
                clipsViewerSource = ClipsViewerSource.UNKNOWN;
                break;
        }
        this.A00 = clipsViewerSource;
    }

    public Integer A00() {
        return this.A01;
    }
}
