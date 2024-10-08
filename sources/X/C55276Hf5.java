package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Hf5  reason: case insensitive filesystem */
public abstract class C55276Hf5 {
    public static final LinkedHashMap A00(IOI ioi, Integer num) {
        String str;
        Boolean bool = null;
        AnonymousClass9FC A00 = AnonymousClass9FA.A00(C41763Azs.A00, C250863mB.A03);
        Collection values = ioi.A0B.values();
        0qQ.A07(values);
        List A0a = 00k.A0a(values);
        C20547WtS wtS = C20547WtS.A00;
        0eP A1L = AnonymousClass7TE.A1L("ads", A00.A02(A0a, new AnonymousClass409(wtS)));
        0eP A1L2 = AnonymousClass7TE.A1L("seedItemInfo", A00.A02(ioi.A09, C360578eo.A00(wtS)));
        0eP A1L3 = AnonymousClass7TE.A1L("exitItemInfo", A00.A02(ioi.A08, C360578eo.A00(wtS)));
        0eP A1L4 = AnonymousClass7TE.A1L("totalSessionDwell", String.valueOf(ioi.A05));
        0eP A1L5 = AnonymousClass7TE.A1L("totalOrganicImpressions", String.valueOf(ioi.A03));
        C15052ULt uLt = ioi.A09;
        if (uLt != null) {
            bool = Boolean.valueOf(uLt.A05);
        }
        0eP A1L6 = AnonymousClass7TE.A1L("isMMCSeed", String.valueOf(bool));
        0eP A1L7 = AnonymousClass7TE.A1L("depth", String.valueOf(ioi.A02));
        ClipsViewerSource clipsViewerSource = ioi.A06;
        if (clipsViewerSource == ClipsViewerSource.FEED_TIMELINE || clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_FOLLOWING || clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_FAVORITES) {
            str = "feed_connected";
        } else if (clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_EXPLORE_STORY || clipsViewerSource == ClipsViewerSource.FEED_TIMELINE_MIXED_UNCONNECTED) {
            str = "feed_suggested";
        } else if (clipsViewerSource == ClipsViewerSource.CLIPS_NETEGO) {
            str = "RIFU";
        } else if (clipsViewerSource == ClipsViewerSource.DIRECT || clipsViewerSource == ClipsViewerSource.DIRECT_AD_FEED_OF_ADS) {
            str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        } else if (clipsViewerSource.A01() || clipsViewerSource == ClipsViewerSource.EXPLORE_GRID_AD_FEED_OF_ADS) {
            str = "explore";
        } else {
            str = AnonymousClass7TF.A0j(clipsViewerSource.name());
        }
        LinkedHashMap A07 = 0Yt.A07(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AnonymousClass7TE.A1L("entryPoint", str), AnonymousClass7TE.A1L("appSessionId", String.valueOf(ioi.A0A))});
        if (num != null) {
            A07.put("huntAndPeckThreshold", String.valueOf(num.intValue()));
        }
        return A07;
    }
}
