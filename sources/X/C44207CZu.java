package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ListeningNowResponseInfoIntf;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.MusicInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CZu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44207CZu {
    public static Map A00(ListeningNowResponseInfoIntf listeningNowResponseInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (listeningNowResponseInfoIntf.CcP() != null) {
            A1H.put("is_spotify_save_eligible", listeningNowResponseInfoIntf.CcP());
        }
        if (listeningNowResponseInfoIntf.BNC() != null) {
            ListeningNowState BNC = listeningNowResponseInfoIntf.BNC();
            0qQ.A0B(BNC, 0);
            A1H.put("listening_now_state", BNC.A00);
        }
        if (listeningNowResponseInfoIntf.BUr() != null) {
            MusicInfo BUr = listeningNowResponseInfoIntf.BUr();
            if (BUr != null) {
                treeUpdaterJNI = BUr.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("music_info", treeUpdaterJNI);
        }
        if (listeningNowResponseInfoIntf.BXH() != null) {
            A1H.put("num_spotify_saves", listeningNowResponseInfoIntf.BXH());
        }
        return 0Yt.A0B(A1H);
    }
}
