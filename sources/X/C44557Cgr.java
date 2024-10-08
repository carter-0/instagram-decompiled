package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpIndexAction;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Cgr  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44557Cgr {
    public static Map A00(C258003yJ r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.AYF() != null) {
            UrpIndexAction AYF = r4.AYF();
            if (AYF != null) {
                str = AYF.A00;
            } else {
                str = null;
            }
            A1H.put("action", str);
        }
        if (r4.AdP() != null) {
            C257853y4 AdP = r4.AdP();
            if (AdP != null) {
                treeUpdaterJNI = AdP.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(MediaStreamTrack.AUDIO_TRACK_KIND, treeUpdaterJNI);
        }
        if (r4.Anf() != null) {
            A1H.put("client_name", r4.Anf());
        }
        if (r4.BGr() != null) {
            A1H.put("index", r4.BGr());
        }
        if (r4.BPp() != null) {
            DUE BPp = r4.BPp();
            if (BPp != null) {
                treeUpdaterJNI2 = BPp.FHC();
            }
            A1H.put("media_composition", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
