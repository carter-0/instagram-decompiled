package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.HashMap;

/* renamed from: X.HZr  reason: case insensitive filesystem */
public abstract class C54961HZr {
    public static final C52477GUf A00(Context context, UserSession userSession, 1iA r47, Integer num, String str, String str2, String str3) {
        boolean z;
        String str4 = str2;
        C51972G9s.A1B(userSession, str4);
        C54664HMv hMv = C54664HMv.A08;
        int i = r47.A00;
        int A00 = C51973G9u.A00();
        if (A00 == 0) {
            z = false;
        } else if (A00 == 3) {
            z = true;
        } else {
            throw AnonymousClass7TE.A0w("All channel-related arguments must be provided");
        }
        DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(hMv, (VideoFeedType) null, (Boolean) null, num, str, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, i, z);
        Context context2 = context;
        return Ha1.A00(new DiscoveryChainingConfig((Bundle) null, discoveryChainingItem, (ExploreTopicCluster) null, (Integer) null, (Integer) null, AnonymousClass7TE.A16(context2, 2131972266), "direct_feed_reshare_chaining", AnonymousClass7TG.A0j(), "", str3, (String) null, (String) null, (String) null, context2.getString(2131972267), (String) null, (HashMap) null, 0sl.A00, true, false, false, false, false, false, false, false, false, false, false));
    }
}
