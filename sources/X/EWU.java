package X;

import com.instagram.android.R;
import com.instagram.api.schemas.ApiAdFormats;

public enum EWU {
    A06("facebook_feed_preview_url_fetch", 0, 2131970672, R.drawable.instagram_photo_list_pano_outline_24),
    A09("facebook_story_preview_url_fetch", 1, 2131970681, R.drawable.instagram_story_pano_outline_24),
    A07("facebook_in_stream_videos_preview_url_fetch", 2, 2131970673, R.drawable.instagram_play_pano_outline_24),
    A0A("facebook_video_feeds_preview_url_fetch", 3, 2131970687, R.drawable.instagram_media_pano_outline_24),
    A08("facebook_marketplace_preview_url_fetch", 4, 2131970675, R.drawable.instagram_business_pano_outline_24);
    
    public final int A00;
    public final int A01;
    public final ApiAdFormats A02;
    public final String A03;

    /* access modifiers changed from: public */
    static {
        EWU[] ewuArr;
        A04 = 0oU.A00(ewuArr);
    }

    /* access modifiers changed from: public */
    EWU(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = r1;
        this.A03 = str;
    }
}
