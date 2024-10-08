package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IR9 implements JQF {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final DiscoveryChainingItem A03;
    public final C228232l0 A04;
    public final String A05;

    public IR9(Context context, UserSession userSession, DiscoveryChainingItem discoveryChainingItem, AnonymousClass4DU r5, C228232l0 r6, String str) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r5;
        this.A03 = discoveryChainingItem;
        this.A05 = str;
        this.A04 = r6;
    }

    public final 1NY Bn7(C231312rP r11) {
        String str;
        String str2;
        UserSession userSession = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        DiscoveryChainingItem discoveryChainingItem = this.A03;
        VideoFeedType videoFeedType = discoveryChainingItem.A02;
        if (videoFeedType != null) {
            int ordinal = videoFeedType.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                str = "channels/viewer/%s/%s/";
            } else if (ordinal == 3) {
                str = "fbsearch/channel_viewer/%s/%s/";
            }
            String str3 = discoveryChainingItem.A0J;
            String str4 = discoveryChainingItem.A0B;
            A0a.A0K(str, new Object[]{str3, str4});
            A0a.A9m("rank_token", AnonymousClass7TF.A0b());
            A0a.A9m("module", this.A05);
            A0a.A0O((15p) null, CHX.class, C45723D2w.class, false);
            if (ordinal == 0 || ordinal == 2) {
                str2 = "channels/viewer/%s/%s/";
            } else if (ordinal == 3) {
                str2 = "fbsearch/channel_viewer/%s/%s/";
            } else {
                throw C51973G9u.A0g(videoFeedType, "Invalid VideoFeedType: ", AnonymousClass7TE.A1A());
            }
            Map AUH = this.A04.AUH(DbT.A0z("/", 0sr.A1P(new String[]{str2, str3, str4}), (0sP) null));
            if (!AUH.isEmpty()) {
                Iterator A0u = AnonymousClass7TF.A0u(AUH);
                while (A0u.hasNext()) {
                    C51974G9v.A1C(A0a, A0u);
                }
            }
            C51968G9o.A1C(this.A00, A0a, userSession);
            C54969HZz.A00(A0a, r11);
            return A0a;
        }
        throw C51973G9u.A0g(videoFeedType, "Invalid VideoFeedType: ", AnonymousClass7TE.A1A());
    }

    public final 1FZ C1c(C231312rP r2) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ C55863Hok E1u(AnonymousClass1XT r10, int i) {
        1XO r102 = (1XO) r10;
        0qQ.A0B(r102, 0);
        List list = r102.A06;
        0qQ.A07(list);
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        ArrayList A012 = C242613Ve.A01(this.A00, this.A02, this.A01, list, i);
        Map emptyMap = Collections.emptyMap();
        0qQ.A07(emptyMap);
        boolean A1V = AnonymousClass7TF.A1V(r102.A04);
        HashMap hashMap = r102.A05;
        if (hashMap != null) {
            emptyMap = hashMap;
        }
        return new C55863Hok((C67251sV) null, (String) null, (String) null, A1D, A012, list, emptyMap, A1V);
    }
}
