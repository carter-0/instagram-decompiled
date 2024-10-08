package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.HashMap;
import java.util.Map;

public abstract class HW2 {
    public static final Object A00(C307896Rx r36, AnonymousClass6Tm r37) {
        Number A14;
        boolean z;
        AnonymousClass6Tm r1 = r37;
        Object A03 = r1.A03(0);
        0qQ.A0C(A03, Pxd.A00(2));
        Map map = (Map) A03;
        String A11 = DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, map);
        if (!(A11 == null || (A14 = C51966G9m.A14("media_type", map)) == null)) {
            int intValue = A14.intValue();
            Object A032 = r1.A03(1);
            0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.String");
            String str = (String) A032;
            Object A033 = r1.A03(2);
            0qQ.A0C(A033, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) A033;
            int A04 = DbW.A04(r1.A03(3), "null cannot be cast to non-null type kotlin.Number");
            FragmentActivity A042 = C308206Td.A04(r36);
            UserSession A0B = C308206Td.A0B(r36);
            String A02 = AnonymousClass3VO.A02(A11);
            String A034 = AnonymousClass3VO.A03(A11);
            if (A034 == null) {
                A034 = "";
            }
            C54664HMv hMv = C54664HMv.A07;
            int A00 = C51973G9u.A00();
            if (A00 == 0) {
                z = false;
            } else if (A00 == 3) {
                z = true;
            } else {
                throw AnonymousClass7TE.A0w("All channel-related arguments must be provided");
            }
            DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(hMv, (VideoFeedType) null, (Boolean) null, (Integer) null, A02, A034, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intValue, z);
            0qQ.A0B(str, 2);
            DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig((Bundle) null, discoveryChainingItem, (ExploreTopicCluster) null, (Integer) null, Integer.valueOf(A04), str, "nudge_chaining", "", "", (String) null, (String) null, (String) null, (String) null, (String) null, str2, (HashMap) null, 0sl.A00, true, true, false, false, false, false, true, true, false, false, false);
            C309516Yo A002 = C54974Ha7.A00(A042, A0B);
            A002.A0B((Bundle) null, Ha1.A00(discoveryChainingConfig));
            A002.A04();
        }
        return null;
    }
}
