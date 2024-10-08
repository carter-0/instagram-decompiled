package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.HashMap;
import java.util.List;

public abstract class HW1 {
    public static final Object A00(C307896Rx r44, AnonymousClass6Tm r45) {
        String string;
        String str;
        int i;
        boolean z;
        AnonymousClass6Tm r0 = r45;
        String A0h = DbY.A0h(r0, 0);
        List list = r0.A00;
        String A0t = DbU.A0t(list, 1);
        Object obj = list.get(2);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
        int A0M = AnonymousClass7TE.A0M(obj);
        FragmentActivity A04 = C308206Td.A04(r44);
        UserSession A0B = C308206Td.A0B(r44);
        if (list.size() > 3) {
            string = DbU.A0t(list, 3);
        } else {
            string = A04.getString(2131965964);
        }
        if (list.size() > 4) {
            str = DbU.A0t(list, 4);
        } else {
            str = "";
        }
        if (list.size() > 5) {
            Object obj2 = list.get(5);
            0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Number");
            i = AnonymousClass7TE.A0M(obj2);
        } else {
            i = 0;
        }
        String A19 = AnonymousClass7TE.A19(00l.A0R(A0h, new String[]{"_"}, 0), 0);
        if (A0t == null) {
            A0t = "";
        }
        0qQ.A0B(A19, 1);
        C54664HMv hMv = C54664HMv.A07;
        int A00 = C51973G9u.A00();
        if (A00 == 0) {
            z = false;
        } else if (A00 == 3) {
            z = true;
        } else {
            throw AnonymousClass7TE.A0w("All channel-related arguments must be provided");
        }
        DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(hMv, (VideoFeedType) null, (Boolean) null, (Integer) null, A19, A0t, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, A0M, z);
        if (string == null) {
            string = AnonymousClass7TE.A16(A04, 2131965964);
        }
        DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig((Bundle) null, discoveryChainingItem, (ExploreTopicCluster) null, (Integer) null, Integer.valueOf(i), string, "nudge_chaining", "", "", (String) null, (String) null, (String) null, (String) null, (String) null, str, (HashMap) null, 0sl.A00, true, true, false, false, false, false, true, true, false, false, false);
        C309516Yo A002 = C54974Ha7.A00(A04, A0B);
        A002.A0B((Bundle) null, Ha1.A00(discoveryChainingConfig));
        A002.A04();
        return null;
    }
}
