package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.Kuk  reason: case insensitive filesystem */
public abstract class C63301Kuk {
    public static final LBS A00(Bundle bundle) {
        Bundle bundle2 = bundle;
        0qQ.A0B(bundle2, 0);
        String string = bundle2.getString("post_live.extra.live_pending_media_id");
        if (string == null) {
            string = JTQ.A0Z();
        }
        String A0m = JTP.A0m(bundle2, "post_live.extra.live_broadcast_id");
        long j = bundle2.getLong("post_live.extra.live_duration_ms");
        boolean z = bundle2.getBoolean("post_live.extra.is_landscape", false);
        boolean z2 = bundle2.getBoolean("post_live.extra.live_has_shopping");
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("post_live.extra.live_branded_content_tag");
        0qQ.A0C(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.pendingmedia.model.BrandedContentTag>");
        int i = bundle2.getInt("post_live.extra.cover_image_width");
        int i2 = bundle2.getInt("post_live.extra.cover_image_height");
        boolean z3 = bundle2.getBoolean("post_live.extra.is_custom_cover_photo");
        String string2 = bundle2.getString("post_live.extra.cover_photo_path");
        int i3 = bundle2.getInt("post_live.extra.cover_picker_progress");
        return new LBS(string, A0m, string2, bundle2.getString("post_live.extra.caption"), bundle2.getString("post_live.extra.title"), bundle2.getString("post_live.extra.caption"), parcelableArrayList, i, i2, i3, j, z, z2, z3, bundle2.getBoolean("post_live.extra.caption"), bundle2.getBoolean("post_live.extra.share_preview_to_feed"), bundle2.getBoolean("post_live.extra.internal"), bundle2.getBoolean("post_live.extra.internal.switch.enabled"), bundle2.getBoolean("post_live.extra.exclusive_post"));
    }
}
